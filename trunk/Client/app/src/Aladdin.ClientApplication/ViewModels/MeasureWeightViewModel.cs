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

    public class MeasureWeightViewModel
    {

        aladdinService.Task ActiveTask;

        public double  Weight { get; set; }

        public MeasureWeightViewModel(aladdinService.Task activeTask)
        {
            this.ActiveTask = activeTask;
        }


        internal void SendMeasurements()
        {
            aladdinService.StorageComponent sc = new aladdinService.StorageComponent();
            aladdinService.Measurement Measurement = new aladdinService.Measurement();
            Measurement.DateTime = System.DateTime.Now;
            Measurement.TaskID = this.ActiveTask.ID;

            aladdinService.SystemParameter measurementType = new aladdinService.SystemParameter();
            measurementType.Code = Convert.ToString((int)MeasurementTypeEnum.Weight);
            Measurement.Type = measurementType;

            Measurement.Value = this.Weight;
            Measurement.Units = "Kg";

            Measurement.LowerLimitSpecified = false;
            Measurement.UpperLimitSpecified = false;

            aladdinService.Measurement[] data = new aladdinService.Measurement[] { Measurement };
            aladdinService.OperationResult res = sc.StoreMeasurements(data, App.CurrentUserID);
            if (res.Status == 1)
            {
                aladdinService.OperationResult taskChangeStatus = sc.ChangeTaskStatus(Convert.ToInt32(this.ActiveTask.ID), (int)TaskStatusEnum.Completed, App.CurrentUserID);
            }

            AppCommands.MoveToPageCommand.Execute("MyTasksPage", null);
            //aladdinService.Measurement[] mFP = sc.GetPatientMeasurement(App.PatientID, 2, new DateTime(2010, 9, 1), new DateTime(2010, 10, 30), App.CurrentUserID);


            
        }

        internal bool CanSendMeasurements()
        {
            return true;
        }
    }
}
