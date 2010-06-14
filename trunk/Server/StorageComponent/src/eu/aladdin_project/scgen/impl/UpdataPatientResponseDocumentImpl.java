/*
 * An XML document type.
 * Localname: UpdataPatientResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.UpdataPatientResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one UpdataPatientResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class UpdataPatientResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdataPatientResponseDocument
{
    
    public UpdataPatientResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATAPATIENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "UpdataPatientResponse");
    
    
    /**
     * Gets the "UpdataPatientResponse" element
     */
    public eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse getUpdataPatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse target = null;
            target = (eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse)get_store().find_element_user(UPDATAPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdataPatientResponse" element
     */
    public void setUpdataPatientResponse(eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse updataPatientResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse target = null;
            target = (eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse)get_store().find_element_user(UPDATAPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse)get_store().add_element_user(UPDATAPATIENTRESPONSE$0);
            }
            target.set(updataPatientResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdataPatientResponse" element
     */
    public eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse addNewUpdataPatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse target = null;
            target = (eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse)get_store().add_element_user(UPDATAPATIENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdataPatientResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class UpdataPatientResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdataPatientResponseDocument.UpdataPatientResponse
    {
        
        public UpdataPatientResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
