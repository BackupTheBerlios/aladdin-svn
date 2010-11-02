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


        public aladdinService.Task ActiveTask { get; set; }

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
                _WizardPage = new WizardPage(this.ActiveTask);
                return _WizardPage;
            }
        }

        MeasureWeightPage _MeasureWeightPage;
        MeasureWeightPage MeasureWeightPage
        {
            get
            {
                _MeasureWeightPage = new MeasureWeightPage(this.ActiveTask);
                return _MeasureWeightPage;
            }
        }

        MeasureBloodPressurePage _MeasureBloodPressurePage;
        MeasureBloodPressurePage MeasureBloodPressurePage
        {
            get
            {
                _MeasureBloodPressurePage = new MeasureBloodPressurePage(this.ActiveTask);
                return _MeasureBloodPressurePage;
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
                _ExternalServicePage = new ExternalServicePage(this.ActiveTask);
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

        internal void MoveToPage(string to, aladdinService.Task activeTask)
        {
            object page = null;
            this.ActiveTask = activeTask;

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
                    case "MeasureWeightPage":
                        page = this.MeasureWeightPage;
                        break;
                    case "MeasureBloodPressurePage":
                        page = this.MeasureBloodPressurePage;
                        break;
                    case "VideoPage":
                        page = this.VideoPage;
                        break;
                    case "ContactUsPage":
                        page = this.ContactUsPage;
                        break;
                    case "PlayGame":
                        page = this.ExternalServicePage;
                        break;
                    case "SocialNetwork":
                        page = this.ExternalServicePage;
                        (page as ExternalServicePage).Url = "http://dafnis.atosorigin.es/aladdin/phpBB3/index.php";
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
