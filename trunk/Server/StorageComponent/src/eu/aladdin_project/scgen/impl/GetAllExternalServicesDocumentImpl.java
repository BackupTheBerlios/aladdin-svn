/*
 * An XML document type.
 * Localname: GetAllExternalServices
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetAllExternalServicesDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetAllExternalServices(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetAllExternalServicesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetAllExternalServicesDocument
{
    
    public GetAllExternalServicesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLEXTERNALSERVICES$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetAllExternalServices");
    
    
    /**
     * Gets the "GetAllExternalServices" element
     */
    public eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices getGetAllExternalServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices target = null;
            target = (eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices)get_store().find_element_user(GETALLEXTERNALSERVICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAllExternalServices" element
     */
    public void setGetAllExternalServices(eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices getAllExternalServices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices target = null;
            target = (eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices)get_store().find_element_user(GETALLEXTERNALSERVICES$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices)get_store().add_element_user(GETALLEXTERNALSERVICES$0);
            }
            target.set(getAllExternalServices);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAllExternalServices" element
     */
    public eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices addNewGetAllExternalServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices target = null;
            target = (eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices)get_store().add_element_user(GETALLEXTERNALSERVICES$0);
            return target;
        }
    }
    /**
     * An XML GetAllExternalServices(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetAllExternalServicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetAllExternalServicesDocument.GetAllExternalServices
    {
        
        public GetAllExternalServicesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERID$0 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "userId" element
         */
        public org.apache.xmlbeans.XmlString xgetUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "userId" element
         */
        public void setUserId(java.lang.String userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
                }
                target.setStringValue(userId);
            }
        }
        
        /**
         * Sets (as xml) the "userId" element
         */
        public void xsetUserId(org.apache.xmlbeans.XmlString userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$0);
                }
                target.set(userId);
            }
        }
    }
}
