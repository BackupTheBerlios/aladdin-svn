/*
 * An XML document type.
 * Localname: CreateUser
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateUserDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one CreateUser(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class CreateUserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateUserDocument
{
    
    public CreateUserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEUSER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "CreateUser");
    
    
    /**
     * Gets the "CreateUser" element
     */
    public eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser getCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser target = null;
            target = (eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser)get_store().find_element_user(CREATEUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateUser" element
     */
    public void setCreateUser(eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser createUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser target = null;
            target = (eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser)get_store().find_element_user(CREATEUSER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser)get_store().add_element_user(CREATEUSER$0);
            }
            target.set(createUser);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateUser" element
     */
    public eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser addNewCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser target = null;
            target = (eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser)get_store().add_element_user(CREATEUSER$0);
            return target;
        }
    }
    /**
     * An XML CreateUser(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class CreateUserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateUserDocument.CreateUser
    {
        
        public CreateUserImpl(org.apache.xmlbeans.SchemaType sType)
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
