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



        public List<aladdinService.SystemParameter> ContactSituations
        {
            get { return (List<aladdinService.SystemParameter>)GetValue(ContactSituationsProperty); }
            set { SetValue(ContactSituationsProperty, value); }
        }

        // Using a DependencyProperty as the backing store for ContactSituations.  This enables animation, styling, binding, etc...
        public static readonly DependencyProperty ContactSituationsProperty =
            DependencyProperty.Register("ContactSituations", typeof(List<aladdinService.SystemParameter>), typeof(ContactUsPage));

        

        public ContactUsPage()
        {
            aladdinService.SystemParameter englishLocale = new aladdinService.SystemParameter();
            englishLocale.Code = "en_US";
            aladdinService.StorageComponent sc = new aladdinService.StorageComponent();
            aladdinService.SystemParameter[] _contactSituations = sc.GetSystemParameterList((int)SystemParameterEnum.ContactReason, App.DefaultLocale);
            if (_contactSituations != null)
                this.ContactSituations = _contactSituations.ToList();
            else
            {
                _contactSituations = sc.GetSystemParameterList((int)SystemParameterEnum.ContactReason, englishLocale);
                if (_contactSituations != null)
                    this.ContactSituations = _contactSituations.ToList();
            }
            this.DataContext = this;
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
                aladdinService.SystemParameter situation = this.SituationComboBox.SelectedItem as aladdinService.SystemParameter;
                string situationStr = "";
                if (situation != null)
                    situationStr = situation.Description;

                userWarning.JustificationText = string.Format("Situation:{0}, Description:{1}", situationStr, this.DescriptionBox.Text);
                userWarning.PatientID = App.PatientID;
                aladdinService.OperationResult res = sc.SaveWarning(userWarning, App.CurrentUserID);
            }
        }
    }
}
