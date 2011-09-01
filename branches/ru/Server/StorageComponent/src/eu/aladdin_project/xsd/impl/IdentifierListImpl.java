/*
 * XML Type:  IdentifierList
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.IdentifierList
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML IdentifierList(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class IdentifierListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.IdentifierList
{
    
    public IdentifierListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Identifier");
    
    
    /**
     * Gets array of all "Identifier" elements
     */
    public eu.aladdin_project.xsd.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            eu.aladdin_project.xsd.Identifier[] result = new eu.aladdin_project.xsd.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Identifier" element
     */
    public eu.aladdin_project.xsd.Identifier getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Identifier target = null;
            target = (eu.aladdin_project.xsd.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "Identifier" element
     */
    public void setIdentifierArray(eu.aladdin_project.xsd.Identifier[] identifierArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identifierArray, IDENTIFIER$0);
        }
    }
    
    /**
     * Sets ith "Identifier" element
     */
    public void setIdentifierArray(int i, eu.aladdin_project.xsd.Identifier identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Identifier target = null;
            target = (eu.aladdin_project.xsd.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
     */
    public eu.aladdin_project.xsd.Identifier insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Identifier target = null;
            target = (eu.aladdin_project.xsd.Identifier)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Identifier" element
     */
    public eu.aladdin_project.xsd.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Identifier target = null;
            target = (eu.aladdin_project.xsd.Identifier)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, i);
        }
    }
}
