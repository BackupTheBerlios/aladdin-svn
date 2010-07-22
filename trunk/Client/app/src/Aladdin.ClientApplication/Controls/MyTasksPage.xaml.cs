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
    /// Interaction logic for MyTasksPage.xaml
    /// </summary>
    public partial class MyTasksPage : UserControl
    {
        public MyTasksPage()
        {
            GetMyTasks();
            InitializeComponent();
        }


        private void GetMyTasks()
        {

            try
            {
                aladdinService.StorageComponent sc = new aladdinService.StorageComponent();
                aladdinService.Task[] mytasks = sc.GetUserPlannedTasks(App.CurrentUserID, new DateTime(2010, 7, 1), new DateTime(2010, 7, 31), App.CurrentUserID);
            }
            catch (Exception ex)
            {
                string msg = ex.Message;
            }
        }

    }
}
