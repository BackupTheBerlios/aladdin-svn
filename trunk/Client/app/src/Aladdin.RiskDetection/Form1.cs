using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;


namespace Aladdin.RiskDetection
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            GetMeasurements();
            //StoreQuestionnaire();
            TestContentManagement();


        }

        private void TestContentManagement()
        {
            using (aladdinSC.StorageComponent sc = new aladdinSC.StorageComponent())
            {
                aladdinSC.SearchCriteria criteria = new aladdinSC.SearchCriteria();
            }

        }

        private void StoreQuestionnaire()
        {
            using (aladdinSC.StorageComponent sc = new aladdinSC.StorageComponent())
            {
                aladdinSC.QuestionnaireAnswers qas = new aladdinSC.QuestionnaireAnswers();

                //answer questionID="1133" value="1" />
                aladdinSC.QuestionnaireAnswer qa1 = new aladdinSC.QuestionnaireAnswer();
                qa1.questionID = "1133";
                qa1.value = "1";
                //answer questionID="1134" value="0" />
                aladdinSC.QuestionnaireAnswer qa2 = new aladdinSC.QuestionnaireAnswer();
                qa2.questionID = "1134";
                qa2.value = "0";
                ////answer questionID="1135" value="0" />
                aladdinSC.QuestionnaireAnswer qa3 = new aladdinSC.QuestionnaireAnswer();
                qa3.questionID = "1135";
                qa3.value = "0";
                //answer questionID="1136" value="0" />
                aladdinSC.QuestionnaireAnswer qa4 = new aladdinSC.QuestionnaireAnswer();
                qa4.questionID = "1136";
                qa4.value = "0";
                //answer questionID="1137" value="0" />
                aladdinSC.QuestionnaireAnswer qa5 = new aladdinSC.QuestionnaireAnswer();
                qa5.questionID = "1137";
                qa5.value = "0";
                //answer questionID="1138" value="0" />
                aladdinSC.QuestionnaireAnswer qa6 = new aladdinSC.QuestionnaireAnswer();
                qa6.questionID = "1138";
                qa6.value = "0";
                //answer questionID="1139" value="0" />
                aladdinSC.QuestionnaireAnswer qa7 = new aladdinSC.QuestionnaireAnswer();
                qa7.questionID = "1139";
                qa7.value = "0";
                //answer questionID="1140" value="1" />
                aladdinSC.QuestionnaireAnswer qa8 = new aladdinSC.QuestionnaireAnswer();
                qa8.questionID = "1140";
                qa8.value = "1";
                //answer questionID="1141" value="2" />
                aladdinSC.QuestionnaireAnswer qa9 = new aladdinSC.QuestionnaireAnswer();
                qa9.questionID = "1141";
                qa9.value = "2";
                //answer questionID="1142" value="3" />
                aladdinSC.QuestionnaireAnswer qa10 = new aladdinSC.QuestionnaireAnswer();
                qa10.questionID = "1142";
                qa10.value = "3";
                //answer questionID="1143" value="4" />
                aladdinSC.QuestionnaireAnswer qa11 = new aladdinSC.QuestionnaireAnswer();
                qa11.questionID = "1143";
                qa11.value = "4";
                //answer questionID="1144" value="0" />
                aladdinSC.QuestionnaireAnswer qa12 = new aladdinSC.QuestionnaireAnswer();
                qa12.questionID = "1144";
                qa12.value = "0";
                //answer questionID="1145" value="0" />
                aladdinSC.QuestionnaireAnswer qa13 = new aladdinSC.QuestionnaireAnswer();
                qa13.questionID = "1145";
                qa13.value = "0";
                //answer questionID="1146" value="1" />
                aladdinSC.QuestionnaireAnswer qa14 = new aladdinSC.QuestionnaireAnswer();
                qa14.questionID = "1146";
                qa14.value = "1";
                //answer questionID="1147" value="2" />
                aladdinSC.QuestionnaireAnswer qa15 = new aladdinSC.QuestionnaireAnswer();
                qa15.questionID = "1147";
                qa15.value = "2";
                //answer questionID="1148" value="3" />
                aladdinSC.QuestionnaireAnswer qa16 = new aladdinSC.QuestionnaireAnswer();
                qa16.questionID = "1148";
                qa16.value = "3";
                //answer questionID="1149" value="4" />
                aladdinSC.QuestionnaireAnswer qa17 = new aladdinSC.QuestionnaireAnswer();
                qa17.questionID = "1149";
                qa17.value = "4";
                //answer questionID="1150" value="0" />
                aladdinSC.QuestionnaireAnswer qa18 = new aladdinSC.QuestionnaireAnswer();
                qa18.questionID = "1150";
                qa18.value = "0";
                //answer questionID="1156" value="1" />
                aladdinSC.QuestionnaireAnswer qa19 = new aladdinSC.QuestionnaireAnswer();
                qa19.questionID = "1156";
                qa19.value = "1";
                //answer questionID="1162" value="0" />
                aladdinSC.QuestionnaireAnswer qa20 = new aladdinSC.QuestionnaireAnswer();
                qa20.questionID = "1162";
                qa20.value = "0";
                //answer questionID="1163" value="1" />
                aladdinSC.QuestionnaireAnswer qa21 = new aladdinSC.QuestionnaireAnswer();
                qa21.questionID = "1163";
                qa21.value = "1";
                //answer questionID="1164" value="0" />
                aladdinSC.QuestionnaireAnswer qa22 = new aladdinSC.QuestionnaireAnswer();
                qa22.questionID = "1164";
                qa22.value = "0";
                //answer questionID="1165" value="1" />
                aladdinSC.QuestionnaireAnswer qa23 = new aladdinSC.QuestionnaireAnswer();
                qa23.questionID = "1165";
                qa23.value = "1";
                //answer questionID="1166" value="0" />
                aladdinSC.QuestionnaireAnswer qa24 = new aladdinSC.QuestionnaireAnswer();
                qa24.questionID = "1166";
                qa24.value = "0";
                //answer questionID="1167" value="1" />
                aladdinSC.QuestionnaireAnswer qa25 = new aladdinSC.QuestionnaireAnswer();
                qa25.questionID = "1167";
                qa25.value = "1";
                //answer questionID="1168" value="0" />
                aladdinSC.QuestionnaireAnswer qa26 = new aladdinSC.QuestionnaireAnswer();
                qa26.questionID = "1168";
                qa26.value = "0";
                //answer questionID="1169" value="1" />
                aladdinSC.QuestionnaireAnswer qa27 = new aladdinSC.QuestionnaireAnswer();
                qa27.questionID = "1169";
                qa27.value = "0";
                //answer questionID="1170" value="0" />
                aladdinSC.QuestionnaireAnswer qa28 = new aladdinSC.QuestionnaireAnswer();
                qa28.questionID = "1170";
                qa28.value = "0";
                //answer questionID="1171" value="1" />
                aladdinSC.QuestionnaireAnswer qa29 = new aladdinSC.QuestionnaireAnswer();
                qa28.questionID = "1171";
                qa28.value = "1";
                //answer questionID="1172" value="0" />
                aladdinSC.QuestionnaireAnswer qa30 = new aladdinSC.QuestionnaireAnswer();
                qa30.questionID = "1172";
                qa30.value = "0";

                qas.answer = new aladdinSC.QuestionnaireAnswer[] { qa1, qa2, qa3, qa4, qa5, qa6, qa7, qa8, qa9, qa10, qa11, qa12, qa13, qa14, qa15, qa16, qa17, qa18, qa19, qa20, qa21, qa22, qa23, qa24, qa25, qa26, qa27, qa28, qa29, qa30 };
                qas.TaskID = "314";
                qas.UserID = "42";
                qas.ObjectID = "43";

                aladdinSC.OperationResult res = sc.StoreQuestionnaireAnswers(qas, "42");
            }
        }

        const int Weight = 2;
        const int SystolicBloodPressure = 11;
        const int DiastolicBloodPressure = 12;


        private void GetMeasurements()
        {
            List<aladdinSC.Measurement> measurements = GetMeasurementsForPatient("11", new DateTime(2010, 11, 11), new DateTime(2011, 2, 7), "42");
            foreach (aladdinSC.Measurement m in measurements.OrderBy(m => m.DateTime))
                System.Diagnostics.Trace.WriteLine(string.Format("{0}, {1}", m.Type.Code, m.Value));
        }

        private static List<aladdinSC.Measurement> GetMeasurementsForPatient(string patientID, DateTime dateFrom, DateTime dateTo, string userID)
        {
            using (aladdinSC.StorageComponent sc = new aladdinSC.StorageComponent())
            {
                aladdinSC.OperationResult authRes = sc.Auth("raac", "raac");

                string code = authRes.Code;

                aladdinSC.User user = sc.GetUser("43");
                aladdinSC.OperationResult res = sc.GetUserIdByPersonId("43", 4, "10");

                aladdinSC.SystemParameter locale = new aladdinSC.SystemParameter();
                locale.Code = "en_UK";
                aladdinSC.OperationResult desc = sc.GetQuestionDescription("1150", locale);


                aladdinSC.QuestionnaireAnswers[] answers = sc.GetQuestionnaireAnswers("43", new DateTime(2011, 4, 25), new DateTime(2011, 5, 2), "10");
                aladdinSC.QuestionnaireAnswers answers1 = answers[0];
                foreach (var item in answers1.answer)
                    System.Diagnostics.Trace.WriteLine(string.Format("QuestionID = {0}, GlobalID = {1}, Value = {2}", item.questionID, item.globalID, item.value));



                List<aladdinSC.Measurement> measurements = new List<aladdinSC.Measurement>();
                // get Weight measurements for patient
                List<aladdinSC.Measurement> weightMeasurements = sc.GetPatientMeasurement("43", Weight, dateFrom, dateTo, "10").ToList();
                measurements.AddRange(weightMeasurements);
                // get Systolic Pressure measurements for patient
                List<aladdinSC.Measurement> systolicMeasurements = sc.GetPatientMeasurement(patientID, SystolicBloodPressure, dateFrom, dateTo, userID).ToList();
                measurements.AddRange(systolicMeasurements);
                // get Diastolic Pressure measurements for patient
                List<aladdinSC.Measurement> diastolicMeasurements = sc.GetPatientMeasurement(patientID, DiastolicBloodPressure, dateFrom, dateTo, userID).ToList();
                measurements.AddRange(diastolicMeasurements);
                return measurements;
            }
        }
    }
}
