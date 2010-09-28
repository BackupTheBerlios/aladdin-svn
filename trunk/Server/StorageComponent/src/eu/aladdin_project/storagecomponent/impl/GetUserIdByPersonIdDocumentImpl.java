/*
 * An XML document type.
 * Localname: GetUserIdByPersonId
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetUserIdByPersonId(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetUserIdByPersonIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument
{
    
    public GetUserIdByPersonIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERIDBYPERSONID$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetUserIdByPersonId");
    
    
    /**
     * Gets the "GetUserIdByPersonId" element
     */
    public eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId getGetUserIdByPersonId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId)get_store().find_element_user(GETUSERIDBYPERSONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetUserIdByPersonId" element
     */
    public void setGetUserIdByPersonId(eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId getUserIdByPersonId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId)get_store().find_element_user(GETUSERIDBYPERSONID$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId)get_store().add_element_user(GETUSERIDBYPERSONID$0);
            }
            target.set(getUserIdByPersonId);
        }
    }
    
    /**
     * Appends and returns a new empty "GetUserIdByPersonId" element
     */
    public eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId addNewGetUserIdByPersonId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId)get_store().add_element_user(GETUSERIDBYPERSONID$0);
            return target;
        }
    }
    /**
     * An XML GetUserIdByPersonId(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetUserIdByPersonIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId
    {
        
        public GetUserIdByPersonIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("", "type");
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
         * Gets the "type" element
         */
        public int getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" element
         */
        public org.apache.xmlbeans.XmlInt xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(int type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
                }
                target.setIntValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" element
         */
        public void xsetType(org.apache.xmlbeans.XmlInt type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TYPE$2);
                }
                target.set(type);
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
