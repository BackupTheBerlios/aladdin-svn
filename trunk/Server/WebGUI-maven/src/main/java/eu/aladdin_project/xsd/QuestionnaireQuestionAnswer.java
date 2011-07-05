/**
 * QuestionnaireQuestionAnswer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class QuestionnaireQuestionAnswer  implements java.io.Serializable {
    private int position;

    private java.lang.String description;

    private org.apache.axis.types.UnsignedByte value;  // attribute

    public QuestionnaireQuestionAnswer() {
    }

    public QuestionnaireQuestionAnswer(
           int position,
           java.lang.String description,
           org.apache.axis.types.UnsignedByte value) {
           this.position = position;
           this.description = description;
           this.value = value;
    }


    /**
     * Gets the position value for this QuestionnaireQuestionAnswer.
     * 
     * @return position
     */
    public int getPosition() {
        return position;
    }


    /**
     * Sets the position value for this QuestionnaireQuestionAnswer.
     * 
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }


    /**
     * Gets the description value for this QuestionnaireQuestionAnswer.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this QuestionnaireQuestionAnswer.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the value value for this QuestionnaireQuestionAnswer.
     * 
     * @return value
     */
    public org.apache.axis.types.UnsignedByte getValue() {
        return value;
    }


    /**
     * Sets the value value for this QuestionnaireQuestionAnswer.
     * 
     * @param value
     */
    public void setValue(org.apache.axis.types.UnsignedByte value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuestionnaireQuestionAnswer)) return false;
        QuestionnaireQuestionAnswer other = (QuestionnaireQuestionAnswer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.position == other.getPosition() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        _hashCode += getPosition();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuestionnaireQuestionAnswer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QuestionnaireQuestionAnswer"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value");
        attrField.setXmlName(new javax.xml.namespace.QName("", "value"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "description"));
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
