/*
 * An XML document type.
 * Localname: GetQuestionnaireAnswersByTaskResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent;


/**
 * A document containing one GetQuestionnaireAnswersByTaskResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public interface GetQuestionnaireAnswersByTaskResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetQuestionnaireAnswersByTaskResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E6AEF51E01EC245AB15E23DD1E77FA1").resolveHandle("getquestionnaireanswersbytaskresponsed093doctype");
    
    /**
     * Gets the "GetQuestionnaireAnswersByTaskResponse" element
     */
    eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse getGetQuestionnaireAnswersByTaskResponse();
    
    /**
     * Sets the "GetQuestionnaireAnswersByTaskResponse" element
     */
    void setGetQuestionnaireAnswersByTaskResponse(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse getQuestionnaireAnswersByTaskResponse);
    
    /**
     * Appends and returns a new empty "GetQuestionnaireAnswersByTaskResponse" element
     */
    eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse addNewGetQuestionnaireAnswersByTaskResponse();
    
    /**
     * An XML GetQuestionnaireAnswersByTaskResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public interface GetQuestionnaireAnswersByTaskResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetQuestionnaireAnswersByTaskResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E6AEF51E01EC245AB15E23DD1E77FA1").resolveHandle("getquestionnaireanswersbytaskresponse0b24elemtype");
        
        /**
         * Gets the "out" element
         */
        eu.aladdin_project.xsd.QuestionnaireAnswers getOut();
        
        /**
         * Sets the "out" element
         */
        void setOut(eu.aladdin_project.xsd.QuestionnaireAnswers out);
        
        /**
         * Appends and returns a new empty "out" element
         */
        eu.aladdin_project.xsd.QuestionnaireAnswers addNewOut();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse newInstance() {
              return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument newInstance() {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
