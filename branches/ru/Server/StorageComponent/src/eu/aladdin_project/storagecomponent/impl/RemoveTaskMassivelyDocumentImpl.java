/*
 * An XML document type.
 * Localname: RemoveTaskMassively
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one RemoveTaskMassively(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class RemoveTaskMassivelyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument
{
    
    public RemoveTaskMassivelyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVETASKMASSIVELY$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "RemoveTaskMassively");
    
    
    /**
     * Gets the "RemoveTaskMassively" element
     */
    public eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively getRemoveTaskMassively()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively target = null;
            target = (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively)get_store().find_element_user(REMOVETASKMASSIVELY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RemoveTaskMassively" element
     */
    public void setRemoveTaskMassively(eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively removeTaskMassively)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively target = null;
            target = (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively)get_store().find_element_user(REMOVETASKMASSIVELY$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively)get_store().add_element_user(REMOVETASKMASSIVELY$0);
            }
            target.set(removeTaskMassively);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoveTaskMassively" element
     */
    public eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively addNewRemoveTaskMassively()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively target = null;
            target = (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively)get_store().add_element_user(REMOVETASKMASSIVELY$0);
            return target;
        }
    }
    /**
     * An XML RemoveTaskMassively(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class RemoveTaskMassivelyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively
    {
        
        public RemoveTaskMassivelyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PATIENTID$0 = 
            new javax.xml.namespace.QName("", "patientId");
        private static final javax.xml.namespace.QName TYPEOFTASK$2 = 
            new javax.xml.namespace.QName("", "typeOfTask");
        private static final javax.xml.namespace.QName STARTDATE$4 = 
            new javax.xml.namespace.QName("", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$6 = 
            new javax.xml.namespace.QName("", "endDate");
        private static final javax.xml.namespace.QName USERID$8 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "patientId" element
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
         * Gets (as xml) the "patientId" element
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
         * Sets the "patientId" element
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
         * Sets (as xml) the "patientId" element
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
         * Gets the "typeOfTask" element
         */
        public java.math.BigInteger getTypeOfTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFTASK$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "typeOfTask" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTypeOfTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TYPEOFTASK$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "typeOfTask" element
         */
        public void setTypeOfTask(java.math.BigInteger typeOfTask)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFTASK$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEOFTASK$2);
                }
                target.setBigIntegerValue(typeOfTask);
            }
        }
        
        /**
         * Sets (as xml) the "typeOfTask" element
         */
        public void xsetTypeOfTask(org.apache.xmlbeans.XmlInteger typeOfTask)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TYPEOFTASK$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TYPEOFTASK$2);
                }
                target.set(typeOfTask);
            }
        }
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$4);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$4);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$6);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$6);
                }
                target.set(endDate);
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
