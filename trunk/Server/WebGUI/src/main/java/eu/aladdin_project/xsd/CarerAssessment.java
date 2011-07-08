/**
 * CarerAssessment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class CarerAssessment  implements java.io.Serializable {
    private java.lang.String ID;

    private java.lang.String carerID;

    private java.lang.String clinicianID;

    private java.util.Calendar dateOfAssessment;

    private java.lang.String relevantHealthProblem;

    private org.apache.axis.types.UnsignedByte severityOfBurden;

    private java.lang.String emotionalOrMentalDisorders;

    private java.lang.String psychoactiveDrugs;

    private org.apache.axis.types.UnsignedByte qualityOfLife;

    public CarerAssessment() {
    }

    public CarerAssessment(
           java.lang.String ID,
           java.lang.String carerID,
           java.lang.String clinicianID,
           java.util.Calendar dateOfAssessment,
           java.lang.String relevantHealthProblem,
           org.apache.axis.types.UnsignedByte severityOfBurden,
           java.lang.String emotionalOrMentalDisorders,
           java.lang.String psychoactiveDrugs,
           org.apache.axis.types.UnsignedByte qualityOfLife) {
           this.ID = ID;
           this.carerID = carerID;
           this.clinicianID = clinicianID;
           this.dateOfAssessment = dateOfAssessment;
           this.relevantHealthProblem = relevantHealthProblem;
           this.severityOfBurden = severityOfBurden;
           this.emotionalOrMentalDisorders = emotionalOrMentalDisorders;
           this.psychoactiveDrugs = psychoactiveDrugs;
           this.qualityOfLife = qualityOfLife;
    }


    /**
     * Gets the ID value for this CarerAssessment.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this CarerAssessment.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the carerID value for this CarerAssessment.
     * 
     * @return carerID
     */
    public java.lang.String getCarerID() {
        return carerID;
    }


    /**
     * Sets the carerID value for this CarerAssessment.
     * 
     * @param carerID
     */
    public void setCarerID(java.lang.String carerID) {
        this.carerID = carerID;
    }


    /**
     * Gets the clinicianID value for this CarerAssessment.
     * 
     * @return clinicianID
     */
    public java.lang.String getClinicianID() {
        return clinicianID;
    }


    /**
     * Sets the clinicianID value for this CarerAssessment.
     * 
     * @param clinicianID
     */
    public void setClinicianID(java.lang.String clinicianID) {
        this.clinicianID = clinicianID;
    }


    /**
     * Gets the dateOfAssessment value for this CarerAssessment.
     * 
     * @return dateOfAssessment
     */
    public java.util.Calendar getDateOfAssessment() {
        return dateOfAssessment;
    }


    /**
     * Sets the dateOfAssessment value for this CarerAssessment.
     * 
     * @param dateOfAssessment
     */
    public void setDateOfAssessment(java.util.Calendar dateOfAssessment) {
        this.dateOfAssessment = dateOfAssessment;
    }


    /**
     * Gets the relevantHealthProblem value for this CarerAssessment.
     * 
     * @return relevantHealthProblem
     */
    public java.lang.String getRelevantHealthProblem() {
        return relevantHealthProblem;
    }


    /**
     * Sets the relevantHealthProblem value for this CarerAssessment.
     * 
     * @param relevantHealthProblem
     */
    public void setRelevantHealthProblem(java.lang.String relevantHealthProblem) {
        this.relevantHealthProblem = relevantHealthProblem;
    }


    /**
     * Gets the severityOfBurden value for this CarerAssessment.
     * 
     * @return severityOfBurden
     */
    public org.apache.axis.types.UnsignedByte getSeverityOfBurden() {
        return severityOfBurden;
    }


    /**
     * Sets the severityOfBurden value for this CarerAssessment.
     * 
     * @param severityOfBurden
     */
    public void setSeverityOfBurden(org.apache.axis.types.UnsignedByte severityOfBurden) {
        this.severityOfBurden = severityOfBurden;
    }


    /**
     * Gets the emotionalOrMentalDisorders value for this CarerAssessment.
     * 
     * @return emotionalOrMentalDisorders
     */
    public java.lang.String getEmotionalOrMentalDisorders() {
        return emotionalOrMentalDisorders;
    }


    /**
     * Sets the emotionalOrMentalDisorders value for this CarerAssessment.
     * 
     * @param emotionalOrMentalDisorders
     */
    public void setEmotionalOrMentalDisorders(java.lang.String emotionalOrMentalDisorders) {
        this.emotionalOrMentalDisorders = emotionalOrMentalDisorders;
    }


    /**
     * Gets the psychoactiveDrugs value for this CarerAssessment.
     * 
     * @return psychoactiveDrugs
     */
    public java.lang.String getPsychoactiveDrugs() {
        return psychoactiveDrugs;
    }


    /**
     * Sets the psychoactiveDrugs value for this CarerAssessment.
     * 
     * @param psychoactiveDrugs
     */
    public void setPsychoactiveDrugs(java.lang.String psychoactiveDrugs) {
        this.psychoactiveDrugs = psychoactiveDrugs;
    }


    /**
     * Gets the qualityOfLife value for this CarerAssessment.
     * 
     * @return qualityOfLife
     */
    public org.apache.axis.types.UnsignedByte getQualityOfLife() {
        return qualityOfLife;
    }


    /**
     * Sets the qualityOfLife value for this CarerAssessment.
     * 
     * @param qualityOfLife
     */
    public void setQualityOfLife(org.apache.axis.types.UnsignedByte qualityOfLife) {
        this.qualityOfLife = qualityOfLife;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarerAssessment)) return false;
        CarerAssessment other = (CarerAssessment) obj;
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
            ((this.carerID==null && other.getCarerID()==null) || 
             (this.carerID!=null &&
              this.carerID.equals(other.getCarerID()))) &&
            ((this.clinicianID==null && other.getClinicianID()==null) || 
             (this.clinicianID!=null &&
              this.clinicianID.equals(other.getClinicianID()))) &&
            ((this.dateOfAssessment==null && other.getDateOfAssessment()==null) || 
             (this.dateOfAssessment!=null &&
              this.dateOfAssessment.equals(other.getDateOfAssessment()))) &&
            ((this.relevantHealthProblem==null && other.getRelevantHealthProblem()==null) || 
             (this.relevantHealthProblem!=null &&
              this.relevantHealthProblem.equals(other.getRelevantHealthProblem()))) &&
            ((this.severityOfBurden==null && other.getSeverityOfBurden()==null) || 
             (this.severityOfBurden!=null &&
              this.severityOfBurden.equals(other.getSeverityOfBurden()))) &&
            ((this.emotionalOrMentalDisorders==null && other.getEmotionalOrMentalDisorders()==null) || 
             (this.emotionalOrMentalDisorders!=null &&
              this.emotionalOrMentalDisorders.equals(other.getEmotionalOrMentalDisorders()))) &&
            ((this.psychoactiveDrugs==null && other.getPsychoactiveDrugs()==null) || 
             (this.psychoactiveDrugs!=null &&
              this.psychoactiveDrugs.equals(other.getPsychoactiveDrugs()))) &&
            ((this.qualityOfLife==null && other.getQualityOfLife()==null) || 
             (this.qualityOfLife!=null &&
              this.qualityOfLife.equals(other.getQualityOfLife())));
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
        if (getCarerID() != null) {
            _hashCode += getCarerID().hashCode();
        }
        if (getClinicianID() != null) {
            _hashCode += getClinicianID().hashCode();
        }
        if (getDateOfAssessment() != null) {
            _hashCode += getDateOfAssessment().hashCode();
        }
        if (getRelevantHealthProblem() != null) {
            _hashCode += getRelevantHealthProblem().hashCode();
        }
        if (getSeverityOfBurden() != null) {
            _hashCode += getSeverityOfBurden().hashCode();
        }
        if (getEmotionalOrMentalDisorders() != null) {
            _hashCode += getEmotionalOrMentalDisorders().hashCode();
        }
        if (getPsychoactiveDrugs() != null) {
            _hashCode += getPsychoactiveDrugs().hashCode();
        }
        if (getQualityOfLife() != null) {
            _hashCode += getQualityOfLife().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarerAssessment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CarerAssessment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CarerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicianID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ClinicianID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfAssessment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateOfAssessment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relevantHealthProblem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "RelevantHealthProblem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityOfBurden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SeverityOfBurden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emotionalOrMentalDisorders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "EmotionalOrMentalDisorders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psychoactiveDrugs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PsychoactiveDrugs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityOfLife");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QualityOfLife"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
