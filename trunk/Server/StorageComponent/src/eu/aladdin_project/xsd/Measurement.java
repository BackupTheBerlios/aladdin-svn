/*
 * XML Type:  Measurement
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Measurement
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML Measurement(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface Measurement extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA2431263ED66DEFEF40FF37837CEB3BE").resolveHandle("measurementf9d6type");
    
    /**
     * Gets the "Type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Gets the "Value" element
     */
    java.math.BigDecimal getValue();
    
    /**
     * Gets (as xml) the "Value" element
     */
    org.apache.xmlbeans.XmlDecimal xgetValue();
    
    /**
     * Sets the "Value" element
     */
    void setValue(java.math.BigDecimal value);
    
    /**
     * Sets (as xml) the "Value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlDecimal value);
    
    /**
     * Gets the "DateTime" element
     */
    java.util.Calendar getDateTime();
    
    /**
     * Gets (as xml) the "DateTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateTime();
    
    /**
     * Sets the "DateTime" element
     */
    void setDateTime(java.util.Calendar dateTime);
    
    /**
     * Sets (as xml) the "DateTime" element
     */
    void xsetDateTime(org.apache.xmlbeans.XmlDateTime dateTime);
    
    /**
     * Gets the "Units" element
     */
    java.lang.String getUnits();
    
    /**
     * Gets (as xml) the "Units" element
     */
    org.apache.xmlbeans.XmlString xgetUnits();
    
    /**
     * Sets the "Units" element
     */
    void setUnits(java.lang.String units);
    
    /**
     * Sets (as xml) the "Units" element
     */
    void xsetUnits(org.apache.xmlbeans.XmlString units);
    
    /**
     * Gets the "LowerLimit" element
     */
    java.math.BigDecimal getLowerLimit();
    
    /**
     * Gets (as xml) the "LowerLimit" element
     */
    org.apache.xmlbeans.XmlDecimal xgetLowerLimit();
    
    /**
     * True if has "LowerLimit" element
     */
    boolean isSetLowerLimit();
    
    /**
     * Sets the "LowerLimit" element
     */
    void setLowerLimit(java.math.BigDecimal lowerLimit);
    
    /**
     * Sets (as xml) the "LowerLimit" element
     */
    void xsetLowerLimit(org.apache.xmlbeans.XmlDecimal lowerLimit);
    
    /**
     * Unsets the "LowerLimit" element
     */
    void unsetLowerLimit();
    
    /**
     * Gets the "UpperLimit" element
     */
    java.math.BigDecimal getUpperLimit();
    
    /**
     * Gets (as xml) the "UpperLimit" element
     */
    org.apache.xmlbeans.XmlDecimal xgetUpperLimit();
    
    /**
     * True if has "UpperLimit" element
     */
    boolean isSetUpperLimit();
    
    /**
     * Sets the "UpperLimit" element
     */
    void setUpperLimit(java.math.BigDecimal upperLimit);
    
    /**
     * Sets (as xml) the "UpperLimit" element
     */
    void xsetUpperLimit(org.apache.xmlbeans.XmlDecimal upperLimit);
    
    /**
     * Unsets the "UpperLimit" element
     */
    void unsetUpperLimit();
    
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
     * Gets the "TaskID" element
     */
    java.lang.String getTaskID();
    
    /**
     * Gets (as xml) the "TaskID" element
     */
    org.apache.xmlbeans.XmlString xgetTaskID();
    
    /**
     * Sets the "TaskID" element
     */
    void setTaskID(java.lang.String taskID);
    
    /**
     * Sets (as xml) the "TaskID" element
     */
    void xsetTaskID(org.apache.xmlbeans.XmlString taskID);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.Measurement newInstance() {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.Measurement parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.Measurement parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.Measurement parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Measurement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Measurement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
