/*
 * An XML document type.
 * Localname: DeleteQuestionnaireResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one DeleteQuestionnaireResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class DeleteQuestionnaireResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument
{
    
    public DeleteQuestionnaireResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEQUESTIONNAIRERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "DeleteQuestionnaireResponse");
    
    
    /**
     * Gets the "DeleteQuestionnaireResponse" element
     */
    public eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse getDeleteQuestionnaireResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse)get_store().find_element_user(DELETEQUESTIONNAIRERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteQuestionnaireResponse" element
     */
    public void setDeleteQuestionnaireResponse(eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse deleteQuestionnaireResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse)get_store().find_element_user(DELETEQUESTIONNAIRERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse)get_store().add_element_user(DELETEQUESTIONNAIRERESPONSE$0);
            }
            target.set(deleteQuestionnaireResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteQuestionnaireResponse" element
     */
    public eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse addNewDeleteQuestionnaireResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse)get_store().add_element_user(DELETEQUESTIONNAIRERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteQuestionnaireResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class DeleteQuestionnaireResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse
    {
        
        public DeleteQuestionnaireResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
