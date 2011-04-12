using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Windows;
using System.Net.Security;
using System.Security.Cryptography.X509Certificates;
using Aladdin.ClientApplication.Properties;


namespace Aladdin.ClientApplication
{

    public delegate void LoggedInEventHandler(object sender);

    /// <summary>
    /// Interaction logic for App.xaml
    /// </summary>
    public partial class App : Application
    {
        public static App ThisApp { get; private set; }

        private static bool _IsUserAuthenticated;

        public static bool IsUserAuthenticated
        {
            get
            {
                return _IsUserAuthenticated;
            }

            set
            {
                _IsUserAuthenticated = value;
                if (App.LoggedIn != null)
                    App.LoggedIn(null);
            }
        }

        public static string CurrentUserID;
        public static string CurrentUserName;
        public static string PatientID;
        public static aladdinService.SystemParameter DefaultLanguage;
        public static aladdinService.SystemParameter DefaultLocale;
        public static bool OptionsLocked { get; set; }
        public static string ServerAddress;
        public static string UpdatesAddress;
        public static string LoginErrorMessage { get; set; }
        public static string WellcomeMessage { get; set; }
        public static string WellcomeALADDINMessage { get; set; }
        public static List<aladdinService.Task> ActiveTasks { get; set; }
        public static string PatientQuestionnaireTempPath { get; set; }
        public static event LoggedInEventHandler LoggedIn;

        public static aladdinService.MediaContent[] EducationContent;
        public static aladdinService.MediaContent[] EntertainmentContent;
        public static aladdinService.MediaContent[] GamesContent;

        public static string DataReadMsg;
        public static string StepsMsg;
        public static string PressTheSendButtonMsg;
        public static string ErrorReadingMsg;
        public static string DeviceNotFoundMsg;


        public App()
        {
            System.Net.ServicePointManager.ServerCertificateValidationCallback +=
            delegate(object sender, X509Certificate cert, X509Chain chain, SslPolicyErrors sslError)
            {
                bool validationResult = true;
                return validationResult;
            };

            this.DispatcherUnhandledException += new System.Windows.Threading.DispatcherUnhandledExceptionEventHandler(OnDispatcherUnhandledException);

            App.ThisApp = this;
            try
            {
                AutoUpdater.CheckForUpdates();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Please check Internet connection!", "ALADDIN", MessageBoxButton.OK, MessageBoxImage.Error);
                return;
            }

            LoadContent();


        }

        private void LoadContent()
        {
            // Load Content...
            using (aladdinService.StorageComponent sc = new aladdinService.StorageComponent())
            {
                aladdinService.SearchCriteria sc1 = new aladdinService.SearchCriteria();
                sc1.FieldName = "category";
                sc1.FieldValue1 = "education";
                sc1.CompareOp = new aladdinService.SystemParameter();
                sc1.CompareOp.Code = "3";
                aladdinService.SearchCriteria sc2 = new aladdinService.SearchCriteria();
                sc2.FieldName = "enabled";
                sc2.FieldValue1 = "true";
                sc2.CompareOp = new aladdinService.SystemParameter();
                sc2.CompareOp.Code = "3";
                EducationContent = sc.GetMediaContent(new aladdinService.SearchCriteria[] { sc1, sc2 }, null);
                sc1.FieldValue1 = "games";
                GamesContent = sc.GetMediaContent(new aladdinService.SearchCriteria[] { sc1, sc2 }, null);
                sc1.FieldValue1 = "entertainment";
                EntertainmentContent = sc.GetMediaContent(new aladdinService.SearchCriteria[] { sc1, sc2 }, null);
            }
        }

        protected virtual void OnDispatcherUnhandledException(object sender, System.Windows.Threading.DispatcherUnhandledExceptionEventArgs e)
        {
            e.Handled = true;
            MessageBox.Show(e.Exception.Message, "ALADDIN", MessageBoxButton.OKCancel, MessageBoxImage.Error);
        }

    }
}
