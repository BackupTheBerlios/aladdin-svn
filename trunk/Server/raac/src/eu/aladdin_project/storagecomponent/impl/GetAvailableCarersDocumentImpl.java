/*
 * An XML document type.
 * Localname: getAvailableCarers
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetAvailableCarersDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one getAvailableCarers(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetAvailableCarersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetAvailableCarersDocument
{
    
    public GetAvailableCarersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAVAILABLECARERS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "getAvailableCarers");
    
    
    /**
     * Gets the "getAvailableCarers" element
     */
    public eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers getGetAvailableCarers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers target = null;
            target = (eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers)get_store().find_element_user(GETAVAILABLECARERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAvailableCarers" element
     */
    public void setGetAvailableCarers(eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers getAvailableCarers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers target = null;
            target = (eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers)get_store().find_element_user(GETAVAILABLECARERS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers)get_store().add_element_user(GETAVAILABLECARERS$0);
            }
            target.set(getAvailableCarers);
        }
    }
    
    /**
     * Appends and returns a new empty "getAvailableCarers" element
     */
    public eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers addNewGetAvailableCarers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers target = null;
            target = (eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers)get_store().add_element_user(GETAVAILABLECARERS$0);
            return target;
        }
    }
    /**
     * An XML getAvailableCarers(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetAvailableCarersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetAvailableCarersDocument.GetAvailableCarers
    {
        
        public GetAvailableCarersImpl(org.apache.xmlbeans.SchemaType sType)
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
