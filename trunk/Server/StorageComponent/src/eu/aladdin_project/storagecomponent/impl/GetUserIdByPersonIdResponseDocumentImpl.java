/*
 * An XML document type.
 * Localname: GetUserIdByPersonIdResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetUserIdByPersonIdResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetUserIdByPersonIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument
{
    
    public GetUserIdByPersonIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERIDBYPERSONIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetUserIdByPersonIdResponse");
    
    
    /**
     * Gets the "GetUserIdByPersonIdResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse getGetUserIdByPersonIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse)get_store().find_element_user(GETUSERIDBYPERSONIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetUserIdByPersonIdResponse" element
     */
    public void setGetUserIdByPersonIdResponse(eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse getUserIdByPersonIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse)get_store().find_element_user(GETUSERIDBYPERSONIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse)get_store().add_element_user(GETUSERIDBYPERSONIDRESPONSE$0);
            }
            target.set(getUserIdByPersonIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetUserIdByPersonIdResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse addNewGetUserIdByPersonIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse)get_store().add_element_user(GETUSERIDBYPERSONIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetUserIdByPersonIdResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetUserIdByPersonIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse
    {
        
        public GetUserIdByPersonIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
