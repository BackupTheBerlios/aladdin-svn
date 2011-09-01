/*
 * An XML document type.
 * Localname: GetTask
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetTaskDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetTask(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetTaskDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetTaskDocument
{
    
    public GetTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASK$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetTask");
    
    
    /**
     * Gets the "GetTask" element
     */
    public eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask getGetTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask target = null;
            target = (eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask)get_store().find_element_user(GETTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetTask" element
     */
    public void setGetTask(eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask getTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask target = null;
            target = (eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask)get_store().find_element_user(GETTASK$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask)get_store().add_element_user(GETTASK$0);
            }
            target.set(getTask);
        }
    }
    
    /**
     * Appends and returns a new empty "GetTask" element
     */
    public eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask addNewGetTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask target = null;
            target = (eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask)get_store().add_element_user(GETTASK$0);
            return target;
        }
    }
    /**
     * An XML GetTask(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetTaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetTaskDocument.GetTask
    {
        
        public GetTaskImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName LOCALE$2 = 
            new javax.xml.namespace.QName("", "locale");
        private static final javax.xml.namespace.QName USERID$4 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
                }
                target.set(id);
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
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$2, 0);
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
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$2, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$2);
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
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$2);
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
