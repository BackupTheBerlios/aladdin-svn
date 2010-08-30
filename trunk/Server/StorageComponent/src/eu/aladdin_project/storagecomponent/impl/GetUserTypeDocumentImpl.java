/*
 * An XML document type.
 * Localname: GetUserType
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetUserTypeDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetUserType(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetUserTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserTypeDocument
{
    
    public GetUserTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERTYPE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetUserType");
    
    
    /**
     * Gets the "GetUserType" element
     */
    public eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType getGetUserType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType)get_store().find_element_user(GETUSERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetUserType" element
     */
    public void setGetUserType(eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType getUserType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType)get_store().find_element_user(GETUSERTYPE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType)get_store().add_element_user(GETUSERTYPE$0);
            }
            target.set(getUserType);
        }
    }
    
    /**
     * Appends and returns a new empty "GetUserType" element
     */
    public eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType addNewGetUserType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType)get_store().add_element_user(GETUSERTYPE$0);
            return target;
        }
    }
    /**
     * An XML GetUserType(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetUserTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserTypeDocument.GetUserType
    {
        
        public GetUserTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
