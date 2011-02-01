/*
 * An XML document type.
 * Localname: UpdateAdministrator
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateAdministratorDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateAdministrator(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateAdministratorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateAdministratorDocument
{
    
    public UpdateAdministratorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEADMINISTRATOR$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateAdministrator");
    
    
    /**
     * Gets the "UpdateAdministrator" element
     */
    public eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator getUpdateAdministrator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator)get_store().find_element_user(UPDATEADMINISTRATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateAdministrator" element
     */
    public void setUpdateAdministrator(eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator updateAdministrator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator)get_store().find_element_user(UPDATEADMINISTRATOR$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator)get_store().add_element_user(UPDATEADMINISTRATOR$0);
            }
            target.set(updateAdministrator);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateAdministrator" element
     */
    public eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator addNewUpdateAdministrator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator)get_store().add_element_user(UPDATEADMINISTRATOR$0);
            return target;
        }
    }
    /**
     * An XML UpdateAdministrator(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateAdministratorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateAdministratorDocument.UpdateAdministrator
    {
        
        public UpdateAdministratorImpl(org.apache.xmlbeans.SchemaType sType)
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
        public eu.aladdin_project.xsd.Administrator getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Administrator target = null;
                target = (eu.aladdin_project.xsd.Administrator)get_store().find_element_user(DATA$0, 0);
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
        public void setData(eu.aladdin_project.xsd.Administrator data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Administrator target = null;
                target = (eu.aladdin_project.xsd.Administrator)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Administrator)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public eu.aladdin_project.xsd.Administrator addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Administrator target = null;
                target = (eu.aladdin_project.xsd.Administrator)get_store().add_element_user(DATA$0);
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
