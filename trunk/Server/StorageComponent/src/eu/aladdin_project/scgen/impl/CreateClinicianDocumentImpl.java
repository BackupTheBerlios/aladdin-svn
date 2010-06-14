/*
 * An XML document type.
 * Localname: CreateClinician
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.CreateClinicianDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one CreateClinician(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class CreateClinicianDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreateClinicianDocument
{
    
    public CreateClinicianDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECLINICIAN$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "CreateClinician");
    
    
    /**
     * Gets the "CreateClinician" element
     */
    public eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician getCreateClinician()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician target = null;
            target = (eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician)get_store().find_element_user(CREATECLINICIAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateClinician" element
     */
    public void setCreateClinician(eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician createClinician)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician target = null;
            target = (eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician)get_store().find_element_user(CREATECLINICIAN$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician)get_store().add_element_user(CREATECLINICIAN$0);
            }
            target.set(createClinician);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateClinician" element
     */
    public eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician addNewCreateClinician()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician target = null;
            target = (eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician)get_store().add_element_user(CREATECLINICIAN$0);
            return target;
        }
    }
    /**
     * An XML CreateClinician(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class CreateClinicianImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreateClinicianDocument.CreateClinician
    {
        
        public CreateClinicianImpl(org.apache.xmlbeans.SchemaType sType)
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
        public eu.aladdin_project.xsd.Clinician getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Clinician target = null;
                target = (eu.aladdin_project.xsd.Clinician)get_store().find_element_user(DATA$0, 0);
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
        public void setData(eu.aladdin_project.xsd.Clinician data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Clinician target = null;
                target = (eu.aladdin_project.xsd.Clinician)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Clinician)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public eu.aladdin_project.xsd.Clinician addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Clinician target = null;
                target = (eu.aladdin_project.xsd.Clinician)get_store().add_element_user(DATA$0);
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
