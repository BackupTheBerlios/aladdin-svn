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
import eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument;
import eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument.GetQuestionDescription;
import eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersDocument;
import eu.aladdin_project.storagecomponent.AuthDocument.Auth;
import eu.aladdin_project.storagecomponent.AuthResponseDocument;
import eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument.GetPatientMeasurement;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse;
import eu.aladdin_project.storagecomponent.GetUserDocument;
import eu.aladdin_project.storagecomponent.GetUserDocument.GetUser;
import eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument;
import eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument.GetUserIdByPersonId;
import eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument;
import eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse;
import eu.aladdin_project.storagecomponent.GetUserResponseDocument;
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
import eu.aladdin_project.xsd.User;

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
	
	static final int MeasurementAnalysis = 1;
	static final int QuestionnaireAnalysis = 2;
	
	

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
		
		String ObjectUserID = analyzeQuestionnairesIn.getUserID();
		String ObjectPersonID;

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
		
		GetUserDocument getUserDocument = GetUserDocument.Factory.newInstance();
		getUserDocument.addNewGetUser();
		GetUser getUser = GetUser.Factory.newInstance();
		getUser.setId(ObjectUserID);
		getUserDocument.setGetUser(getUser);
		GetUserResponseDocument getUserDocumentResponse = null;
		try {
			getUserDocumentResponse = sc.getUser(getUserDocument);
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		User user = getUserDocumentResponse.getGetUserResponse().getOut();
		ObjectPersonID = user.getPersonID();

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
		getQuestionnaireAnswers.setObjectId(ObjectUserID);
		getQuestionnaireAnswers.setUserId(UserID);
		
		qDocument.addNewGetQuestionnaireAnswers();
		qDocument.setGetQuestionnaireAnswers(getQuestionnaireAnswers);
		
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
			
			String globaID = currentAnswer.getGlobalID();
			
			if (globaID == null || "".equals(globaID))
				continue;
			
			int globalIDasInteger = Integer.valueOf(globaID);
			if (globalIDasInteger < 1000)
				continue;
			
			String globalIDGroup = getglobalIDGroup(globaID);
			if (globalIDGroup == null) continue;
			
			double globalIDGroupAsDouble = 0;

			for (int count = 0; count < DefinedRules.size(); count++) {

				String ruleDataType = DefinedRules.get(count).getDataType();
				double ruleDataTypeAsDouble = Double.valueOf(ruleDataType);
				globalIDGroupAsDouble = Double.valueOf(globalIDGroup);
				if (globalIDGroupAsDouble == ruleDataTypeAsDouble) {
					currentRule = DefinedRules.get(count);
					break;
				}
			}

			if (currentRule == null) // Rule not found
				return respdoc;
			
			GetQuestionDescriptionDocument getQuestionDescriptionDocument = GetQuestionDescriptionDocument.Factory.newInstance();
			GetQuestionDescription getQuestionDescription = GetQuestionDescription.Factory.newInstance();
			getQuestionDescription.setQuestionID(currentAnswer.getQuestionID());
			SystemParameter locale =  SystemParameter.Factory.newInstance();
			locale.setCode("en_UK");
			getQuestionDescription.setLocale(locale);
			getQuestionDescriptionDocument.addNewGetQuestionDescription();
			getQuestionDescriptionDocument.setGetQuestionDescription(getQuestionDescription);
			GetQuestionDescriptionResponseDocument getQuestionDescriptionResponseDocument = null;
			try {
				getQuestionDescriptionResponseDocument = sc.getQuestionDescription(getQuestionDescriptionDocument);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			OperationResult questionDescriptionResult = getQuestionDescriptionResponseDocument.getGetQuestionDescriptionResponse().getOut();
			String description = String.format("Question '%s' changed from '%s' to '%s'", questionDescriptionResult.getDescription().replaceAll("\n", ""), GetAnswerDescription(globalIDGroupAsDouble, previousValue), GetAnswerDescription(globalIDGroupAsDouble, currentValue));
			
			switch (currentRule.getCallerID()) {
				case GreaterThanRuleType:
					generatedWarning = GreaterThanRule(ObjectPersonID, description,
							currentValue, previousValue, currentRule.getLowerLimit(), QuestionnaireAnalysis);
					break;
				case LessThanRuleType:
					generatedWarning = LessThanRule(ObjectPersonID, description,
							currentValue, previousValue, currentRule.getLowerLimit(), QuestionnaireAnalysis);
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
					System.out.printf("%s\n", generatedWarning.getJustificationText());

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			resp.setOut(generatedWarning);
		}


		return null;
	}
	
	
	private String GetAnswerDescription(double globalIDGroupAsDouble, double value) {
		
		if (globalIDGroupAsDouble == 1000 || globalIDGroupAsDouble == 3000)
		{
			if (value == 0)
				return "YES";
			else if (value == 1)
				return "NO";
		}
		
		if (globalIDGroupAsDouble == 2000) {
			
			if (value == 0)
				return "Never";
			else if (value == 1)
				return "Happened but not in the last week";
			else if (value == 2)
				return "1 or 2 times in the last week";
			else if (value == 3)
				return "From 3 to 6 times in the last week";
			else if (value == 4)
				return "Everyday";
		}
		
		return "";
		
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

			Measurement measurement = req.getAnalyzeMeasurements().getIn();
			String PatientID = req.getAnalyzeMeasurements().getPatientID();
			List<RuleMap> DefinedRules = GetRules();
			String measurementType = "";
			String measurementDescription = "";

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
						Sorted[0].getValue(), currentRule.getUpperLimit(), MeasurementAnalysis);
				break;
			case DoubleCompareRuleType:
				generatedWarning = DoubleCompareRule(PatientID,
						measurementDescription, measurement.getValue(),
						currentRule.getUpperLimit(),
						currentRule.getLowerLimit(), MeasurementAnalysis);
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

			 DefinedRules = (List<RuleMap>) ((JAXBElement<Ruleset>)
			 unmarshaller.unmarshal(new
			 File("/var/lib/tomcat6/webapps/axis2/WEB-INF/rules.xml"))).getValue().getRule();
//			DefinedRules = (List<RuleMap>) ((JAXBElement<Ruleset>) unmarshaller
//					.unmarshal(new File("rules.xml"))).getValue().getRule();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return DefinedRules;
	}

	// Rule 1 - Less Than rule
	static Warning LessThanRule(String PatientID, String description,
			double Current, double Previous, double Threshold, int TypeOfAnalysis) {
		Warning warning;
		if (Current <= Previous - Threshold)
			warning = GenerateWarning(PatientID, description, Current, Previous, TypeOfAnalysis);
		else
			warning = null;
		return warning;
	}

	// Rule 2 - Double Comparison Rule
	static Warning DoubleCompareRule(String PatientID, String description,
			double Current, double Upper, double Lower, int TypeOfAnalysis) {
		Warning warning;
		if ((Current > Upper || Current < Lower))
			warning = GenerateWarning(PatientID, description, Current, 0.0, TypeOfAnalysis);
		else
			warning = null;
		return warning;
	}

	// Rule 3 - Greater Than Rule()
	static Warning GreaterThanRule(String PatientID, String description,
			double Current, double Previous, double Threshold, int TypeOfAnalysis) {
		Warning warning;

		if (Current >= Previous + Threshold)
			warning = GenerateWarning(PatientID, description, Current, Previous, TypeOfAnalysis);
		else
			warning = null;
		return warning;
	}

	// Generate Warning
	static Warning GenerateWarning(String PatientID, String description,
			double RiskValue, double PreviousValue, int TypeOfAnalysis) {

		Warning warning = Warning.Factory.newInstance();
		warning.setPatientID(PatientID);
		SystemParameter typeOfWarning = SystemParameter.Factory.newInstance();
		typeOfWarning.setCode("2");
		typeOfWarning.setDescription("autogenerated");
		warning.setTypeOfWarning(typeOfWarning);
		warning.setDateTimeOfWarning(Calendar.getInstance());
		
		if (TypeOfAnalysis == MeasurementAnalysis) {
		
		warning.setJustificationText(String.format(
				"Type {%s} Current value = %s, Previous value = %s",
				description, RiskValue, PreviousValue));
		}
		else if (TypeOfAnalysis == QuestionnaireAnalysis)
			warning.setJustificationText(description);

		return warning;

	}

}
