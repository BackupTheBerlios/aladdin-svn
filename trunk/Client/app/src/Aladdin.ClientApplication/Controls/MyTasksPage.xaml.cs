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
            Cursor = Cursors.Wait;
            try
            {
                this.TaskPanel.Children.Clear();
                aladdinService.StorageComponent sc = new aladdinService.StorageComponent();
                DateTime today = System.DateTime.Now;
                DateTime yesterday = DateTime.Now.AddDays(-1);
                DateTime dateFrom = new DateTime(yesterday.Year, yesterday.Month, yesterday.Day, 0, 0, 0);
                DateTime dateTo = new DateTime(today.Year, today.Month, today.Day, 23, 59, 59);
                

                App.ActiveTasks = sc.GetUserPlannedTasks(App.CurrentUserID, dateFrom, dateTo, App.DefaultLocale, App.CurrentUserID).ToList();

                // fix for different time zones
                foreach (var item in App.ActiveTasks)
                {
                    item.DateTimeAssigned = item.DateTimeAssigned.AddHours(3);    
                }

                // Remove canceled tasks
                App.ActiveTasks = App.ActiveTasks.Where(c => Convert.ToInt32(c.TaskStatus.Code) != (int) TaskStatusEnum.Canceled).ToList();
                // Remove tasks assigned the day before, if completed
                string[] yesterdaysCompletedTasksIDs = App.ActiveTasks.Where(c => c.DateTimeAssigned.Year == dateFrom.Year && c.DateTimeAssigned.Month == dateFrom.Month && c.DateTimeAssigned.Day == dateFrom.Day && (Convert.ToInt32(c.TaskStatus.Code) == (int)TaskStatusEnum.Completed || Convert.ToInt32(c.TaskType.Code) == (int)TaskTypesEnum.Message)).Select(c => c.ID).ToArray();

                if (yesterdaysCompletedTasksIDs.Length > 0)
                    App.ActiveTasks = App.ActiveTasks.Where(c => !yesterdaysCompletedTasksIDs.Contains(c.ID)).ToList();

                int num = 1;
                foreach (aladdinService.Task task in App.ActiveTasks)
                {
                    TaskControl taskControl = new TaskControl();
                    taskControl.Task = task;
                    taskControl.Number = num++;
                    taskControl.Date = task.DateTimeAssigned.ToShortDateString();
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
                        case (int)TaskTypesEnum.Message:
                            taskControl.SetResourceReference(TaskControl.TitleProperty, "MessageTitle");
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

            Cursor = Cursors.Arrow;
        }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {
            GetMyTasks();
        }

    }
}
