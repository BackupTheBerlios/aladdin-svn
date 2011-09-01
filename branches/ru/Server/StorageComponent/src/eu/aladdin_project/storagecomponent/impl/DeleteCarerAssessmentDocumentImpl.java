/*
 * An XML document type.
 * Localname: DeleteCarerAssessment
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one DeleteCarerAssessment(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class DeleteCarerAssessmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument
{
    
    public DeleteCarerAssessmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECARERASSESSMENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "DeleteCarerAssessment");
    
    
    /**
     * Gets the "DeleteCarerAssessment" element
     */
    public eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment getDeleteCarerAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment)get_store().find_element_user(DELETECARERASSESSMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteCarerAssessment" element
     */
    public void setDeleteCarerAssessment(eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment deleteCarerAssessment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment)get_store().find_element_user(DELETECARERASSESSMENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment)get_store().add_element_user(DELETECARERASSESSMENT$0);
            }
            target.set(deleteCarerAssessment);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteCarerAssessment" element
     */
    public eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment addNewDeleteCarerAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment target = null;
            target = (eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment)get_store().add_element_user(DELETECARERASSESSMENT$0);
            return target;
        }
    }
    /**
     * An XML DeleteCarerAssessment(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class DeleteCarerAssessmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument.DeleteCarerAssessment
    {
        
        public DeleteCarerAssessmentImpl(org.apache.xmlbeans.SchemaType sType)
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
