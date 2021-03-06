﻿using System;
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
    /// Interaction logic for ExternalServicePage.xaml
    /// </summary>
    public partial class ExternalServicePage : UserControl
    {
        ExternalServicePageViewModel ViewModel { get; set; }

        public string Url { get; set; }

        public ExternalServicePage(aladdinService.Task activeTask)
        {
            this.ViewModel = new ExternalServicePageViewModel(activeTask);
            this.Url = this.ViewModel.Url;
            InitializeComponent();
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
            catch (Exception ex) { }

            Cursor = Cursors.Arrow;
        }

    }
}
