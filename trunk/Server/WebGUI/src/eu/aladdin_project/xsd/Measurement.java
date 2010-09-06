/**
 * Measurement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class Measurement  implements java.io.Serializable {
    private eu.aladdin_project.xsd.SystemParameter type;

    private double value;

    private java.util.Calendar dateTime;

    private java.lang.String units;

    private java.lang.Double lowerLimit;

    private java.lang.Double upperLimit;

    private java.lang.String patientID;

    private java.lang.String taskID;

    public Measurement() {
    }

    public Measurement(
           eu.aladdin_project.xsd.SystemParameter type,
           double value,
           java.util.Calendar dateTime,
           java.lang.String units,
           java.lang.Double lowerLimit,
           java.lang.Double upperLimit,
           java.lang.String patientID,
           java.lang.String taskID) {
           this.type = type;
           this.value = value;
           this.dateTime = dateTime;
           this.units = units;
           this.lowerLimit = lowerLimit;
           this.upperLimit = upperLimit;
           this.patientID = patientID;
           this.taskID = taskID;
    }


    /**
     * Gets the type value for this Measurement.
     * 
     * @return type
     */
    public eu.aladdin_project.xsd.SystemParameter getType() {
        return type;
    }


    /**
     * Sets the type value for this Measurement.
     * 
     * @param type
     */
    public void setType(eu.aladdin_project.xsd.SystemParameter type) {
        this.type = type;
    }


    /**
     * Gets the value value for this Measurement.
     * 
     * @return value
     */
    public double getValue() {
        return value;
    }


    /**
     * Sets the value value for this Measurement.
     * 
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }


    /**
     * Gets the dateTime value for this Measurement.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this Measurement.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the units value for this Measurement.
     * 
     * @return units
     */
    public java.lang.String getUnits() {
        return units;
    }


    /**
     * Sets the units value for this Measurement.
     * 
     * @param units
     */
    public void setUnits(java.lang.String units) {
        this.units = units;
    }


    /**
     * Gets the lowerLimit value for this Measurement.
     * 
     * @return lowerLimit
     */
    public java.lang.Double getLowerLimit() {
        return lowerLimit;
    }


    /**
     * Sets the lowerLimit value for this Measurement.
     * 
     * @param lowerLimit
     */
    public void setLowerLimit(java.lang.Double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }


    /**
     * Gets the upperLimit value for this Measurement.
     * 
     * @return upperLimit
     */
    public java.lang.Double getUpperLimit() {
        return upperLimit;
    }


    /**
     * Sets the upperLimit value for this Measurement.
     * 
     * @param upperLimit
     */
    public void setUpperLimit(java.lang.Double upperLimit) {
        this.upperLimit = upperLimit;
    }


    /**
     * Gets the patientID value for this Measurement.
     * 
     * @return patientID
     */
    public java.lang.String getPatientID() {
        return patientID;
    }


    /**
     * Sets the patientID value for this Measurement.
     * 
     * @param patientID
     */
    public void setPatientID(java.lang.String patientID) {
        this.patientID = patientID;
    }


    /**
     * Gets the taskID value for this Measurement.
     * 
     * @return taskID
     */
    public java.lang.String getTaskID() {
        return taskID;
    }


    /**
     * Sets the taskID value for this Measurement.
     * 
     * @param taskID
     */
    public void setTaskID(java.lang.String taskID) {
        this.taskID = taskID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Measurement)) return false;
        Measurement other = (Measurement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.value == other.getValue() &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.lowerLimit==null && other.getLowerLimit()==null) || 
             (this.lowerLimit!=null &&
              this.lowerLimit.equals(other.getLowerLimit()))) &&
            ((this.upperLimit==null && other.getUpperLimit()==null) || 
             (this.upperLimit!=null &&
              this.upperLimit.equals(other.getUpperLimit()))) &&
            ((this.patientID==null && other.getPatientID()==null) || 
             (this.patientID!=null &&
              this.patientID.equals(other.getPatientID()))) &&
            ((this.taskID==null && other.getTaskID()==null) || 
             (this.taskID!=null &&
              this.taskID.equals(other.getTaskID())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Double(getValue()).hashCode();
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getLowerLimit() != null) {
            _hashCode += getLowerLimit().hashCode();
        }
        if (getUpperLimit() != null) {
            _hashCode += getUpperLimit().hashCode();
        }
        if (getPatientID() != null) {
            _hashCode += getPatientID().hashCode();
        }
        if (getTaskID() != null) {
            _hashCode += getTaskID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Measurement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Measurement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowerLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "LowerLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "UpperLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TaskID"));
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
