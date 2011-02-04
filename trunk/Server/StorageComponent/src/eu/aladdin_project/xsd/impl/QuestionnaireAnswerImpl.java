/*
 * XML Type:  QuestionnaireAnswer
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.QuestionnaireAnswer
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML QuestionnaireAnswer(@http://aladdin-project.eu/xsd).
 *
 * This is an atomic type that is a restriction of eu.aladdin_project.xsd.QuestionnaireAnswer.
 */
public class QuestionnaireAnswerImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements eu.aladdin_project.xsd.QuestionnaireAnswer
{
    
    public QuestionnaireAnswerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected QuestionnaireAnswerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName QUESTIONID$2 = 
        new javax.xml.namespace.QName("", "questionID");
    private static final javax.xml.namespace.QName GLOBALID$4 = 
        new javax.xml.namespace.QName("", "globalID");
    
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$0) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$0);
        }
    }
    
    /**
     * Gets the "questionID" attribute
     */
    public java.lang.String getQuestionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUESTIONID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "questionID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetQuestionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUESTIONID$2);
            return target;
        }
    }
    
    /**
     * True if has "questionID" attribute
     */
    public boolean isSetQuestionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUESTIONID$2) != null;
        }
    }
    
    /**
     * Sets the "questionID" attribute
     */
    public void setQuestionID(java.lang.String questionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUESTIONID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUESTIONID$2);
            }
            target.setStringValue(questionID);
        }
    }
    
    /**
     * Sets (as xml) the "questionID" attribute
     */
    public void xsetQuestionID(org.apache.xmlbeans.XmlString questionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUESTIONID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QUESTIONID$2);
            }
            target.set(questionID);
        }
    }
    
    /**
     * Unsets the "questionID" attribute
     */
    public void unsetQuestionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUESTIONID$2);
        }
    }
    
    /**
     * Gets the "globalID" attribute
     */
    public java.lang.String getGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GLOBALID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "globalID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GLOBALID$4);
            return target;
        }
    }
    
    /**
     * True if has "globalID" attribute
     */
    public boolean isSetGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GLOBALID$4) != null;
        }
    }
    
    /**
     * Sets the "globalID" attribute
     */
    public void setGlobalID(java.lang.String globalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GLOBALID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GLOBALID$4);
            }
            target.setStringValue(globalID);
        }
    }
    
    /**
     * Sets (as xml) the "globalID" attribute
     */
    public void xsetGlobalID(org.apache.xmlbeans.XmlString globalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GLOBALID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GLOBALID$4);
            }
            target.set(globalID);
        }
    }
    
    /**
     * Unsets the "globalID" attribute
     */
    public void unsetGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GLOBALID$4);
        }
    }
}
