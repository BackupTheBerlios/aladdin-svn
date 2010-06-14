/*
 * An XML document type.
 * Localname: SaveCarerAssessment
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.SaveCarerAssessmentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one SaveCarerAssessment(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class SaveCarerAssessmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.SaveCarerAssessmentDocument
{
    
    public SaveCarerAssessmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAVECARERASSESSMENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "SaveCarerAssessment");
    
    
    /**
     * Gets the "SaveCarerAssessment" element
     */
    public eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment getSaveCarerAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment target = null;
            target = (eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment)get_store().find_element_user(SAVECARERASSESSMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SaveCarerAssessment" element
     */
    public void setSaveCarerAssessment(eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment saveCarerAssessment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment target = null;
            target = (eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment)get_store().find_element_user(SAVECARERASSESSMENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment)get_store().add_element_user(SAVECARERASSESSMENT$0);
            }
            target.set(saveCarerAssessment);
        }
    }
    
    /**
     * Appends and returns a new empty "SaveCarerAssessment" element
     */
    public eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment addNewSaveCarerAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment target = null;
            target = (eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment)get_store().add_element_user(SAVECARERASSESSMENT$0);
            return target;
        }
    }
    /**
     * An XML SaveCarerAssessment(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class SaveCarerAssessmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.SaveCarerAssessmentDocument.SaveCarerAssessment
    {
        
        public SaveCarerAssessmentImpl(org.apache.xmlbeans.SchemaType sType)
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
        public eu.aladdin_project.xsd.CarerAssessment getAssessment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().find_element_user(ASSESSMENT$0, 0);
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
        public void setAssessment(eu.aladdin_project.xsd.CarerAssessment assessment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().find_element_user(ASSESSMENT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.CarerAssessment)get_store().add_element_user(ASSESSMENT$0);
                }
                target.set(assessment);
            }
        }
        
        /**
         * Appends and returns a new empty "assessment" element
         */
        public eu.aladdin_project.xsd.CarerAssessment addNewAssessment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().add_element_user(ASSESSMENT$0);
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
