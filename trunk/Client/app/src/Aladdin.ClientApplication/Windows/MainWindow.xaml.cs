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

            App.LoginErrorMessage = (string)this.Resources.MergedDictionaries[0]["WrongUsernameOrPassword"];
        }

        private void SetLanguageDictionary()
        {
            ResourceDictionary dict = new ResourceDictionary();
            aladdinService.SystemParameter defaultLanguage = new aladdinService.SystemParameter();
            aladdinService.SystemParameter locale = new aladdinService.SystemParameter();
            defaultLanguage.Code = ConfigurationManager.AppSettings["DefaultLanguage"];
            App.DefaultLanguage = defaultLanguage; App.ServerAddress = Settings.Default.Aladdin_ClientApplication_aladdinService_StorageComponent;
            switch (App.DefaultLanguage.Code)
            {
                case "en_US":
                    dict.Source = new Uri("..\\Resources\\StringResources.xaml", UriKind.Relative);
                    locale.Code = "en_US";
                    break;
                case "es_ES":
                    dict.Source = new Uri("..\\Resources\\StringResources.es-ES.xaml", UriKind.Relative);
                    locale.Code = "es_ES";
                    break;
                case "el_GR":
                    dict.Source = new Uri("..\\Resources\\StringResources.el-GR.xaml", UriKind.Relative);
                    locale.Code = "el_GR";
                    break;
                case "it_IT":
                    dict.Source = new Uri("..\\Resources\\StringResources.it-IT.xaml", UriKind.Relative);
                    locale.Code = "it_IT";
                    break;
                case "de_DE":
                    dict.Source = new Uri("..\\Resources\\StringResources.de-DE.xaml", UriKind.Relative);
                    locale.Code = "de_DE";
                    break;
                case "ca_CA":
                    dict.Source = new Uri("..\\Resources\\StringResources.ca-CA.xaml", UriKind.Relative);
                    locale.Code = "ca_CA";
                    break;
                default:
                    dict.Source = new Uri("..\\Resources\\StringResources.xaml", UriKind.Relative);
                    locale.Code = "en_US";
                    break;
            }
            App.DefaultLocale = locale;
            this.Resources.MergedDictionaries.Add(dict);
        }

        public void MoveToStartPage()
        {
            this.ViewModel.MoveToPage("StartPage", null);
        }

        private void MoveToPage_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;

            if (e.Parameter is string)
                this.ViewModel.MoveToPage(e.Parameter as string, null);
            if (e.Parameter is aladdinService.Task)
            {
                aladdinService.Task task = e.Parameter as aladdinService.Task;
                int taskType = Convert.ToInt32(task.TaskType.Code);
                switch (taskType)
                {
                    case (int)TaskTypesEnum.PatientQuestionnaire:
                                this.ViewModel.MoveToPage("WizardPage", task);                        
                                break;
                    case (int)TaskTypesEnum.CarerQuestionnaire:
                                this.ViewModel.MoveToPage("WizardPage", task);  ;
                                break;
                    case (int)TaskTypesEnum.BloodPressureMeasurement:
                                this.ViewModel.MoveToPage("MeasureBloodPressurePage", task);
                                break;
                    case (int)TaskTypesEnum.WeightMeasurement:
                                this.ViewModel.MoveToPage("MeasureWeightPage", task);
                                break;
                    case (int)TaskTypesEnum.CognitiveGame:
                                this.ViewModel.MoveToPage("PlayGame", task);
                                break;
                    case (int)TaskTypesEnum.Exercise:
                                this.ViewModel.MoveToPage("PlayGame", task);
                                break;
                    default:
                                break;
                }
            }
        }

        private void MoveToPageWithoutAuthenticationCommand(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;

            if (e.Parameter is string)
                this.ViewModel.MoveToPage(e.Parameter as string, null);
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
