package eu.aladdin_project.controllers.details.assessment;

import java.text.SimpleDateFormat;

import eu.aladdin_project.xsd.PatientAssessment;

/**
 * This class is just a front end for the PatientAssessment class. It is needed
 * to show the information in a proper way.
 * This customization was not developed on top of the original class due to the 
 * often WSDL/XSD updates.
 *  
 * @author Xavi Sarda (Atos Origin)
 */
public class AssessmentInfo {
	
	private PatientAssessment assessment;
	private String dateOfAssessment;
	
	/**
	 * This constructor saves the PatientAssessment and generates a human readable
	 * string for the dateOfAssessment attribute.
	 * @param assessment PatientAssessment to be saved
	 */
	public AssessmentInfo(PatientAssessment assessment){
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
		this.assessment = assessment;
		this.dateOfAssessment = sdf.format(assessment.getDateOfAssessment().getTime());
	}
	
	public void setAssessment(PatientAssessment assessment) {
		this.assessment = assessment;
	}
	public void setDateOfAssessment(String dateOfAssessment) {
		this.dateOfAssessment = dateOfAssessment;
	}
	public PatientAssessment getAssessment() {
		return assessment;
	}
	public String getDateOfAssessment() {
		return dateOfAssessment;
	}
    public java.lang.String getID() {
        return this.assessment.getID();
    }
    public java.lang.String getPatientID() {
        return this.assessment.getPatientID();
    }
    public eu.aladdin_project.xsd.SystemParameter getAetology() {
        return this.assessment.getAetology();
    }
    public org.apache.axis.types.UnsignedByte getTimeEllapsedSinceDiagnosed() {
        return this.assessment.getTimeEllapsedSinceDiagnosed();
    }
    public org.apache.axis.types.UnsignedByte getSeverity() {
        return this.assessment.getSeverity();
    }
    public java.lang.String getRelevantPathologyAntecedents() {
        return this.assessment.getRelevantPathologyAntecedents();
    }
    public java.lang.String getComorbidity() {
        return this.assessment.getComorbidity();
    }
    public org.apache.axis.types.UnsignedByte getCharlsonComorbidityIndex() {
        return this.assessment.getCharlsonComorbidityIndex();
    }
    public org.apache.axis.types.UnsignedByte getBarthelIndex() {
        return this.assessment.getBarthelIndex();
    }
    public org.apache.axis.types.UnsignedByte getLawtonIndex() {
        return this.assessment.getLawtonIndex();
    }
    public org.apache.axis.types.UnsignedByte getMMSE() {
        return this.assessment.getMMSE();
    }
    public org.apache.axis.types.UnsignedByte getMDRS() {
        return this.assessment.getMDRS();
    }
    public java.lang.Double getBlessedScalePart1() {
        return this.assessment.getBlessedScalePart1();
    }
    public org.apache.axis.types.UnsignedByte getBlessedScalePart2() {
        return this.assessment.getBlessedScalePart2();
    }
    public org.apache.axis.types.UnsignedByte getBlessedScalePart3() {
        return this.assessment.getBlessedScalePart3();
    }
    public org.apache.axis.types.UnsignedByte getChecklistMBP() {
        return this.assessment.getChecklistMBP();
    }
    public org.apache.axis.types.UnsignedByte getNPQI_Severity() {
        return this.assessment.getNPQI_Severity();
    }
    public org.apache.axis.types.UnsignedByte getNPQI_Stress() {
        return this.assessment.getNPQI_Stress();
    }
    public org.apache.axis.types.UnsignedByte getGDS() {
        return this.assessment.getGDS();
    }
    public java.lang.Boolean getFalls() {
        return this.assessment.getFalls();
    }
    public java.lang.Boolean getIncontinence() {
        return this.assessment.getIncontinence();
    }
    public java.lang.Boolean getDelirium() {
        return this.assessment.getDelirium();
    }
    public java.lang.Boolean getImmobility() {
        return this.assessment.getImmobility();
    }
    public java.lang.Boolean getSensorialDeficits() {
        return this.assessment.getSensorialDeficits();
    }
    public java.lang.String getPharmacologicalTreatment() {
        return this.assessment.getPharmacologicalTreatment();
    }
    public eu.aladdin_project.xsd.Measurement[] getClinicalData() {
        return this.assessment.getClinicalData();
    }
    public eu.aladdin_project.xsd.Measurement getClinicalData(int i) {
        return this.assessment.getClinicalData(i);
    }

}
