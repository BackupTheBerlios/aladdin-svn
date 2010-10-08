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

namespace Aladdin.ClientApplication.Controls
{
    /// <summary>
    /// Interaction logic for ContactUsPage.xaml
    /// </summary>
    public partial class ContactUsPage : UserControl
    {
        public ContactUsPage()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            using (aladdinService.StorageComponent sc = new aladdinService.StorageComponent())
            {
                aladdinService.Warning userWarning = new aladdinService.Warning();
                userWarning.DateTimeOfWarning = System.DateTime.Now;
                aladdinService.SystemParameter typeOfWarning  = new aladdinService.SystemParameter();
                typeOfWarning.Code = "1";
                typeOfWarning.Description = "Manual";
                userWarning.TypeOfWarning = typeOfWarning;
                string situation = "";
                if (this.SituationComboBox.SelectedItem != null)
                    situation = (this.SituationComboBox.SelectedItem as ComboBoxItem).Content.ToString();
                userWarning.JustificationText = string.Format("Situation:{0}, Description:{1}", situation, this.DescriptionBox.Text);
                userWarning.PatientID = App.PatientID;
                aladdinService.OperationResult res = sc.SaveWarning(userWarning, App.CurrentUserID);

            }
    
        }
    }
}
