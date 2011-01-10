package eu.aladdin_project.StorageComponent;

public class StorageComponentProxy implements eu.aladdin_project.StorageComponent.StorageComponent_PortType {
  private String _endpoint = null;
  private eu.aladdin_project.StorageComponent.StorageComponent_PortType storageComponent_PortType = null;
  
  public StorageComponentProxy() {
    _initStorageComponentProxy();
  }
  
  public StorageComponentProxy(String endpoint) {
    _endpoint = endpoint;
    _initStorageComponentProxy();
  }
  
  private void _initStorageComponentProxy() {
    try {
      storageComponent_PortType = (new eu.aladdin_project.StorageComponent.StorageComponent_ServiceLocator()).getStorageComponentSOAP();
      if (storageComponent_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)storageComponent_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)storageComponent_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (storageComponent_PortType != null)
      ((javax.xml.rpc.Stub)storageComponent_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public eu.aladdin_project.StorageComponent.StorageComponent_PortType getStorageComponent_PortType() {
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType;
  }
  
  public eu.aladdin_project.xsd.OperationResult createPatient(eu.aladdin_project.xsd.Patient data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.createPatient(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult updatePatient(eu.aladdin_project.xsd.Patient data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.updatePatient(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult deletePatient(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deletePatient(id, userId);
  }
  
  public eu.aladdin_project.xsd.Patient getPatient(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getPatient(id, userId);
  }
  
  public eu.aladdin_project.xsd.PatientInfo[] listOfPatients(eu.aladdin_project.xsd.SearchCriteria[] filter, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.listOfPatients(filter, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult createAdministrator(eu.aladdin_project.xsd.Administrator data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.createAdministrator(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult updateAdministrator(eu.aladdin_project.xsd.Administrator data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.updateAdministrator(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult deleteAdministrator(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deleteAdministrator(id, userId);
  }
  
  public eu.aladdin_project.xsd.Administrator getAdministrator(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getAdministrator(id, userId);
  }
  
  public eu.aladdin_project.xsd.AdministratorInfo[] listOfAdministrators(eu.aladdin_project.xsd.SearchCriteria[] filter, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.listOfAdministrators(filter, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult createCarer(eu.aladdin_project.xsd.Carer data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.createCarer(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult updateCarer(eu.aladdin_project.xsd.Carer data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.updateCarer(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult deleteCarer(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deleteCarer(id, userId);
  }
  
  public eu.aladdin_project.xsd.Carer getCarer(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getCarer(id, userId);
  }
  
  public eu.aladdin_project.xsd.CarerInfo[] listOfCarers(eu.aladdin_project.xsd.SearchCriteria[] filter, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.listOfCarers(filter, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult createClinician(eu.aladdin_project.xsd.Clinician data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.createClinician(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult updateClinician(eu.aladdin_project.xsd.Clinician data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.updateClinician(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult deleteClinician(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deleteClinician(id, userId);
  }
  
  public eu.aladdin_project.xsd.Clinician getClinician(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getClinician(id, userId);
  }
  
  public eu.aladdin_project.xsd.ClinicianInfo[] listOfClinicians(eu.aladdin_project.xsd.SearchCriteria[] filter, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.listOfClinicians(filter, userId);
  }
  
  public eu.aladdin_project.xsd.Task[] getUserPlannedTasks(java.lang.String userId, java.util.Calendar fromDate, java.util.Calendar toDate, eu.aladdin_project.xsd.SystemParameter locale, java.lang.String requesterId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getUserPlannedTasks(userId, fromDate, toDate, locale, requesterId);
  }
  
  public eu.aladdin_project.xsd.OperationResult storeMeasurements(eu.aladdin_project.xsd.Measurement[] data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.storeMeasurements(data, userId);
  }
  
  public eu.aladdin_project.xsd.Measurement[] getPatientMeasurement(java.lang.String patientId, int measurementType, java.util.Calendar fromData, java.util.Calendar toData, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getPatientMeasurement(patientId, measurementType, fromData, toData, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult changeTaskStatus(int taskId, int taskStatus, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.changeTaskStatus(taskId, taskStatus, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult assignTask(eu.aladdin_project.xsd.Task task, eu.aladdin_project.xsd.SystemParameter locale, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.assignTask(task, locale, userId);
  }
  
  public eu.aladdin_project.xsd.SystemParameter[] listOfPossibleTasks(int userType) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.listOfPossibleTasks(userType);
  }
  
  public eu.aladdin_project.xsd.OperationResult storeQuestionnaireAnswers(eu.aladdin_project.xsd.QuestionnaireAnswers data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.storeQuestionnaireAnswers(data, userId);
  }
  
  public eu.aladdin_project.xsd.QuestionnaireInfo[] listOfQuestionnaires(eu.aladdin_project.xsd.SystemParameter locale, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.listOfQuestionnaires(locale, userId);
  }
  
  public eu.aladdin_project.xsd.Questionnaire getQuestionnaire(java.lang.String id, eu.aladdin_project.xsd.SystemParameter locale, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getQuestionnaire(id, locale, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult updateQuestionnaire(eu.aladdin_project.xsd.Questionnaire data, eu.aladdin_project.xsd.SystemParameter locale, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.updateQuestionnaire(data, locale, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult createQuestionnaire(eu.aladdin_project.xsd.Questionnaire data, eu.aladdin_project.xsd.SystemParameter locale, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.createQuestionnaire(data, locale, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult deleteQuestionnaire(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deleteQuestionnaire(id, userId);
  }
  
  public eu.aladdin_project.xsd.QuestionnaireAnswers[] getQuestionnaireAnswers(java.lang.String objectId, java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getQuestionnaireAnswers(objectId, fromDate, toDate, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult savePatientAssessment(eu.aladdin_project.xsd.PatientAssessment assessment, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.savePatientAssessment(assessment, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult saveCarerAssessment(eu.aladdin_project.xsd.CarerAssessment assessment, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.saveCarerAssessment(assessment, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult deletePatientAssessment(java.lang.String assessmentId, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deletePatientAssessment(assessmentId, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult deleteCarerAssessment(java.lang.String assessmentId, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deleteCarerAssessment(assessmentId, userId);
  }
  
  public eu.aladdin_project.xsd.PatientAssessment[] getPatientAssessments(java.lang.String patientId, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getPatientAssessments(patientId, userId);
  }
  
  public eu.aladdin_project.xsd.CarerAssessment[] getCarerAssessments(java.lang.String carerId, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getCarerAssessments(carerId, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult createExternalService(eu.aladdin_project.xsd.ExternalService data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.createExternalService(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult updateExternalService(eu.aladdin_project.xsd.ExternalService data, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.updateExternalService(data, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult deleteExternalService(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deleteExternalService(id, userId);
  }
  
  public eu.aladdin_project.xsd.ExternalService[] getAllExternalServices(java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getAllExternalServices(userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult saveWarning(eu.aladdin_project.xsd.Warning warn, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.saveWarning(warn, userId);
  }
  
  public eu.aladdin_project.xsd.Warning[] getWarnings(eu.aladdin_project.xsd.SearchCriteria[] warn, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getWarnings(warn, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult markWarningAsRead(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.markWarningAsRead(id, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult createUser(eu.aladdin_project.xsd.User user) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.createUser(user);
  }
  
  public eu.aladdin_project.xsd.OperationResult deleteUser(java.lang.String id) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.deleteUser(id);
  }
  
  public eu.aladdin_project.xsd.OperationResult updateUser(eu.aladdin_project.xsd.User user) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.updateUser(user);
  }
  
  public eu.aladdin_project.xsd.OperationResult changePassword(java.lang.String userId, java.lang.String password, java.lang.String reqId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.changePassword(userId, password, reqId);
  }
  
  public eu.aladdin_project.xsd.OperationResult auth(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.auth(login, password);
  }
  
  public eu.aladdin_project.xsd.OperationResult getUserType(java.lang.String id) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getUserType(id);
  }
  
  public eu.aladdin_project.xsd.SystemParameter[] getSystemParameterList(int type, eu.aladdin_project.xsd.SystemParameter locale) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getSystemParameterList(type, locale);
  }
  
  public eu.aladdin_project.xsd.User getUser(java.lang.String id) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getUser(id);
  }
  
  public eu.aladdin_project.xsd.PatientInfo[] getPatientsForCaregiver(java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getPatientsForCaregiver(userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult getUserIdByPersonId(java.lang.String id, int type, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.getUserIdByPersonId(id, type, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult updateSystemParameter(int type, eu.aladdin_project.xsd.SystemParameter value, eu.aladdin_project.xsd.SystemParameter locale) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.updateSystemParameter(type, value, locale);
  }
  
  public eu.aladdin_project.xsd.OperationResult assignTasksMassively(eu.aladdin_project.xsd.Task task, java.util.Date startDate, java.util.Date endDate, java.math.BigInteger frequency, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.assignTasksMassively(task, startDate, endDate, frequency, userId);
  }
  
  public eu.aladdin_project.xsd.OperationResult removeTaskMassively(java.lang.String patientId, java.math.BigInteger typeOfTask, java.util.Date startDate, java.util.Date endDate, java.lang.String userId) throws java.rmi.RemoteException{
    if (storageComponent_PortType == null)
      _initStorageComponentProxy();
    return storageComponent_PortType.removeTaskMassively(patientId, typeOfTask, startDate, endDate, userId);
  }
  
  
}