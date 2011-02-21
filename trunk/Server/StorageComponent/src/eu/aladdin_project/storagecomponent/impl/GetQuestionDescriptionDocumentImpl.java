/*
 * An XML document type.
 * Localname: GetQuestionDescription
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetQuestionDescription(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetQuestionDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument
{
    
    public GetQuestionDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetQuestionDescription");
    
    
    /**
     * Gets the "GetQuestionDescription" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription getGetQuestionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription)get_store().find_element_user(GETQUESTIONDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuestionDescription" element
     */
    public void setGetQuestionDescription(eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription getQuestionDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription)get_store().find_element_user(GETQUESTIONDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription)get_store().add_element_user(GETQUESTIONDESCRIPTION$0);
            }
            target.set(getQuestionDescription);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuestionDescription" element
     */
    public eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription addNewGetQuestionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription target = null;
            target = (eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription)get_store().add_element_user(GETQUESTIONDESCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML GetQuestionDescription(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetQuestionDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription
    {
        
        public GetQuestionDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUESTIONID$0 = 
            new javax.xml.namespace.QName("", "questionID");
        private static final javax.xml.namespace.QName LOCALE$2 = 
            new javax.xml.namespace.QName("", "locale");
        
        
        /**
         * Gets the "questionID" element
         */
        public java.lang.String getQuestionID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "questionID" element
         */
        public org.apache.xmlbeans.XmlString xgetQuestionID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "questionID" element
         */
        public void setQuestionID(java.lang.String questionID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUESTIONID$0);
                }
                target.setStringValue(questionID);
            }
        }
        
        /**
         * Sets (as xml) the "questionID" element
         */
        public void xsetQuestionID(org.apache.xmlbeans.XmlString questionID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUESTIONID$0);
                }
                target.set(questionID);
            }
        }
        
        /**
         * Gets the "locale" element
         */
        public eu.aladdin_project.xsd.SystemParameter getLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$2, 0);
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
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(LOCALE$2, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$2);
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
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(LOCALE$2);
                return target;
            }
        }
    }
}
