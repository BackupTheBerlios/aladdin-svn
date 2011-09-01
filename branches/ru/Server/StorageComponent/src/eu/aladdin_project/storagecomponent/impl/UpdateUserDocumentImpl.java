/*
 * An XML document type.
 * Localname: UpdateUser
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateUserDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateUser(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateUserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateUserDocument
{
    
    public UpdateUserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEUSER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateUser");
    
    
    /**
     * Gets the "UpdateUser" element
     */
    public eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser getUpdateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser)get_store().find_element_user(UPDATEUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateUser" element
     */
    public void setUpdateUser(eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser updateUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser)get_store().find_element_user(UPDATEUSER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser)get_store().add_element_user(UPDATEUSER$0);
            }
            target.set(updateUser);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateUser" element
     */
    public eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser addNewUpdateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser)get_store().add_element_user(UPDATEUSER$0);
            return target;
        }
    }
    /**
     * An XML UpdateUser(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateUserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateUserDocument.UpdateUser
    {
        
        public UpdateUserImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USER$0 = 
            new javax.xml.namespace.QName("", "user");
        
        
        /**
         * Gets the "user" element
         */
        public eu.aladdin_project.xsd.User getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.User target = null;
                target = (eu.aladdin_project.xsd.User)get_store().find_element_user(USER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "user" element
         */
        public void setUser(eu.aladdin_project.xsd.User user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.User target = null;
                target = (eu.aladdin_project.xsd.User)get_store().find_element_user(USER$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.User)get_store().add_element_user(USER$0);
                }
                target.set(user);
            }
        }
        
        /**
         * Appends and returns a new empty "user" element
         */
        public eu.aladdin_project.xsd.User addNewUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.User target = null;
                target = (eu.aladdin_project.xsd.User)get_store().add_element_user(USER$0);
                return target;
            }
        }
    }
}
