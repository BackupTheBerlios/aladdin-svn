/*
 * An XML document type.
 * Localname: GetQuestionnaireAnswersResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetQuestionnaireAnswersResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetQuestionnaireAnswersResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument
{
    
    public GetQuestionnaireAnswersResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONNAIREANSWERSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetQuestionnaireAnswersResponse");
    
    
    /**
     * Gets the "GetQuestionnaireAnswersResponse" element
     */
    public eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse getGetQuestionnaireAnswersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse)get_store().find_element_user(GETQUESTIONNAIREANSWERSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuestionnaireAnswersResponse" element
     */
    public void setGetQuestionnaireAnswersResponse(eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse getQuestionnaireAnswersResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse)get_store().find_element_user(GETQUESTIONNAIREANSWERSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse)get_store().add_element_user(GETQUESTIONNAIREANSWERSRESPONSE$0);
            }
            target.set(getQuestionnaireAnswersResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuestionnaireAnswersResponse" element
     */
    public eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse addNewGetQuestionnaireAnswersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse)get_store().add_element_user(GETQUESTIONNAIREANSWERSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetQuestionnaireAnswersResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetQuestionnaireAnswersResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse
    {
        
        public GetQuestionnaireAnswersResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswers[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.QuestionnaireAnswers[] result = new eu.aladdin_project.xsd.QuestionnaireAnswers[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswers getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().find_element_user(OUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "out" element
         */
        public int sizeOfOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUT$0);
            }
        }
        
        /**
         * Sets array of all "out" element
         */
        public void setOutArray(eu.aladdin_project.xsd.QuestionnaireAnswers[] outArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(outArray, OUT$0);
            }
        }
        
        /**
         * Sets ith "out" element
         */
        public void setOutArray(int i, eu.aladdin_project.xsd.QuestionnaireAnswers out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().find_element_user(OUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(out);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "out" element
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswers insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswers target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswers)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
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
        
        /**
         * Removes the ith "out" element
         */
        public void removeOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUT$0, i);
            }
        }
    }
}
