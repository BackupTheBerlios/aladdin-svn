/*
 * An XML document type.
 * Localname: UpdatePatientResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdatePatientResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdatePatientResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument
{
    
    public UpdatePatientResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEPATIENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdatePatientResponse");
    
    
    /**
     * Gets the "UpdatePatientResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse getUpdatePatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse)get_store().find_element_user(UPDATEPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdatePatientResponse" element
     */
    public void setUpdatePatientResponse(eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse updatePatientResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse)get_store().find_element_user(UPDATEPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse)get_store().add_element_user(UPDATEPATIENTRESPONSE$0);
            }
            target.set(updatePatientResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdatePatientResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse addNewUpdatePatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse)get_store().add_element_user(UPDATEPATIENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdatePatientResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdatePatientResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse
    {
        
        public UpdatePatientResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
