package com.aladdin.xsd;
// default package
// Generated Apr 23, 2010 2:52:40 PM by Hibernate Tools 3.2.4.GA



/**
 * Identifier generated by hbm2java
 */
public class Identifier  implements java.io.Serializable {


     private int id;
     private String Type;
     private String Number;
     private String IssueDate;
     private String IssueAuthority;
     private int persondata;
     private PersonData m_PersonData;

    public Identifier() {
    }

    public Identifier(String Type, String Number, String IssueDate, String IssueAuthority, int persondata, PersonData m_PersonData) {
       this.Type = Type;
       this.Number = Number;
       this.IssueDate = IssueDate;
       this.IssueAuthority = IssueAuthority;
       this.persondata = persondata;
       this.m_PersonData = m_PersonData;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return this.Type;
    }
    
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getNumber() {
        return this.Number;
    }
    
    public void setNumber(String Number) {
        this.Number = Number;
    }
    public String getIssueDate() {
        return this.IssueDate;
    }
    
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }
    public String getIssueAuthority() {
        return this.IssueAuthority;
    }
    
    public void setIssueAuthority(String IssueAuthority) {
        this.IssueAuthority = IssueAuthority;
    }
    public int getPersondata() {
        return this.persondata;
    }
    
    public void setPersondata(int persondata) {
        this.persondata = persondata;
    }
    public PersonData getM_PersonData() {
        return this.m_PersonData;
    }
    
    public void setM_PersonData(PersonData m_PersonData) {
        this.m_PersonData = m_PersonData;
    }




}


