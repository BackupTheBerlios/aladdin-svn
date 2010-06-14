/*
 * An XML document type.
 * Localname: UpdataPatient
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.UpdataPatientDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one UpdataPatient(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class UpdataPatientDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdataPatientDocument
{
    
    public UpdataPatientDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATAPATIENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "UpdataPatient");
    
    
    /**
     * Gets the "UpdataPatient" element
     */
    public eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient getUpdataPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient target = null;
            target = (eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient)get_store().find_element_user(UPDATAPATIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdataPatient" element
     */
    public void setUpdataPatient(eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient updataPatient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient target = null;
            target = (eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient)get_store().find_element_user(UPDATAPATIENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient)get_store().add_element_user(UPDATAPATIENT$0);
            }
            target.set(updataPatient);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdataPatient" element
     */
    public eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient addNewUpdataPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient target = null;
            target = (eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient)get_store().add_element_user(UPDATAPATIENT$0);
            return target;
        }
    }
    /**
     * An XML UpdataPatient(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class UpdataPatientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdataPatientDocument.UpdataPatient
    {
        
        public UpdataPatientImpl(org.apache.xmlbeans.SchemaType sType)
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
        public eu.aladdin_project.xsd.Patient getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Patient target = null;
                target = (eu.aladdin_project.xsd.Patient)get_store().find_element_user(DATA$0, 0);
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
        public void setData(eu.aladdin_project.xsd.Patient data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Patient target = null;
                target = (eu.aladdin_project.xsd.Patient)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Patient)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public eu.aladdin_project.xsd.Patient addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Patient target = null;
                target = (eu.aladdin_project.xsd.Patient)get_store().add_element_user(DATA$0);
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
