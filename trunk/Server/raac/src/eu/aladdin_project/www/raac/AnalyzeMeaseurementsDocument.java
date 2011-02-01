/*
 * An XML document type.
 * Localname: AnalyzeMeaseurements
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac;


/**
 * A document containing one AnalyzeMeaseurements(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public interface AnalyzeMeaseurementsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnalyzeMeaseurementsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD74B4A2CD807D90BDBD7A36C18E693A4").resolveHandle("analyzemeaseurements2264doctype");
    
    /**
     * Gets the "AnalyzeMeaseurements" element
     */
    eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements getAnalyzeMeaseurements();
    
    /**
     * Sets the "AnalyzeMeaseurements" element
     */
    void setAnalyzeMeaseurements(eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements analyzeMeaseurements);
    
    /**
     * Appends and returns a new empty "AnalyzeMeaseurements" element
     */
    eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements addNewAnalyzeMeaseurements();
    
    /**
     * An XML AnalyzeMeaseurements(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public interface AnalyzeMeaseurements extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnalyzeMeaseurements.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD74B4A2CD807D90BDBD7A36C18E693A4").resolveHandle("analyzemeaseurements974celemtype");
        
        /**
         * Gets array of all "in" elements
         */
        eu.aladdin_project.xsd.Measurement[] getInArray();
        
        /**
         * Gets ith "in" element
         */
        eu.aladdin_project.xsd.Measurement getInArray(int i);
        
        /**
         * Returns number of "in" element
         */
        int sizeOfInArray();
        
        /**
         * Sets array of all "in" element
         */
        void setInArray(eu.aladdin_project.xsd.Measurement[] inArray);
        
        /**
         * Sets ith "in" element
         */
        void setInArray(int i, eu.aladdin_project.xsd.Measurement in);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "in" element
         */
        eu.aladdin_project.xsd.Measurement insertNewIn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "in" element
         */
        eu.aladdin_project.xsd.Measurement addNewIn();
        
        /**
         * Removes the ith "in" element
         */
        void removeIn(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements newInstance() {
              return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument newInstance() {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
