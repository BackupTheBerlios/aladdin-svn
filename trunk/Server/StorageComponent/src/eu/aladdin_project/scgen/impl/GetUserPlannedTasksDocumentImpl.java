/*
 * An XML document type.
 * Localname: GetUserPlannedTasks
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetUserPlannedTasksDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetUserPlannedTasks(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetUserPlannedTasksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetUserPlannedTasksDocument
{
    
    public GetUserPlannedTasksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERPLANNEDTASKS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetUserPlannedTasks");
    
    
    /**
     * Gets the "GetUserPlannedTasks" element
     */
    public eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks getGetUserPlannedTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks target = null;
            target = (eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks)get_store().find_element_user(GETUSERPLANNEDTASKS$0, 0);
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
    public void setGetUserPlannedTasks(eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks getUserPlannedTasks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks target = null;
            target = (eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks)get_store().find_element_user(GETUSERPLANNEDTASKS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks)get_store().add_element_user(GETUSERPLANNEDTASKS$0);
            }
            target.set(getUserPlannedTasks);
        }
    }
    
    /**
     * Appends and returns a new empty "GetUserPlannedTasks" element
     */
    public eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks addNewGetUserPlannedTasks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks target = null;
            target = (eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks)get_store().add_element_user(GETUSERPLANNEDTASKS$0);
            return target;
        }
    }
    /**
     * An XML GetUserPlannedTasks(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetUserPlannedTasksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetUserPlannedTasksDocument.GetUserPlannedTasks
    {
        
        public GetUserPlannedTasksImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UID$0 = 
            new javax.xml.namespace.QName("", "uid");
        private static final javax.xml.namespace.QName FROMDATA$2 = 
            new javax.xml.namespace.QName("", "fromData");
        private static final javax.xml.namespace.QName TODATA$4 = 
            new javax.xml.namespace.QName("", "toData");
        private static final javax.xml.namespace.QName USERID$6 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "uid" element
         */
        public java.lang.String getUid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "uid" element
         */
        public org.apache.xmlbeans.XmlString xgetUid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "uid" element
         */
        public void setUid(java.lang.String uid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UID$0);
                }
                target.setStringValue(uid);
            }
        }
        
        /**
         * Sets (as xml) the "uid" element
         */
        public void xsetUid(org.apache.xmlbeans.XmlString uid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UID$0);
                }
                target.set(uid);
            }
        }
        
        /**
         * Gets the "fromData" element
         */
        public java.util.Calendar getFromData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "fromData" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetFromData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FROMDATA$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fromData" element
         */
        public void setFromData(java.util.Calendar fromData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMDATA$2);
                }
                target.setCalendarValue(fromData);
            }
        }
        
        /**
         * Sets (as xml) the "fromData" element
         */
        public void xsetFromData(org.apache.xmlbeans.XmlDateTime fromData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FROMDATA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FROMDATA$2);
                }
                target.set(fromData);
            }
        }
        
        /**
         * Gets the "toData" element
         */
        public java.util.Calendar getToData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "toData" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetToData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TODATA$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "toData" element
         */
        public void setToData(java.util.Calendar toData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODATA$4);
                }
                target.setCalendarValue(toData);
            }
        }
        
        /**
         * Sets (as xml) the "toData" element
         */
        public void xsetToData(org.apache.xmlbeans.XmlDateTime toData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TODATA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TODATA$4);
                }
                target.set(toData);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$6);
                }
                target.set(userId);
            }
        }
    }
}
