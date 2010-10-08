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
using Aladdin.ClientApplication.Windows;
using Aladdin.ClientApplication.ViewModels;

namespace Aladdin.ClientApplication.Controls
{
    /// <summary>
    /// Interaction logic for MeasureWeightBloodPage.xaml
    /// </summary>
    public partial class MeasureWeightPage : UserControl
    {
        MeasureWeightViewModel ViewModel { get; set; }

        public MeasureWeightPage(aladdinService.Task activeTask)
        {
            this.ViewModel = new MeasureWeightViewModel(activeTask);
            this.DataContext = this.ViewModel;

            InitializeComponent();
            //if (MainWindow.Questionnaire != null)
            //    this.ChooseOneAnswerFromManyControl.FillAnswers(MainWindow.Questionnaire.Questions[4].Questions[0]);
        }

        private void CommandBinding_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;
            if (AppCommands.SendMeasurementCommand.Equals(e.Command))
                this.ViewModel.SendMeasurements();
        }

        private void CommandBinding_CanExecute(object sender, CanExecuteRoutedEventArgs e)
        {
            e.Handled = true;
            if (AppCommands.SendMeasurementCommand.Equals(e.Command))
                e.CanExecute = this.ViewModel.CanSendMeasurements();
        }
    }
}
