/**
 * SocioDemographicData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class SocioDemographicData  implements java.io.Serializable {
    private eu.aladdin_project.xsd.SystemParameter gender;

    private eu.aladdin_project.xsd.SystemParameter maritalStatus;

    private org.apache.axis.types.UnsignedByte children;

    private eu.aladdin_project.xsd.SystemParameter livingWith;
    
    private java.util.Date birthday;

    public SocioDemographicData() {
    }

    public SocioDemographicData(
           eu.aladdin_project.xsd.SystemParameter gender,
           eu.aladdin_project.xsd.SystemParameter maritalStatus,
           org.apache.axis.types.UnsignedByte children,
           eu.aladdin_project.xsd.SystemParameter livingWith,
           java.util.Date birthday) {
           this.gender = gender;
           this.maritalStatus = maritalStatus;
           this.children = children;
           this.livingWith = livingWith;
           this.birthday = birthday;
    }


    /**
     * Gets the gender value for this SocioDemographicData.
     * 
     * @return gender
     */
    public eu.aladdin_project.xsd.SystemParameter getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this SocioDemographicData.
     * 
     * @param gender
     */
    public void setGender(eu.aladdin_project.xsd.SystemParameter gender) {
        this.gender = gender;
    }


    /**
     * Gets the maritalStatus value for this SocioDemographicData.
     * 
     * @return maritalStatus
     */
    public eu.aladdin_project.xsd.SystemParameter getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this SocioDemographicData.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(eu.aladdin_project.xsd.SystemParameter maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the children value for this SocioDemographicData.
     * 
     * @return children
     */
    public org.apache.axis.types.UnsignedByte getChildren() {
        return children;
    }


    /**
     * Sets the children value for this SocioDemographicData.
     * 
     * @param children
     */
    public void setChildren(org.apache.axis.types.UnsignedByte children) {
        this.children = children;
    }


    /**
     * Gets the livingWith value for this SocioDemographicData.
     * 
     * @return livingWith
     */
    public eu.aladdin_project.xsd.SystemParameter getLivingWith() {
        return livingWith;
    }


    /**
     * Sets the livingWith value for this SocioDemographicData.
     * 
     * @param livingWith
     */
    public void setLivingWith(eu.aladdin_project.xsd.SystemParameter livingWith) {
        this.livingWith = livingWith;
    }
    
    /**
     * Gets the birthday value for this SocioDemographicData.
     * 
     * @return birthday
     */
    public java.util.Date getBirthday() {
        return birthday;
    }


    /**
     * Sets the birthday value for this SocioDemographicData.
     * 
     * @param birthday
     */
    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SocioDemographicData)) return false;
        SocioDemographicData other = (SocioDemographicData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              this.children.equals(other.getChildren()))) &&
            ((this.livingWith==null && other.getLivingWith()==null) || 
             (this.livingWith!=null &&
              this.livingWith.equals(other.getLivingWith()))) &&
              ((this.birthday==null && other.getBirthday()==null) || 
                      (this.birthday!=null &&
                       this.birthday.equals(other.getBirthday())));
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
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getChildren() != null) {
            _hashCode += getChildren().hashCode();
        }
        if (getLivingWith() != null) {
            _hashCode += getLivingWith().hashCode();
        }
        if (getBirthday() != null) {
            _hashCode += getBirthday().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SocioDemographicData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SocioDemographicData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livingWith");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "LivingWith"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "birthday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
