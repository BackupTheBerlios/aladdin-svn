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
    /// Interaction logic for MeasureBloodPressure.xaml
    /// </summary>
    public partial class MeasureBloodPressurePage : UserControl
    {

        MeasureBloodPressureViewModel ViewModel { get; set; }

        public MeasureBloodPressurePage(aladdinService.Task activeTask)
        {
            this.ViewModel = new MeasureBloodPressureViewModel(activeTask);
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

        private void DiastolicBloodPressure_GotFocus(object sender, RoutedEventArgs e)
        {
            NumberPad pad = new NumberPad();
            pad.NumberPadPressed += new NumberPadPressedEventHandler(DiastolicBloodPressure_NumberPadPressed);
            pad.NumberPadClosed += new NumberPadClosedEventHandler(pad_NumberPadClosed);
            pad.ShowDialog();
        }

        private void SystolicBloodPressure_GotFocus(object sender, RoutedEventArgs e)
        {
            NumberPad pad = new NumberPad();
            pad.NumberPadPressed += new NumberPadPressedEventHandler(SystolicBloodPressure_NumberPadPressed);
            pad.NumberPadClosed += new NumberPadClosedEventHandler(pad_NumberPadClosed);
            pad.ShowDialog();
        }

        void pad_NumberPadClosed(object sender)
        {
            this.SendBtn.Focus();
        }

        void DiastolicBloodPressure_NumberPadPressed(object sender, string character)
        {
            bool insert = true;
            if (character.Equals("BACKSPACE"))
            {
                if (this.ViewModel.DiastolicBloodPressureText.Length > 0)
                {
                    this.ViewModel.DiastolicBloodPressureText = this.ViewModel.DiastolicBloodPressureText.Substring(0, this.ViewModel.DiastolicBloodPressureText.Length - 1);
                }
                return;
            }
            else if (character.Equals("."))
                if (this.ViewModel.DiastolicBloodPressureText.Contains(character))
                    insert = false;
            if (insert)
            {
                if (character.Equals("."))
                    this.ViewModel.DiastolicBloodPressureText += System.Threading.Thread.CurrentThread.CurrentCulture.NumberFormat.NumberDecimalSeparator;
                else
                    this.ViewModel.DiastolicBloodPressureText += character;
            }
        }

        void SystolicBloodPressure_NumberPadPressed(object sender, string character)
        {
            bool insert = true;
            if (character.Equals("BACKSPACE"))
            {
                if (this.ViewModel.SystolicBloodPressureText.Length > 0)
                {
                    this.ViewModel.SystolicBloodPressureText = this.ViewModel.SystolicBloodPressureText.Substring(0, this.ViewModel.SystolicBloodPressureText.Length - 1);
                }
                return;
            }
            else if (character.Equals("."))
                if (this.ViewModel.SystolicBloodPressureText.Contains(character))
                    insert = false;
            if (insert)
            {
                if (character.Equals("."))
                    this.ViewModel.SystolicBloodPressureText += System.Threading.Thread.CurrentThread.CurrentCulture.NumberFormat.NumberDecimalSeparator;
                else
                    this.ViewModel.SystolicBloodPressureText += character;
            }
        }


    }
}
