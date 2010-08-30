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

        LoginPage _LoginPage;
        LoginPage LoginPage
        {
            get
            {
                if (_LoginPage == null)
                    _LoginPage = new LoginPage();
                return _LoginPage;
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

        ExternalServicePage _ExternalServicePage;
        ExternalServicePage ExternalServicePage
        {
            get
            {
                if (_ExternalServicePage == null)
                    _ExternalServicePage = new ExternalServicePage();
                return _ExternalServicePage;
            }
        }

        OptionsPage _OptionsPage;
        OptionsPage OptionsPage
        {
            get
            {
                if (_OptionsPage == null)
                    _OptionsPage = new OptionsPage();
                return _OptionsPage;
            }
        }


        public MainWindowViewModel()
        {
            if (App.IsUserAuthenticated)
                this.ActivePage = this.StartPage;
            else
                this.ActivePage = this.LoginPage;
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
                    case "OptionsPage":
                        page = this.OptionsPage;
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
                    case "PlayGame":
                        page = this.ExternalServicePage;
                        (page as ExternalServicePage).Url = "http://www.lumosity.com/brain-games/memory-games/memory-matrix";
                        break;
                    case "SocialNetwork":
                        page = this.ExternalServicePage;
                        (page as ExternalServicePage).Url = "http://www.aladdin-project.eu";
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
