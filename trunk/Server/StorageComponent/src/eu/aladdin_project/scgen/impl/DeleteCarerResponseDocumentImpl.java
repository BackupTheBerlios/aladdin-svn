/*
 * An XML document type.
 * Localname: DeleteCarerResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.DeleteCarerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one DeleteCarerResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class DeleteCarerResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteCarerResponseDocument
{
    
    public DeleteCarerResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECARERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "DeleteCarerResponse");
    
    
    /**
     * Gets the "DeleteCarerResponse" element
     */
    public eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse getDeleteCarerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse)get_store().find_element_user(DELETECARERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteCarerResponse" element
     */
    public void setDeleteCarerResponse(eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse deleteCarerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse)get_store().find_element_user(DELETECARERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse)get_store().add_element_user(DELETECARERRESPONSE$0);
            }
            target.set(deleteCarerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteCarerResponse" element
     */
    public eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse addNewDeleteCarerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse)get_store().add_element_user(DELETECARERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteCarerResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class DeleteCarerResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteCarerResponseDocument.DeleteCarerResponse
    {
        
        public DeleteCarerResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
