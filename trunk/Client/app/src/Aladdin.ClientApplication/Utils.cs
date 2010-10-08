using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Aladdin.DataModel;

namespace Aladdin.ClientApplication
{
    public class Utils
    {
        public static Questionnaire Convert(aladdinService.Questionnaire qFS) {

            Questionnaire q = new Questionnaire();
            q.Version = qFS.versionSpecified ? qFS.version.ToString() : "";
            List<QuestionnaireQuestion> qs = GetQuestions(qFS.question);
            q.Questions = qs.ToArray();
            return q;
        }

        public static aladdinService.QuestionnaireAnswers Convert(QuestionnaireAnswers answers)
        {
            aladdinService.QuestionnaireAnswers res = new aladdinService.QuestionnaireAnswers();
            List<aladdinService.QuestionnaireAnswer> list = new List<aladdinService.QuestionnaireAnswer>();

            foreach (QuestionnaireAnswer answer in answers.Answers)
            {
                aladdinService.QuestionnaireAnswer sAnswer = new aladdinService.QuestionnaireAnswer();
                sAnswer.questionID = answer.QuestionID;
                sAnswer.value = answer.Value;
                list.Add(sAnswer);
            }
            res.answer = list.ToArray();            
            return res;
        }

        static List<QuestionnaireQuestion> GetQuestions(aladdinService.QuestionnaireQuestion[] questions)
        {
            List<QuestionnaireQuestion> qs = new List<QuestionnaireQuestion>();

            if (questions != null)
            {
                foreach (var qqFS in questions.OrderBy(q=>q.id))
                {
                    QuestionnaireQuestionAnswerType answerType = (QuestionnaireQuestionAnswerType)Enum.Parse(typeof(QuestionnaireQuestionAnswerType), qqFS.type);
                    QuestionnaireQuestion qq = new QuestionnaireQuestion(qqFS.id, qqFS.title, answerType);
                    List<QuestionnaireQuestionAnswer> answers = new List<QuestionnaireQuestionAnswer>();

                    List<aladdinService.QuestionnaireQuestionAnswer> answersFS = new List<aladdinService.QuestionnaireQuestionAnswer>();
                    if (qqFS.answers.Count() == 2)
                        answersFS = qqFS.answers.OrderByDescending(a => a.value).ToList();
                    else
                        answersFS = qqFS.answers.OrderBy(a => a.value).ToList();

                    foreach (var aFS in answersFS)
                    {
                        var a = new QuestionnaireQuestionAnswer();
                        a.Answer = aFS.Value;
                        a.Value = aFS.value.ToString();
                        answers.Add(a);
                    }
                    qq.Answers = answers.ToArray();
                    qq.Condition = qqFS.condition.ToString();                    
                    qq.Questions = GetQuestions(qqFS.questions);
                    qq.FixChildrenParentID();
                    qs.Add(qq);
                }
            }

            return qs;
        }
    }
}
