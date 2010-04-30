package com.aladdin.xsd;
// Generated Apr 30, 2010 4:50:19 PM by Hibernate Tools 3.2.4.GA



/**
 * Rights generated by hbm2java
 */
public class Rights  implements java.io.Serializable {


     private Integer id;
     private Integer srv;
     private Integer usr;
     private Service m_Service;
     private Users m_Users;

    public Rights() {
    }

    public Rights(Integer srv, Integer usr, Service m_Service, Users m_Users) {
       this.srv = srv;
       this.usr = usr;
       this.m_Service = m_Service;
       this.m_Users = m_Users;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getSrv() {
        return this.srv;
    }
    
    public void setSrv(Integer srv) {
        this.srv = srv;
    }
    public Integer getUsr() {
        return this.usr;
    }
    
    public void setUsr(Integer usr) {
        this.usr = usr;
    }
    public Service getM_Service() {
        return this.m_Service;
    }
    
    public void setM_Service(Service m_Service) {
        this.m_Service = m_Service;
    }
    public Users getM_Users() {
        return this.m_Users;
    }
    
    public void setM_Users(Users m_Users) {
        this.m_Users = m_Users;
    }




}


