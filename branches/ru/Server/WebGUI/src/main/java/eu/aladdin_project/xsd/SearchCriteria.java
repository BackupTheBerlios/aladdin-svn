/**
 * SearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class SearchCriteria  implements java.io.Serializable {
    private java.lang.String fieldName;

    private eu.aladdin_project.xsd.SystemParameter compareOp;

    private java.lang.String fieldValue1;

    private java.lang.String fieldValue2;

    public SearchCriteria() {
    }

    public SearchCriteria(
           java.lang.String fieldName,
           eu.aladdin_project.xsd.SystemParameter compareOp,
           java.lang.String fieldValue1,
           java.lang.String fieldValue2) {
           this.fieldName = fieldName;
           this.compareOp = compareOp;
           this.fieldValue1 = fieldValue1;
           this.fieldValue2 = fieldValue2;
    }


    /**
     * Gets the fieldName value for this SearchCriteria.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this SearchCriteria.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the compareOp value for this SearchCriteria.
     * 
     * @return compareOp
     */
    public eu.aladdin_project.xsd.SystemParameter getCompareOp() {
        return compareOp;
    }


    /**
     * Sets the compareOp value for this SearchCriteria.
     * 
     * @param compareOp
     */
    public void setCompareOp(eu.aladdin_project.xsd.SystemParameter compareOp) {
        this.compareOp = compareOp;
    }


    /**
     * Gets the fieldValue1 value for this SearchCriteria.
     * 
     * @return fieldValue1
     */
    public java.lang.String getFieldValue1() {
        return fieldValue1;
    }


    /**
     * Sets the fieldValue1 value for this SearchCriteria.
     * 
     * @param fieldValue1
     */
    public void setFieldValue1(java.lang.String fieldValue1) {
        this.fieldValue1 = fieldValue1;
    }


    /**
     * Gets the fieldValue2 value for this SearchCriteria.
     * 
     * @return fieldValue2
     */
    public java.lang.String getFieldValue2() {
        return fieldValue2;
    }


    /**
     * Sets the fieldValue2 value for this SearchCriteria.
     * 
     * @param fieldValue2
     */
    public void setFieldValue2(java.lang.String fieldValue2) {
        this.fieldValue2 = fieldValue2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchCriteria)) return false;
        SearchCriteria other = (SearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.compareOp==null && other.getCompareOp()==null) || 
             (this.compareOp!=null &&
              this.compareOp.equals(other.getCompareOp()))) &&
            ((this.fieldValue1==null && other.getFieldValue1()==null) || 
             (this.fieldValue1!=null &&
              this.fieldValue1.equals(other.getFieldValue1()))) &&
            ((this.fieldValue2==null && other.getFieldValue2()==null) || 
             (this.fieldValue2!=null &&
              this.fieldValue2.equals(other.getFieldValue2())));
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
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getCompareOp() != null) {
            _hashCode += getCompareOp().hashCode();
        }
        if (getFieldValue1() != null) {
            _hashCode += getFieldValue1().hashCode();
        }
        if (getFieldValue2() != null) {
            _hashCode += getFieldValue2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "FieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compareOp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CompareOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "FieldValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "FieldValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
