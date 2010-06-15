
package com.aladdin.sc;

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
import eu.aladdin_project.storagecomponent.ListOfAdministratorsDocument.ListOfAdministrators;
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

/**
     *  StorageComponentSkeleton java skeleton for the axisService
     */
public class StorageComponentSkeleton implements StorageComponentSkeletonInterface{

	public UpdateQuestionnaireResponseDocument updateQuestionnaire (UpdateQuestionnaireDocument updateQuestionnaire0) {
		UpdateQuestionnaireResponseDocument respdoc = UpdateQuestionnaireResponseDocument.Factory.newInstance();
		UpdateQuestionnaireResponse resp = respdoc.addNewUpdateQuestionnaireResponse();
		return respdoc;
	}
	
	public ListOfQuestionnairesResponseDocument listOfQuestionnaires (ListOfQuestionnairesDocument listOfQuestionnaires2) {
		ListOfQuestionnairesResponseDocument respdoc = ListOfQuestionnairesResponseDocument.Factory.newInstance();
		ListOfQuestionnairesResponse resp = respdoc.addNewListOfQuestionnairesResponse();
		return respdoc;
	}
	
	public SaveWarningResponseDocument saveWarning (SaveWarningDocument saveWarning4) {
		SaveWarningResponseDocument respdoc = SaveWarningResponseDocument.Factory.newInstance();
		SaveWarningResponse resp = respdoc.addNewSaveWarningResponse();
		return respdoc;
	}
	
	public UpdateCarerResponseDocument updateCarer (UpdateCarerDocument updateCarer6) {
		UpdateCarerResponseDocument respdoc = UpdateCarerResponseDocument.Factory.newInstance();
		UpdateCarerResponse resp = respdoc.addNewUpdateCarerResponse();
		return respdoc;
	}
	
	public DeleteAdministratorResponseDocument deleteAdministrator (DeleteAdministratorDocument deleteAdministrator8) {
		DeleteAdministratorResponseDocument respdoc = DeleteAdministratorResponseDocument.Factory.newInstance();
		DeleteAdministratorResponse resp = respdoc.addNewDeleteAdministratorResponse();
		return respdoc;
	}
	
	public UpdataPatientResponseDocument updataPatient (UpdataPatientDocument updataPatient10) {
		UpdataPatientResponseDocument respdoc = UpdataPatientResponseDocument.Factory.newInstance();
		UpdataPatientResponse resp = respdoc.addNewUpdataPatientResponse();
		return respdoc;
	}
	
	public ListOfCarersResponseDocument listOfCarers (ListOfCarersDocument listOfCarers12) {
		ListOfCarersResponseDocument respdoc = ListOfCarersResponseDocument.Factory.newInstance();
		ListOfCarersResponse resp = respdoc.addNewListOfCarersResponse();
		return respdoc;
	}
	
	public ListOfCliniciansResponseDocument listOfClinicians (ListOfCliniciansDocument listOfClinicians14) {
		ListOfCliniciansResponseDocument respdoc = ListOfCliniciansResponseDocument.Factory.newInstance();
		ListOfCliniciansResponse resp = respdoc.addNewListOfCliniciansResponse();
		return respdoc;
	}
	
	public SavePatientAssessmentResponseDocument savePatientAssessment (SavePatientAssessmentDocument savePatientAssessment16) {
		SavePatientAssessmentResponseDocument respdoc = SavePatientAssessmentResponseDocument.Factory.newInstance();
		SavePatientAssessmentResponse resp = respdoc.addNewSavePatientAssessmentResponse();
		return respdoc;
	}
	
	public StoreMeasurementsResponseDocument storeMeasurements (StoreMeasurementsDocument storeMeasurements18) {
		StoreMeasurementsResponseDocument respdoc = StoreMeasurementsResponseDocument.Factory.newInstance();
		StoreMeasurementsResponse resp = respdoc.addNewStoreMeasurementsResponse();
		return respdoc;
	}
	
	public GetPatientResponseDocument getPatient (GetPatientDocument getPatient20) {
		GetPatientResponseDocument respdoc = GetPatientResponseDocument.Factory.newInstance();
		GetPatientResponse resp = respdoc.addNewGetPatientResponse();
		return respdoc;
	}
	
	public DeleteCarerAssessmentResponseDocument deleteCarerAssessment (DeleteCarerAssessmentDocument deleteCarerAssessment22) {
		DeleteCarerAssessmentResponseDocument respdoc = DeleteCarerAssessmentResponseDocument.Factory.newInstance();
		DeleteCarerAssessmentResponse resp = respdoc.addNewDeleteCarerAssessmentResponse();
		return respdoc;
	}
	
	public CreateClinicianResponseDocument createClinician (CreateClinicianDocument createClinician24) {
		CreateClinicianResponseDocument respdoc = CreateClinicianResponseDocument.Factory.newInstance();
		CreateClinicianResponse resp = respdoc.addNewCreateClinicianResponse();
		return respdoc;
	}
	
	public GetQuestionnaireAnswersResponseDocument getQuestionnaireAnswers (GetQuestionnaireAnswersDocument getQuestionnaireAnswers26) {
		GetQuestionnaireAnswersResponseDocument respdoc = GetQuestionnaireAnswersResponseDocument.Factory.newInstance();
		GetQuestionnaireAnswersResponse resp = respdoc.addNewGetQuestionnaireAnswersResponse();
		return respdoc;
	}
	
	public DeleteExternalServiceResponseDocument deleteExternalService (DeleteExternalServiceDocument deleteExternalService28) {
		DeleteExternalServiceResponseDocument respdoc = DeleteExternalServiceResponseDocument.Factory.newInstance();
		DeleteExternalServiceResponse resp = respdoc.addNewDeleteExternalServiceResponse();
		return respdoc;
	}
	
	public DeleteClinicianResponseDocument deleteClinician (DeleteClinicianDocument deleteClinician30) {
		DeleteClinicianResponseDocument respdoc = DeleteClinicianResponseDocument.Factory.newInstance();
		DeleteClinicianResponse resp = respdoc.addNewDeleteClinicianResponse();
		return respdoc;
	}
	
	public DeletePatientResponseDocument deletePatient (DeletePatientDocument deletePatient32) {
		DeletePatientResponseDocument respdoc = DeletePatientResponseDocument.Factory.newInstance();
		DeletePatientResponse resp = respdoc.addNewDeletePatientResponse();
		return respdoc;
	}
	
	public CreateQuestionnaireResponseDocument createQuestionnaire (CreateQuestionnaireDocument createQuestionnaire34) {
		CreateQuestionnaireResponseDocument respdoc = CreateQuestionnaireResponseDocument.Factory.newInstance();
		CreateQuestionnaireResponse resp = respdoc.addNewCreateQuestionnaireResponse();
		return respdoc;
	}
	
	public GetPatientMeasurementResponseDocument getPatientMeasurement (GetPatientMeasurementDocument getPatientMeasurement36) {
		GetPatientMeasurementResponseDocument respdoc = GetPatientMeasurementResponseDocument.Factory.newInstance();
		GetPatientMeasurementResponse resp = respdoc.addNewGetPatientMeasurementResponse();
		return respdoc;
	}
	
	public DeleteQuestionnaireResponseDocument deleteQuestionnaire (DeleteQuestionnaireDocument deleteQuestionnaire38) {
		DeleteQuestionnaireResponseDocument respdoc = DeleteQuestionnaireResponseDocument.Factory.newInstance();
		DeleteQuestionnaireResponse resp = respdoc.addNewDeleteQuestionnaireResponse();
		return respdoc;
	}
	
	public AssignTaskResponseDocument assignTask (AssignTaskDocument assignTask40) {
		AssignTaskResponseDocument respdoc = AssignTaskResponseDocument.Factory.newInstance();
		AssignTaskResponse resp = respdoc.addNewAssignTaskResponse();
		return respdoc;
	}
	         
	public CreatePatientResponseDocument createPatient (CreatePatientDocument createPatient42) {
		CreatePatientResponseDocument respdoc = CreatePatientResponseDocument.Factory.newInstance();
		CreatePatientResponse resp = respdoc.addNewCreatePatientResponse();
		OperationResult res = resp.addNewOut();
		res.setCode("000");
		res.setDescription("none");
		res.setStatus((short) 1);
		return respdoc;
	}
	     
	public ListOfAdministratorsResponseDocument listOfAdministrators (ListOfAdministratorsDocument listOfAdministrators44) {
		ListOfAdministratorsResponseDocument respdoc = ListOfAdministratorsResponseDocument.Factory.newInstance();
		ListOfAdministratorsResponse resp = respdoc.addNewListOfAdministratorsResponse();
		return respdoc;
	}
	     
	public GetUserPlannedTasksResponseDocument getUserPlannedTasks (GetUserPlannedTasksDocument getUserPlannedTasks46) {
		GetUserPlannedTasksResponseDocument respdoc = GetUserPlannedTasksResponseDocument.Factory.newInstance();
		GetUserPlannedTasksResponse resp = respdoc.addNewGetUserPlannedTasksResponse();
		return respdoc;
	}
	     
	public ListOfPossibleTasksResponseDocument listOfPossibleTasks (ListOfPossibleTasksDocument listOfPossibleTasks48) {
		ListOfPossibleTasksResponseDocument respdoc = ListOfPossibleTasksResponseDocument.Factory.newInstance();
		ListOfPossibleTasksResponse resp = respdoc.addNewListOfPossibleTasksResponse();
		return respdoc;
	}
	
	public CreateCarerResponseDocument createCarer (CreateCarerDocument createCarer50) {
		CreateCarerResponseDocument respdoc = CreateCarerResponseDocument.Factory.newInstance();
		CreateCarerResponse resp = respdoc.addNewCreateCarerResponse();
		return respdoc;
	}
	
	public CreateExternalServiceResponseDocument createExternalService (CreateExternalServiceDocument createExternalService52) {
		CreateExternalServiceResponseDocument respdoc = CreateExternalServiceResponseDocument.Factory.newInstance();
		CreateExternalServiceResponse resp = respdoc.addNewCreateExternalServiceResponse();
		return respdoc;
	}
	
	public SaveCarerAssessmentResponseDocument saveCarerAssessment (SaveCarerAssessmentDocument saveCarerAssessment54) {
		SaveCarerAssessmentResponseDocument respdoc = SaveCarerAssessmentResponseDocument.Factory.newInstance();
		SaveCarerAssessmentResponse resp = respdoc.addNewSaveCarerAssessmentResponse();
		return respdoc;
	}
	
	public DeleteCarerResponseDocument deleteCarer (DeleteCarerDocument deleteCarer56) {
		DeleteCarerResponseDocument respdoc = DeleteCarerResponseDocument.Factory.newInstance();
		DeleteCarerResponse resp = respdoc.addNewDeleteCarerResponse();
		return respdoc;
	}
	
	public CreateAdministratorResponseDocument createAdministrator (CreateAdministratorDocument createAdministrator58) {
		CreateAdministratorResponseDocument respdoc = CreateAdministratorResponseDocument.Factory.newInstance();
		CreateAdministratorResponse resp = respdoc.addNewCreateAdministratorResponse();
		return respdoc;
	}
	
	public UpdateExternalServiceResponseDocument updateExternalService (UpdateExternalServiceDocument updateExternalService60) {
		UpdateExternalServiceResponseDocument respdoc = UpdateExternalServiceResponseDocument.Factory.newInstance();
		UpdateExternalServiceResponse resp = respdoc.addNewUpdateExternalServiceResponse();
		return respdoc;
	}
	
	public GetClinicianResponseDocument getClinician (GetClinicianDocument getClinician62) {
		GetClinicianResponseDocument respdoc = GetClinicianResponseDocument.Factory.newInstance();
		GetClinicianResponse resp = respdoc.addNewGetClinicianResponse();
		return respdoc;
	}
	
	public DeletePatientAssessmentResponseDocument deletePatientAssessment (DeletePatientAssessmentDocument deletePatientAssessment64) {
		DeletePatientAssessmentResponseDocument respdoc = DeletePatientAssessmentResponseDocument.Factory.newInstance();
		DeletePatientAssessmentResponse resp = respdoc.addNewDeletePatientAssessmentResponse();
		return respdoc;
	}
	
	public GetAllExternalServicesResponseDocument getAllExternalServices (GetAllExternalServicesDocument getAllExternalServices66) {
		GetAllExternalServicesResponseDocument respdoc = GetAllExternalServicesResponseDocument.Factory.newInstance();
		GetAllExternalServicesResponse resp = respdoc.addNewGetAllExternalServicesResponse();
		return respdoc;
	}
	
	public GetCarerResponseDocument getCarer (GetCarerDocument getCarer68) {
		GetCarerResponseDocument respdoc = GetCarerResponseDocument.Factory.newInstance();
		GetCarerResponse resp = respdoc.addNewGetCarerResponse();
		return respdoc;
	}
	
	public GetAdministratorResponseDocument getAdministrator (GetAdministratorDocument getAdministrator70) {
		GetAdministratorResponseDocument respdoc = GetAdministratorResponseDocument.Factory.newInstance();
		GetAdministratorResponse resp = respdoc.addNewGetAdministratorResponse();
		return respdoc;
	}
	
	public UpdateAdministratorResponseDocument updateAdministrator (UpdateAdministratorDocument updateAdministrator72) {
		UpdateAdministratorResponseDocument respdoc = UpdateAdministratorResponseDocument.Factory.newInstance();
		UpdateAdministratorResponse resp = respdoc.addNewUpdateAdministratorResponse();
		return respdoc;
	}
	
	public GetQuestionnaireResponseDocument getQuestionnaire (GetQuestionnaireDocument getQuestionnaire74) {
		GetQuestionnaireResponseDocument respdoc = GetQuestionnaireResponseDocument.Factory.newInstance();
		GetQuestionnaireResponse resp = respdoc.addNewGetQuestionnaireResponse();
		return respdoc;
	}
	
	public StoreQuestionnaireAnswersResponseDocument storeQuestionnaireAnswers (StoreQuestionnaireAnswersDocument storeQuestionnaireAnswers76) {
		StoreQuestionnaireAnswersResponseDocument respdoc = StoreQuestionnaireAnswersResponseDocument.Factory.newInstance();
		StoreQuestionnaireAnswersResponse resp = respdoc.addNewStoreQuestionnaireAnswersResponse();
		return respdoc;
	}
	
	public GetPatientAssessmentResponseDocument getPatientAssessment (GetPatientAssessmentDocument getPatientAssessment78) {
		GetPatientAssessmentResponseDocument respdoc = GetPatientAssessmentResponseDocument.Factory.newInstance();
		GetPatientAssessmentResponse resp = respdoc.addNewGetPatientAssessmentResponse();
		return respdoc;
	}
	
	public GetCarerAssessmentResponseDocument getCarerAssessment (GetCarerAssessmentDocument getCarerAssessment80) {
		GetCarerAssessmentResponseDocument respdoc = GetCarerAssessmentResponseDocument.Factory.newInstance();
		GetCarerAssessmentResponse resp = respdoc.addNewGetCarerAssessmentResponse();
		return respdoc;
	}
	
	public ChangeTaskStatusResponseDocument changeTaskStatus (ChangeTaskStatusDocument changeTaskStatus82) {
		ChangeTaskStatusResponseDocument respdoc = ChangeTaskStatusResponseDocument.Factory.newInstance();
		ChangeTaskStatusResponse resp = respdoc.addNewChangeTaskStatusResponse();
		return respdoc;
	}
	
	public ListOfPatientsResponseDocument listOfPatients (ListOfPatientsDocument listOfPatients84) {
		ListOfPatientsResponseDocument respdoc = ListOfPatientsResponseDocument.Factory.newInstance();
		ListOfPatientsResponse resp = respdoc.addNewListOfPatientsResponse();
		return respdoc;
	}
	
	public GetWarningsResponseDocument getWarnings (GetWarningsDocument getWarnings86) {
		GetWarningsResponseDocument respdoc = GetWarningsResponseDocument.Factory.newInstance();
		GetWarningsResponse resp = respdoc.addNewGetWarningsResponse();
		return respdoc;
	}
	
	public UpdateClinicianResponseDocument updateClinician (UpdateClinicianDocument updateClinician88) {
		UpdateClinicianResponseDocument respdoc = UpdateClinicianResponseDocument.Factory.newInstance();
		UpdateClinicianResponse resp = respdoc.addNewUpdateClinicianResponse();
		return respdoc;
	}
	
	public MarkWarningAsReadResponseDocument markWarningAsRead (MarkWarningAsReadDocument markWarningAsRead90) {
		MarkWarningAsReadResponseDocument respdoc = MarkWarningAsReadResponseDocument.Factory.newInstance();
		MarkWarningAsReadResponse resp = respdoc.addNewMarkWarningAsReadResponse();
		return respdoc;
	}
}
    