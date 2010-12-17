/*
 * An XML document type.
 * Localname: RemoveTaskMassivelyResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one RemoveTaskMassivelyResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class RemoveTaskMassivelyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument
{
    
    public RemoveTaskMassivelyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVETASKMASSIVELYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "RemoveTaskMassivelyResponse");
    
    
    /**
     * Gets the "RemoveTaskMassivelyResponse" element
     */
    public eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse getRemoveTaskMassivelyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse target = null;
            target = (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse)get_store().find_element_user(REMOVETASKMASSIVELYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RemoveTaskMassivelyResponse" element
     */
    public void setRemoveTaskMassivelyResponse(eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse removeTaskMassivelyResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse target = null;
            target = (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse)get_store().find_element_user(REMOVETASKMASSIVELYRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse)get_store().add_element_user(REMOVETASKMASSIVELYRESPONSE$0);
            }
            target.set(removeTaskMassivelyResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoveTaskMassivelyResponse" element
     */
    public eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse addNewRemoveTaskMassivelyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse target = null;
            target = (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse)get_store().add_element_user(REMOVETASKMASSIVELYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RemoveTaskMassivelyResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class RemoveTaskMassivelyResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse
    {
        
        public RemoveTaskMassivelyResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
