/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class Task  implements java.io.Serializable {
    private java.lang.String ID;

    private eu.aladdin_project.xsd.SystemParameter taskType;

    private java.util.Calendar dateTimeAssigned;

    private java.util.Calendar dateTimeFulfilled;

    private eu.aladdin_project.xsd.SystemParameter taskStatus;

    private java.lang.String URL;

    private java.lang.String text;

    private eu.aladdin_project.xsd.Questionnaire questionnaire;

    private java.lang.String executorID;

    private java.lang.String assignerID;

    private java.lang.String objectID;

    public Task() {
    }

    public Task(
           java.lang.String ID,
           eu.aladdin_project.xsd.SystemParameter taskType,
           java.util.Calendar dateTimeAssigned,
           java.util.Calendar dateTimeFulfilled,
           eu.aladdin_project.xsd.SystemParameter taskStatus,
           java.lang.String URL,
           java.lang.String text,
           eu.aladdin_project.xsd.Questionnaire questionnaire,
           java.lang.String executorID,
           java.lang.String assignerID,
           java.lang.String objectID) {
           this.ID = ID;
           this.taskType = taskType;
           this.dateTimeAssigned = dateTimeAssigned;
           this.dateTimeFulfilled = dateTimeFulfilled;
           this.taskStatus = taskStatus;
           this.URL = URL;
           this.text = text;
           this.questionnaire = questionnaire;
           this.executorID = executorID;
           this.assignerID = assignerID;
           this.objectID = objectID;
    }


    /**
     * Gets the ID value for this Task.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Task.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the taskType value for this Task.
     * 
     * @return taskType
     */
    public eu.aladdin_project.xsd.SystemParameter getTaskType() {
        return taskType;
    }


    /**
     * Sets the taskType value for this Task.
     * 
     * @param taskType
     */
    public void setTaskType(eu.aladdin_project.xsd.SystemParameter taskType) {
        this.taskType = taskType;
    }


    /**
     * Gets the dateTimeAssigned value for this Task.
     * 
     * @return dateTimeAssigned
     */
    public java.util.Calendar getDateTimeAssigned() {
        return dateTimeAssigned;
    }


    /**
     * Sets the dateTimeAssigned value for this Task.
     * 
     * @param dateTimeAssigned
     */
    public void setDateTimeAssigned(java.util.Calendar dateTimeAssigned) {
        this.dateTimeAssigned = dateTimeAssigned;
    }


    /**
     * Gets the dateTimeFulfilled value for this Task.
     * 
     * @return dateTimeFulfilled
     */
    public java.util.Calendar getDateTimeFulfilled() {
        return dateTimeFulfilled;
    }


    /**
     * Sets the dateTimeFulfilled value for this Task.
     * 
     * @param dateTimeFulfilled
     */
    public void setDateTimeFulfilled(java.util.Calendar dateTimeFulfilled) {
        this.dateTimeFulfilled = dateTimeFulfilled;
    }


    /**
     * Gets the taskStatus value for this Task.
     * 
     * @return taskStatus
     */
    public eu.aladdin_project.xsd.SystemParameter getTaskStatus() {
        return taskStatus;
    }


    /**
     * Sets the taskStatus value for this Task.
     * 
     * @param taskStatus
     */
    public void setTaskStatus(eu.aladdin_project.xsd.SystemParameter taskStatus) {
        this.taskStatus = taskStatus;
    }


    /**
     * Gets the URL value for this Task.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this Task.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the text value for this Task.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Task.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the questionnaire value for this Task.
     * 
     * @return questionnaire
     */
    public eu.aladdin_project.xsd.Questionnaire getQuestionnaire() {
        return questionnaire;
    }


    /**
     * Sets the questionnaire value for this Task.
     * 
     * @param questionnaire
     */
    public void setQuestionnaire(eu.aladdin_project.xsd.Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }


    /**
     * Gets the executorID value for this Task.
     * 
     * @return executorID
     */
    public java.lang.String getExecutorID() {
        return executorID;
    }


    /**
     * Sets the executorID value for this Task.
     * 
     * @param executorID
     */
    public void setExecutorID(java.lang.String executorID) {
        this.executorID = executorID;
    }


    /**
     * Gets the assignerID value for this Task.
     * 
     * @return assignerID
     */
    public java.lang.String getAssignerID() {
        return assignerID;
    }


    /**
     * Sets the assignerID value for this Task.
     * 
     * @param assignerID
     */
    public void setAssignerID(java.lang.String assignerID) {
        this.assignerID = assignerID;
    }


    /**
     * Gets the objectID value for this Task.
     * 
     * @return objectID
     */
    public java.lang.String getObjectID() {
        return objectID;
    }


    /**
     * Sets the objectID value for this Task.
     * 
     * @param objectID
     */
    public void setObjectID(java.lang.String objectID) {
        this.objectID = objectID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.taskType==null && other.getTaskType()==null) || 
             (this.taskType!=null &&
              this.taskType.equals(other.getTaskType()))) &&
            ((this.dateTimeAssigned==null && other.getDateTimeAssigned()==null) || 
             (this.dateTimeAssigned!=null &&
              this.dateTimeAssigned.equals(other.getDateTimeAssigned()))) &&
            ((this.dateTimeFulfilled==null && other.getDateTimeFulfilled()==null) || 
             (this.dateTimeFulfilled!=null &&
              this.dateTimeFulfilled.equals(other.getDateTimeFulfilled()))) &&
            ((this.taskStatus==null && other.getTaskStatus()==null) || 
             (this.taskStatus!=null &&
              this.taskStatus.equals(other.getTaskStatus()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.questionnaire==null && other.getQuestionnaire()==null) || 
             (this.questionnaire!=null &&
              this.questionnaire.equals(other.getQuestionnaire()))) &&
            ((this.executorID==null && other.getExecutorID()==null) || 
             (this.executorID!=null &&
              this.executorID.equals(other.getExecutorID()))) &&
            ((this.assignerID==null && other.getAssignerID()==null) || 
             (this.assignerID!=null &&
              this.assignerID.equals(other.getAssignerID()))) &&
            ((this.objectID==null && other.getObjectID()==null) || 
             (this.objectID!=null &&
              this.objectID.equals(other.getObjectID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getTaskType() != null) {
            _hashCode += getTaskType().hashCode();
        }
        if (getDateTimeAssigned() != null) {
            _hashCode += getDateTimeAssigned().hashCode();
        }
        if (getDateTimeFulfilled() != null) {
            _hashCode += getDateTimeFulfilled().hashCode();
        }
        if (getTaskStatus() != null) {
            _hashCode += getTaskStatus().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getQuestionnaire() != null) {
            _hashCode += getQuestionnaire().hashCode();
        }
        if (getExecutorID() != null) {
            _hashCode += getExecutorID().hashCode();
        }
        if (getAssignerID() != null) {
            _hashCode += getAssignerID().hashCode();
        }
        if (getObjectID() != null) {
            _hashCode += getObjectID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Task"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TaskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeAssigned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateTimeAssigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateTimeFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TaskStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionnaire");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Questionnaire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Questionnaire"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ExecutorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "AssignerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ObjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
