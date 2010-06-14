/*
 * An XML document type.
 * Localname: StoreQuestionnaireAnswers
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one StoreQuestionnaireAnswers(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class StoreQuestionnaireAnswersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument
{
    
    public StoreQuestionnaireAnswersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOREQUESTIONNAIREANSWERS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "StoreQuestionnaireAnswers");
    
    
    /**
     * Gets the "StoreQuestionnaireAnswers" element
     */
    public eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers getStoreQuestionnaireAnswers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers target = null;
            target = (eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers)get_store().find_element_user(STOREQUESTIONNAIREANSWERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StoreQuestionnaireAnswers" element
     */
    public void setStoreQuestionnaireAnswers(eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers storeQuestionnaireAnswers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers target = null;
            target = (eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers)get_store().find_element_user(STOREQUESTIONNAIREANSWERS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers)get_store().add_element_user(STOREQUESTIONNAIREANSWERS$0);
            }
            target.set(storeQuestionnaireAnswers);
        }
    }
    
    /**
     * Appends and returns a new empty "StoreQuestionnaireAnswers" element
     */
    public eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers addNewStoreQuestionnaireAnswers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers target = null;
            target = (eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers)get_store().add_element_user(STOREQUESTIONNAIREANSWERS$0);
            return target;
        }
    }
    /**
     * An XML StoreQuestionnaireAnswers(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class StoreQuestionnaireAnswersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.StoreQuestionnaireAnswersDocument.StoreQuestionnaireAnswers
    {
        
        public StoreQuestionnaireAnswersImpl(org.apache.xmlbeans.SchemaType sType)
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
        public eu.aladdin_project.xsd.QuestionnaireAnswers getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().find_element_user(DATA$0, 0);
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
        public void setData(eu.aladdin_project.xsd.QuestionnaireAnswers data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswers addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().add_element_user(DATA$0);
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
