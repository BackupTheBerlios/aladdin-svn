/*
 * XML Type:  AddressList
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.AddressList
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML AddressList(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class AddressListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.AddressList
{
    
    public AddressListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Address");
    
    
    /**
     * Gets array of all "Address" elements
     */
    public eu.aladdin_project.xsd.Address[] getAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESS$0, targetList);
            eu.aladdin_project.xsd.Address[] result = new eu.aladdin_project.xsd.Address[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Address" element
     */
    public eu.aladdin_project.xsd.Address getAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Address target = null;
            target = (eu.aladdin_project.xsd.Address)get_store().find_element_user(ADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Address" element
     */
    public int sizeOfAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$0);
        }
    }
    
    /**
     * Sets array of all "Address" element
     */
    public void setAddressArray(eu.aladdin_project.xsd.Address[] addressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressArray, ADDRESS$0);
        }
    }
    
    /**
     * Sets ith "Address" element
     */
    public void setAddressArray(int i, eu.aladdin_project.xsd.Address address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Address target = null;
            target = (eu.aladdin_project.xsd.Address)get_store().find_element_user(ADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(address);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Address" element
     */
    public eu.aladdin_project.xsd.Address insertNewAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Address target = null;
            target = (eu.aladdin_project.xsd.Address)get_store().insert_element_user(ADDRESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Address" element
     */
    public eu.aladdin_project.xsd.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Address target = null;
            target = (eu.aladdin_project.xsd.Address)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Address" element
     */
    public void removeAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$0, i);
        }
    }
}
