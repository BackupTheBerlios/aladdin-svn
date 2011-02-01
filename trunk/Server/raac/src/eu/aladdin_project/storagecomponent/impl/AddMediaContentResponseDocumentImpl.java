/*
 * An XML document type.
 * Localname: AddMediaContentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one AddMediaContentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class AddMediaContentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument
{
    
    public AddMediaContentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDMEDIACONTENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "AddMediaContentResponse");
    
    
    /**
     * Gets the "AddMediaContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse getAddMediaContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse)get_store().find_element_user(ADDMEDIACONTENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddMediaContentResponse" element
     */
    public void setAddMediaContentResponse(eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse addMediaContentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse)get_store().find_element_user(ADDMEDIACONTENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse)get_store().add_element_user(ADDMEDIACONTENTRESPONSE$0);
            }
            target.set(addMediaContentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AddMediaContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse addNewAddMediaContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse)get_store().add_element_user(ADDMEDIACONTENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddMediaContentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class AddMediaContentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse
    {
        
        public AddMediaContentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
