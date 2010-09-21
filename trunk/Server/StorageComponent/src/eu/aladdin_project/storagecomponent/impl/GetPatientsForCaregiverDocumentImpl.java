/*
 * An XML document type.
 * Localname: GetPatientsForCaregiver
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetPatientsForCaregiver(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetPatientsForCaregiverDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument
{
    
    public GetPatientsForCaregiverDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPATIENTSFORCAREGIVER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetPatientsForCaregiver");
    
    
    /**
     * Gets the "GetPatientsForCaregiver" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver getGetPatientsForCaregiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver)get_store().find_element_user(GETPATIENTSFORCAREGIVER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPatientsForCaregiver" element
     */
    public void setGetPatientsForCaregiver(eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver getPatientsForCaregiver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver)get_store().find_element_user(GETPATIENTSFORCAREGIVER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver)get_store().add_element_user(GETPATIENTSFORCAREGIVER$0);
            }
            target.set(getPatientsForCaregiver);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPatientsForCaregiver" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver addNewGetPatientsForCaregiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver)get_store().add_element_user(GETPATIENTSFORCAREGIVER$0);
            return target;
        }
    }
    /**
     * An XML GetPatientsForCaregiver(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetPatientsForCaregiverImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument.GetPatientsForCaregiver
    {
        
        public GetPatientsForCaregiverImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERID$0 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "userId" element
         */
        public org.apache.xmlbeans.XmlString xgetUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "userId" element
         */
        public void setUserId(java.lang.String userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
                }
                target.setStringValue(userId);
            }
        }
        
        /**
         * Sets (as xml) the "userId" element
         */
        public void xsetUserId(org.apache.xmlbeans.XmlString userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$0);
                }
                target.set(userId);
            }
        }
    }
}
