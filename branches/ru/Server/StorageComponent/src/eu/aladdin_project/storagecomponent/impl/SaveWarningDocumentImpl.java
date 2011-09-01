/*
 * An XML document type.
 * Localname: SaveWarning
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.SaveWarningDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one SaveWarning(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class SaveWarningDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.SaveWarningDocument
{
    
    public SaveWarningDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAVEWARNING$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "SaveWarning");
    
    
    /**
     * Gets the "SaveWarning" element
     */
    public eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning getSaveWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning target = null;
            target = (eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning)get_store().find_element_user(SAVEWARNING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SaveWarning" element
     */
    public void setSaveWarning(eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning saveWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning target = null;
            target = (eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning)get_store().find_element_user(SAVEWARNING$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning)get_store().add_element_user(SAVEWARNING$0);
            }
            target.set(saveWarning);
        }
    }
    
    /**
     * Appends and returns a new empty "SaveWarning" element
     */
    public eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning addNewSaveWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning target = null;
            target = (eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning)get_store().add_element_user(SAVEWARNING$0);
            return target;
        }
    }
    /**
     * An XML SaveWarning(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class SaveWarningImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning
    {
        
        public SaveWarningImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WARN$0 = 
            new javax.xml.namespace.QName("", "warn");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "warn" element
         */
        public eu.aladdin_project.xsd.Warning getWarn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().find_element_user(WARN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "warn" element
         */
        public void setWarn(eu.aladdin_project.xsd.Warning warn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().find_element_user(WARN$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Warning)get_store().add_element_user(WARN$0);
                }
                target.set(warn);
            }
        }
        
        /**
         * Appends and returns a new empty "warn" element
         */
        public eu.aladdin_project.xsd.Warning addNewWarn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().add_element_user(WARN$0);
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
