/**
 * PatientCarer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class PatientCarer  implements java.io.Serializable {
    private eu.aladdin_project.xsd.Carer carer;

    private boolean isPrimary;

    public PatientCarer() {
    }

    public PatientCarer(
           eu.aladdin_project.xsd.Carer carer,
           boolean isPrimary) {
           this.carer = carer;
           this.isPrimary = isPrimary;
    }


    /**
     * Gets the carer value for this PatientCarer.
     * 
     * @return carer
     */
    public eu.aladdin_project.xsd.Carer getCarer() {
        return carer;
    }


    /**
     * Sets the carer value for this PatientCarer.
     * 
     * @param carer
     */
    public void setCarer(eu.aladdin_project.xsd.Carer carer) {
        this.carer = carer;
    }


    /**
     * Gets the isPrimary value for this PatientCarer.
     * 
     * @return isPrimary
     */
    public boolean isIsPrimary() {
        return isPrimary;
    }


    /**
     * Sets the isPrimary value for this PatientCarer.
     * 
     * @param isPrimary
     */
    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatientCarer)) return false;
        PatientCarer other = (PatientCarer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carer==null && other.getCarer()==null) || 
             (this.carer!=null &&
              this.carer.equals(other.getCarer()))) &&
            this.isPrimary == other.isIsPrimary();
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
        if (getCarer() != null) {
            _hashCode += getCarer().hashCode();
        }
        _hashCode += (isIsPrimary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatientCarer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Carer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Carer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IsPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
