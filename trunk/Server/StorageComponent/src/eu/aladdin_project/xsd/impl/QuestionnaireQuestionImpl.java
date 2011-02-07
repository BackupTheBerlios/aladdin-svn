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
    private static final javax.xml.namespace.QName GLOBALID$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "GlobalID");
    private static final javax.xml.namespace.QName ANSWERS$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "answers");
    private static final javax.xml.namespace.QName QUESTIONS$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "questions");
    private static final javax.xml.namespace.QName POSITION$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "position");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName TYPE$12 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName CONDITION$14 = 
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
     * Gets the "GlobalID" element
     */
    public int getGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOBALID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "GlobalID" element
     */
    public org.apache.xmlbeans.XmlInt xgetGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GLOBALID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GlobalID" element
     */
    public void setGlobalID(int globalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOBALID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLOBALID$2);
            }
            target.setIntValue(globalID);
        }
    }
    
    /**
     * Sets (as xml) the "GlobalID" element
     */
    public void xsetGlobalID(org.apache.xmlbeans.XmlInt globalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GLOBALID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(GLOBALID$2);
            }
            target.set(globalID);
        }
    }
    
    /**
     * Gets the "answers" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList getAnswers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList)get_store().find_element_user(ANSWERS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "answers" element
     */
    public void setAnswers(eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList answers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList)get_store().find_element_user(ANSWERS$4, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList)get_store().add_element_user(ANSWERS$4);
            }
            target.set(answers);
        }
    }
    
    /**
     * Appends and returns a new empty "answers" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList addNewAnswers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList)get_store().add_element_user(ANSWERS$4);
            return target;
        }
    }
    
    /**
     * Gets the "questions" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionList getQuestions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionList target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionList)get_store().find_element_user(QUESTIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "questions" element
     */
    public void setQuestions(eu.aladdin_project.xsd.QuestionnaireQuestionList questions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionList target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionList)get_store().find_element_user(QUESTIONS$6, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.QuestionnaireQuestionList)get_store().add_element_user(QUESTIONS$6);
            }
            target.set(questions);
        }
    }
    
    /**
     * Appends and returns a new empty "questions" element
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestionList addNewQuestions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.QuestionnaireQuestionList target = null;
            target = (eu.aladdin_project.xsd.QuestionnaireQuestionList)get_store().add_element_user(QUESTIONS$6);
            return target;
        }
    }
    
    /**
     * Gets the "position" element
     */
    public int getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITION$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "position" element
     */
    public org.apache.xmlbeans.XmlInt xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(POSITION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "position" element
     */
    public void setPosition(int position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSITION$8);
            }
            target.setIntValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "position" element
     */
    public void xsetPosition(org.apache.xmlbeans.XmlInt position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(POSITION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(POSITION$8);
            }
            target.set(position);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
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
            return get_store().find_attribute_user(ID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$10);
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
            get_store().remove_attribute(ID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$12);
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
            return get_store().find_attribute_user(TYPE$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$12);
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
            get_store().remove_attribute(TYPE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITION$14);
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
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(CONDITION$14);
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
            return get_store().find_attribute_user(CONDITION$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONDITION$14);
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
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(CONDITION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(CONDITION$14);
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
            get_store().remove_attribute(CONDITION$14);
        }
    }
}
