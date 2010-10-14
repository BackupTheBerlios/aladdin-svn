/*
 * An XML document type.
 * Localname: UpdateSystemParameterResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateSystemParameterResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateSystemParameterResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument
{
    
    public UpdateSystemParameterResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATESYSTEMPARAMETERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateSystemParameterResponse");
    
    
    /**
     * Gets the "UpdateSystemParameterResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse getUpdateSystemParameterResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse)get_store().find_element_user(UPDATESYSTEMPARAMETERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateSystemParameterResponse" element
     */
    public void setUpdateSystemParameterResponse(eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse updateSystemParameterResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse)get_store().find_element_user(UPDATESYSTEMPARAMETERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse)get_store().add_element_user(UPDATESYSTEMPARAMETERRESPONSE$0);
            }
            target.set(updateSystemParameterResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateSystemParameterResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse addNewUpdateSystemParameterResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse)get_store().add_element_user(UPDATESYSTEMPARAMETERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateSystemParameterResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateSystemParameterResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse
    {
        
        public UpdateSystemParameterResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
