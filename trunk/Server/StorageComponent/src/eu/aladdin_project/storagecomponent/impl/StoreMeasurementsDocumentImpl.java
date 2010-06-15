/*
 * An XML document type.
 * Localname: StoreMeasurements
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.StoreMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one StoreMeasurements(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class StoreMeasurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.StoreMeasurementsDocument
{
    
    public StoreMeasurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOREMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "StoreMeasurements");
    
    
    /**
     * Gets the "StoreMeasurements" element
     */
    public eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements getStoreMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements target = null;
            target = (eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements)get_store().find_element_user(STOREMEASUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StoreMeasurements" element
     */
    public void setStoreMeasurements(eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements storeMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements target = null;
            target = (eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements)get_store().find_element_user(STOREMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements)get_store().add_element_user(STOREMEASUREMENTS$0);
            }
            target.set(storeMeasurements);
        }
    }
    
    /**
     * Appends and returns a new empty "StoreMeasurements" element
     */
    public eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements addNewStoreMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements target = null;
            target = (eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements)get_store().add_element_user(STOREMEASUREMENTS$0);
            return target;
        }
    }
    /**
     * An XML StoreMeasurements(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class StoreMeasurementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.StoreMeasurementsDocument.StoreMeasurements
    {
        
        public StoreMeasurementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATA$0 = 
            new javax.xml.namespace.QName("", "data");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "data" element
         */
        public eu.aladdin_project.xsd.Measurement getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(eu.aladdin_project.xsd.Measurement data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Measurement)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public eu.aladdin_project.xsd.Measurement addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().add_element_user(DATA$0);
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
