/*
 * An XML document type.
 * Localname: GetUserResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetUserResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetUserResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserResponseDocument
{
    
    public GetUserResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetUserResponse");
    
    
    /**
     * Gets the "GetUserResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse getGetUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse)get_store().find_element_user(GETUSERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetUserResponse" element
     */
    public void setGetUserResponse(eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse getUserResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse)get_store().find_element_user(GETUSERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse)get_store().add_element_user(GETUSERRESPONSE$0);
            }
            target.set(getUserResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetUserResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse addNewGetUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse)get_store().add_element_user(GETUSERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetUserResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetUserResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse
    {
        
        public GetUserResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.User getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.User target = null;
                target = (eu.aladdin_project.xsd.User)get_store().find_element_user(OUT$0, 0);
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
        public void setOut(eu.aladdin_project.xsd.User out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.User target = null;
                target = (eu.aladdin_project.xsd.User)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.User)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.User addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.User target = null;
                target = (eu.aladdin_project.xsd.User)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
