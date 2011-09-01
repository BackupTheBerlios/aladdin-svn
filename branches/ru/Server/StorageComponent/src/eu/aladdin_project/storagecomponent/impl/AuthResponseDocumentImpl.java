/*
 * An XML document type.
 * Localname: AuthResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AuthResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one AuthResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class AuthResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AuthResponseDocument
{
    
    public AuthResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "AuthResponse");
    
    
    /**
     * Gets the "AuthResponse" element
     */
    public eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse getAuthResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse)get_store().find_element_user(AUTHRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuthResponse" element
     */
    public void setAuthResponse(eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse authResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse)get_store().find_element_user(AUTHRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse)get_store().add_element_user(AUTHRESPONSE$0);
            }
            target.set(authResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AuthResponse" element
     */
    public eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse addNewAuthResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse)get_store().add_element_user(AUTHRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AuthResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class AuthResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse
    {
        
        public AuthResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
