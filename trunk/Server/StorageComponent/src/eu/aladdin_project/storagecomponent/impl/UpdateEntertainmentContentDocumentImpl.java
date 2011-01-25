/*
 * An XML document type.
 * Localname: UpdateEntertainmentContent
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one UpdateEntertainmentContent(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class UpdateEntertainmentContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument
{
    
    public UpdateEntertainmentContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEENTERTAINMENTCONTENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "UpdateEntertainmentContent");
    
    
    /**
     * Gets the "UpdateEntertainmentContent" element
     */
    public eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent getUpdateEntertainmentContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent)get_store().find_element_user(UPDATEENTERTAINMENTCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateEntertainmentContent" element
     */
    public void setUpdateEntertainmentContent(eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent updateEntertainmentContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent)get_store().find_element_user(UPDATEENTERTAINMENTCONTENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent)get_store().add_element_user(UPDATEENTERTAINMENTCONTENT$0);
            }
            target.set(updateEntertainmentContent);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateEntertainmentContent" element
     */
    public eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent addNewUpdateEntertainmentContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent target = null;
            target = (eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent)get_store().add_element_user(UPDATEENTERTAINMENTCONTENT$0);
            return target;
        }
    }
    /**
     * An XML UpdateEntertainmentContent(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class UpdateEntertainmentContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.UpdateEntertainmentContentDocument.UpdateEntertainmentContent
    {
        
        public UpdateEntertainmentContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EC$0 = 
            new javax.xml.namespace.QName("", "ec");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "ec" element
         */
        public eu.aladdin_project.xsd.EntertainmentContent getEc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().find_element_user(EC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ec" element
         */
        public void setEc(eu.aladdin_project.xsd.EntertainmentContent ec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().find_element_user(EC$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().add_element_user(EC$0);
                }
                target.set(ec);
            }
        }
        
        /**
         * Appends and returns a new empty "ec" element
         */
        public eu.aladdin_project.xsd.EntertainmentContent addNewEc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().add_element_user(EC$0);
                return target;
            }
        }
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$2);
                }
                target.set(userId);
            }
        }
    }
}
