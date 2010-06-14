/*
 * An XML document type.
 * Localname: CreateQuestionnaireResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one CreateQuestionnaireResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class CreateQuestionnaireResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument
{
    
    public CreateQuestionnaireResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEQUESTIONNAIRERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "CreateQuestionnaireResponse");
    
    
    /**
     * Gets the "CreateQuestionnaireResponse" element
     */
    public eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse getCreateQuestionnaireResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse)get_store().find_element_user(CREATEQUESTIONNAIRERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateQuestionnaireResponse" element
     */
    public void setCreateQuestionnaireResponse(eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse createQuestionnaireResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse)get_store().find_element_user(CREATEQUESTIONNAIRERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse)get_store().add_element_user(CREATEQUESTIONNAIRERESPONSE$0);
            }
            target.set(createQuestionnaireResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateQuestionnaireResponse" element
     */
    public eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse addNewCreateQuestionnaireResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse)get_store().add_element_user(CREATEQUESTIONNAIRERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateQuestionnaireResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class CreateQuestionnaireResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse
    {
        
        public CreateQuestionnaireResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
