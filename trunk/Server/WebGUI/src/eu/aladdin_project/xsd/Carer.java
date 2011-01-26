/**
 * Carer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class Carer  implements java.io.Serializable {
    private java.lang.String ID;

    private eu.aladdin_project.xsd.PersonData personData;

    private eu.aladdin_project.xsd.SocioDemographicData SD_Data;
    
    public String toString(){
    	return this.personData.getSurname()+", "+this.personData.getName();
    }

    public Carer() {
    }

    public Carer(
           java.lang.String ID,
           eu.aladdin_project.xsd.PersonData personData,
           eu.aladdin_project.xsd.SocioDemographicData SD_Data) {
           this.ID = ID;
           this.personData = personData;
           this.SD_Data = SD_Data;
    }


    /**
     * Gets the ID value for this Carer.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Carer.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the personData value for this Carer.
     * 
     * @return personData
     */
    public eu.aladdin_project.xsd.PersonData getPersonData() {
        return personData;
    }


    /**
     * Sets the personData value for this Carer.
     * 
     * @param personData
     */
    public void setPersonData(eu.aladdin_project.xsd.PersonData personData) {
        this.personData = personData;
    }


    /**
     * Gets the SD_Data value for this Carer.
     * 
     * @return SD_Data
     */
    public eu.aladdin_project.xsd.SocioDemographicData getSD_Data() {
        return SD_Data;
    }


    /**
     * Sets the SD_Data value for this Carer.
     * 
     * @param SD_Data
     */
    public void setSD_Data(eu.aladdin_project.xsd.SocioDemographicData SD_Data) {
        this.SD_Data = SD_Data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Carer)) return false;
        Carer other = (Carer) obj;
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
              this.SD_Data.equals(other.getSD_Data())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Carer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Carer"));
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
