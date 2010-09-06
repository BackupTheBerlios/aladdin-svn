/**
 * StorageComponent_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.StorageComponent;

public interface StorageComponent_PortType extends java.rmi.Remote {
    public eu.aladdin_project.xsd.OperationResult createPatient(eu.aladdin_project.xsd.Patient data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult updatePatient(eu.aladdin_project.xsd.Patient data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deletePatient(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.Patient getPatient(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.PatientInfo[] listOfPatients(eu.aladdin_project.xsd.SearchCriteria[] filter, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult createAdministrator(eu.aladdin_project.xsd.Administrator data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult updateAdministrator(eu.aladdin_project.xsd.Administrator data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deleteAdministrator(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.Administrator getAdministrator(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.AdministratorInfo[] listOfAdministrators(eu.aladdin_project.xsd.SearchCriteria[] filter, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult createCarer(eu.aladdin_project.xsd.Carer data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult updateCarer(eu.aladdin_project.xsd.Carer data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deleteCarer(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.Carer getCarer(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.CarerInfo[] listOfCarers(eu.aladdin_project.xsd.SearchCriteria[] filter, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult createClinician(eu.aladdin_project.xsd.Clinician data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult updateClinician(eu.aladdin_project.xsd.Clinician data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deleteClinician(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.Clinician getClinician(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.ClinicianInfo[] listOfClinicians(eu.aladdin_project.xsd.SearchCriteria[] filter, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.Task[] getUserPlannedTasks(java.lang.String userId, java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String requesterId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult storeMeasurements(eu.aladdin_project.xsd.Measurement[] data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.Measurement[] getPatientMeasurement(java.lang.String patientId, int measurementType, java.util.Calendar fromData, java.util.Calendar toData, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult changeTaskStatus(int taskId, int taskStatus, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult assignTask(eu.aladdin_project.xsd.Task task, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.SystemParameter[] listOfPossibleTasks(int userType) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult storeQuestionnaireAnswers(eu.aladdin_project.xsd.QuestionnaireAnswer[] data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.QuestionnaireInfo[] listOfQuestionnaires(java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.QuestionnaireQuestion[] getQuestionnaire(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult updateQuestionnaire(eu.aladdin_project.xsd.QuestionnaireQuestion[] data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult createQuestionnaire(eu.aladdin_project.xsd.QuestionnaireQuestion[] data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deleteQuestionnaire(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.QuestionnaireAnswer[][] getQuestionnaireAnswers(java.lang.String objectId, java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult savePatientAssessment(eu.aladdin_project.xsd.PatientAssessment assessment, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult saveCarerAssessment(eu.aladdin_project.xsd.CarerAssessment assessment, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deletePatientAssessment(java.lang.String assessmentId, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deleteCarerAssessment(java.lang.String assessmentId, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.PatientAssessment[] getPatientAssessments(java.lang.String patientId, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.CarerAssessment[] getCarerAssessments(java.lang.String carerId, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult createExternalService(eu.aladdin_project.xsd.ExternalService data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult updateExternalService(eu.aladdin_project.xsd.ExternalService data, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deleteExternalService(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.ExternalService[] getAllExternalServices(java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult saveWarning(eu.aladdin_project.xsd.Warning warn, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.Warning[] getWarnings(eu.aladdin_project.xsd.SearchCriteria[] warn, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult markWarningAsRead(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult createUser(eu.aladdin_project.xsd.User user) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult deleteUser(java.lang.String id) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult updateUser(eu.aladdin_project.xsd.User user) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult changePassword(java.lang.String userId, java.lang.String password, java.lang.String reqId) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult auth(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException;
    public eu.aladdin_project.xsd.OperationResult getUserType(java.lang.String id) throws java.rmi.RemoteException;
}
