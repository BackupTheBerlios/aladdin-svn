/*
 * An XML document type.
 * Localname: GetUserTypeResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetUserTypeResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetUserTypeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument
{
    
    public GetUserTypeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERTYPERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetUserTypeResponse");
    
    
    /**
     * Gets the "GetUserTypeResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse getGetUserTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse)get_store().find_element_user(GETUSERTYPERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetUserTypeResponse" element
     */
    public void setGetUserTypeResponse(eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse getUserTypeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse)get_store().find_element_user(GETUSERTYPERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse)get_store().add_element_user(GETUSERTYPERESPONSE$0);
            }
            target.set(getUserTypeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetUserTypeResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse addNewGetUserTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse)get_store().add_element_user(GETUSERTYPERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetUserTypeResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetUserTypeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse
    {
        
        public GetUserTypeResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
