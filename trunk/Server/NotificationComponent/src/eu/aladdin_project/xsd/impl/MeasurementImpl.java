/*
 * XML Type:  Measurement
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Measurement
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML Measurement(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.Measurement
{
    
    public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Type");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Value");
    private static final javax.xml.namespace.QName DATETIME$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateTime");
    private static final javax.xml.namespace.QName UNITS$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Units");
    private static final javax.xml.namespace.QName LOWERLIMIT$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "LowerLimit");
    private static final javax.xml.namespace.QName UPPERLIMIT$10 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "UpperLimit");
    private static final javax.xml.namespace.QName PATIENTID$12 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientID");
    private static final javax.xml.namespace.QName TASKID$14 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TaskID");
    
    
    /**
     * Gets the "Type" element
     */
    public eu.aladdin_project.xsd.SystemParameter getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(eu.aladdin_project.xsd.SystemParameter type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "Type" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Value" element
     */
    public java.math.BigDecimal getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(java.math.BigDecimal value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
            }
            target.setBigDecimalValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlDecimal value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "DateTime" element
     */
    public java.util.Calendar getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DateTime" element
     */
    public void setDateTime(java.util.Calendar dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIME$4);
            }
            target.setCalendarValue(dateTime);
        }
    }
    
    /**
     * Sets (as xml) the "DateTime" element
     */
    public void xsetDateTime(org.apache.xmlbeans.XmlDateTime dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIME$4);
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Gets the "Units" element
     */
    public java.lang.String getUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Units" element
     */
    public org.apache.xmlbeans.XmlString xgetUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNITS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Units" element
     */
    public void setUnits(java.lang.String units)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITS$6);
            }
            target.setStringValue(units);
        }
    }
    
    /**
     * Sets (as xml) the "Units" element
     */
    public void xsetUnits(org.apache.xmlbeans.XmlString units)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNITS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNITS$6);
            }
            target.set(units);
        }
    }
    
    /**
     * Gets the "LowerLimit" element
     */
    public java.math.BigDecimal getLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERLIMIT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "LowerLimit" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LOWERLIMIT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "LowerLimit" element
     */
    public boolean isSetLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERLIMIT$8) != 0;
        }
    }
    
    /**
     * Sets the "LowerLimit" element
     */
    public void setLowerLimit(java.math.BigDecimal lowerLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERLIMIT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERLIMIT$8);
            }
            target.setBigDecimalValue(lowerLimit);
        }
    }
    
    /**
     * Sets (as xml) the "LowerLimit" element
     */
    public void xsetLowerLimit(org.apache.xmlbeans.XmlDecimal lowerLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LOWERLIMIT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LOWERLIMIT$8);
            }
            target.set(lowerLimit);
        }
    }
    
    /**
     * Unsets the "LowerLimit" element
     */
    public void unsetLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERLIMIT$8, 0);
        }
    }
    
    /**
     * Gets the "UpperLimit" element
     */
    public java.math.BigDecimal getUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERLIMIT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpperLimit" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UPPERLIMIT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpperLimit" element
     */
    public boolean isSetUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERLIMIT$10) != 0;
        }
    }
    
    /**
     * Sets the "UpperLimit" element
     */
    public void setUpperLimit(java.math.BigDecimal upperLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERLIMIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERLIMIT$10);
            }
            target.setBigDecimalValue(upperLimit);
        }
    }
    
    /**
     * Sets (as xml) the "UpperLimit" element
     */
    public void xsetUpperLimit(org.apache.xmlbeans.XmlDecimal upperLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UPPERLIMIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UPPERLIMIT$10);
            }
            target.set(upperLimit);
        }
    }
    
    /**
     * Unsets the "UpperLimit" element
     */
    public void unsetUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERLIMIT$10, 0);
        }
    }
    
    /**
     * Gets the "PatientID" element
     */
    public java.lang.String getPatientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PatientID" element
     */
    public org.apache.xmlbeans.XmlString xgetPatientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PatientID" element
     */
    public void setPatientID(java.lang.String patientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTID$12);
            }
            target.setStringValue(patientID);
        }
    }
    
    /**
     * Sets (as xml) the "PatientID" element
     */
    public void xsetPatientID(org.apache.xmlbeans.XmlString patientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATIENTID$12);
            }
            target.set(patientID);
        }
    }
    
    /**
     * Gets the "TaskID" element
     */
    public java.lang.String getTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaskID" element
     */
    public org.apache.xmlbeans.XmlString xgetTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaskID" element
     */
    public void setTaskID(java.lang.String taskID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKID$14);
            }
            target.setStringValue(taskID);
        }
    }
    
    /**
     * Sets (as xml) the "TaskID" element
     */
    public void xsetTaskID(org.apache.xmlbeans.XmlString taskID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASKID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASKID$14);
            }
            target.set(taskID);
        }
    }
}
