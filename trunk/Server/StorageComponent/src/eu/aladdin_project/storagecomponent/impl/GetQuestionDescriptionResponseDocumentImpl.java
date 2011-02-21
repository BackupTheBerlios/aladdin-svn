/*
 * An XML document type.
 * Localname: GetQuestionDescriptionResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetQuestionDescriptionResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetQuestionDescriptionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument
{
    
    public GetQuestionDescriptionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONDESCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetQuestionDescriptionResponse");
    
    
    /**
     * Gets the "GetQuestionDescriptionResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse getGetQuestionDescriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse)get_store().find_element_user(GETQUESTIONDESCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuestionDescriptionResponse" element
     */
    public void setGetQuestionDescriptionResponse(eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse getQuestionDescriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse)get_store().find_element_user(GETQUESTIONDESCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse)get_store().add_element_user(GETQUESTIONDESCRIPTIONRESPONSE$0);
            }
            target.set(getQuestionDescriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuestionDescriptionResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse addNewGetQuestionDescriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse)get_store().add_element_user(GETQUESTIONDESCRIPTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetQuestionDescriptionResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetQuestionDescriptionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse
    {
        
        public GetQuestionDescriptionResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
