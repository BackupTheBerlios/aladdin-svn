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
    public partial class LoginPage : UserControl
    {

        public string UserName
        {
            get { return this.txtUsername.Text; }
        }

        public string Password
        {
            get { return this.txtPassword.Password; }
        }

        public LoginPage()
        {
            InitializeComponent();
        }

        private void Authenticate()
        {
            using (aladdinService.StorageComponent sc = new aladdinService.StorageComponent())
            {
                aladdinService.OperationResult res = sc.Auth(this.UserName, this.Password);
                if (res.Code != "0")
                {
                    App.IsUserAuthenticated = true;
                    App.CurrentUserID = res.Code;
                    AppCommands.MoveToPageCommand.Execute("StartPage", this);
                }
                else
                    this.txtMessage.Text = "Wrong username or password";
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


    }
}
