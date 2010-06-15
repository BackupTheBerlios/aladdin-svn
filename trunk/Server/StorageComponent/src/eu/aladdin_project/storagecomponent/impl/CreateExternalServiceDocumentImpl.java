/*
 * An XML document type.
 * Localname: CreateExternalService
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateExternalServiceDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one CreateExternalService(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class CreateExternalServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateExternalServiceDocument
{
    
    public CreateExternalServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEEXTERNALSERVICE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "CreateExternalService");
    
    
    /**
     * Gets the "CreateExternalService" element
     */
    public eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService getCreateExternalService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService target = null;
            target = (eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService)get_store().find_element_user(CREATEEXTERNALSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateExternalService" element
     */
    public void setCreateExternalService(eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService createExternalService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService target = null;
            target = (eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService)get_store().find_element_user(CREATEEXTERNALSERVICE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService)get_store().add_element_user(CREATEEXTERNALSERVICE$0);
            }
            target.set(createExternalService);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateExternalService" element
     */
    public eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService addNewCreateExternalService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService target = null;
            target = (eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService)get_store().add_element_user(CREATEEXTERNALSERVICE$0);
            return target;
        }
    }
    /**
     * An XML CreateExternalService(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class CreateExternalServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateExternalServiceDocument.CreateExternalService
    {
        
        public CreateExternalServiceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATA$0 = 
            new javax.xml.namespace.QName("", "data");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "data" element
         */
        public eu.aladdin_project.xsd.ExternalService getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ExternalService target = null;
                target = (eu.aladdin_project.xsd.ExternalService)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(eu.aladdin_project.xsd.ExternalService data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ExternalService target = null;
                target = (eu.aladdin_project.xsd.ExternalService)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.ExternalService)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public eu.aladdin_project.xsd.ExternalService addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ExternalService target = null;
                target = (eu.aladdin_project.xsd.ExternalService)get_store().add_element_user(DATA$0);
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
