/*
 * An XML document type.
 * Localname: GetQuestionnaireAnswersByTaskResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetQuestionnaireAnswersByTaskResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetQuestionnaireAnswersByTaskResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument
{
    
    public GetQuestionnaireAnswersByTaskResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONNAIREANSWERSBYTASKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetQuestionnaireAnswersByTaskResponse");
    
    
    /**
     * Gets the "GetQuestionnaireAnswersByTaskResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse getGetQuestionnaireAnswersByTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse)get_store().find_element_user(GETQUESTIONNAIREANSWERSBYTASKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuestionnaireAnswersByTaskResponse" element
     */
    public void setGetQuestionnaireAnswersByTaskResponse(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse getQuestionnaireAnswersByTaskResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse)get_store().find_element_user(GETQUESTIONNAIREANSWERSBYTASKRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse)get_store().add_element_user(GETQUESTIONNAIREANSWERSBYTASKRESPONSE$0);
            }
            target.set(getQuestionnaireAnswersByTaskResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuestionnaireAnswersByTaskResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse addNewGetQuestionnaireAnswersByTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse)get_store().add_element_user(GETQUESTIONNAIREANSWERSBYTASKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetQuestionnaireAnswersByTaskResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetQuestionnaireAnswersByTaskResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse
    {
        
        public GetQuestionnaireAnswersByTaskResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswers getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "out" element
         */
        public void setOut(eu.aladdin_project.xsd.QuestionnaireAnswers out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswers addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
