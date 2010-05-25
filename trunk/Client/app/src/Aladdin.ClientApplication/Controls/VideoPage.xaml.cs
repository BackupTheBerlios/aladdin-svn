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
    /// Interaction logic for VideoPage.xaml
    /// </summary>
    public partial class VideoPage : UserControl
    {
        public VideoPage()
        {
            InitializeComponent();
        }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {
            string url = "<object style=\"height: 344px; width: 425px\"><param name=\"movie\" value=\"http://www.youtube.com/v/9Wv9jrk-gXc\"><param name=\"allowFullScreen\" value=\"true\"><param name=\"allowScriptAccess\" value=\"always\"><embed src=\"http://www.youtube.com/v/9Wv9jrk-gXc\" type=\"application/x-shockwave-flash\" allowfullscreen=\"true\" allowScriptAccess=\"always\" width=\"425\" height=\"344\"></object>";
            MyPlayer.Play(url);
        }

        private void UserControl_Unloaded(object sender, RoutedEventArgs e)
        {
            MyPlayer.Stop();
        }
    }
}
