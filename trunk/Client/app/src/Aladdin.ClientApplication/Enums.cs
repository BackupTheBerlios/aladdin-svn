using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Aladdin.ClientApplication
{
    // TaskType: 1 = Patient Questionnaire, 2 = Carer Questionnaire, 3 = Blood pressure measurement, 4 = weight measurement, 5 = Cognitive game, 6 = Activity Monitor, 7 = Exercise.
    public enum TaskTypesEnum
    {
        PatientQuestionnaire = 1,
        CarerQuestionnaire = 2,
        BloodPressureMeasurement = 3,
        WeightMeasurement = 4,
        CognitiveGame = 5,
        ActivityMonitor = 6,
        Exercise = 7
    }

    public enum TaskStatusEnum
    {
        Pending = 1,
        Canceled = 2,
        Completed = 3
    }

    public enum MeasurementTypeEnum
    {
        SystolicBloodPressure = 11,
        DiastolicBloodPressure = 12,
        Weight = 2
    }

}
