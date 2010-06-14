/*
 * An XML document type.
 * Localname: CreateClinicianResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.CreateClinicianResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one CreateClinicianResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class CreateClinicianResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreateClinicianResponseDocument
{
    
    public CreateClinicianResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECLINICIANRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "CreateClinicianResponse");
    
    
    /**
     * Gets the "CreateClinicianResponse" element
     */
    public eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse getCreateClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse target = null;
            target = (eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse)get_store().find_element_user(CREATECLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateClinicianResponse" element
     */
    public void setCreateClinicianResponse(eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse createClinicianResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse target = null;
            target = (eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse)get_store().find_element_user(CREATECLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse)get_store().add_element_user(CREATECLINICIANRESPONSE$0);
            }
            target.set(createClinicianResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateClinicianResponse" element
     */
    public eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse addNewCreateClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse target = null;
            target = (eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse)get_store().add_element_user(CREATECLINICIANRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateClinicianResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class CreateClinicianResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreateClinicianResponseDocument.CreateClinicianResponse
    {
        
        public CreateClinicianResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
