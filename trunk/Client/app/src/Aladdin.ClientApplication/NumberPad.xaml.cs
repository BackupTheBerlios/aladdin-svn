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
using System.Windows.Shapes;

namespace Aladdin.ClientApplication.Controls
{
    public delegate void NumberPadPressedEventHandler(object sender, string character);

    public delegate void NumberPadClosedEventHandler(object sender);

    /// <summary>
    /// Interaction logic for NumberPad.xaml
    /// </summary>
    public partial class NumberPad : Window
    {
        public event NumberPadPressedEventHandler NumberPadPressed;
        public event NumberPadClosedEventHandler NumberPadClosed;


        public NumberPad()
        {
            InitializeComponent();
        }

        private void CommandBinding_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            e.Handled = true;
        }

        private void CommandBinding_CanExecute(object sender, CanExecuteRoutedEventArgs e)
        {
            e.Handled = true;
            e.CanExecute = true;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (this.NumberPadPressed != null)
                this.NumberPadPressed(this, ((e.OriginalSource as Button).Content as Label).Content as string);
        }

        private void Exit_Button_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
            if (this.NumberPadClosed != null)
                this.NumberPadClosed(this);
        }

        private void Undo_Click(object sender, RoutedEventArgs e)
        {
            if (this.NumberPadPressed != null)
                this.NumberPadPressed(this, "BACKSPACE");
        }

        private void Window_Closed(object sender, EventArgs e)
        {
            if (this.NumberPadClosed != null)
                this.NumberPadClosed(this);
        }

    }
}
