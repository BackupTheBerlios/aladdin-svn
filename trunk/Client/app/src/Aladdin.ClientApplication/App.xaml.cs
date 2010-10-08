using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Windows;

namespace Aladdin.ClientApplication
{
    /// <summary>
    /// Interaction logic for App.xaml
    /// </summary>
    public partial class App : Application
    {

        public static bool   IsUserAuthenticated;
        public static string CurrentUserID;
        public static string PatientID;
        public static aladdinService.SystemParameter DefaultLanguage;
        public static string ServerAddress;
        public static string LoginErrorMessage { get; set; }
        public static List<aladdinService.Task> ActiveTasks { get; set; }
        public static string PatientQuestionnaireTempPath { get; set; }

    }
}
