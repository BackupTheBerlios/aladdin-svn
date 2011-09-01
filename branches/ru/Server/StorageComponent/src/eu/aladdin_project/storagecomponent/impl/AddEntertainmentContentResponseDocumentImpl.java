/*
 * An XML document type.
 * Localname: AddEntertainmentContentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one AddEntertainmentContentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class AddEntertainmentContentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument
{
    
    public AddEntertainmentContentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDENTERTAINMENTCONTENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "AddEntertainmentContentResponse");
    
    
    /**
     * Gets the "AddEntertainmentContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse getAddEntertainmentContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse)get_store().find_element_user(ADDENTERTAINMENTCONTENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddEntertainmentContentResponse" element
     */
    public void setAddEntertainmentContentResponse(eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse addEntertainmentContentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse)get_store().find_element_user(ADDENTERTAINMENTCONTENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse)get_store().add_element_user(ADDENTERTAINMENTCONTENTRESPONSE$0);
            }
            target.set(addEntertainmentContentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AddEntertainmentContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse addNewAddEntertainmentContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse)get_store().add_element_user(ADDENTERTAINMENTCONTENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddEntertainmentContentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class AddEntertainmentContentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AddEntertainmentContentResponseDocument.AddEntertainmentContentResponse
    {
        
        public AddEntertainmentContentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
