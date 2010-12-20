/*
 * XML Type:  Task
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Task
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML Task(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class TaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.Task
{
    
    public TaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID");
    private static final javax.xml.namespace.QName TASKTYPE$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TaskType");
    private static final javax.xml.namespace.QName DATETIMEASSIGNED$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateTimeAssigned");
    private static final javax.xml.namespace.QName DATETIMEFULFILLED$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateTimeFulfilled");
    private static final javax.xml.namespace.QName TASKSTATUS$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TaskStatus");
    private static final javax.xml.namespace.QName URL$10 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "URL");
    private static final javax.xml.namespace.QName TEXT$12 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Text");
    private static final javax.xml.namespace.QName QUESTIONNAIRE$14 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Questionnaire");
    private static final javax.xml.namespace.QName EXECUTORID$16 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ExecutorID");
    private static final javax.xml.namespace.QName ASSIGNERID$18 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "AssignerID");
    private static final javax.xml.namespace.QName OBJECTID$20 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ObjectID");
    
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "TaskType" element
     */
    public eu.aladdin_project.xsd.SystemParameter getTaskType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(TASKTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TaskType" element
     */
    public void setTaskType(eu.aladdin_project.xsd.SystemParameter taskType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(TASKTYPE$2, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(TASKTYPE$2);
            }
            target.set(taskType);
        }
    }
    
    /**
     * Appends and returns a new empty "TaskType" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewTaskType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(TASKTYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "DateTimeAssigned" element
     */
    public java.util.Calendar getDateTimeAssigned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEASSIGNED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTimeAssigned" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTimeAssigned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMEASSIGNED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DateTimeAssigned" element
     */
    public void setDateTimeAssigned(java.util.Calendar dateTimeAssigned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEASSIGNED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMEASSIGNED$4);
            }
            target.setCalendarValue(dateTimeAssigned);
        }
    }
    
    /**
     * Sets (as xml) the "DateTimeAssigned" element
     */
    public void xsetDateTimeAssigned(org.apache.xmlbeans.XmlDateTime dateTimeAssigned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMEASSIGNED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIMEASSIGNED$4);
            }
            target.set(dateTimeAssigned);
        }
    }
    
    /**
     * Gets the "DateTimeFulfilled" element
     */
    public java.util.Calendar getDateTimeFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEFULFILLED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTimeFulfilled" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTimeFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMEFULFILLED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DateTimeFulfilled" element
     */
    public void setDateTimeFulfilled(java.util.Calendar dateTimeFulfilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEFULFILLED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMEFULFILLED$6);
            }
            target.setCalendarValue(dateTimeFulfilled);
        }
    }
    
    /**
     * Sets (as xml) the "DateTimeFulfilled" element
     */
    public void xsetDateTimeFulfilled(org.apache.xmlbeans.XmlDateTime dateTimeFulfilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMEFULFILLED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIMEFULFILLED$6);
            }
            target.set(dateTimeFulfilled);
        }
    }
    
    /**
     * Gets the "TaskStatus" element
     */
    public eu.aladdin_project.xsd.SystemParameter getTaskStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(TASKSTATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TaskStatus" element
     */
    public void setTaskStatus(eu.aladdin_project.xsd.SystemParameter taskStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(TASKSTATUS$8, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(TASKSTATUS$8);
            }
            target.set(taskStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "TaskStatus" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewTaskStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(TASKSTATUS$8);
            return target;
        }
    }
    
    /**
     * Gets the "URL" element
     */
    public java.lang.String getURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URL" element
     */
    public org.apache.xmlbeans.XmlString xgetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "URL" element
     */
    public boolean isSetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$10) != 0;
        }
    }
    
    /**
     * Sets the "URL" element
     */
    public void setURL(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$10);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "URL" element
     */
    public void xsetURL(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$10);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "URL" element
     */
    public void unsetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$10, 0);
        }
    }
    
    /**
     * Gets the "Text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Text" element
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$12) != 0;
        }
    }
    
    /**
     * Sets the "Text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$12);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "Text" element
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$12);
            }
            target.set(text);
        }
    }
    
    /**
     * Unsets the "Text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$12, 0);
        }
    }
    
    /**
     * Gets the "Questionnaire" element
     */
    public eu.aladdin_project.xsd.Questionnaire getQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Questionnaire target = null;
            target = (eu.aladdin_project.xsd.Questionnaire)get_store().find_element_user(QUESTIONNAIRE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Questionnaire" element
     */
    public boolean isSetQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUESTIONNAIRE$14) != 0;
        }
    }
    
    /**
     * Sets the "Questionnaire" element
     */
    public void setQuestionnaire(eu.aladdin_project.xsd.Questionnaire questionnaire)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Questionnaire target = null;
            target = (eu.aladdin_project.xsd.Questionnaire)get_store().find_element_user(QUESTIONNAIRE$14, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.Questionnaire)get_store().add_element_user(QUESTIONNAIRE$14);
            }
            target.set(questionnaire);
        }
    }
    
    /**
     * Appends and returns a new empty "Questionnaire" element
     */
    public eu.aladdin_project.xsd.Questionnaire addNewQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Questionnaire target = null;
            target = (eu.aladdin_project.xsd.Questionnaire)get_store().add_element_user(QUESTIONNAIRE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Questionnaire" element
     */
    public void unsetQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUESTIONNAIRE$14, 0);
        }
    }
    
    /**
     * Gets the "ExecutorID" element
     */
    public java.lang.String getExecutorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTORID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExecutorID" element
     */
    public org.apache.xmlbeans.XmlString xgetExecutorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXECUTORID$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExecutorID" element
     */
    public void setExecutorID(java.lang.String executorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTORID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXECUTORID$16);
            }
            target.setStringValue(executorID);
        }
    }
    
    /**
     * Sets (as xml) the "ExecutorID" element
     */
    public void xsetExecutorID(org.apache.xmlbeans.XmlString executorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXECUTORID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXECUTORID$16);
            }
            target.set(executorID);
        }
    }
    
    /**
     * Gets the "AssignerID" element
     */
    public java.lang.String getAssignerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNERID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AssignerID" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNERID$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AssignerID" element
     */
    public void setAssignerID(java.lang.String assignerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNERID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNERID$18);
            }
            target.setStringValue(assignerID);
        }
    }
    
    /**
     * Sets (as xml) the "AssignerID" element
     */
    public void xsetAssignerID(org.apache.xmlbeans.XmlString assignerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNERID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNERID$18);
            }
            target.set(assignerID);
        }
    }
    
    /**
     * Gets the "ObjectID" element
     */
    public java.lang.String getObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectID" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTID$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ObjectID" element
     */
    public void setObjectID(java.lang.String objectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTID$20);
            }
            target.setStringValue(objectID);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectID" element
     */
    public void xsetObjectID(org.apache.xmlbeans.XmlString objectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTID$20);
            }
            target.set(objectID);
        }
    }
}
