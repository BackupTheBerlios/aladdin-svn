/**
 * QuestionnaireQuestionAnswerList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class QuestionnaireQuestionAnswerList  implements java.io.Serializable {
    private eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] answer;

    public QuestionnaireQuestionAnswerList() {
    }

    public QuestionnaireQuestionAnswerList(
           eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] answer) {
           this.answer = answer;
    }


    /**
     * Gets the answer value for this QuestionnaireQuestionAnswerList.
     * 
     * @return answer
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this QuestionnaireQuestionAnswerList.
     * 
     * @param answer
     */
    public void setAnswer(eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] answer) {
        this.answer = answer;
    }

    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswer getAnswer(int i) {
        return this.answer[i];
    }

    public void setAnswer(int i, eu.aladdin_project.xsd.QuestionnaireQuestionAnswer _value) {
        this.answer[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuestionnaireQuestionAnswerList)) return false;
        QuestionnaireQuestionAnswerList other = (QuestionnaireQuestionAnswerList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              java.util.Arrays.equals(this.answer, other.getAnswer())));
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
        if (getAnswer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnswer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnswer(), i);
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
        new org.apache.axis.description.TypeDesc(QuestionnaireQuestionAnswerList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QuestionnaireQuestionAnswerList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QuestionnaireQuestionAnswer"));
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
