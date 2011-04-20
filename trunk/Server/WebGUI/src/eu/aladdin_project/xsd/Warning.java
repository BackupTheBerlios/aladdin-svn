/**
 * Warning.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class Warning  implements java.io.Serializable {
    private java.lang.String ID;

    private eu.aladdin_project.xsd.SystemParameter typeOfWarning;

    private java.util.Calendar dateTimeOfWarning;

    private eu.aladdin_project.xsd.SystemParameter effect;

    private eu.aladdin_project.xsd.SystemParameter indicator;

    private eu.aladdin_project.xsd.SystemParameter riskLevel;

    private java.lang.String justificationText;

    private eu.aladdin_project.xsd.SystemParameter emergencyLevel;

    private eu.aladdin_project.xsd.Patient patient;

    private java.lang.Boolean delivered;

    public Warning() {
    }

    public Warning(
           java.lang.String ID,
           eu.aladdin_project.xsd.SystemParameter typeOfWarning,
           java.util.Calendar dateTimeOfWarning,
           eu.aladdin_project.xsd.SystemParameter effect,
           eu.aladdin_project.xsd.SystemParameter indicator,
           eu.aladdin_project.xsd.SystemParameter riskLevel,
           java.lang.String justificationText,
           eu.aladdin_project.xsd.SystemParameter emergencyLevel,
           eu.aladdin_project.xsd.Patient patient,
           java.lang.Boolean delivered) {
           this.ID = ID;
           this.typeOfWarning = typeOfWarning;
           this.dateTimeOfWarning = dateTimeOfWarning;
           this.effect = effect;
           this.indicator = indicator;
           this.riskLevel = riskLevel;
           this.justificationText = justificationText;
           this.emergencyLevel = emergencyLevel;
           this.patient = patient;
           this.delivered = delivered;
    }


    /**
     * Gets the ID value for this Warning.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Warning.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the typeOfWarning value for this Warning.
     * 
     * @return typeOfWarning
     */
    public eu.aladdin_project.xsd.SystemParameter getTypeOfWarning() {
        return typeOfWarning;
    }


    /**
     * Sets the typeOfWarning value for this Warning.
     * 
     * @param typeOfWarning
     */
    public void setTypeOfWarning(eu.aladdin_project.xsd.SystemParameter typeOfWarning) {
        this.typeOfWarning = typeOfWarning;
    }


    /**
     * Gets the dateTimeOfWarning value for this Warning.
     * 
     * @return dateTimeOfWarning
     */
    public java.util.Calendar getDateTimeOfWarning() {
        return dateTimeOfWarning;
    }


    /**
     * Sets the dateTimeOfWarning value for this Warning.
     * 
     * @param dateTimeOfWarning
     */
    public void setDateTimeOfWarning(java.util.Calendar dateTimeOfWarning) {
        this.dateTimeOfWarning = dateTimeOfWarning;
    }


    /**
     * Gets the effect value for this Warning.
     * 
     * @return effect
     */
    public eu.aladdin_project.xsd.SystemParameter getEffect() {
        return effect;
    }


    /**
     * Sets the effect value for this Warning.
     * 
     * @param effect
     */
    public void setEffect(eu.aladdin_project.xsd.SystemParameter effect) {
        this.effect = effect;
    }


    /**
     * Gets the indicator value for this Warning.
     * 
     * @return indicator
     */
    public eu.aladdin_project.xsd.SystemParameter getIndicator() {
        return indicator;
    }


    /**
     * Sets the indicator value for this Warning.
     * 
     * @param indicator
     */
    public void setIndicator(eu.aladdin_project.xsd.SystemParameter indicator) {
        this.indicator = indicator;
    }


    /**
     * Gets the riskLevel value for this Warning.
     * 
     * @return riskLevel
     */
    public eu.aladdin_project.xsd.SystemParameter getRiskLevel() {
        return riskLevel;
    }


    /**
     * Sets the riskLevel value for this Warning.
     * 
     * @param riskLevel
     */
    public void setRiskLevel(eu.aladdin_project.xsd.SystemParameter riskLevel) {
        this.riskLevel = riskLevel;
    }


    /**
     * Gets the justificationText value for this Warning.
     * 
     * @return justificationText
     */
    public java.lang.String getJustificationText() {
        return justificationText;
    }


    /**
     * Sets the justificationText value for this Warning.
     * 
     * @param justificationText
     */
    public void setJustificationText(java.lang.String justificationText) {
        this.justificationText = justificationText;
    }


    /**
     * Gets the emergencyLevel value for this Warning.
     * 
     * @return emergencyLevel
     */
    public eu.aladdin_project.xsd.SystemParameter getEmergencyLevel() {
        return emergencyLevel;
    }


    /**
     * Sets the emergencyLevel value for this Warning.
     * 
     * @param emergencyLevel
     */
    public void setEmergencyLevel(eu.aladdin_project.xsd.SystemParameter emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }


    /**
     * Gets the patientID value for this Warning.
     * 
     * @return patientID
     */
    public eu.aladdin_project.xsd.Patient getPatient() {
        return patient;
    }


    /**
     * Sets the patientID value for this Warning.
     * 
     * @param patientID
     */
    public void setPatient(eu.aladdin_project.xsd.Patient patient) {
        this.patient = patient;
    }


    /**
     * Gets the delivered value for this Warning.
     * 
     * @return delivered
     */
    public java.lang.Boolean getDelivered() {
        return delivered;
    }


    /**
     * Sets the delivered value for this Warning.
     * 
     * @param delivered
     */
    public void setDelivered(java.lang.Boolean delivered) {
        this.delivered = delivered;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Warning)) return false;
        Warning other = (Warning) obj;
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
            ((this.typeOfWarning==null && other.getTypeOfWarning()==null) || 
             (this.typeOfWarning!=null &&
              this.typeOfWarning.equals(other.getTypeOfWarning()))) &&
            ((this.dateTimeOfWarning==null && other.getDateTimeOfWarning()==null) || 
             (this.dateTimeOfWarning!=null &&
              this.dateTimeOfWarning.equals(other.getDateTimeOfWarning()))) &&
            ((this.effect==null && other.getEffect()==null) || 
             (this.effect!=null &&
              this.effect.equals(other.getEffect()))) &&
            ((this.indicator==null && other.getIndicator()==null) || 
             (this.indicator!=null &&
              this.indicator.equals(other.getIndicator()))) &&
            ((this.riskLevel==null && other.getRiskLevel()==null) || 
             (this.riskLevel!=null &&
              this.riskLevel.equals(other.getRiskLevel()))) &&
            ((this.justificationText==null && other.getJustificationText()==null) || 
             (this.justificationText!=null &&
              this.justificationText.equals(other.getJustificationText()))) &&
            ((this.emergencyLevel==null && other.getEmergencyLevel()==null) || 
             (this.emergencyLevel!=null &&
              this.emergencyLevel.equals(other.getEmergencyLevel()))) &&
            ((this.patient==null && other.getPatient()==null) || 
             (this.patient!=null &&
              this.patient.equals(other.getPatient()))) &&
            ((this.delivered==null && other.getDelivered()==null) || 
             (this.delivered!=null &&
              this.delivered.equals(other.getDelivered())));
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
        if (getTypeOfWarning() != null) {
            _hashCode += getTypeOfWarning().hashCode();
        }
        if (getDateTimeOfWarning() != null) {
            _hashCode += getDateTimeOfWarning().hashCode();
        }
        if (getEffect() != null) {
            _hashCode += getEffect().hashCode();
        }
        if (getIndicator() != null) {
            _hashCode += getIndicator().hashCode();
        }
        if (getRiskLevel() != null) {
            _hashCode += getRiskLevel().hashCode();
        }
        if (getJustificationText() != null) {
            _hashCode += getJustificationText().hashCode();
        }
        if (getEmergencyLevel() != null) {
            _hashCode += getEmergencyLevel().hashCode();
        }
        if (getPatient() != null) {
            _hashCode += getPatient().hashCode();
        }
        if (getDelivered() != null) {
            _hashCode += getDelivered().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Warning.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Warning"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TypeOfWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeOfWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateTimeOfWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Effect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "RiskLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificationText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "JustificationText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emergencyLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "EmergencyLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Patient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Patient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Delivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
