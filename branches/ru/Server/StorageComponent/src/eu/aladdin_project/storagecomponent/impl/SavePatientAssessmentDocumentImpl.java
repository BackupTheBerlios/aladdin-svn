/*
 * An XML document type.
 * Localname: SavePatientAssessment
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one SavePatientAssessment(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class SavePatientAssessmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument
{
    
    public SavePatientAssessmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAVEPATIENTASSESSMENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "SavePatientAssessment");
    
    
    /**
     * Gets the "SavePatientAssessment" element
     */
    public eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment getSavePatientAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment target = null;
            target = (eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment)get_store().find_element_user(SAVEPATIENTASSESSMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SavePatientAssessment" element
     */
    public void setSavePatientAssessment(eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment savePatientAssessment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment target = null;
            target = (eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment)get_store().find_element_user(SAVEPATIENTASSESSMENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment)get_store().add_element_user(SAVEPATIENTASSESSMENT$0);
            }
            target.set(savePatientAssessment);
        }
    }
    
    /**
     * Appends and returns a new empty "SavePatientAssessment" element
     */
    public eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment addNewSavePatientAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment target = null;
            target = (eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment)get_store().add_element_user(SAVEPATIENTASSESSMENT$0);
            return target;
        }
    }
    /**
     * An XML SavePatientAssessment(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class SavePatientAssessmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument.SavePatientAssessment
    {
        
        public SavePatientAssessmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ASSESSMENT$0 = 
            new javax.xml.namespace.QName("", "assessment");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "assessment" element
         */
        public eu.aladdin_project.xsd.PatientAssessment getAssessment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientAssessment target = null;
                target = (eu.aladdin_project.xsd.PatientAssessment)get_store().find_element_user(ASSESSMENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "assessment" element
         */
        public void setAssessment(eu.aladdin_project.xsd.PatientAssessment assessment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientAssessment target = null;
                target = (eu.aladdin_project.xsd.PatientAssessment)get_store().find_element_user(ASSESSMENT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.PatientAssessment)get_store().add_element_user(ASSESSMENT$0);
                }
                target.set(assessment);
            }
        }
        
        /**
         * Appends and returns a new empty "assessment" element
         */
        public eu.aladdin_project.xsd.PatientAssessment addNewAssessment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientAssessment target = null;
                target = (eu.aladdin_project.xsd.PatientAssessment)get_store().add_element_user(ASSESSMENT$0);
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
