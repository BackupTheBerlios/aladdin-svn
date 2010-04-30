package com.aladdin.xsd;
// Generated Apr 30, 2010 4:50:19 PM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * PersonData generated by hbm2java
 */
public class PersonData  implements java.io.Serializable {


     private Integer id;
     private String Surname;
     private String Name;
     private Set Identifiers = new HashSet(0);
     private Set Addresss = new HashSet(0);
     private Set Communications = new HashSet(0);
     private Set Clinicians = new HashSet(0);
     private Set Carers = new HashSet(0);
     private Set Patients = new HashSet(0);

    public PersonData() {
    }

    public PersonData(String Surname, String Name, Set Identifiers, Set Addresss, Set Communications, Set Clinicians, Set Carers, Set Patients) {
       this.Surname = Surname;
       this.Name = Name;
       this.Identifiers = Identifiers;
       this.Addresss = Addresss;
       this.Communications = Communications;
       this.Clinicians = Clinicians;
       this.Carers = Carers;
       this.Patients = Patients;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSurname() {
        return this.Surname;
    }
    
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    public Set getIdentifiers() {
        return this.Identifiers;
    }
    
    public void setIdentifiers(Set Identifiers) {
        this.Identifiers = Identifiers;
    }
    public Set getAddresss() {
        return this.Addresss;
    }
    
    public void setAddresss(Set Addresss) {
        this.Addresss = Addresss;
    }
    public Set getCommunications() {
        return this.Communications;
    }
    
    public void setCommunications(Set Communications) {
        this.Communications = Communications;
    }
    public Set getClinicians() {
        return this.Clinicians;
    }
    
    public void setClinicians(Set Clinicians) {
        this.Clinicians = Clinicians;
    }
    public Set getCarers() {
        return this.Carers;
    }
    
    public void setCarers(Set Carers) {
        this.Carers = Carers;
    }
    public Set getPatients() {
        return this.Patients;
    }
    
    public void setPatients(Set Patients) {
        this.Patients = Patients;
    }




}


