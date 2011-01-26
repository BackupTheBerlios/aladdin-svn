/*
 * XML Type:  QuestionnaireAnswers
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.QuestionnaireAnswers
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML QuestionnaireAnswers(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class QuestionnaireAnswersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.QuestionnaireAnswers
{
    
    public QuestionnaireAnswersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANSWER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "answer");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName DATETIME$4 = 
        new javax.xml.namespace.QName("", "DateTime");
    private static final javax.xml.namespace.QName OBJECTID$6 = 
        new javax.xml.namespace.QName("", "ObjectID");
    private static final javax.xml.namespace.QName TASKID$8 = 
        new javax.xml.namespace.QName("", "TaskID");
    private static final javax.xml.namespace.QName USERID$10 = 
        new javax.xml.namespace.QName("", "UserID");
    
    
    /**
     * Gets array of all "answer" elements
     */
    public eu.aladdin_project.xsd.QuestionnaireAnswer[] getAnswerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANSWER$0, targetList);
            eu.aladdin_project.xsd.QuestionnaireAnswer[] result = new eu.aladdin_project.xsd.QuestionnaireAnswer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "answer" element
     */
    public eu.aladdin_project.xsd.QuestionnaireAnswer getAnswerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireAnswer target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireAnswer)get_store().find_element_user(ANSWER$0, i);
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
    public void setAnswerArray(eu.aladdin_project.xsd.QuestionnaireAnswer[] answerArray)
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
    public void setAnswerArray(int i, eu.aladdin_project.xsd.QuestionnaireAnswer answer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireAnswer target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireAnswer)get_store().find_element_user(ANSWER$0, i);
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
    public eu.aladdin_project.xsd.QuestionnaireAnswer insertNewAnswer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireAnswer target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireAnswer)get_store().insert_element_user(ANSWER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "answer" element
     */
    public eu.aladdin_project.xsd.QuestionnaireAnswer addNewAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireAnswer target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireAnswer)get_store().add_element_user(ANSWER$0);
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
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
    
    /**
     * Gets the "DateTime" attribute
     */
    public java.util.Calendar getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATETIME$4);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATETIME$4);
            return target;
        }
    }
    
    /**
     * True if has "DateTime" attribute
     */
    public boolean isSetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATETIME$4) != null;
        }
    }
    
    /**
     * Sets the "DateTime" attribute
     */
    public void setDateTime(java.util.Calendar dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATETIME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATETIME$4);
            }
            target.setCalendarValue(dateTime);
        }
    }
    
    /**
     * Sets (as xml) the "DateTime" attribute
     */
    public void xsetDateTime(org.apache.xmlbeans.XmlDateTime dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATETIME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATETIME$4);
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Unsets the "DateTime" attribute
     */
    public void unsetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATETIME$4);
        }
    }
    
    /**
     * Gets the "ObjectID" attribute
     */
    public java.lang.String getObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJECTID$6);
            return target;
        }
    }
    
    /**
     * True if has "ObjectID" attribute
     */
    public boolean isSetObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OBJECTID$6) != null;
        }
    }
    
    /**
     * Sets the "ObjectID" attribute
     */
    public void setObjectID(java.lang.String objectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTID$6);
            }
            target.setStringValue(objectID);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectID" attribute
     */
    public void xsetObjectID(org.apache.xmlbeans.XmlString objectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJECTID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OBJECTID$6);
            }
            target.set(objectID);
        }
    }
    
    /**
     * Unsets the "ObjectID" attribute
     */
    public void unsetObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OBJECTID$6);
        }
    }
    
    /**
     * Gets the "TaskID" attribute
     */
    public java.lang.String getTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TASKID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaskID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TASKID$8);
            return target;
        }
    }
    
    /**
     * True if has "TaskID" attribute
     */
    public boolean isSetTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TASKID$8) != null;
        }
    }
    
    /**
     * Sets the "TaskID" attribute
     */
    public void setTaskID(java.lang.String taskID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TASKID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TASKID$8);
            }
            target.setStringValue(taskID);
        }
    }
    
    /**
     * Sets (as xml) the "TaskID" attribute
     */
    public void xsetTaskID(org.apache.xmlbeans.XmlString taskID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TASKID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TASKID$8);
            }
            target.set(taskID);
        }
    }
    
    /**
     * Unsets the "TaskID" attribute
     */
    public void unsetTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TASKID$8);
        }
    }
    
    /**
     * Gets the "UserID" attribute
     */
    public java.lang.String getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERID$10);
            return target;
        }
    }
    
    /**
     * True if has "UserID" attribute
     */
    public boolean isSetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERID$10) != null;
        }
    }
    
    /**
     * Sets the "UserID" attribute
     */
    public void setUserID(java.lang.String userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERID$10);
            }
            target.setStringValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "UserID" attribute
     */
    public void xsetUserID(org.apache.xmlbeans.XmlString userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERID$10);
            }
            target.set(userID);
        }
    }
    
    /**
     * Unsets the "UserID" attribute
     */
    public void unsetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERID$10);
        }
    }
}
