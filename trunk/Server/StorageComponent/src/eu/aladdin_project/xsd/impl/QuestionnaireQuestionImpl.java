/*
 * XML Type:  QuestionnaireQuestion
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.QuestionnaireQuestion
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML QuestionnaireQuestion(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class QuestionnaireQuestionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.QuestionnaireQuestion
{
    
    public QuestionnaireQuestionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "title");
    private static final javax.xml.namespace.QName ANSWER$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "answer");
    private static final javax.xml.namespace.QName QUESTIONS$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "questions");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName CONDITION$10 = 
        new javax.xml.namespace.QName("", "condition");
    
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
            }
            target.set(title);
        }
    }
    
    /**
     * Gets array of all "answer" elements
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] getAnswerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANSWER$2, targetList);
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
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswer)get_store().find_element_user(ANSWER$2, i);
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
            return get_store().count_elements(ANSWER$2);
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
            arraySetterHelper(answerArray, ANSWER$2);
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
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswer)get_store().find_element_user(ANSWER$2, i);
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
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswer)get_store().insert_element_user(ANSWER$2, i);
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
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswer)get_store().add_element_user(ANSWER$2);
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
            get_store().remove_element(ANSWER$2, i);
        }
    }
    
    /**
     * Gets array of all "questions" elements
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion[] getQuestionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUESTIONS$4, targetList);
            eu.aladdin_project.xsd.QuestionnaireQuestion[] result = new eu.aladdin_project.xsd.QuestionnaireQuestion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "questions" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion getQuestionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestion target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().find_element_user(QUESTIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "questions" element
     */
    public int sizeOfQuestionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUESTIONS$4);
        }
    }
    
    /**
     * Sets array of all "questions" element
     */
    public void setQuestionsArray(eu.aladdin_project.xsd.QuestionnaireQuestion[] questionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(questionsArray, QUESTIONS$4);
        }
    }
    
    /**
     * Sets ith "questions" element
     */
    public void setQuestionsArray(int i, eu.aladdin_project.xsd.QuestionnaireQuestion questions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestion target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().find_element_user(QUESTIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(questions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "questions" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion insertNewQuestions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestion target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().insert_element_user(QUESTIONS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "questions" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion addNewQuestions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestion target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().add_element_user(QUESTIONS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "questions" element
     */
    public void removeQuestions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUESTIONS$4, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$6) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$6);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$8);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$8) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$8);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$8);
        }
    }
    
    /**
     * Gets the "condition" attribute
     */
    public short getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITION$10);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "condition" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(CONDITION$10);
            return target;
        }
    }
    
    /**
     * True if has "condition" attribute
     */
    public boolean isSetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONDITION$10) != null;
        }
    }
    
    /**
     * Sets the "condition" attribute
     */
    public void setCondition(short condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONDITION$10);
            }
            target.setShortValue(condition);
        }
    }
    
    /**
     * Sets (as xml) the "condition" attribute
     */
    public void xsetCondition(org.apache.xmlbeans.XmlUnsignedByte condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(CONDITION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(CONDITION$10);
            }
            target.set(condition);
        }
    }
    
    /**
     * Unsets the "condition" attribute
     */
    public void unsetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONDITION$10);
        }
    }
}
