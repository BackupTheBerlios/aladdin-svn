package com.aladdin.raac;

import java.io.File;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

import eu.aladdin_project.storagecomponent.AuthDocument;
import eu.aladdin_project.storagecomponent.AuthDocument.Auth;
import eu.aladdin_project.storagecomponent.AuthResponseDocument;
import eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement;
import eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning;
import eu.aladdin_project.storagecomponent.SaveWarningDocument;
import eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument;
import eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument;
import eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse;
import eu.aladdin_project.xsd.Measurement;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.SystemParameter;

import eu.aladdin_project.xsd.Warning;

import org.apache.axis2.AxisFault;
import org.example.rulemap.*;

import com.aladdin.sc.StorageComponentStub;

public class RaacSkeleton implements RaacSkeletonInterface{
	
	static final int Weight = 2;
	static final int SystolicBloodPressure = 11;
	static final int DiastolicBloodPressure = 12;
	
	static final int LessThanRuleType = 1; 
	static final int DoubleCompareRuleType = 2;
	static final int GreaterThanRuleType = 3;

	public AnalyzeMeasurementsResponseDocument analyzeMeasurements (AnalyzeMeasurementsDocument req) {
		AnalyzeMeasurementsResponseDocument respdoc = AnalyzeMeasurementsResponseDocument.Factory.newInstance();
		AnalyzeMeasurementsResponse resp = respdoc.addNewAnalyzeMeasurementsResponse();
		
		System.out.println("analyzeMeasurements called");
		
		Warning generatedWarning = null;
		
		System.out.println("create stub");
		StorageComponentStub sc;
		try {
			sc = new StorageComponentStub();
		} catch (AxisFault e1) {
			System.out.println("ex1");
			e1.printStackTrace();
			return respdoc;
		}
		System.out.println("auth");
		AuthDocument authdoc = AuthDocument.Factory.newInstance();
		System.out.println("auth1");
		Auth auth = Auth.Factory.newInstance();
		System.out.println("auth2");
		auth.setLogin("raac");
		System.out.println("auth3");
		auth.setPassword("raac");
		System.out.println("auth4");
		authdoc.setAuth(auth);
		System.out.println("auth5");
		AuthResponseDocument res;
		System.out.println("auth6");
		try {
			System.out.println("auth7");
			res = sc.auth(authdoc);
			System.out.println("auth8");
		} catch (RemoteException e1) {
			System.out.println("auth9");
			System.out.println("ex2");
			System.out.println("auth10");
			e1.printStackTrace();
			System.out.println("auth11");
			return respdoc;
		}
		System.out.println("out1");
		final AuthResponse authResponse = res.getAuthResponse();
		System.out.println("out2");
		final OperationResult out = authResponse.getOut();
		System.out.println("out3");
		String UserID = out.getCode();
		System.out.println("out4");
		System.out.println("UserID " + UserID);
		
		if (UserID.compareTo("-1") != 0) {
			
			System.out.println("out5");
			Measurement measurement = req.getAnalyzeMeasurements().getIn();
			System.out.println("out6");
			String PatientID = req.getAnalyzeMeasurements().getPatientID();
			System.out.println("out7");
			
			List<RuleMap> DefinedRules = GetRules();
			System.out.println("out8");
			String measurementType = "";
			System.out.println("out9");
			String measurementDescription = "";
			System.out.println("out10");
			
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
				return respdoc;
			
			switch (currentRule.getCallerID())
			{
			case LessThanRuleType: 
				ArrayList<Measurement> SortedMeasurements = new ArrayList<Measurement>();
				GregorianCalendar currentDate = (GregorianCalendar) GregorianCalendar.getInstance();
				currentDate.add(Calendar.DATE, -1);
				GregorianCalendar oneWeekBefore = (GregorianCalendar) GregorianCalendar.getInstance();
				oneWeekBefore.add(Calendar.DATE	, -8);
				
				GetPatientMeasurementDocument getPatientMeasurement = GetPatientMeasurementDocument.Factory.newInstance();
				GetPatientMeasurement gpa = getPatientMeasurement.addNewGetPatientMeasurement();
				gpa.setPatientId(PatientID);
				gpa.setUserId(UserID);
				gpa.setFromData(oneWeekBefore);
				gpa.setToData(currentDate);
				gpa.setMeasurementType(Integer.valueOf(measurement.getType().getCode()));
				
				Measurement[] measurements = null;
				try {
					measurements = sc.getPatientMeasurement(getPatientMeasurement).getGetPatientMeasurementResponse().getOutArray();
				} catch (RemoteException e) {
					System.out.println("ex3");
					e.printStackTrace();
				}
				
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
			default:
				return respdoc;
//			case GreaterThanRuleType:
//				generatedWarning = GreaterThanRule(PatientID, measurementDescription, measurement.getValue(), currentRule.getUpperLimit(), currentRule.getLowerLimit());
//				break;
			}
			
			SaveWarningDocument swd = SaveWarningDocument.Factory.newInstance();
			SaveWarning sw = swd.addNewSaveWarning();
			sw.setWarn(generatedWarning);
			sw.setUserId(UserID);
			try {
				sc.saveWarning(swd);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			resp.setOut(generatedWarning);
		}
		
		return respdoc;
    }
	
	// Create Comparator for Sorting dates
	static final Comparator<Measurement> Date_Order = new Comparator<Measurement>() {
		public int compare(Measurement a, Measurement b) {
			return a.getDateTime().compareTo(b.getDateTime());
		}

	};
	
	// Get Ruleset from XML
	@SuppressWarnings("unchecked")
	private List<RuleMap> GetRules() {
		System.out.println("getrules 1");
		List<RuleMap> DefinedRules = null;
		System.out.println("getrules 2");

		try {
			System.out.println("getrules 3");
			JAXBContext jc = JAXBContext.newInstance(org.example.rulemap.ObjectFactory.class);
			System.out.println("getrules 4");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			System.out.println("getrules 5");
			unmarshaller.setEventHandler(new DefaultValidationEventHandler());
			System.out.println("getrules 6");

			DefinedRules = (List<RuleMap>) ((JAXBElement<Ruleset>) unmarshaller.unmarshal(new File("/var/lib/tomcat6/webapps/axis2/WEB-INF/rules.xml"))).getValue().getRule();
			System.out.println("getrules 7");
		} catch (JAXBException e) {
			System.out.println("getrules 8");
			e.printStackTrace();
			System.out.println("getrules 8");
		}
		System.out.println("getrules 10");
		return DefinedRules;
	}
	
	// Rule 1 - Less Than rule
	static Warning LessThanRule(String PatientID, String description,
			double Current, double Previous, double Threshold)
			 {
		Warning warning;
		if (Current <= Previous - Threshold) 
			warning = GenerateWarning(PatientID, description, Current, Previous);
		else
			warning = null;
		return warning;
	}

	// Rule 2 - Double Comparison Rule
	static Warning DoubleCompareRule(String PatientID, String description,
			double Current, double Upper, double Lower) {
		Warning warning;
		if ((Current > Upper || Current < Lower)) 
			warning = GenerateWarning(PatientID, description, Current, 0.0);
		else
			warning = null;
		return warning;
	}

	// Rule 3 - Greater Than Rule()
	static Warning GreaterThanRule(String PatientID, String description,
			double Current, double Previous, double Threshold) {
		Warning warning;

		if (Current > Previous + Threshold)
				warning = GenerateWarning(PatientID, description, Current, Previous);
		else	
			warning = null;
		return warning;
	}

	// Generate Warning
	static Warning GenerateWarning(String PatientID, String description, double RiskValue, double PreviousValue) {

		Warning warning = Warning.Factory.newInstance(); 
		warning.setPatientID(PatientID);
		SystemParameter typeOfWarning = SystemParameter.Factory.newInstance();
		typeOfWarning.setCode("2");
		typeOfWarning.setDescription("autogenerated");
		warning.setTypeOfWarning(typeOfWarning);
		warning.setDateTimeOfWarning(Calendar.getInstance());
		warning.setJustificationText(String.format("type = %s current value = %s, previous value = %s", description, RiskValue, PreviousValue));

		return warning;

	}
}
    