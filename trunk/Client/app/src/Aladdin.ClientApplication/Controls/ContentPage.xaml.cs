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
    /// Interaction logic for ContentPage.xaml
    /// </summary>
    public partial class ContentPage : UserControl
    {
        ContentPageViewModel ViewModel { get; set; }

        public string Url { get; set; }

        public string Text { get; set; }

        public string Title { get; set; }

        public string Category { get; set; }

        public ContentPage(aladdinService.MediaContent content)
        {
            this.ViewModel = new ContentPageViewModel(content);
            this.Category = 
            this.Url = this.ViewModel.Url;
            this.Text = this.ViewModel.Text;
            this.Title = this.ViewModel.Title;
            this.Category = this.ViewModel.Category;
            this.DataContext = this.ViewModel;
            InitializeComponent();

            if (string.IsNullOrEmpty(this.Url))
            {
                //this.WebPageExpander.IsExpanded = false;
                this.WebPageExpander.Visibility = Visibility.Hidden;
                this.WebPageExpander.Height = 0;
                //this.WebPageStack.Visibility = Visibility.Hidden;
                //this.WebPageStack.Height = 0;
            }
            if (string.IsNullOrEmpty(this.Text))
            {
                //this.TextExpander.IsExpanded = false;
                this.WebBrowser.MinHeight = 450;
                this.TextExpander.Visibility = Visibility.Hidden;
                this.TextExpander.Height = 0;
                //this.TextStack.Visibility = Visibility.Hidden;
                //this.TextStack.Height = 0;
            }
        }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
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

        private void UserControl_Unloaded(object sender, RoutedEventArgs e)
        {
            this.WebBrowser.Navigate(null);
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            AppCommands.MoveToPageCommand.Execute(this.Category, null);
        }

        private void FullView_Click(object sender, RoutedEventArgs e)
        {
            FullviewWindow fullviewWindow = new FullviewWindow(this.Url);
            this.WebBrowser.Navigate(null);
            if (fullviewWindow.ShowDialog() == false)
                this.WebBrowser.Navigate(new Uri(Url));            
        }
    }
}