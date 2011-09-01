
/**
 * StorageComponentSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.3  Built on : Nov 12, 2010 (02:24:07 CET)
 */
    package com.aladdin.sc;
    /**
     *  StorageComponentSkeletonInterface java skeleton interface for the axisService
     */
    public interface StorageComponentSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * The UpdateCarer method updates an existing record for carer using “data”. It returns the carer’s identity in the database or error-code.
                                    * @param updateCarer
         */

        
                public eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument updateCarer
                (
                  eu.aladdin_project.storagecomponent.UpdateCarerDocument updateCarer
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The UpdateUser method receives a user’s data (data) and updates it in the database. It returns a confirmation code or an error-code.
                                    * @param updateUser
         */

        
                public eu.aladdin_project.storagecomponent.UpdateUserResponseDocument updateUser
                (
                  eu.aladdin_project.storagecomponent.UpdateUserDocument updateUser
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeleteAdministrator method deletes an existing administrator record (administrator is identified by “id”). It returns the administrator’s identity from the database or an error-code.
                                    * @param deleteAdministrator
         */

        
                public eu.aladdin_project.storagecomponent.DeleteAdministratorResponseDocument deleteAdministrator
                (
                  eu.aladdin_project.storagecomponent.DeleteAdministratorDocument deleteAdministrator
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeleteUser method receives a user’s data (user) and deletes it from database. It returns a confirmation code or an error-code.
                                    * @param deleteUser
         */

        
                public eu.aladdin_project.storagecomponent.DeleteUserResponseDocument deleteUser
                (
                  eu.aladdin_project.storagecomponent.DeleteUserDocument deleteUser
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetQuestionnaireAnswersByTask method gets QuestionnaireAnswers value for the given task from the database.
                                    * @param getQuestionnaireAnswersByTask
         */

        
                public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument getQuestionnaireAnswersByTask
                (
                  eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument getQuestionnaireAnswersByTask
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The AssignTasksMassivelymethod creates a number of task for the given period of time and with given frequency. It returns the id  of the last task in the database or an error-code.
                                    * @param assignTasksMassively
         */

        
                public eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument assignTasksMassively
                (
                  eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument assignTasksMassively
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The UpdateQuestionnaire method updates the description of an existing questionnaire in the database. It returns a confirmation code or an error code.
                                    * @param updateQuestionnaire
         */

        
                public eu.aladdin_project.storagecomponent.UpdateQuestionnaireResponseDocument updateQuestionnaire
                (
                  eu.aladdin_project.storagecomponent.UpdateQuestionnaireDocument updateQuestionnaire
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ListOfQuestionnaires method returns a list of short descriptions of the available questionnaires.
                                    * @param listOfQuestionnaires
         */

        
                public eu.aladdin_project.storagecomponent.ListOfQuestionnairesResponseDocument listOfQuestionnaires
                (
                  eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument listOfQuestionnaires
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The SaveWarning method receives the warning’s data and stores it in the database. It returns the warning id in the database or an error-code.
                                    * @param saveWarning
         */

        
                public eu.aladdin_project.storagecomponent.SaveWarningResponseDocument saveWarning
                (
                  eu.aladdin_project.storagecomponent.SaveWarningDocument saveWarning
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetQuestionDescription method gets description of the question by its id from the database. It returns the value or an error-code.
                                    * @param getQuestionDescription
         */

        
                public eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument getQuestionDescription
                (
                  eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument getQuestionDescription
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ListOfCarers method selects a list of carers from database using “filter” (“filter” can restrict various parameters of carer’s profile such as name, age, id, etc.).
                                    * @param listOfCarers
         */

        
                public eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument listOfCarers
                (
                  eu.aladdin_project.storagecomponent.ListOfCarersDocument listOfCarers
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The UpdateMediaContent method updates the media content in the database. It returns the media content id in the database or an error-code.
                                    * @param updateMediaContent
         */

        
                public eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument updateMediaContent
                (
                  eu.aladdin_project.storagecomponent.UpdateMediaContentDocument updateMediaContent
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetSystemParameterListreturns the list of the system parameter of given type and for given locale.
                                    * @param getSystemParameterList
         */

        
                public eu.aladdin_project.storagecomponent.GetSystemParameterListResponseDocument getSystemParameterList
                (
                  eu.aladdin_project.storagecomponent.GetSystemParameterListDocument getSystemParameterList
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetCarerAssessments method receives the carer’s identity (“id”) and returns her/his assessment’s data or an error-code.
                                    * @param getCarerAssessments
         */

        
                public eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument getCarerAssessments
                (
                  eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument getCarerAssessments
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The AddMediaContent method adds the media content in the database. It returns the media content id in the database or an error-code.
                                    * @param addMediaContent
         */

        
                public eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument addMediaContent
                (
                  eu.aladdin_project.storagecomponent.AddMediaContentDocument addMediaContent
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ListOfClinicians method selects a list of clinicians from database using “filter” (“filter” can restrict various parameters of clinician’s profile such as name, age, id, etc.).
                                    * @param listOfClinicians
         */

        
                public eu.aladdin_project.storagecomponent.ListOfCliniciansResponseDocument listOfClinicians
                (
                  eu.aladdin_project.storagecomponent.ListOfCliniciansDocument listOfClinicians
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Get type of the user by its id.
                                    * @param getUserType
         */

        
                public eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument getUserType
                (
                  eu.aladdin_project.storagecomponent.GetUserTypeDocument getUserType
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The SavePatientAssessment method receives the assessment data for a patient (”assessment”), stores it in the database and returns the assessment’s identity or an error-code.
                                    * @param savePatientAssessment
         */

        
                public eu.aladdin_project.storagecomponent.SavePatientAssessmentResponseDocument savePatientAssessment
                (
                  eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument savePatientAssessment
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The StoreMeasurements method receives an array of measurements (data) and stores it in the database. It returns a new record’s identity or an error-code.
                                    * @param storeMeasurements
         */

        
                public eu.aladdin_project.storagecomponent.StoreMeasurementsResponseDocument storeMeasurements
                (
                  eu.aladdin_project.storagecomponent.StoreMeasurementsDocument storeMeasurements
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeletePatient method deletes an existing patient record (patient identified by “id”). It returns the patient’s identity from the database or an error-code.
                                    * @param getPatient
         */

        
                public eu.aladdin_project.storagecomponent.GetPatientResponseDocument getPatient
                (
                  eu.aladdin_project.storagecomponent.GetPatientDocument getPatient
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeleteCarerAssessment method deletes an existing assessment from the database (assessment is identified by assessmentId), returns the assessment’s identity or an error-code.
                                    * @param deleteCarerAssessment
         */

        
                public eu.aladdin_project.storagecomponent.DeleteCarerAssessmentResponseDocument deleteCarerAssessment
                (
                  eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument deleteCarerAssessment
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The CreateClinician method creates a new record for the clinician using “data”. It returns the clinician’s identity from the database or an error-code.
                                    * @param createClinician
         */

        
                public eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument createClinician
                (
                  eu.aladdin_project.storagecomponent.CreateClinicianDocument createClinician
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The Auth method performs the user’s authentication based on login and password. It returns a user’s id in case of success, error-code otherwise.
                                    * @param auth
         */

        
                public eu.aladdin_project.storagecomponent.AuthResponseDocument auth
                (
                  eu.aladdin_project.storagecomponent.AuthDocument auth
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetQuestionnaireAnswers method returns from the database the questionnaire answers about the person with a given ID (ObjectId) for the requested date range (fromDate, toDate)
                                    * @param getQuestionnaireAnswers
         */

        
                public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument getQuestionnaireAnswers
                (
                  eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersDocument getQuestionnaireAnswers
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeleteExternalService method deletes an existing external service record (service is identified by “id”). It returns service’s identity from the database or an error-code.
                                    * @param deleteExternalService
         */

        
                public eu.aladdin_project.storagecomponent.DeleteExternalServiceResponseDocument deleteExternalService
                (
                  eu.aladdin_project.storagecomponent.DeleteExternalServiceDocument deleteExternalService
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeleteClinician method deletes an existing clinician record (clinician is identified by “id”). It returns the clinician’s identity from the database or an error-code.
                                    * @param deleteClinician
         */

        
                public eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument deleteClinician
                (
                  eu.aladdin_project.storagecomponent.DeleteClinicianDocument deleteClinician
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The UpdateSystemParametermethod updates the system parameter. It returns the parameter id in the database or an error-code.
                                    * @param updateSystemParameter
         */

        
                public eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument updateSystemParameter
                (
                  eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument updateSystemParameter
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetUserIdByPersonId method receives a person’s identity and person’s type and returns corresponded user id or an error-code.
                                    * @param getUserIdByPersonId
         */

        
                public eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument getUserIdByPersonId
                (
                  eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument getUserIdByPersonId
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ChangePassword method updates the password for the user identified by “userId”, if the requestor identified by “requestorId” has permissions for that. The method returns a confirmation code or an error-code.
                                    * @param changePassword
         */

        
                public eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument changePassword
                (
                  eu.aladdin_project.storagecomponent.ChangePasswordDocument changePassword
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeletePatient method deletes an existing patient record (patient identified by “id”). It returns the patient’s identity from the database or an error-code.
                                    * @param deletePatient
         */

        
                public eu.aladdin_project.storagecomponent.DeletePatientResponseDocument deletePatient
                (
                  eu.aladdin_project.storagecomponent.DeletePatientDocument deletePatient
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetMediaContent method gets the media content from the database by its id.
                                    * @param getMediaContent
         */

        
                public eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument getMediaContent
                (
                  eu.aladdin_project.storagecomponent.GetMediaContentDocument getMediaContent
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The getAvailableCarers method returns list of carers that are not binded for the any patient.
                                    * @param getAvailableCarers
         */

        
                public eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument getAvailableCarers
                (
                  eu.aladdin_project.storagecomponent.GetAvailableCarersDocument getAvailableCarers
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetMeasurement method filters measurements by its parameters and return the list of filtered items.
                                    * @param getMeasurement
         */

        
                public eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument getMeasurement
                (
                  eu.aladdin_project.storagecomponent.GetMeasurementDocument getMeasurement
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The CreateQuestionnaire method saves a new questionnaire in the database. It returns a confirmation code or an error code.
                                    * @param createQuestionnaire
         */

        
                public eu.aladdin_project.storagecomponent.CreateQuestionnaireResponseDocument createQuestionnaire
                (
                  eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument createQuestionnaire
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetPatientsForCaregiver returns the list of patient for that this is caregiver is responded.
                                    * @param getPatientsForCaregiver
         */

        
                public eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument getPatientsForCaregiver
                (
                  eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument getPatientsForCaregiver
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The RemoveTaskMassivelymethod removes tasks of given type for given patient for the given period of time. It returns the id of the last deleted task in the database or an error-code.
                                    * @param removeTaskMassively
         */

        
                public eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument removeTaskMassively
                (
                  eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument removeTaskMassively
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetPatientMeasurements method receives the patient’s identity (PatientId), the measurement’s type (MeasurementType), the date range (fromDate, toDate) and returns the corresponding records from the database.
                                    * @param getPatientMeasurement
         */

        
                public eu.aladdin_project.storagecomponent.GetPatientMeasurementResponseDocument getPatientMeasurement
                (
                  eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument getPatientMeasurement
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The UpdatePatient method updates an existing patient record using “data”. It returns the patient’s identity from the database or error-code.
                                    * @param updatePatient
         */

        
                public eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument updatePatient
                (
                  eu.aladdin_project.storagecomponent.UpdatePatientDocument updatePatient
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ListOfSupportedLocales method gets the list of locales that are supported by the Storage Component.
                                    * @param listOfSupportedLocales
         */

        
                public eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument listOfSupportedLocales
                (
                  eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument listOfSupportedLocales
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeleteQuestionnaire method deletes from the database the questionnaire identified by the provided unique id.
                                    * @param deleteQuestionnaire
         */

        
                public eu.aladdin_project.storagecomponent.DeleteQuestionnaireResponseDocument deleteQuestionnaire
                (
                  eu.aladdin_project.storagecomponent.DeleteQuestionnaireDocument deleteQuestionnaire
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The AssingTask method receives a task’s description (task) and stores it in the database. It returns a new record’s identity or an error-code.
                                    * @param assignTask
         */

        
                public eu.aladdin_project.storagecomponent.AssignTaskResponseDocument assignTask
                (
                  eu.aladdin_project.storagecomponent.AssignTaskDocument assignTask
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The CreatePatient method creates a new record for the patient using “data”. It returns the patient’s identity from the database or an error-code. There are following error codes:
 “-1” Operation is not permitted
“-2” Database error.
                                    * @param createPatient
         */

        
                public eu.aladdin_project.storagecomponent.CreatePatientResponseDocument createPatient
                (
                  eu.aladdin_project.storagecomponent.CreatePatientDocument createPatient
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ListOfAdministrators method selects a list of administrators from database using “filter” (“filter” can restrict various parameters of the administrator’s profile, such as name, id, etc.).
                                    * @param listOfAdministrators
         */

        
                public eu.aladdin_project.storagecomponent.ListOfAdministratorsResponseDocument listOfAdministrators
                (
                  eu.aladdin_project.storagecomponent.ListOfAdministratorsDocument listOfAdministrators
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetTask method returns task by its id for the given locale.
                                    * @param getTask
         */

        
                public eu.aladdin_project.storagecomponent.GetTaskResponseDocument getTask
                (
                  eu.aladdin_project.storagecomponent.GetTaskDocument getTask
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetUserPlannedTasks method receives the user’s id, range of time (fromData, toDate) and returns the list of tasks for the user.
                                    * @param getUserPlannedTasks
         */

        
                public eu.aladdin_project.storagecomponent.GetUserPlannedTasksResponseDocument getUserPlannedTasks
                (
                  eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument getUserPlannedTasks
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ListOfPossibleTasks method receives the user type (userType) and returns a list of permitted tasks for this user type.
                                    * @param listOfPossibleTasks
         */

        
                public eu.aladdin_project.storagecomponent.ListOfPossibleTasksResponseDocument listOfPossibleTasks
                (
                  eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument listOfPossibleTasks
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The CreateCarer method creates a new record for carer using “data”. It returns the carer’s identity from the database or an error-code.
                                    * @param createCarer
         */

        
                public eu.aladdin_project.storagecomponent.CreateCarerResponseDocument createCarer
                (
                  eu.aladdin_project.storagecomponent.CreateCarerDocument createCarer
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The getQuestionnaireAnswerValue method reads value for the given question for the given locale.
                                    * @param getQuestionnaireAnswerValue
         */

        
                public eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument getQuestionnaireAnswerValue
                (
                  eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument getQuestionnaireAnswerValue
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The CreateExternalService method creates a new record for the external service using “data”. It returns the service’s identity from the database or error-code.
                                    * @param createExternalService
         */

        
                public eu.aladdin_project.storagecomponent.CreateExternalServiceResponseDocument createExternalService
                (
                  eu.aladdin_project.storagecomponent.CreateExternalServiceDocument createExternalService
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The SaveCarerAssessment method receives assessment data for a carer (”assessment”), stores it in the database and returns the assessment’s identity or an error-code.
                                    * @param saveCarerAssessment
         */

        
                public eu.aladdin_project.storagecomponent.SaveCarerAssessmentResponseDocument saveCarerAssessment
                (
                  eu.aladdin_project.storagecomponent.SaveCarerAssessmentDocument saveCarerAssessment
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeleteCarer method deletes an existing record for the carer (carer is identified by “id”). It returns carer’s identity from the database or an error-code.
                                    * @param deleteCarer
         */

        
                public eu.aladdin_project.storagecomponent.DeleteCarerResponseDocument deleteCarer
                (
                  eu.aladdin_project.storagecomponent.DeleteCarerDocument deleteCarer
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The CreateAdministrator method creates a new record for the administrator using “data”. It returns the administrator’s identity from the database or an error-code.
                                    * @param createAdministrator
         */

        
                public eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument createAdministrator
                (
                  eu.aladdin_project.storagecomponent.CreateAdministratorDocument createAdministrator
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The UpdateExternalService method updates an existing record for the external service using “data”. It returns the service’s identity from the database or an error-code.
                                    * @param updateExternalService
         */

        
                public eu.aladdin_project.storagecomponent.UpdateExternalServiceResponseDocument updateExternalService
                (
                  eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument updateExternalService
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetPatientAssessments method receives the patient’s identity (“id”) and returns her/his assessment’s data or an error-code.
                                    * @param getPatientAssessments
         */

        
                public eu.aladdin_project.storagecomponent.GetPatientAssessmentsResponseDocument getPatientAssessments
                (
                  eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument getPatientAssessments
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetClinician method selects a clinician from database using “id”.
                                    * @param getClinician
         */

        
                public eu.aladdin_project.storagecomponent.GetClinicianResponseDocument getClinician
                (
                  eu.aladdin_project.storagecomponent.GetClinicianDocument getClinician
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeletePatientAssessment method deletes an existing assessment from the database (identified by assessmentId), returns the assessment’s identity or an error-code.
                                    * @param deletePatientAssessment
         */

        
                public eu.aladdin_project.storagecomponent.DeletePatientAssessmentResponseDocument deletePatientAssessment
                (
                  eu.aladdin_project.storagecomponent.DeletePatientAssessmentDocument deletePatientAssessment
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetExternalService method selects all external services from the database.
                                    * @param getAllExternalServices
         */

        
                public eu.aladdin_project.storagecomponent.GetAllExternalServicesResponseDocument getAllExternalServices
                (
                  eu.aladdin_project.storagecomponent.GetAllExternalServicesDocument getAllExternalServices
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetCarer method selects a carer from database using “id”.
                                    * @param getCarer
         */

        
                public eu.aladdin_project.storagecomponent.GetCarerResponseDocument getCarer
                (
                  eu.aladdin_project.storagecomponent.GetCarerDocument getCarer
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetAdministrator method selects an administrator from the database using “id”.
                                    * @param getAdministrator
         */

        
                public eu.aladdin_project.storagecomponent.GetAdministratorResponseDocument getAdministrator
                (
                  eu.aladdin_project.storagecomponent.GetAdministratorDocument getAdministrator
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The UpdateAdministrator method updates an existing administrator record using “data”. It returns the administrator’s identity from the database or an error-code.
                                    * @param updateAdministrator
         */

        
                public eu.aladdin_project.storagecomponent.UpdateAdministratorResponseDocument updateAdministrator
                (
                  eu.aladdin_project.storagecomponent.UpdateAdministratorDocument updateAdministrator
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetQuestionnaire method returns the questionnaire description identified by the provided unique id.
                                    * @param getQuestionnaire
         */

        
                public eu.aladdin_project.storagecomponent.GetQuestionnaireResponseDocument getQuestionnaire
                (
                  eu.aladdin_project.storagecomponent.GetQuestionnaireDocument getQuestionnaire
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The StoreQuestionnaireAnswers method receives the answers for a questionnaire (“data”) and stores them in the database. It returns a new record’s identity or an error-code.
                                    * @param storeQuestionnaireAnswers
         */

        
                public eu.aladdin_project.storagecomponent.StoreQuestionnaireAnswersResponseDocument storeQuestionnaireAnswers
                (
                  eu.aladdin_project.storagecomponent.StoreQuestionnaireAnswersDocument storeQuestionnaireAnswers
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ChangeTaskStatus method receives the task’s identity (TaskId) and the status (TaskStatus) that should be applied. It returns the task’s identity or an error-code.
                                    * @param changeTaskStatus
         */

        
                public eu.aladdin_project.storagecomponent.ChangeTaskStatusResponseDocument changeTaskStatus
                (
                  eu.aladdin_project.storagecomponent.ChangeTaskStatusDocument changeTaskStatus
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The ListOfPatients method selects a list of patients from the database using “filter” (“filter” can restrict various parameters of the patient’s profile such as name, age, id, etc.).
                                    * @param listOfPatients
         */

        
                public eu.aladdin_project.storagecomponent.ListOfPatientsResponseDocument listOfPatients
                (
                  eu.aladdin_project.storagecomponent.ListOfPatientsDocument listOfPatients
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetWarnings method returns the warnings from the database using “filter” (“filter” can restrict various parameters of the warning, such as risk level, patient, etc.).
                                    * @param getWarnings
         */

        
                public eu.aladdin_project.storagecomponent.GetWarningsResponseDocument getWarnings
                (
                  eu.aladdin_project.storagecomponent.GetWarningsDocument getWarnings
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The CreateUser method receives a user’s data and stores it in the database. It returns a new record’s identity or an error-code.
                                    * @param createUser
         */

        
                public eu.aladdin_project.storagecomponent.CreateUserResponseDocument createUser
                (
                  eu.aladdin_project.storagecomponent.CreateUserDocument createUser
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The UpdateClinician method updates an existing clinician record using “data”. It returns the clinician’s identity from the database or an error-code.
                                    * @param updateClinician
         */

        
                public eu.aladdin_project.storagecomponent.UpdateClinicianResponseDocument updateClinician
                (
                  eu.aladdin_project.storagecomponent.UpdateClinicianDocument updateClinician
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The GetUser method receives a user’s identity (userId) and returns user’s data.
                                    * @param getUser
         */

        
                public eu.aladdin_project.storagecomponent.GetUserResponseDocument getUser
                (
                  eu.aladdin_project.storagecomponent.GetUserDocument getUser
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The MarkWarningAsRead method marks the warning as read in the database. It returns the warning id in the database or an error-code.
                                    * @param markWarningAsRead
         */

        
                public eu.aladdin_project.storagecomponent.MarkWarningAsReadResponseDocument markWarningAsRead
                (
                  eu.aladdin_project.storagecomponent.MarkWarningAsReadDocument markWarningAsRead
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * The DeleteMediaContent method removes the media content from the database by its id. It returns the media content id in the database or an error-code.
                                    * @param deleteMediaContent
         */

        
                public eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument deleteMediaContent
                (
                  eu.aladdin_project.storagecomponent.DeleteMediaContentDocument deleteMediaContent
                 )
            ;
        
         }
    