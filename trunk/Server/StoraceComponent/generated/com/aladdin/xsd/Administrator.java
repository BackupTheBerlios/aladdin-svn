package com.aladdin.xsd;
// Generated May 26, 2010 2:15:07 PM by Hibernate Tools 3.2.4.GA



/**
 * Administrator generated by hbm2java
 */
public class Administrator  implements java.io.Serializable {


     private Integer id;
     private Integer personData;
     private PersonData m_PersonDatapersonData;

    public Administrator() {
    }

    public Administrator(Integer personData, PersonData m_PersonDatapersonData) {
       this.personData = personData;
       this.m_PersonDatapersonData = m_PersonDatapersonData;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPersonData() {
        return this.personData;
    }
    
    public void setPersonData(Integer personData) {
        this.personData = personData;
    }
    public PersonData getM_PersonDatapersonData() {
        return this.m_PersonDatapersonData;
    }
    
    public void setM_PersonDatapersonData(PersonData m_PersonDatapersonData) {
        this.m_PersonDatapersonData = m_PersonDatapersonData;
    }




}


