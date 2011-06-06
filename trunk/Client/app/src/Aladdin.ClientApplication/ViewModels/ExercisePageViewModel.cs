using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;

namespace Aladdin.ClientApplication.ViewModels
{
    public class ExercisePageViewModel
    {
        aladdinService.Task ActiveTask;

        public string Url { get; set; }

        public string Text { get; set; }

        public ExercisePageViewModel(aladdinService.Task activeTask)
        {
            this.ActiveTask = activeTask;
            if (this.ActiveTask != null && this.ActiveTask.URL != null)
            {
                this.Url = this.ActiveTask.URL;
                this.Text = this.ActiveTask.Text;
                using (aladdinService.StorageComponent sc = new aladdinService.StorageComponent())
                {
                    if (this.ActiveTask.ID != null)
                    {
                        aladdinService.OperationResult taskChangeStatus = sc.ChangeTaskStatus(Convert.ToInt32(this.ActiveTask.ID), (int)TaskStatusEnum.Completed, App.CurrentUserID);
                    }
                }
            }
        }
    }
}
