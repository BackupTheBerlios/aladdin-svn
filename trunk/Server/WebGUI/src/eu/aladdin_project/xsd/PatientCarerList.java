/**
 * PatientCarerList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class PatientCarerList  implements java.io.Serializable {
    private eu.aladdin_project.xsd.PatientCarer[] patientCarer;

    public PatientCarerList() {
    }

    public PatientCarerList(
           eu.aladdin_project.xsd.PatientCarer[] patientCarer) {
           this.patientCarer = patientCarer;
    }


    /**
     * Gets the patientCarer value for this PatientCarerList.
     * 
     * @return patientCarer
     */
    public eu.aladdin_project.xsd.PatientCarer[] getPatientCarer() {
        return patientCarer;
    }


    /**
     * Sets the patientCarer value for this PatientCarerList.
     * 
     * @param patientCarer
     */
    public void setPatientCarer(eu.aladdin_project.xsd.PatientCarer[] patientCarer) {
        this.patientCarer = patientCarer;
    }

    public eu.aladdin_project.xsd.PatientCarer getPatientCarer(int i) {
        return this.patientCarer[i];
    }

    public void setPatientCarer(int i, eu.aladdin_project.xsd.PatientCarer _value) {
        this.patientCarer[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatientCarerList)) return false;
        PatientCarerList other = (PatientCarerList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.patientCarer==null && other.getPatientCarer()==null) || 
             (this.patientCarer!=null &&
              java.util.Arrays.equals(this.patientCarer, other.getPatientCarer())));
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
        if (getPatientCarer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPatientCarer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPatientCarer(), i);
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
        new org.apache.axis.description.TypeDesc(PatientCarerList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarerList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientCarer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
