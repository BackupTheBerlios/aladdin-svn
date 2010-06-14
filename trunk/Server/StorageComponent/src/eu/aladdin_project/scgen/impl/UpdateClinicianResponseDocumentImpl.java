/*
 * An XML document type.
 * Localname: UpdateClinicianResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.UpdateClinicianResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one UpdateClinicianResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class UpdateClinicianResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateClinicianResponseDocument
{
    
    public UpdateClinicianResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECLINICIANRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "UpdateClinicianResponse");
    
    
    /**
     * Gets the "UpdateClinicianResponse" element
     */
    public eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse getUpdateClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse)get_store().find_element_user(UPDATECLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateClinicianResponse" element
     */
    public void setUpdateClinicianResponse(eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse updateClinicianResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse)get_store().find_element_user(UPDATECLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse)get_store().add_element_user(UPDATECLINICIANRESPONSE$0);
            }
            target.set(updateClinicianResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateClinicianResponse" element
     */
    public eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse addNewUpdateClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse)get_store().add_element_user(UPDATECLINICIANRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateClinicianResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class UpdateClinicianResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateClinicianResponseDocument.UpdateClinicianResponse
    {
        
        public UpdateClinicianResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
