/*
 * XML Type:  Warning
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Warning
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML Warning(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class WarningImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.Warning
{
    
    public WarningImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID");
    private static final javax.xml.namespace.QName TYPEOFWARNING$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TypeOfWarning");
    private static final javax.xml.namespace.QName DATETIMEOFWARNING$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateTimeOfWarning");
    private static final javax.xml.namespace.QName EFFECT$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Effect");
    private static final javax.xml.namespace.QName INDICATOR$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Indicator");
    private static final javax.xml.namespace.QName RISKLEVEL$10 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "RiskLevel");
    private static final javax.xml.namespace.QName JUSTIFICATIONTEXT$12 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "JustificationText");
    private static final javax.xml.namespace.QName EMERGENCYLEVEL$14 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "EmergencyLevel");
    private static final javax.xml.namespace.QName PATIENT$16 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Patient");
    private static final javax.xml.namespace.QName DELIVERED$18 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Delivered");
    
    
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
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0) != 0;
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
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, 0);
        }
    }
    
    /**
     * Gets the "TypeOfWarning" element
     */
    public eu.aladdin_project.xsd.SystemParameter getTypeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(TYPEOFWARNING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TypeOfWarning" element
     */
    public boolean isSetTypeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEOFWARNING$2) != 0;
        }
    }
    
    /**
     * Sets the "TypeOfWarning" element
     */
    public void setTypeOfWarning(eu.aladdin_project.xsd.SystemParameter typeOfWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(TYPEOFWARNING$2, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(TYPEOFWARNING$2);
            }
            target.set(typeOfWarning);
        }
    }
    
    /**
     * Appends and returns a new empty "TypeOfWarning" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewTypeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(TYPEOFWARNING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "TypeOfWarning" element
     */
    public void unsetTypeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEOFWARNING$2, 0);
        }
    }
    
    /**
     * Gets the "DateTimeOfWarning" element
     */
    public java.util.Calendar getDateTimeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEOFWARNING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTimeOfWarning" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTimeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMEOFWARNING$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "DateTimeOfWarning" element
     */
    public boolean isSetDateTimeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATETIMEOFWARNING$4) != 0;
        }
    }
    
    /**
     * Sets the "DateTimeOfWarning" element
     */
    public void setDateTimeOfWarning(java.util.Calendar dateTimeOfWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEOFWARNING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMEOFWARNING$4);
            }
            target.setCalendarValue(dateTimeOfWarning);
        }
    }
    
    /**
     * Sets (as xml) the "DateTimeOfWarning" element
     */
    public void xsetDateTimeOfWarning(org.apache.xmlbeans.XmlDateTime dateTimeOfWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMEOFWARNING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIMEOFWARNING$4);
            }
            target.set(dateTimeOfWarning);
        }
    }
    
    /**
     * Unsets the "DateTimeOfWarning" element
     */
    public void unsetDateTimeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATETIMEOFWARNING$4, 0);
        }
    }
    
    /**
     * Gets the "Effect" element
     */
    public eu.aladdin_project.xsd.SystemParameter getEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(EFFECT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Effect" element
     */
    public boolean isSetEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECT$6) != 0;
        }
    }
    
    /**
     * Sets the "Effect" element
     */
    public void setEffect(eu.aladdin_project.xsd.SystemParameter effect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(EFFECT$6, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(EFFECT$6);
            }
            target.set(effect);
        }
    }
    
    /**
     * Appends and returns a new empty "Effect" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(EFFECT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Effect" element
     */
    public void unsetEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECT$6, 0);
        }
    }
    
    /**
     * Gets the "Indicator" element
     */
    public eu.aladdin_project.xsd.SystemParameter getIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(INDICATOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Indicator" element
     */
    public boolean isSetIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDICATOR$8) != 0;
        }
    }
    
    /**
     * Sets the "Indicator" element
     */
    public void setIndicator(eu.aladdin_project.xsd.SystemParameter indicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(INDICATOR$8, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(INDICATOR$8);
            }
            target.set(indicator);
        }
    }
    
    /**
     * Appends and returns a new empty "Indicator" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(INDICATOR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Indicator" element
     */
    public void unsetIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDICATOR$8, 0);
        }
    }
    
    /**
     * Gets the "RiskLevel" element
     */
    public eu.aladdin_project.xsd.SystemParameter getRiskLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(RISKLEVEL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RiskLevel" element
     */
    public boolean isSetRiskLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RISKLEVEL$10) != 0;
        }
    }
    
    /**
     * Sets the "RiskLevel" element
     */
    public void setRiskLevel(eu.aladdin_project.xsd.SystemParameter riskLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(RISKLEVEL$10, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(RISKLEVEL$10);
            }
            target.set(riskLevel);
        }
    }
    
    /**
     * Appends and returns a new empty "RiskLevel" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewRiskLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(RISKLEVEL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "RiskLevel" element
     */
    public void unsetRiskLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RISKLEVEL$10, 0);
        }
    }
    
    /**
     * Gets the "JustificationText" element
     */
    public java.lang.String getJustificationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JUSTIFICATIONTEXT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JustificationText" element
     */
    public org.apache.xmlbeans.XmlString xgetJustificationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JUSTIFICATIONTEXT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "JustificationText" element
     */
    public boolean isSetJustificationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JUSTIFICATIONTEXT$12) != 0;
        }
    }
    
    /**
     * Sets the "JustificationText" element
     */
    public void setJustificationText(java.lang.String justificationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JUSTIFICATIONTEXT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JUSTIFICATIONTEXT$12);
            }
            target.setStringValue(justificationText);
        }
    }
    
    /**
     * Sets (as xml) the "JustificationText" element
     */
    public void xsetJustificationText(org.apache.xmlbeans.XmlString justificationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JUSTIFICATIONTEXT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JUSTIFICATIONTEXT$12);
            }
            target.set(justificationText);
        }
    }
    
    /**
     * Unsets the "JustificationText" element
     */
    public void unsetJustificationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JUSTIFICATIONTEXT$12, 0);
        }
    }
    
    /**
     * Gets the "EmergencyLevel" element
     */
    public eu.aladdin_project.xsd.SystemParameter getEmergencyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(EMERGENCYLEVEL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EmergencyLevel" element
     */
    public boolean isSetEmergencyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMERGENCYLEVEL$14) != 0;
        }
    }
    
    /**
     * Sets the "EmergencyLevel" element
     */
    public void setEmergencyLevel(eu.aladdin_project.xsd.SystemParameter emergencyLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(EMERGENCYLEVEL$14, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(EMERGENCYLEVEL$14);
            }
            target.set(emergencyLevel);
        }
    }
    
    /**
     * Appends and returns a new empty "EmergencyLevel" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewEmergencyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(EMERGENCYLEVEL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "EmergencyLevel" element
     */
    public void unsetEmergencyLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMERGENCYLEVEL$14, 0);
        }
    }
    
    /**
     * Gets the "Patient" element
     */
    public eu.aladdin_project.xsd.Patient getPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Patient target = null;
            target = (eu.aladdin_project.xsd.Patient)get_store().find_element_user(PATIENT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Patient" element
     */
    public boolean isSetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENT$16) != 0;
        }
    }
    
    /**
     * Sets the "Patient" element
     */
    public void setPatient(eu.aladdin_project.xsd.Patient patient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Patient target = null;
            target = (eu.aladdin_project.xsd.Patient)get_store().find_element_user(PATIENT$16, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.Patient)get_store().add_element_user(PATIENT$16);
            }
            target.set(patient);
        }
    }
    
    /**
     * Appends and returns a new empty "Patient" element
     */
    public eu.aladdin_project.xsd.Patient addNewPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Patient target = null;
            target = (eu.aladdin_project.xsd.Patient)get_store().add_element_user(PATIENT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Patient" element
     */
    public void unsetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENT$16, 0);
        }
    }
    
    /**
     * Gets the "Delivered" element
     */
    public boolean getDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERED$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Delivered" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELIVERED$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "Delivered" element
     */
    public boolean isSetDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERED$18) != 0;
        }
    }
    
    /**
     * Sets the "Delivered" element
     */
    public void setDelivered(boolean delivered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERED$18);
            }
            target.setBooleanValue(delivered);
        }
    }
    
    /**
     * Sets (as xml) the "Delivered" element
     */
    public void xsetDelivered(org.apache.xmlbeans.XmlBoolean delivered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELIVERED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DELIVERED$18);
            }
            target.set(delivered);
        }
    }
    
    /**
     * Unsets the "Delivered" element
     */
    public void unsetDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERED$18, 0);
        }
    }
}
