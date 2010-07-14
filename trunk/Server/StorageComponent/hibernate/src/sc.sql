alter table Address drop constraint FK1ED033D44EAC96B0;
alter table Administrator drop constraint FK8BEF2AD4EAC96B0;
alter table Carer drop constraint FK3DDF7614EAC96B0;
alter table Carer drop constraint FK3DDF761B1CF35A5;
alter table CarerAssessment drop constraint FK9BE20503513C2A30;
alter table CarerAssessment drop constraint FK9BE20503F8FC050A;
alter table Clinician drop constraint FK1501984E4EAC96B0;
alter table Communication drop constraint FKF1E9FFB64EAC96B0;
alter table Identifier drop constraint FK165A88C94EAC96B0;
alter table Measurement drop constraint FKF75C839C52781DB8;
alter table Measurement drop constraint FKF75C839C5542F21C;
alter table Measurement drop constraint FKF75C839CFC90A15C;
alter table Patient drop constraint FK340C82E54EAC96B0;
alter table Patient drop constraint FK340C82E5F8FC050A;
alter table Patient drop constraint FK340C82E5B1CF35A5;
alter table PatientAssessment drop constraint FKDD8AFB8752781DB8;
alter table PatientCarer drop constraint FKD4187B9C513C2A30;
alter table PatientCarer drop constraint FKD4187B9C52781DB8;
alter table QuestionnaireAnswer drop constraint FK161DFB211EDFD5BD;
alter table QuestionnaireQuestion drop constraint FKDED4AA896D8B73B3;
alter table QuestionnaireQuestion drop constraint FKDED4AA89AA692D1C;
alter table QuestionnaireQuestionAnswer drop constraint FK17920BA71EDFD5BD;
alter table Task drop constraint FK27A9A52A7D6874;
alter table Task drop constraint FK27A9A5D3883C27;
alter table Task drop constraint FK27A9A543B65130;
alter table Task drop constraint FK27A9A51CC2E693;
drop table Address cascade;
drop table Administrator cascade;
drop table AladdinUser cascade;
drop table Carer cascade;
drop table CarerAssessment cascade;
drop table Clinician cascade;
drop table Communication cascade;
drop table ExternalService cascade;
drop table Identifier cascade;
drop table Measurement cascade;
drop table Patient cascade;
drop table PatientAssessment cascade;
drop table PatientCarer cascade;
drop table PersonData cascade;
drop table Questionnaire cascade;
drop table QuestionnaireAnswer cascade;
drop table QuestionnaireQuestion cascade;
drop table QuestionnaireQuestionAnswer cascade;
drop table SocioDemographicData cascade;
drop table SystemParameter cascade;
drop table Task cascade;
drop table Warning cascade;
drop sequence Address_id_seq;
drop sequence Administrator_id_seq;
drop sequence AladdinUser_id_seq;
drop sequence CarerAssessment_id_seq;
drop sequence Carer_id_seq;
drop sequence Clinician_id_seq;
drop sequence Communication_id_seq;
drop sequence ExternalService_id_seq;
drop sequence Identifier_id_seq;
drop sequence Measurement_id_seq;
drop sequence PatientAssessment_id_seq;
drop sequence PatientCarer_id_seq;
drop sequence Patient_id_seq;
drop sequence PersonData_id_seq;
drop sequence QuestionnaireAnswer_id_seq;
drop sequence QuestionnaireQuestionAnswer_id_seq;
drop sequence QuestionnaireQuestion_id_seq;
drop sequence Questionnaire_id_seq;
drop sequence SocioDemographicData_id_seq;
drop sequence SystemParameter_id_seq;
drop sequence Task_id_seq;
drop sequence Warning_id_seq;
create table Address (id int4 not null, Street varchar(255), StreetNo varchar(255), City varchar(255), County varchar(255), Country varchar(255), ZipCode varchar(255), Notes varchar(255), IsPrimary bool, persondata int4, primary key (id));
create table Administrator (id int4 not null, personData int4, primary key (id));
create table AladdinUser (id int4 not null, username varchar(255), password varchar(255), type int4, personId varchar(255), primary key (id));
create table Carer (id int4 not null, persondata int4, sd int4, primary key (id));
create table CarerAssessment (id int4 not null, carer int4, DateOfAssessment timestamp, RelevantHealthProblem varchar(255), SeverityOfBurden int4, EmotionalOrMentalDisorder varchar(255), PsychoactiveDrugs varchar(255), QualityOfLife int4, clinician int4, primary key (id));
create table Clinician (id int4 not null, persondata int4, primary key (id));
create table Communication (id int4 not null, Type varchar(255), Value varchar(255), Notes varchar(255), IsPrimary bool, persondata int4, primary key (id));
create table ExternalService (id int4 not null, Address varchar(255), Description varchar(255), primary key (id));
create table Identifier (id int4 not null, Type varchar(255), Number varchar(255), IssueDate timestamp, IssueAuthority varchar(255), persondata int4, primary key (id));
create table Measurement (id int4 not null, type varchar(255), value numeric(19, 2), datetime timestamp, units varchar(255), lowerlimit numeric(19, 2), upperlimit numeric(19, 2), patientassessment int4, patient int4, task int4, primary key (id));
create table Patient (id int4 not null, persondata int4, sd int4, clinician int4, primary key (id));
create table PatientAssessment (id int4 not null, patient int4, DateOfAssessment timestamp, Aetology int4, TimeElapsedSinceDiagnose int4, Severity int4, RelevantPathologyAntecedents varchar(255), Comorbidity varchar(255), CharlsonComobodityIndex int4, BarthelIndex int4, LawtonIndex int4, MMSE int4, MDRS int4, BlessedScalePart1 numeric(19, 2), BlessedScalePart2 int4, BlessedScalePart3 int4, ChecklistMBPC int4, NPQISeverity int4, NPQIStress int4, GDS int4, Falls bool, Incontinence bool, Delirium bool, Immobility bool, SensorialDeficits bool, PharmacologyTreatment varchar(255), primary key (id));
create table PatientCarer (id int4 not null, patient int4, carer int4, isprimary bool, primary key (id));
create table PersonData (id int4 not null, Surname varchar(255), Name varchar(255), primary key (id));
create table Questionnaire (id int4 not null, version numeric(19, 2), title varchar(255), primary key (id));
create table QuestionnaireAnswer (id int4 not null, question int4, value varchar(255), UserId int4, timestamp timestamp, objectId int4, primary key (id));
create table QuestionnaireQuestion (id int4 not null, type varchar(255), isPrimary bool, subquetsions bool, parentid int4, title varchar(255), quest int4, condition int4, primary key (id));
create table QuestionnaireQuestionAnswer (id int4 not null, value int4, description varchar(255), question int4, primary key (id));
create table SocioDemographicData (id int4 not null, Age int4, Gender int4, MaritalStatus int4, Children int4, LivingWith int4, primary key (id));
create table SystemParameter (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
create table Task (id int4 not null, TaskType int4, DateTimeAssigned timestamp, DateTimeFulfilled timestamp, TaskStatus int4, url varchar(255), questionnaire int4, Executor int4, Assigner int4, Object int4, primary key (id));
create table Warning (id int4 not null, TypeOfWarning int4, DateTimeOfWarning timestamp, Effect int4, Indicator int4, RiskLevel int4, JustificationText varchar(255), EmergencyLevel int4, PatientID varchar(255), Delivered bool, primary key (id));
alter table Address add constraint FK1ED033D44EAC96B0 foreign key (persondata) references PersonData;
alter table Administrator add constraint FK8BEF2AD4EAC96B0 foreign key (personData) references PersonData;
alter table Carer add constraint FK3DDF7614EAC96B0 foreign key (persondata) references PersonData;
alter table Carer add constraint FK3DDF761B1CF35A5 foreign key (sd) references SocioDemographicData;
alter table CarerAssessment add constraint FK9BE20503513C2A30 foreign key (carer) references Carer;
alter table CarerAssessment add constraint FK9BE20503F8FC050A foreign key (clinician) references Clinician;
alter table Clinician add constraint FK1501984E4EAC96B0 foreign key (persondata) references PersonData;
alter table Communication add constraint FKF1E9FFB64EAC96B0 foreign key (persondata) references PersonData;
alter table Identifier add constraint FK165A88C94EAC96B0 foreign key (persondata) references PersonData;
alter table Measurement add constraint FKF75C839C52781DB8 foreign key (patient) references Patient;
alter table Measurement add constraint FKF75C839C5542F21C foreign key (task) references Task;
alter table Measurement add constraint FKF75C839CFC90A15C foreign key (patientassessment) references PatientAssessment;
alter table Patient add constraint FK340C82E54EAC96B0 foreign key (persondata) references PersonData;
alter table Patient add constraint FK340C82E5F8FC050A foreign key (clinician) references Clinician;
alter table Patient add constraint FK340C82E5B1CF35A5 foreign key (sd) references SocioDemographicData;
alter table PatientAssessment add constraint FKDD8AFB8752781DB8 foreign key (patient) references Patient;
alter table PatientCarer add constraint FKD4187B9C513C2A30 foreign key (carer) references Carer;
alter table PatientCarer add constraint FKD4187B9C52781DB8 foreign key (patient) references Patient;
alter table QuestionnaireAnswer add constraint FK161DFB211EDFD5BD foreign key (question) references QuestionnaireQuestion;
alter table QuestionnaireQuestion add constraint FKDED4AA896D8B73B3 foreign key (quest) references Questionnaire;
alter table QuestionnaireQuestion add constraint FKDED4AA89AA692D1C foreign key (parentid) references QuestionnaireQuestion;
alter table QuestionnaireQuestionAnswer add constraint FK17920BA71EDFD5BD foreign key (question) references QuestionnaireQuestion;
alter table Task add constraint FK27A9A52A7D6874 foreign key (questionnaire) references Questionnaire;
alter table Task add constraint FK27A9A5D3883C27 foreign key (Executor) references AladdinUser;
alter table Task add constraint FK27A9A543B65130 foreign key (Assigner) references AladdinUser;
alter table Task add constraint FK27A9A51CC2E693 foreign key (Object) references AladdinUser;
create sequence Address_id_seq;
create sequence Administrator_id_seq;
create sequence AladdinUser_id_seq;
create sequence CarerAssessment_id_seq;
create sequence Carer_id_seq;
create sequence Clinician_id_seq;
create sequence Communication_id_seq;
create sequence ExternalService_id_seq;
create sequence Identifier_id_seq;
create sequence Measurement_id_seq;
create sequence PatientAssessment_id_seq;
create sequence PatientCarer_id_seq;
create sequence Patient_id_seq;
create sequence PersonData_id_seq;
create sequence QuestionnaireAnswer_id_seq;
create sequence QuestionnaireQuestionAnswer_id_seq;
create sequence QuestionnaireQuestion_id_seq;
create sequence Questionnaire_id_seq;
create sequence SocioDemographicData_id_seq;
create sequence SystemParameter_id_seq;
create sequence Task_id_seq;
create sequence Warning_id_seq;
