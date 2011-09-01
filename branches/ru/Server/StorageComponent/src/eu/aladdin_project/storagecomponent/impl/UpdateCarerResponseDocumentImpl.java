/*
 * An XML document type.
 * Localname: UpdateCarerResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateCarerResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateCarerResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument
{
    
    public UpdateCarerResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECARERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateCarerResponse");
    
    
    /**
     * Gets the "UpdateCarerResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse getUpdateCarerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse)get_store().find_element_user(UPDATECARERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateCarerResponse" element
     */
    public void setUpdateCarerResponse(eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse updateCarerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse)get_store().find_element_user(UPDATECARERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse)get_store().add_element_user(UPDATECARERRESPONSE$0);
            }
            target.set(updateCarerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateCarerResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse addNewUpdateCarerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse)get_store().add_element_user(UPDATECARERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateCarerResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateCarerResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse
    {
        
        public UpdateCarerResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
