/*
 * An XML document type.
 * Localname: DeleteExternalServiceResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one DeleteExternalServiceResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class DeleteExternalServiceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument
{
    
    public DeleteExternalServiceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEEXTERNALSERVICERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "DeleteExternalServiceResponse");
    
    
    /**
     * Gets the "DeleteExternalServiceResponse" element
     */
    public eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse getDeleteExternalServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse)get_store().find_element_user(DELETEEXTERNALSERVICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteExternalServiceResponse" element
     */
    public void setDeleteExternalServiceResponse(eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse deleteExternalServiceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse)get_store().find_element_user(DELETEEXTERNALSERVICERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse)get_store().add_element_user(DELETEEXTERNALSERVICERESPONSE$0);
            }
            target.set(deleteExternalServiceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteExternalServiceResponse" element
     */
    public eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse addNewDeleteExternalServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse)get_store().add_element_user(DELETEEXTERNALSERVICERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteExternalServiceResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class DeleteExternalServiceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse
    {
        
        public DeleteExternalServiceResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
