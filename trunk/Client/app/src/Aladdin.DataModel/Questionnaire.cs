using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;
using System.IO;

namespace Aladdin.DataModel
{
    [System.Serializable()]
    [XmlType(AnonymousType = true)]
    [XmlRoot(ElementName = "questionnaire", Namespace = "", IsNullable = false)]
    public partial class Questionnaire
    {
        [XmlElement("question")]
        public QuestionnaireQuestion[] Questions { get; set; }
        
        [XmlAttribute(AttributeName = "version")]
        public string Version { get; set; }

        public static Questionnaire FromFile(string filename)
        {
            XmlSerializer ser = new XmlSerializer(typeof(Questionnaire));
            Questionnaire q = null;
            using (Stream stream = new FileStream(filename, FileMode.Open, FileAccess.Read))
            {
                q = ser.Deserialize(stream) as Questionnaire;
            }
            return q;
        }
    }

    [System.Serializable()]
    [XmlType(AnonymousType = true)]
    public partial class QuestionnaireQuestion
    {
        [XmlAttribute(AttributeName = "id")]
        public string ID { get; set; }

        [XmlAttribute(AttributeName = "type")]
        public QuestionnaireQuestionAnswerType QuestionType { get; set; }

        [XmlAttribute(AttributeName = "condition")]
        public string Condition { get; set; }

        [XmlElement(ElementName = "title")]
        public string Title { get; set; }
        
        [XmlArrayItem("answer", IsNullable = false)]
        [XmlArray(ElementName = "answers")]
        public QuestionnaireQuestionAnswer[] Answers { get; set; }

        [XmlArrayItem("question", IsNullable = false)]
        [XmlArray(ElementName = "questions")]
        public List<QuestionnaireQuestion> Questions { get; set; }

        public QuestionnaireQuestion()
        {
            this.Answers = new QuestionnaireQuestionAnswer[0];
            this.Questions = new List<QuestionnaireQuestion>();
        }

        public QuestionnaireQuestion(string id, string title, QuestionnaireQuestionAnswerType type)
            : this()
        {
            this.ID = id;
            this.Title = title;
            this.QuestionType = type;
        }
    }

    [System.Serializable()]
    [XmlType(AnonymousType = true)]
    public partial class QuestionnaireQuestionAnswer
    {
        [XmlAttribute(AttributeName = "value")]
        public string Value { get; set; }

        [XmlText()]
        public string Answer { get; set; }
    }
}
