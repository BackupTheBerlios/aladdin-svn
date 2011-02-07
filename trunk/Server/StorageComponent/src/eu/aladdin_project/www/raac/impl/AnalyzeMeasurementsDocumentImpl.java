/*
 * An XML document type.
 * Localname: AnalyzeMeasurements
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac.impl;
/**
 * A document containing one AnalyzeMeasurements(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public class AnalyzeMeasurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument
{
    
    public AnalyzeMeasurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANALYZEMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://www.aladdin-project.eu/raac/", "AnalyzeMeasurements");
    
    
    /**
     * Gets the "AnalyzeMeasurements" element
     */
    public eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements getAnalyzeMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements)get_store().find_element_user(ANALYZEMEASUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AnalyzeMeasurements" element
     */
    public void setAnalyzeMeasurements(eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements analyzeMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements)get_store().find_element_user(ANALYZEMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements)get_store().add_element_user(ANALYZEMEASUREMENTS$0);
            }
            target.set(analyzeMeasurements);
        }
    }
    
    /**
     * Appends and returns a new empty "AnalyzeMeasurements" element
     */
    public eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements addNewAnalyzeMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements)get_store().add_element_user(ANALYZEMEASUREMENTS$0);
            return target;
        }
    }
    /**
     * An XML AnalyzeMeasurements(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public static class AnalyzeMeasurementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements
    {
        
        public AnalyzeMeasurementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN$0 = 
            new javax.xml.namespace.QName("", "in");
        private static final javax.xml.namespace.QName PATIENTID$2 = 
            new javax.xml.namespace.QName("", "PatientID");
        
        
        /**
         * Gets the "in" element
         */
        public eu.aladdin_project.xsd.Measurement getIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(IN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "in" element
         */
        public void setIn(eu.aladdin_project.xsd.Measurement in)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(IN$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Measurement)get_store().add_element_user(IN$0);
                }
                target.set(in);
            }
        }
        
        /**
         * Appends and returns a new empty "in" element
         */
        public eu.aladdin_project.xsd.Measurement addNewIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().add_element_user(IN$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTID$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATIENTID$2);
                }
                target.set(patientID);
            }
        }
    }
}
