/*
 * An XML document type.
 * Localname: ListOfQuestionnaires
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.ListOfQuestionnairesDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one ListOfQuestionnaires(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class ListOfQuestionnairesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfQuestionnairesDocument
{
    
    public ListOfQuestionnairesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFQUESTIONNAIRES$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "ListOfQuestionnaires");
    
    
    /**
     * Gets the "ListOfQuestionnaires" element
     */
    public eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires getListOfQuestionnaires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires target = null;
            target = (eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires)get_store().find_element_user(LISTOFQUESTIONNAIRES$0, 0);
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
    public void setListOfQuestionnaires(eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires listOfQuestionnaires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires target = null;
            target = (eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires)get_store().find_element_user(LISTOFQUESTIONNAIRES$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires)get_store().add_element_user(LISTOFQUESTIONNAIRES$0);
            }
            target.set(listOfQuestionnaires);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfQuestionnaires" element
     */
    public eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires addNewListOfQuestionnaires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires target = null;
            target = (eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires)get_store().add_element_user(LISTOFQUESTIONNAIRES$0);
            return target;
        }
    }
    /**
     * An XML ListOfQuestionnaires(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class ListOfQuestionnairesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfQuestionnairesDocument.ListOfQuestionnaires
    {
        
        public ListOfQuestionnairesImpl(org.apache.xmlbeans.SchemaType sType)
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
