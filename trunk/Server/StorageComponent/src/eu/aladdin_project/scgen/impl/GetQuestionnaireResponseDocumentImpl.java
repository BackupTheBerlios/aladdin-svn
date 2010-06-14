/*
 * An XML document type.
 * Localname: GetQuestionnaireResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetQuestionnaireResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetQuestionnaireResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetQuestionnaireResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetQuestionnaireResponseDocument
{
    
    public GetQuestionnaireResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONNAIRERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetQuestionnaireResponse");
    
    
    /**
     * Gets the "GetQuestionnaireResponse" element
     */
    public eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse getGetQuestionnaireResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse)get_store().find_element_user(GETQUESTIONNAIRERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuestionnaireResponse" element
     */
    public void setGetQuestionnaireResponse(eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse getQuestionnaireResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse)get_store().find_element_user(GETQUESTIONNAIRERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse)get_store().add_element_user(GETQUESTIONNAIRERESPONSE$0);
            }
            target.set(getQuestionnaireResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuestionnaireResponse" element
     */
    public eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse addNewGetQuestionnaireResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse)get_store().add_element_user(GETQUESTIONNAIRERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetQuestionnaireResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetQuestionnaireResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetQuestionnaireResponseDocument.GetQuestionnaireResponse
    {
        
        public GetQuestionnaireResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.Questionnaire getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Questionnaire target = null;
                target = (eu.aladdin_project.xsd.Questionnaire)get_store().find_element_user(OUT$0, 0);
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
        public void setOut(eu.aladdin_project.xsd.Questionnaire out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Questionnaire target = null;
                target = (eu.aladdin_project.xsd.Questionnaire)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Questionnaire)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.Questionnaire addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Questionnaire target = null;
                target = (eu.aladdin_project.xsd.Questionnaire)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
