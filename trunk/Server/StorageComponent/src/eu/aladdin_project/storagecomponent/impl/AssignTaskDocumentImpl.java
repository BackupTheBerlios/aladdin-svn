/*
 * An XML document type.
 * Localname: AssignTask
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AssignTaskDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one AssignTask(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class AssignTaskDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AssignTaskDocument
{
    
    public AssignTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSIGNTASK$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "AssignTask");
    
    
    /**
     * Gets the "AssignTask" element
     */
    public eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask getAssignTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask)get_store().find_element_user(ASSIGNTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AssignTask" element
     */
    public void setAssignTask(eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask assignTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask)get_store().find_element_user(ASSIGNTASK$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask)get_store().add_element_user(ASSIGNTASK$0);
            }
            target.set(assignTask);
        }
    }
    
    /**
     * Appends and returns a new empty "AssignTask" element
     */
    public eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask addNewAssignTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask)get_store().add_element_user(ASSIGNTASK$0);
            return target;
        }
    }
    /**
     * An XML AssignTask(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class AssignTaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AssignTaskDocument.AssignTask
    {
        
        public AssignTaskImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASK$0 = 
            new javax.xml.namespace.QName("", "task");
        private static final javax.xml.namespace.QName USERID$2 = 
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
