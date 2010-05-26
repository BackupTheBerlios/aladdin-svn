package com.aladdin.xsd;
// Generated May 26, 2010 2:15:07 PM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * TaskTypeT generated by hbm2java
 */
public class TaskTypeT  implements java.io.Serializable {


     private Integer id;
     private String Code;
     private String Description;
     private Set Tasks = new HashSet(0);

    public TaskTypeT() {
    }

    public TaskTypeT(String Code, String Description, Set Tasks) {
       this.Code = Code;
       this.Description = Description;
       this.Tasks = Tasks;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCode() {
        return this.Code;
    }
    
    public void setCode(String Code) {
        this.Code = Code;
    }
    public String getDescription() {
        return this.Description;
    }
    
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public Set getTasks() {
        return this.Tasks;
    }
    
    public void setTasks(Set Tasks) {
        this.Tasks = Tasks;
    }




}


