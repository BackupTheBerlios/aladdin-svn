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
    /// Interaction logic for MeasureActivityPage.xaml
    /// </summary>
    public partial class MeasureActivityPage : UserControl
    {
        MeasureActivityViewModel ViewModel { get; set; }

        public MeasureActivityPage(aladdinService.Task activeTask)
        {
            this.ViewModel = new MeasureActivityViewModel(activeTask);
            this.DataContext = this.ViewModel; 
            
            InitializeComponent();
        }

        private void CommandBinding_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;
            if (AppCommands.ReadActivityDataCommand.Equals(e.Command))
            {
                this.AcquireText.Foreground = Brushes.Blue;
                //this.AcquireText.Text = "Connecting...";
                //Cursor = Cursors.Wait;                
                if (this.ViewModel.OmronConnect())
                {
                    Cursor = Cursors.Wait;

                    //this.AcquireText.Text = "Reading activity data...";
                    if (this.ViewModel.OmronReadData())
                    {
                        this.AcquireText.Foreground = Brushes.Green;
                        //this.AcquireText.Text = String.Format("{0} ({1} {2}). \n{3}", App.DataReadMsg, this.ViewModel.GetTotaleSteps(), App.StepsMsg, App.PressTheSendButtonMsg);
                        this.AcquireText.Text = String.Format("{0} ({1} {2}). \n{3}", App.DataReadMsg, this.ViewModel.GetTotaleSteps(), "steps", App.PressTheSendButtonMsg);
                    }
                    else
                    {
                        this.AcquireText.Foreground = Brushes.Red;
                        this.AcquireText.Text = App.ErrorReadingMsg;
                    }

                    Cursor = Cursors.Arrow;
                }
                else
                {
                    this.AcquireText.Foreground = Brushes.Red;
                    this.AcquireText.Text = App.DeviceNotFoundMsg;
                }
                //Cursor = Cursors.Arrow;
            }
            else if (AppCommands.SendMeasurementCommand.Equals(e.Command))
            {
                Cursor = Cursors.Wait;
                this.ViewModel.SendMeasurements();
                Cursor = Cursors.Arrow;
            }
        }

        private void CommandBinding_CanExecute(object sender, CanExecuteRoutedEventArgs e)
        {
            e.Handled = true;
            if (AppCommands.SendMeasurementCommand.Equals(e.Command))
                e.CanExecute = this.ViewModel.CanSendMeasurements();
            else
                e.CanExecute = true;
        }
    }
}
