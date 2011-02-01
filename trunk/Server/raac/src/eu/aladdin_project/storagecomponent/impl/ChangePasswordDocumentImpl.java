/*
 * An XML document type.
 * Localname: ChangePassword
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.ChangePasswordDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one ChangePassword(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class ChangePasswordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ChangePasswordDocument
{
    
    public ChangePasswordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANGEPASSWORD$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "ChangePassword");
    
    
    /**
     * Gets the "ChangePassword" element
     */
    public eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword getChangePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword target = null;
            target = (eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword)get_store().find_element_user(CHANGEPASSWORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ChangePassword" element
     */
    public void setChangePassword(eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword changePassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword target = null;
            target = (eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword)get_store().find_element_user(CHANGEPASSWORD$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword)get_store().add_element_user(CHANGEPASSWORD$0);
            }
            target.set(changePassword);
        }
    }
    
    /**
     * Appends and returns a new empty "ChangePassword" element
     */
    public eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword addNewChangePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword target = null;
            target = (eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword)get_store().add_element_user(CHANGEPASSWORD$0);
            return target;
        }
    }
    /**
     * An XML ChangePassword(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class ChangePasswordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ChangePasswordDocument.ChangePassword
    {
        
        public ChangePasswordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERID$0 = 
            new javax.xml.namespace.QName("", "userId");
        private static final javax.xml.namespace.QName PASSWORD$2 = 
            new javax.xml.namespace.QName("", "password");
        private static final javax.xml.namespace.QName REQID$4 = 
            new javax.xml.namespace.QName("", "reqId");
        
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$0);
                }
                target.set(userId);
            }
        }
        
        /**
         * Gets the "password" element
         */
        public java.lang.String getPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "password" element
         */
        public org.apache.xmlbeans.XmlString xgetPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "password" element
         */
        public void setPassword(java.lang.String password)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$2);
                }
                target.setStringValue(password);
            }
        }
        
        /**
         * Sets (as xml) the "password" element
         */
        public void xsetPassword(org.apache.xmlbeans.XmlString password)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$2);
                }
                target.set(password);
            }
        }
        
        /**
         * Gets the "reqId" element
         */
        public java.lang.String getReqId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "reqId" element
         */
        public org.apache.xmlbeans.XmlString xgetReqId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "reqId" element
         */
        public void setReqId(java.lang.String reqId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQID$4);
                }
                target.setStringValue(reqId);
            }
        }
        
        /**
         * Sets (as xml) the "reqId" element
         */
        public void xsetReqId(org.apache.xmlbeans.XmlString reqId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQID$4);
                }
                target.set(reqId);
            }
        }
    }
}
