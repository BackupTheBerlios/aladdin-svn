/*
 * XML Type:  SearchCriteria
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.SearchCriteria
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML SearchCriteria(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class SearchCriteriaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.SearchCriteria
{
    
    public SearchCriteriaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDNAME$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "FieldName");
    private static final javax.xml.namespace.QName COMPAREOP$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CompareOp");
    private static final javax.xml.namespace.QName FIELDVALUE1$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "FieldValue1");
    private static final javax.xml.namespace.QName FIELDVALUE2$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "FieldValue2");
    
    
    /**
     * Gets the "FieldName" element
     */
    public java.lang.String getFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldName" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FieldName" element
     */
    public void setFieldName(java.lang.String fieldName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDNAME$0);
            }
            target.setStringValue(fieldName);
        }
    }
    
    /**
     * Sets (as xml) the "FieldName" element
     */
    public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDNAME$0);
            }
            target.set(fieldName);
        }
    }
    
    /**
     * Gets the "CompareOp" element
     */
    public eu.aladdin_project.xsd.SystemParameter getCompareOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(COMPAREOP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompareOp" element
     */
    public void setCompareOp(eu.aladdin_project.xsd.SystemParameter compareOp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(COMPAREOP$2, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(COMPAREOP$2);
            }
            target.set(compareOp);
        }
    }
    
    /**
     * Appends and returns a new empty "CompareOp" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewCompareOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(COMPAREOP$2);
            return target;
        }
    }
    
    /**
     * Gets the "FieldValue1" element
     */
    public java.lang.String getFieldValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDVALUE1$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldValue1" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDVALUE1$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FieldValue1" element
     */
    public void setFieldValue1(java.lang.String fieldValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDVALUE1$4);
            }
            target.setStringValue(fieldValue1);
        }
    }
    
    /**
     * Sets (as xml) the "FieldValue1" element
     */
    public void xsetFieldValue1(org.apache.xmlbeans.XmlString fieldValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDVALUE1$4);
            }
            target.set(fieldValue1);
        }
    }
    
    /**
     * Gets the "FieldValue2" element
     */
    public java.lang.String getFieldValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDVALUE2$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldValue2" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDVALUE2$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "FieldValue2" element
     */
    public boolean isSetFieldValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDVALUE2$6) != 0;
        }
    }
    
    /**
     * Sets the "FieldValue2" element
     */
    public void setFieldValue2(java.lang.String fieldValue2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDVALUE2$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDVALUE2$6);
            }
            target.setStringValue(fieldValue2);
        }
    }
    
    /**
     * Sets (as xml) the "FieldValue2" element
     */
    public void xsetFieldValue2(org.apache.xmlbeans.XmlString fieldValue2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDVALUE2$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDVALUE2$6);
            }
            target.set(fieldValue2);
        }
    }
    
    /**
     * Unsets the "FieldValue2" element
     */
    public void unsetFieldValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDVALUE2$6, 0);
        }
    }
}
