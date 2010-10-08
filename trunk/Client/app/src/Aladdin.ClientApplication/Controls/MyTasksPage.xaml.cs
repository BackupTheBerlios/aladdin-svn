using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using Aladdin.DataModel;

namespace Aladdin.ClientApplication.Controls
{
    /// <summary>
    /// Interaction logic for MyTasksPage.xaml
    /// </summary>
    public partial class MyTasksPage : UserControl
    {
        public MyTasksPage()
        {
            InitializeComponent();
        }

        private void GetMyTasks()
        {
            try
            {
                this.TaskPanel.Children.Clear();
                aladdinService.StorageComponent sc = new aladdinService.StorageComponent();
                App.ActiveTasks = sc.GetUserPlannedTasks(App.CurrentUserID, new DateTime(2010, 10, 1), new DateTime(2010, 10, 15), App.DefaultLanguage, App.CurrentUserID).ToList();
                App.ActiveTasks = App.ActiveTasks.Where(c => Convert.ToInt32(c.TaskStatus.Code) != (int) TaskStatusEnum.Canceled).ToList();

                foreach (aladdinService.Task task in App.ActiveTasks)
                {

                    string taskinfo = string.Format("ID={0} TaskType.Code={1} TaskType.Description={2} TaskStatus.Code={3} ", task.ID, task.TaskType.Code, task.TaskType.Description, task.TaskStatus.Code);
                    System.Diagnostics.Trace.WriteLine(taskinfo);
                }

                aladdinService.Task patientQuestionnaireTask = App.ActiveTasks.SingleOrDefault(t => t.TaskType.Code == "1");
                if (patientQuestionnaireTask != null)
                {
                    aladdinService.Questionnaire que = patientQuestionnaireTask.Questionnaire;
                    System.Xml.Serialization.XmlSerializer x = new System.Xml.Serialization.XmlSerializer(que.GetType());
                    x.Serialize(Console.Out, que);
                }

                int num = 1;
                foreach (aladdinService.Task task in App.ActiveTasks)
                {
                    TaskControl taskControl = new TaskControl();
                    taskControl.Task = task;
                    taskControl.Number = num++;
                    int taskType = Convert.ToInt32(task.TaskType.Code);
                    switch (taskType)
                    {
                        case (int)TaskTypesEnum.PatientQuestionnaire:
                            taskControl.SetResourceReference(TaskControl.TitleProperty, "PatientQuestionnaireTaskTitle");
                            break;
                        case (int)TaskTypesEnum.CarerQuestionnaire:
                            taskControl.SetResourceReference(TaskControl.TitleProperty, "CarerQuestionnaireTaskTitle");
                            break;
                        case (int)TaskTypesEnum.BloodPressureMeasurement:
                            taskControl.SetResourceReference(TaskControl.TitleProperty, "MeasureBloodPressureTaskTitle");
                            break;
                        case (int)TaskTypesEnum.WeightMeasurement:
                            taskControl.SetResourceReference(TaskControl.TitleProperty, "MeasureWeightTaskTitle");
                            break;
                        case (int)TaskTypesEnum.CognitiveGame:
                            taskControl.SetResourceReference(TaskControl.TitleProperty, "PlayGamesTaskTitle");
                            break;
                        case (int)TaskTypesEnum.ActivityMonitor:
                            taskControl.SetResourceReference(TaskControl.TitleProperty, "MeasureActivityTaskTitle");
                            break;
                        case (int)TaskTypesEnum.Exercise:
                            taskControl.SetResourceReference(TaskControl.TitleProperty, "ExerciseTaskTitle");
                            break;
                        default:
                            break;
                    }

                    int taskStatus = Convert.ToInt32(task.TaskStatus.Code);

                    switch (taskStatus)
                    {
                        case (int)TaskStatusEnum.Pending:
                            taskControl.IsPending = true;
                            break;
                        case (int)TaskStatusEnum.Completed:
                            taskControl.IsPending = false;
                            break;
                        default:
                            break;
                    }

                    this.TaskPanel.Children.Add(taskControl);

                }

            }
            catch (Exception ex)
            {
                string msg = ex.Message;
            }
        }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {
            GetMyTasks();
        }

    }
}
