/*
 * An XML document type.
 * Localname: UpdateMediaContent
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateMediaContentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateMediaContent(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateMediaContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateMediaContentDocument
{
    
    public UpdateMediaContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEMEDIACONTENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateMediaContent");
    
    
    /**
     * Gets the "UpdateMediaContent" element
     */
    public eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent getUpdateMediaContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent)get_store().find_element_user(UPDATEMEDIACONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateMediaContent" element
     */
    public void setUpdateMediaContent(eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent updateMediaContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent)get_store().find_element_user(UPDATEMEDIACONTENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent)get_store().add_element_user(UPDATEMEDIACONTENT$0);
            }
            target.set(updateMediaContent);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateMediaContent" element
     */
    public eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent addNewUpdateMediaContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent)get_store().add_element_user(UPDATEMEDIACONTENT$0);
            return target;
        }
    }
    /**
     * An XML UpdateMediaContent(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateMediaContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateMediaContentDocument.UpdateMediaContent
    {
        
        public UpdateMediaContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EC$0 = 
            new javax.xml.namespace.QName("", "ec");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "ec" element
         */
        public eu.aladdin_project.xsd.MediaContent getEc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().find_element_user(EC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ec" element
         */
        public void setEc(eu.aladdin_project.xsd.MediaContent ec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().find_element_user(EC$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.MediaContent)get_store().add_element_user(EC$0);
                }
                target.set(ec);
            }
        }
        
        /**
         * Appends and returns a new empty "ec" element
         */
        public eu.aladdin_project.xsd.MediaContent addNewEc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().add_element_user(EC$0);
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
