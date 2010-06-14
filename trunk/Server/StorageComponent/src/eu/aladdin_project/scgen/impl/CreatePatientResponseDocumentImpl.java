/*
 * An XML document type.
 * Localname: CreatePatientResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.CreatePatientResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one CreatePatientResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class CreatePatientResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreatePatientResponseDocument
{
    
    public CreatePatientResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPATIENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "CreatePatientResponse");
    
    
    /**
     * Gets the "CreatePatientResponse" element
     */
    public eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse getCreatePatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse target = null;
            target = (eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse)get_store().find_element_user(CREATEPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatePatientResponse" element
     */
    public void setCreatePatientResponse(eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse createPatientResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse target = null;
            target = (eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse)get_store().find_element_user(CREATEPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse)get_store().add_element_user(CREATEPATIENTRESPONSE$0);
            }
            target.set(createPatientResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatePatientResponse" element
     */
    public eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse addNewCreatePatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse target = null;
            target = (eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse)get_store().add_element_user(CREATEPATIENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreatePatientResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class CreatePatientResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreatePatientResponseDocument.CreatePatientResponse
    {
        
        public CreatePatientResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
