/*
 * XML Type:  Patient
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Patient
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML Patient(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface Patient extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Patient.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8D84879630252E557120036CD5D6216B").resolveHandle("patient46dftype");
    
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
     * Gets the "PersonData" element
     */
    eu.aladdin_project.xsd.PersonData getPersonData();
    
    /**
     * Sets the "PersonData" element
     */
    void setPersonData(eu.aladdin_project.xsd.PersonData personData);
    
    /**
     * Appends and returns a new empty "PersonData" element
     */
    eu.aladdin_project.xsd.PersonData addNewPersonData();
    
    /**
     * Gets the "SD_Data" element
     */
    eu.aladdin_project.xsd.SocioDemographicData getSDData();
    
    /**
     * Sets the "SD_Data" element
     */
    void setSDData(eu.aladdin_project.xsd.SocioDemographicData sdData);
    
    /**
     * Appends and returns a new empty "SD_Data" element
     */
    eu.aladdin_project.xsd.SocioDemographicData addNewSDData();
    
    /**
     * Gets the "ResponsibleClinicianID" element
     */
    java.lang.String getResponsibleClinicianID();
    
    /**
     * Gets (as xml) the "ResponsibleClinicianID" element
     */
    org.apache.xmlbeans.XmlString xgetResponsibleClinicianID();
    
    /**
     * Sets the "ResponsibleClinicianID" element
     */
    void setResponsibleClinicianID(java.lang.String responsibleClinicianID);
    
    /**
     * Sets (as xml) the "ResponsibleClinicianID" element
     */
    void xsetResponsibleClinicianID(org.apache.xmlbeans.XmlString responsibleClinicianID);
    
    /**
     * Gets the "SocialWorker" element
     */
    eu.aladdin_project.xsd.SocialWorker getSocialWorker();
    
    /**
     * Sets the "SocialWorker" element
     */
    void setSocialWorker(eu.aladdin_project.xsd.SocialWorker socialWorker);
    
    /**
     * Appends and returns a new empty "SocialWorker" element
     */
    eu.aladdin_project.xsd.SocialWorker addNewSocialWorker();
    
    /**
     * Gets the "ConsulterInCharge" element
     */
    eu.aladdin_project.xsd.Consulter getConsulterInCharge();
    
    /**
     * Sets the "ConsulterInCharge" element
     */
    void setConsulterInCharge(eu.aladdin_project.xsd.Consulter consulterInCharge);
    
    /**
     * Appends and returns a new empty "ConsulterInCharge" element
     */
    eu.aladdin_project.xsd.Consulter addNewConsulterInCharge();
    
    /**
     * Gets the "GeneralPractitioner" element
     */
    eu.aladdin_project.xsd.GeneralPractitioner getGeneralPractitioner();
    
    /**
     * Sets the "GeneralPractitioner" element
     */
    void setGeneralPractitioner(eu.aladdin_project.xsd.GeneralPractitioner generalPractitioner);
    
    /**
     * Appends and returns a new empty "GeneralPractitioner" element
     */
    eu.aladdin_project.xsd.GeneralPractitioner addNewGeneralPractitioner();
    
    /**
     * Gets the "PatientCarer" element
     */
    eu.aladdin_project.xsd.Carer getPatientCarer();
    
    /**
     * Sets the "PatientCarer" element
     */
    void setPatientCarer(eu.aladdin_project.xsd.Carer patientCarer);
    
    /**
     * Appends and returns a new empty "PatientCarer" element
     */
    eu.aladdin_project.xsd.Carer addNewPatientCarer();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.Patient newInstance() {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.Patient newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.Patient parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.Patient parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.Patient parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.Patient parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.Patient parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.Patient parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.Patient parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.Patient parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.Patient parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.Patient parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.Patient parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.Patient parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.Patient parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.Patient parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Patient parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Patient parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
