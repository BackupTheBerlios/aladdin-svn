/*
 * An XML document type.
 * Localname: GetQuestionnaireAnswers
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetQuestionnaireAnswers(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetQuestionnaireAnswersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument
{
    
    public GetQuestionnaireAnswersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONNAIREANSWERS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetQuestionnaireAnswers");
    
    
    /**
     * Gets the "GetQuestionnaireAnswers" element
     */
    public eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers getGetQuestionnaireAnswers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers)get_store().find_element_user(GETQUESTIONNAIREANSWERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuestionnaireAnswers" element
     */
    public void setGetQuestionnaireAnswers(eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers getQuestionnaireAnswers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers)get_store().find_element_user(GETQUESTIONNAIREANSWERS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers)get_store().add_element_user(GETQUESTIONNAIREANSWERS$0);
            }
            target.set(getQuestionnaireAnswers);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuestionnaireAnswers" element
     */
    public eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers addNewGetQuestionnaireAnswers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers)get_store().add_element_user(GETQUESTIONNAIREANSWERS$0);
            return target;
        }
    }
    /**
     * An XML GetQuestionnaireAnswers(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetQuestionnaireAnswersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers
    {
        
        public GetQuestionnaireAnswersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTID$0 = 
            new javax.xml.namespace.QName("", "ObjectId");
        private static final javax.xml.namespace.QName FROMDATE$2 = 
            new javax.xml.namespace.QName("", "fromDate");
        private static final javax.xml.namespace.QName TODATE$4 = 
            new javax.xml.namespace.QName("", "toDate");
        private static final javax.xml.namespace.QName USERID$6 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "ObjectId" element
         */
        public java.lang.String getObjectId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ObjectId" element
         */
        public org.apache.xmlbeans.XmlString xgetObjectId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ObjectId" element
         */
        public void setObjectId(java.lang.String objectId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTID$0);
                }
                target.setStringValue(objectId);
            }
        }
        
        /**
         * Sets (as xml) the "ObjectId" element
         */
        public void xsetObjectId(org.apache.xmlbeans.XmlString objectId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTID$0);
                }
                target.set(objectId);
            }
        }
        
        /**
         * Gets the "fromDate" element
         */
        public java.util.Calendar getFromDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "fromDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetFromDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FROMDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fromDate" element
         */
        public void setFromDate(java.util.Calendar fromDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMDATE$2);
                }
                target.setCalendarValue(fromDate);
            }
        }
        
        /**
         * Sets (as xml) the "fromDate" element
         */
        public void xsetFromDate(org.apache.xmlbeans.XmlDateTime fromDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FROMDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FROMDATE$2);
                }
                target.set(fromDate);
            }
        }
        
        /**
         * Gets the "toDate" element
         */
        public java.util.Calendar getToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "toDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TODATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "toDate" element
         */
        public void setToDate(java.util.Calendar toDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODATE$4);
                }
                target.setCalendarValue(toDate);
            }
        }
        
        /**
         * Sets (as xml) the "toDate" element
         */
        public void xsetToDate(org.apache.xmlbeans.XmlDateTime toDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TODATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TODATE$4);
                }
                target.set(toDate);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$6);
                }
                target.set(userId);
            }
        }
    }
}
