package com.aladdin.xsd;
// Generated Apr 30, 2010 4:50:19 PM by Hibernate Tools 3.2.4.GA



/**
 * QuestionnaireQuestionAnswer generated by hbm2java
 */
public class QuestionnaireQuestionAnswer  implements java.io.Serializable {


     private Integer id;
     private Integer value;
     private String description;
     private Integer question;
     private QuestionnaireQuestion m_QuestionnaireQuestion;

    public QuestionnaireQuestionAnswer() {
    }

    public QuestionnaireQuestionAnswer(Integer value, String description, Integer question, QuestionnaireQuestion m_QuestionnaireQuestion) {
       this.value = value;
       this.description = description;
       this.question = question;
       this.m_QuestionnaireQuestion = m_QuestionnaireQuestion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getValue() {
        return this.value;
    }
    
    public void setValue(Integer value) {
        this.value = value;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getQuestion() {
        return this.question;
    }
    
    public void setQuestion(Integer question) {
        this.question = question;
    }
    public QuestionnaireQuestion getM_QuestionnaireQuestion() {
        return this.m_QuestionnaireQuestion;
    }
    
    public void setM_QuestionnaireQuestion(QuestionnaireQuestion m_QuestionnaireQuestion) {
        this.m_QuestionnaireQuestion = m_QuestionnaireQuestion;
    }




}


