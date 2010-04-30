package com.aladdin.xsd;
// Generated Apr 30, 2010 4:50:19 PM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * QuestionnaireQuestion generated by hbm2java
 */
public class QuestionnaireQuestion  implements java.io.Serializable {


     private Integer id;
     private String type;
     private Boolean isPrimary;
     private Boolean subquetsions;
     private Integer parentid;
     private String title;
     private Integer quest;
     private QuestionnaireQuestion m_QuestionnaireQuestion;
     private Questionnaire m_Questionnaire;
     private Set QuestionnaireQuestionAnswers = new HashSet(0);
     private Set QuestionnaireAnswers = new HashSet(0);

    public QuestionnaireQuestion() {
    }

    public QuestionnaireQuestion(String type, Boolean isPrimary, Boolean subquetsions, Integer parentid, String title, Integer quest, QuestionnaireQuestion m_QuestionnaireQuestion, Questionnaire m_Questionnaire, Set QuestionnaireQuestionAnswers, Set QuestionnaireAnswers) {
       this.type = type;
       this.isPrimary = isPrimary;
       this.subquetsions = subquetsions;
       this.parentid = parentid;
       this.title = title;
       this.quest = quest;
       this.m_QuestionnaireQuestion = m_QuestionnaireQuestion;
       this.m_Questionnaire = m_Questionnaire;
       this.QuestionnaireQuestionAnswers = QuestionnaireQuestionAnswers;
       this.QuestionnaireAnswers = QuestionnaireAnswers;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Boolean getIsPrimary() {
        return this.isPrimary;
    }
    
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }
    public Boolean getSubquetsions() {
        return this.subquetsions;
    }
    
    public void setSubquetsions(Boolean subquetsions) {
        this.subquetsions = subquetsions;
    }
    public Integer getParentid() {
        return this.parentid;
    }
    
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getQuest() {
        return this.quest;
    }
    
    public void setQuest(Integer quest) {
        this.quest = quest;
    }
    public QuestionnaireQuestion getM_QuestionnaireQuestion() {
        return this.m_QuestionnaireQuestion;
    }
    
    public void setM_QuestionnaireQuestion(QuestionnaireQuestion m_QuestionnaireQuestion) {
        this.m_QuestionnaireQuestion = m_QuestionnaireQuestion;
    }
    public Questionnaire getM_Questionnaire() {
        return this.m_Questionnaire;
    }
    
    public void setM_Questionnaire(Questionnaire m_Questionnaire) {
        this.m_Questionnaire = m_Questionnaire;
    }
    public Set getQuestionnaireQuestionAnswers() {
        return this.QuestionnaireQuestionAnswers;
    }
    
    public void setQuestionnaireQuestionAnswers(Set QuestionnaireQuestionAnswers) {
        this.QuestionnaireQuestionAnswers = QuestionnaireQuestionAnswers;
    }
    public Set getQuestionnaireAnswers() {
        return this.QuestionnaireAnswers;
    }
    
    public void setQuestionnaireAnswers(Set QuestionnaireAnswers) {
        this.QuestionnaireAnswers = QuestionnaireAnswers;
    }




}


