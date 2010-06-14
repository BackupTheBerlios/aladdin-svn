/*
 * XML Type:  PersonData
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.PersonData
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML PersonData(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class PersonDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.PersonData
{
    
    public PersonDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURNAME$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Surname");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Name");
    private static final javax.xml.namespace.QName IDENTIFIERLIST$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IdentifierList");
    private static final javax.xml.namespace.QName ADDRESSLIST$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "AddressList");
    private static final javax.xml.namespace.QName COMMUNICATIONLIST$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CommunicationList");
    
    
    /**
     * Gets the "Surname" element
     */
    public java.lang.String getSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Surname" element
     */
    public org.apache.xmlbeans.XmlString xgetSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SURNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Surname" element
     */
    public void setSurname(java.lang.String surname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURNAME$0);
            }
            target.setStringValue(surname);
        }
    }
    
    /**
     * Sets (as xml) the "Surname" element
     */
    public void xsetSurname(org.apache.xmlbeans.XmlString surname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SURNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SURNAME$0);
            }
            target.set(surname);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets array of all "IdentifierList" elements
     */
    public eu.aladdin_project.xsd.Identifier[] getIdentifierListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIERLIST$4, targetList);
            eu.aladdin_project.xsd.Identifier[] result = new eu.aladdin_project.xsd.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentifierList" element
     */
    public eu.aladdin_project.xsd.Identifier getIdentifierListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Identifier target = null;
            target = (eu.aladdin_project.xsd.Identifier)get_store().find_element_user(IDENTIFIERLIST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdentifierList" element
     */
    public int sizeOfIdentifierListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIERLIST$4);
        }
    }
    
    /**
     * Sets array of all "IdentifierList" element
     */
    public void setIdentifierListArray(eu.aladdin_project.xsd.Identifier[] identifierListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identifierListArray, IDENTIFIERLIST$4);
        }
    }
    
    /**
     * Sets ith "IdentifierList" element
     */
    public void setIdentifierListArray(int i, eu.aladdin_project.xsd.Identifier identifierList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Identifier target = null;
            target = (eu.aladdin_project.xsd.Identifier)get_store().find_element_user(IDENTIFIERLIST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifierList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifierList" element
     */
    public eu.aladdin_project.xsd.Identifier insertNewIdentifierList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Identifier target = null;
            target = (eu.aladdin_project.xsd.Identifier)get_store().insert_element_user(IDENTIFIERLIST$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifierList" element
     */
    public eu.aladdin_project.xsd.Identifier addNewIdentifierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Identifier target = null;
            target = (eu.aladdin_project.xsd.Identifier)get_store().add_element_user(IDENTIFIERLIST$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentifierList" element
     */
    public void removeIdentifierList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIERLIST$4, i);
        }
    }
    
    /**
     * Gets array of all "AddressList" elements
     */
    public eu.aladdin_project.xsd.Address[] getAddressListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSLIST$6, targetList);
            eu.aladdin_project.xsd.Address[] result = new eu.aladdin_project.xsd.Address[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AddressList" element
     */
    public eu.aladdin_project.xsd.Address getAddressListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Address target = null;
            target = (eu.aladdin_project.xsd.Address)get_store().find_element_user(ADDRESSLIST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AddressList" element
     */
    public int sizeOfAddressListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLIST$6);
        }
    }
    
    /**
     * Sets array of all "AddressList" element
     */
    public void setAddressListArray(eu.aladdin_project.xsd.Address[] addressListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressListArray, ADDRESSLIST$6);
        }
    }
    
    /**
     * Sets ith "AddressList" element
     */
    public void setAddressListArray(int i, eu.aladdin_project.xsd.Address addressList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Address target = null;
            target = (eu.aladdin_project.xsd.Address)get_store().find_element_user(ADDRESSLIST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addressList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressList" element
     */
    public eu.aladdin_project.xsd.Address insertNewAddressList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Address target = null;
            target = (eu.aladdin_project.xsd.Address)get_store().insert_element_user(ADDRESSLIST$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressList" element
     */
    public eu.aladdin_project.xsd.Address addNewAddressList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Address target = null;
            target = (eu.aladdin_project.xsd.Address)get_store().add_element_user(ADDRESSLIST$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "AddressList" element
     */
    public void removeAddressList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLIST$6, i);
        }
    }
    
    /**
     * Gets array of all "CommunicationList" elements
     */
    public eu.aladdin_project.xsd.Communication[] getCommunicationListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMUNICATIONLIST$8, targetList);
            eu.aladdin_project.xsd.Communication[] result = new eu.aladdin_project.xsd.Communication[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CommunicationList" element
     */
    public eu.aladdin_project.xsd.Communication getCommunicationListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Communication target = null;
            target = (eu.aladdin_project.xsd.Communication)get_store().find_element_user(COMMUNICATIONLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CommunicationList" element
     */
    public int sizeOfCommunicationListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMUNICATIONLIST$8);
        }
    }
    
    /**
     * Sets array of all "CommunicationList" element
     */
    public void setCommunicationListArray(eu.aladdin_project.xsd.Communication[] communicationListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(communicationListArray, COMMUNICATIONLIST$8);
        }
    }
    
    /**
     * Sets ith "CommunicationList" element
     */
    public void setCommunicationListArray(int i, eu.aladdin_project.xsd.Communication communicationList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Communication target = null;
            target = (eu.aladdin_project.xsd.Communication)get_store().find_element_user(COMMUNICATIONLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(communicationList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CommunicationList" element
     */
    public eu.aladdin_project.xsd.Communication insertNewCommunicationList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Communication target = null;
            target = (eu.aladdin_project.xsd.Communication)get_store().insert_element_user(COMMUNICATIONLIST$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CommunicationList" element
     */
    public eu.aladdin_project.xsd.Communication addNewCommunicationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Communication target = null;
            target = (eu.aladdin_project.xsd.Communication)get_store().add_element_user(COMMUNICATIONLIST$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "CommunicationList" element
     */
    public void removeCommunicationList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMUNICATIONLIST$8, i);
        }
    }
}
