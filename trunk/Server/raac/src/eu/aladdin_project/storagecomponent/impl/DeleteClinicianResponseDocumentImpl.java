/*
 * An XML document type.
 * Localname: DeleteClinicianResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one DeleteClinicianResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class DeleteClinicianResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument
{
    
    public DeleteClinicianResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECLINICIANRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "DeleteClinicianResponse");
    
    
    /**
     * Gets the "DeleteClinicianResponse" element
     */
    public eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse getDeleteClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse)get_store().find_element_user(DELETECLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteClinicianResponse" element
     */
    public void setDeleteClinicianResponse(eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse deleteClinicianResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse)get_store().find_element_user(DELETECLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse)get_store().add_element_user(DELETECLINICIANRESPONSE$0);
            }
            target.set(deleteClinicianResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteClinicianResponse" element
     */
    public eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse addNewDeleteClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse)get_store().add_element_user(DELETECLINICIANRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteClinicianResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class DeleteClinicianResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse
    {
        
        public DeleteClinicianResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
