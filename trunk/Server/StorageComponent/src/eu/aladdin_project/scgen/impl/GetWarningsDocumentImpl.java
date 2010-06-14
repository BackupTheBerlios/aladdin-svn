/*
 * An XML document type.
 * Localname: GetWarnings
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetWarningsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetWarnings(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetWarningsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetWarningsDocument
{
    
    public GetWarningsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWARNINGS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetWarnings");
    
    
    /**
     * Gets the "GetWarnings" element
     */
    public eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings getGetWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings target = null;
            target = (eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings)get_store().find_element_user(GETWARNINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetWarnings" element
     */
    public void setGetWarnings(eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings getWarnings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings target = null;
            target = (eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings)get_store().find_element_user(GETWARNINGS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings)get_store().add_element_user(GETWARNINGS$0);
            }
            target.set(getWarnings);
        }
    }
    
    /**
     * Appends and returns a new empty "GetWarnings" element
     */
    public eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings addNewGetWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings target = null;
            target = (eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings)get_store().add_element_user(GETWARNINGS$0);
            return target;
        }
    }
    /**
     * An XML GetWarnings(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetWarningsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetWarningsDocument.GetWarnings
    {
        
        public GetWarningsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WARN$0 = 
            new javax.xml.namespace.QName("", "warn");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets array of all "warn" elements
         */
        public eu.aladdin_project.xsd.SearchCriteria[] getWarnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WARN$0, targetList);
                eu.aladdin_project.xsd.SearchCriteria[] result = new eu.aladdin_project.xsd.SearchCriteria[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "warn" element
         */
        public eu.aladdin_project.xsd.SearchCriteria getWarnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SearchCriteria target = null;
                target = (eu.aladdin_project.xsd.SearchCriteria)get_store().find_element_user(WARN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "warn" element
         */
        public int sizeOfWarnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARN$0);
            }
        }
        
        /**
         * Sets array of all "warn" element
         */
        public void setWarnArray(eu.aladdin_project.xsd.SearchCriteria[] warnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(warnArray, WARN$0);
            }
        }
        
        /**
         * Sets ith "warn" element
         */
        public void setWarnArray(int i, eu.aladdin_project.xsd.SearchCriteria warn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SearchCriteria target = null;
                target = (eu.aladdin_project.xsd.SearchCriteria)get_store().find_element_user(WARN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(warn);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "warn" element
         */
        public eu.aladdin_project.xsd.SearchCriteria insertNewWarn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SearchCriteria target = null;
                target = (eu.aladdin_project.xsd.SearchCriteria)get_store().insert_element_user(WARN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "warn" element
         */
        public eu.aladdin_project.xsd.SearchCriteria addNewWarn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SearchCriteria target = null;
                target = (eu.aladdin_project.xsd.SearchCriteria)get_store().add_element_user(WARN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "warn" element
         */
        public void removeWarn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARN$0, i);
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
