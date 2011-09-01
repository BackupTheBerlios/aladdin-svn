/*
 * An XML document type.
 * Localname: DeleteMediaContentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one DeleteMediaContentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class DeleteMediaContentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument
{
    
    public DeleteMediaContentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEMEDIACONTENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "DeleteMediaContentResponse");
    
    
    /**
     * Gets the "DeleteMediaContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse getDeleteMediaContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse)get_store().find_element_user(DELETEMEDIACONTENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteMediaContentResponse" element
     */
    public void setDeleteMediaContentResponse(eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse deleteMediaContentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse)get_store().find_element_user(DELETEMEDIACONTENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse)get_store().add_element_user(DELETEMEDIACONTENTRESPONSE$0);
            }
            target.set(deleteMediaContentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteMediaContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse addNewDeleteMediaContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse)get_store().add_element_user(DELETEMEDIACONTENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteMediaContentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class DeleteMediaContentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse
    {
        
        public DeleteMediaContentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
