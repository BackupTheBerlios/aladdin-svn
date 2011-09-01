/*
 * An XML document type.
 * Localname: CreateCarerResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateCarerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one CreateCarerResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class CreateCarerResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateCarerResponseDocument
{
    
    public CreateCarerResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECARERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "CreateCarerResponse");
    
    
    /**
     * Gets the "CreateCarerResponse" element
     */
    public eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse getCreateCarerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse)get_store().find_element_user(CREATECARERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateCarerResponse" element
     */
    public void setCreateCarerResponse(eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse createCarerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse)get_store().find_element_user(CREATECARERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse)get_store().add_element_user(CREATECARERRESPONSE$0);
            }
            target.set(createCarerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateCarerResponse" element
     */
    public eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse addNewCreateCarerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse)get_store().add_element_user(CREATECARERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateCarerResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class CreateCarerResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse
    {
        
        public CreateCarerResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
