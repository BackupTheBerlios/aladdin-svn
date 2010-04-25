package com.aladdin.xsd;
// default package
// Generated Apr 23, 2010 2:52:40 PM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * PatientAssessment generated by hbm2java
 */
public class PatientAssessment  implements java.io.Serializable {


     private int id;
     private int patient;
     private Timestamp DateOfAssessment;
     private int Aetology;
     private int TimeElapsedSinceDiagnose;
     private int Severity;
     private String RelevantPathologyAntecedents;
     private String Comorbidity;
     private int CharlsonComobodityIndex;
     private int BarthelIndex;
     private int LawtonIndex;
     private int MMSE;
     private int MDRS;
     private BigDecimal BlessedScalePart1;
     private int BlessedScalePart2;
     private int BlessedScalePart3;
     private int ChecklistMBPC;
     private int NPQISeverity;
     private int NPQIStress;
     private int GDS;
     private boolean Falls;
     private boolean Incontinence;
     private boolean Delirium;
     private boolean Immobility;
     private boolean SensorialDeficits;
     private String PharmacologyTreatment;
     private Patient m_Patient;
     private AetologyT m_AetologyT;
     private Set Measurments = new HashSet(0);

    public PatientAssessment() {
    }

    public PatientAssessment(int patient, Timestamp DateOfAssessment, int Aetology, int TimeElapsedSinceDiagnose, int Severity, String RelevantPathologyAntecedents, String Comorbidity, int CharlsonComobodityIndex, int BarthelIndex, int LawtonIndex, int MMSE, int MDRS, BigDecimal BlessedScalePart1, int BlessedScalePart2, int BlessedScalePart3, int ChecklistMBPC, int NPQISeverity, int NPQIStress, int GDS, boolean Falls, boolean Incontinence, boolean Delirium, boolean Immobility, boolean SensorialDeficits, String PharmacologyTreatment, Patient m_Patient, AetologyT m_AetologyT, Set Measurments) {
       this.patient = patient;
       this.DateOfAssessment = DateOfAssessment;
       this.Aetology = Aetology;
       this.TimeElapsedSinceDiagnose = TimeElapsedSinceDiagnose;
       this.Severity = Severity;
       this.RelevantPathologyAntecedents = RelevantPathologyAntecedents;
       this.Comorbidity = Comorbidity;
       this.CharlsonComobodityIndex = CharlsonComobodityIndex;
       this.BarthelIndex = BarthelIndex;
       this.LawtonIndex = LawtonIndex;
       this.MMSE = MMSE;
       this.MDRS = MDRS;
       this.BlessedScalePart1 = BlessedScalePart1;
       this.BlessedScalePart2 = BlessedScalePart2;
       this.BlessedScalePart3 = BlessedScalePart3;
       this.ChecklistMBPC = ChecklistMBPC;
       this.NPQISeverity = NPQISeverity;
       this.NPQIStress = NPQIStress;
       this.GDS = GDS;
       this.Falls = Falls;
       this.Incontinence = Incontinence;
       this.Delirium = Delirium;
       this.Immobility = Immobility;
       this.SensorialDeficits = SensorialDeficits;
       this.PharmacologyTreatment = PharmacologyTreatment;
       this.m_Patient = m_Patient;
       this.m_AetologyT = m_AetologyT;
       this.Measurments = Measurments;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getPatient() {
        return this.patient;
    }
    
    public void setPatient(int patient) {
        this.patient = patient;
    }
    public Timestamp getDateOfAssessment() {
        return this.DateOfAssessment;
    }
    
    public void setDateOfAssessment(Timestamp DateOfAssessment) {
        this.DateOfAssessment = DateOfAssessment;
    }
    public int getAetology() {
        return this.Aetology;
    }
    
    public void setAetology(int Aetology) {
        this.Aetology = Aetology;
    }
    public int getTimeElapsedSinceDiagnose() {
        return this.TimeElapsedSinceDiagnose;
    }
    
    public void setTimeElapsedSinceDiagnose(int TimeElapsedSinceDiagnose) {
        this.TimeElapsedSinceDiagnose = TimeElapsedSinceDiagnose;
    }
    public int getSeverity() {
        return this.Severity;
    }
    
    public void setSeverity(int Severity) {
        this.Severity = Severity;
    }
    public String getRelevantPathologyAntecedents() {
        return this.RelevantPathologyAntecedents;
    }
    
    public void setRelevantPathologyAntecedents(String RelevantPathologyAntecedents) {
        this.RelevantPathologyAntecedents = RelevantPathologyAntecedents;
    }
    public String getComorbidity() {
        return this.Comorbidity;
    }
    
    public void setComorbidity(String Comorbidity) {
        this.Comorbidity = Comorbidity;
    }
    public int getCharlsonComobodityIndex() {
        return this.CharlsonComobodityIndex;
    }
    
    public void setCharlsonComobodityIndex(int CharlsonComobodityIndex) {
        this.CharlsonComobodityIndex = CharlsonComobodityIndex;
    }
    public int getBarthelIndex() {
        return this.BarthelIndex;
    }
    
    public void setBarthelIndex(int BarthelIndex) {
        this.BarthelIndex = BarthelIndex;
    }
    public int getLawtonIndex() {
        return this.LawtonIndex;
    }
    
    public void setLawtonIndex(int LawtonIndex) {
        this.LawtonIndex = LawtonIndex;
    }
    public int getMMSE() {
        return this.MMSE;
    }
    
    public void setMMSE(int MMSE) {
        this.MMSE = MMSE;
    }
    public int getMDRS() {
        return this.MDRS;
    }
    
    public void setMDRS(int MDRS) {
        this.MDRS = MDRS;
    }
    public BigDecimal getBlessedScalePart1() {
        return this.BlessedScalePart1;
    }
    
    public void setBlessedScalePart1(BigDecimal BlessedScalePart1) {
        this.BlessedScalePart1 = BlessedScalePart1;
    }
    public int getBlessedScalePart2() {
        return this.BlessedScalePart2;
    }
    
    public void setBlessedScalePart2(int BlessedScalePart2) {
        this.BlessedScalePart2 = BlessedScalePart2;
    }
    public int getBlessedScalePart3() {
        return this.BlessedScalePart3;
    }
    
    public void setBlessedScalePart3(int BlessedScalePart3) {
        this.BlessedScalePart3 = BlessedScalePart3;
    }
    public int getChecklistMBPC() {
        return this.ChecklistMBPC;
    }
    
    public void setChecklistMBPC(int ChecklistMBPC) {
        this.ChecklistMBPC = ChecklistMBPC;
    }
    public int getNPQISeverity() {
        return this.NPQISeverity;
    }
    
    public void setNPQISeverity(int NPQISeverity) {
        this.NPQISeverity = NPQISeverity;
    }
    public int getNPQIStress() {
        return this.NPQIStress;
    }
    
    public void setNPQIStress(int NPQIStress) {
        this.NPQIStress = NPQIStress;
    }
    public int getGDS() {
        return this.GDS;
    }
    
    public void setGDS(int GDS) {
        this.GDS = GDS;
    }
    public boolean isFalls() {
        return this.Falls;
    }
    
    public void setFalls(boolean Falls) {
        this.Falls = Falls;
    }
    public boolean isIncontinence() {
        return this.Incontinence;
    }
    
    public void setIncontinence(boolean Incontinence) {
        this.Incontinence = Incontinence;
    }
    public boolean isDelirium() {
        return this.Delirium;
    }
    
    public void setDelirium(boolean Delirium) {
        this.Delirium = Delirium;
    }
    public boolean isImmobility() {
        return this.Immobility;
    }
    
    public void setImmobility(boolean Immobility) {
        this.Immobility = Immobility;
    }
    public boolean isSensorialDeficits() {
        return this.SensorialDeficits;
    }
    
    public void setSensorialDeficits(boolean SensorialDeficits) {
        this.SensorialDeficits = SensorialDeficits;
    }
    public String getPharmacologyTreatment() {
        return this.PharmacologyTreatment;
    }
    
    public void setPharmacologyTreatment(String PharmacologyTreatment) {
        this.PharmacologyTreatment = PharmacologyTreatment;
    }
    public Patient getM_Patient() {
        return this.m_Patient;
    }
    
    public void setM_Patient(Patient m_Patient) {
        this.m_Patient = m_Patient;
    }
    public AetologyT getM_AetologyT() {
        return this.m_AetologyT;
    }
    
    public void setM_AetologyT(AetologyT m_AetologyT) {
        this.m_AetologyT = m_AetologyT;
    }
    public Set getMeasurments() {
        return this.Measurments;
    }
    
    public void setMeasurments(Set Measurments) {
        this.Measurments = Measurments;
    }




}


