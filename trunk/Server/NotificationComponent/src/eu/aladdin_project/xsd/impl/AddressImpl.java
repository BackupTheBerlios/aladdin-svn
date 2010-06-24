/*
 * XML Type:  Address
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Address
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML Address(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.Address
{
    
    public AddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREET$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Street");
    private static final javax.xml.namespace.QName STREETNO$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "StreetNo");
    private static final javax.xml.namespace.QName CITY$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "City");
    private static final javax.xml.namespace.QName COUNTY$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "County");
    private static final javax.xml.namespace.QName COUNTRY$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Country");
    private static final javax.xml.namespace.QName ZIPCODE$10 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ZipCode");
    private static final javax.xml.namespace.QName NOTES$12 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Notes");
    private static final javax.xml.namespace.QName ISPRIMARY$14 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "IsPrimary");
    
    
    /**
     * Gets the "Street" element
     */
    public java.lang.String getStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Street" element
     */
    public org.apache.xmlbeans.XmlString xgetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREET$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Street" element
     */
    public void setStreet(java.lang.String street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREET$0);
            }
            target.setStringValue(street);
        }
    }
    
    /**
     * Sets (as xml) the "Street" element
     */
    public void xsetStreet(org.apache.xmlbeans.XmlString street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREET$0);
            }
            target.set(street);
        }
    }
    
    /**
     * Gets the "StreetNo" element
     */
    public java.lang.String getStreetNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StreetNo" element
     */
    public org.apache.xmlbeans.XmlString xgetStreetNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETNO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "StreetNo" element
     */
    public boolean isSetStreetNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNO$2) != 0;
        }
    }
    
    /**
     * Sets the "StreetNo" element
     */
    public void setStreetNo(java.lang.String streetNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETNO$2);
            }
            target.setStringValue(streetNo);
        }
    }
    
    /**
     * Sets (as xml) the "StreetNo" element
     */
    public void xsetStreetNo(org.apache.xmlbeans.XmlString streetNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETNO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETNO$2);
            }
            target.set(streetNo);
        }
    }
    
    /**
     * Unsets the "StreetNo" element
     */
    public void unsetStreetNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNO$2, 0);
        }
    }
    
    /**
     * Gets the "City" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "City" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "City" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$4);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "City" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$4);
            }
            target.set(city);
        }
    }
    
    /**
     * Gets the "County" element
     */
    public java.lang.String getCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "County" element
     */
    public org.apache.xmlbeans.XmlString xgetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "County" element
     */
    public boolean isSetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTY$6) != 0;
        }
    }
    
    /**
     * Sets the "County" element
     */
    public void setCounty(java.lang.String county)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTY$6);
            }
            target.setStringValue(county);
        }
    }
    
    /**
     * Sets (as xml) the "County" element
     */
    public void xsetCounty(org.apache.xmlbeans.XmlString county)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTY$6);
            }
            target.set(county);
        }
    }
    
    /**
     * Unsets the "County" element
     */
    public void unsetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTY$6, 0);
        }
    }
    
    /**
     * Gets the "Country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$8);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$8);
            }
            target.set(country);
        }
    }
    
    /**
     * Gets the "ZipCode" element
     */
    public java.lang.String getZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ZipCode" element
     */
    public org.apache.xmlbeans.XmlString xgetZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ZipCode" element
     */
    public boolean isSetZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZIPCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "ZipCode" element
     */
    public void setZipCode(java.lang.String zipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$10);
            }
            target.setStringValue(zipCode);
        }
    }
    
    /**
     * Sets (as xml) the "ZipCode" element
     */
    public void xsetZipCode(org.apache.xmlbeans.XmlString zipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$10);
            }
            target.set(zipCode);
        }
    }
    
    /**
     * Unsets the "ZipCode" element
     */
    public void unsetZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZIPCODE$10, 0);
        }
    }
    
    /**
     * Gets the "Notes" element
     */
    public java.lang.String getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Notes" element
     */
    public org.apache.xmlbeans.XmlString xgetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Notes" element
     */
    public boolean isSetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$12) != 0;
        }
    }
    
    /**
     * Sets the "Notes" element
     */
    public void setNotes(java.lang.String notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTES$12);
            }
            target.setStringValue(notes);
        }
    }
    
    /**
     * Sets (as xml) the "Notes" element
     */
    public void xsetNotes(org.apache.xmlbeans.XmlString notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTES$12);
            }
            target.set(notes);
        }
    }
    
    /**
     * Unsets the "Notes" element
     */
    public void unsetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARY$14, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARY$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRIMARY$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARY$14);
            }
            target.set(isPrimary);
        }
    }
}
