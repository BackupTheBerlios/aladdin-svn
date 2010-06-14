/*
 * XML Type:  Questionnaire
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Questionnaire
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML Questionnaire(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class QuestionnaireImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.Questionnaire
{
    
    public QuestionnaireImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUESTIONS$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "questions");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName TITLE$6 = 
        new javax.xml.namespace.QName("", "title");
    
    
    /**
     * Gets array of all "questions" elements
     */
    public eu.aladdin_project.xsd.QuestionnaireQuestion[] getQuestionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUESTIONS$0, targetList);
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
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().find_element_user(QUESTIONS$0, i);
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
            return get_store().count_elements(QUESTIONS$0);
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
            arraySetterHelper(questionsArray, QUESTIONS$0);
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
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().find_element_user(QUESTIONS$0, i);
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
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().insert_element_user(QUESTIONS$0, i);
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
            target = (eu.aladdin_project.xsd.QuestionnaireQuestion)get_store().add_element_user(QUESTIONS$0);
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
            get_store().remove_element(QUESTIONS$0, i);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.math.BigDecimal getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$2);
            return target;
        }
    }
    
    /**
     * True if has "version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$2) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.math.BigDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$2);
            }
            target.setBigDecimalValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$2);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$6) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$6);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$6);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$6);
        }
    }
}
