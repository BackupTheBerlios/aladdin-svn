using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
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

        private const int EMPTY_ACTIVITY = -1;

        aladdinService.Task ActiveTask;

        Aladdin.Omron dev;

        double _Activity = EMPTY_ACTIVITY;
        public double Activity
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
                    omron_pd_daily_data d = this.dev.omron_get_pd_daily_data(1);
                    this.Activity = d.total_steps;
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

        internal void SendMeasurements()
        {
            if (this.Activity != EMPTY_ACTIVITY)
            {
                aladdinService.StorageComponent sc = new aladdinService.StorageComponent();
                aladdinService.Measurement Measurement = new aladdinService.Measurement();
                Measurement.DateTime = System.DateTime.Now;
                Measurement.TaskID = this.ActiveTask.ID;

                aladdinService.SystemParameter measurementType = new aladdinService.SystemParameter();
                measurementType.Code = Convert.ToString((int)MeasurementTypeEnum.Activity);
                measurementType.Description = "Activity";
                Measurement.Type = measurementType;
                

                Measurement.Value = this.Activity;
                Measurement.Units = "steps/day";

                Measurement.LowerLimitSpecified = false;
                Measurement.UpperLimitSpecified = false;

                aladdinService.Measurement[] data = new aladdinService.Measurement[] { Measurement };
                aladdinService.OperationResult res = sc.StoreMeasurements(data, App.CurrentUserID);
                if (res.Status == 1)
                {
                    aladdinService.OperationResult taskChangeStatus = sc.ChangeTaskStatus(Convert.ToInt32(this.ActiveTask.ID), (int)TaskStatusEnum.Completed, App.CurrentUserID);
                }

                AppCommands.MoveToPageCommand.Execute("MyTasksPage", null);
            }
            
        }

        // Activity limits: activity data have to be read from measurement device
        internal bool CanSendMeasurements()
        {
            return (this.Activity != EMPTY_ACTIVITY);
        }
    }
}
