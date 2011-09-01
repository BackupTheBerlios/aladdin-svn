/*
 * An XML document type.
 * Localname: UpdateUserResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateUserResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateUserResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateUserResponseDocument
{
    
    public UpdateUserResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEUSERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateUserResponse");
    
    
    /**
     * Gets the "UpdateUserResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse getUpdateUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse)get_store().find_element_user(UPDATEUSERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateUserResponse" element
     */
    public void setUpdateUserResponse(eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse updateUserResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse)get_store().find_element_user(UPDATEUSERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse)get_store().add_element_user(UPDATEUSERRESPONSE$0);
            }
            target.set(updateUserResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateUserResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse addNewUpdateUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse)get_store().add_element_user(UPDATEUSERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateUserResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateUserResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse
    {
        
        public UpdateUserResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
