/*
 * An XML document type.
 * Localname: ListOfPossibleTasks
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one ListOfPossibleTasks(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class ListOfPossibleTasksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument
{
    
    public ListOfPossibleTasksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFPOSSIBLETASKS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "ListOfPossibleTasks");
    
    
    /**
     * Gets the "ListOfPossibleTasks" element
     */
    public eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks getListOfPossibleTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks)get_store().find_element_user(LISTOFPOSSIBLETASKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfPossibleTasks" element
     */
    public void setListOfPossibleTasks(eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks listOfPossibleTasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks)get_store().find_element_user(LISTOFPOSSIBLETASKS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks)get_store().add_element_user(LISTOFPOSSIBLETASKS$0);
            }
            target.set(listOfPossibleTasks);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfPossibleTasks" element
     */
    public eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks addNewListOfPossibleTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks)get_store().add_element_user(LISTOFPOSSIBLETASKS$0);
            return target;
        }
    }
    /**
     * An XML ListOfPossibleTasks(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class ListOfPossibleTasksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument.ListOfPossibleTasks
    {
        
        public ListOfPossibleTasksImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERTYPE$0 = 
            new javax.xml.namespace.QName("", "userType");
        
        
        /**
         * Gets the "userType" element
         */
        public int getUserType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERTYPE$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "userType" element
         */
        public org.apache.xmlbeans.XmlInt xgetUserType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(USERTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "userType" element
         */
        public void setUserType(int userType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERTYPE$0);
                }
                target.setIntValue(userType);
            }
        }
        
        /**
         * Sets (as xml) the "userType" element
         */
        public void xsetUserType(org.apache.xmlbeans.XmlInt userType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(USERTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(USERTYPE$0);
                }
                target.set(userType);
            }
        }
    }
}
