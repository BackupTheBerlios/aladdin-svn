/*
 * An XML document type.
 * Localname: GetQuestionnaireAnswersByTask
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetQuestionnaireAnswersByTask(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetQuestionnaireAnswersByTaskDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument
{
    
    public GetQuestionnaireAnswersByTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONNAIREANSWERSBYTASK$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetQuestionnaireAnswersByTask");
    
    
    /**
     * Gets the "GetQuestionnaireAnswersByTask" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask getGetQuestionnaireAnswersByTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask)get_store().find_element_user(GETQUESTIONNAIREANSWERSBYTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuestionnaireAnswersByTask" element
     */
    public void setGetQuestionnaireAnswersByTask(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask getQuestionnaireAnswersByTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask)get_store().find_element_user(GETQUESTIONNAIREANSWERSBYTASK$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask)get_store().add_element_user(GETQUESTIONNAIREANSWERSBYTASK$0);
            }
            target.set(getQuestionnaireAnswersByTask);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuestionnaireAnswersByTask" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask addNewGetQuestionnaireAnswersByTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask)get_store().add_element_user(GETQUESTIONNAIREANSWERSBYTASK$0);
            return target;
        }
    }
    /**
     * An XML GetQuestionnaireAnswersByTask(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetQuestionnaireAnswersByTaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument.GetQuestionnaireAnswersByTask
    {
        
        public GetQuestionnaireAnswersByTaskImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKID$0 = 
            new javax.xml.namespace.QName("", "taskId");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "taskId" element
         */
        public java.lang.String getTaskId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taskId" element
         */
        public org.apache.xmlbeans.XmlString xgetTaskId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "taskId" element
         */
        public void setTaskId(java.lang.String taskId)
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
                target.setStringValue(taskId);
            }
        }
        
        /**
         * Sets (as xml) the "taskId" element
         */
        public void xsetTaskId(org.apache.xmlbeans.XmlString taskId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKID$0);
                }
                target.set(taskId);
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
