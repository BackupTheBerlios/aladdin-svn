package com.aladdin.sc;

import java.util.Calendar;

import eu.aladdin_project.xsd.AddressList;
import eu.aladdin_project.xsd.Administrator;
import eu.aladdin_project.xsd.Carer;
import eu.aladdin_project.xsd.CarerAssessment;
import eu.aladdin_project.xsd.Clinician;
import eu.aladdin_project.xsd.CommunicationList;
import eu.aladdin_project.xsd.ExternalService;
import eu.aladdin_project.xsd.IdentifierList;
import eu.aladdin_project.xsd.Measurement;
import eu.aladdin_project.xsd.Patient;
import eu.aladdin_project.xsd.PatientAssessment;
import eu.aladdin_project.xsd.PatientCarerList;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.Questionnaire;
import eu.aladdin_project.xsd.QuestionnaireAnswer;
import eu.aladdin_project.xsd.QuestionnaireAnswers;
import eu.aladdin_project.xsd.QuestionnaireQuestion;
import eu.aladdin_project.xsd.QuestionnaireQuestionAnswer;
import eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList;
import eu.aladdin_project.xsd.QuestionnaireQuestionList;
import eu.aladdin_project.xsd.SearchCriteria;
import eu.aladdin_project.xsd.SocioDemographicData;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.Task;
import eu.aladdin_project.xsd.User;
import eu.aladdin_project.xsd.Warning;

public class NullChecker {
	
	public <T> T check (T v, Class<T> t) {
		if (v == null) {
			try {
				return t.newInstance();
			} catch (java.lang.InstantiationException e) {
				System.out.println (e.toString());
			} catch (java.lang.IllegalAccessException e) {
				System.out.println (e.toString());
			}
		}
		return v;
	}

	public Integer check (Integer v, Class<Integer> t) {
		if (v == null) {
			return new Integer (0);
		}
		return v;
	}
	
	public Calendar check (Calendar v, Class<Calendar> t) {
		if (v == null) v = Calendar.getInstance();
		
		return v;
	}
	
	public AddressList check (AddressList v, Class<AddressList> t) {
		if (v == null) v = AddressList.Factory.newInstance();
		
		for (int i = 0; i < v.getAddressArray().length; i++) {
			v.getAddressArray(i).setCity(this.check(v.getAddressArray(i).getCity(), String.class));
			v.getAddressArray(i).setCounty(this.check(v.getAddressArray(i).getCounty(), String.class));
			v.getAddressArray(i).setCountry(this.check(v.getAddressArray(i).getCountry(), String.class));
			v.getAddressArray(i).setNotes(this.check(v.getAddressArray(i).getNotes(), String.class));
			v.getAddressArray(i).setStreet(this.check(v.getAddressArray(i).getStreet(), String.class));
			v.getAddressArray(i).setStreetNo(this.check(v.getAddressArray(i).getStreetNo(), String.class));
			v.getAddressArray(i).setZipCode(this.check(v.getAddressArray(i).getZipCode(), String.class));
		}
		
		return v;
	}
	
	public CommunicationList check (CommunicationList v, Class<CommunicationList> t) {
		if (v == null) v = CommunicationList.Factory.newInstance();
		
		for (int i = 0; i < v.getCommunicationArray().length; i++) {
			v.getCommunicationArray(i).setNotes(this.check(v.getCommunicationArray(i).getNotes(), String.class));
			v.getCommunicationArray(i).setType(this.check(v.getCommunicationArray(i).getType(), String.class));
			v.getCommunicationArray(i).setValue(this.check(v.getCommunicationArray(i).getValue(), String.class));
		}
		
		return v;
	}
	
/*	public Identifier check (Identifier v, Class<Identifier> t) {
		if (v == null) v = Identifier.Factory.newInstance();
		
		v.setIssueAuthority(this.check(v.getIssueAuthority(), String.class));
		v.setNumber(this.check(v.getNumber(), String.class));
		v.setType(this.check(v.getType(), String.class));
		v.setIssueDate(this.check(v.getIssueDate(), Calendar.class));
		
		return v;
	}*/
	
	public IdentifierList check (IdentifierList v, Class<IdentifierList> t) {
		if (v == null) v = IdentifierList.Factory.newInstance();
		
		for (int i = 0; i < v.getIdentifierArray().length; i++) {
			v.getIdentifierArray(i).setIssueAuthority(this.check(v.getIdentifierArray(i).getIssueAuthority(), String.class));
			v.getIdentifierArray(i).setNumber(this.check(v.getIdentifierArray(i).getNumber(), String.class));
			v.getIdentifierArray(i).setType(this.check(v.getIdentifierArray(i).getType(), String.class));
			v.getIdentifierArray(i).setIssueDate(this.check(v.getIdentifierArray(i).getIssueDate(), Calendar.class));
		}
		
		return v;
	}
	
	public PersonData check (PersonData v, Class<PersonData> t) {
		if (v == null) v = PersonData.Factory.newInstance();
		
		v.setAddressList(this.check(v.getAddressList(), AddressList.class));
		v.setCommunicationList(this.check(v.getCommunicationList(), CommunicationList.class));
		v.setIdentifierList(this.check(v.getIdentifierList(), IdentifierList.class));
		
		v.setName(this.check(v.getName(), String.class));
		v.setSurname(this.check(v.getSurname(), String.class));
		
		return v;
	}
	
	public Clinician check (Clinician v, Class<Clinician> t) {
		if (v == null) v = Clinician.Factory.newInstance();
		
		v.setID(this.check(v.getID(), String.class));
		v.setPersonData(this.check(v.getPersonData(), PersonData.class));
		
		return v;
	}
	
	public SystemParameter check (SystemParameter v, Class<SystemParameter> t) {
		if (v == null) v = SystemParameter.Factory.newInstance();
		
		v.setCode(this.check(v.getCode(), String.class));
		v.setDescription(this.check(v.getDescription(), String.class));
		
		return v;
	}
	
	public SocioDemographicData check (SocioDemographicData v, Class<SocioDemographicData> t) {
		if (v == null) v = SocioDemographicData.Factory.newInstance();
		
		v.setGender(this.check(v.getGender(), SystemParameter.class));
		v.setLivingWith(this.check(v.getLivingWith(), SystemParameter.class));
		v.setMaritalStatus(this.check(v.getMaritalStatus(), SystemParameter.class));
		
		return v;
	}
	
	public Carer check (Carer v, Class<Carer> t) {
		if (v == null) v = Carer.Factory.newInstance();
		
		v.setPersonData(this.check(v.getPersonData(), PersonData.class));
		v.setID(this.check(v.getID(), String.class));
		v.setSDData(this.check(v.getSDData(), SocioDemographicData.class));
		
		return v;
	}
	
	public PatientCarerList check (PatientCarerList v, Class<PatientCarerList> t) {
		if (v == null) v = PatientCarerList.Factory.newInstance();
		
		for (int i = 0; i < v.getPatientCarerArray().length; i++) {
			v.getPatientCarerArray(i).setCarer(this.check(v.getPatientCarerArray(i).getCarer(), Carer.class));
		}
		
		return v;
	}
	
	public Patient check (Patient v, Class<Patient> t) {
		if (v == null) v = Patient.Factory.newInstance();
		
		v.setID(this.check(v.getID(), String.class));
		v.setPersonData(this.check(v.getPersonData(), PersonData.class));
		v.setResponsibleClinicianID(this.check(v.getResponsibleClinicianID(), String.class));
		v.setSDData(this.check(v.getSDData(), SocioDemographicData.class));
		
		return v;
	}
	
	public QuestionnaireQuestionList check (QuestionnaireQuestionList v, Class<QuestionnaireQuestionList> t) {
		if (v == null) v = QuestionnaireQuestionList.Factory.newInstance();
		
		for (int i = 0; i < v.getQuestionArray().length; i++) {
			v.setQuestionArray(i, this.check(v.getQuestionArray(i), QuestionnaireQuestion.class));
		}
		
		return v;
	}
	
	public QuestionnaireQuestionAnswer check (QuestionnaireQuestionAnswer v, Class<QuestionnaireQuestionAnswer> t) {
		if (v == null) v = QuestionnaireQuestionAnswer.Factory.newInstance();
		
		v.setDescription(this.check(v.getDescription(), String.class));
		
		return v;
	}
	
	public QuestionnaireQuestionAnswerList check (QuestionnaireQuestionAnswerList v, Class<QuestionnaireQuestionAnswerList> t) {
		if (v == null) v = QuestionnaireQuestionAnswerList.Factory.newInstance();
		
		for (int i = 0; i < v.getAnswerArray().length; i++) {
			v.setAnswerArray(i, this.check(v.getAnswerArray(i), QuestionnaireQuestionAnswer.class));
		}
		
		return v;
	}
	
	public QuestionnaireQuestion check (QuestionnaireQuestion v, Class<QuestionnaireQuestion> t) {
		if (v == null) v = QuestionnaireQuestion.Factory.newInstance();
		
		v.setId(this.check(v.getId(), String.class));
		v.setTitle(this.check(v.getTitle(), String.class));
		v.setType(this.check(v.getType(), String.class));
		v.setQuestions(this.check(v.getQuestions(), QuestionnaireQuestionList.class));
		v.setAnswers(this.check(v.getAnswers(), QuestionnaireQuestionAnswerList.class));
		
		return v;
	}
	
	public Questionnaire check (Questionnaire v, Class<Questionnaire> t) {
		if (v == null) v = Questionnaire.Factory.newInstance();
		
		v.setID(this.check(v.getID(), String.class));
		v.setTitle(this.check(v.getTitle(), String.class));
		
		for (int i = 0; i < v.getQuestionArray().length; i++) {
			v.setQuestionArray(i, this.check(v.getQuestionArray(i), QuestionnaireQuestion.class));
		}
		
		return v;
	}
	
	public Warning check (Warning v, Class<Warning> t) {
		if (v == null) v = Warning.Factory.newInstance();
		
		v.setDateTimeOfWarning(this.check(v.getDateTimeOfWarning(), Calendar.class));
		v.setEffect(this.check(v.getEffect(), SystemParameter.class));
		v.setEmergencyLevel(this.check(v.getEmergencyLevel(), SystemParameter.class));
		v.setID(this.check(v.getID(), String.class));
		v.setIndicator(this.check(v.getIndicator(), SystemParameter.class));
		v.setJustificationText(this.check(v.getJustificationText(), String.class));
		v.setPatient(this.check(v.getPatient(), Patient.class));
		v.setRiskLevel(this.check(v.getRiskLevel(), SystemParameter.class));
		v.setTypeOfWarning(this.check(v.getTypeOfWarning(), SystemParameter.class));
		
		return v;
	}
	
	public SearchCriteria check (SearchCriteria v, Class<SearchCriteria> t) {
		if (v == null) v = SearchCriteria.Factory.newInstance();
		
		v.setCompareOp(this.check(v.getCompareOp(), SystemParameter.class));
		v.setFieldName(this.check(v.getFieldName(), String.class));
		v.setFieldValue1(this.check(v.getFieldValue1(), String.class));
		v.setFieldValue2(this.check(v.getFieldValue2(), String.class));
		
		return v;
	}
	
	public Measurement check (Measurement v, Class<Measurement> t) {
		if (v == null) v = Measurement.Factory.newInstance();
		
		v.setDateTime(this.check(v.getDateTime(), Calendar.class));
		v.setTaskID(this.check(v.getTaskID(), String.class));
		v.setType(this.check(v.getType(), SystemParameter.class));
		v.setUnits(this.check(v.getUnits(), String.class));
		
		return v;
	}
	
	public PatientAssessment check (PatientAssessment v, Class<PatientAssessment> t) {
		if (v == null) v = PatientAssessment.Factory.newInstance();
		
		v.setAetology(this.check(v.getAetology(), SystemParameter.class));
		v.setDateOfAssessment(this.check(v.getDateOfAssessment(), Calendar.class));
		v.setID(this.check(v.getID(), String.class));
		v.setPatientID(this.check(v.getPatientID(), String.class));
		v.setPharmacologicalTreatment(this.check(v.getPharmacologicalTreatment(), String.class));
		v.setRelevantPathologyAntecedents(this.check(v.getRelevantPathologyAntecedents(), String.class));
		
		for (int i = 0; i < v.getClinicalDataArray().length; i++) {
			v.setClinicalDataArray(i, this.check(v.getClinicalDataArray(i), Measurement.class));
		}
		
		return v;
	}
	
	public Task check (Task v, Class<Task> t) {
		if (v == null) v = Task.Factory.newInstance();
		
		v.setAssignerID(this.check(v.getAssignerID(), String.class));
		v.setDateTimeAssigned(this.check(v.getDateTimeAssigned(), Calendar.class));
		v.setDateTimeFulfilled(this.check(v.getDateTimeAssigned(), Calendar.class));
		v.setExecutorID(this.check(v.getExecutorID(), String.class));
		v.setID(this.check(v.getID(), String.class));
		v.setObjectID(this.check(v.getObjectID(), String.class));
		v.setQuestionnaire(this.check(v.getQuestionnaire(), Questionnaire.class));
		v.setTaskStatus(this.check(v.getTaskStatus(), SystemParameter.class));
		v.setTaskType(this.check(v.getTaskType(), SystemParameter.class));
		v.setURL(this.check(v.getURL(), String.class));
		
		return v;
	}
	
	public ExternalService check (ExternalService v, Class<ExternalService> t) {
		if (v == null) v = ExternalService.Factory.newInstance();
		
		v.setAddress(this.check(v.getAddress(), String.class));
		v.setDescription(this.check(v.getDescription(), String.class));
		v.setID(this.check(v.getID(), String.class));
		
		return v;
	}
	
	public CarerAssessment check (CarerAssessment v, Class<CarerAssessment> t) {
		if (v == null) v = CarerAssessment.Factory.newInstance();
		
		v.setCarerID(this.check(v.getCarerID(), String.class));
		v.setClinicianID(this.check(v.getClinicianID(), String.class));
		v.setDateOfAssessment(this.check(v.getDateOfAssessment(), Calendar.class));
		v.setEmotionalOrMentalDisorders(this.check(v.getEmotionalOrMentalDisorders(), String.class));
		v.setID(this.check(v.getID(), String.class));
		v.setPsychoactiveDrugs(this.check(v.getPsychoactiveDrugs(), String.class));
		v.setRelevantHealthProblem(this.check(v.getRelevantHealthProblem(), String.class));
		
		return v;
	}
	
	public Administrator check (Administrator v, Class<Administrator> t) {
		if (v == null) v = Administrator.Factory.newInstance();
		
		v.setID(this.check(v.getID(), String.class));
		v.setPersonData(this.check(v.getPersonData(), PersonData.class));
		
		return v;
	}
	
	public QuestionnaireAnswer check (QuestionnaireAnswer v, Class<QuestionnaireAnswer> t) {
		if (v == null) v = QuestionnaireAnswer.Factory.newInstance();
		
		v.setQuestionID(this.check(v.getQuestionID(), String.class));
		v.setStringValue(this.check(v.getStringValue(), String.class));
		v.setValue(this.check(v.getValue(), String.class));
		
		return v;
	}
	
	public QuestionnaireAnswers check (QuestionnaireAnswers v, Class<QuestionnaireAnswers> t) {
		if (v == null) v = QuestionnaireAnswers.Factory.newInstance();
		
		v.setDateTime(this.check(v.getDateTime(), Calendar.class));
		v.setID(this.check(v.getID(), String.class));
		v.setObjectID(this.check(v.getObjectID(), String.class));
		v.setUserID(this.check(v.getUserID(), String.class));
		
		for (int i = 0; i < v.getAnswerArray().length; i++) {
			v.setAnswerArray(i, this.check(v.getAnswerArray(i), QuestionnaireAnswer.class));
		}
		
		return v;
	}
	
	public User check (User v, Class<User> t) {
		if (v == null) v = User.Factory.newInstance();
		
		v.setID(this.check(v.getID(), String.class));
		v.setPassword(this.check(v.getPassword(), String.class));
		v.setPersonID(this.check(v.getPersonID(), String.class));
		v.setType(this.check(v.getType(), SystemParameter.class));
		v.setUsername(this.check(v.getUsername(), String.class));
		
		return v;
	}

}
