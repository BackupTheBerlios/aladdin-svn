package com.aladdin.xsd;
// Generated Apr 26, 2010 11:04:41 PM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * TaskStatusT generated by hbm2java
 */
public class TaskStatusT  implements java.io.Serializable {


     private Integer id;
     private Integer Code;
     private String Description;
     private Set Tasks = new HashSet(0);

    public TaskStatusT() {
    }

    public TaskStatusT(Integer Code, String Description, Set Tasks) {
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
    public Integer getCode() {
        return this.Code;
    }
    
    public void setCode(Integer Code) {
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


