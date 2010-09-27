package eu.aladdin_project.controllers.warnings;

import java.util.Calendar;
import java.util.GregorianCalendar;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.Warning;

public class WarningInfo {
	private String ID;
	private String type;
	private String date;
	private String effect;
	private String indicator;
	private String riskLevel;
	private String justification;
	private String emergencyLevel;
	private String patientID;
	private String delivered;
	
	
	public WarningInfo(String iD, String type, String date, String effect, String indicator, String riskLevel, String justification, String emergencyLevel, String patientID, String delivered) {
		ID = iD;
		this.type = type;
		this.date = date;
		this.effect = effect;
		this.indicator = indicator;
		this.riskLevel = riskLevel;
		this.justification = justification;
		this.emergencyLevel = emergencyLevel;
		this.patientID = patientID;
		this.delivered = delivered;
	}
	
	public WarningInfo(Warning input){
		SystemParameter aux1 = input.getTypeOfWarning();
		SystemParameter aux2 = input.getEffect();
		SystemParameter aux3 = input.getIndicator();
		SystemParameter aux4 = input.getRiskLevel();
		SystemParameter aux5 = input.getEmergencyLevel();
		
		this.ID = input.getID(); 
		this.type = SystemDictionary.getWarningTypeLabel(aux1.getCode());
		Calendar cal = input.getDateTimeOfWarning();
		this.date = cal.get(Calendar.DAY_OF_MONTH) +"/"+ cal.get(Calendar.MONTH) +"/"+ cal.get(Calendar.YEAR) +" "+ cal.get(Calendar.HOUR_OF_DAY) +":"+ cal.get(Calendar.MINUTE);  
		this.effect = SystemDictionary.getWarningEffectLabel(aux2.getCode()); 
		this.indicator = SystemDictionary.getWarningIndicatorLabel(aux3.getCode());  
		this.riskLevel = SystemDictionary.getWarningRiskLevel(aux4.getCode());  
		this.justification = input.getJustificationText();
		this.emergencyLevel = SystemDictionary.getWarningEmergencyLevelLabel(aux5.getCode()); 
		this.patientID = input.getPatientID();
		this.delivered = new Boolean(input.isDelivered()).toString();
		
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}
	public String getEmergencyLevel() {
		return emergencyLevel;
	}
	public void setEmergencyLevel(String emergencyLevel) {
		this.emergencyLevel = emergencyLevel;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getDelivered() {
		return delivered;
	}
	public void setDelivered(String delivered) {
		this.delivered = delivered;
	}
	
}
