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
        }

        private void MoveToPage_Executed(object sender, ExecutedRoutedEventArgs e)
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
    }
}
