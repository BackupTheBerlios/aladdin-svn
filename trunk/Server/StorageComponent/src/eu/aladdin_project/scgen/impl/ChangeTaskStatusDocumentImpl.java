/*
 * An XML document type.
 * Localname: ChangeTaskStatus
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.ChangeTaskStatusDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one ChangeTaskStatus(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class ChangeTaskStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ChangeTaskStatusDocument
{
    
    public ChangeTaskStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANGETASKSTATUS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "ChangeTaskStatus");
    
    
    /**
     * Gets the "ChangeTaskStatus" element
     */
    public eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus getChangeTaskStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus target = null;
            target = (eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus)get_store().find_element_user(CHANGETASKSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ChangeTaskStatus" element
     */
    public void setChangeTaskStatus(eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus changeTaskStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus target = null;
            target = (eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus)get_store().find_element_user(CHANGETASKSTATUS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus)get_store().add_element_user(CHANGETASKSTATUS$0);
            }
            target.set(changeTaskStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "ChangeTaskStatus" element
     */
    public eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus addNewChangeTaskStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus target = null;
            target = (eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus)get_store().add_element_user(CHANGETASKSTATUS$0);
            return target;
        }
    }
    /**
     * An XML ChangeTaskStatus(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class ChangeTaskStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ChangeTaskStatusDocument.ChangeTaskStatus
    {
        
        public ChangeTaskStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKID$0 = 
            new javax.xml.namespace.QName("", "TaskId");
        private static final javax.xml.namespace.QName TASKSTATUS$2 = 
            new javax.xml.namespace.QName("", "TaskStatus");
        private static final javax.xml.namespace.QName USERID$4 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "TaskId" element
         */
        public int getTaskId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaskId" element
         */
        public org.apache.xmlbeans.XmlInt xgetTaskId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaskId" element
         */
        public void setTaskId(int taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKID$0);
                }
                target.setIntValue(taskId);
            }
        }
        
        /**
         * Sets (as xml) the "TaskId" element
         */
        public void xsetTaskId(org.apache.xmlbeans.XmlInt taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TASKID$0);
                }
                target.set(taskId);
            }
        }
        
        /**
         * Gets the "TaskStatus" element
         */
        public int getTaskStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKSTATUS$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "TaskStatus" element
         */
        public org.apache.xmlbeans.XmlInt xgetTaskStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKSTATUS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TaskStatus" element
         */
        public void setTaskStatus(int taskStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKSTATUS$2);
                }
                target.setIntValue(taskStatus);
            }
        }
        
        /**
         * Sets (as xml) the "TaskStatus" element
         */
        public void xsetTaskStatus(org.apache.xmlbeans.XmlInt taskStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TASKSTATUS$2);
                }
                target.set(taskStatus);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$4);
                }
                target.set(userId);
            }
        }
    }
}
