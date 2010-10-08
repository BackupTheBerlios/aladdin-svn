using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Aladdin.ClientApplication.ViewModels
{
    public class MeasureBloodPressureViewModel
    {

        aladdinService.Task ActiveTask;

        public double SystolicBloodPressure { get; set; }

        public double DiastolicBloodPressure { get; set; }

        public MeasureBloodPressureViewModel(aladdinService.Task activeTask)
        {
            this.ActiveTask = activeTask;
        }

        internal void SendMeasurements()
        {
            aladdinService.StorageComponent sc = new aladdinService.StorageComponent();

            aladdinService.Measurement diastolicBP = new aladdinService.Measurement();
            diastolicBP.DateTime = System.DateTime.Now;
            diastolicBP.TaskID = this.ActiveTask.ID;
            aladdinService.SystemParameter measurementType = new aladdinService.SystemParameter();

            measurementType.Code = Convert.ToString((int)MeasurementTypeEnum.DiastolicBloodPressure);
            diastolicBP.Type = measurementType;
            diastolicBP.Value = this.DiastolicBloodPressure;
            diastolicBP.Units = "mmHg";

            diastolicBP.LowerLimitSpecified = false;
            diastolicBP.UpperLimitSpecified = false;

            aladdinService.Measurement[] diastolicBPData = new aladdinService.Measurement[] { diastolicBP };
            aladdinService.OperationResult res1 = sc.StoreMeasurements(diastolicBPData, App.CurrentUserID);

            aladdinService.Measurement systolicBP = new aladdinService.Measurement();
            systolicBP.DateTime = System.DateTime.Now;
            systolicBP.TaskID = this.ActiveTask.ID;
            measurementType = new aladdinService.SystemParameter();

            measurementType.Code = Convert.ToString((int)MeasurementTypeEnum.SystolicBloodPressure);
            systolicBP.Type = measurementType;
            systolicBP.Value = this.SystolicBloodPressure;
            systolicBP.Units = "mmHg";

            systolicBP.LowerLimitSpecified = false;
            systolicBP.UpperLimitSpecified = false;

            aladdinService.Measurement[] systolicBPData = new aladdinService.Measurement[] { systolicBP };
            aladdinService.OperationResult res2 = sc.StoreMeasurements(diastolicBPData, App.CurrentUserID);

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
