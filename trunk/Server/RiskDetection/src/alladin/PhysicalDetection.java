package alladin;

import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import eu.aladdin_project.xsd.*;

import org.example.rulemap.*;

public class PhysicalDetection {

	String DataType;
	double CurrentValue;
	double PreviousValue;
	String PatientID;

	public String getDataType() {
		return DataType;
	}

	public void setDataType(String dataType) {
		DataType = dataType;
	}

	public Double getCurrentValue() {
		return CurrentValue;
	}

	public void setCurrentValue(Double currentValue) {
		CurrentValue = currentValue;
	}

	public Double getPreviousValue() {
		return PreviousValue;
	}

	public void setPreviousValue(Double previousValue) {
		PreviousValue = previousValue;
	}

	public String getPatientID() {
		return PatientID;
	}

	public void setPatientID(String patientID) {
		PatientID = patientID;
	}

	static final int Weight = 2;
	static final int SystolicBloodPressure = 11;
	static final int DiastolicBloodPressure = 12;
	
	static final int LessThanRuleType = 1; 
	static final int DoubleCompareRuleType = 2;
	static final int GreaterThanRuleType = 3;

	public static eu.aladdin_project.xsd.Warning AnalyzeMeasurements(String PatientID, Measurement measurement) throws NumberFormatException, RemoteException, FileNotFoundException {
		
		
		// Authenticate RAAC component
		eu.aladdin_project.StorageComponent.StorageComponentProxy sc = new eu.aladdin_project.StorageComponent.StorageComponentProxy();
		OperationResult res = sc.auth("raac", "raac");
		String UserID = res.getCode();
		
		eu.aladdin_project.xsd.Warning generatedWarning = null;

		List<RuleMap> DefinedRules = GetRules();
		String measurementType = "";
		String measurementDescription = "";
		// Decide Which Rule to Use for the Measurement Received
		boolean found = false;
		RuleMap currentRule = null;
		for (int count = 0; count < DefinedRules.size(); count++) {
			if (found)
				break;
			measurementType = measurement.getType().getCode();
			measurementDescription = measurement.getType().getDescription();
			String ruleDataType = DefinedRules.get(count).getDataType();
			if (measurementType.equals(ruleDataType))
			{
				currentRule = DefinedRules.get(count);
				break;
			}
		}
		
		if (currentRule == null) // Rule not found
			return null;

		switch (currentRule.getCallerID())
		{
		case LessThanRuleType: 
			ArrayList<Measurement> SortedMeasurements = new ArrayList<Measurement>();
			GregorianCalendar currentDate = (GregorianCalendar) GregorianCalendar.getInstance();
			currentDate.add(Calendar.DATE, -1);
			GregorianCalendar oneWeekBefore = (GregorianCalendar) GregorianCalendar.getInstance();
			oneWeekBefore.add(Calendar.DATE	, -8);
			Measurement[] measurements = sc.getPatientMeasurement(PatientID, Integer.valueOf(measurement.getType().getCode()), oneWeekBefore, currentDate, UserID);
		    SortedMeasurements = new ArrayList<Measurement>(Arrays.asList(measurements));
			if (SortedMeasurements.size() < 1)
				return null;
			Collections.sort(SortedMeasurements, Date_Order);
			Measurement[] Sorted = SortedMeasurements
					.toArray(new Measurement[SortedMeasurements.size()]);
			generatedWarning = LessThanRule(PatientID, measurementDescription , measurement.getValue(), Sorted[0].getValue(), currentRule.getUpperLimit());
			break;
		case DoubleCompareRuleType:
			generatedWarning = DoubleCompareRule(PatientID, measurementDescription, measurement.getValue(), currentRule.getUpperLimit(), currentRule.getLowerLimit());
			break;
//		case GreaterThanRuleType:
//			generatedWarning = GreaterThanRule(PatientID, measurementDescription, measurement.getValue(), currentRule.getUpperLimit(), currentRule.getLowerLimit());
//			break;
		}
		
		//sc.saveWarning(generatedWarning, UserID);
		
		return generatedWarning;
	}

	

	public static void main(String[] args) throws FileNotFoundException, NumberFormatException, RemoteException {

		//String[] clinicalWarnings = Detect(getMeasurements());
//		Measurement weightM = new Measurement();
//		weightM.setType(new SystemParameter("2", "weight"));
//		weightM.setValue(52.6);
		
//		Measurement sys = new Measurement();
//		sys.setType(new SystemParameter(String.valueOf(SystolicBloodPressure), "SystolicBloodPressure"));
//		sys.setValue(151);
		
		Measurement sys = new Measurement();
		sys.setType(new SystemParameter(String.valueOf(DiastolicBloodPressure), "DiastolicBloodPressure"));
		sys.setValue(90.1);

		
		//Measurement[] test = getMeasurements();
		eu.aladdin_project.xsd.Warning warning = AnalyzeMeasurements("11", sys);
		if (warning != null)
			System.out.printf("%s", warning.getJustificationText()); 
		

	}

	// Create Comparator for Sorting dates
	static final Comparator<Measurement> Date_Order = new Comparator<Measurement>() {
		public int compare(Measurement a, Measurement b) {
			return a.getDateTime().compareTo(b.getDateTime());
		}

	};

	// Get Ruleset from XML
	public static List<RuleMap> GetRules() {
		List<RuleMap> DefinedRules = null;

		try {
			JAXBContext jc = JAXBContext.newInstance("org.example.rulemap");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			unmarshaller.setEventHandler(new DefaultValidationEventHandler());

			DefinedRules = (List<RuleMap>) ((JAXBElement<Ruleset>) unmarshaller
					.unmarshal(new File("xml/rules.xml"))).getValue().getRule();

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DefinedRules;
	}

	// Rule 1 - Less Than rule
	public static eu.aladdin_project.xsd.Warning LessThanRule(String PatientID, String description,
			double Current, double Previous, double Threshold)
			throws FileNotFoundException {
		eu.aladdin_project.xsd.Warning Warning;
		if (Current <= Previous - Threshold) 
			Warning = GenerateWarning(PatientID, description, Current, Previous);
		else
			Warning = null;
		return Warning;
	}

	// Rule 2 - Double Comparison Rule
	public static eu.aladdin_project.xsd.Warning DoubleCompareRule(String PatientID, String description,
			double Current, double Upper, double Lower) {
		eu.aladdin_project.xsd.Warning Warning;
		if ((Current > Upper || Current < Lower)) 
			Warning = GenerateWarning(PatientID, description, Current, 0.0);
		else
			Warning = null;
		return Warning;
	}

	// Rule 3 - Greater Than Rule()
	public static eu.aladdin_project.xsd.Warning GreaterThanRule(String PatientID, String description,
			double Current, double Previous, double Threshold) {
		eu.aladdin_project.xsd.Warning Warning;

		if (Current > Previous + Threshold)
				Warning = GenerateWarning(PatientID, description, Current, Previous);
		else	
			Warning = null;
		return Warning;
	}

	// Generate Warning
	public static eu.aladdin_project.xsd.Warning GenerateWarning(String PatientID, String description,
			double RiskValue, double PreviousValue) {

		eu.aladdin_project.xsd.Warning warning = new eu.aladdin_project.xsd.Warning(); 
		warning.setPatientID(PatientID);
		warning.setTypeOfWarning(new SystemParameter("2", "autogenerated"));
		warning.setDateTimeOfWarning(Calendar.getInstance());
		warning.setJustificationText(String.format("type = %s current value = %s, previous value = %s", description, RiskValue, PreviousValue));

		return warning;

	}

}
