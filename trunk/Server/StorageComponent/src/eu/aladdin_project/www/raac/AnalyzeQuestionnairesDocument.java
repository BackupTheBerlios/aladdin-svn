/*
 * An XML document type.
 * Localname: AnalyzeQuestionnaires
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac;


/**
 * A document containing one AnalyzeQuestionnaires(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public interface AnalyzeQuestionnairesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnalyzeQuestionnairesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5920F14D721C35BCDF7184CED07755E6").resolveHandle("analyzequestionnaires5a92doctype");
    
    /**
     * Gets the "AnalyzeQuestionnaires" element
     */
    eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires getAnalyzeQuestionnaires();
    
    /**
     * Sets the "AnalyzeQuestionnaires" element
     */
    void setAnalyzeQuestionnaires(eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires analyzeQuestionnaires);
    
    /**
     * Appends and returns a new empty "AnalyzeQuestionnaires" element
     */
    eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires addNewAnalyzeQuestionnaires();
    
    /**
     * An XML AnalyzeQuestionnaires(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public interface AnalyzeQuestionnaires extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnalyzeQuestionnaires.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5920F14D721C35BCDF7184CED07755E6").resolveHandle("analyzequestionnaires007aelemtype");
        
        /**
         * Gets the "userID" element
         */
        java.lang.String getUserID();
        
        /**
         * Gets (as xml) the "userID" element
         */
        org.apache.xmlbeans.XmlString xgetUserID();
        
        /**
         * Sets the "userID" element
         */
        void setUserID(java.lang.String userID);
        
        /**
         * Sets (as xml) the "userID" element
         */
        void xsetUserID(org.apache.xmlbeans.XmlString userID);
        
        /**
         * Gets array of all "answers" elements
         */
        eu.aladdin_project.xsd.QuestionnaireAnswer[] getAnswersArray();
        
        /**
         * Gets ith "answers" element
         */
        eu.aladdin_project.xsd.QuestionnaireAnswer getAnswersArray(int i);
        
        /**
         * Returns number of "answers" element
         */
        int sizeOfAnswersArray();
        
        /**
         * Sets array of all "answers" element
         */
        void setAnswersArray(eu.aladdin_project.xsd.QuestionnaireAnswer[] answersArray);
        
        /**
         * Sets ith "answers" element
         */
        void setAnswersArray(int i, eu.aladdin_project.xsd.QuestionnaireAnswer answers);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "answers" element
         */
        eu.aladdin_project.xsd.QuestionnaireAnswer insertNewAnswers(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "answers" element
         */
        eu.aladdin_project.xsd.QuestionnaireAnswer addNewAnswers();
        
        /**
         * Removes the ith "answers" element
         */
        void removeAnswers(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires newInstance() {
              return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument newInstance() {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
