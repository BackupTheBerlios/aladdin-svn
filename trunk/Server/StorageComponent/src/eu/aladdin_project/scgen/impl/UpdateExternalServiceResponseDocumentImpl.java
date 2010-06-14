/*
 * An XML document type.
 * Localname: UpdateExternalServiceResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one UpdateExternalServiceResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class UpdateExternalServiceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument
{
    
    public UpdateExternalServiceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEEXTERNALSERVICERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "UpdateExternalServiceResponse");
    
    
    /**
     * Gets the "UpdateExternalServiceResponse" element
     */
    public eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse getUpdateExternalServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse)get_store().find_element_user(UPDATEEXTERNALSERVICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateExternalServiceResponse" element
     */
    public void setUpdateExternalServiceResponse(eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse updateExternalServiceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse)get_store().find_element_user(UPDATEEXTERNALSERVICERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse)get_store().add_element_user(UPDATEEXTERNALSERVICERESPONSE$0);
            }
            target.set(updateExternalServiceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateExternalServiceResponse" element
     */
    public eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse addNewUpdateExternalServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse)get_store().add_element_user(UPDATEEXTERNALSERVICERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateExternalServiceResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class UpdateExternalServiceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse
    {
        
        public UpdateExternalServiceResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
