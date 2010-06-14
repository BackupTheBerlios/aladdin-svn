/*
 * An XML document type.
 * Localname: ListOfAdministrators
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.ListOfAdministratorsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one ListOfAdministrators(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class ListOfAdministratorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfAdministratorsDocument
{
    
    public ListOfAdministratorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFADMINISTRATORS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "ListOfAdministrators");
    
    
    /**
     * Gets the "ListOfAdministrators" element
     */
    public eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators getListOfAdministrators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators target = null;
            target = (eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators)get_store().find_element_user(LISTOFADMINISTRATORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfAdministrators" element
     */
    public void setListOfAdministrators(eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators listOfAdministrators)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators target = null;
            target = (eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators)get_store().find_element_user(LISTOFADMINISTRATORS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators)get_store().add_element_user(LISTOFADMINISTRATORS$0);
            }
            target.set(listOfAdministrators);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfAdministrators" element
     */
    public eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators addNewListOfAdministrators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators target = null;
            target = (eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators)get_store().add_element_user(LISTOFADMINISTRATORS$0);
            return target;
        }
    }
    /**
     * An XML ListOfAdministrators(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class ListOfAdministratorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfAdministratorsDocument.ListOfAdministrators
    {
        
        public ListOfAdministratorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILTER$0 = 
            new javax.xml.namespace.QName("", "filter");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets array of all "filter" elements
         */
        public eu.aladdin_project.xsd.SearchCriteria[] getFilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FILTER$0, targetList);
                eu.aladdin_project.xsd.SearchCriteria[] result = new eu.aladdin_project.xsd.SearchCriteria[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "filter" element
         */
        public eu.aladdin_project.xsd.SearchCriteria getFilterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SearchCriteria target = null;
                target = (eu.aladdin_project.xsd.SearchCriteria)get_store().find_element_user(FILTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "filter" element
         */
        public int sizeOfFilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILTER$0);
            }
        }
        
        /**
         * Sets array of all "filter" element
         */
        public void setFilterArray(eu.aladdin_project.xsd.SearchCriteria[] filterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(filterArray, FILTER$0);
            }
        }
        
        /**
         * Sets ith "filter" element
         */
        public void setFilterArray(int i, eu.aladdin_project.xsd.SearchCriteria filter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SearchCriteria target = null;
                target = (eu.aladdin_project.xsd.SearchCriteria)get_store().find_element_user(FILTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(filter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "filter" element
         */
        public eu.aladdin_project.xsd.SearchCriteria insertNewFilter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SearchCriteria target = null;
                target = (eu.aladdin_project.xsd.SearchCriteria)get_store().insert_element_user(FILTER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "filter" element
         */
        public eu.aladdin_project.xsd.SearchCriteria addNewFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SearchCriteria target = null;
                target = (eu.aladdin_project.xsd.SearchCriteria)get_store().add_element_user(FILTER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "filter" element
         */
        public void removeFilter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILTER$0, i);
            }
        }
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "userId" element
         */
        public org.apache.xmlbeans.XmlString xgetUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "userId" element
         */
        public void setUserId(java.lang.String userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$2);
                }
                target.setStringValue(userId);
            }
        }
        
        /**
         * Sets (as xml) the "userId" element
         */
        public void xsetUserId(org.apache.xmlbeans.XmlString userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$2);
                }
                target.set(userId);
            }
        }
    }
}
