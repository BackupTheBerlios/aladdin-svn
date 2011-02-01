/*
 * An XML document type.
 * Localname: AnalyzeMeaseurementsResponse
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac.impl;
/**
 * A document containing one AnalyzeMeaseurementsResponse(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public class AnalyzeMeaseurementsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument
{
    
    public AnalyzeMeaseurementsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANALYZEMEASEUREMENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.aladdin-project.eu/raac/", "AnalyzeMeaseurementsResponse");
    
    
    /**
     * Gets the "AnalyzeMeaseurementsResponse" element
     */
    public eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse getAnalyzeMeaseurementsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse)get_store().find_element_user(ANALYZEMEASEUREMENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AnalyzeMeaseurementsResponse" element
     */
    public void setAnalyzeMeaseurementsResponse(eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse analyzeMeaseurementsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse)get_store().find_element_user(ANALYZEMEASEUREMENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse)get_store().add_element_user(ANALYZEMEASEUREMENTSRESPONSE$0);
            }
            target.set(analyzeMeaseurementsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AnalyzeMeaseurementsResponse" element
     */
    public eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse addNewAnalyzeMeaseurementsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse)get_store().add_element_user(ANALYZEMEASEUREMENTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AnalyzeMeaseurementsResponse(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public static class AnalyzeMeaseurementsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeMeaseurementsResponseDocument.AnalyzeMeaseurementsResponse
    {
        
        public AnalyzeMeaseurementsResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
