/*
 * An XML document type.
 * Localname: AnalyzeQuestionnairesResponse
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac.impl;
/**
 * A document containing one AnalyzeQuestionnairesResponse(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public class AnalyzeQuestionnairesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument
{
    
    public AnalyzeQuestionnairesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANALYZEQUESTIONNAIRESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.aladdin-project.eu/raac/", "AnalyzeQuestionnairesResponse");
    
    
    /**
     * Gets the "AnalyzeQuestionnairesResponse" element
     */
    public eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse getAnalyzeQuestionnairesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse)get_store().find_element_user(ANALYZEQUESTIONNAIRESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AnalyzeQuestionnairesResponse" element
     */
    public void setAnalyzeQuestionnairesResponse(eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse analyzeQuestionnairesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse)get_store().find_element_user(ANALYZEQUESTIONNAIRESRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse)get_store().add_element_user(ANALYZEQUESTIONNAIRESRESPONSE$0);
            }
            target.set(analyzeQuestionnairesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AnalyzeQuestionnairesResponse" element
     */
    public eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse addNewAnalyzeQuestionnairesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse)get_store().add_element_user(ANALYZEQUESTIONNAIRESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AnalyzeQuestionnairesResponse(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public static class AnalyzeQuestionnairesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse
    {
        
        public AnalyzeQuestionnairesResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
