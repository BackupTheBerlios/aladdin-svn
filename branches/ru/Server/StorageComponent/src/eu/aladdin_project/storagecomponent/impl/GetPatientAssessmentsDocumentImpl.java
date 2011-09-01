/*
 * An XML document type.
 * Localname: GetPatientAssessments
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetPatientAssessments(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetPatientAssessmentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument
{
    
    public GetPatientAssessmentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPATIENTASSESSMENTS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetPatientAssessments");
    
    
    /**
     * Gets the "GetPatientAssessments" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments getGetPatientAssessments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments)get_store().find_element_user(GETPATIENTASSESSMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPatientAssessments" element
     */
    public void setGetPatientAssessments(eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments getPatientAssessments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments)get_store().find_element_user(GETPATIENTASSESSMENTS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments)get_store().add_element_user(GETPATIENTASSESSMENTS$0);
            }
            target.set(getPatientAssessments);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPatientAssessments" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments addNewGetPatientAssessments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments)get_store().add_element_user(GETPATIENTASSESSMENTS$0);
            return target;
        }
    }
    /**
     * An XML GetPatientAssessments(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetPatientAssessmentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument.GetPatientAssessments
    {
        
        public GetPatientAssessmentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PATIENTID$0 = 
            new javax.xml.namespace.QName("", "patientId");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "patientId" element
         */
        public java.lang.String getPatientId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "patientId" element
         */
        public org.apache.xmlbeans.XmlString xgetPatientId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "patientId" element
         */
        public void setPatientId(java.lang.String patientId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTID$0);
                }
                target.setStringValue(patientId);
            }
        }
        
        /**
         * Sets (as xml) the "patientId" element
         */
        public void xsetPatientId(org.apache.xmlbeans.XmlString patientId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATIENTID$0);
                }
                target.set(patientId);
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
