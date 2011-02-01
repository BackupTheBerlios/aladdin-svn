/*
 * An XML document type.
 * Localname: AssignTasksMassivelyResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one AssignTasksMassivelyResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class AssignTasksMassivelyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument
{
    
    public AssignTasksMassivelyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSIGNTASKSMASSIVELYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "AssignTasksMassivelyResponse");
    
    
    /**
     * Gets the "AssignTasksMassivelyResponse" element
     */
    public eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse getAssignTasksMassivelyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse)get_store().find_element_user(ASSIGNTASKSMASSIVELYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AssignTasksMassivelyResponse" element
     */
    public void setAssignTasksMassivelyResponse(eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse assignTasksMassivelyResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse)get_store().find_element_user(ASSIGNTASKSMASSIVELYRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse)get_store().add_element_user(ASSIGNTASKSMASSIVELYRESPONSE$0);
            }
            target.set(assignTasksMassivelyResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AssignTasksMassivelyResponse" element
     */
    public eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse addNewAssignTasksMassivelyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse target = null;
            target = (eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse)get_store().add_element_user(ASSIGNTASKSMASSIVELYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AssignTasksMassivelyResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class AssignTasksMassivelyResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse
    {
        
        public AssignTasksMassivelyResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
