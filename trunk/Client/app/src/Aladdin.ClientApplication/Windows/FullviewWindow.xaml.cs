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

namespace Aladdin.ClientApplication.Windows
{
    /// <summary>
    /// Interaction logic for FullviewWindow.xaml
    /// </summary>
    public partial class FullviewWindow : Window
    {
        public string Url { get; set; }

        public FullviewWindow(string url)
        {
            this.Url = url;
            InitializeComponent();
        }

        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            Cursor = Cursors.Wait;

            try
            {
                Uri uri = new Uri(Url);
                if (uri != null)
                    this.WebBrowser.Source = uri;
            }
            catch (Exception) { }

            Cursor = Cursors.Arrow;
        }

        private void Window_Closed(object sender, EventArgs e)
        {
            this.WebBrowser.Navigate(null);
        }
    }
}
