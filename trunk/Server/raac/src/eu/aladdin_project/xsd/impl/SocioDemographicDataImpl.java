/*
 * XML Type:  SocioDemographicData
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.SocioDemographicData
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML SocioDemographicData(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class SocioDemographicDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.SocioDemographicData
{
    
    public SocioDemographicDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENDER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Gender");
    private static final javax.xml.namespace.QName MARITALSTATUS$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "MaritalStatus");
    private static final javax.xml.namespace.QName CHILDREN$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Children");
    private static final javax.xml.namespace.QName LIVINGWITH$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "LivingWith");
    private static final javax.xml.namespace.QName BIRTHDAY$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "birthday");
    
    
    /**
     * Gets the "Gender" element
     */
    public eu.aladdin_project.xsd.SystemParameter getGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(GENDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Gender" element
     */
    public boolean isSetGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENDER$0) != 0;
        }
    }
    
    /**
     * Sets the "Gender" element
     */
    public void setGender(eu.aladdin_project.xsd.SystemParameter gender)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(GENDER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(GENDER$0);
            }
            target.set(gender);
        }
    }
    
    /**
     * Appends and returns a new empty "Gender" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(GENDER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Gender" element
     */
    public void unsetGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENDER$0, 0);
        }
    }
    
    /**
     * Gets the "MaritalStatus" element
     */
    public eu.aladdin_project.xsd.SystemParameter getMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(MARITALSTATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MaritalStatus" element
     */
    public boolean isSetMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARITALSTATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "MaritalStatus" element
     */
    public void setMaritalStatus(eu.aladdin_project.xsd.SystemParameter maritalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(MARITALSTATUS$2, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(MARITALSTATUS$2);
            }
            target.set(maritalStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "MaritalStatus" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(MARITALSTATUS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MaritalStatus" element
     */
    public void unsetMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARITALSTATUS$2, 0);
        }
    }
    
    /**
     * Gets the "Children" element
     */
    public short getChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDREN$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "Children" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CHILDREN$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Children" element
     */
    public boolean isSetChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDREN$4) != 0;
        }
    }
    
    /**
     * Sets the "Children" element
     */
    public void setChildren(short children)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDREN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILDREN$4);
            }
            target.setShortValue(children);
        }
    }
    
    /**
     * Sets (as xml) the "Children" element
     */
    public void xsetChildren(org.apache.xmlbeans.XmlUnsignedByte children)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CHILDREN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(CHILDREN$4);
            }
            target.set(children);
        }
    }
    
    /**
     * Unsets the "Children" element
     */
    public void unsetChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDREN$4, 0);
        }
    }
    
    /**
     * Gets the "LivingWith" element
     */
    public eu.aladdin_project.xsd.SystemParameter getLivingWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LIVINGWITH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LivingWith" element
     */
    public boolean isSetLivingWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIVINGWITH$6) != 0;
        }
    }
    
    /**
     * Sets the "LivingWith" element
     */
    public void setLivingWith(eu.aladdin_project.xsd.SystemParameter livingWith)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LIVINGWITH$6, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LIVINGWITH$6);
            }
            target.set(livingWith);
        }
    }
    
    /**
     * Appends and returns a new empty "LivingWith" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewLivingWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LIVINGWITH$6);
            return target;
        }
    }
    
    /**
     * Unsets the "LivingWith" element
     */
    public void unsetLivingWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIVINGWITH$6, 0);
        }
    }
    
    /**
     * Gets the "birthday" element
     */
    public java.util.Calendar getBirthday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHDAY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "birthday" element
     */
    public org.apache.xmlbeans.XmlDate xgetBirthday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(BIRTHDAY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "birthday" element
     */
    public void setBirthday(java.util.Calendar birthday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHDAY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIRTHDAY$8);
            }
            target.setCalendarValue(birthday);
        }
    }
    
    /**
     * Sets (as xml) the "birthday" element
     */
    public void xsetBirthday(org.apache.xmlbeans.XmlDate birthday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(BIRTHDAY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(BIRTHDAY$8);
            }
            target.set(birthday);
        }
    }
}
