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
    private static final javax.xml.namespace.QName PATIENTID$16 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientID");
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
     * Gets the "TypeOfWarning" element
     */
    public java.lang.String getTypeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFWARNING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeOfWarning" element
     */
    public org.apache.xmlbeans.XmlString xgetTypeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEOFWARNING$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TypeOfWarning" element
     */
    public void setTypeOfWarning(java.lang.String typeOfWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFWARNING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEOFWARNING$2);
            }
            target.setStringValue(typeOfWarning);
        }
    }
    
    /**
     * Sets (as xml) the "TypeOfWarning" element
     */
    public void xsetTypeOfWarning(org.apache.xmlbeans.XmlString typeOfWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEOFWARNING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEOFWARNING$2);
            }
            target.set(typeOfWarning);
        }
    }
    
    /**
     * Gets the "DateTimeOfWarning" element
     */
    public eu.aladdin_project.xsd.SystemParameter getDateTimeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(DATETIMEOFWARNING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DateTimeOfWarning" element
     */
    public void setDateTimeOfWarning(eu.aladdin_project.xsd.SystemParameter dateTimeOfWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(DATETIMEOFWARNING$4, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(DATETIMEOFWARNING$4);
            }
            target.set(dateTimeOfWarning);
        }
    }
    
    /**
     * Appends and returns a new empty "DateTimeOfWarning" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewDateTimeOfWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(DATETIMEOFWARNING$4);
            return target;
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
     * Gets the "PatientID" element
     */
    public java.lang.String getPatientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTID$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATIENTID$16);
            }
            target.set(patientID);
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
}
