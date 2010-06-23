/*
 * XML Type:  CommunicationList
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.CommunicationList
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML CommunicationList(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class CommunicationListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.CommunicationList
{
    
    public CommunicationListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNICATION$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Communication");
    
    
    /**
     * Gets array of all "Communication" elements
     */
    public eu.aladdin_project.xsd.Communication[] getCommunicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMUNICATION$0, targetList);
            eu.aladdin_project.xsd.Communication[] result = new eu.aladdin_project.xsd.Communication[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Communication" element
     */
    public eu.aladdin_project.xsd.Communication getCommunicationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Communication target = null;
            target = (eu.aladdin_project.xsd.Communication)get_store().find_element_user(COMMUNICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Communication" element
     */
    public int sizeOfCommunicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMUNICATION$0);
        }
    }
    
    /**
     * Sets array of all "Communication" element
     */
    public void setCommunicationArray(eu.aladdin_project.xsd.Communication[] communicationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(communicationArray, COMMUNICATION$0);
        }
    }
    
    /**
     * Sets ith "Communication" element
     */
    public void setCommunicationArray(int i, eu.aladdin_project.xsd.Communication communication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Communication target = null;
            target = (eu.aladdin_project.xsd.Communication)get_store().find_element_user(COMMUNICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(communication);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Communication" element
     */
    public eu.aladdin_project.xsd.Communication insertNewCommunication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Communication target = null;
            target = (eu.aladdin_project.xsd.Communication)get_store().insert_element_user(COMMUNICATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Communication" element
     */
    public eu.aladdin_project.xsd.Communication addNewCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Communication target = null;
            target = (eu.aladdin_project.xsd.Communication)get_store().add_element_user(COMMUNICATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Communication" element
     */
    public void removeCommunication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMUNICATION$0, i);
        }
    }
}
