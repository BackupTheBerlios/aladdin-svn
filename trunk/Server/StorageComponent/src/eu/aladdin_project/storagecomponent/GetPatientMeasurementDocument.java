/*
 * An XML document type.
 * Localname: GetPatientMeasurement
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent;


/**
 * A document containing one GetPatientMeasurement(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public interface GetPatientMeasurementDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPatientMeasurementDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8FFB6639CE07877265FAED7A39ACAC04").resolveHandle("getpatientmeasurementc93bdoctype");
    
    /**
     * Gets the "GetPatientMeasurement" element
     */
    eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement getGetPatientMeasurement();
    
    /**
     * Sets the "GetPatientMeasurement" element
     */
    void setGetPatientMeasurement(eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement getPatientMeasurement);
    
    /**
     * Appends and returns a new empty "GetPatientMeasurement" element
     */
    eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement addNewGetPatientMeasurement();
    
    /**
     * An XML GetPatientMeasurement(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public interface GetPatientMeasurement extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPatientMeasurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8FFB6639CE07877265FAED7A39ACAC04").resolveHandle("getpatientmeasurement6874elemtype");
        
        /**
         * Gets the "PatientId" element
         */
        java.lang.String getPatientId();
        
        /**
         * Gets (as xml) the "PatientId" element
         */
        org.apache.xmlbeans.XmlString xgetPatientId();
        
        /**
         * Sets the "PatientId" element
         */
        void setPatientId(java.lang.String patientId);
        
        /**
         * Sets (as xml) the "PatientId" element
         */
        void xsetPatientId(org.apache.xmlbeans.XmlString patientId);
        
        /**
         * Gets the "MeasurementType" element
         */
        int getMeasurementType();
        
        /**
         * Gets (as xml) the "MeasurementType" element
         */
        org.apache.xmlbeans.XmlInt xgetMeasurementType();
        
        /**
         * Sets the "MeasurementType" element
         */
        void setMeasurementType(int measurementType);
        
        /**
         * Sets (as xml) the "MeasurementType" element
         */
        void xsetMeasurementType(org.apache.xmlbeans.XmlInt measurementType);
        
        /**
         * Gets the "fromData" element
         */
        java.util.Calendar getFromData();
        
        /**
         * Gets (as xml) the "fromData" element
         */
        org.apache.xmlbeans.XmlDateTime xgetFromData();
        
        /**
         * Sets the "fromData" element
         */
        void setFromData(java.util.Calendar fromData);
        
        /**
         * Sets (as xml) the "fromData" element
         */
        void xsetFromData(org.apache.xmlbeans.XmlDateTime fromData);
        
        /**
         * Gets the "toData" element
         */
        java.util.Calendar getToData();
        
        /**
         * Gets (as xml) the "toData" element
         */
        org.apache.xmlbeans.XmlDateTime xgetToData();
        
        /**
         * Sets the "toData" element
         */
        void setToData(java.util.Calendar toData);
        
        /**
         * Sets (as xml) the "toData" element
         */
        void xsetToData(org.apache.xmlbeans.XmlDateTime toData);
        
        /**
         * Gets the "userId" element
         */
        java.lang.String getUserId();
        
        /**
         * Gets (as xml) the "userId" element
         */
        org.apache.xmlbeans.XmlString xgetUserId();
        
        /**
         * Sets the "userId" element
         */
        void setUserId(java.lang.String userId);
        
        /**
         * Sets (as xml) the "userId" element
         */
        void xsetUserId(org.apache.xmlbeans.XmlString userId);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement newInstance() {
              return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument newInstance() {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
