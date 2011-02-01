/*
 * An XML document type.
 * Localname: AddMediaContent
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AddMediaContentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one AddMediaContent(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class AddMediaContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AddMediaContentDocument
{
    
    public AddMediaContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDMEDIACONTENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "AddMediaContent");
    
    
    /**
     * Gets the "AddMediaContent" element
     */
    public eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent getAddMediaContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent target = null;
            target = (eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent)get_store().find_element_user(ADDMEDIACONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddMediaContent" element
     */
    public void setAddMediaContent(eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent addMediaContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent target = null;
            target = (eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent)get_store().find_element_user(ADDMEDIACONTENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent)get_store().add_element_user(ADDMEDIACONTENT$0);
            }
            target.set(addMediaContent);
        }
    }
    
    /**
     * Appends and returns a new empty "AddMediaContent" element
     */
    public eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent addNewAddMediaContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent target = null;
            target = (eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent)get_store().add_element_user(ADDMEDIACONTENT$0);
            return target;
        }
    }
    /**
     * An XML AddMediaContent(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class AddMediaContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AddMediaContentDocument.AddMediaContent
    {
        
        public AddMediaContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN$0 = 
            new javax.xml.namespace.QName("", "in");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "in" element
         */
        public eu.aladdin_project.xsd.MediaContent getIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().find_element_user(IN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "in" element
         */
        public void setIn(eu.aladdin_project.xsd.MediaContent in)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().find_element_user(IN$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.MediaContent)get_store().add_element_user(IN$0);
                }
                target.set(in);
            }
        }
        
        /**
         * Appends and returns a new empty "in" element
         */
        public eu.aladdin_project.xsd.MediaContent addNewIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().add_element_user(IN$0);
                return target;
            }
        }
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$2);
                }
                target.set(userId);
            }
        }
    }
}
