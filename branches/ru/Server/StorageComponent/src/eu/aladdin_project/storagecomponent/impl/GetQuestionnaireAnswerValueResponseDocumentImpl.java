/*
 * An XML document type.
 * Localname: getQuestionnaireAnswerValueResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one getQuestionnaireAnswerValueResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetQuestionnaireAnswerValueResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument
{
    
    public GetQuestionnaireAnswerValueResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONNAIREANSWERVALUERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "getQuestionnaireAnswerValueResponse");
    
    
    /**
     * Gets the "getQuestionnaireAnswerValueResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse getGetQuestionnaireAnswerValueResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse)get_store().find_element_user(GETQUESTIONNAIREANSWERVALUERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getQuestionnaireAnswerValueResponse" element
     */
    public void setGetQuestionnaireAnswerValueResponse(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse getQuestionnaireAnswerValueResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse)get_store().find_element_user(GETQUESTIONNAIREANSWERVALUERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse)get_store().add_element_user(GETQUESTIONNAIREANSWERVALUERESPONSE$0);
            }
            target.set(getQuestionnaireAnswerValueResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getQuestionnaireAnswerValueResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse addNewGetQuestionnaireAnswerValueResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse)get_store().add_element_user(GETQUESTIONNAIREANSWERVALUERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getQuestionnaireAnswerValueResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetQuestionnaireAnswerValueResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse
    {
        
        public GetQuestionnaireAnswerValueResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public java.lang.String getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "out" element
         */
        public org.apache.xmlbeans.XmlString xgetOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "out" element
         */
        public void setOut(java.lang.String out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUT$0);
                }
                target.setStringValue(out);
            }
        }
        
        /**
         * Sets (as xml) the "out" element
         */
        public void xsetOut(org.apache.xmlbeans.XmlString out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
    }
}
