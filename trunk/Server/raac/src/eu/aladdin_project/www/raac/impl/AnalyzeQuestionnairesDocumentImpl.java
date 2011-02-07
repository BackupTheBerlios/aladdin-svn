/*
 * An XML document type.
 * Localname: AnalyzeQuestionnaires
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac.impl;
/**
 * A document containing one AnalyzeQuestionnaires(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public class AnalyzeQuestionnairesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument
{
    
    public AnalyzeQuestionnairesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANALYZEQUESTIONNAIRES$0 = 
        new javax.xml.namespace.QName("http://www.aladdin-project.eu/raac/", "AnalyzeQuestionnaires");
    
    
    /**
     * Gets the "AnalyzeQuestionnaires" element
     */
    public eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires getAnalyzeQuestionnaires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires)get_store().find_element_user(ANALYZEQUESTIONNAIRES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AnalyzeQuestionnaires" element
     */
    public void setAnalyzeQuestionnaires(eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires analyzeQuestionnaires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires)get_store().find_element_user(ANALYZEQUESTIONNAIRES$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires)get_store().add_element_user(ANALYZEQUESTIONNAIRES$0);
            }
            target.set(analyzeQuestionnaires);
        }
    }
    
    /**
     * Appends and returns a new empty "AnalyzeQuestionnaires" element
     */
    public eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires addNewAnalyzeQuestionnaires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires)get_store().add_element_user(ANALYZEQUESTIONNAIRES$0);
            return target;
        }
    }
    /**
     * An XML AnalyzeQuestionnaires(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public static class AnalyzeQuestionnairesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires
    {
        
        public AnalyzeQuestionnairesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PATIENTID$0 = 
            new javax.xml.namespace.QName("", "PatientID");
        private static final javax.xml.namespace.QName ANSWERS$2 = 
            new javax.xml.namespace.QName("", "answers");
        
        
        /**
         * Gets the "PatientID" element
         */
        public java.lang.String getPatientID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PatientID" element
         */
        public org.apache.xmlbeans.XmlString xgetPatientID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PatientID" element
         */
        public void setPatientID(java.lang.String patientID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTID$0);
                }
                target.setStringValue(patientID);
            }
        }
        
        /**
         * Sets (as xml) the "PatientID" element
         */
        public void xsetPatientID(org.apache.xmlbeans.XmlString patientID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATIENTID$0);
                }
                target.set(patientID);
            }
        }
        
        /**
         * Gets array of all "answers" elements
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswer[] getAnswersArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ANSWERS$2, targetList);
                eu.aladdin_project.xsd.QuestionnaireAnswer[] result = new eu.aladdin_project.xsd.QuestionnaireAnswer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "answers" element
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswer getAnswersArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswer target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswer)get_store().find_element_user(ANSWERS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "answers" element
         */
        public int sizeOfAnswersArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANSWERS$2);
            }
        }
        
        /**
         * Sets array of all "answers" element
         */
        public void setAnswersArray(eu.aladdin_project.xsd.QuestionnaireAnswer[] answersArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(answersArray, ANSWERS$2);
            }
        }
        
        /**
         * Sets ith "answers" element
         */
        public void setAnswersArray(int i, eu.aladdin_project.xsd.QuestionnaireAnswer answers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswer target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswer)get_store().find_element_user(ANSWERS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(answers);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "answers" element
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswer insertNewAnswers(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswer target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswer)get_store().insert_element_user(ANSWERS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "answers" element
         */
        public eu.aladdin_project.xsd.QuestionnaireAnswer addNewAnswers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.QuestionnaireAnswer target = null;
                target = (eu.aladdin_project.xsd.QuestionnaireAnswer)get_store().add_element_user(ANSWERS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "answers" element
         */
        public void removeAnswers(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANSWERS$2, i);
            }
        }
    }
}
