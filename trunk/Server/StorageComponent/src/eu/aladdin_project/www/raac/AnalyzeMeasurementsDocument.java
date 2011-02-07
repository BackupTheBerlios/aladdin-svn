/*
 * An XML document type.
 * Localname: AnalyzeMeasurements
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac;


/**
 * A document containing one AnalyzeMeasurements(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public interface AnalyzeMeasurementsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnalyzeMeasurementsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s48162B0598A240B7345C5C72F15FC2A4").resolveHandle("analyzemeasurementsf8d9doctype");
    
    /**
     * Gets the "AnalyzeMeasurements" element
     */
    eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements getAnalyzeMeasurements();
    
    /**
     * Sets the "AnalyzeMeasurements" element
     */
    void setAnalyzeMeasurements(eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements analyzeMeasurements);
    
    /**
     * Appends and returns a new empty "AnalyzeMeasurements" element
     */
    eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements addNewAnalyzeMeasurements();
    
    /**
     * An XML AnalyzeMeasurements(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public interface AnalyzeMeasurements extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnalyzeMeasurements.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s48162B0598A240B7345C5C72F15FC2A4").resolveHandle("analyzemeasurements2408elemtype");
        
        /**
         * Gets the "in" element
         */
        eu.aladdin_project.xsd.Measurement getIn();
        
        /**
         * Sets the "in" element
         */
        void setIn(eu.aladdin_project.xsd.Measurement in);
        
        /**
         * Appends and returns a new empty "in" element
         */
        eu.aladdin_project.xsd.Measurement addNewIn();
        
        /**
         * Gets the "PatientID" element
         */
        java.lang.String getPatientID();
        
        /**
         * Gets (as xml) the "PatientID" element
         */
        org.apache.xmlbeans.XmlString xgetPatientID();
        
        /**
         * Sets the "PatientID" element
         */
        void setPatientID(java.lang.String patientID);
        
        /**
         * Sets (as xml) the "PatientID" element
         */
        void xsetPatientID(org.apache.xmlbeans.XmlString patientID);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements newInstance() {
              return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument.AnalyzeMeasurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument newInstance() {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
