/*
 * XML Type:  CarerAssessment
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.CarerAssessment
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML CarerAssessment(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface CarerAssessment extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CarerAssessment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5680CD1851D9D57B1BD013AD6BDF589B").resolveHandle("carerassessment997dtype");
    
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
     * Gets the "CarerID" element
     */
    java.lang.String getCarerID();
    
    /**
     * Gets (as xml) the "CarerID" element
     */
    org.apache.xmlbeans.XmlString xgetCarerID();
    
    /**
     * Sets the "CarerID" element
     */
    void setCarerID(java.lang.String carerID);
    
    /**
     * Sets (as xml) the "CarerID" element
     */
    void xsetCarerID(org.apache.xmlbeans.XmlString carerID);
    
    /**
     * Gets the "ClinicianID" element
     */
    java.lang.String getClinicianID();
    
    /**
     * Gets (as xml) the "ClinicianID" element
     */
    org.apache.xmlbeans.XmlString xgetClinicianID();
    
    /**
     * Sets the "ClinicianID" element
     */
    void setClinicianID(java.lang.String clinicianID);
    
    /**
     * Sets (as xml) the "ClinicianID" element
     */
    void xsetClinicianID(org.apache.xmlbeans.XmlString clinicianID);
    
    /**
     * Gets the "DateOfAssessment" element
     */
    java.util.Calendar getDateOfAssessment();
    
    /**
     * Gets (as xml) the "DateOfAssessment" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateOfAssessment();
    
    /**
     * Sets the "DateOfAssessment" element
     */
    void setDateOfAssessment(java.util.Calendar dateOfAssessment);
    
    /**
     * Sets (as xml) the "DateOfAssessment" element
     */
    void xsetDateOfAssessment(org.apache.xmlbeans.XmlDateTime dateOfAssessment);
    
    /**
     * Gets the "RelevantHealthProblem" element
     */
    java.lang.String getRelevantHealthProblem();
    
    /**
     * Gets (as xml) the "RelevantHealthProblem" element
     */
    org.apache.xmlbeans.XmlString xgetRelevantHealthProblem();
    
    /**
     * True if has "RelevantHealthProblem" element
     */
    boolean isSetRelevantHealthProblem();
    
    /**
     * Sets the "RelevantHealthProblem" element
     */
    void setRelevantHealthProblem(java.lang.String relevantHealthProblem);
    
    /**
     * Sets (as xml) the "RelevantHealthProblem" element
     */
    void xsetRelevantHealthProblem(org.apache.xmlbeans.XmlString relevantHealthProblem);
    
    /**
     * Unsets the "RelevantHealthProblem" element
     */
    void unsetRelevantHealthProblem();
    
    /**
     * Gets the "SeverityOfBurden" element
     */
    short getSeverityOfBurden();
    
    /**
     * Gets (as xml) the "SeverityOfBurden" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetSeverityOfBurden();
    
    /**
     * Sets the "SeverityOfBurden" element
     */
    void setSeverityOfBurden(short severityOfBurden);
    
    /**
     * Sets (as xml) the "SeverityOfBurden" element
     */
    void xsetSeverityOfBurden(org.apache.xmlbeans.XmlUnsignedByte severityOfBurden);
    
    /**
     * Gets the "EmotionalOrMentalDisorders" element
     */
    java.lang.String getEmotionalOrMentalDisorders();
    
    /**
     * Gets (as xml) the "EmotionalOrMentalDisorders" element
     */
    org.apache.xmlbeans.XmlString xgetEmotionalOrMentalDisorders();
    
    /**
     * True if has "EmotionalOrMentalDisorders" element
     */
    boolean isSetEmotionalOrMentalDisorders();
    
    /**
     * Sets the "EmotionalOrMentalDisorders" element
     */
    void setEmotionalOrMentalDisorders(java.lang.String emotionalOrMentalDisorders);
    
    /**
     * Sets (as xml) the "EmotionalOrMentalDisorders" element
     */
    void xsetEmotionalOrMentalDisorders(org.apache.xmlbeans.XmlString emotionalOrMentalDisorders);
    
    /**
     * Unsets the "EmotionalOrMentalDisorders" element
     */
    void unsetEmotionalOrMentalDisorders();
    
    /**
     * Gets the "PsychoactiveDrugs" element
     */
    java.lang.String getPsychoactiveDrugs();
    
    /**
     * Gets (as xml) the "PsychoactiveDrugs" element
     */
    org.apache.xmlbeans.XmlString xgetPsychoactiveDrugs();
    
    /**
     * True if has "PsychoactiveDrugs" element
     */
    boolean isSetPsychoactiveDrugs();
    
    /**
     * Sets the "PsychoactiveDrugs" element
     */
    void setPsychoactiveDrugs(java.lang.String psychoactiveDrugs);
    
    /**
     * Sets (as xml) the "PsychoactiveDrugs" element
     */
    void xsetPsychoactiveDrugs(org.apache.xmlbeans.XmlString psychoactiveDrugs);
    
    /**
     * Unsets the "PsychoactiveDrugs" element
     */
    void unsetPsychoactiveDrugs();
    
    /**
     * Gets the "QualityOfLife" element
     */
    short getQualityOfLife();
    
    /**
     * Gets (as xml) the "QualityOfLife" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetQualityOfLife();
    
    /**
     * True if has "QualityOfLife" element
     */
    boolean isSetQualityOfLife();
    
    /**
     * Sets the "QualityOfLife" element
     */
    void setQualityOfLife(short qualityOfLife);
    
    /**
     * Sets (as xml) the "QualityOfLife" element
     */
    void xsetQualityOfLife(org.apache.xmlbeans.XmlUnsignedByte qualityOfLife);
    
    /**
     * Unsets the "QualityOfLife" element
     */
    void unsetQualityOfLife();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.CarerAssessment newInstance() {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.CarerAssessment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.CarerAssessment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.CarerAssessment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.CarerAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
