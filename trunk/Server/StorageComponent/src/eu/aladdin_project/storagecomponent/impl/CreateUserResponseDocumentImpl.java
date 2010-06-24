/*
 * An XML document type.
 * Localname: CreateUserResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one CreateUserResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class CreateUserResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateUserResponseDocument
{
    
    public CreateUserResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEUSERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "CreateUserResponse");
    
    
    /**
     * Gets the "CreateUserResponse" element
     */
    public eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse getCreateUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse)get_store().find_element_user(CREATEUSERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateUserResponse" element
     */
    public void setCreateUserResponse(eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse createUserResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse)get_store().find_element_user(CREATEUSERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse)get_store().add_element_user(CREATEUSERRESPONSE$0);
            }
            target.set(createUserResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateUserResponse" element
     */
    public eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse addNewCreateUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse)get_store().add_element_user(CREATEUSERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateUserResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class CreateUserResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse
    {
        
        public CreateUserResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.OperationResult getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "out" element
         */
        public void setOut(eu.aladdin_project.xsd.OperationResult out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.OperationResult)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.OperationResult addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
