/*
 * An XML document type.
 * Localname: UpdateQuestionnaireResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one UpdateQuestionnaireResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class UpdateQuestionnaireResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument
{
    
    public UpdateQuestionnaireResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEQUESTIONNAIRERESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "UpdateQuestionnaireResponse");
    
    
    /**
     * Gets the "UpdateQuestionnaireResponse" element
     */
    public eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse getUpdateQuestionnaireResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse)get_store().find_element_user(UPDATEQUESTIONNAIRERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateQuestionnaireResponse" element
     */
    public void setUpdateQuestionnaireResponse(eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse updateQuestionnaireResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse)get_store().find_element_user(UPDATEQUESTIONNAIRERESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse)get_store().add_element_user(UPDATEQUESTIONNAIRERESPONSE$0);
            }
            target.set(updateQuestionnaireResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateQuestionnaireResponse" element
     */
    public eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse addNewUpdateQuestionnaireResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse)get_store().add_element_user(UPDATEQUESTIONNAIRERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateQuestionnaireResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class UpdateQuestionnaireResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse
    {
        
        public UpdateQuestionnaireResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
