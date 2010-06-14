/*
 * An XML document type.
 * Localname: GetCarerAssessment
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetCarerAssessmentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetCarerAssessment(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetCarerAssessmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetCarerAssessmentDocument
{
    
    public GetCarerAssessmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARERASSESSMENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetCarerAssessment");
    
    
    /**
     * Gets the "GetCarerAssessment" element
     */
    public eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment getGetCarerAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment target = null;
            target = (eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment)get_store().find_element_user(GETCARERASSESSMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCarerAssessment" element
     */
    public void setGetCarerAssessment(eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment getCarerAssessment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment target = null;
            target = (eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment)get_store().find_element_user(GETCARERASSESSMENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment)get_store().add_element_user(GETCARERASSESSMENT$0);
            }
            target.set(getCarerAssessment);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCarerAssessment" element
     */
    public eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment addNewGetCarerAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment target = null;
            target = (eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment)get_store().add_element_user(GETCARERASSESSMENT$0);
            return target;
        }
    }
    /**
     * An XML GetCarerAssessment(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetCarerAssessmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetCarerAssessmentDocument.GetCarerAssessment
    {
        
        public GetCarerAssessmentImpl(org.apache.xmlbeans.SchemaType sType)
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
