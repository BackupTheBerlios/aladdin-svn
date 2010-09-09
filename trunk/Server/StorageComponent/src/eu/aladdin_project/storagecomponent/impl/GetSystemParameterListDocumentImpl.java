/*
 * An XML document type.
 * Localname: GetSystemParameterList
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetSystemParameterListDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetSystemParameterList(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetSystemParameterListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetSystemParameterListDocument
{
    
    public GetSystemParameterListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSYSTEMPARAMETERLIST$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetSystemParameterList");
    
    
    /**
     * Gets the "GetSystemParameterList" element
     */
    public eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList getGetSystemParameterList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList target = null;
            target = (eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList)get_store().find_element_user(GETSYSTEMPARAMETERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSystemParameterList" element
     */
    public void setGetSystemParameterList(eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList getSystemParameterList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList target = null;
            target = (eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList)get_store().find_element_user(GETSYSTEMPARAMETERLIST$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList)get_store().add_element_user(GETSYSTEMPARAMETERLIST$0);
            }
            target.set(getSystemParameterList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSystemParameterList" element
     */
    public eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList addNewGetSystemParameterList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList target = null;
            target = (eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList)get_store().add_element_user(GETSYSTEMPARAMETERLIST$0);
            return target;
        }
    }
    /**
     * An XML GetSystemParameterList(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetSystemParameterListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetSystemParameterListDocument.GetSystemParameterList
    {
        
        public GetSystemParameterListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName LANGUAGE$2 = 
            new javax.xml.namespace.QName("", "language");
        
        
        /**
         * Gets the "type" element
         */
        public int getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" element
         */
        public org.apache.xmlbeans.XmlInt xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(int type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
                }
                target.setIntValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" element
         */
        public void xsetType(org.apache.xmlbeans.XmlInt type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "language" element
         */
        public int getLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "language" element
         */
        public org.apache.xmlbeans.XmlInt xgetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LANGUAGE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "language" element
         */
        public void setLanguage(int language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$2);
                }
                target.setIntValue(language);
            }
        }
        
        /**
         * Sets (as xml) the "language" element
         */
        public void xsetLanguage(org.apache.xmlbeans.XmlInt language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LANGUAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LANGUAGE$2);
                }
                target.set(language);
            }
        }
    }
}
