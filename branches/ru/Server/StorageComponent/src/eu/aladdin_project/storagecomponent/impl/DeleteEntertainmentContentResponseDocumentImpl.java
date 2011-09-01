/*
 * An XML document type.
 * Localname: DeleteEntertainmentContentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one DeleteEntertainmentContentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class DeleteEntertainmentContentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument
{
    
    public DeleteEntertainmentContentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEENTERTAINMENTCONTENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "DeleteEntertainmentContentResponse");
    
    
    /**
     * Gets the "DeleteEntertainmentContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse getDeleteEntertainmentContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse)get_store().find_element_user(DELETEENTERTAINMENTCONTENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteEntertainmentContentResponse" element
     */
    public void setDeleteEntertainmentContentResponse(eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse deleteEntertainmentContentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse)get_store().find_element_user(DELETEENTERTAINMENTCONTENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse)get_store().add_element_user(DELETEENTERTAINMENTCONTENTRESPONSE$0);
            }
            target.set(deleteEntertainmentContentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteEntertainmentContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse addNewDeleteEntertainmentContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse)get_store().add_element_user(DELETEENTERTAINMENTCONTENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteEntertainmentContentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class DeleteEntertainmentContentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteEntertainmentContentResponseDocument.DeleteEntertainmentContentResponse
    {
        
        public DeleteEntertainmentContentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
