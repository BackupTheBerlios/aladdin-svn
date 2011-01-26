/**
 * Identifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class Identifier  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String number;

    private java.util.Date issueDate;

    private java.lang.String issueAuthority;

    public Identifier() {
    }

    public Identifier(
           java.lang.String type,
           java.lang.String number,
           java.util.Date issueDate,
           java.lang.String issueAuthority) {
           this.type = type;
           this.number = number;
           this.issueDate = issueDate;
           this.issueAuthority = issueAuthority;
    }


    /**
     * Gets the type value for this Identifier.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Identifier.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the number value for this Identifier.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Identifier.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the issueDate value for this Identifier.
     * 
     * @return issueDate
     */
    public java.util.Date getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this Identifier.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Date issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the issueAuthority value for this Identifier.
     * 
     * @return issueAuthority
     */
    public java.lang.String getIssueAuthority() {
        return issueAuthority;
    }


    /**
     * Sets the issueAuthority value for this Identifier.
     * 
     * @param issueAuthority
     */
    public void setIssueAuthority(java.lang.String issueAuthority) {
        this.issueAuthority = issueAuthority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Identifier)) return false;
        Identifier other = (Identifier) obj;
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
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.issueAuthority==null && other.getIssueAuthority()==null) || 
             (this.issueAuthority!=null &&
              this.issueAuthority.equals(other.getIssueAuthority())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getIssueAuthority() != null) {
            _hashCode += getIssueAuthority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Identifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Identifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IssueAuthority"));
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
