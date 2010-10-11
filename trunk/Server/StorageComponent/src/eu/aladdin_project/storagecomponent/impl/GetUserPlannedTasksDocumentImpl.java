/*
 * An XML document type.
 * Localname: GetUserPlannedTasks
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetUserPlannedTasks(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetUserPlannedTasksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument
{
    
    public GetUserPlannedTasksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERPLANNEDTASKS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetUserPlannedTasks");
    
    
    /**
     * Gets the "GetUserPlannedTasks" element
     */
    public eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks getGetUserPlannedTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks)get_store().find_element_user(GETUSERPLANNEDTASKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetUserPlannedTasks" element
     */
    public void setGetUserPlannedTasks(eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks getUserPlannedTasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks)get_store().find_element_user(GETUSERPLANNEDTASKS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks)get_store().add_element_user(GETUSERPLANNEDTASKS$0);
            }
            target.set(getUserPlannedTasks);
        }
    }
    
    /**
     * Appends and returns a new empty "GetUserPlannedTasks" element
     */
    public eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks addNewGetUserPlannedTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks)get_store().add_element_user(GETUSERPLANNEDTASKS$0);
            return target;
        }
    }
    /**
     * An XML GetUserPlannedTasks(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetUserPlannedTasksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument.GetUserPlannedTasks
    {
        
        public GetUserPlannedTasksImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERID$0 = 
            new javax.xml.namespace.QName("", "userId");
        private static final javax.xml.namespace.QName FROMDATE$2 = 
            new javax.xml.namespace.QName("", "fromDate");
        private static final javax.xml.namespace.QName TODATE$4 = 
            new javax.xml.namespace.QName("", "toDate");
        private static final javax.xml.namespace.QName LOCALE$6 = 
            new javax.xml.namespace.QName("", "locale");
        private static final javax.xml.namespace.QName REQUESTERID$8 = 
            new javax.xml.namespace.QName("", "requesterId");
        
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$0);
                }
                target.set(userId);
            }
        }
        
        /**
         * Gets the "fromDate" element
         */
        public java.util.Calendar getFromDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "fromDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetFromDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FROMDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fromDate" element
         */
        public void setFromDate(java.util.Calendar fromDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMDATE$2);
                }
                target.setCalendarValue(fromDate);
            }
        }
        
        /**
         * Sets (as xml) the "fromDate" element
         */
        public void xsetFromDate(org.apache.xmlbeans.XmlDateTime fromDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FROMDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FROMDATE$2);
                }
                target.set(fromDate);
            }
        }
        
        /**
         * Gets the "toDate" element
         */
        public java.util.Calendar getToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "toDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TODATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "toDate" element
         */
        public void setToDate(java.util.Calendar toDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODATE$4);
                }
                target.setCalendarValue(toDate);
            }
        }
        
        /**
         * Sets (as xml) the "toDate" element
         */
        public void xsetToDate(org.apache.xmlbeans.XmlDateTime toDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TODATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TODATE$4);
                }
                target.set(toDate);
            }
        }
        
        /**
         * Gets the "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter getLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "locale" element
         */
        public void setLocale(eu.aladdin_project.xsd.SystemParameter locale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$6, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$6);
                }
                target.set(locale);
            }
        }
        
        /**
         * Appends and returns a new empty "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter addNewLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$6);
                return target;
            }
        }
        
        /**
         * Gets the "requesterId" element
         */
        public java.lang.String getRequesterId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTERID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "requesterId" element
         */
        public org.apache.xmlbeans.XmlString xgetRequesterId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTERID$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "requesterId" element
         */
        public void setRequesterId(java.lang.String requesterId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTERID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTERID$8);
                }
                target.setStringValue(requesterId);
            }
        }
        
        /**
         * Sets (as xml) the "requesterId" element
         */
        public void xsetRequesterId(org.apache.xmlbeans.XmlString requesterId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTERID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTERID$8);
                }
                target.set(requesterId);
            }
        }
    }
}
