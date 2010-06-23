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
     * Gets the "IdentifierList" element
     */
    public eu.aladdin_project.xsd.IdentifierList getIdentifierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.IdentifierList target = null;
            target = (eu.aladdin_project.xsd.IdentifierList)get_store().find_element_user(IDENTIFIERLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifierList" element
     */
    public void setIdentifierList(eu.aladdin_project.xsd.IdentifierList identifierList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.IdentifierList target = null;
            target = (eu.aladdin_project.xsd.IdentifierList)get_store().find_element_user(IDENTIFIERLIST$4, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.IdentifierList)get_store().add_element_user(IDENTIFIERLIST$4);
            }
            target.set(identifierList);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentifierList" element
     */
    public eu.aladdin_project.xsd.IdentifierList addNewIdentifierList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.IdentifierList target = null;
            target = (eu.aladdin_project.xsd.IdentifierList)get_store().add_element_user(IDENTIFIERLIST$4);
            return target;
        }
    }
    
    /**
     * Gets the "AddressList" element
     */
    public eu.aladdin_project.xsd.AddressList getAddressList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.AddressList target = null;
            target = (eu.aladdin_project.xsd.AddressList)get_store().find_element_user(ADDRESSLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddressList" element
     */
    public void setAddressList(eu.aladdin_project.xsd.AddressList addressList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.AddressList target = null;
            target = (eu.aladdin_project.xsd.AddressList)get_store().find_element_user(ADDRESSLIST$6, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.AddressList)get_store().add_element_user(ADDRESSLIST$6);
            }
            target.set(addressList);
        }
    }
    
    /**
     * Appends and returns a new empty "AddressList" element
     */
    public eu.aladdin_project.xsd.AddressList addNewAddressList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.AddressList target = null;
            target = (eu.aladdin_project.xsd.AddressList)get_store().add_element_user(ADDRESSLIST$6);
            return target;
        }
    }
    
    /**
     * Gets the "CommunicationList" element
     */
    public eu.aladdin_project.xsd.CommunicationList getCommunicationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.CommunicationList target = null;
            target = (eu.aladdin_project.xsd.CommunicationList)get_store().find_element_user(COMMUNICATIONLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CommunicationList" element
     */
    public void setCommunicationList(eu.aladdin_project.xsd.CommunicationList communicationList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.CommunicationList target = null;
            target = (eu.aladdin_project.xsd.CommunicationList)get_store().find_element_user(COMMUNICATIONLIST$8, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.CommunicationList)get_store().add_element_user(COMMUNICATIONLIST$8);
            }
            target.set(communicationList);
        }
    }
    
    /**
     * Appends and returns a new empty "CommunicationList" element
     */
    public eu.aladdin_project.xsd.CommunicationList addNewCommunicationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.CommunicationList target = null;
            target = (eu.aladdin_project.xsd.CommunicationList)get_store().add_element_user(COMMUNICATIONLIST$8);
            return target;
        }
    }
}
