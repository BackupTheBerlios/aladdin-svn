/*
 * An XML document type.
 * Localname: SaveWarningResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.SaveWarningResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one SaveWarningResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class SaveWarningResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.SaveWarningResponseDocument
{
    
    public SaveWarningResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAVEWARNINGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "SaveWarningResponse");
    
    
    /**
     * Gets the "SaveWarningResponse" element
     */
    public eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse getSaveWarningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse target = null;
            target = (eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse)get_store().find_element_user(SAVEWARNINGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SaveWarningResponse" element
     */
    public void setSaveWarningResponse(eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse saveWarningResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse target = null;
            target = (eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse)get_store().find_element_user(SAVEWARNINGRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse)get_store().add_element_user(SAVEWARNINGRESPONSE$0);
            }
            target.set(saveWarningResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SaveWarningResponse" element
     */
    public eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse addNewSaveWarningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse target = null;
            target = (eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse)get_store().add_element_user(SAVEWARNINGRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SaveWarningResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class SaveWarningResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse
    {
        
        public SaveWarningResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
