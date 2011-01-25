/*
 * An XML document type.
 * Localname: GetTaskResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetTaskResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetTaskResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetTaskResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetTaskResponseDocument
{
    
    public GetTaskResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetTaskResponse");
    
    
    /**
     * Gets the "GetTaskResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse getGetTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse)get_store().find_element_user(GETTASKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetTaskResponse" element
     */
    public void setGetTaskResponse(eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse getTaskResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse)get_store().find_element_user(GETTASKRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse)get_store().add_element_user(GETTASKRESPONSE$0);
            }
            target.set(getTaskResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetTaskResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse addNewGetTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse)get_store().add_element_user(GETTASKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetTaskResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetTaskResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse
    {
        
        public GetTaskResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.Task getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Task target = null;
                target = (eu.aladdin_project.xsd.Task)get_store().find_element_user(OUT$0, 0);
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
        public void setOut(eu.aladdin_project.xsd.Task out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Task target = null;
                target = (eu.aladdin_project.xsd.Task)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Task)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.Task addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Task target = null;
                target = (eu.aladdin_project.xsd.Task)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
