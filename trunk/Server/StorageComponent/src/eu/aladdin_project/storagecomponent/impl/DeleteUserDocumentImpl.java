/*
 * An XML document type.
 * Localname: DeleteUser
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.DeleteUserDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one DeleteUser(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class DeleteUserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteUserDocument
{
    
    public DeleteUserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEUSER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "DeleteUser");
    
    
    /**
     * Gets the "DeleteUser" element
     */
    public eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser getDeleteUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser)get_store().find_element_user(DELETEUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteUser" element
     */
    public void setDeleteUser(eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser deleteUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser)get_store().find_element_user(DELETEUSER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser)get_store().add_element_user(DELETEUSER$0);
            }
            target.set(deleteUser);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteUser" element
     */
    public eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser addNewDeleteUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser)get_store().add_element_user(DELETEUSER$0);
            return target;
        }
    }
    /**
     * An XML DeleteUser(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class DeleteUserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteUserDocument.DeleteUser
    {
        
        public DeleteUserImpl(org.apache.xmlbeans.SchemaType sType)
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
