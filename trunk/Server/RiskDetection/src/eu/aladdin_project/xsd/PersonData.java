/**
 * PersonData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class PersonData  implements java.io.Serializable {
    private java.lang.String surname;

    private java.lang.String name;

    private eu.aladdin_project.xsd.Identifier[] identifierList;

    private eu.aladdin_project.xsd.Address[] addressList;

    private eu.aladdin_project.xsd.Communication[] communicationList;

    public PersonData() {
    }

    public PersonData(
           java.lang.String surname,
           java.lang.String name,
           eu.aladdin_project.xsd.Identifier[] identifierList,
           eu.aladdin_project.xsd.Address[] addressList,
           eu.aladdin_project.xsd.Communication[] communicationList) {
           this.surname = surname;
           this.name = name;
           this.identifierList = identifierList;
           this.addressList = addressList;
           this.communicationList = communicationList;
    }


    /**
     * Gets the surname value for this PersonData.
     * 
     * @return surname
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this PersonData.
     * 
     * @param surname
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }


    /**
     * Gets the name value for this PersonData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PersonData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the identifierList value for this PersonData.
     * 
     * @return identifierList
     */
    public eu.aladdin_project.xsd.Identifier[] getIdentifierList() {
        return identifierList;
    }


    /**
     * Sets the identifierList value for this PersonData.
     * 
     * @param identifierList
     */
    public void setIdentifierList(eu.aladdin_project.xsd.Identifier[] identifierList) {
        this.identifierList = identifierList;
    }


    /**
     * Gets the addressList value for this PersonData.
     * 
     * @return addressList
     */
    public eu.aladdin_project.xsd.Address[] getAddressList() {
        return addressList;
    }


    /**
     * Sets the addressList value for this PersonData.
     * 
     * @param addressList
     */
    public void setAddressList(eu.aladdin_project.xsd.Address[] addressList) {
        this.addressList = addressList;
    }


    /**
     * Gets the communicationList value for this PersonData.
     * 
     * @return communicationList
     */
    public eu.aladdin_project.xsd.Communication[] getCommunicationList() {
        return communicationList;
    }


    /**
     * Sets the communicationList value for this PersonData.
     * 
     * @param communicationList
     */
    public void setCommunicationList(eu.aladdin_project.xsd.Communication[] communicationList) {
        this.communicationList = communicationList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonData)) return false;
        PersonData other = (PersonData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.identifierList==null && other.getIdentifierList()==null) || 
             (this.identifierList!=null &&
              java.util.Arrays.equals(this.identifierList, other.getIdentifierList()))) &&
            ((this.addressList==null && other.getAddressList()==null) || 
             (this.addressList!=null &&
              java.util.Arrays.equals(this.addressList, other.getAddressList()))) &&
            ((this.communicationList==null && other.getCommunicationList()==null) || 
             (this.communicationList!=null &&
              java.util.Arrays.equals(this.communicationList, other.getCommunicationList())));
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
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIdentifierList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentifierList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentifierList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommunicationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunicationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommunicationList(), i);
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
        new org.apache.axis.description.TypeDesc(PersonData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PersonData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Surname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IdentifierList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Identifier"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Identifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "AddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Address"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Address"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CommunicationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Communication"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Communication"));
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
