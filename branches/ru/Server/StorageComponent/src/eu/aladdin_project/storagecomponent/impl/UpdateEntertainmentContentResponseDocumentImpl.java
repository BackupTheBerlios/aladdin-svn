/*
 * An XML document type.
 * Localname: UpdateEntertainmentContentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateEntertainmentContentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateEntertainmentContentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument
{
    
    public UpdateEntertainmentContentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEENTERTAINMENTCONTENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateEntertainmentContentResponse");
    
    
    /**
     * Gets the "UpdateEntertainmentContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse getUpdateEntertainmentContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse)get_store().find_element_user(UPDATEENTERTAINMENTCONTENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateEntertainmentContentResponse" element
     */
    public void setUpdateEntertainmentContentResponse(eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse updateEntertainmentContentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse)get_store().find_element_user(UPDATEENTERTAINMENTCONTENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse)get_store().add_element_user(UPDATEENTERTAINMENTCONTENTRESPONSE$0);
            }
            target.set(updateEntertainmentContentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateEntertainmentContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse addNewUpdateEntertainmentContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse)get_store().add_element_user(UPDATEENTERTAINMENTCONTENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateEntertainmentContentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateEntertainmentContentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateEntertainmentContentResponseDocument.UpdateEntertainmentContentResponse
    {
        
        public UpdateEntertainmentContentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
