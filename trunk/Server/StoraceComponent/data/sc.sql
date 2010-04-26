CREATE TABLE "SystemParameter"(
id serial
, "Code" int
, "Description" text
, CONSTRAINT SystemParameter_pkey PRIMARY KEY (id));
CREATE TABLE "typeT"(
id serial
, "Code" int
, "Description" text
, CONSTRAINT typeT_pkey PRIMARY KEY (id));
CREATE TABLE "user"(
id serial
, "login" text
, "password" text
, "type" int
, CONSTRAINT user_pkey PRIMARY KEY (id));
CREATE TABLE "service"(
id serial
, "name" text
, CONSTRAINT service_pkey PRIMARY KEY (id));
CREATE TABLE "right"(
id serial
, "srv" int
, "usr" int
, CONSTRAINT right_pkey PRIMARY KEY (id));
CREATE TABLE "Identifier"(
id serial
, "Type" text
, "Number" text
, "IssueDate" text
, "IssueAuthority" text
, "persondata" int
, CONSTRAINT Identifier_pkey PRIMARY KEY (id));
CREATE TABLE "Address"(
id serial
, "Street" text
, "StreetNo" text
, "City" text
, "County" text
, "Country" text
, "ZipCode" text
, "Notes" text
, "IsPrimary" boolean
, "persondata" int
, CONSTRAINT Address_pkey PRIMARY KEY (id));
CREATE TABLE "Communication"(
id serial
, "Type" text
, "Value" text
, "Notes" text
, "IsPrimary" boolean
, "persondata" int
, CONSTRAINT Communication_pkey PRIMARY KEY (id));
CREATE TABLE "GenderT"(
id serial
, "Code" int
, "Description" text
, CONSTRAINT GenderT_pkey PRIMARY KEY (id));
CREATE TABLE "MaritalStatusT"(
id serial
, "Code" int
, "Description" text
, CONSTRAINT MaritalStatusT_pkey PRIMARY KEY (id));
CREATE TABLE "LivingWithT"(
id serial
, "Code" int
, "Description" text
, CONSTRAINT LivingWithT_pkey PRIMARY KEY (id));
CREATE TABLE "SocioDemographicData"(
id serial
, "Age" int
, "Gender" int
, "MaritalStatus" int
, "Children" int
, "LivingWith" int
, CONSTRAINT SocioDemographicData_pkey PRIMARY KEY (id));
CREATE TABLE "PersonData"(
id serial
, "Surname" text
, "Name" text
, CONSTRAINT PersonData_pkey PRIMARY KEY (id));
CREATE TABLE "Clinician"(
id serial
, "persondata" int
, CONSTRAINT Clinician_pkey PRIMARY KEY (id));
CREATE TABLE "Carer"(
id serial
, "persondata" int
, "sd" int
, CONSTRAINT Carer_pkey PRIMARY KEY (id));
CREATE TABLE "Questionnaire"(
id serial
, "version" decimal
, CONSTRAINT Questionnaire_pkey PRIMARY KEY (id));
CREATE TABLE "QuestionnaireQuestion"(
id serial
, "type" text
, "isPrimary" boolean
, "subquetsions" boolean
, "parentid" int
, "title" text
, "quest" int
, CONSTRAINT QuestionnaireQuestion_pkey PRIMARY KEY (id));
CREATE TABLE "QuestionnaireQuestionAnswer"(
id serial
, "value" int
, "description" text
, "question" int
, CONSTRAINT QuestionnaireQuestionAnswer_pkey PRIMARY KEY (id));
CREATE TABLE "QuestionnaireAnswer"(
id serial
, "question" int
, "value" text
, CONSTRAINT QuestionnaireAnswer_pkey PRIMARY KEY (id));
CREATE TABLE "Note"(
id serial
, "DateTimeOfNote" timestamp
, "text" text
, CONSTRAINT Note_pkey PRIMARY KEY (id));
CREATE TABLE "TaskTypeT"(
id serial
, "Code" int
, "Description" text
, CONSTRAINT TaskTypeT_pkey PRIMARY KEY (id));
CREATE TABLE "TaskStatusT"(
id serial
, "Code" int
, "Description" text
, CONSTRAINT TaskStatusT_pkey PRIMARY KEY (id));
CREATE TABLE "Task"(
id serial
, "TaskType" int
, "DateTimeAssigned" timestamp
, "DateTimeFulfilled" timestamp
, "TaskStatus" int
, "url" text
, "questionnaire" int
, CONSTRAINT Task_pkey PRIMARY KEY (id));
CREATE TABLE "CarerAssessment"(
id serial
, "carer" int
, "DateOfAssessment" timestamp
, "RelevantHealthProblem" text
, "SeverityOfBurden" int
, "EmotionalOrMentalDisorder" text
, "PsychoactiveDrugs" text
, "QualityOfLife" int
, CONSTRAINT CarerAssessment_pkey PRIMARY KEY (id));
CREATE TABLE "AetologyT"(
id serial
, "Code" int
, "Description" text
, CONSTRAINT AetologyT_pkey PRIMARY KEY (id));
CREATE TABLE "PatientAssessment"(
id serial
, "patient" int
, "DateOfAssessment" timestamp
, "Aetology" int
, "TimeElapsedSinceDiagnose" int
, "Severity" int
, "RelevantPathologyAntecedents" text
, "Comorbidity" text
, "CharlsonComobodityIndex" int
, "BarthelIndex" int
, "LawtonIndex" int
, "MMSE" int
, "MDRS" int
, "BlessedScalePart1" decimal
, "BlessedScalePart2" int
, "BlessedScalePart3" int
, "ChecklistMBPC" int
, "NPQISeverity" int
, "NPQIStress" int
, "GDS" int
, "Falls" boolean
, "Incontinence" boolean
, "Delirium" boolean
, "Immobility" boolean
, "SensorialDeficits" boolean
, "PharmacologyTreatment" text
, CONSTRAINT PatientAssessment_pkey PRIMARY KEY (id));
CREATE TABLE "Patient"(
id serial
, "persondata" int
, "sd" int
, "clinician" int
, CONSTRAINT Patient_pkey PRIMARY KEY (id));
CREATE TABLE "PatientCarer"(
id serial
, "patient" int
, "carer" int
, "isprimary" boolean
, CONSTRAINT PatientCarer_pkey PRIMARY KEY (id));
CREATE TABLE "Measurment"(
id serial
, "type" text
, "value" decimal
, "datetime" timestamp
, "units" text
, "lowerlimit" decimal
, "upperlimit" decimal
, "pa" int
, CONSTRAINT Measurment_pkey PRIMARY KEY (id));
ALTER TABLE "user" ADD CONSTRAINT fusertypeTtype FOREIGN KEY ("type") REFERENCES "typeT"(id);
ALTER TABLE "right" ADD CONSTRAINT frightservicesrv FOREIGN KEY ("srv") REFERENCES "service"(id);
ALTER TABLE "right" ADD CONSTRAINT frightuserusr FOREIGN KEY ("usr") REFERENCES "user"(id);
ALTER TABLE "Identifier" ADD CONSTRAINT fIdentifierPersonDatapersondata FOREIGN KEY ("persondata") REFERENCES "PersonData"(id);
ALTER TABLE "Address" ADD CONSTRAINT fAddressPersonDatapersondata FOREIGN KEY ("persondata") REFERENCES "PersonData"(id);
ALTER TABLE "Communication" ADD CONSTRAINT fCommunicationPersonDatapersondata FOREIGN KEY ("persondata") REFERENCES "PersonData"(id);
ALTER TABLE "SocioDemographicData" ADD CONSTRAINT fSocioDemographicDataGenderTGender FOREIGN KEY ("Gender") REFERENCES "GenderT"(id);
ALTER TABLE "SocioDemographicData" ADD CONSTRAINT fSocioDemographicDataMaritalStatusTMaritalStatus FOREIGN KEY ("MaritalStatus") REFERENCES "MaritalStatusT"(id);
ALTER TABLE "SocioDemographicData" ADD CONSTRAINT fSocioDemographicDataLivingWithTLivingWith FOREIGN KEY ("LivingWith") REFERENCES "LivingWithT"(id);
ALTER TABLE "Clinician" ADD CONSTRAINT fClinicianPersonDatapersondata FOREIGN KEY ("persondata") REFERENCES "PersonData"(id);
ALTER TABLE "Carer" ADD CONSTRAINT fCarerPersonDatapersondata FOREIGN KEY ("persondata") REFERENCES "PersonData"(id);
ALTER TABLE "Carer" ADD CONSTRAINT fCarerSocioDemographicDatasd FOREIGN KEY ("sd") REFERENCES "SocioDemographicData"(id);
ALTER TABLE "QuestionnaireQuestion" ADD CONSTRAINT fQuestionnaireQuestionQuestionnaireQuestionparentid FOREIGN KEY ("parentid") REFERENCES "QuestionnaireQuestion"(id);
ALTER TABLE "QuestionnaireQuestion" ADD CONSTRAINT fQuestionnaireQuestionQuestionnairequest FOREIGN KEY ("quest") REFERENCES "Questionnaire"(id);
ALTER TABLE "QuestionnaireQuestionAnswer" ADD CONSTRAINT fQuestionnaireQuestionAnswerQuestionnaireQuestionquestion FOREIGN KEY ("question") REFERENCES "QuestionnaireQuestion"(id);
ALTER TABLE "QuestionnaireAnswer" ADD CONSTRAINT fQuestionnaireAnswerQuestionnaireQuestionquestion FOREIGN KEY ("question") REFERENCES "QuestionnaireQuestion"(id);
ALTER TABLE "Task" ADD CONSTRAINT fTaskTaskTypeTTaskType FOREIGN KEY ("TaskType") REFERENCES "TaskTypeT"(id);
ALTER TABLE "Task" ADD CONSTRAINT fTaskTaskStatusTTaskStatus FOREIGN KEY ("TaskStatus") REFERENCES "TaskStatusT"(id);
ALTER TABLE "Task" ADD CONSTRAINT fTaskQuestionnairequestionnaire FOREIGN KEY ("questionnaire") REFERENCES "Questionnaire"(id);
ALTER TABLE "CarerAssessment" ADD CONSTRAINT fCarerAssessmentCarercarer FOREIGN KEY ("carer") REFERENCES "Carer"(id);
ALTER TABLE "PatientAssessment" ADD CONSTRAINT fPatientAssessmentPatientpatient FOREIGN KEY ("patient") REFERENCES "Patient"(id);
ALTER TABLE "PatientAssessment" ADD CONSTRAINT fPatientAssessmentAetologyTAetology FOREIGN KEY ("Aetology") REFERENCES "AetologyT"(id);
ALTER TABLE "Patient" ADD CONSTRAINT fPatientPersonDatapersondata FOREIGN KEY ("persondata") REFERENCES "PersonData"(id);
ALTER TABLE "Patient" ADD CONSTRAINT fPatientSocioDemographicDatasd FOREIGN KEY ("sd") REFERENCES "SocioDemographicData"(id);
ALTER TABLE "Patient" ADD CONSTRAINT fPatientClinicianclinician FOREIGN KEY ("clinician") REFERENCES "Clinician"(id);
ALTER TABLE "PatientCarer" ADD CONSTRAINT fPatientCarerPatientpatient FOREIGN KEY ("patient") REFERENCES "Patient"(id);
ALTER TABLE "PatientCarer" ADD CONSTRAINT fPatientCarerCarercarer FOREIGN KEY ("carer") REFERENCES "Carer"(id);
ALTER TABLE "Measurment" ADD CONSTRAINT fMeasurmentPatientAssessmentpa FOREIGN KEY ("pa") REFERENCES "PatientAssessment"(id);

