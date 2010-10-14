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
        private static final javax.xml.namespace.QName LOCALE$2 = 
            new javax.xml.namespace.QName("", "locale");
        
        
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
         * Gets the "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter getLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "locale" element
         */
        public void setLocale(eu.aladdin_project.xsd.SystemParameter locale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$2, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$2);
                }
                target.set(locale);
            }
        }
        
        /**
         * Appends and returns a new empty "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter addNewLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$2);
                return target;
            }
        }
    }
}
