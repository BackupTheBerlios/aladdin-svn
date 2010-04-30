package com.aladdin.xsd;
// Generated Apr 30, 2010 4:50:19 PM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Carer generated by hbm2java
 */
public class Carer  implements java.io.Serializable {


     private Integer id;
     private Integer persondata;
     private Integer sd;
     private PersonData m_PersonData;
     private SocioDemographicData m_SocioDemographicData;
     private Set CarerAssessments = new HashSet(0);
     private Set PatientCarers = new HashSet(0);

    public Carer() {
    }

    public Carer(Integer persondata, Integer sd, PersonData m_PersonData, SocioDemographicData m_SocioDemographicData, Set CarerAssessments, Set PatientCarers) {
       this.persondata = persondata;
       this.sd = sd;
       this.m_PersonData = m_PersonData;
       this.m_SocioDemographicData = m_SocioDemographicData;
       this.CarerAssessments = CarerAssessments;
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
    public Set getCarerAssessments() {
        return this.CarerAssessments;
    }
    
    public void setCarerAssessments(Set CarerAssessments) {
        this.CarerAssessments = CarerAssessments;
    }
    public Set getPatientCarers() {
        return this.PatientCarers;
    }
    
    public void setPatientCarers(Set PatientCarers) {
        this.PatientCarers = PatientCarers;
    }




}


