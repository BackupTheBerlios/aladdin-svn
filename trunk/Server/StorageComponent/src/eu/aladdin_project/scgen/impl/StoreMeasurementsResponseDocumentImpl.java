/*
 * An XML document type.
 * Localname: StoreMeasurementsResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.StoreMeasurementsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one StoreMeasurementsResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class StoreMeasurementsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.StoreMeasurementsResponseDocument
{
    
    public StoreMeasurementsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOREMEASUREMENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "StoreMeasurementsResponse");
    
    
    /**
     * Gets the "StoreMeasurementsResponse" element
     */
    public eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse getStoreMeasurementsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse target = null;
            target = (eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse)get_store().find_element_user(STOREMEASUREMENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StoreMeasurementsResponse" element
     */
    public void setStoreMeasurementsResponse(eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse storeMeasurementsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse target = null;
            target = (eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse)get_store().find_element_user(STOREMEASUREMENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse)get_store().add_element_user(STOREMEASUREMENTSRESPONSE$0);
            }
            target.set(storeMeasurementsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "StoreMeasurementsResponse" element
     */
    public eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse addNewStoreMeasurementsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse target = null;
            target = (eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse)get_store().add_element_user(STOREMEASUREMENTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML StoreMeasurementsResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class StoreMeasurementsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.StoreMeasurementsResponseDocument.StoreMeasurementsResponse
    {
        
        public StoreMeasurementsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.OperationResult getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "out" element
         */
        public void setOut(eu.aladdin_project.xsd.OperationResult out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.OperationResult)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.OperationResult addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
