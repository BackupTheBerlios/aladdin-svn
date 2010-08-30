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

        public static bool IsUserAuthenticated;
        public static string CurrentUserID;
        public static string DefaultLanguage;
        public static string ServerAddress;

    }
}
