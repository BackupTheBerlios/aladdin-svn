package com.aladdin.xsd;
// Generated Apr 26, 2010 11:04:41 PM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Patient generated by hbm2java
 */
public class Patient  implements java.io.Serializable {


     private Integer id;
     private Integer persondata;
     private Integer sd;
     private Integer clinician;
     private Set PatientAssessments = new HashSet(0);
     private PersonData m_PersonData;
     private SocioDemographicData m_SocioDemographicData;
     private Clinician m_Clinician;
     private Set PatientCarers = new HashSet(0);

    public Patient() {
    }

    public Patient(Integer persondata, Integer sd, Integer clinician, Set PatientAssessments, PersonData m_PersonData, SocioDemographicData m_SocioDemographicData, Clinician m_Clinician, Set PatientCarers) {
       this.persondata = persondata;
       this.sd = sd;
       this.clinician = clinician;
       this.PatientAssessments = PatientAssessments;
       this.m_PersonData = m_PersonData;
       this.m_SocioDemographicData = m_SocioDemographicData;
       this.m_Clinician = m_Clinician;
       this.PatientCarers = PatientCarers;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPersondata() {
        return this.persondata;
    }
    
    public void setPersondata(Integer persondata) {
        this.persondata = persondata;
    }
    public Integer getSd() {
        return this.sd;
    }
    
    public void setSd(Integer sd) {
        this.sd = sd;
    }
    public Integer getClinician() {
        return this.clinician;
    }
    
    public void setClinician(Integer clinician) {
        this.clinician = clinician;
    }
    public Set getPatientAssessments() {
        return this.PatientAssessments;
    }
    
    public void setPatientAssessments(Set PatientAssessments) {
        this.PatientAssessments = PatientAssessments;
    }
    public PersonData getM_PersonData() {
        return this.m_PersonData;
    }
    
    public void setM_PersonData(PersonData m_PersonData) {
        this.m_PersonData = m_PersonData;
    }
    public SocioDemographicData getM_SocioDemographicData() {
        return this.m_SocioDemographicData;
    }
    
    public void setM_SocioDemographicData(SocioDemographicData m_SocioDemographicData) {
        this.m_SocioDemographicData = m_SocioDemographicData;
    }
    public Clinician getM_Clinician() {
        return this.m_Clinician;
    }
    
    public void setM_Clinician(Clinician m_Clinician) {
        this.m_Clinician = m_Clinician;
    }
    public Set getPatientCarers() {
        return this.PatientCarers;
    }
    
    public void setPatientCarers(Set PatientCarers) {
        this.PatientCarers = PatientCarers;
    }




}


