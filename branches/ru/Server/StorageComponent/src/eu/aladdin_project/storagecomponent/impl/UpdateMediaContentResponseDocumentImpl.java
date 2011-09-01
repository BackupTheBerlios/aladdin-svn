/*
 * An XML document type.
 * Localname: UpdateMediaContentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateMediaContentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateMediaContentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument
{
    
    public UpdateMediaContentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEMEDIACONTENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateMediaContentResponse");
    
    
    /**
     * Gets the "UpdateMediaContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse getUpdateMediaContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse)get_store().find_element_user(UPDATEMEDIACONTENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateMediaContentResponse" element
     */
    public void setUpdateMediaContentResponse(eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse updateMediaContentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse)get_store().find_element_user(UPDATEMEDIACONTENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse)get_store().add_element_user(UPDATEMEDIACONTENTRESPONSE$0);
            }
            target.set(updateMediaContentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateMediaContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse addNewUpdateMediaContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse)get_store().add_element_user(UPDATEMEDIACONTENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateMediaContentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateMediaContentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse
    {
        
        public UpdateMediaContentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
