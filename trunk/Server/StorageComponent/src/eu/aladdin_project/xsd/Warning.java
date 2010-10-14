/*
 * XML Type:  Warning
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Warning
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML Warning(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface Warning extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Warning.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s29944A69A16AFA0FE7DAAD18119ADA6B").resolveHandle("warning2936type");
    
    /**
     * Gets the "ID" element
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.apache.xmlbeans.XmlString xgetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.apache.xmlbeans.XmlString id);
    
    /**
     * Gets the "TypeOfWarning" element
     */
    eu.aladdin_project.xsd.SystemParameter getTypeOfWarning();
    
    /**
     * Sets the "TypeOfWarning" element
     */
    void setTypeOfWarning(eu.aladdin_project.xsd.SystemParameter typeOfWarning);
    
    /**
     * Appends and returns a new empty "TypeOfWarning" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewTypeOfWarning();
    
    /**
     * Gets the "DateTimeOfWarning" element
     */
    java.util.Calendar getDateTimeOfWarning();
    
    /**
     * Gets (as xml) the "DateTimeOfWarning" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateTimeOfWarning();
    
    /**
     * Sets the "DateTimeOfWarning" element
     */
    void setDateTimeOfWarning(java.util.Calendar dateTimeOfWarning);
    
    /**
     * Sets (as xml) the "DateTimeOfWarning" element
     */
    void xsetDateTimeOfWarning(org.apache.xmlbeans.XmlDateTime dateTimeOfWarning);
    
    /**
     * Gets the "Effect" element
     */
    eu.aladdin_project.xsd.SystemParameter getEffect();
    
    /**
     * Sets the "Effect" element
     */
    void setEffect(eu.aladdin_project.xsd.SystemParameter effect);
    
    /**
     * Appends and returns a new empty "Effect" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewEffect();
    
    /**
     * Gets the "Indicator" element
     */
    eu.aladdin_project.xsd.SystemParameter getIndicator();
    
    /**
     * Sets the "Indicator" element
     */
    void setIndicator(eu.aladdin_project.xsd.SystemParameter indicator);
    
    /**
     * Appends and returns a new empty "Indicator" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewIndicator();
    
    /**
     * Gets the "RiskLevel" element
     */
    eu.aladdin_project.xsd.SystemParameter getRiskLevel();
    
    /**
     * Sets the "RiskLevel" element
     */
    void setRiskLevel(eu.aladdin_project.xsd.SystemParameter riskLevel);
    
    /**
     * Appends and returns a new empty "RiskLevel" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewRiskLevel();
    
    /**
     * Gets the "JustificationText" element
     */
    java.lang.String getJustificationText();
    
    /**
     * Gets (as xml) the "JustificationText" element
     */
    org.apache.xmlbeans.XmlString xgetJustificationText();
    
    /**
     * Sets the "JustificationText" element
     */
    void setJustificationText(java.lang.String justificationText);
    
    /**
     * Sets (as xml) the "JustificationText" element
     */
    void xsetJustificationText(org.apache.xmlbeans.XmlString justificationText);
    
    /**
     * Gets the "EmergencyLevel" element
     */
    eu.aladdin_project.xsd.SystemParameter getEmergencyLevel();
    
    /**
     * Sets the "EmergencyLevel" element
     */
    void setEmergencyLevel(eu.aladdin_project.xsd.SystemParameter emergencyLevel);
    
    /**
     * Appends and returns a new empty "EmergencyLevel" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewEmergencyLevel();
    
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
     * Gets the "Delivered" element
     */
    boolean getDelivered();
    
    /**
     * Gets (as xml) the "Delivered" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDelivered();
    
    /**
     * Sets the "Delivered" element
     */
    void setDelivered(boolean delivered);
    
    /**
     * Sets (as xml) the "Delivered" element
     */
    void xsetDelivered(org.apache.xmlbeans.XmlBoolean delivered);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.Warning newInstance() {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.Warning newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.Warning parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.Warning parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.Warning parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.Warning parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.Warning parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.Warning parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.Warning parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.Warning parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.Warning parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.Warning parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.Warning parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.Warning parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.Warning parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.Warning parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Warning parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Warning parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Warning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
