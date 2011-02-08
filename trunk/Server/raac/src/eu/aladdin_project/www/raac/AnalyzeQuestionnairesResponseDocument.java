/*
 * An XML document type.
 * Localname: AnalyzeQuestionnairesResponse
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac;


/**
 * A document containing one AnalyzeQuestionnairesResponse(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public interface AnalyzeQuestionnairesResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnalyzeQuestionnairesResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7FB48A01A5B169EB7D85E761ED6D1831").resolveHandle("analyzequestionnairesresponse2373doctype");
    
    /**
     * Gets the "AnalyzeQuestionnairesResponse" element
     */
    eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse getAnalyzeQuestionnairesResponse();
    
    /**
     * Sets the "AnalyzeQuestionnairesResponse" element
     */
    void setAnalyzeQuestionnairesResponse(eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse analyzeQuestionnairesResponse);
    
    /**
     * Appends and returns a new empty "AnalyzeQuestionnairesResponse" element
     */
    eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse addNewAnalyzeQuestionnairesResponse();
    
    /**
     * An XML AnalyzeQuestionnairesResponse(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public interface AnalyzeQuestionnairesResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnalyzeQuestionnairesResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7FB48A01A5B169EB7D85E761ED6D1831").resolveHandle("analyzequestionnairesresponse153celemtype");
        
        /**
         * Gets the "out" element
         */
        eu.aladdin_project.xsd.Warning getOut();
        
        /**
         * Sets the "out" element
         */
        void setOut(eu.aladdin_project.xsd.Warning out);
        
        /**
         * Appends and returns a new empty "out" element
         */
        eu.aladdin_project.xsd.Warning addNewOut();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse newInstance() {
              return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument newInstance() {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
