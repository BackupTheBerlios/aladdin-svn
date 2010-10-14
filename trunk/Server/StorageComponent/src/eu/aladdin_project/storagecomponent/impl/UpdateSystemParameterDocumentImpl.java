/*
 * An XML document type.
 * Localname: UpdateSystemParameter
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateSystemParameter(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateSystemParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument
{
    
    public UpdateSystemParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATESYSTEMPARAMETER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateSystemParameter");
    
    
    /**
     * Gets the "UpdateSystemParameter" element
     */
    public eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter getUpdateSystemParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter)get_store().find_element_user(UPDATESYSTEMPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateSystemParameter" element
     */
    public void setUpdateSystemParameter(eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter updateSystemParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter)get_store().find_element_user(UPDATESYSTEMPARAMETER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter)get_store().add_element_user(UPDATESYSTEMPARAMETER$0);
            }
            target.set(updateSystemParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateSystemParameter" element
     */
    public eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter addNewUpdateSystemParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter)get_store().add_element_user(UPDATESYSTEMPARAMETER$0);
            return target;
        }
    }
    /**
     * An XML UpdateSystemParameter(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateSystemParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument.UpdateSystemParameter
    {
        
        public UpdateSystemParameterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName LOCALE$4 = 
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
         * Gets the "value" element
         */
        public eu.aladdin_project.xsd.SystemParameter getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "value" element
         */
        public void setValue(eu.aladdin_project.xsd.SystemParameter value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Appends and returns a new empty "value" element
         */
        public eu.aladdin_project.xsd.SystemParameter addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(VALUE$2);
                return target;
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
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$4, 0);
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
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$4, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$4);
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
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$4);
                return target;
            }
        }
    }
}
