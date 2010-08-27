/**
 * Patient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class Patient  implements java.io.Serializable {
    private java.lang.String ID;

    private eu.aladdin_project.xsd.PersonData personData;

    private eu.aladdin_project.xsd.SocioDemographicData SD_Data;

    private java.lang.String responsibleClinicianID;

    private eu.aladdin_project.xsd.PatientCarer[] patientCarerList;

    public Patient() {
    }

    public Patient(
           java.lang.String ID,
           eu.aladdin_project.xsd.PersonData personData,
           eu.aladdin_project.xsd.SocioDemographicData SD_Data,
           java.lang.String responsibleClinicianID,
           eu.aladdin_project.xsd.PatientCarer[] patientCarerList) {
           this.ID = ID;
           this.personData = personData;
           this.SD_Data = SD_Data;
           this.responsibleClinicianID = responsibleClinicianID;
           this.patientCarerList = patientCarerList;
    }


    /**
     * Gets the ID value for this Patient.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Patient.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the personData value for this Patient.
     * 
     * @return personData
     */
    public eu.aladdin_project.xsd.PersonData getPersonData() {
        return personData;
    }


    /**
     * Sets the personData value for this Patient.
     * 
     * @param personData
     */
    public void setPersonData(eu.aladdin_project.xsd.PersonData personData) {
        this.personData = personData;
    }


    /**
     * Gets the SD_Data value for this Patient.
     * 
     * @return SD_Data
     */
    public eu.aladdin_project.xsd.SocioDemographicData getSD_Data() {
        return SD_Data;
    }


    /**
     * Sets the SD_Data value for this Patient.
     * 
     * @param SD_Data
     */
    public void setSD_Data(eu.aladdin_project.xsd.SocioDemographicData SD_Data) {
        this.SD_Data = SD_Data;
    }


    /**
     * Gets the responsibleClinicianID value for this Patient.
     * 
     * @return responsibleClinicianID
     */
    public java.lang.String getResponsibleClinicianID() {
        return responsibleClinicianID;
    }


    /**
     * Sets the responsibleClinicianID value for this Patient.
     * 
     * @param responsibleClinicianID
     */
    public void setResponsibleClinicianID(java.lang.String responsibleClinicianID) {
        this.responsibleClinicianID = responsibleClinicianID;
    }


    /**
     * Gets the patientCarerList value for this Patient.
     * 
     * @return patientCarerList
     */
    public eu.aladdin_project.xsd.PatientCarer[] getPatientCarerList() {
        return patientCarerList;
    }


    /**
     * Sets the patientCarerList value for this Patient.
     * 
     * @param patientCarerList
     */
    public void setPatientCarerList(eu.aladdin_project.xsd.PatientCarer[] patientCarerList) {
        this.patientCarerList = patientCarerList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Patient)) return false;
        Patient other = (Patient) obj;
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
            ((this.personData==null && other.getPersonData()==null) || 
             (this.personData!=null &&
              this.personData.equals(other.getPersonData()))) &&
            ((this.SD_Data==null && other.getSD_Data()==null) || 
             (this.SD_Data!=null &&
              this.SD_Data.equals(other.getSD_Data()))) &&
            ((this.responsibleClinicianID==null && other.getResponsibleClinicianID()==null) || 
             (this.responsibleClinicianID!=null &&
              this.responsibleClinicianID.equals(other.getResponsibleClinicianID()))) &&
            ((this.patientCarerList==null && other.getPatientCarerList()==null) || 
             (this.patientCarerList!=null &&
              java.util.Arrays.equals(this.patientCarerList, other.getPatientCarerList())));
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
        if (getPersonData() != null) {
            _hashCode += getPersonData().hashCode();
        }
        if (getSD_Data() != null) {
            _hashCode += getSD_Data().hashCode();
        }
        if (getResponsibleClinicianID() != null) {
            _hashCode += getResponsibleClinicianID().hashCode();
        }
        if (getPatientCarerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPatientCarerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPatientCarerList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Patient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Patient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PersonData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PersonData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SD_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SD_Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SocioDemographicData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleClinicianID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ResponsibleClinicianID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientCarerList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarer"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarer"));
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
