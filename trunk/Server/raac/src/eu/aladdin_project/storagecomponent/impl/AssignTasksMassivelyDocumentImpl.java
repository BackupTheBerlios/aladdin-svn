/*
 * An XML document type.
 * Localname: AssignTasksMassively
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one AssignTasksMassively(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class AssignTasksMassivelyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument
{
    
    public AssignTasksMassivelyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSIGNTASKSMASSIVELY$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "AssignTasksMassively");
    
    
    /**
     * Gets the "AssignTasksMassively" element
     */
    public eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively getAssignTasksMassively()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively)get_store().find_element_user(ASSIGNTASKSMASSIVELY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AssignTasksMassively" element
     */
    public void setAssignTasksMassively(eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively assignTasksMassively)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively)get_store().find_element_user(ASSIGNTASKSMASSIVELY$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively)get_store().add_element_user(ASSIGNTASKSMASSIVELY$0);
            }
            target.set(assignTasksMassively);
        }
    }
    
    /**
     * Appends and returns a new empty "AssignTasksMassively" element
     */
    public eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively addNewAssignTasksMassively()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively)get_store().add_element_user(ASSIGNTASKSMASSIVELY$0);
            return target;
        }
    }
    /**
     * An XML AssignTasksMassively(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class AssignTasksMassivelyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument.AssignTasksMassively
    {
        
        public AssignTasksMassivelyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASK$0 = 
            new javax.xml.namespace.QName("", "task");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("", "endDate");
        private static final javax.xml.namespace.QName FREQUENCY$6 = 
            new javax.xml.namespace.QName("", "frequency");
        private static final javax.xml.namespace.QName USERID$8 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "task" element
         */
        public eu.aladdin_project.xsd.Task getTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Task target = null;
                target = (eu.aladdin_project.xsd.Task)get_store().find_element_user(TASK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "task" element
         */
        public void setTask(eu.aladdin_project.xsd.Task task)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Task target = null;
                target = (eu.aladdin_project.xsd.Task)get_store().find_element_user(TASK$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Task)get_store().add_element_user(TASK$0);
                }
                target.set(task);
            }
        }
        
        /**
         * Appends and returns a new empty "task" element
         */
        public eu.aladdin_project.xsd.Task addNewTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Task target = null;
                target = (eu.aladdin_project.xsd.Task)get_store().add_element_user(TASK$0);
                return target;
            }
        }
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$2);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$2);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$4);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Gets the "frequency" element
         */
        public java.math.BigInteger getFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREQUENCY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "frequency" element
         */
        public org.apache.xmlbeans.XmlInteger xgetFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREQUENCY$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "frequency" element
         */
        public void setFrequency(java.math.BigInteger frequency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREQUENCY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREQUENCY$6);
                }
                target.setBigIntegerValue(frequency);
            }
        }
        
        /**
         * Sets (as xml) the "frequency" element
         */
        public void xsetFrequency(org.apache.xmlbeans.XmlInteger frequency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREQUENCY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREQUENCY$6);
                }
                target.set(frequency);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$8);
                }
                target.set(userId);
            }
        }
    }
}
