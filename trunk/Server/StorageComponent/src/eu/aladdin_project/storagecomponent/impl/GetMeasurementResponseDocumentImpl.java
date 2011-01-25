/*
 * An XML document type.
 * Localname: GetMeasurementResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetMeasurementResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetMeasurementResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument
{
    
    public GetMeasurementResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMEASUREMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetMeasurementResponse");
    
    
    /**
     * Gets the "GetMeasurementResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse getGetMeasurementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse)get_store().find_element_user(GETMEASUREMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMeasurementResponse" element
     */
    public void setGetMeasurementResponse(eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse getMeasurementResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse)get_store().find_element_user(GETMEASUREMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse)get_store().add_element_user(GETMEASUREMENTRESPONSE$0);
            }
            target.set(getMeasurementResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMeasurementResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse addNewGetMeasurementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse)get_store().add_element_user(GETMEASUREMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetMeasurementResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetMeasurementResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse
    {
        
        public GetMeasurementResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.Measurement[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.Measurement[] result = new eu.aladdin_project.xsd.Measurement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.Measurement getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(OUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "out" element
         */
        public int sizeOfOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUT$0);
            }
        }
        
        /**
         * Sets array of all "out" element
         */
        public void setOutArray(eu.aladdin_project.xsd.Measurement[] outArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(outArray, OUT$0);
            }
        }
        
        /**
         * Sets ith "out" element
         */
        public void setOutArray(int i, eu.aladdin_project.xsd.Measurement out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(OUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(out);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "out" element
         */
        public eu.aladdin_project.xsd.Measurement insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.Measurement addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().add_element_user(OUT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "out" element
         */
        public void removeOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUT$0, i);
            }
        }
    }
}
