/*
 * An XML document type.
 * Localname: StoreQuestionnaireAnswersResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one StoreQuestionnaireAnswersResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class StoreQuestionnaireAnswersResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument
{
    
    public StoreQuestionnaireAnswersResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOREQUESTIONNAIREANSWERSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "StoreQuestionnaireAnswersResponse");
    
    
    /**
     * Gets the "StoreQuestionnaireAnswersResponse" element
     */
    public eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse getStoreQuestionnaireAnswersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse target = null;
            target = (eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse)get_store().find_element_user(STOREQUESTIONNAIREANSWERSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StoreQuestionnaireAnswersResponse" element
     */
    public void setStoreQuestionnaireAnswersResponse(eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse storeQuestionnaireAnswersResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse target = null;
            target = (eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse)get_store().find_element_user(STOREQUESTIONNAIREANSWERSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse)get_store().add_element_user(STOREQUESTIONNAIREANSWERSRESPONSE$0);
            }
            target.set(storeQuestionnaireAnswersResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "StoreQuestionnaireAnswersResponse" element
     */
    public eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse addNewStoreQuestionnaireAnswersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse target = null;
            target = (eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse)get_store().add_element_user(STOREQUESTIONNAIREANSWERSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML StoreQuestionnaireAnswersResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class StoreQuestionnaireAnswersResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse
    {
        
        public StoreQuestionnaireAnswersResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
