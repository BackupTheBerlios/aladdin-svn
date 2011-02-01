/*
 * An XML document type.
 * Localname: DeleteUserResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.DeleteUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one DeleteUserResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class DeleteUserResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteUserResponseDocument
{
    
    public DeleteUserResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEUSERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "DeleteUserResponse");
    
    
    /**
     * Gets the "DeleteUserResponse" element
     */
    public eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse getDeleteUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse)get_store().find_element_user(DELETEUSERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteUserResponse" element
     */
    public void setDeleteUserResponse(eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse deleteUserResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse)get_store().find_element_user(DELETEUSERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse)get_store().add_element_user(DELETEUSERRESPONSE$0);
            }
            target.set(deleteUserResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteUserResponse" element
     */
    public eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse addNewDeleteUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse)get_store().add_element_user(DELETEUSERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteUserResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class DeleteUserResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse
    {
        
        public DeleteUserResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
