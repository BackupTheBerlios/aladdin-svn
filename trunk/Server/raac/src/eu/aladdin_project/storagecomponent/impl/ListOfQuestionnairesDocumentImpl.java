/*
 * An XML document type.
 * Localname: ListOfQuestionnaires
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one ListOfQuestionnaires(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class ListOfQuestionnairesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument
{
    
    public ListOfQuestionnairesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFQUESTIONNAIRES$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "ListOfQuestionnaires");
    
    
    /**
     * Gets the "ListOfQuestionnaires" element
     */
    public eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires getListOfQuestionnaires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires)get_store().find_element_user(LISTOFQUESTIONNAIRES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfQuestionnaires" element
     */
    public void setListOfQuestionnaires(eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires listOfQuestionnaires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires)get_store().find_element_user(LISTOFQUESTIONNAIRES$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires)get_store().add_element_user(LISTOFQUESTIONNAIRES$0);
            }
            target.set(listOfQuestionnaires);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfQuestionnaires" element
     */
    public eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires addNewListOfQuestionnaires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires)get_store().add_element_user(LISTOFQUESTIONNAIRES$0);
            return target;
        }
    }
    /**
     * An XML ListOfQuestionnaires(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class ListOfQuestionnairesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument.ListOfQuestionnaires
    {
        
        public ListOfQuestionnairesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALE$0 = 
            new javax.xml.namespace.QName("", "locale");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter getLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "locale" element
         */
        public void setLocale(eu.aladdin_project.xsd.SystemParameter locale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$0);
                }
                target.set(locale);
            }
        }
        
        /**
         * Appends and returns a new empty "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter addNewLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$0);
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
