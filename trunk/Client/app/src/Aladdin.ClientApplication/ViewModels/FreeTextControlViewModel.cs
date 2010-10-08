using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;
using Aladdin.DataModel;

namespace Aladdin.ClientApplication.ViewModels
{
    class FreeTextControlViewModel : INotifyPropertyChanged
    {
        #region INotifyPropertyChanged Members

        public event PropertyChangedEventHandler PropertyChanged;

        protected void SendPropertyChanged(string propertyName)
        {
            if (this.PropertyChanged != null)
                this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
        }

        #endregion

        public QuestionnaireWizard Wizard { get; set; }

        string _FreeText;
        public string FreeText
        {
            get { return _FreeText; }
            set
            {
                _FreeText = value;
                this.SendPropertyChanged("FreeText");
                this.Wizard.Answers.SetAnswer(this.Wizard.ActiveQuestion.ID, value);
                this.Wizard.OnQuestionAnswered();
            }
        }

        public FreeTextControlViewModel(QuestionnaireWizard wizard)
        {
            this.Wizard = wizard;
        }
    }
}
