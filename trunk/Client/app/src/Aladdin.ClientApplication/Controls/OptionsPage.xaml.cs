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
using Aladdin.ClientApplication.ViewModels;
using System.ComponentModel;
using System.Configuration;
using Aladdin.ClientApplication.Properties;
using System.Reflection;

namespace Aladdin.ClientApplication.Controls
{
    /// <summary>
    /// Interaction logic for OptionsPage.xaml
    /// </summary>
    public partial class OptionsPage : UserControl
    {
        public string DefaultLanguage { get; set; }

        public List<aladdinService.SystemParameter> Languages = new List<aladdinService.SystemParameter>();

        public OptionsPage()
        {
            InitializeComponent();
            this.DefaultLanguage = App.DefaultLanguage;
            aladdinService.SystemParameter p1 = new aladdinService.SystemParameter();
            p1.Code = "1";
            p1.Description = "English";
            Languages.Add(p1);

            aladdinService.SystemParameter p2 = new aladdinService.SystemParameter();
            p2.Code = "2";
            p2.Description = "Εspañol";
            Languages.Add(p2);

            aladdinService.SystemParameter p3 = new aladdinService.SystemParameter();

            p3.Code = "3";
            p3.Description = "Ελληνικά";
            Languages.Add(p3);

            aladdinService.SystemParameter p4 = new aladdinService.SystemParameter();

            p4.Code = "4";
            p4.Description = "Italiano";
            Languages.Add(p4);

            aladdinService.SystemParameter p5 = new aladdinService.SystemParameter();

            p5.Code = "5";
            p5.Description = "Deutsch";
            Languages.Add(p5);

            this.serverAddress.Text = App.ServerAddress;
            this.DataContext = this;
        }


        private void CommandBinding_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;

            if (AppCommands.SaveCommand.Equals(e.Command))
            {
                
                Configuration config = ConfigurationManager.OpenExeConfiguration(Assembly.GetExecutingAssembly().Location);
                config.AppSettings.Settings["DefaultLanguage"].Value = App.DefaultLanguage;
                config.Save();

                App.ServerAddress = this.serverAddress.Text;
                Settings.Default.Aladdin_ClientApplication_aladdinService_StorageComponent = App.ServerAddress;
                Settings.Default.Save();
            }
        }

        private void CommandBinding_CanExecute(object sender, CanExecuteRoutedEventArgs e)
        {
            if (AppCommands.SaveCommand.Equals(e.Command))
                e.CanExecute = (this.languageCombo.SelectedValue != null && this.serverAddress.Text.Length > 0);
            else
                e.CanExecute = true;
        }
    }
}
