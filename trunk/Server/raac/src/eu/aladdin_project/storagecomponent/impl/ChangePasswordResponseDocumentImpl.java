/*
 * An XML document type.
 * Localname: ChangePasswordResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one ChangePasswordResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class ChangePasswordResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument
{
    
    public ChangePasswordResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANGEPASSWORDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "ChangePasswordResponse");
    
    
    /**
     * Gets the "ChangePasswordResponse" element
     */
    public eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse getChangePasswordResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse)get_store().find_element_user(CHANGEPASSWORDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ChangePasswordResponse" element
     */
    public void setChangePasswordResponse(eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse changePasswordResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse)get_store().find_element_user(CHANGEPASSWORDRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse)get_store().add_element_user(CHANGEPASSWORDRESPONSE$0);
            }
            target.set(changePasswordResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ChangePasswordResponse" element
     */
    public eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse addNewChangePasswordResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse)get_store().add_element_user(CHANGEPASSWORDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ChangePasswordResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class ChangePasswordResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse
    {
        
        public ChangePasswordResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
