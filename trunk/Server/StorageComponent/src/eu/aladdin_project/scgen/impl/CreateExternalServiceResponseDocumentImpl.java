/*
 * An XML document type.
 * Localname: CreateExternalServiceResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.CreateExternalServiceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one CreateExternalServiceResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class CreateExternalServiceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreateExternalServiceResponseDocument
{
    
    public CreateExternalServiceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEEXTERNALSERVICERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "CreateExternalServiceResponse");
    
    
    /**
     * Gets the "CreateExternalServiceResponse" element
     */
    public eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse getCreateExternalServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse)get_store().find_element_user(CREATEEXTERNALSERVICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateExternalServiceResponse" element
     */
    public void setCreateExternalServiceResponse(eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse createExternalServiceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse)get_store().find_element_user(CREATEEXTERNALSERVICERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse)get_store().add_element_user(CREATEEXTERNALSERVICERESPONSE$0);
            }
            target.set(createExternalServiceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateExternalServiceResponse" element
     */
    public eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse addNewCreateExternalServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse)get_store().add_element_user(CREATEEXTERNALSERVICERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateExternalServiceResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class CreateExternalServiceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreateExternalServiceResponseDocument.CreateExternalServiceResponse
    {
        
        public CreateExternalServiceResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
