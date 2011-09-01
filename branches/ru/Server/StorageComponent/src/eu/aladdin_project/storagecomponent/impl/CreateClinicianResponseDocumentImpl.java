/*
 * An XML document type.
 * Localname: CreateClinicianResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one CreateClinicianResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class CreateClinicianResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument
{
    
    public CreateClinicianResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECLINICIANRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "CreateClinicianResponse");
    
    
    /**
     * Gets the "CreateClinicianResponse" element
     */
    public eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse getCreateClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse)get_store().find_element_user(CREATECLINICIANRESPONSE$0, 0);
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
    public void setCreateClinicianResponse(eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse createClinicianResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse)get_store().find_element_user(CREATECLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse)get_store().add_element_user(CREATECLINICIANRESPONSE$0);
            }
            target.set(createClinicianResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateClinicianResponse" element
     */
    public eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse addNewCreateClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse)get_store().add_element_user(CREATECLINICIANRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateClinicianResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class CreateClinicianResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse
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
