/*
 * An XML document type.
 * Localname: AddEntertainmentContent
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one AddEntertainmentContent(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class AddEntertainmentContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument
{
    
    public AddEntertainmentContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDENTERTAINMENTCONTENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "AddEntertainmentContent");
    
    
    /**
     * Gets the "AddEntertainmentContent" element
     */
    public eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent getAddEntertainmentContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent target = null;
            target = (eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent)get_store().find_element_user(ADDENTERTAINMENTCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddEntertainmentContent" element
     */
    public void setAddEntertainmentContent(eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent addEntertainmentContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent target = null;
            target = (eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent)get_store().find_element_user(ADDENTERTAINMENTCONTENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent)get_store().add_element_user(ADDENTERTAINMENTCONTENT$0);
            }
            target.set(addEntertainmentContent);
        }
    }
    
    /**
     * Appends and returns a new empty "AddEntertainmentContent" element
     */
    public eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent addNewAddEntertainmentContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent target = null;
            target = (eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent)get_store().add_element_user(ADDENTERTAINMENTCONTENT$0);
            return target;
        }
    }
    /**
     * An XML AddEntertainmentContent(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class AddEntertainmentContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.AddEntertainmentContentDocument.AddEntertainmentContent
    {
        
        public AddEntertainmentContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN$0 = 
            new javax.xml.namespace.QName("", "in");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "in" element
         */
        public eu.aladdin_project.xsd.EntertainmentContent getIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().find_element_user(IN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "in" element
         */
        public void setIn(eu.aladdin_project.xsd.EntertainmentContent in)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().find_element_user(IN$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().add_element_user(IN$0);
                }
                target.set(in);
            }
        }
        
        /**
         * Appends and returns a new empty "in" element
         */
        public eu.aladdin_project.xsd.EntertainmentContent addNewIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().add_element_user(IN$0);
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
