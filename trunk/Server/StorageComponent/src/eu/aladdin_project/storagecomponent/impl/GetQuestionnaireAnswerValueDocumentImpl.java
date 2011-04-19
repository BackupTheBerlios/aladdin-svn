/*
 * An XML document type.
 * Localname: getQuestionnaireAnswerValue
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one getQuestionnaireAnswerValue(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetQuestionnaireAnswerValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument
{
    
    public GetQuestionnaireAnswerValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONNAIREANSWERVALUE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "getQuestionnaireAnswerValue");
    
    
    /**
     * Gets the "getQuestionnaireAnswerValue" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue getGetQuestionnaireAnswerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue)get_store().find_element_user(GETQUESTIONNAIREANSWERVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getQuestionnaireAnswerValue" element
     */
    public void setGetQuestionnaireAnswerValue(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue getQuestionnaireAnswerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue)get_store().find_element_user(GETQUESTIONNAIREANSWERVALUE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue)get_store().add_element_user(GETQUESTIONNAIREANSWERVALUE$0);
            }
            target.set(getQuestionnaireAnswerValue);
        }
    }
    
    /**
     * Appends and returns a new empty "getQuestionnaireAnswerValue" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue addNewGetQuestionnaireAnswerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue)get_store().add_element_user(GETQUESTIONNAIREANSWERVALUE$0);
            return target;
        }
    }
    /**
     * An XML getQuestionnaireAnswerValue(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetQuestionnaireAnswerValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument.GetQuestionnaireAnswerValue
    {
        
        public GetQuestionnaireAnswerValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUESTIONID$0 = 
            new javax.xml.namespace.QName("", "questionId");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName LOCALE$4 = 
            new javax.xml.namespace.QName("", "locale");
        
        
        /**
         * Gets the "questionId" element
         */
        public java.lang.String getQuestionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "questionId" element
         */
        public org.apache.xmlbeans.XmlString xgetQuestionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "questionId" element
         */
        public void setQuestionId(java.lang.String questionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUESTIONID$0);
                }
                target.setStringValue(questionId);
            }
        }
        
        /**
         * Sets (as xml) the "questionId" element
         */
        public void xsetQuestionId(org.apache.xmlbeans.XmlString questionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUESTIONID$0);
                }
                target.set(questionId);
            }
        }
        
        /**
         * Gets the "value" element
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" element
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "value" element
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" element
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Gets the "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter getLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "locale" element
         */
        public void setLocale(eu.aladdin_project.xsd.SystemParameter locale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$4, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$4);
                }
                target.set(locale);
            }
        }
        
        /**
         * Appends and returns a new empty "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter addNewLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$4);
                return target;
            }
        }
    }
}
