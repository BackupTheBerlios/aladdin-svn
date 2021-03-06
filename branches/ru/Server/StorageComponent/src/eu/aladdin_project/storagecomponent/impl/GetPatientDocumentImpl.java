/*
 * An XML document type.
 * Localname: GetPatient
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetPatientDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetPatient(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetPatientDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientDocument
{
    
    public GetPatientDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPATIENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetPatient");
    
    
    /**
     * Gets the "GetPatient" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient getGetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient)get_store().find_element_user(GETPATIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPatient" element
     */
    public void setGetPatient(eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient getPatient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient)get_store().find_element_user(GETPATIENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient)get_store().add_element_user(GETPATIENT$0);
            }
            target.set(getPatient);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPatient" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient addNewGetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient)get_store().add_element_user(GETPATIENT$0);
            return target;
        }
    }
    /**
     * An XML GetPatient(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetPatientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientDocument.GetPatient
    {
        
        public GetPatientImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
                }
                target.set(id);
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
