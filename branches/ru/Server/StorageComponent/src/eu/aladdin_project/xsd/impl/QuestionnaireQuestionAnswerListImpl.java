/*
 * XML Type:  QuestionnaireQuestionAnswerList
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML QuestionnaireQuestionAnswerList(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class QuestionnaireQuestionAnswerListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList
{
    
    public QuestionnaireQuestionAnswerListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANSWER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "answer");
    
    
    /**
     * Gets array of all "answer" elements
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] getAnswerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANSWER$0, targetList);
            eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] result = new eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "answer" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswer getAnswerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionAnswer target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswer)get_store().find_element_user(ANSWER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "answer" element
     */
    public int sizeOfAnswerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWER$0);
        }
    }
    
    /**
     * Sets array of all "answer" element
     */
    public void setAnswerArray(eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] answerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(answerArray, ANSWER$0);
        }
    }
    
    /**
     * Sets ith "answer" element
     */
    public void setAnswerArray(int i, eu.aladdin_project.xsd.QuestionnaireQuestionAnswer answer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionAnswer target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswer)get_store().find_element_user(ANSWER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(answer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "answer" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswer insertNewAnswer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionAnswer target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswer)get_store().insert_element_user(ANSWER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "answer" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswer addNewAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionAnswer target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswer)get_store().add_element_user(ANSWER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "answer" element
     */
    public void removeAnswer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWER$0, i);
        }
    }
}
