/*
 * An XML document type.
 * Localname: GetQuestionnaireAnswersResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent;


/**
 * A document containing one GetQuestionnaireAnswersResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public interface GetQuestionnaireAnswersResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetQuestionnaireAnswersResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB878E303EE9393334F52EB68B360A72").resolveHandle("getquestionnaireanswersresponse2f37doctype");
    
    /**
     * Gets the "GetQuestionnaireAnswersResponse" element
     */
    eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse getGetQuestionnaireAnswersResponse();
    
    /**
     * Sets the "GetQuestionnaireAnswersResponse" element
     */
    void setGetQuestionnaireAnswersResponse(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse getQuestionnaireAnswersResponse);
    
    /**
     * Appends and returns a new empty "GetQuestionnaireAnswersResponse" element
     */
    eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse addNewGetQuestionnaireAnswersResponse();
    
    /**
     * An XML GetQuestionnaireAnswersResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public interface GetQuestionnaireAnswersResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetQuestionnaireAnswersResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB878E303EE9393334F52EB68B360A72").resolveHandle("getquestionnaireanswersresponse14ecelemtype");
        
        /**
         * Gets array of all "out" elements
         */
        eu.aladdin_project.xsd.QuestionnaireAnswers[] getOutArray();
        
        /**
         * Gets ith "out" element
         */
        eu.aladdin_project.xsd.QuestionnaireAnswers getOutArray(int i);
        
        /**
         * Returns number of "out" element
         */
        int sizeOfOutArray();
        
        /**
         * Sets array of all "out" element
         */
        void setOutArray(eu.aladdin_project.xsd.QuestionnaireAnswers[] outArray);
        
        /**
         * Sets ith "out" element
         */
        void setOutArray(int i, eu.aladdin_project.xsd.QuestionnaireAnswers out);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "out" element
         */
        eu.aladdin_project.xsd.QuestionnaireAnswers insertNewOut(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        eu.aladdin_project.xsd.QuestionnaireAnswers addNewOut();
        
        /**
         * Removes the ith "out" element
         */
        void removeOut(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse newInstance() {
              return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument newInstance() {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
