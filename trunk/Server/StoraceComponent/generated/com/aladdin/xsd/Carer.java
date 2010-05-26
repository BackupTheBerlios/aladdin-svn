package com.aladdin.xsd;
// Generated May 26, 2010 2:15:07 PM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Carer generated by hbm2java
 */
public class Carer  implements java.io.Serializable {


     private Integer id;
     private Integer persondata;
     private Integer sd;
     private PersonData m_PersonDatapersondata;
     private SocioDemographicData m_SocioDemographicDatasd;
     private Set Notes = new HashSet(0);
     private Set CarerAssessments1 = new HashSet(0);
     private Set PatientCarers11 = new HashSet(0);

    public Carer() {
    }

    public Carer(Integer persondata, Integer sd, PersonData m_PersonDatapersondata, SocioDemographicData m_SocioDemographicDatasd, Set Notes, Set CarerAssessments1, Set PatientCarers11) {
       this.persondata = persondata;
       this.sd = sd;
       this.m_PersonDatapersondata = m_PersonDatapersondata;
       this.m_SocioDemographicDatasd = m_SocioDemographicDatasd;
       this.Notes = Notes;
       this.CarerAssessments1 = CarerAssessments1;
       this.PatientCarers11 = PatientCarers11;
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
    public PersonData getM_PersonDatapersondata() {
        return this.m_PersonDatapersondata;
    }
    
    public void setM_PersonDatapersondata(PersonData m_PersonDatapersondata) {
        this.m_PersonDatapersondata = m_PersonDatapersondata;
    }
    public SocioDemographicData getM_SocioDemographicDatasd() {
        return this.m_SocioDemographicDatasd;
    }
    
    public void setM_SocioDemographicDatasd(SocioDemographicData m_SocioDemographicDatasd) {
        this.m_SocioDemographicDatasd = m_SocioDemographicDatasd;
    }
    public Set getNotes() {
        return this.Notes;
    }
    
    public void setNotes(Set Notes) {
        this.Notes = Notes;
    }
    public Set getCarerAssessments1() {
        return this.CarerAssessments1;
    }
    
    public void setCarerAssessments1(Set CarerAssessments1) {
        this.CarerAssessments1 = CarerAssessments1;
    }
    public Set getPatientCarers11() {
        return this.PatientCarers11;
    }
    
    public void setPatientCarers11(Set PatientCarers11) {
        this.PatientCarers11 = PatientCarers11;
    }




}


