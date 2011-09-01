/*
 * XML Type:  Identifier
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Identifier
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML Identifier(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class IdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.Identifier
{
    
    public IdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Type");
    private static final javax.xml.namespace.QName NUMBER$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Number");
    private static final javax.xml.namespace.QName ISSUEDATE$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IssueDate");
    private static final javax.xml.namespace.QName ISSUEAUTHORITY$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IssueAuthority");
    
    
    /**
     * Gets the "Type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "Number" element
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Number" element
     */
    public org.apache.xmlbeans.XmlString xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Number" element
     */
    public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "Number" element
     */
    public void xsetNumber(org.apache.xmlbeans.XmlString number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$2);
            }
            target.set(number);
        }
    }
    
    /**
     * Gets the "IssueDate" element
     */
    public java.util.Calendar getIssueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUEDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "IssueDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetIssueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ISSUEDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "IssueDate" element
     */
    public boolean isSetIssueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUEDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "IssueDate" element
     */
    public void setIssueDate(java.util.Calendar issueDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUEDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUEDATE$4);
            }
            target.setCalendarValue(issueDate);
        }
    }
    
    /**
     * Sets (as xml) the "IssueDate" element
     */
    public void xsetIssueDate(org.apache.xmlbeans.XmlDate issueDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ISSUEDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ISSUEDATE$4);
            }
            target.set(issueDate);
        }
    }
    
    /**
     * Unsets the "IssueDate" element
     */
    public void unsetIssueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUEDATE$4, 0);
        }
    }
    
    /**
     * Gets the "IssueAuthority" element
     */
    public java.lang.String getIssueAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUEAUTHORITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IssueAuthority" element
     */
    public org.apache.xmlbeans.XmlString xgetIssueAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUEAUTHORITY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IssueAuthority" element
     */
    public boolean isSetIssueAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUEAUTHORITY$6) != 0;
        }
    }
    
    /**
     * Sets the "IssueAuthority" element
     */
    public void setIssueAuthority(java.lang.String issueAuthority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUEAUTHORITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUEAUTHORITY$6);
            }
            target.setStringValue(issueAuthority);
        }
    }
    
    /**
     * Sets (as xml) the "IssueAuthority" element
     */
    public void xsetIssueAuthority(org.apache.xmlbeans.XmlString issueAuthority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUEAUTHORITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUEAUTHORITY$6);
            }
            target.set(issueAuthority);
        }
    }
    
    /**
     * Unsets the "IssueAuthority" element
     */
    public void unsetIssueAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUEAUTHORITY$6, 0);
        }
    }
}
