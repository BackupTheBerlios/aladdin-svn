package com.aladdin.sc.db;
// Generated Jun 17, 2010 2:46:26 PM by Hibernate Tools 3.2.4.GA


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
     private Integer condition;
     private QuestionnaireQuestion m_QuestionnaireQuestionparentid;
     private Questionnaire m_Questionnairequest;
     private Set QuestionnaireQuestionAnswers = new HashSet(0);
     private Set QuestionnaireAnswers1 = new HashSet(0);

    public QuestionnaireQuestion() {
    }

    public QuestionnaireQuestion(String type, Boolean isPrimary, Boolean subquetsions, Integer parentid, String title, Integer quest, Integer condition, QuestionnaireQuestion m_QuestionnaireQuestionparentid, Questionnaire m_Questionnairequest, Set QuestionnaireQuestionAnswers, Set QuestionnaireAnswers1) {
       this.type = type;
       this.isPrimary = isPrimary;
       this.subquetsions = subquetsions;
       this.parentid = parentid;
       this.title = title;
       this.quest = quest;
       this.condition = condition;
       this.m_QuestionnaireQuestionparentid = m_QuestionnaireQuestionparentid;
       this.m_Questionnairequest = m_Questionnairequest;
       this.QuestionnaireQuestionAnswers = QuestionnaireQuestionAnswers;
       this.QuestionnaireAnswers1 = QuestionnaireAnswers1;
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
    public Integer getCondition() {
        return this.condition;
    }
    
    public void setCondition(Integer condition) {
        this.condition = condition;
    }
    public QuestionnaireQuestion getM_QuestionnaireQuestionparentid() {
        return this.m_QuestionnaireQuestionparentid;
    }
    
    public void setM_QuestionnaireQuestionparentid(QuestionnaireQuestion m_QuestionnaireQuestionparentid) {
        this.m_QuestionnaireQuestionparentid = m_QuestionnaireQuestionparentid;
    }
    public Questionnaire getM_Questionnairequest() {
        return this.m_Questionnairequest;
    }
    
    public void setM_Questionnairequest(Questionnaire m_Questionnairequest) {
        this.m_Questionnairequest = m_Questionnairequest;
    }
    public Set getQuestionnaireQuestionAnswers() {
        return this.QuestionnaireQuestionAnswers;
    }
    
    public void setQuestionnaireQuestionAnswers(Set QuestionnaireQuestionAnswers) {
        this.QuestionnaireQuestionAnswers = QuestionnaireQuestionAnswers;
    }
    public Set getQuestionnaireAnswers1() {
        return this.QuestionnaireAnswers1;
    }
    
    public void setQuestionnaireAnswers1(Set QuestionnaireAnswers1) {
        this.QuestionnaireAnswers1 = QuestionnaireAnswers1;
    }




}


