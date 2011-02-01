/*
 * An XML document type.
 * Localname: GetPatientMeasurement
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetPatientMeasurement(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetPatientMeasurementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument
{
    
    public GetPatientMeasurementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPATIENTMEASUREMENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetPatientMeasurement");
    
    
    /**
     * Gets the "GetPatientMeasurement" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement getGetPatientMeasurement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement)get_store().find_element_user(GETPATIENTMEASUREMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPatientMeasurement" element
     */
    public void setGetPatientMeasurement(eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement getPatientMeasurement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement)get_store().find_element_user(GETPATIENTMEASUREMENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement)get_store().add_element_user(GETPATIENTMEASUREMENT$0);
            }
            target.set(getPatientMeasurement);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPatientMeasurement" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement addNewGetPatientMeasurement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement)get_store().add_element_user(GETPATIENTMEASUREMENT$0);
            return target;
        }
    }
    /**
     * An XML GetPatientMeasurement(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetPatientMeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement
    {
        
        public GetPatientMeasurementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PATIENTID$0 = 
            new javax.xml.namespace.QName("", "PatientId");
        private static final javax.xml.namespace.QName MEASUREMENTTYPE$2 = 
            new javax.xml.namespace.QName("", "MeasurementType");
        private static final javax.xml.namespace.QName FROMDATA$4 = 
            new javax.xml.namespace.QName("", "fromData");
        private static final javax.xml.namespace.QName TODATA$6 = 
            new javax.xml.namespace.QName("", "toData");
        private static final javax.xml.namespace.QName USERID$8 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "PatientId" element
         */
        public java.lang.String getPatientId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PatientId" element
         */
        public org.apache.xmlbeans.XmlString xgetPatientId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PatientId" element
         */
        public void setPatientId(java.lang.String patientId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTID$0);
                }
                target.setStringValue(patientId);
            }
        }
        
        /**
         * Sets (as xml) the "PatientId" element
         */
        public void xsetPatientId(org.apache.xmlbeans.XmlString patientId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATIENTID$0);
                }
                target.set(patientId);
            }
        }
        
        /**
         * Gets the "MeasurementType" element
         */
        public int getMeasurementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASUREMENTTYPE$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "MeasurementType" element
         */
        public org.apache.xmlbeans.XmlInt xgetMeasurementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MEASUREMENTTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MeasurementType" element
         */
        public void setMeasurementType(int measurementType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASUREMENTTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEASUREMENTTYPE$2);
                }
                target.setIntValue(measurementType);
            }
        }
        
        /**
         * Sets (as xml) the "MeasurementType" element
         */
        public void xsetMeasurementType(org.apache.xmlbeans.XmlInt measurementType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MEASUREMENTTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MEASUREMENTTYPE$2);
                }
                target.set(measurementType);
            }
        }
        
        /**
         * Gets the "fromData" element
         */
        public java.util.Calendar getFromData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "fromData" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetFromData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FROMDATA$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fromData" element
         */
        public void setFromData(java.util.Calendar fromData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMDATA$4);
                }
                target.setCalendarValue(fromData);
            }
        }
        
        /**
         * Sets (as xml) the "fromData" element
         */
        public void xsetFromData(org.apache.xmlbeans.XmlDateTime fromData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FROMDATA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FROMDATA$4);
                }
                target.set(fromData);
            }
        }
        
        /**
         * Gets the "toData" element
         */
        public java.util.Calendar getToData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATA$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "toData" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetToData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TODATA$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "toData" element
         */
        public void setToData(java.util.Calendar toData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATA$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODATA$6);
                }
                target.setCalendarValue(toData);
            }
        }
        
        /**
         * Sets (as xml) the "toData" element
         */
        public void xsetToData(org.apache.xmlbeans.XmlDateTime toData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TODATA$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TODATA$6);
                }
                target.set(toData);
            }
        }
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "userId" element
         */
        public org.apache.xmlbeans.XmlString xgetUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "userId" element
         */
        public void setUserId(java.lang.String userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$8);
                }
                target.setStringValue(userId);
            }
        }
        
        /**
         * Sets (as xml) the "userId" element
         */
        public void xsetUserId(org.apache.xmlbeans.XmlString userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$8);
                }
                target.set(userId);
            }
        }
    }
}
