/*
 * An XML document type.
 * Localname: AnalyzeMeasurementsResponse
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac.impl;
/**
 * A document containing one AnalyzeMeasurementsResponse(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public class AnalyzeMeasurementsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument
{
    
    public AnalyzeMeasurementsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANALYZEMEASUREMENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.aladdin-project.eu/raac/", "AnalyzeMeasurementsResponse");
    
    
    /**
     * Gets the "AnalyzeMeasurementsResponse" element
     */
    public eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse getAnalyzeMeasurementsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse)get_store().find_element_user(ANALYZEMEASUREMENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AnalyzeMeasurementsResponse" element
     */
    public void setAnalyzeMeasurementsResponse(eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse analyzeMeasurementsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse)get_store().find_element_user(ANALYZEMEASUREMENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse)get_store().add_element_user(ANALYZEMEASUREMENTSRESPONSE$0);
            }
            target.set(analyzeMeasurementsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AnalyzeMeasurementsResponse" element
     */
    public eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse addNewAnalyzeMeasurementsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse)get_store().add_element_user(ANALYZEMEASUREMENTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AnalyzeMeasurementsResponse(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public static class AnalyzeMeasurementsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse
    {
        
        public AnalyzeMeasurementsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.Warning getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().find_element_user(OUT$0, 0);
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
        public void setOut(eu.aladdin_project.xsd.Warning out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Warning)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.Warning addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
