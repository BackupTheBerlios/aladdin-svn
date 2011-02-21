/*
 * XML Type:  PatientAssessment
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.PatientAssessment
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML PatientAssessment(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface PatientAssessment extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientAssessment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s16DC051792BA0A0778EF9752449FC2F0").resolveHandle("patientassessment1f41type");
    
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
     * Gets the "Aetology" element
     */
    eu.aladdin_project.xsd.SystemParameter getAetology();
    
    /**
     * Sets the "Aetology" element
     */
    void setAetology(eu.aladdin_project.xsd.SystemParameter aetology);
    
    /**
     * Appends and returns a new empty "Aetology" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewAetology();
    
    /**
     * Gets the "TimeEllapsedSinceDiagnosed" element
     */
    short getTimeEllapsedSinceDiagnosed();
    
    /**
     * Gets (as xml) the "TimeEllapsedSinceDiagnosed" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetTimeEllapsedSinceDiagnosed();
    
    /**
     * Sets the "TimeEllapsedSinceDiagnosed" element
     */
    void setTimeEllapsedSinceDiagnosed(short timeEllapsedSinceDiagnosed);
    
    /**
     * Sets (as xml) the "TimeEllapsedSinceDiagnosed" element
     */
    void xsetTimeEllapsedSinceDiagnosed(org.apache.xmlbeans.XmlUnsignedByte timeEllapsedSinceDiagnosed);
    
    /**
     * Gets the "Severity" element
     */
    short getSeverity();
    
    /**
     * Gets (as xml) the "Severity" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetSeverity();
    
    /**
     * Sets the "Severity" element
     */
    void setSeverity(short severity);
    
    /**
     * Sets (as xml) the "Severity" element
     */
    void xsetSeverity(org.apache.xmlbeans.XmlUnsignedByte severity);
    
    /**
     * Gets the "RelevantPathologyAntecedents" element
     */
    java.lang.String getRelevantPathologyAntecedents();
    
    /**
     * Gets (as xml) the "RelevantPathologyAntecedents" element
     */
    org.apache.xmlbeans.XmlString xgetRelevantPathologyAntecedents();
    
    /**
     * True if has "RelevantPathologyAntecedents" element
     */
    boolean isSetRelevantPathologyAntecedents();
    
    /**
     * Sets the "RelevantPathologyAntecedents" element
     */
    void setRelevantPathologyAntecedents(java.lang.String relevantPathologyAntecedents);
    
    /**
     * Sets (as xml) the "RelevantPathologyAntecedents" element
     */
    void xsetRelevantPathologyAntecedents(org.apache.xmlbeans.XmlString relevantPathologyAntecedents);
    
    /**
     * Unsets the "RelevantPathologyAntecedents" element
     */
    void unsetRelevantPathologyAntecedents();
    
    /**
     * Gets the "Comorbidity" element
     */
    java.lang.String getComorbidity();
    
    /**
     * Gets (as xml) the "Comorbidity" element
     */
    org.apache.xmlbeans.XmlString xgetComorbidity();
    
    /**
     * True if has "Comorbidity" element
     */
    boolean isSetComorbidity();
    
    /**
     * Sets the "Comorbidity" element
     */
    void setComorbidity(java.lang.String comorbidity);
    
    /**
     * Sets (as xml) the "Comorbidity" element
     */
    void xsetComorbidity(org.apache.xmlbeans.XmlString comorbidity);
    
    /**
     * Unsets the "Comorbidity" element
     */
    void unsetComorbidity();
    
    /**
     * Gets the "CharlsonComorbidityIndex" element
     */
    short getCharlsonComorbidityIndex();
    
    /**
     * Gets (as xml) the "CharlsonComorbidityIndex" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetCharlsonComorbidityIndex();
    
    /**
     * True if has "CharlsonComorbidityIndex" element
     */
    boolean isSetCharlsonComorbidityIndex();
    
    /**
     * Sets the "CharlsonComorbidityIndex" element
     */
    void setCharlsonComorbidityIndex(short charlsonComorbidityIndex);
    
    /**
     * Sets (as xml) the "CharlsonComorbidityIndex" element
     */
    void xsetCharlsonComorbidityIndex(org.apache.xmlbeans.XmlUnsignedByte charlsonComorbidityIndex);
    
    /**
     * Unsets the "CharlsonComorbidityIndex" element
     */
    void unsetCharlsonComorbidityIndex();
    
    /**
     * Gets the "BarthelIndex" element
     */
    short getBarthelIndex();
    
    /**
     * Gets (as xml) the "BarthelIndex" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetBarthelIndex();
    
    /**
     * True if has "BarthelIndex" element
     */
    boolean isSetBarthelIndex();
    
    /**
     * Sets the "BarthelIndex" element
     */
    void setBarthelIndex(short barthelIndex);
    
    /**
     * Sets (as xml) the "BarthelIndex" element
     */
    void xsetBarthelIndex(org.apache.xmlbeans.XmlUnsignedByte barthelIndex);
    
    /**
     * Unsets the "BarthelIndex" element
     */
    void unsetBarthelIndex();
    
    /**
     * Gets the "LawtonIndex" element
     */
    short getLawtonIndex();
    
    /**
     * Gets (as xml) the "LawtonIndex" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetLawtonIndex();
    
    /**
     * True if has "LawtonIndex" element
     */
    boolean isSetLawtonIndex();
    
    /**
     * Sets the "LawtonIndex" element
     */
    void setLawtonIndex(short lawtonIndex);
    
    /**
     * Sets (as xml) the "LawtonIndex" element
     */
    void xsetLawtonIndex(org.apache.xmlbeans.XmlUnsignedByte lawtonIndex);
    
    /**
     * Unsets the "LawtonIndex" element
     */
    void unsetLawtonIndex();
    
    /**
     * Gets the "MMSE" element
     */
    short getMMSE();
    
    /**
     * Gets (as xml) the "MMSE" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetMMSE();
    
    /**
     * Sets the "MMSE" element
     */
    void setMMSE(short mmse);
    
    /**
     * Sets (as xml) the "MMSE" element
     */
    void xsetMMSE(org.apache.xmlbeans.XmlUnsignedByte mmse);
    
    /**
     * Gets the "MDRS" element
     */
    short getMDRS();
    
    /**
     * Gets (as xml) the "MDRS" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetMDRS();
    
    /**
     * True if has "MDRS" element
     */
    boolean isSetMDRS();
    
    /**
     * Sets the "MDRS" element
     */
    void setMDRS(short mdrs);
    
    /**
     * Sets (as xml) the "MDRS" element
     */
    void xsetMDRS(org.apache.xmlbeans.XmlUnsignedByte mdrs);
    
    /**
     * Unsets the "MDRS" element
     */
    void unsetMDRS();
    
    /**
     * Gets the "BlessedScalePart1" element
     */
    double getBlessedScalePart1();
    
    /**
     * Gets (as xml) the "BlessedScalePart1" element
     */
    org.apache.xmlbeans.XmlDouble xgetBlessedScalePart1();
    
    /**
     * True if has "BlessedScalePart1" element
     */
    boolean isSetBlessedScalePart1();
    
    /**
     * Sets the "BlessedScalePart1" element
     */
    void setBlessedScalePart1(double blessedScalePart1);
    
    /**
     * Sets (as xml) the "BlessedScalePart1" element
     */
    void xsetBlessedScalePart1(org.apache.xmlbeans.XmlDouble blessedScalePart1);
    
    /**
     * Unsets the "BlessedScalePart1" element
     */
    void unsetBlessedScalePart1();
    
    /**
     * Gets the "BlessedScalePart2" element
     */
    short getBlessedScalePart2();
    
    /**
     * Gets (as xml) the "BlessedScalePart2" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetBlessedScalePart2();
    
    /**
     * True if has "BlessedScalePart2" element
     */
    boolean isSetBlessedScalePart2();
    
    /**
     * Sets the "BlessedScalePart2" element
     */
    void setBlessedScalePart2(short blessedScalePart2);
    
    /**
     * Sets (as xml) the "BlessedScalePart2" element
     */
    void xsetBlessedScalePart2(org.apache.xmlbeans.XmlUnsignedByte blessedScalePart2);
    
    /**
     * Unsets the "BlessedScalePart2" element
     */
    void unsetBlessedScalePart2();
    
    /**
     * Gets the "BlessedScalePart3" element
     */
    short getBlessedScalePart3();
    
    /**
     * Gets (as xml) the "BlessedScalePart3" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetBlessedScalePart3();
    
    /**
     * True if has "BlessedScalePart3" element
     */
    boolean isSetBlessedScalePart3();
    
    /**
     * Sets the "BlessedScalePart3" element
     */
    void setBlessedScalePart3(short blessedScalePart3);
    
    /**
     * Sets (as xml) the "BlessedScalePart3" element
     */
    void xsetBlessedScalePart3(org.apache.xmlbeans.XmlUnsignedByte blessedScalePart3);
    
    /**
     * Unsets the "BlessedScalePart3" element
     */
    void unsetBlessedScalePart3();
    
    /**
     * Gets the "ChecklistMBP" element
     */
    short getChecklistMBP();
    
    /**
     * Gets (as xml) the "ChecklistMBP" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetChecklistMBP();
    
    /**
     * True if has "ChecklistMBP" element
     */
    boolean isSetChecklistMBP();
    
    /**
     * Sets the "ChecklistMBP" element
     */
    void setChecklistMBP(short checklistMBP);
    
    /**
     * Sets (as xml) the "ChecklistMBP" element
     */
    void xsetChecklistMBP(org.apache.xmlbeans.XmlUnsignedByte checklistMBP);
    
    /**
     * Unsets the "ChecklistMBP" element
     */
    void unsetChecklistMBP();
    
    /**
     * Gets the "NPQI_Severity" element
     */
    short getNPQISeverity();
    
    /**
     * Gets (as xml) the "NPQI_Severity" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetNPQISeverity();
    
    /**
     * True if has "NPQI_Severity" element
     */
    boolean isSetNPQISeverity();
    
    /**
     * Sets the "NPQI_Severity" element
     */
    void setNPQISeverity(short npqiSeverity);
    
    /**
     * Sets (as xml) the "NPQI_Severity" element
     */
    void xsetNPQISeverity(org.apache.xmlbeans.XmlUnsignedByte npqiSeverity);
    
    /**
     * Unsets the "NPQI_Severity" element
     */
    void unsetNPQISeverity();
    
    /**
     * Gets the "NPQI_Stress" element
     */
    short getNPQIStress();
    
    /**
     * Gets (as xml) the "NPQI_Stress" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetNPQIStress();
    
    /**
     * True if has "NPQI_Stress" element
     */
    boolean isSetNPQIStress();
    
    /**
     * Sets the "NPQI_Stress" element
     */
    void setNPQIStress(short npqiStress);
    
    /**
     * Sets (as xml) the "NPQI_Stress" element
     */
    void xsetNPQIStress(org.apache.xmlbeans.XmlUnsignedByte npqiStress);
    
    /**
     * Unsets the "NPQI_Stress" element
     */
    void unsetNPQIStress();
    
    /**
     * Gets the "GDS" element
     */
    short getGDS();
    
    /**
     * Gets (as xml) the "GDS" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetGDS();
    
    /**
     * True if has "GDS" element
     */
    boolean isSetGDS();
    
    /**
     * Sets the "GDS" element
     */
    void setGDS(short gds);
    
    /**
     * Sets (as xml) the "GDS" element
     */
    void xsetGDS(org.apache.xmlbeans.XmlUnsignedByte gds);
    
    /**
     * Unsets the "GDS" element
     */
    void unsetGDS();
    
    /**
     * Gets the "Falls" element
     */
    boolean getFalls();
    
    /**
     * Gets (as xml) the "Falls" element
     */
    org.apache.xmlbeans.XmlBoolean xgetFalls();
    
    /**
     * True if has "Falls" element
     */
    boolean isSetFalls();
    
    /**
     * Sets the "Falls" element
     */
    void setFalls(boolean falls);
    
    /**
     * Sets (as xml) the "Falls" element
     */
    void xsetFalls(org.apache.xmlbeans.XmlBoolean falls);
    
    /**
     * Unsets the "Falls" element
     */
    void unsetFalls();
    
    /**
     * Gets the "Incontinence" element
     */
    boolean getIncontinence();
    
    /**
     * Gets (as xml) the "Incontinence" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIncontinence();
    
    /**
     * True if has "Incontinence" element
     */
    boolean isSetIncontinence();
    
    /**
     * Sets the "Incontinence" element
     */
    void setIncontinence(boolean incontinence);
    
    /**
     * Sets (as xml) the "Incontinence" element
     */
    void xsetIncontinence(org.apache.xmlbeans.XmlBoolean incontinence);
    
    /**
     * Unsets the "Incontinence" element
     */
    void unsetIncontinence();
    
    /**
     * Gets the "Delirium" element
     */
    boolean getDelirium();
    
    /**
     * Gets (as xml) the "Delirium" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDelirium();
    
    /**
     * True if has "Delirium" element
     */
    boolean isSetDelirium();
    
    /**
     * Sets the "Delirium" element
     */
    void setDelirium(boolean delirium);
    
    /**
     * Sets (as xml) the "Delirium" element
     */
    void xsetDelirium(org.apache.xmlbeans.XmlBoolean delirium);
    
    /**
     * Unsets the "Delirium" element
     */
    void unsetDelirium();
    
    /**
     * Gets the "Immobility" element
     */
    boolean getImmobility();
    
    /**
     * Gets (as xml) the "Immobility" element
     */
    org.apache.xmlbeans.XmlBoolean xgetImmobility();
    
    /**
     * True if has "Immobility" element
     */
    boolean isSetImmobility();
    
    /**
     * Sets the "Immobility" element
     */
    void setImmobility(boolean immobility);
    
    /**
     * Sets (as xml) the "Immobility" element
     */
    void xsetImmobility(org.apache.xmlbeans.XmlBoolean immobility);
    
    /**
     * Unsets the "Immobility" element
     */
    void unsetImmobility();
    
    /**
     * Gets the "SensorialDeficits" element
     */
    boolean getSensorialDeficits();
    
    /**
     * Gets (as xml) the "SensorialDeficits" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSensorialDeficits();
    
    /**
     * True if has "SensorialDeficits" element
     */
    boolean isSetSensorialDeficits();
    
    /**
     * Sets the "SensorialDeficits" element
     */
    void setSensorialDeficits(boolean sensorialDeficits);
    
    /**
     * Sets (as xml) the "SensorialDeficits" element
     */
    void xsetSensorialDeficits(org.apache.xmlbeans.XmlBoolean sensorialDeficits);
    
    /**
     * Unsets the "SensorialDeficits" element
     */
    void unsetSensorialDeficits();
    
    /**
     * Gets the "PharmacologicalTreatment" element
     */
    java.lang.String getPharmacologicalTreatment();
    
    /**
     * Gets (as xml) the "PharmacologicalTreatment" element
     */
    org.apache.xmlbeans.XmlString xgetPharmacologicalTreatment();
    
    /**
     * True if has "PharmacologicalTreatment" element
     */
    boolean isSetPharmacologicalTreatment();
    
    /**
     * Sets the "PharmacologicalTreatment" element
     */
    void setPharmacologicalTreatment(java.lang.String pharmacologicalTreatment);
    
    /**
     * Sets (as xml) the "PharmacologicalTreatment" element
     */
    void xsetPharmacologicalTreatment(org.apache.xmlbeans.XmlString pharmacologicalTreatment);
    
    /**
     * Unsets the "PharmacologicalTreatment" element
     */
    void unsetPharmacologicalTreatment();
    
    /**
     * Gets array of all "ClinicalData" elements
     */
    eu.aladdin_project.xsd.Measurement[] getClinicalDataArray();
    
    /**
     * Gets ith "ClinicalData" element
     */
    eu.aladdin_project.xsd.Measurement getClinicalDataArray(int i);
    
    /**
     * Returns number of "ClinicalData" element
     */
    int sizeOfClinicalDataArray();
    
    /**
     * Sets array of all "ClinicalData" element
     */
    void setClinicalDataArray(eu.aladdin_project.xsd.Measurement[] clinicalDataArray);
    
    /**
     * Sets ith "ClinicalData" element
     */
    void setClinicalDataArray(int i, eu.aladdin_project.xsd.Measurement clinicalData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClinicalData" element
     */
    eu.aladdin_project.xsd.Measurement insertNewClinicalData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ClinicalData" element
     */
    eu.aladdin_project.xsd.Measurement addNewClinicalData();
    
    /**
     * Removes the ith "ClinicalData" element
     */
    void removeClinicalData(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.PatientAssessment newInstance() {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.PatientAssessment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.PatientAssessment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.PatientAssessment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.PatientAssessment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
