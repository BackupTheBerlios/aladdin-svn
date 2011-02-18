package com.aladdin.raac;

import java.io.File;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
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
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersDocument;
import eu.aladdin_project.storagecomponent.AuthDocument.Auth;
import eu.aladdin_project.storagecomponent.AuthResponseDocument;
import eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse;
import eu.aladdin_project.storagecomponent.SaveWarningDocument.SaveWarning;
import eu.aladdin_project.storagecomponent.SaveWarningDocument;
import eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument;
import eu.aladdin_project.www.raac.AnalyzeMeasurementsDocument;
import eu.aladdin_project.www.raac.AnalyzeMeasurementsResponseDocument.AnalyzeMeasurementsResponse;
import eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument;
import eu.aladdin_project.www.raac.AnalyzeQuestionnairesDocument.AnalyzeQuestionnaires;
import eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument;
import eu.aladdin_project.www.raac.AnalyzeQuestionnairesResponseDocument.AnalyzeQuestionnairesResponse;
import eu.aladdin_project.xsd.Measurement;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.QuestionnaireAnswer;
import eu.aladdin_project.xsd.QuestionnaireAnswers;
import eu.aladdin_project.xsd.SystemParameter;

import eu.aladdin_project.xsd.Warning;

import org.apache.axis2.AxisFault;
import org.example.rulemap.*;

import com.aladdin.sc.StorageComponentStub;

public class RaacSkeleton implements RaacSkeletonInterface {

	static final int Weight = 2;
	static final int SystolicBloodPressure = 11;
	static final int DiastolicBloodPressure = 12;

	static final int LessThanRuleType = 1;
	static final int DoubleCompareRuleType = 2;
	static final int GreaterThanRuleType = 3;

	QuestionnaireAnswer[] previousAnswerArray = null;
	
	public AnalyzeQuestionnairesResponseDocument analyzeQuestionnaires(
			AnalyzeQuestionnairesDocument req) {

		AnalyzeQuestionnairesResponseDocument respdoc = AnalyzeQuestionnairesResponseDocument.Factory
				.newInstance();
		AnalyzeQuestionnairesResponse resp = respdoc
				.addNewAnalyzeQuestionnairesResponse();
		
		AnalyzeQuestionnaires analyzeQuestionnairesIn = req
				.getAnalyzeQuestionnaires();
		if (analyzeQuestionnairesIn == null)
			return respdoc;
		
		String PatientID = analyzeQuestionnairesIn.getPatientID();

		QuestionnaireAnswer[] currentAnswerArray = analyzeQuestionnairesIn
				.getAnswersArray();
		if (currentAnswerArray.length == 0)
			return respdoc;

		Warning generatedWarning = null;

		StorageComponentStub sc;
		try {
			sc = new StorageComponentStub();
		} catch (AxisFault e1) {
			e1.printStackTrace();
			return respdoc;
		}
	
		AuthDocument authdoc = AuthDocument.Factory.newInstance();
		Auth auth = Auth.Factory.newInstance();
		auth.setLogin("raac");
		auth.setPassword("raac");
		authdoc.setAuth(auth);
		AuthResponseDocument res;
		try {
			res = sc.auth(authdoc);
		} catch (RemoteException e1) {
			e1.printStackTrace();
			return respdoc;
		}

		final AuthResponse authResponse = res.getAuthResponse();
		final OperationResult out = authResponse.getOut();
		String UserID = out.getCode();

		if (UserID == "-1")
			return respdoc;

		String DATE_FORMAT = "yyyy-MM-dd";
	    SimpleDateFormat sdf =
	          new SimpleDateFormat(DATE_FORMAT);
		
		// get all questionnaire answers
		GregorianCalendar currentDate = (GregorianCalendar) GregorianCalendar
				.getInstance();
		//currentDate.add(Calendar.DATE, 0);
		GregorianCalendar twoMonthsBefore = (GregorianCalendar) GregorianCalendar
				.getInstance();
		twoMonthsBefore.add(Calendar.DATE, -60);

		GetQuestionnaireAnswersDocument qDocument = GetQuestionnaireAnswersDocument.Factory
				.newInstance();
		
		GetQuestionnaireAnswers getQuestionnaireAnswers = GetQuestionnaireAnswers.Factory.newInstance();
		getQuestionnaireAnswers.setFromDate(twoMonthsBefore);
		getQuestionnaireAnswers.setToDate(currentDate);
		getQuestionnaireAnswers.setObjectId(PatientID);
		getQuestionnaireAnswers.setUserId(UserID);
		
		qDocument.addNewGetQuestionnaireAnswers();
		qDocument.setGetQuestionnaireAnswers(getQuestionnaireAnswers);
		
//		System.out.println(PatientID);
//		System.out.println(UserID);
//		System.out.println(sdf.format(twoMonthsBefore.getTime()));
//		System.out.println(sdf.format(currentDate.getTime()));
		
		GetQuestionnaireAnswersResponseDocument qResponseDocument = null;

		try {
			qResponseDocument = sc.getQuestionnaireAnswers(qDocument);
			if (qResponseDocument == null)
				return respdoc;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		GetQuestionnaireAnswersResponse gQuestAnsResp = qResponseDocument
				.getGetQuestionnaireAnswersResponse();
		QuestionnaireAnswers[] qanswers = gQuestAnsResp.getOutArray();
		if (qanswers.length == 0)
			return respdoc;

		ArrayList<QuestionnaireAnswers> SortedAnswers = new ArrayList<QuestionnaireAnswers>(
				Arrays.asList(qanswers));
		Collections.sort(SortedAnswers, QDate_Order);

		QuestionnaireAnswers previousQuestionnaireAnswers = SortedAnswers
				.get(SortedAnswers.size() - 1);
		previousAnswerArray = previousQuestionnaireAnswers.getAnswerArray();
		// currentAnswerArray
		List<RuleMap> DefinedRules = GetRules();
		RuleMap currentRule = null;

		for (int k = 0; k < currentAnswerArray.length; k++) {

			QuestionnaireAnswer currentAnswer = currentAnswerArray[k];
			QuestionnaireAnswer previousAnswer = getPreviousQuestionnaireAnswer(currentAnswer
					.getQuestionID());
			
			// For non-existant answers, create a new answer with "Never"
			if (previousAnswer == null) {
				QuestionnaireAnswer neverAnswer = QuestionnaireAnswer.Factory.newInstance();
				neverAnswer.setQuestionID(currentAnswer.getQuestionID());
				neverAnswer.setGlobalID(currentAnswer.getGlobalID());
				neverAnswer.setValue("0");
				previousAnswer = neverAnswer;
			}
			
			String currentValueStr = currentAnswer.getValue();
			String previousValueStr = previousAnswer.getValue();
			if ("9".equals(currentValueStr) || "9".equals(previousValueStr))
				continue;
			
			double currentValue;
			double previousValue;
			
			try {
				currentValue  = Double.valueOf(currentValueStr);
				previousValue = Double.valueOf(previousValueStr);
			}
			catch (Exception ex) {
				continue;
			}

			for (int count = 0; count < DefinedRules.size(); count++) {
				
				String globaID = currentAnswer.getGlobalID();
				
				if (globaID == null || "".equals(globaID))
					continue;
				
				int globalIDasInteger = Integer.valueOf(globaID);
				if (globalIDasInteger < 1000)
					continue;
				
				String globalIDGroup = getglobalIDGroup(globaID);
				if (globalIDGroup == null) continue;
				
				String ruleDataType = DefinedRules.get(count).getDataType();
				if (globalIDGroup.equals(ruleDataType)) {
					currentRule = DefinedRules.get(count);
					break;
				}
			}

			if (currentRule == null) // Rule not found
				return respdoc;
			
			String description = String.format("Question {0}", currentAnswer.getQuestionID());
			
			switch (currentRule.getCallerID()) {
				case GreaterThanRuleType:
					generatedWarning = GreaterThanRule(PatientID, description,
							currentValue, previousValue, currentRule.getLowerLimit());
					break;
				case LessThanRuleType:
					generatedWarning = LessThanRule(PatientID, description,
							currentValue, previousValue, currentRule.getLowerLimit());
					break;
			}
			
			if (generatedWarning != null) {

				SaveWarningDocument swd = SaveWarningDocument.Factory
						.newInstance();
				SaveWarning sw = swd.addNewSaveWarning();
				sw.setWarn(generatedWarning);
				sw.setUserId(UserID);
				try {
					sc.saveWarning(swd);
					System.out.printf("%s", generatedWarning.getJustificationText());

				} catch (RemoteException e) {
					e.printStackTrace();
				}
			}
			resp.setOut(generatedWarning);
		}


		return null;
	}

	// returns the Global ID group (e.g. 1000, 2000, 3000 etc) based on GlobalID
	String getglobalIDGroup(String globalID) {

		try {
			int globalIDInt = Integer.valueOf(globalID);
			double res = java.lang.Math.floor(globalIDInt / 1000) * 1000;
			return String.valueOf(res);
		} catch (Exception ex) {
			return null;
		}

	}

	QuestionnaireAnswer getPreviousQuestionnaireAnswer(String QuestionID) {

		for (int i = 0; i < previousAnswerArray.length; i++) {
			if (previousAnswerArray[i].getQuestionID().equals(QuestionID))
				return previousAnswerArray[i];
		}
		return null;
	}

	// Create Comparator for Sorting questionnaires
	static final Comparator<QuestionnaireAnswers> QDate_Order = new Comparator<QuestionnaireAnswers>() {
		public int compare(QuestionnaireAnswers a, QuestionnaireAnswers b) {
			return a.getDateTime().compareTo(b.getDateTime());
		}
	};

	public AnalyzeMeasurementsResponseDocument analyzeMeasurements(
			AnalyzeMeasurementsDocument req) {
		AnalyzeMeasurementsResponseDocument respdoc = AnalyzeMeasurementsResponseDocument.Factory
				.newInstance();
		AnalyzeMeasurementsResponse resp = respdoc
				.addNewAnalyzeMeasurementsResponse();

		Warning generatedWarning = null;

		StorageComponentStub sc;
		try {
			sc = new StorageComponentStub();
		} catch (AxisFault e1) {
			e1.printStackTrace();
			return respdoc;
		}

		AuthDocument authdoc = AuthDocument.Factory.newInstance();
		Auth auth = Auth.Factory.newInstance();
		auth.setLogin("raac");
		auth.setPassword("raac");
		authdoc.setAuth(auth);
		AuthResponseDocument res;
		try {
			res = sc.auth(authdoc);
		} catch (RemoteException e1) {
			e1.printStackTrace();
			return respdoc;
		}

		final AuthResponse authResponse = res.getAuthResponse();
		final OperationResult out = authResponse.getOut();
		String UserID = out.getCode();

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

			RuleMap currentRule = null;
			for (int count = 0; count < DefinedRules.size(); count++) {
				measurementType = measurement.getType().getCode();
				measurementDescription = measurement.getType().getDescription();
				String ruleDataType = DefinedRules.get(count).getDataType();
				if (measurementType.equals(ruleDataType)) {
					currentRule = DefinedRules.get(count);
					break;
				}
			}

			if (currentRule == null) // Rule not found
				return respdoc;

			switch (currentRule.getCallerID()) {
			case LessThanRuleType:
				ArrayList<Measurement> SortedMeasurements = new ArrayList<Measurement>();
				GregorianCalendar currentDate = (GregorianCalendar) GregorianCalendar
						.getInstance();
				currentDate.add(Calendar.DATE, -1);
				GregorianCalendar oneWeekBefore = (GregorianCalendar) GregorianCalendar
						.getInstance();
				oneWeekBefore.add(Calendar.DATE, -8);

				GetPatientMeasurementDocument getPatientMeasurement = GetPatientMeasurementDocument.Factory
						.newInstance();
				GetPatientMeasurement gpa = getPatientMeasurement
						.addNewGetPatientMeasurement();
				gpa.setPatientId(PatientID);
				gpa.setUserId(UserID);
				gpa.setFromData(oneWeekBefore);
				gpa.setToData(currentDate);
				gpa.setMeasurementType(Integer.valueOf(measurement.getType()
						.getCode()));

				Measurement[] measurements = null;
				try {
					measurements = sc
							.getPatientMeasurement(getPatientMeasurement)
							.getGetPatientMeasurementResponse().getOutArray();
				} catch (RemoteException e) {
					System.out.println("ex3");
					e.printStackTrace();
				}

				SortedMeasurements = new ArrayList<Measurement>(
						Arrays.asList(measurements));
				if (SortedMeasurements.size() < 1)
					return respdoc;
				Collections.sort(SortedMeasurements, Date_Order);
				Measurement[] Sorted = SortedMeasurements
						.toArray(new Measurement[SortedMeasurements.size()]);
				generatedWarning = LessThanRule(PatientID,
						measurementDescription, measurement.getValue(),
						Sorted[0].getValue(), currentRule.getUpperLimit());
				break;
			case DoubleCompareRuleType:
				generatedWarning = DoubleCompareRule(PatientID,
						measurementDescription, measurement.getValue(),
						currentRule.getUpperLimit(),
						currentRule.getLowerLimit());
				break;
			default:
				return respdoc;
				// case GreaterThanRuleType:
				// generatedWarning = GreaterThanRule(PatientID,
				// measurementDescription, measurement.getValue(),
				// currentRule.getUpperLimit(), currentRule.getLowerLimit());
				// break;
			}

			if (generatedWarning != null) {

				SaveWarningDocument swd = SaveWarningDocument.Factory
						.newInstance();
				SaveWarning sw = swd.addNewSaveWarning();
				sw.setWarn(generatedWarning);
				sw.setUserId(UserID);
				try {
					sc.saveWarning(swd);
				} catch (RemoteException e) {
					e.printStackTrace();
				}
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

		List<RuleMap> DefinedRules = null;

		try {
			JAXBContext jc = JAXBContext
					.newInstance(org.example.rulemap.ObjectFactory.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			unmarshaller.setEventHandler(new DefaultValidationEventHandler());

			// DefinedRules = (List<RuleMap>) ((JAXBElement<Ruleset>)
			// unmarshaller.unmarshal(new
			// File("/var/lib/tomcat6/webapps/axis2/WEB-INF/rules.xml"))).getValue().getRule();
			DefinedRules = (List<RuleMap>) ((JAXBElement<Ruleset>) unmarshaller
					.unmarshal(new File("rules.xml"))).getValue().getRule();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return DefinedRules;
	}

	// Rule 1 - Less Than rule
	static Warning LessThanRule(String PatientID, String description,
			double Current, double Previous, double Threshold) {
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

		if (Current >= Previous + Threshold)
			warning = GenerateWarning(PatientID, description, Current, Previous);
		else
			warning = null;
		return warning;
	}

	// Generate Warning
	static Warning GenerateWarning(String PatientID, String description,
			double RiskValue, double PreviousValue) {

		Warning warning = Warning.Factory.newInstance();
		warning.setPatientID(PatientID);
		SystemParameter typeOfWarning = SystemParameter.Factory.newInstance();
		typeOfWarning.setCode("2");
		typeOfWarning.setDescription("autogenerated");
		warning.setTypeOfWarning(typeOfWarning);
		warning.setDateTimeOfWarning(Calendar.getInstance());
		warning.setJustificationText(String.format(
				"type = %s current value = %s, previous value = %s",
				description, RiskValue, PreviousValue));

		return warning;

	}

}
