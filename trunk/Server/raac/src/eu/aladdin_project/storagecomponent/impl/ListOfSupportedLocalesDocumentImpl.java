/*
 * An XML document type.
 * Localname: ListOfSupportedLocales
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one ListOfSupportedLocales(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class ListOfSupportedLocalesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument
{
    
    public ListOfSupportedLocalesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFSUPPORTEDLOCALES$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "ListOfSupportedLocales");
    
    
    /**
     * Gets the "ListOfSupportedLocales" element
     */
    public eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales getListOfSupportedLocales()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales)get_store().find_element_user(LISTOFSUPPORTEDLOCALES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfSupportedLocales" element
     */
    public void setListOfSupportedLocales(eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales listOfSupportedLocales)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales)get_store().find_element_user(LISTOFSUPPORTEDLOCALES$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales)get_store().add_element_user(LISTOFSUPPORTEDLOCALES$0);
            }
            target.set(listOfSupportedLocales);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfSupportedLocales" element
     */
    public eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales addNewListOfSupportedLocales()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales)get_store().add_element_user(LISTOFSUPPORTEDLOCALES$0);
            return target;
        }
    }
    /**
     * An XML ListOfSupportedLocales(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class ListOfSupportedLocalesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument.ListOfSupportedLocales
    {
        
        public ListOfSupportedLocalesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
