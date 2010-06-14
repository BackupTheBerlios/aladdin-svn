/*
 * An XML document type.
 * Localname: SavePatientAssessmentResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one SavePatientAssessmentResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class SavePatientAssessmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument
{
    
    public SavePatientAssessmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAVEPATIENTASSESSMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "SavePatientAssessmentResponse");
    
    
    /**
     * Gets the "SavePatientAssessmentResponse" element
     */
    public eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse getSavePatientAssessmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse)get_store().find_element_user(SAVEPATIENTASSESSMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SavePatientAssessmentResponse" element
     */
    public void setSavePatientAssessmentResponse(eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse savePatientAssessmentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse)get_store().find_element_user(SAVEPATIENTASSESSMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse)get_store().add_element_user(SAVEPATIENTASSESSMENTRESPONSE$0);
            }
            target.set(savePatientAssessmentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SavePatientAssessmentResponse" element
     */
    public eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse addNewSavePatientAssessmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse target = null;
            target = (eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse)get_store().add_element_user(SAVEPATIENTASSESSMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SavePatientAssessmentResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class SavePatientAssessmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse
    {
        
        public SavePatientAssessmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
