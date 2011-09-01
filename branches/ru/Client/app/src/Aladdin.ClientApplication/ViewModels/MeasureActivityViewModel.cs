using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using Aladdin.DataModel;
using System.ComponentModel;
using Aladdin.ClientApplication.Controls;
using System.Windows;

namespace Aladdin.ClientApplication.ViewModels
{
    public class MeasureActivityViewModel : INotifyPropertyChanged
    {
        #region INotifyPropertyChanged Members

        public event PropertyChangedEventHandler PropertyChanged;

        protected void SendPropertyChanged(string propertyName)
        {
            if (this.PropertyChanged != null)
                this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
        }

        #endregion

        private const int MAX_DAY = 35;

        aladdinService.Task ActiveTask;

        Aladdin.Omron dev;

        double[,] _Activity = new double[MAX_DAY, 24];
        bool hasData = false;

        public double[,] Activity
        {
            get { return _Activity; }
            set
            {
                _Activity = value;
                this.SendPropertyChanged("Activity");
            }
        }

        public MeasureActivityViewModel(aladdinService.Task activeTask)
        {
            this.ActiveTask = activeTask;
        }

        internal bool OmronConnect()
        {
            try
            {
                this.dev = new Aladdin.Omron();
                return true;
            }
            catch (Exception e)
            {
                return false;
            }
        }

        internal bool OmronReadData()
        {
            try
            {
                omron_pd_count_info c = this.dev.omron_get_pd_data_count();
                if (c.daily_count > 0)
                {
                    omron_pd_hourly_data[] steps;
                    for (int day = 1; day < Math.Min(c.daily_count, MAX_DAY); ++day)
                    {
                        steps = this.dev.omron_get_pd_hourly_data(day);
                        for (int hour = 0; hour < 24; ++hour)
                            this.Activity[day, hour] = steps[hour].regular_steps;
                    }
                    hasData = true;
                    return true;
                }
                else
                    return false;
            }
            catch (Exception e)
            {
                return false;
            }
        }

        internal double GetTotaleSteps()
        {
            double tot = 0;

            for (int day = 0; day < MAX_DAY; ++day)
            {
                for (int hour = 0; hour < 24; ++hour)
                    tot += this.Activity[day, hour];
            }

            return tot;
        }

        internal void SendMeasurements()
        {
            if (this.Activity.Length > 0)
            {
                aladdinService.StorageComponent sc = new aladdinService.StorageComponent();
                aladdinService.SystemParameter measurementType = new aladdinService.SystemParameter();
                List<aladdinService.Measurement> dataList = new List<aladdinService.Measurement>(); // We use a dynamic array first, we still don't know how many (new) measurments we have to submit
                measurementType.Code = Convert.ToString((int)MeasurementTypeEnum.Activity);
                measurementType.Description = "Activity";

                List<string> dateLog = new List<string>(); // List of days for which we have already sent the data (history)
                List<string> dateLogNew = new List<string>(); // List of days for which we have new data to send (will be added to the history at the end)
                string date;

                // Load the history
                if (File.Exists("activity.log"))
                {
                    StreamReader r = new StreamReader("activity.log");
                    while ((date = r.ReadLine()) != null)
                        dateLog.Add(date);
                    r.Close();
                }

                for (int day = 0; day < MAX_DAY; ++day)
                {
                    for (int hour = 0; hour < 24; ++hour)
                    {
                        // Build the timestamp of this measurement
                        DateTime dt = new DateTime(System.DateTime.Now.Year, System.DateTime.Now.Month, System.DateTime.Now.Day, hour, 0, 0, 0);
                        dt = dt.AddDays(-1 - day);

                        // Process the measurement only if its day is not present in the history
                        if (dateLog.IndexOf(String.Format("{0:d/M/yyyy}", dt)) == -1)
                        {
                            aladdinService.Measurement Measurement = new aladdinService.Measurement();

                            Measurement.DateTime = dt;
                            Measurement.TaskID = this.ActiveTask.ID;
                            Measurement.Type = measurementType;
                            Measurement.Value = this.Activity[day, hour];
                            Measurement.Units = "steps/day";
                            Measurement.LowerLimitSpecified = false;
                            Measurement.UpperLimitSpecified = false;
                    
                            dataList.Add(Measurement);

                            // Update the list of days with new data
                            date = String.Format("{0:d/M/yyyy}", dt);
                            if (dateLogNew.IndexOf(date) == -1)
                                dateLogNew.Add(date);
                        }
                    }
                }

                // Create an array (StoreMeasurements requires an array parameter) with the right size and fill it with the measurements
                aladdinService.Measurement[] data = new aladdinService.Measurement[dataList.Count()];
                for (int i = 0; i < dataList.Count(); ++i)
                    data[i] = dataList[i];

                // Save measuremnts in a local .csv file
                /*
                StreamWriter sw2;
                sw2 = File.CreateText("aladdin_activity.csv");
                for (int i = 0; i < dataList.Count(); ++i)
                {
                    sw2.Write("'" + data[i].DateTime.ToString() + "',");
                    sw2.WriteLine("'" + data[i].Value.ToString() + "'");
                }
                sw2.Close();
                */

                aladdinService.OperationResult res = sc.StoreMeasurements(data, App.CurrentUserID);
                if (res.Status == 1)
                {
                    aladdinService.OperationResult taskChangeStatus = sc.ChangeTaskStatus(Convert.ToInt32(this.ActiveTask.ID), (int)TaskStatusEnum.Completed, App.CurrentUserID);

                    // Update the history
                    StreamWriter sw;
                    sw = File.AppendText("activity.log");
                    foreach (string s in dateLogNew)
                        sw.WriteLine(s);
                    sw.Close();
                }

                AppCommands.MoveToPageCommand.Execute("MyTasksPage", null);
            }
            
        }

        // Activity limits: activity data have to be read from measurement device
        internal bool CanSendMeasurements()
        {
            //return (this.Activity.Length > 0);
            return hasData;
        }
    }
}
