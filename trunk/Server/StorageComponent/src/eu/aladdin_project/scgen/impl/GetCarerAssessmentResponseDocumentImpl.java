/*
 * An XML document type.
 * Localname: GetCarerAssessmentResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetCarerAssessmentResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetCarerAssessmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument
{
    
    public GetCarerAssessmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARERASSESSMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetCarerAssessmentResponse");
    
    
    /**
     * Gets the "GetCarerAssessmentResponse" element
     */
    public eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse getGetCarerAssessmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse)get_store().find_element_user(GETCARERASSESSMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCarerAssessmentResponse" element
     */
    public void setGetCarerAssessmentResponse(eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse getCarerAssessmentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse)get_store().find_element_user(GETCARERASSESSMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse)get_store().add_element_user(GETCARERASSESSMENTRESPONSE$0);
            }
            target.set(getCarerAssessmentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCarerAssessmentResponse" element
     */
    public eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse addNewGetCarerAssessmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse)get_store().add_element_user(GETCARERASSESSMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCarerAssessmentResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetCarerAssessmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse
    {
        
        public GetCarerAssessmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.CarerAssessment getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().find_element_user(OUT$0, 0);
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
        public void setOut(eu.aladdin_project.xsd.CarerAssessment out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.CarerAssessment)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.CarerAssessment addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
