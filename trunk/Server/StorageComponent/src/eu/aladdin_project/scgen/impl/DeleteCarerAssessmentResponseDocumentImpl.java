/*
 * An XML document type.
 * Localname: DeleteCarerAssessmentResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one DeleteCarerAssessmentResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class DeleteCarerAssessmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument
{
    
    public DeleteCarerAssessmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECARERASSESSMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "DeleteCarerAssessmentResponse");
    
    
    /**
     * Gets the "DeleteCarerAssessmentResponse" element
     */
    public eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse getDeleteCarerAssessmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse)get_store().find_element_user(DELETECARERASSESSMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteCarerAssessmentResponse" element
     */
    public void setDeleteCarerAssessmentResponse(eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse deleteCarerAssessmentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse)get_store().find_element_user(DELETECARERASSESSMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse)get_store().add_element_user(DELETECARERASSESSMENTRESPONSE$0);
            }
            target.set(deleteCarerAssessmentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteCarerAssessmentResponse" element
     */
    public eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse addNewDeleteCarerAssessmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse)get_store().add_element_user(DELETECARERASSESSMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteCarerAssessmentResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class DeleteCarerAssessmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse
    {
        
        public DeleteCarerAssessmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
