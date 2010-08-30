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
using Aladdin.ClientApplication.ViewModels;
using System.Threading;
using System.Configuration;
using Aladdin.ClientApplication.Properties;


namespace Aladdin.ClientApplication.Windows
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        MainWindowViewModel ViewModel { get; set; }

        public MainWindow()
        {
            this.ViewModel = new MainWindowViewModel();
            this.DataContext = this.ViewModel;            
            InitializeComponent();
            SetLanguageDictionary();
        }

        private void SetLanguageDictionary()
        {
            ResourceDictionary dict = new ResourceDictionary();
            App.DefaultLanguage = ConfigurationManager.AppSettings["DefaultLanguage"];
            App.ServerAddress = Settings.Default.Aladdin_ClientApplication_aladdinService_StorageComponent;
            switch (App.DefaultLanguage)
            {
                case "1":
                    dict.Source = new Uri("..\\Resources\\StringResources.xaml", UriKind.Relative);
                    break;
                case "2":
                    dict.Source = new Uri("..\\Resources\\StringResources.es-ES.xaml", UriKind.Relative);
                    break;
                case "3":
                    dict.Source = new Uri("..\\Resources\\StringResources.el-GR.xaml", UriKind.Relative);
                    break;
                case "4":
                    dict.Source = new Uri("..\\Resources\\StringResources.it-IT.xaml", UriKind.Relative);
                    break;
                case "5":
                    dict.Source = new Uri("..\\Resources\\StringResources.de-DE.xaml", UriKind.Relative);                    
                    break;
                default:
                    dict.Source = new Uri("..\\Resources\\StringResources.xaml", UriKind.Relative);
                    break;
            }
            this.Resources.MergedDictionaries.Add(dict);
        }

        public void MoveToStartPage()
        {
            this.ViewModel.MoveToPage("StartPage");
        }

        private void MoveToPage_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;

            if (e.Parameter is string)
                this.ViewModel.MoveToPage(e.Parameter as string);
        }

        private void MoveToPageWithoutAuthenticationCommand(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;

            if (e.Parameter is string)
                this.ViewModel.MoveToPage(e.Parameter as string);
        }

        private void CommandBinding_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;

            if (AppCommands.ExitApplicationCommand.Equals(e.Command))
                this.ViewModel.ExitApplication();
        }

        private void CommandBinding_CanExecute(object sender, CanExecuteRoutedEventArgs e)
        {
            e.Handled = true;
            e.CanExecute = App.IsUserAuthenticated;
        }
    }
}
