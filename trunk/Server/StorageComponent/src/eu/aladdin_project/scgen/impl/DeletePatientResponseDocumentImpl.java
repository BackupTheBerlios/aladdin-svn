/*
 * An XML document type.
 * Localname: DeletePatientResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.DeletePatientResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one DeletePatientResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class DeletePatientResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeletePatientResponseDocument
{
    
    public DeletePatientResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEPATIENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "DeletePatientResponse");
    
    
    /**
     * Gets the "DeletePatientResponse" element
     */
    public eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse getDeletePatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse target = null;
            target = (eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse)get_store().find_element_user(DELETEPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeletePatientResponse" element
     */
    public void setDeletePatientResponse(eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse deletePatientResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse target = null;
            target = (eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse)get_store().find_element_user(DELETEPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse)get_store().add_element_user(DELETEPATIENTRESPONSE$0);
            }
            target.set(deletePatientResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeletePatientResponse" element
     */
    public eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse addNewDeletePatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse target = null;
            target = (eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse)get_store().add_element_user(DELETEPATIENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeletePatientResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class DeletePatientResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeletePatientResponseDocument.DeletePatientResponse
    {
        
        public DeletePatientResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
