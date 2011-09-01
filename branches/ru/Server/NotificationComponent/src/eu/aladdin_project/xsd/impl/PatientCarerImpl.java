/*
 * XML Type:  PatientCarer
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.PatientCarer
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML PatientCarer(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class PatientCarerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.PatientCarer
{
    
    public PatientCarerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Carer");
    private static final javax.xml.namespace.QName ISPRIMARY$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IsPrimary");
    
    
    /**
     * Gets the "Carer" element
     */
    public eu.aladdin_project.xsd.Carer getCarer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Carer target = null;
            target = (eu.aladdin_project.xsd.Carer)get_store().find_element_user(CARER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Carer" element
     */
    public void setCarer(eu.aladdin_project.xsd.Carer carer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Carer target = null;
            target = (eu.aladdin_project.xsd.Carer)get_store().find_element_user(CARER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.Carer)get_store().add_element_user(CARER$0);
            }
            target.set(carer);
        }
    }
    
    /**
     * Appends and returns a new empty "Carer" element
     */
    public eu.aladdin_project.xsd.Carer addNewCarer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Carer target = null;
            target = (eu.aladdin_project.xsd.Carer)get_store().add_element_user(CARER$0);
            return target;
        }
    }
    
    /**
     * Gets the "IsPrimary" element
     */
    public boolean getIsPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARY$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPrimary" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsPrimary" element
     */
    public void setIsPrimary(boolean isPrimary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRIMARY$2);
            }
            target.setBooleanValue(isPrimary);
        }
    }
    
    /**
     * Sets (as xml) the "IsPrimary" element
     */
    public void xsetIsPrimary(org.apache.xmlbeans.XmlBoolean isPrimary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARY$2);
            }
            target.set(isPrimary);
        }
    }
}
