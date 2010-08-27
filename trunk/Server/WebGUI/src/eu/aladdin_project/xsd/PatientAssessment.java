/**
 * PatientAssessment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.xsd;

public class PatientAssessment  implements java.io.Serializable {
    private java.lang.String ID;

    private java.lang.String patientID;

    private java.util.Calendar dateOfAssessment;

    private eu.aladdin_project.xsd.SystemParameter aetology;

    private org.apache.axis.types.UnsignedByte timeEllapsedSinceDiagnosed;

    private org.apache.axis.types.UnsignedByte severity;

    private java.lang.String relevantPathologyAntecedents;

    private java.lang.String comorbidity;

    private org.apache.axis.types.UnsignedByte charlsonComorbidityIndex;

    private org.apache.axis.types.UnsignedByte barthelIndex;

    private org.apache.axis.types.UnsignedByte lawtonIndex;

    private org.apache.axis.types.UnsignedByte MMSE;

    private org.apache.axis.types.UnsignedByte MDRS;

    private java.math.BigDecimal blessedScalePart1;

    private org.apache.axis.types.UnsignedByte blessedScalePart2;

    private org.apache.axis.types.UnsignedByte blessedScalePart3;

    private org.apache.axis.types.UnsignedByte checklistMBP;

    private org.apache.axis.types.UnsignedByte NPQI_Severity;

    private org.apache.axis.types.UnsignedByte NPQI_Stress;

    private org.apache.axis.types.UnsignedByte GDS;

    private java.lang.Boolean falls;

    private java.lang.Boolean incontinence;

    private java.lang.Boolean delirium;

    private java.lang.Boolean immobility;

    private java.lang.Boolean sensorialDeficits;

    private java.lang.String pharmacologicalTreatment;

    private eu.aladdin_project.xsd.Measurement[] clinicalData;

    public PatientAssessment() {
    }

    public PatientAssessment(
           java.lang.String ID,
           java.lang.String patientID,
           java.util.Calendar dateOfAssessment,
           eu.aladdin_project.xsd.SystemParameter aetology,
           org.apache.axis.types.UnsignedByte timeEllapsedSinceDiagnosed,
           org.apache.axis.types.UnsignedByte severity,
           java.lang.String relevantPathologyAntecedents,
           java.lang.String comorbidity,
           org.apache.axis.types.UnsignedByte charlsonComorbidityIndex,
           org.apache.axis.types.UnsignedByte barthelIndex,
           org.apache.axis.types.UnsignedByte lawtonIndex,
           org.apache.axis.types.UnsignedByte MMSE,
           org.apache.axis.types.UnsignedByte MDRS,
           java.math.BigDecimal blessedScalePart1,
           org.apache.axis.types.UnsignedByte blessedScalePart2,
           org.apache.axis.types.UnsignedByte blessedScalePart3,
           org.apache.axis.types.UnsignedByte checklistMBP,
           org.apache.axis.types.UnsignedByte NPQI_Severity,
           org.apache.axis.types.UnsignedByte NPQI_Stress,
           org.apache.axis.types.UnsignedByte GDS,
           java.lang.Boolean falls,
           java.lang.Boolean incontinence,
           java.lang.Boolean delirium,
           java.lang.Boolean immobility,
           java.lang.Boolean sensorialDeficits,
           java.lang.String pharmacologicalTreatment,
           eu.aladdin_project.xsd.Measurement[] clinicalData) {
           this.ID = ID;
           this.patientID = patientID;
           this.dateOfAssessment = dateOfAssessment;
           this.aetology = aetology;
           this.timeEllapsedSinceDiagnosed = timeEllapsedSinceDiagnosed;
           this.severity = severity;
           this.relevantPathologyAntecedents = relevantPathologyAntecedents;
           this.comorbidity = comorbidity;
           this.charlsonComorbidityIndex = charlsonComorbidityIndex;
           this.barthelIndex = barthelIndex;
           this.lawtonIndex = lawtonIndex;
           this.MMSE = MMSE;
           this.MDRS = MDRS;
           this.blessedScalePart1 = blessedScalePart1;
           this.blessedScalePart2 = blessedScalePart2;
           this.blessedScalePart3 = blessedScalePart3;
           this.checklistMBP = checklistMBP;
           this.NPQI_Severity = NPQI_Severity;
           this.NPQI_Stress = NPQI_Stress;
           this.GDS = GDS;
           this.falls = falls;
           this.incontinence = incontinence;
           this.delirium = delirium;
           this.immobility = immobility;
           this.sensorialDeficits = sensorialDeficits;
           this.pharmacologicalTreatment = pharmacologicalTreatment;
           this.clinicalData = clinicalData;
    }


    /**
     * Gets the ID value for this PatientAssessment.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this PatientAssessment.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the patientID value for this PatientAssessment.
     * 
     * @return patientID
     */
    public java.lang.String getPatientID() {
        return patientID;
    }


    /**
     * Sets the patientID value for this PatientAssessment.
     * 
     * @param patientID
     */
    public void setPatientID(java.lang.String patientID) {
        this.patientID = patientID;
    }


    /**
     * Gets the dateOfAssessment value for this PatientAssessment.
     * 
     * @return dateOfAssessment
     */
    public java.util.Calendar getDateOfAssessment() {
        return dateOfAssessment;
    }


    /**
     * Sets the dateOfAssessment value for this PatientAssessment.
     * 
     * @param dateOfAssessment
     */
    public void setDateOfAssessment(java.util.Calendar dateOfAssessment) {
        this.dateOfAssessment = dateOfAssessment;
    }


    /**
     * Gets the aetology value for this PatientAssessment.
     * 
     * @return aetology
     */
    public eu.aladdin_project.xsd.SystemParameter getAetology() {
        return aetology;
    }


    /**
     * Sets the aetology value for this PatientAssessment.
     * 
     * @param aetology
     */
    public void setAetology(eu.aladdin_project.xsd.SystemParameter aetology) {
        this.aetology = aetology;
    }


    /**
     * Gets the timeEllapsedSinceDiagnosed value for this PatientAssessment.
     * 
     * @return timeEllapsedSinceDiagnosed
     */
    public org.apache.axis.types.UnsignedByte getTimeEllapsedSinceDiagnosed() {
        return timeEllapsedSinceDiagnosed;
    }


    /**
     * Sets the timeEllapsedSinceDiagnosed value for this PatientAssessment.
     * 
     * @param timeEllapsedSinceDiagnosed
     */
    public void setTimeEllapsedSinceDiagnosed(org.apache.axis.types.UnsignedByte timeEllapsedSinceDiagnosed) {
        this.timeEllapsedSinceDiagnosed = timeEllapsedSinceDiagnosed;
    }


    /**
     * Gets the severity value for this PatientAssessment.
     * 
     * @return severity
     */
    public org.apache.axis.types.UnsignedByte getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this PatientAssessment.
     * 
     * @param severity
     */
    public void setSeverity(org.apache.axis.types.UnsignedByte severity) {
        this.severity = severity;
    }


    /**
     * Gets the relevantPathologyAntecedents value for this PatientAssessment.
     * 
     * @return relevantPathologyAntecedents
     */
    public java.lang.String getRelevantPathologyAntecedents() {
        return relevantPathologyAntecedents;
    }


    /**
     * Sets the relevantPathologyAntecedents value for this PatientAssessment.
     * 
     * @param relevantPathologyAntecedents
     */
    public void setRelevantPathologyAntecedents(java.lang.String relevantPathologyAntecedents) {
        this.relevantPathologyAntecedents = relevantPathologyAntecedents;
    }


    /**
     * Gets the comorbidity value for this PatientAssessment.
     * 
     * @return comorbidity
     */
    public java.lang.String getComorbidity() {
        return comorbidity;
    }


    /**
     * Sets the comorbidity value for this PatientAssessment.
     * 
     * @param comorbidity
     */
    public void setComorbidity(java.lang.String comorbidity) {
        this.comorbidity = comorbidity;
    }


    /**
     * Gets the charlsonComorbidityIndex value for this PatientAssessment.
     * 
     * @return charlsonComorbidityIndex
     */
    public org.apache.axis.types.UnsignedByte getCharlsonComorbidityIndex() {
        return charlsonComorbidityIndex;
    }


    /**
     * Sets the charlsonComorbidityIndex value for this PatientAssessment.
     * 
     * @param charlsonComorbidityIndex
     */
    public void setCharlsonComorbidityIndex(org.apache.axis.types.UnsignedByte charlsonComorbidityIndex) {
        this.charlsonComorbidityIndex = charlsonComorbidityIndex;
    }


    /**
     * Gets the barthelIndex value for this PatientAssessment.
     * 
     * @return barthelIndex
     */
    public org.apache.axis.types.UnsignedByte getBarthelIndex() {
        return barthelIndex;
    }


    /**
     * Sets the barthelIndex value for this PatientAssessment.
     * 
     * @param barthelIndex
     */
    public void setBarthelIndex(org.apache.axis.types.UnsignedByte barthelIndex) {
        this.barthelIndex = barthelIndex;
    }


    /**
     * Gets the lawtonIndex value for this PatientAssessment.
     * 
     * @return lawtonIndex
     */
    public org.apache.axis.types.UnsignedByte getLawtonIndex() {
        return lawtonIndex;
    }


    /**
     * Sets the lawtonIndex value for this PatientAssessment.
     * 
     * @param lawtonIndex
     */
    public void setLawtonIndex(org.apache.axis.types.UnsignedByte lawtonIndex) {
        this.lawtonIndex = lawtonIndex;
    }


    /**
     * Gets the MMSE value for this PatientAssessment.
     * 
     * @return MMSE
     */
    public org.apache.axis.types.UnsignedByte getMMSE() {
        return MMSE;
    }


    /**
     * Sets the MMSE value for this PatientAssessment.
     * 
     * @param MMSE
     */
    public void setMMSE(org.apache.axis.types.UnsignedByte MMSE) {
        this.MMSE = MMSE;
    }


    /**
     * Gets the MDRS value for this PatientAssessment.
     * 
     * @return MDRS
     */
    public org.apache.axis.types.UnsignedByte getMDRS() {
        return MDRS;
    }


    /**
     * Sets the MDRS value for this PatientAssessment.
     * 
     * @param MDRS
     */
    public void setMDRS(org.apache.axis.types.UnsignedByte MDRS) {
        this.MDRS = MDRS;
    }


    /**
     * Gets the blessedScalePart1 value for this PatientAssessment.
     * 
     * @return blessedScalePart1
     */
    public java.math.BigDecimal getBlessedScalePart1() {
        return blessedScalePart1;
    }


    /**
     * Sets the blessedScalePart1 value for this PatientAssessment.
     * 
     * @param blessedScalePart1
     */
    public void setBlessedScalePart1(java.math.BigDecimal blessedScalePart1) {
        this.blessedScalePart1 = blessedScalePart1;
    }


    /**
     * Gets the blessedScalePart2 value for this PatientAssessment.
     * 
     * @return blessedScalePart2
     */
    public org.apache.axis.types.UnsignedByte getBlessedScalePart2() {
        return blessedScalePart2;
    }


    /**
     * Sets the blessedScalePart2 value for this PatientAssessment.
     * 
     * @param blessedScalePart2
     */
    public void setBlessedScalePart2(org.apache.axis.types.UnsignedByte blessedScalePart2) {
        this.blessedScalePart2 = blessedScalePart2;
    }


    /**
     * Gets the blessedScalePart3 value for this PatientAssessment.
     * 
     * @return blessedScalePart3
     */
    public org.apache.axis.types.UnsignedByte getBlessedScalePart3() {
        return blessedScalePart3;
    }


    /**
     * Sets the blessedScalePart3 value for this PatientAssessment.
     * 
     * @param blessedScalePart3
     */
    public void setBlessedScalePart3(org.apache.axis.types.UnsignedByte blessedScalePart3) {
        this.blessedScalePart3 = blessedScalePart3;
    }


    /**
     * Gets the checklistMBP value for this PatientAssessment.
     * 
     * @return checklistMBP
     */
    public org.apache.axis.types.UnsignedByte getChecklistMBP() {
        return checklistMBP;
    }


    /**
     * Sets the checklistMBP value for this PatientAssessment.
     * 
     * @param checklistMBP
     */
    public void setChecklistMBP(org.apache.axis.types.UnsignedByte checklistMBP) {
        this.checklistMBP = checklistMBP;
    }


    /**
     * Gets the NPQI_Severity value for this PatientAssessment.
     * 
     * @return NPQI_Severity
     */
    public org.apache.axis.types.UnsignedByte getNPQI_Severity() {
        return NPQI_Severity;
    }


    /**
     * Sets the NPQI_Severity value for this PatientAssessment.
     * 
     * @param NPQI_Severity
     */
    public void setNPQI_Severity(org.apache.axis.types.UnsignedByte NPQI_Severity) {
        this.NPQI_Severity = NPQI_Severity;
    }


    /**
     * Gets the NPQI_Stress value for this PatientAssessment.
     * 
     * @return NPQI_Stress
     */
    public org.apache.axis.types.UnsignedByte getNPQI_Stress() {
        return NPQI_Stress;
    }


    /**
     * Sets the NPQI_Stress value for this PatientAssessment.
     * 
     * @param NPQI_Stress
     */
    public void setNPQI_Stress(org.apache.axis.types.UnsignedByte NPQI_Stress) {
        this.NPQI_Stress = NPQI_Stress;
    }


    /**
     * Gets the GDS value for this PatientAssessment.
     * 
     * @return GDS
     */
    public org.apache.axis.types.UnsignedByte getGDS() {
        return GDS;
    }


    /**
     * Sets the GDS value for this PatientAssessment.
     * 
     * @param GDS
     */
    public void setGDS(org.apache.axis.types.UnsignedByte GDS) {
        this.GDS = GDS;
    }


    /**
     * Gets the falls value for this PatientAssessment.
     * 
     * @return falls
     */
    public java.lang.Boolean getFalls() {
        return falls;
    }


    /**
     * Sets the falls value for this PatientAssessment.
     * 
     * @param falls
     */
    public void setFalls(java.lang.Boolean falls) {
        this.falls = falls;
    }


    /**
     * Gets the incontinence value for this PatientAssessment.
     * 
     * @return incontinence
     */
    public java.lang.Boolean getIncontinence() {
        return incontinence;
    }


    /**
     * Sets the incontinence value for this PatientAssessment.
     * 
     * @param incontinence
     */
    public void setIncontinence(java.lang.Boolean incontinence) {
        this.incontinence = incontinence;
    }


    /**
     * Gets the delirium value for this PatientAssessment.
     * 
     * @return delirium
     */
    public java.lang.Boolean getDelirium() {
        return delirium;
    }


    /**
     * Sets the delirium value for this PatientAssessment.
     * 
     * @param delirium
     */
    public void setDelirium(java.lang.Boolean delirium) {
        this.delirium = delirium;
    }


    /**
     * Gets the immobility value for this PatientAssessment.
     * 
     * @return immobility
     */
    public java.lang.Boolean getImmobility() {
        return immobility;
    }


    /**
     * Sets the immobility value for this PatientAssessment.
     * 
     * @param immobility
     */
    public void setImmobility(java.lang.Boolean immobility) {
        this.immobility = immobility;
    }


    /**
     * Gets the sensorialDeficits value for this PatientAssessment.
     * 
     * @return sensorialDeficits
     */
    public java.lang.Boolean getSensorialDeficits() {
        return sensorialDeficits;
    }


    /**
     * Sets the sensorialDeficits value for this PatientAssessment.
     * 
     * @param sensorialDeficits
     */
    public void setSensorialDeficits(java.lang.Boolean sensorialDeficits) {
        this.sensorialDeficits = sensorialDeficits;
    }


    /**
     * Gets the pharmacologicalTreatment value for this PatientAssessment.
     * 
     * @return pharmacologicalTreatment
     */
    public java.lang.String getPharmacologicalTreatment() {
        return pharmacologicalTreatment;
    }


    /**
     * Sets the pharmacologicalTreatment value for this PatientAssessment.
     * 
     * @param pharmacologicalTreatment
     */
    public void setPharmacologicalTreatment(java.lang.String pharmacologicalTreatment) {
        this.pharmacologicalTreatment = pharmacologicalTreatment;
    }


    /**
     * Gets the clinicalData value for this PatientAssessment.
     * 
     * @return clinicalData
     */
    public eu.aladdin_project.xsd.Measurement[] getClinicalData() {
        return clinicalData;
    }


    /**
     * Sets the clinicalData value for this PatientAssessment.
     * 
     * @param clinicalData
     */
    public void setClinicalData(eu.aladdin_project.xsd.Measurement[] clinicalData) {
        this.clinicalData = clinicalData;
    }

    public eu.aladdin_project.xsd.Measurement getClinicalData(int i) {
        return this.clinicalData[i];
    }

    public void setClinicalData(int i, eu.aladdin_project.xsd.Measurement _value) {
        this.clinicalData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatientAssessment)) return false;
        PatientAssessment other = (PatientAssessment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.patientID==null && other.getPatientID()==null) || 
             (this.patientID!=null &&
              this.patientID.equals(other.getPatientID()))) &&
            ((this.dateOfAssessment==null && other.getDateOfAssessment()==null) || 
             (this.dateOfAssessment!=null &&
              this.dateOfAssessment.equals(other.getDateOfAssessment()))) &&
            ((this.aetology==null && other.getAetology()==null) || 
             (this.aetology!=null &&
              this.aetology.equals(other.getAetology()))) &&
            ((this.timeEllapsedSinceDiagnosed==null && other.getTimeEllapsedSinceDiagnosed()==null) || 
             (this.timeEllapsedSinceDiagnosed!=null &&
              this.timeEllapsedSinceDiagnosed.equals(other.getTimeEllapsedSinceDiagnosed()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.relevantPathologyAntecedents==null && other.getRelevantPathologyAntecedents()==null) || 
             (this.relevantPathologyAntecedents!=null &&
              this.relevantPathologyAntecedents.equals(other.getRelevantPathologyAntecedents()))) &&
            ((this.comorbidity==null && other.getComorbidity()==null) || 
             (this.comorbidity!=null &&
              this.comorbidity.equals(other.getComorbidity()))) &&
            ((this.charlsonComorbidityIndex==null && other.getCharlsonComorbidityIndex()==null) || 
             (this.charlsonComorbidityIndex!=null &&
              this.charlsonComorbidityIndex.equals(other.getCharlsonComorbidityIndex()))) &&
            ((this.barthelIndex==null && other.getBarthelIndex()==null) || 
             (this.barthelIndex!=null &&
              this.barthelIndex.equals(other.getBarthelIndex()))) &&
            ((this.lawtonIndex==null && other.getLawtonIndex()==null) || 
             (this.lawtonIndex!=null &&
              this.lawtonIndex.equals(other.getLawtonIndex()))) &&
            ((this.MMSE==null && other.getMMSE()==null) || 
             (this.MMSE!=null &&
              this.MMSE.equals(other.getMMSE()))) &&
            ((this.MDRS==null && other.getMDRS()==null) || 
             (this.MDRS!=null &&
              this.MDRS.equals(other.getMDRS()))) &&
            ((this.blessedScalePart1==null && other.getBlessedScalePart1()==null) || 
             (this.blessedScalePart1!=null &&
              this.blessedScalePart1.equals(other.getBlessedScalePart1()))) &&
            ((this.blessedScalePart2==null && other.getBlessedScalePart2()==null) || 
             (this.blessedScalePart2!=null &&
              this.blessedScalePart2.equals(other.getBlessedScalePart2()))) &&
            ((this.blessedScalePart3==null && other.getBlessedScalePart3()==null) || 
             (this.blessedScalePart3!=null &&
              this.blessedScalePart3.equals(other.getBlessedScalePart3()))) &&
            ((this.checklistMBP==null && other.getChecklistMBP()==null) || 
             (this.checklistMBP!=null &&
              this.checklistMBP.equals(other.getChecklistMBP()))) &&
            ((this.NPQI_Severity==null && other.getNPQI_Severity()==null) || 
             (this.NPQI_Severity!=null &&
              this.NPQI_Severity.equals(other.getNPQI_Severity()))) &&
            ((this.NPQI_Stress==null && other.getNPQI_Stress()==null) || 
             (this.NPQI_Stress!=null &&
              this.NPQI_Stress.equals(other.getNPQI_Stress()))) &&
            ((this.GDS==null && other.getGDS()==null) || 
             (this.GDS!=null &&
              this.GDS.equals(other.getGDS()))) &&
            ((this.falls==null && other.getFalls()==null) || 
             (this.falls!=null &&
              this.falls.equals(other.getFalls()))) &&
            ((this.incontinence==null && other.getIncontinence()==null) || 
             (this.incontinence!=null &&
              this.incontinence.equals(other.getIncontinence()))) &&
            ((this.delirium==null && other.getDelirium()==null) || 
             (this.delirium!=null &&
              this.delirium.equals(other.getDelirium()))) &&
            ((this.immobility==null && other.getImmobility()==null) || 
             (this.immobility!=null &&
              this.immobility.equals(other.getImmobility()))) &&
            ((this.sensorialDeficits==null && other.getSensorialDeficits()==null) || 
             (this.sensorialDeficits!=null &&
              this.sensorialDeficits.equals(other.getSensorialDeficits()))) &&
            ((this.pharmacologicalTreatment==null && other.getPharmacologicalTreatment()==null) || 
             (this.pharmacologicalTreatment!=null &&
              this.pharmacologicalTreatment.equals(other.getPharmacologicalTreatment()))) &&
            ((this.clinicalData==null && other.getClinicalData()==null) || 
             (this.clinicalData!=null &&
              java.util.Arrays.equals(this.clinicalData, other.getClinicalData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getPatientID() != null) {
            _hashCode += getPatientID().hashCode();
        }
        if (getDateOfAssessment() != null) {
            _hashCode += getDateOfAssessment().hashCode();
        }
        if (getAetology() != null) {
            _hashCode += getAetology().hashCode();
        }
        if (getTimeEllapsedSinceDiagnosed() != null) {
            _hashCode += getTimeEllapsedSinceDiagnosed().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getRelevantPathologyAntecedents() != null) {
            _hashCode += getRelevantPathologyAntecedents().hashCode();
        }
        if (getComorbidity() != null) {
            _hashCode += getComorbidity().hashCode();
        }
        if (getCharlsonComorbidityIndex() != null) {
            _hashCode += getCharlsonComorbidityIndex().hashCode();
        }
        if (getBarthelIndex() != null) {
            _hashCode += getBarthelIndex().hashCode();
        }
        if (getLawtonIndex() != null) {
            _hashCode += getLawtonIndex().hashCode();
        }
        if (getMMSE() != null) {
            _hashCode += getMMSE().hashCode();
        }
        if (getMDRS() != null) {
            _hashCode += getMDRS().hashCode();
        }
        if (getBlessedScalePart1() != null) {
            _hashCode += getBlessedScalePart1().hashCode();
        }
        if (getBlessedScalePart2() != null) {
            _hashCode += getBlessedScalePart2().hashCode();
        }
        if (getBlessedScalePart3() != null) {
            _hashCode += getBlessedScalePart3().hashCode();
        }
        if (getChecklistMBP() != null) {
            _hashCode += getChecklistMBP().hashCode();
        }
        if (getNPQI_Severity() != null) {
            _hashCode += getNPQI_Severity().hashCode();
        }
        if (getNPQI_Stress() != null) {
            _hashCode += getNPQI_Stress().hashCode();
        }
        if (getGDS() != null) {
            _hashCode += getGDS().hashCode();
        }
        if (getFalls() != null) {
            _hashCode += getFalls().hashCode();
        }
        if (getIncontinence() != null) {
            _hashCode += getIncontinence().hashCode();
        }
        if (getDelirium() != null) {
            _hashCode += getDelirium().hashCode();
        }
        if (getImmobility() != null) {
            _hashCode += getImmobility().hashCode();
        }
        if (getSensorialDeficits() != null) {
            _hashCode += getSensorialDeficits().hashCode();
        }
        if (getPharmacologicalTreatment() != null) {
            _hashCode += getPharmacologicalTreatment().hashCode();
        }
        if (getClinicalData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClinicalData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClinicalData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatientAssessment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientAssessment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfAssessment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateOfAssessment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aetology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Aetology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SystemParameter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeEllapsedSinceDiagnosed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TimeEllapsedSinceDiagnosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relevantPathologyAntecedents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "RelevantPathologyAntecedents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comorbidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Comorbidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charlsonComorbidityIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CharlsonComorbidityIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barthelIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "BarthelIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lawtonIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "LawtonIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MMSE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "MMSE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "MDRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blessedScalePart1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "BlessedScalePart1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blessedScalePart2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "BlessedScalePart2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blessedScalePart3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "BlessedScalePart3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checklistMBP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ChecklistMBP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NPQI_Severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "NPQI_Severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NPQI_Stress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "NPQI_Stress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GDS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "GDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("falls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Falls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incontinence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Incontinence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delirium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Delirium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immobility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Immobility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensorialDeficits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SensorialDeficits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pharmacologicalTreatment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PharmacologicalTreatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ClinicalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Measurement"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
