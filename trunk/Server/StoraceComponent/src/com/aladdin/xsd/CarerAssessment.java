package com.aladdin.xsd;
// default package
// Generated Apr 23, 2010 2:52:40 PM by Hibernate Tools 3.2.4.GA


import java.sql.Timestamp;

/**
 * CarerAssessment generated by hbm2java
 */
public class CarerAssessment  implements java.io.Serializable {


     private int id;
     private int carer;
     private Timestamp DateOfAssessment;
     private String RelevantHealthProblem;
     private int SeverityOfBurden;
     private String EmotionalOrMentalDisorder;
     private String PsychoactiveDrugs;
     private int QualityOfLife;
     private Carer m_Carer;

    public CarerAssessment() {
    }

    public CarerAssessment(int carer, Timestamp DateOfAssessment, String RelevantHealthProblem, int SeverityOfBurden, String EmotionalOrMentalDisorder, String PsychoactiveDrugs, int QualityOfLife, Carer m_Carer) {
       this.carer = carer;
       this.DateOfAssessment = DateOfAssessment;
       this.RelevantHealthProblem = RelevantHealthProblem;
       this.SeverityOfBurden = SeverityOfBurden;
       this.EmotionalOrMentalDisorder = EmotionalOrMentalDisorder;
       this.PsychoactiveDrugs = PsychoactiveDrugs;
       this.QualityOfLife = QualityOfLife;
       this.m_Carer = m_Carer;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getCarer() {
        return this.carer;
    }
    
    public void setCarer(int carer) {
        this.carer = carer;
    }
    public Timestamp getDateOfAssessment() {
        return this.DateOfAssessment;
    }
    
    public void setDateOfAssessment(Timestamp DateOfAssessment) {
        this.DateOfAssessment = DateOfAssessment;
    }
    public String getRelevantHealthProblem() {
        return this.RelevantHealthProblem;
    }
    
    public void setRelevantHealthProblem(String RelevantHealthProblem) {
        this.RelevantHealthProblem = RelevantHealthProblem;
    }
    public int getSeverityOfBurden() {
        return this.SeverityOfBurden;
    }
    
    public void setSeverityOfBurden(int SeverityOfBurden) {
        this.SeverityOfBurden = SeverityOfBurden;
    }
    public String getEmotionalOrMentalDisorder() {
        return this.EmotionalOrMentalDisorder;
    }
    
    public void setEmotionalOrMentalDisorder(String EmotionalOrMentalDisorder) {
        this.EmotionalOrMentalDisorder = EmotionalOrMentalDisorder;
    }
    public String getPsychoactiveDrugs() {
        return this.PsychoactiveDrugs;
    }
    
    public void setPsychoactiveDrugs(String PsychoactiveDrugs) {
        this.PsychoactiveDrugs = PsychoactiveDrugs;
    }
    public int getQualityOfLife() {
        return this.QualityOfLife;
    }
    
    public void setQualityOfLife(int QualityOfLife) {
        this.QualityOfLife = QualityOfLife;
    }
    public Carer getM_Carer() {
        return this.m_Carer;
    }
    
    public void setM_Carer(Carer m_Carer) {
        this.m_Carer = m_Carer;
    }




}


