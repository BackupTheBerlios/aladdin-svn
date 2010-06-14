/*
 * An XML document type.
 * Localname: CreatePatient
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.CreatePatientDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one CreatePatient(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class CreatePatientDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreatePatientDocument
{
    
    public CreatePatientDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPATIENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "CreatePatient");
    
    
    /**
     * Gets the "CreatePatient" element
     */
    public eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient getCreatePatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient target = null;
            target = (eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient)get_store().find_element_user(CREATEPATIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatePatient" element
     */
    public void setCreatePatient(eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient createPatient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient target = null;
            target = (eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient)get_store().find_element_user(CREATEPATIENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient)get_store().add_element_user(CREATEPATIENT$0);
            }
            target.set(createPatient);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatePatient" element
     */
    public eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient addNewCreatePatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient target = null;
            target = (eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient)get_store().add_element_user(CREATEPATIENT$0);
            return target;
        }
    }
    /**
     * An XML CreatePatient(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class CreatePatientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreatePatientDocument.CreatePatient
    {
        
        public CreatePatientImpl(org.apache.xmlbeans.SchemaType sType)
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
