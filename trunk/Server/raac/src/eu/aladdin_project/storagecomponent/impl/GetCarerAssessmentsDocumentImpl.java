/*
 * An XML document type.
 * Localname: GetCarerAssessments
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetCarerAssessments(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetCarerAssessmentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument
{
    
    public GetCarerAssessmentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARERASSESSMENTS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetCarerAssessments");
    
    
    /**
     * Gets the "GetCarerAssessments" element
     */
    public eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments getGetCarerAssessments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments target = null;
            target = (eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments)get_store().find_element_user(GETCARERASSESSMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCarerAssessments" element
     */
    public void setGetCarerAssessments(eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments getCarerAssessments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments target = null;
            target = (eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments)get_store().find_element_user(GETCARERASSESSMENTS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments)get_store().add_element_user(GETCARERASSESSMENTS$0);
            }
            target.set(getCarerAssessments);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCarerAssessments" element
     */
    public eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments addNewGetCarerAssessments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments target = null;
            target = (eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments)get_store().add_element_user(GETCARERASSESSMENTS$0);
            return target;
        }
    }
    /**
     * An XML GetCarerAssessments(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetCarerAssessmentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument.GetCarerAssessments
    {
        
        public GetCarerAssessmentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CARERID$0 = 
            new javax.xml.namespace.QName("", "carerId");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "carerId" element
         */
        public java.lang.String getCarerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARERID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "carerId" element
         */
        public org.apache.xmlbeans.XmlString xgetCarerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARERID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "carerId" element
         */
        public void setCarerId(java.lang.String carerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARERID$0);
                }
                target.setStringValue(carerId);
            }
        }
        
        /**
         * Sets (as xml) the "carerId" element
         */
        public void xsetCarerId(org.apache.xmlbeans.XmlString carerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARERID$0);
                }
                target.set(carerId);
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
