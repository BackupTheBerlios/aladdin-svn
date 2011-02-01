/*
 * An XML document type.
 * Localname: CreateAdministrator
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateAdministratorDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one CreateAdministrator(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class CreateAdministratorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateAdministratorDocument
{
    
    public CreateAdministratorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEADMINISTRATOR$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "CreateAdministrator");
    
    
    /**
     * Gets the "CreateAdministrator" element
     */
    public eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator getCreateAdministrator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator target = null;
            target = (eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator)get_store().find_element_user(CREATEADMINISTRATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateAdministrator" element
     */
    public void setCreateAdministrator(eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator createAdministrator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator target = null;
            target = (eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator)get_store().find_element_user(CREATEADMINISTRATOR$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator)get_store().add_element_user(CREATEADMINISTRATOR$0);
            }
            target.set(createAdministrator);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateAdministrator" element
     */
    public eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator addNewCreateAdministrator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator target = null;
            target = (eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator)get_store().add_element_user(CREATEADMINISTRATOR$0);
            return target;
        }
    }
    /**
     * An XML CreateAdministrator(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class CreateAdministratorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateAdministratorDocument.CreateAdministrator
    {
        
        public CreateAdministratorImpl(org.apache.xmlbeans.SchemaType sType)
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
