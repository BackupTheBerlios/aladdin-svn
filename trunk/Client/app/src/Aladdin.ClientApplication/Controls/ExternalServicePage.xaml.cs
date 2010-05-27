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
    /// Interaction logic for ExternalServicePage.xaml
    /// </summary>
    public partial class ExternalServicePage : UserControl
    {
        public ExternalServicePage()
        {
            InitializeComponent();
        }

        public string Url { get; set; }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {
            Uri uri = new Uri(Url);
            if (uri != null)
                this.WebBrowser.Source = uri;
        }
    }
}
