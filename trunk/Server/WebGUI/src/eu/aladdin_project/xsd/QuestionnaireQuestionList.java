/**
 * QuestionnaireQuestionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class QuestionnaireQuestionList  implements java.io.Serializable {
    private eu.aladdin_project.xsd.QuestionnaireQuestion[] question;

    public QuestionnaireQuestionList() {
    }

    public QuestionnaireQuestionList(
           eu.aladdin_project.xsd.QuestionnaireQuestion[] question) {
           this.question = question;
    }


    /**
     * Gets the question value for this QuestionnaireQuestionList.
     * 
     * @return question
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion[] getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this QuestionnaireQuestionList.
     * 
     * @param question
     */
    public void setQuestion(eu.aladdin_project.xsd.QuestionnaireQuestion[] question) {
        this.question = question;
    }

    public eu.aladdin_project.xsd.QuestionnaireQuestion getQuestion(int i) {
        return this.question[i];
    }

    public void setQuestion(int i, eu.aladdin_project.xsd.QuestionnaireQuestion _value) {
        this.question[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuestionnaireQuestionList)) return false;
        QuestionnaireQuestionList other = (QuestionnaireQuestionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.question==null && other.getQuestion()==null) || 
             (this.question!=null &&
              java.util.Arrays.equals(this.question, other.getQuestion())));
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
        if (getQuestion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestion(), i);
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
        new org.apache.axis.description.TypeDesc(QuestionnaireQuestionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QuestionnaireQuestionList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "question"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QuestionnaireQuestion"));
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
