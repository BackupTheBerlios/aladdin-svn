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

namespace Aladdin.ClientApplication.Controls
{



    /// <summary>
    /// Interaction logic for LoginPage.xaml
    /// </summary>
    public partial class LoginPage : UserControlBase
    {
    
        public string UserName
        {
            get { return this.txtUsername.Text; }
            set {this.txtUsername.Text = value; }
        }

        public string Password
        {
            get { return this.txtPassword.Password; }
            set {this.txtPassword.Password = value; }
        }

        public LoginPage()
        {
            InitializeComponent();
        }

        private void Authenticate()
        {
            using (aladdinService.StorageComponent sc = new aladdinService.StorageComponent())
            {
                Cursor = Cursors.Wait;

                try
                {
                    aladdinService.OperationResult res = sc.Auth(this.UserName, this.Password);
                    if (res.Code == "-2")
                        this.txtMessage.Text = res.Description;
                    else if (res.Code != "0")
                    {
                        App.CurrentUserID = res.Code;
                        aladdinService.User currentUser = sc.GetUser(App.CurrentUserID);
                        App.CurrentUserName = currentUser.Username;
                        App.IsUserAuthenticated = true;
                        App.PatientID = FindPatientID();
                        if (App.PatientID.Equals(string.Empty))
                            MessageBox.Show("No unique patient related to this account", "ALADDIN");
                        AppCommands.MoveToPageCommand.Execute("StartPage", this);
                    }
                    else
                        this.txtMessage.Text = App.LoginErrorMessage;
                }
                catch (Exception ex)
                {
                    this.txtMessage.Text = ex.Message;
                }

                Cursor = Cursors.Arrow;
            }
        }

        private string FindPatientID()
        {
            using (aladdinService.StorageComponent sc = new aladdinService.StorageComponent())
            {
                aladdinService.PatientInfo[] myPatients = sc.GetPatientsForCaregiver(App.CurrentUserID);
                if (myPatients!= null && myPatients.Count() == 1)
                    return myPatients[0].ID;
                else
                    return string.Empty;
            }
        }


        private void CommandBinding_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;

            if (AppCommands.LoginCommand.Equals(e.Command))
                this.Authenticate();
        }

        private void CommandBinding_CanExecute(object sender, CanExecuteRoutedEventArgs e)
        {
                e.CanExecute = this.txtUsername.Text.Length > 0 && this.txtPassword.Password.Length > 0;
        }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {
            this.txtPassword.Password = "";
        }


    }
}
