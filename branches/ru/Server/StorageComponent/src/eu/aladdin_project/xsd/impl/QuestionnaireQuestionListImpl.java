/*
 * XML Type:  QuestionnaireQuestionList
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.QuestionnaireQuestionList
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML QuestionnaireQuestionList(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class QuestionnaireQuestionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.QuestionnaireQuestionList
{
    
    public QuestionnaireQuestionListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUESTION$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "question");
    
    
    /**
     * Gets array of all "question" elements
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion[] getQuestionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUESTION$0, targetList);
            eu.aladdin_project.xsd.QuestionnaireQuestion[] result = new eu.aladdin_project.xsd.QuestionnaireQuestion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "question" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion getQuestionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestion target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().find_element_user(QUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "question" element
     */
    public int sizeOfQuestionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUESTION$0);
        }
    }
    
    /**
     * Sets array of all "question" element
     */
    public void setQuestionArray(eu.aladdin_project.xsd.QuestionnaireQuestion[] questionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(questionArray, QUESTION$0);
        }
    }
    
    /**
     * Sets ith "question" element
     */
    public void setQuestionArray(int i, eu.aladdin_project.xsd.QuestionnaireQuestion question)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestion target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().find_element_user(QUESTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(question);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "question" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion insertNewQuestion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestion target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().insert_element_user(QUESTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "question" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion addNewQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestion target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().add_element_user(QUESTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "question" element
     */
    public void removeQuestion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUESTION$0, i);
        }
    }
}
