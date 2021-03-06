/*
 * An XML document type.
 * Localname: UpdateExternalService
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateExternalService(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateExternalServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument
{
    
    public UpdateExternalServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEEXTERNALSERVICE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateExternalService");
    
    
    /**
     * Gets the "UpdateExternalService" element
     */
    public eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService getUpdateExternalService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService)get_store().find_element_user(UPDATEEXTERNALSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateExternalService" element
     */
    public void setUpdateExternalService(eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService updateExternalService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService)get_store().find_element_user(UPDATEEXTERNALSERVICE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService)get_store().add_element_user(UPDATEEXTERNALSERVICE$0);
            }
            target.set(updateExternalService);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateExternalService" element
     */
    public eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService addNewUpdateExternalService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService)get_store().add_element_user(UPDATEEXTERNALSERVICE$0);
            return target;
        }
    }
    /**
     * An XML UpdateExternalService(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateExternalServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument.UpdateExternalService
    {
        
        public UpdateExternalServiceImpl(org.apache.xmlbeans.SchemaType sType)
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
