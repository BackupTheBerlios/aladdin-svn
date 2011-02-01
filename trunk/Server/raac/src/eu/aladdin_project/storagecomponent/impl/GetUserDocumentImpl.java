/*
 * An XML document type.
 * Localname: GetUser
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetUserDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetUser(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetUserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserDocument
{
    
    public GetUserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetUser");
    
    
    /**
     * Gets the "GetUser" element
     */
    public eu.aladdin_project.storagecomponent.GetUserDocument.GetUser getGetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserDocument.GetUser target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserDocument.GetUser)get_store().find_element_user(GETUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetUser" element
     */
    public void setGetUser(eu.aladdin_project.storagecomponent.GetUserDocument.GetUser getUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserDocument.GetUser target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserDocument.GetUser)get_store().find_element_user(GETUSER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetUserDocument.GetUser)get_store().add_element_user(GETUSER$0);
            }
            target.set(getUser);
        }
    }
    
    /**
     * Appends and returns a new empty "GetUser" element
     */
    public eu.aladdin_project.storagecomponent.GetUserDocument.GetUser addNewGetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserDocument.GetUser target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserDocument.GetUser)get_store().add_element_user(GETUSER$0);
            return target;
        }
    }
    /**
     * An XML GetUser(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetUserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserDocument.GetUser
    {
        
        public GetUserImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        
        
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
    }
}
