using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;
using Aladdin.ClientApplication.Controls;
using System.Windows;

namespace Aladdin.ClientApplication.ViewModels
{
    class MainWindowViewModel : INotifyPropertyChanged
    {
        #region INotifyPropertyChanged Members

        public event PropertyChangedEventHandler PropertyChanged;

        protected void SendPropertyChanged(string propertyName)
        {
            if (this.PropertyChanged != null)
                this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
        }

        #endregion

        object _ActivePage;
        public object ActivePage
        {
            get { return _ActivePage; }
            set
            {
                if (_ActivePage != value)
                {
                    _ActivePage = value;
                    this.SendPropertyChanged("ActivePage");
                }
            }
        }

        StartPage _StartPage;
        StartPage StartPage
        {
            get
            {
                if (_StartPage == null)
                    _StartPage = new StartPage();
                return _StartPage;
            }
        }

        MyTasksPage _MyTasksPage;
        MyTasksPage MyTasksPage
        {
            get
            {
                if (_MyTasksPage == null)
                    _MyTasksPage = new MyTasksPage();
                return _MyTasksPage;
            }
        }

        WizardPage _WizardPage;
        WizardPage WizardPage
        {
            get
            {
                if (_WizardPage == null)
                    _WizardPage = new WizardPage();
                return _WizardPage;
            }
        }

        MeasureWeightBloodPage _MeasureWeightBloodPage;
        MeasureWeightBloodPage MeasureWeightBloodPage
        {
            get
            {
                if (_MeasureWeightBloodPage == null)
                    _MeasureWeightBloodPage = new MeasureWeightBloodPage();
                return _MeasureWeightBloodPage;
            }
        }

        VideoPage _VideoPage;
        VideoPage VideoPage
        {
            get
            {
                if (_VideoPage == null)
                    _VideoPage = new VideoPage();
                return _VideoPage;
            }
        }

        ContactUsPage _ContactUsPage;
        ContactUsPage ContactUsPage
        {
            get
            {
                if (_ContactUsPage == null)
                    _ContactUsPage = new ContactUsPage();
                return _ContactUsPage;
            }
        }

        public MainWindowViewModel()
        {
            this.ActivePage = this.StartPage;
        }

        internal void MoveToPage(string to)
        {
            object page = null;

            if (!string.IsNullOrEmpty(to))
            {
                switch (to)
                {
                    case "MyTasksPage":
                        page = this.MyTasksPage;
                        break;
                    case "WizardPage":
                        page = this.WizardPage;
                        break;
                    case "StartPage":
                        page = this.StartPage;
                        break;
                    case "MeasureWeightBloodPage":
                        page = this.MeasureWeightBloodPage;
                        break;
                    case "VideoPage":
                        page = this.VideoPage;
                        break;
                    case "ContactUsPage":
                        page = this.ContactUsPage;
                        break;
                    default:
                        break;
                }
            }

            if (page != null)
                this.ActivePage = page;
        }

        internal void ExitApplication()
        {
            Application.Current.Shutdown();
        }
    }
}
