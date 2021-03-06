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
    
    private static final javax.xml.namespace.QName AGE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Age");
    private static final javax.xml.namespace.QName GENDER$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Gender");
    private static final javax.xml.namespace.QName MARITALSTATUS$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "MaritalStatus");
    private static final javax.xml.namespace.QName CHILDREN$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Children");
    private static final javax.xml.namespace.QName LIVINGWITH$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "LivingWith");
    
    
    /**
     * Gets the "Age" element
     */
    public short getAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "Age" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(AGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Age" element
     */
    public void setAge(short age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGE$0);
            }
            target.setShortValue(age);
        }
    }
    
    /**
     * Sets (as xml) the "Age" element
     */
    public void xsetAge(org.apache.xmlbeans.XmlUnsignedByte age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(AGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(AGE$0);
            }
            target.set(age);
        }
    }
    
    /**
     * Gets the "Gender" element
     */
    public eu.aladdin_project.xsd.SystemParameter getGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(GENDER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(GENDER$2, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(GENDER$2);
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
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(GENDER$2);
            return target;
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
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(MARITALSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(MARITALSTATUS$4, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(MARITALSTATUS$4);
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
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(MARITALSTATUS$4);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDREN$6, 0);
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
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CHILDREN$6, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDREN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILDREN$6);
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
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CHILDREN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(CHILDREN$6);
            }
            target.set(children);
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
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LIVINGWITH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LIVINGWITH$8, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LIVINGWITH$8);
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
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LIVINGWITH$8);
            return target;
        }
    }
}
