using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;
using Aladdin.ClientApplication.Controls;
using System.Windows;

namespace Aladdin.ClientApplication.ViewModels
{
    public class MeasureBloodPressureViewModel : INotifyPropertyChanged
    {
        #region INotifyPropertyChanged Members

        public event PropertyChangedEventHandler PropertyChanged;

        protected void SendPropertyChanged(string propertyName)
        {
            if (this.PropertyChanged != null)
                this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
        }

        #endregion

        aladdinService.Task ActiveTask;

        string _SystolicBloodPressureText = "";
        public string SystolicBloodPressureText
        {
            get { return _SystolicBloodPressureText; }
            set
            {
                _SystolicBloodPressureText = value;
                this.SendPropertyChanged("SystolicBloodPressureText");
                this.SendPropertyChanged("SystolicBloodPressure");
            }
        }

        public double? SystolicBloodPressure
        {
            get
            {
                double result;
                bool ok = double.TryParse(this.SystolicBloodPressureText, out result);
                if (ok)
                    return result;
                return null;
            }
        }

        string _DiastolicBloodPressureText = "";
        public string DiastolicBloodPressureText
        {
            get { return _DiastolicBloodPressureText; }
            set
            {
                _DiastolicBloodPressureText = value;
                this.SendPropertyChanged("DiastolicBloodPressureText");
                this.SendPropertyChanged("Weight");
            }
        }

        public double? DiastolicBloodPressure
        {
            get
            {
                double result;
                bool ok = double.TryParse(this.DiastolicBloodPressureText, out result);
                if (ok)
                    return result;
                return null;
            }
        }

        public MeasureBloodPressureViewModel(aladdinService.Task activeTask)
        {
            this.ActiveTask = activeTask;
        }

        internal void SendMeasurements()
        {
            aladdinService.StorageComponent sc = new aladdinService.StorageComponent();
            aladdinService.SystemParameter measurementType = new aladdinService.SystemParameter();
            aladdinService.OperationResult res1 = new aladdinService.OperationResult();
            aladdinService.OperationResult res2 = new aladdinService.OperationResult();

            if (this.DiastolicBloodPressure.HasValue)
            {
                aladdinService.Measurement diastolicBP = new aladdinService.Measurement();
                diastolicBP.DateTime = System.DateTime.Now;
                diastolicBP.TaskID = this.ActiveTask.ID;

                measurementType = new aladdinService.SystemParameter();
                measurementType.Code = Convert.ToString((int)MeasurementTypeEnum.DiastolicBloodPressure);
                
                diastolicBP.Type = measurementType;
                diastolicBP.Value = this.DiastolicBloodPressure.Value;
                diastolicBP.Units = "mmHg";
                diastolicBP.LowerLimitSpecified = false;
                diastolicBP.UpperLimitSpecified = false;

                aladdinService.Measurement[] diastolicBPData = new aladdinService.Measurement[] { diastolicBP };
                res1 = sc.StoreMeasurements(diastolicBPData, App.CurrentUserID);
            }

            if (this.SystolicBloodPressure.HasValue)
            {
                aladdinService.Measurement systolicBP = new aladdinService.Measurement();
                systolicBP.DateTime = System.DateTime.Now;
                systolicBP.TaskID = this.ActiveTask.ID;

                measurementType = new aladdinService.SystemParameter();
                measurementType.Code = Convert.ToString((int)MeasurementTypeEnum.SystolicBloodPressure);
                
                systolicBP.Type = measurementType;
                systolicBP.Value = this.SystolicBloodPressure.Value;
                systolicBP.Units = "mmHg";
                systolicBP.LowerLimitSpecified = false;
                systolicBP.UpperLimitSpecified = false;

                aladdinService.Measurement[] systolicBPData = new aladdinService.Measurement[] { systolicBP };
                res2 = sc.StoreMeasurements(systolicBPData, App.CurrentUserID);
            }

            if (res1.Status == 1 && res2.Status == 1)
            {
                aladdinService.OperationResult taskChangeStatus = sc.ChangeTaskStatus(Convert.ToInt32(this.ActiveTask.ID), (int)TaskStatusEnum.Completed, App.CurrentUserID);
            }

            AppCommands.MoveToPageCommand.Execute("MyTasksPage", null);
            
        }

        internal bool CanSendMeasurements()
        {
            return true;
        }

    }
}
