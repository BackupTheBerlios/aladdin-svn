﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;

namespace Aladdin.ClientApplication.ViewModels
{
    public class ExternalServicePageViewModel
    {
        aladdinService.Task ActiveTask;

        public string Url { get; set; }

        public ExternalServicePageViewModel(aladdinService.Task activeTask)
        {
            this.ActiveTask = activeTask;
            if (this.ActiveTask != null && this.ActiveTask.URL != null)
                this.Url = this.ActiveTask.URL;
        }
    }
}
