/*
 * An XML document type.
 * Localname: GetCarerAssessmentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent;


/**
 * A document containing one GetCarerAssessmentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public interface GetCarerAssessmentResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCarerAssessmentResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA2431263ED66DEFEF40FF37837CEB3BE").resolveHandle("getcarerassessmentresponse1feedoctype");
    
    /**
     * Gets the "GetCarerAssessmentResponse" element
     */
    eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse getGetCarerAssessmentResponse();
    
    /**
     * Sets the "GetCarerAssessmentResponse" element
     */
    void setGetCarerAssessmentResponse(eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse getCarerAssessmentResponse);
    
    /**
     * Appends and returns a new empty "GetCarerAssessmentResponse" element
     */
    eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse addNewGetCarerAssessmentResponse();
    
    /**
     * An XML GetCarerAssessmentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public interface GetCarerAssessmentResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCarerAssessmentResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA2431263ED66DEFEF40FF37837CEB3BE").resolveHandle("getcarerassessmentresponse0a24elemtype");
        
        /**
         * Gets the "out" element
         */
        eu.aladdin_project.xsd.CarerAssessment getOut();
        
        /**
         * Sets the "out" element
         */
        void setOut(eu.aladdin_project.xsd.CarerAssessment out);
        
        /**
         * Appends and returns a new empty "out" element
         */
        eu.aladdin_project.xsd.CarerAssessment addNewOut();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse newInstance() {
              return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument newInstance() {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
