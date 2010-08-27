<%@page contentType="text/html;charset=UTF-8"%><HTML>
<HEAD>
<TITLE>Methods</TITLE>
</HEAD>
<BODY>
<H1>Methods</H1>
<UL>
<LI><A HREF="Input.jsp?method=2" TARGET="inputs"> getEndpoint()</A></LI>
<LI><A HREF="Input.jsp?method=5" TARGET="inputs"> setEndpoint(java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=10" TARGET="inputs"> getStorageComponent_PortType()</A></LI>
<LI><A HREF="Input.jsp?method=13" TARGET="inputs"> createPatient(eu.aladdin_project.xsd.Patient,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=66" TARGET="inputs"> updatePatient(eu.aladdin_project.xsd.Patient,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=119" TARGET="inputs"> deletePatient(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=134" TARGET="inputs"> getPatient(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=187" TARGET="inputs"> createAdministrator(eu.aladdin_project.xsd.Administrator,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=210" TARGET="inputs"> updateAdministrator(eu.aladdin_project.xsd.Administrator,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=233" TARGET="inputs"> deleteAdministrator(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=248" TARGET="inputs"> getAdministrator(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=269" TARGET="inputs"> createCarer(eu.aladdin_project.xsd.Carer,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=320" TARGET="inputs"> updateCarer(eu.aladdin_project.xsd.Carer,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=371" TARGET="inputs"> deleteCarer(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=386" TARGET="inputs"> getCarer(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=435" TARGET="inputs"> createClinician(eu.aladdin_project.xsd.Clinician,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=458" TARGET="inputs"> updateClinician(eu.aladdin_project.xsd.Clinician,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=481" TARGET="inputs"> deleteClinician(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=496" TARGET="inputs"> getClinician(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=517" TARGET="inputs"> getUserPlannedTasks(java.lang.String,java.util.Calendar,java.util.Calendar,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=528" TARGET="inputs"> getPatientMeasurement(java.lang.String,int,java.util.Calendar,java.util.Calendar,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=541" TARGET="inputs"> changeTaskStatus(int,int,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=558" TARGET="inputs"> assignTask(eu.aladdin_project.xsd.Task,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=599" TARGET="inputs"> listOfPossibleTasks(int)</A></LI>
<LI><A HREF="Input.jsp?method=604" TARGET="inputs"> listOfQuestionnaires(java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=609" TARGET="inputs"> getQuestionnaire(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=616" TARGET="inputs"> deleteQuestionnaire(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=631" TARGET="inputs"> getQuestionnaireAnswers(java.lang.String,java.util.Calendar,java.util.Calendar,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=642" TARGET="inputs"> savePatientAssessment(eu.aladdin_project.xsd.PatientAssessment,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=739" TARGET="inputs"> saveCarerAssessment(eu.aladdin_project.xsd.CarerAssessment,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=776" TARGET="inputs"> deletePatientAssessment(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=791" TARGET="inputs"> deleteCarerAssessment(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=806" TARGET="inputs"> getPatientAssessments(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=813" TARGET="inputs"> getCarerAssessments(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=820" TARGET="inputs"> createExternalService(eu.aladdin_project.xsd.ExternalService,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=841" TARGET="inputs"> updateExternalService(eu.aladdin_project.xsd.ExternalService,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=862" TARGET="inputs"> deleteExternalService(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=877" TARGET="inputs"> getAllExternalServices(java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=882" TARGET="inputs"> saveWarning(eu.aladdin_project.xsd.Warning,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=937" TARGET="inputs"> markWarningAsRead(java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=952" TARGET="inputs"> createUser(eu.aladdin_project.xsd.User)</A></LI>
<LI><A HREF="Input.jsp?method=979" TARGET="inputs"> deleteUser(java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=992" TARGET="inputs"> updateUser(eu.aladdin_project.xsd.User)</A></LI>
<LI><A HREF="Input.jsp?method=1019" TARGET="inputs"> changePassword(java.lang.String,java.lang.String,java.lang.String)</A></LI>
<LI><A HREF="Input.jsp?method=1036" TARGET="inputs"> auth(java.lang.String,java.lang.String)</A></LI>
</UL>
</BODY>
</HTML>