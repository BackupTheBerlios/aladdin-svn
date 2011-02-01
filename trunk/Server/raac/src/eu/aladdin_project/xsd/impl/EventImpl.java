/*
 * XML Type:  Event
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Event
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML Event(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class EventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.Event
{
    
    public EventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTTYPE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "EventType");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Subject");
    private static final javax.xml.namespace.QName TEXT$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Text");
    private static final javax.xml.namespace.QName TARGET$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Target");
    
    
    /**
     * Gets the "EventType" element
     */
    public eu.aladdin_project.xsd.SystemParameter getEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(EVENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EventType" element
     */
    public void setEventType(eu.aladdin_project.xsd.SystemParameter eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(EVENTTYPE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(EVENTTYPE$0);
            }
            target.set(eventType);
        }
    }
    
    /**
     * Appends and returns a new empty "EventType" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(EVENTTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Subject" element
     */
    public java.lang.String getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Subject" element
     */
    public org.apache.xmlbeans.XmlString xgetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Subject" element
     */
    public void setSubject(java.lang.String subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECT$2);
            }
            target.setStringValue(subject);
        }
    }
    
    /**
     * Sets (as xml) the "Subject" element
     */
    public void xsetSubject(org.apache.xmlbeans.XmlString subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$2);
            }
            target.set(subject);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$4, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$4);
            }
            target.set(text);
        }
    }
    
    /**
     * Gets the "Target" element
     */
    public java.lang.String getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Target" element
     */
    public org.apache.xmlbeans.XmlString xgetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGET$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(java.lang.String targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGET$6);
            }
            target.setStringValue(targetValue);
        }
    }
    
    /**
     * Sets (as xml) the "Target" element
     */
    public void xsetTarget(org.apache.xmlbeans.XmlString targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGET$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGET$6);
            }
            target.set(targetValue);
        }
    }
}
