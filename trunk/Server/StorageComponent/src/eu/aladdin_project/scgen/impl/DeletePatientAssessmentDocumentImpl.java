/*
 * An XML document type.
 * Localname: DeletePatientAssessment
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.DeletePatientAssessmentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one DeletePatientAssessment(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class DeletePatientAssessmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeletePatientAssessmentDocument
{
    
    public DeletePatientAssessmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEPATIENTASSESSMENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "DeletePatientAssessment");
    
    
    /**
     * Gets the "DeletePatientAssessment" element
     */
    public eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment getDeletePatientAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment target = null;
            target = (eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment)get_store().find_element_user(DELETEPATIENTASSESSMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeletePatientAssessment" element
     */
    public void setDeletePatientAssessment(eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment deletePatientAssessment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment target = null;
            target = (eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment)get_store().find_element_user(DELETEPATIENTASSESSMENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment)get_store().add_element_user(DELETEPATIENTASSESSMENT$0);
            }
            target.set(deletePatientAssessment);
        }
    }
    
    /**
     * Appends and returns a new empty "DeletePatientAssessment" element
     */
    public eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment addNewDeletePatientAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment target = null;
            target = (eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment)get_store().add_element_user(DELETEPATIENTASSESSMENT$0);
            return target;
        }
    }
    /**
     * An XML DeletePatientAssessment(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class DeletePatientAssessmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeletePatientAssessmentDocument.DeletePatientAssessment
    {
        
        public DeletePatientAssessmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ASSESSMENTID$0 = 
            new javax.xml.namespace.QName("", "assessmentId");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "assessmentId" element
         */
        public java.lang.String getAssessmentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSESSMENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "assessmentId" element
         */
        public org.apache.xmlbeans.XmlString xgetAssessmentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSESSMENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "assessmentId" element
         */
        public void setAssessmentId(java.lang.String assessmentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSESSMENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSESSMENTID$0);
                }
                target.setStringValue(assessmentId);
            }
        }
        
        /**
         * Sets (as xml) the "assessmentId" element
         */
        public void xsetAssessmentId(org.apache.xmlbeans.XmlString assessmentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSESSMENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSESSMENTID$0);
                }
                target.set(assessmentId);
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
