alter table Address drop constraint FK1ED033D48D6E90A3;
alter table Administrator drop constraint FK8BEF2AD8D6E90A3;
alter table Carer drop constraint FK3DDF7618D6E90A3;
alter table Carer drop constraint FK3DDF761FA439BD8;
alter table CarerAssessment drop constraint FK9BE20503916C845D;
alter table Clinician drop constraint FK1501984E8D6E90A3;
alter table Communication drop constraint FKF1E9FFB68D6E90A3;
alter table Identifier drop constraint FK165A88C98D6E90A3;
alter table Measurement drop constraint FKF75C839CC6F12B87;
alter table Measurement drop constraint FKF75C839CE3B81E4F;
alter table Note drop constraint FK25241247FAA0A5;
alter table Note drop constraint FK252412916C845D;
alter table Patient drop constraint FK340C82E58D6E90A3;
alter table Patient drop constraint FK340C82E597E980B7;
alter table Patient drop constraint FK340C82E5FA439BD8;
alter table PatientAssessment drop constraint FKDD8AFB8747FAA0A5;
alter table PatientAssessment drop constraint FKDD8AFB8749DA8AAF;
alter table PatientCarer drop constraint FKD4187B9C916C845D;
alter table PatientCarer drop constraint FKD4187B9C47FAA0A5;
alter table QuestionnaireAnswer drop constraint FK161DFB21E4F835EA;
alter table QuestionnaireQuestion drop constraint FKDED4AA899CC950E0;
alter table QuestionnaireQuestion drop constraint FKDED4AA8970818D49;
alter table QuestionnaireQuestionAnswer drop constraint FK17920BA7E4F835EA;
alter table SocioDemographicData drop constraint FK94BA3862D9D5F5F9;
alter table SocioDemographicData drop constraint FK94BA38625711230F;
alter table SocioDemographicData drop constraint FK94BA3862EE71F32F;
alter table Task drop constraint FK27A9A5C440542F;
alter table Task drop constraint FK27A9A559BB45A1;
alter table Task drop constraint FK27A9A54E96E7EF;
alter table Task drop constraint FK27A9A56973C36;
alter table Task drop constraint FK27A9A576C5513F;
alter table Users drop constraint FK4E39DE88EBF8D0F;
drop table Address;
drop table Administrator;
drop table AetologyT;
drop table Carer;
drop table CarerAssessment;
drop table Clinician;
drop table Communication;
drop table ExternalService;
drop table GenderT;
drop table Identifier;
drop table LivingWithT;
drop table MaritalStatusT;
drop table Measurement;
drop table Note;
drop table Patient;
drop table PatientAssessment;
drop table PatientCarer;
drop table PersonData;
drop table Questionnaire;
drop table QuestionnaireAnswer;
drop table QuestionnaireQuestion;
drop table QuestionnaireQuestionAnswer;
drop table SocioDemographicData;
drop table SystemParameter;
drop table Task;
drop table TaskStatusT;
drop table TaskTypeT;
drop table Users;
drop table typeT;
drop sequence Address_id_seq;
drop sequence Administrator_id_seq;
drop sequence AetologyT_id_seq;
drop sequence CarerAssessment_id_seq;
drop sequence Carer_id_seq;
drop sequence Clinician_id_seq;
drop sequence Communication_id_seq;
drop sequence ExternalService_id_seq;
drop sequence GenderT_id_seq;
drop sequence Identifier_id_seq;
drop sequence LivingWithT_id_seq;
drop sequence MaritalStatusT_id_seq;
drop sequence Measurement_id_seq;
drop sequence Note_id_seq;
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
drop sequence TaskStatusT_id_seq;
drop sequence TaskTypeT_id_seq;
drop sequence Task_id_seq;
drop sequence Users_id_seq;
drop sequence typeT_id_seq;
create table Address (id int4 not null, Street varchar(255), StreetNo varchar(255), City varchar(255), County varchar(255), Country varchar(255), ZipCode varchar(255), Notes varchar(255), IsPrimary bool, persondata int4, primary key (id));
create table Administrator (id int4 not null, personData int4, primary key (id));
create table AetologyT (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
create table Carer (id int4 not null, persondata int4, sd int4, primary key (id));
create table CarerAssessment (id int4 not null, carer int4, DateOfAssessment timestamp, RelevantHealthProblem varchar(255), SeverityOfBurden int4, EmotionalOrMentalDisorder varchar(255), PsychoactiveDrugs varchar(255), QualityOfLife int4, primary key (id));
create table Clinician (id int4 not null, persondata int4, primary key (id));
create table Communication (id int4 not null, Type varchar(255), Value varchar(255), Notes varchar(255), IsPrimary bool, persondata int4, primary key (id));
create table ExternalService (id int4 not null, Address varchar(255), Description varchar(255), primary key (id));
create table GenderT (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
create table Identifier (id int4 not null, Type varchar(255), Number varchar(255), IssueDate varchar(255), IssueAuthority varchar(255), persondata int4, primary key (id));
create table LivingWithT (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
create table MaritalStatusT (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
create table Measurement (id int4 not null, type varchar(255), value numeric(19, 2), datetime timestamp, units varchar(255), lowerlimit numeric(19, 2), upperlimit numeric(19, 2), patient int4, task int4, primary key (id));
create table Note (id int4 not null, DateTimeOfNote timestamp, text varchar(255), carer int4, patient int4, primary key (id));
create table Patient (id int4 not null, persondata int4, sd int4, clinician int4, primary key (id));
create table PatientAssessment (id int4 not null, patient int4, DateOfAssessment timestamp, Aetology int4, TimeElapsedSinceDiagnose int4, Severity int4, RelevantPathologyAntecedents varchar(255), Comorbidity varchar(255), CharlsonComobodityIndex int4, BarthelIndex int4, LawtonIndex int4, MMSE int4, MDRS int4, BlessedScalePart1 numeric(19, 2), BlessedScalePart2 int4, BlessedScalePart3 int4, ChecklistMBPC int4, NPQISeverity int4, NPQIStress int4, GDS int4, Falls bool, Incontinence bool, Delirium bool, Immobility bool, SensorialDeficits bool, PharmacologyTreatment varchar(255), primary key (id));
create table PatientCarer (id int4 not null, patient int4, carer int4, isprimary bool, primary key (id));
create table PersonData (id int4 not null, Surname varchar(255), Name varchar(255), primary key (id));
create table Questionnaire (id int4 not null, version numeric(19, 2), primary key (id));
create table QuestionnaireAnswer (id int4 not null, question int4, value varchar(255), UserId int4, timestamp timestamp, primary key (id));
create table QuestionnaireQuestion (id int4 not null, type varchar(255), isPrimary bool, subquetsions bool, parentid int4, title varchar(255), quest int4, condition int4, primary key (id));
create table QuestionnaireQuestionAnswer (id int4 not null, value int4, description varchar(255), question int4, primary key (id));
create table SocioDemographicData (id int4 not null, Age int4, Gender int4, MaritalStatus int4, Children int4, LivingWith int4, primary key (id));
create table SystemParameter (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
create table Task (id int4 not null, TaskType int4, DateTimeAssigned timestamp, DateTimeFulfilled timestamp, TaskStatus int4, url varchar(255), questionnaire int4, Executor int4, Assigner int4, primary key (id));
create table TaskStatusT (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
create table TaskTypeT (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
create table Users (id int4 not null, login varchar(255), password varchar(255), type int4, personId varchar(255), primary key (id));
create table typeT (id int4 not null, Code varchar(255), Description varchar(255), primary key (id));
alter table Address add constraint FK1ED033D48D6E90A3 foreign key (persondata) references PersonData;
alter table Administrator add constraint FK8BEF2AD8D6E90A3 foreign key (personData) references PersonData;
alter table Carer add constraint FK3DDF7618D6E90A3 foreign key (persondata) references PersonData;
alter table Carer add constraint FK3DDF761FA439BD8 foreign key (sd) references SocioDemographicData;
alter table CarerAssessment add constraint FK9BE20503916C845D foreign key (carer) references Carer;
alter table Clinician add constraint FK1501984E8D6E90A3 foreign key (persondata) references PersonData;
alter table Communication add constraint FKF1E9FFB68D6E90A3 foreign key (persondata) references PersonData;
alter table Identifier add constraint FK165A88C98D6E90A3 foreign key (persondata) references PersonData;
alter table Measurement add constraint FKF75C839CC6F12B87 foreign key (patient) references PatientAssessment;
alter table Measurement add constraint FKF75C839CE3B81E4F foreign key (task) references Task;
alter table Note add constraint FK25241247FAA0A5 foreign key (patient) references Patient;
alter table Note add constraint FK252412916C845D foreign key (carer) references Carer;
alter table Patient add constraint FK340C82E58D6E90A3 foreign key (persondata) references PersonData;
alter table Patient add constraint FK340C82E597E980B7 foreign key (clinician) references Clinician;
alter table Patient add constraint FK340C82E5FA439BD8 foreign key (sd) references SocioDemographicData;
alter table PatientAssessment add constraint FKDD8AFB8747FAA0A5 foreign key (patient) references Patient;
alter table PatientAssessment add constraint FKDD8AFB8749DA8AAF foreign key (Aetology) references AetologyT;
alter table PatientCarer add constraint FKD4187B9C916C845D foreign key (carer) references Carer;
alter table PatientCarer add constraint FKD4187B9C47FAA0A5 foreign key (patient) references Patient;
alter table QuestionnaireAnswer add constraint FK161DFB21E4F835EA foreign key (question) references QuestionnaireQuestion;
alter table QuestionnaireQuestion add constraint FKDED4AA899CC950E0 foreign key (quest) references Questionnaire;
alter table QuestionnaireQuestion add constraint FKDED4AA8970818D49 foreign key (parentid) references QuestionnaireQuestion;
alter table QuestionnaireQuestionAnswer add constraint FK17920BA7E4F835EA foreign key (question) references QuestionnaireQuestion;
alter table SocioDemographicData add constraint FK94BA3862D9D5F5F9 foreign key (MaritalStatus) references MaritalStatusT;
alter table SocioDemographicData add constraint FK94BA38625711230F foreign key (Gender) references GenderT;
alter table SocioDemographicData add constraint FK94BA3862EE71F32F foreign key (LivingWith) references LivingWithT;
alter table Task add constraint FK27A9A5C440542F foreign key (TaskStatus) references TaskStatusT;
alter table Task add constraint FK27A9A559BB45A1 foreign key (questionnaire) references Questionnaire;
alter table Task add constraint FK27A9A54E96E7EF foreign key (TaskType) references TaskTypeT;
alter table Task add constraint FK27A9A56973C36 foreign key (Executor) references Users;
alter table Task add constraint FK27A9A576C5513F foreign key (Assigner) references Users;
alter table Users add constraint FK4E39DE88EBF8D0F foreign key (type) references typeT;
create sequence Address_id_seq;
create sequence Administrator_id_seq;
create sequence AetologyT_id_seq;
create sequence CarerAssessment_id_seq;
create sequence Carer_id_seq;
create sequence Clinician_id_seq;
create sequence Communication_id_seq;
create sequence ExternalService_id_seq;
create sequence GenderT_id_seq;
create sequence Identifier_id_seq;
create sequence LivingWithT_id_seq;
create sequence MaritalStatusT_id_seq;
create sequence Measurement_id_seq;
create sequence Note_id_seq;
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
create sequence TaskStatusT_id_seq;
create sequence TaskTypeT_id_seq;
create sequence Task_id_seq;
create sequence Users_id_seq;
create sequence typeT_id_seq;
