/*
 * An XML document type.
 * Localname: GetCarerResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetCarerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetCarerResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetCarerResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetCarerResponseDocument
{
    
    public GetCarerResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetCarerResponse");
    
    
    /**
     * Gets the "GetCarerResponse" element
     */
    public eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse getGetCarerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse target = null;
            target = (eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse)get_store().find_element_user(GETCARERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCarerResponse" element
     */
    public void setGetCarerResponse(eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse getCarerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse target = null;
            target = (eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse)get_store().find_element_user(GETCARERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse)get_store().add_element_user(GETCARERRESPONSE$0);
            }
            target.set(getCarerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCarerResponse" element
     */
    public eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse addNewGetCarerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse target = null;
            target = (eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse)get_store().add_element_user(GETCARERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCarerResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetCarerResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetCarerResponseDocument.GetCarerResponse
    {
        
        public GetCarerResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.Carer getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().find_element_user(OUT$0, 0);
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
        public void setOut(eu.aladdin_project.xsd.Carer out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Carer)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.Carer addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
