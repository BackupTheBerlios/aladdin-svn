
package com.aladdin.sc;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;

import org.hibernate.Session;

import eu.aladdin_project.storagecomponent.*;
import eu.aladdin_project.storagecomponent.AssignTaskResponseDocument.AssignTaskResponse;
import eu.aladdin_project.storagecomponent.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse;
import eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse;
import eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse;
import eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse;
import eu.aladdin_project.storagecomponent.CreateExternalServiceResponseDocument.CreateExternalServiceResponse;
import eu.aladdin_project.storagecomponent.CreatePatientResponseDocument.CreatePatientResponse;
import eu.aladdin_project.storagecomponent.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.DeleteAdministratorResponseDocument.DeleteAdministratorResponse;
import eu.aladdin_project.storagecomponent.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse;
import eu.aladdin_project.storagecomponent.DeleteCarerResponseDocument.DeleteCarerResponse;
import eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse;
import eu.aladdin_project.storagecomponent.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse;
import eu.aladdin_project.storagecomponent.DeletePatientAssessmentResponseDocument.DeletePatientAssessmentResponse;
import eu.aladdin_project.storagecomponent.DeletePatientResponseDocument.DeletePatientResponse;
import eu.aladdin_project.storagecomponent.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.GetAdministratorResponseDocument.GetAdministratorResponse;
import eu.aladdin_project.storagecomponent.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse;
import eu.aladdin_project.storagecomponent.GetCarerAssessmentResponseDocument.GetCarerAssessmentResponse;
import eu.aladdin_project.storagecomponent.GetCarerResponseDocument.GetCarerResponse;
import eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse;
import eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementResponseDocument.GetPatientMeasurementResponse;
import eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse;
import eu.aladdin_project.storagecomponent.GetQuestionnaireResponseDocument.GetQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.GetUserPlannedTasksResponseDocument.GetUserPlannedTasksResponse;
import eu.aladdin_project.storagecomponent.GetWarningsResponseDocument.GetWarningsResponse;
import eu.aladdin_project.storagecomponent.ListOfAdministratorsResponseDocument.ListOfAdministratorsResponse;
import eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse;
import eu.aladdin_project.storagecomponent.ListOfCliniciansResponseDocument.ListOfCliniciansResponse;
import eu.aladdin_project.storagecomponent.ListOfPatientsResponseDocument.ListOfPatientsResponse;
import eu.aladdin_project.storagecomponent.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse;
import eu.aladdin_project.storagecomponent.ListOfQuestionnairesResponseDocument.ListOfQuestionnairesResponse;
import eu.aladdin_project.storagecomponent.MarkWarningAsReadResponseDocument.MarkWarningAsReadResponse;
import eu.aladdin_project.storagecomponent.SaveCarerAssessmentResponseDocument.SaveCarerAssessmentResponse;
import eu.aladdin_project.storagecomponent.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse;
import eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse;
import eu.aladdin_project.storagecomponent.StoreMeasurementsResponseDocument.StoreMeasurementsResponse;
import eu.aladdin_project.storagecomponent.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse;
import eu.aladdin_project.storagecomponent.UpdataPatientResponseDocument.UpdataPatientResponse;
import eu.aladdin_project.storagecomponent.UpdateAdministratorResponseDocument.UpdateAdministratorResponse;
import eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse;
import eu.aladdin_project.storagecomponent.UpdateClinicianResponseDocument.UpdateClinicianResponse;
import eu.aladdin_project.storagecomponent.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse;
import eu.aladdin_project.storagecomponent.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse;
import eu.aladdin_project.xsd.*;
import org.hibernate.Session;

/**
     *  StorageComponentSkeleton java skeleton for the axisService
     */
public class StorageComponentSkeleton implements StorageComponentSkeletonInterface{

	public UpdateQuestionnaireResponseDocument updateQuestionnaire (UpdateQuestionnaireDocument updateQuestionnaire0) {
		UpdateQuestionnaireResponseDocument respdoc = UpdateQuestionnaireResponseDocument.Factory.newInstance();
		UpdateQuestionnaireResponse resp = respdoc.addNewUpdateQuestionnaireResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public ListOfQuestionnairesResponseDocument listOfQuestionnaires (ListOfQuestionnairesDocument listOfQuestionnaires2) {
		ListOfQuestionnairesResponseDocument respdoc = ListOfQuestionnairesResponseDocument.Factory.newInstance();
		ListOfQuestionnairesResponse resp = respdoc.addNewListOfQuestionnairesResponse();
		QuestionnaireInfo qi = resp.addNewOut();
		qi.setID("Q-0001");
		qi.setTitle("Quest#1");
		return respdoc;
	}
	
	public SaveWarningResponseDocument saveWarning (SaveWarningDocument saveWarning4) {
		SaveWarningResponseDocument respdoc = SaveWarningResponseDocument.Factory.newInstance();
		SaveWarningResponse resp = respdoc.addNewSaveWarningResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("W-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public UpdateCarerResponseDocument updateCarer (UpdateCarerDocument updateCarer6) {
		UpdateCarerResponseDocument respdoc = UpdateCarerResponseDocument.Factory.newInstance();
		UpdateCarerResponse resp = respdoc.addNewUpdateCarerResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("Cr-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public DeleteAdministratorResponseDocument deleteAdministrator (DeleteAdministratorDocument deleteAdministrator8) {
		DeleteAdministratorResponseDocument respdoc = DeleteAdministratorResponseDocument.Factory.newInstance();
		DeleteAdministratorResponse resp = respdoc.addNewDeleteAdministratorResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("A-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public UpdataPatientResponseDocument updataPatient (UpdataPatientDocument updataPatient10) {
		UpdataPatientResponseDocument respdoc = UpdataPatientResponseDocument.Factory.newInstance();
		UpdataPatientResponse resp = respdoc.addNewUpdataPatientResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("P-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public ListOfCarersResponseDocument listOfCarers (ListOfCarersDocument listOfCarers12) {
		ListOfCarersResponseDocument respdoc = ListOfCarersResponseDocument.Factory.newInstance();
		ListOfCarersResponse resp = respdoc.addNewListOfCarersResponse();
		CarerInfo ci = resp.addNewOut();
		ci.setID("Cr-0001");
		ci.setName("Anna");
		ci.setSurname("Maria");
		return respdoc;
	}
	
	public ListOfCliniciansResponseDocument listOfClinicians (ListOfCliniciansDocument listOfClinicians14) {
		ListOfCliniciansResponseDocument respdoc = ListOfCliniciansResponseDocument.Factory.newInstance();
		ListOfCliniciansResponse resp = respdoc.addNewListOfCliniciansResponse();
		ClinicianInfo ci = resp.addNewOut();
		ci.setID("Cr-0001");
		ci.setName("Richard");
		ci.setSurname("Zorge");
		return respdoc;
	}
	
	public SavePatientAssessmentResponseDocument savePatientAssessment (SavePatientAssessmentDocument savePatientAssessment16) {
		SavePatientAssessmentResponseDocument respdoc = SavePatientAssessmentResponseDocument.Factory.newInstance();
		SavePatientAssessmentResponse resp = respdoc.addNewSavePatientAssessmentResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("PA-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public StoreMeasurementsResponseDocument storeMeasurements (StoreMeasurementsDocument storeMeasurements18) {
		StoreMeasurementsResponseDocument respdoc = StoreMeasurementsResponseDocument.Factory.newInstance();
		StoreMeasurementsResponse resp = respdoc.addNewStoreMeasurementsResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("M-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public GetPatientResponseDocument getPatient (GetPatientDocument getPatient20) {
		GetPatientResponseDocument respdoc = GetPatientResponseDocument.Factory.newInstance();
		GetPatientResponse resp = respdoc.addNewGetPatientResponse();
		Patient p = resp.addNewOut();
		PersonData pd = p.addNewPersonData();
		pd.setName("Vovka");
		pd.setSurname("Morkovka");
		Address a = pd.addNewAddressList();
		a.setCity("Baden");
		a.setCountry("Schweiz");
		a.setStreet("Big street");
		a.setZipCode("111111");
		Communication c = pd.addNewCommunicationList();
		c.setType("phone");
		c.setValue("+49XXXXXXX");
		Identifier i = pd.addNewIdentifierList();
		i.setNumber("XXX1123");
		i.setType("pass");
		p.setID("P-0001");
		SocioDemographicData sd = p.addNewSDData();
		SystemParameter gender = sd.addNewGender();
		gender.setCode("1");
		gender.setDescription("male");
		SystemParameter LivingWith = sd.addNewLivingWith();
		LivingWith.setCode("1");
		SystemParameter MaritalStatus = sd.addNewMaritalStatus();
		MaritalStatus.setCode("1");
		sd.setAge((short) 60);
		sd.setChildren((short) 2);
		return respdoc;
	}
	
	public DeleteCarerAssessmentResponseDocument deleteCarerAssessment (DeleteCarerAssessmentDocument deleteCarerAssessment22) {
		DeleteCarerAssessmentResponseDocument respdoc = DeleteCarerAssessmentResponseDocument.Factory.newInstance();
		DeleteCarerAssessmentResponse resp = respdoc.addNewDeleteCarerAssessmentResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public CreateClinicianResponseDocument createClinician (CreateClinicianDocument createClinician24) {
		CreateClinicianResponseDocument respdoc = CreateClinicianResponseDocument.Factory.newInstance();
		CreateClinicianResponse resp = respdoc.addNewCreateClinicianResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public GetQuestionnaireAnswersResponseDocument getQuestionnaireAnswers (GetQuestionnaireAnswersDocument getQuestionnaireAnswers26) {
		GetQuestionnaireAnswersResponseDocument respdoc = GetQuestionnaireAnswersResponseDocument.Factory.newInstance();
		GetQuestionnaireAnswersResponse resp = respdoc.addNewGetQuestionnaireAnswersResponse();
		QuestionnaireAnswers q = resp.addNewOut();
		q.setID("Q-0001");
		q.setObjectID("O-0001");
		q.setUserID("U-0001");
		Calendar c = Calendar.getInstance();
		c.set(2010, 06, 15, 14, 55, 30);
		q.setDateTime(c);
		QuestionnaireAnswer qa = q.addNewAnswer();
		qa.setQuestionID("QQ-0001");
		qa.setStringValue("sv");
		return respdoc;
	}
	
	public DeleteExternalServiceResponseDocument deleteExternalService (DeleteExternalServiceDocument deleteExternalService28) {
		DeleteExternalServiceResponseDocument respdoc = DeleteExternalServiceResponseDocument.Factory.newInstance();
		DeleteExternalServiceResponse resp = respdoc.addNewDeleteExternalServiceResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public DeleteClinicianResponseDocument deleteClinician (DeleteClinicianDocument deleteClinician30) {
		DeleteClinicianResponseDocument respdoc = DeleteClinicianResponseDocument.Factory.newInstance();
		DeleteClinicianResponse resp = respdoc.addNewDeleteClinicianResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public DeletePatientResponseDocument deletePatient (DeletePatientDocument deletePatient32) {
		DeletePatientResponseDocument respdoc = DeletePatientResponseDocument.Factory.newInstance();
		DeletePatientResponse resp = respdoc.addNewDeletePatientResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public CreateQuestionnaireResponseDocument createQuestionnaire (CreateQuestionnaireDocument createQuestionnaire34) {
		CreateQuestionnaireResponseDocument respdoc = CreateQuestionnaireResponseDocument.Factory.newInstance();
		CreateQuestionnaireResponse resp = respdoc.addNewCreateQuestionnaireResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public GetPatientMeasurementResponseDocument getPatientMeasurement (GetPatientMeasurementDocument getPatientMeasurement36) {
		GetPatientMeasurementResponseDocument respdoc = GetPatientMeasurementResponseDocument.Factory.newInstance();
		GetPatientMeasurementResponse resp = respdoc.addNewGetPatientMeasurementResponse();
		Measurement m = resp.addNewOut();
		Calendar c = Calendar.getInstance();
		c.set(2010, 06, 15, 14, 55, 30);
		m.setDateTime(c);
		m.setPatientID("P-0001");
		m.setTaskID("T-0001");
		m.setType("none");
		m.setUnits("l");
		BigDecimal b = new BigDecimal(1.0);
		m.setValue (b);
		return respdoc;
	}
	
	public DeleteQuestionnaireResponseDocument deleteQuestionnaire (DeleteQuestionnaireDocument deleteQuestionnaire38) {
		DeleteQuestionnaireResponseDocument respdoc = DeleteQuestionnaireResponseDocument.Factory.newInstance();
		DeleteQuestionnaireResponse resp = respdoc.addNewDeleteQuestionnaireResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public AssignTaskResponseDocument assignTask (AssignTaskDocument assignTask40) {
		AssignTaskResponseDocument respdoc = AssignTaskResponseDocument.Factory.newInstance();
		AssignTaskResponse resp = respdoc.addNewAssignTaskResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	         
	public CreatePatientResponseDocument createPatient (CreatePatientDocument req) {
		CreatePatientResponseDocument respdoc = CreatePatientResponseDocument.Factory.newInstance();
		CreatePatientResponse resp = respdoc.addNewCreatePatientResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("0");
		res.setDescription("failed");
		res.setStatus((short) 0);
		
		Patient data = req.getCreatePatient().getData();
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		com.aladdin.sc.db.Patient p = new com.aladdin.sc.db.Patient ();
		
		com.aladdin.sc.db.PersonData pd = new com.aladdin.sc.db.PersonData();
		PersonData rpd = data.getPersonData();
		pd.setName(rpd.getName());
		pd.setSurname(rpd.getSurname());
		s.save (rpd);
		
		Address[] rad = rpd.getAddressListArray();
		com.aladdin.sc.db.Address ad = new com.aladdin.sc.db.Address ();
		ad.setPersondata(pd.getId());
		for (int i = 0; i < rad.length; i++) {
			ad.setCity(rad[i].getCity());
			ad.setCountry(rad[i].getCountry());
			ad.setCounty(rad[i].getCounty());
			ad.setNotes(rad[i].getNotes());
			ad.setStreet(rad[i].getStreet());
			ad.setStreetNo(rad[i].getStreetNo());
			ad.setZipCode(rad[i].getZipCode());
			ad.setIsPrimary(rad[i].getIsPrimary());
			s.save (ad);
		}
		
		Identifier[] rid = rpd.getIdentifierListArray();
		com.aladdin.sc.db.Identifier id = new com.aladdin.sc.db.Identifier ();
		id.setPersondata(pd.getId());
		for (int i = 0; i < rid.length; i++) {
			id.setType(rid[i].getType());
			id.setNumber(rid[i].getNumber());
			id.setIssueDate(new Timestamp(rid[i].getIssueDate().getTimeInMillis()));
			id.setIssueAuthority(rid[i].getIssueAuthority());
			s.save (id);
		}
		
		Communication[] rcm = rpd.getCommunicationListArray();
		com.aladdin.sc.db.Communication cm = new com.aladdin.sc.db.Communication ();
		cm.setPersondata(pd.getId());
		for (int i = 0; i < rcm.length; i++) {
			cm.setType(rcm[i].getType());
			cm.setValue(rcm[i].getValue());
			cm.setNotes(rcm[i].getNotes());
			cm.setIsPrimary(rcm[i].getIsPrimary());
			s.save (cm);
		}
		
		com.aladdin.sc.db.SocioDemographicData sd = new com.aladdin.sc.db.SocioDemographicData ();
		SocioDemographicData rsd = data.getSDData();
		sd.setAge(new Integer(rsd.getAge()));
		sd.setGender(new Integer(rsd.getGender().getCode()));
		sd.setMaritalStatus(new Integer(rsd.getMaritalStatus().getCode()));
		sd.setChildren(new Integer(rsd.getChildren()));
		sd.setLivingWith(new Integer(rsd.getLivingWith().getCode()));
		s.save(sd);
		
		p.setPersondata(pd.getId());
		p.setSd(sd.getId());
		p.setClinician(new Integer(data.getResponsibleClinicianID()));
		s.save(p);
		
		s.getTransaction().commit();
		
		res.setCode(p.getId().toString());
		res.setStatus((short) 1);
		res.setDescription("ok");
		
		return respdoc;
	}
	     
	public ListOfAdministratorsResponseDocument listOfAdministrators (ListOfAdministratorsDocument listOfAdministrators44) {
		ListOfAdministratorsResponseDocument respdoc = ListOfAdministratorsResponseDocument.Factory.newInstance();
		ListOfAdministratorsResponse resp = respdoc.addNewListOfAdministratorsResponse();
		AdministratorInfo ai = resp.addNewOut();
		ai.setID("A-0001");
		ai.setName("Yuri");
		ai.setSurname("Glickman");
		return respdoc;
	}
	     
	public GetUserPlannedTasksResponseDocument getUserPlannedTasks (GetUserPlannedTasksDocument getUserPlannedTasks46) {
		GetUserPlannedTasksResponseDocument respdoc = GetUserPlannedTasksResponseDocument.Factory.newInstance();
		GetUserPlannedTasksResponse resp = respdoc.addNewGetUserPlannedTasksResponse();
		Task t = resp.addNewOut();
		SystemParameter ts = t.addNewTaskStatus();
		ts.setCode("1");
		SystemParameter tt = t.addNewTaskType();
		tt.setCode("1");
		t.setAssignerID("A-0001");
		Calendar c = Calendar.getInstance();
		c.set(2010, 06, 15, 14, 55, 30);
		t.setDateTimeAssigned(c);
		t.setDateTimeFulfilled(c);
		t.setExecutorID("E-0001");
		t.setURL("http://google.com");
		return respdoc;
	}
	     
	public ListOfPossibleTasksResponseDocument listOfPossibleTasks (ListOfPossibleTasksDocument listOfPossibleTasks48) {
		ListOfPossibleTasksResponseDocument respdoc = ListOfPossibleTasksResponseDocument.Factory.newInstance();
		ListOfPossibleTasksResponse resp = respdoc.addNewListOfPossibleTasksResponse();
		SystemParameter pt1 = resp.addNewOut();
		pt1.setCode("1");
		SystemParameter pt2 = resp.addNewOut();
		pt2.setCode("2");
		return respdoc;
	}
	
	public CreateCarerResponseDocument createCarer (CreateCarerDocument createCarer50) {
		CreateCarerResponseDocument respdoc = CreateCarerResponseDocument.Factory.newInstance();
		CreateCarerResponse resp = respdoc.addNewCreateCarerResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public CreateExternalServiceResponseDocument createExternalService (CreateExternalServiceDocument createExternalService52) {
		CreateExternalServiceResponseDocument respdoc = CreateExternalServiceResponseDocument.Factory.newInstance();
		CreateExternalServiceResponse resp = respdoc.addNewCreateExternalServiceResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public SaveCarerAssessmentResponseDocument saveCarerAssessment (SaveCarerAssessmentDocument saveCarerAssessment54) {
		SaveCarerAssessmentResponseDocument respdoc = SaveCarerAssessmentResponseDocument.Factory.newInstance();
		SaveCarerAssessmentResponse resp = respdoc.addNewSaveCarerAssessmentResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public DeleteCarerResponseDocument deleteCarer (DeleteCarerDocument deleteCarer56) {
		DeleteCarerResponseDocument respdoc = DeleteCarerResponseDocument.Factory.newInstance();
		DeleteCarerResponse resp = respdoc.addNewDeleteCarerResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public CreateAdministratorResponseDocument createAdministrator (CreateAdministratorDocument createAdministrator58) {
		CreateAdministratorResponseDocument respdoc = CreateAdministratorResponseDocument.Factory.newInstance();
		CreateAdministratorResponse resp = respdoc.addNewCreateAdministratorResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public UpdateExternalServiceResponseDocument updateExternalService (UpdateExternalServiceDocument updateExternalService60) {
		UpdateExternalServiceResponseDocument respdoc = UpdateExternalServiceResponseDocument.Factory.newInstance();
		UpdateExternalServiceResponse resp = respdoc.addNewUpdateExternalServiceResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public GetClinicianResponseDocument getClinician (GetClinicianDocument getClinician62) {
		GetClinicianResponseDocument respdoc = GetClinicianResponseDocument.Factory.newInstance();
		GetClinicianResponse resp = respdoc.addNewGetClinicianResponse();
		Clinician p = resp.addNewOut();
		PersonData pd = p.addNewPersonData();
		pd.setName("Vovka");
		pd.setSurname("Morkovka");
		Address a = pd.addNewAddressList();
		a.setCity("Baden");
		a.setCountry("Schweiz");
		a.setStreet("Big street");
		a.setZipCode("111111");
		Communication c = pd.addNewCommunicationList();
		c.setType("phone");
		c.setValue("+49XXXXXXX");
		Identifier i = pd.addNewIdentifierList();
		i.setNumber("XXX1123");
		i.setType("pass");
		p.setID("P-0001");
		return respdoc;
	}
	
	public DeletePatientAssessmentResponseDocument deletePatientAssessment (DeletePatientAssessmentDocument deletePatientAssessment64) {
		DeletePatientAssessmentResponseDocument respdoc = DeletePatientAssessmentResponseDocument.Factory.newInstance();
		DeletePatientAssessmentResponse resp = respdoc.addNewDeletePatientAssessmentResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public GetAllExternalServicesResponseDocument getAllExternalServices (GetAllExternalServicesDocument getAllExternalServices66) {
		GetAllExternalServicesResponseDocument respdoc = GetAllExternalServicesResponseDocument.Factory.newInstance();
		GetAllExternalServicesResponse resp = respdoc.addNewGetAllExternalServicesResponse();
		ExternalService es = resp.addNewOut();
		es.setAddress("http://google.com");
		es.setID("S-0001");
		return respdoc;
	}
	
	public GetCarerResponseDocument getCarer (GetCarerDocument getCarer68) {
		GetCarerResponseDocument respdoc = GetCarerResponseDocument.Factory.newInstance();
		GetCarerResponse resp = respdoc.addNewGetCarerResponse();
		Carer p = resp.addNewOut();
		PersonData pd = p.addNewPersonData();
		pd.setName("Vovka");
		pd.setSurname("Morkovka");
		Address a = pd.addNewAddressList();
		a.setCity("Baden");
		a.setCountry("Schweiz");
		a.setStreet("Big street");
		a.setZipCode("111111");
		Communication c = pd.addNewCommunicationList();
		c.setType("phone");
		c.setValue("+49XXXXXXX");
		Identifier i = pd.addNewIdentifierList();
		i.setNumber("XXX1123");
		i.setType("pass");
		p.setID("P-0001");
		SocioDemographicData sd = p.addNewSDData();
		SystemParameter gender = sd.addNewGender();
		gender.setCode("1");
		gender.setDescription("male");
		SystemParameter LivingWith = sd.addNewLivingWith();
		LivingWith.setCode("1");
		SystemParameter MaritalStatus = sd.addNewMaritalStatus();
		MaritalStatus.setCode("1");
		sd.setAge((short) 60);
		sd.setChildren((short) 2);
		return respdoc;
	}
	
	public GetAdministratorResponseDocument getAdministrator (GetAdministratorDocument getAdministrator70) {
		GetAdministratorResponseDocument respdoc = GetAdministratorResponseDocument.Factory.newInstance();
		GetAdministratorResponse resp = respdoc.addNewGetAdministratorResponse();
		Administrator p = resp.addNewOut();
		PersonData pd = p.addNewPersonData();
		pd.setName("Vovka");
		pd.setSurname("Morkovka");
		Address a = pd.addNewAddressList();
		a.setCity("Baden");
		a.setCountry("Schweiz");
		a.setStreet("Big street");
		a.setZipCode("111111");
		Communication c = pd.addNewCommunicationList();
		c.setType("phone");
		c.setValue("+49XXXXXXX");
		Identifier i = pd.addNewIdentifierList();
		i.setNumber("XXX1123");
		i.setType("pass");
		p.setID("P-0001");
		return respdoc;
	}
	
	public UpdateAdministratorResponseDocument updateAdministrator (UpdateAdministratorDocument updateAdministrator72) {
		UpdateAdministratorResponseDocument respdoc = UpdateAdministratorResponseDocument.Factory.newInstance();
		UpdateAdministratorResponse resp = respdoc.addNewUpdateAdministratorResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public GetQuestionnaireResponseDocument getQuestionnaire (GetQuestionnaireDocument getQuestionnaire74) {
		GetQuestionnaireResponseDocument respdoc = GetQuestionnaireResponseDocument.Factory.newInstance();
		GetQuestionnaireResponse resp = respdoc.addNewGetQuestionnaireResponse();
		Questionnaire q = resp.addNewOut();
		q.setID("Q-0001");
		q.setTitle("Quest#1");
		q.setVersion(new BigDecimal(1.0));
		QuestionnaireQuestion qq = q.addNewQuestions();
		qq.setId("QQ-0001");
		QuestionnaireQuestionAnswer qqa = qq.addNewAnswer();
		qqa.setStringValue("answer1");
		qqa.setValue("-1");
		return respdoc;
	}
	
	public StoreQuestionnaireAnswersResponseDocument storeQuestionnaireAnswers (StoreQuestionnaireAnswersDocument storeQuestionnaireAnswers76) {
		StoreQuestionnaireAnswersResponseDocument respdoc = StoreQuestionnaireAnswersResponseDocument.Factory.newInstance();
		StoreQuestionnaireAnswersResponse resp = respdoc.addNewStoreQuestionnaireAnswersResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public GetPatientAssessmentResponseDocument getPatientAssessment (GetPatientAssessmentDocument getPatientAssessment78) {
		GetPatientAssessmentResponseDocument respdoc = GetPatientAssessmentResponseDocument.Factory.newInstance();
		GetPatientAssessmentResponse resp = respdoc.addNewGetPatientAssessmentResponse();
		PatientAssessment pa = resp.addNewOut();
		SystemParameter ae = pa.addNewAetology();
		ae.setCode("1");
		Measurement m = pa.addNewClinicalData();
		m.setPatientID("P-0001");
		return respdoc;
	}
	
	public GetCarerAssessmentResponseDocument getCarerAssessment (GetCarerAssessmentDocument getCarerAssessment80) {
		GetCarerAssessmentResponseDocument respdoc = GetCarerAssessmentResponseDocument.Factory.newInstance();
		GetCarerAssessmentResponse resp = respdoc.addNewGetCarerAssessmentResponse();
		CarerAssessment pa = resp.addNewOut();
		pa.setCarerID("C-0001");
		return respdoc;
	}
	
	public ChangeTaskStatusResponseDocument changeTaskStatus (ChangeTaskStatusDocument changeTaskStatus82) {
		ChangeTaskStatusResponseDocument respdoc = ChangeTaskStatusResponseDocument.Factory.newInstance();
		ChangeTaskStatusResponse resp = respdoc.addNewChangeTaskStatusResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public ListOfPatientsResponseDocument listOfPatients (ListOfPatientsDocument listOfPatients84) {
		ListOfPatientsResponseDocument respdoc = ListOfPatientsResponseDocument.Factory.newInstance();
		ListOfPatientsResponse resp = respdoc.addNewListOfPatientsResponse();
		PatientInfo ai = resp.addNewOut();
		ai.setID("A-0001");
		ai.setName("Ivan");
		ai.setSurname("Popov");
		return respdoc;
	}
	
	public GetWarningsResponseDocument getWarnings (GetWarningsDocument getWarnings86) {
		GetWarningsResponseDocument respdoc = GetWarningsResponseDocument.Factory.newInstance();
		GetWarningsResponse resp = respdoc.addNewGetWarningsResponse();
		Warning w = resp.addNewOut();
		SystemParameter ef = w.addNewEffect();
		ef.setCode("1");
		SystemParameter el = w.addNewEmergencyLevel();
		el.setCode("2");
		SystemParameter i = w.addNewIndicator();
		i.setCode("3");
		SystemParameter rl = w.addNewRiskLevel();
		rl.setCode("4");
		SystemParameter tw = w.addNewTypeOfWarning();
		tw.setCode("5");
		return respdoc;
	}
	
	public UpdateClinicianResponseDocument updateClinician (UpdateClinicianDocument updateClinician88) {
		UpdateClinicianResponseDocument respdoc = UpdateClinicianResponseDocument.Factory.newInstance();
		UpdateClinicianResponse resp = respdoc.addNewUpdateClinicianResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
	
	public MarkWarningAsReadResponseDocument markWarningAsRead (MarkWarningAsReadDocument markWarningAsRead90) {
		MarkWarningAsReadResponseDocument respdoc = MarkWarningAsReadResponseDocument.Factory.newInstance();
		MarkWarningAsReadResponse resp = respdoc.addNewMarkWarningAsReadResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("R-0001");
		res.setDescription("");
		res.setStatus((short) 1);
		return respdoc;
	}
}
    