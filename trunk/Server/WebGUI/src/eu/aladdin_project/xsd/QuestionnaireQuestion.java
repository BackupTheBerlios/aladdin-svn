/**
 * QuestionnaireQuestion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class QuestionnaireQuestion  implements java.io.Serializable {
    private java.lang.String title;

    private eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] answers;

    private eu.aladdin_project.xsd.QuestionnaireQuestion[] questions;

    private java.lang.String id;  // attribute

    private java.lang.String type;  // attribute

    private org.apache.axis.types.UnsignedByte condition;  // attribute

    private boolean deleted;  // attribute

    public QuestionnaireQuestion() {
    }

    public QuestionnaireQuestion(
           java.lang.String title,
           eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] answers,
           eu.aladdin_project.xsd.QuestionnaireQuestion[] questions,
           java.lang.String id,
           java.lang.String type,
           org.apache.axis.types.UnsignedByte condition,
           boolean deleted) {
           this.title = title;
           this.answers = answers;
           this.questions = questions;
           this.id = id;
           this.type = type;
           this.condition = condition;
           this.deleted = deleted;
    }


    /**
     * Gets the title value for this QuestionnaireQuestion.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this QuestionnaireQuestion.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the answers value for this QuestionnaireQuestion.
     * 
     * @return answers
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] getAnswers() {
        return answers;
    }


    /**
     * Sets the answers value for this QuestionnaireQuestion.
     * 
     * @param answers
     */
    public void setAnswers(eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] answers) {
        this.answers = answers;
    }


    /**
     * Gets the questions value for this QuestionnaireQuestion.
     * 
     * @return questions
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion[] getQuestions() {
        return questions;
    }


    /**
     * Sets the questions value for this QuestionnaireQuestion.
     * 
     * @param questions
     */
    public void setQuestions(eu.aladdin_project.xsd.QuestionnaireQuestion[] questions) {
        this.questions = questions;
    }


    /**
     * Gets the id value for this QuestionnaireQuestion.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this QuestionnaireQuestion.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the type value for this QuestionnaireQuestion.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this QuestionnaireQuestion.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the condition value for this QuestionnaireQuestion.
     * 
     * @return condition
     */
    public org.apache.axis.types.UnsignedByte getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this QuestionnaireQuestion.
     * 
     * @param condition
     */
    public void setCondition(org.apache.axis.types.UnsignedByte condition) {
        this.condition = condition;
    }


    /**
     * Gets the deleted value for this QuestionnaireQuestion.
     * 
     * @return deleted
     */
    public boolean isDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this QuestionnaireQuestion.
     * 
     * @param deleted
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuestionnaireQuestion)) return false;
        QuestionnaireQuestion other = (QuestionnaireQuestion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.answers==null && other.getAnswers()==null) || 
             (this.answers!=null &&
              java.util.Arrays.equals(this.answers, other.getAnswers()))) &&
            ((this.questions==null && other.getQuestions()==null) || 
             (this.questions!=null &&
              java.util.Arrays.equals(this.questions, other.getQuestions()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            this.deleted == other.isDeleted();
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAnswers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnswers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnswers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuestions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        _hashCode += (isDeleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuestionnaireQuestion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QuestionnaireQuestion"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("condition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "condition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deleted");
        attrField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "answers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QuestionnaireQuestionAnswer"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "answer"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "questions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QuestionnaireQuestion"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "question"));
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
