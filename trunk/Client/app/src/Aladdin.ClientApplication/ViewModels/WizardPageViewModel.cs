using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Aladdin.DataModel;
using System.ComponentModel;
using Aladdin.ClientApplication.Controls;
using System.Windows;

namespace Aladdin.ClientApplication.ViewModels
{
    class WizardPageViewModel : INotifyPropertyChanged
    {
        #region INotifyPropertyChanged Members

        public event PropertyChangedEventHandler PropertyChanged;

        protected void SendPropertyChanged(string propertyName)
        {
            if (this.PropertyChanged != null)
                this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
        }

        #endregion

        public Questionnaire Questionnaire { get; set; }

        public QuestionnaireAnswers QuestionnaireAnswers { get; set; }

        public QuestionnaireWizard QuestionnaireWizard { get; set; }

        string _QuestionNumber;
        public string QuestionNumber
        {
            get { return _QuestionNumber; }
            set
            {
                _QuestionNumber = value;
                this.SendPropertyChanged("QuestionNumber");
            }
        }

        string _QuestionTitle;
        public string QuestionTitle
        {
            get { return _QuestionTitle; }
            set
            {
                _QuestionTitle = value;
                this.SendPropertyChanged("QuestionTitle");
            }
        }

        object _ActiveQuestionnairePage;
        public object ActiveQuestionnairePage
        {
            get { return _ActiveQuestionnairePage; }
            set
            {
                _ActiveQuestionnairePage = value;
                this.SendPropertyChanged("ActiveQuestionnairePage");
            }
        }

        ChooseOneAnswerFrom2Control _ChooseOneAnswerFrom2Control;
        ChooseOneAnswerFrom2Control ChooseOneAnswerFrom2Control
        {
            get
            {
                if (_ChooseOneAnswerFrom2Control == null)
                    _ChooseOneAnswerFrom2Control = new ChooseOneAnswerFrom2Control(this.QuestionnaireWizard);
                return _ChooseOneAnswerFrom2Control;
            }
        }

        ChooseOneAnswerFromManyControl _ChooseOneAnswerFromManyControl;
        ChooseOneAnswerFromManyControl ChooseOneAnswerFromManyControl
        {
            get
            {
                if (_ChooseOneAnswerFromManyControl == null)
                    _ChooseOneAnswerFromManyControl = new ChooseOneAnswerFromManyControl(this.QuestionnaireWizard);
                return _ChooseOneAnswerFromManyControl;
            }
        }

        LastWizardPage _LastWizardPage;
        LastWizardPage LastWizardPage
        {
            get
            {
                if (_LastWizardPage == null)
                    _LastWizardPage = new LastWizardPage(this.QuestionnaireWizard);
                return _LastWizardPage;
            }
        }

        Visibility _QuestionSummaryVisibility;
        public Visibility QuestionSummaryVisibility
        {
            get { return _QuestionSummaryVisibility; }
            set
            {
                if (_QuestionSummaryVisibility != value)
                {
                    _QuestionSummaryVisibility = value;
                    this.SendPropertyChanged("QuestionSummaryVisibility");
                }
            }
        }

        public WizardPageViewModel()
        {
            this.Questionnaire = Questionnaire.FromFile(@"DailyQuestionnaire.xml");
            this.QuestionnaireAnswers = new QuestionnaireAnswers();
            this.QuestionnaireWizard = new QuestionnaireWizard(this.Questionnaire, this.QuestionnaireAnswers);
            this.QuestionnaireWizard.ActivePageChanged += new ClientApplication.QuestionnaireWizard.ActivePageChangedEventHandler(QuestionnaireWizard_ActivePageChanged);
            this.QuestionSummaryVisibility = Visibility.Visible;
            this.UpdateQuestionInfo();
        }

        void QuestionnaireWizard_ActivePageChanged()
        {
            this.UpdateQuestionInfo();
        }

        private void UpdateQuestionInfo()
        {
            if (this.QuestionnaireWizard.IsQuestionnaireFinished)
            {
                this.QuestionSummaryVisibility = Visibility.Hidden;
                this.ActiveQuestionnairePage = this.LastWizardPage;
            }
            else
            {
                this.QuestionSummaryVisibility = Visibility.Visible;
                this.QuestionNumber = string.Format("Question {0}", this.QuestionnaireWizard.ActiveQuestion.ID);
                this.QuestionTitle = this.QuestionnaireWizard.ActiveQuestion.Title;
                if (this.QuestionnaireWizard.ActiveQuestion.QuestionType == QuestionnaireQuestionAnswerType.OneAnswer)
                {
                    if (this.QuestionnaireWizard.ActiveQuestion.Answers.Length == 2)
                    {
                        this.ChooseOneAnswerFrom2Control.FillAnswers();
                        this.ActiveQuestionnairePage = this.ChooseOneAnswerFrom2Control;
                    }
                    else
                    {
                        this.ChooseOneAnswerFromManyControl.FillAnswers(this.QuestionnaireWizard.ActiveQuestion);
                        this.ActiveQuestionnairePage = this.ChooseOneAnswerFromManyControl;
                    }
                }
            }
        }

        internal void MoveBack()
        {
            if (this.CanMoveBack())
            {
                this.QuestionnaireWizard.MoveBack();
                this.UpdateQuestionInfo();
            }
        }

        internal void MoveNext()
        {
            if (this.CanMoveNext())
            {
                this.QuestionnaireWizard.MoveNext();
                this.UpdateQuestionInfo();
            }
        }

        internal bool CanMoveBack()
        {
            return this.QuestionnaireWizard.CanMoveBack();
        }

        internal bool CanMoveNext()
        {
            return this.QuestionnaireWizard.CanMoveNext();
        }

        internal void UploadQuestionnaire()
        {
            string xml = this.QuestionnaireAnswers.ToXml();
            //todo: upload xml to server
            MessageBox.Show(xml);
            AppCommands.MoveToPageCommand.Execute("MyTasksPage", null);
        }
    }
}
