    package com.aladdin.sc;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import eu.aladdin_project.storagecomponent.*;
import eu.aladdin_project.storagecomponent.AssignTaskResponseDocument.AssignTaskResponse;
import eu.aladdin_project.storagecomponent.AuthResponseDocument.AuthResponse;
import eu.aladdin_project.storagecomponent.ChangePasswordResponseDocument.ChangePasswordResponse;
import eu.aladdin_project.storagecomponent.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse;
import eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse;
import eu.aladdin_project.storagecomponent.CreateCarerResponseDocument.CreateCarerResponse;
import eu.aladdin_project.storagecomponent.CreateClinicianResponseDocument.CreateClinicianResponse;
import eu.aladdin_project.storagecomponent.CreateExternalServiceResponseDocument.CreateExternalServiceResponse;
import eu.aladdin_project.storagecomponent.CreatePatientResponseDocument.CreatePatientResponse;
import eu.aladdin_project.storagecomponent.CreateQuestionnaireResponseDocument.CreateQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.CreateUserResponseDocument.CreateUserResponse;
import eu.aladdin_project.storagecomponent.DeleteAdministratorResponseDocument.DeleteAdministratorResponse;
import eu.aladdin_project.storagecomponent.DeleteCarerAssessmentResponseDocument.DeleteCarerAssessmentResponse;
import eu.aladdin_project.storagecomponent.DeleteCarerResponseDocument.DeleteCarerResponse;
import eu.aladdin_project.storagecomponent.DeleteClinicianResponseDocument.DeleteClinicianResponse;
import eu.aladdin_project.storagecomponent.DeleteExternalServiceResponseDocument.DeleteExternalServiceResponse;
import eu.aladdin_project.storagecomponent.DeletePatientAssessmentResponseDocument.DeletePatientAssessmentResponse;
import eu.aladdin_project.storagecomponent.DeletePatientResponseDocument.DeletePatientResponse;
import eu.aladdin_project.storagecomponent.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse;
import eu.aladdin_project.storagecomponent.GetAdministratorResponseDocument.GetAdministratorResponse;
import eu.aladdin_project.storagecomponent.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse;
import eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse;
import eu.aladdin_project.storagecomponent.GetCarerResponseDocument.GetCarerResponse;
import eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse;
import eu.aladdin_project.storagecomponent.GetPatientAssessmentsResponseDocument.GetPatientAssessmentsResponse;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementResponseDocument.GetPatientMeasurementResponse;
import eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse;
import eu.aladdin_project.storagecomponent.GetQuestionnaireResponseDocument.GetQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse;
import eu.aladdin_project.storagecomponent.GetUserPlannedTasksResponseDocument.GetUserPlannedTasksResponse;
import eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse;
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
import eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse;
import eu.aladdin_project.storagecomponent.UpdateAdministratorResponseDocument.UpdateAdministratorResponse;
import eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse;
import eu.aladdin_project.storagecomponent.UpdateClinicianResponseDocument.UpdateClinicianResponse;
import eu.aladdin_project.storagecomponent.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse;
import eu.aladdin_project.storagecomponent.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse;
import eu.aladdin_project.storagecomponent.GetUserTypeDocument;
import eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument;
import eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse;
import eu.aladdin_project.storagecomponent.GetSystemParameterListResponseDocument;
import eu.aladdin_project.storagecomponent.GetSystemParameterListDocument;
import eu.aladdin_project.storagecomponent.GetSystemParameterListResponseDocument.GetSystemParameterListResponse;
import eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument;
import eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument;
import eu.aladdin_project.storagecomponent.GetUserResponseDocument;
import eu.aladdin_project.storagecomponent.GetUserDocument;
import eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument;
import eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument;
import eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse;
import eu.aladdin_project.xsd.*;

    public class StorageComponentSkeleton implements StorageComponentSkeletonInterface{
    	
    	public final static int OP_LESS = 1;
    	public final static int OP_GREAT = 2;
    	public final static int OP_EQ = 3;
    	public final static int OP_NOTEQ = 4;
    	public final static int OP_LIKE = 5;
    	public final static int OP_BETWEEN = 7;
    	
    	private HashMap<Integer, String> op;
    	
    	private Session s;
    	
    	public final static int U_CARER = 3;
    	public final static int U_PATIENT = 4;
    	public final static int U_CLINICIAN = 2;
    	public final static int U_ADMIN = 1;
    	
    	private boolean checkUser (String userId, Integer userType) {
    		if (userId == null) return true;
    		String sql = "SELECT * FROM aladdinuser WHERE id = '" + userId + "' AND type = '" + userType.toString() + "'";
			return (s.createSQLQuery(sql).list().size() > 0);
    	}
    	
    	public StorageComponentSkeleton () {
    		s = HibernateUtil.getSessionFactory().openSession();

    		op = new HashMap<Integer, String>();
    		op.put(OP_LESS, " %s < '%s' ");
    		op.put(OP_GREAT, " %s > '%s' ");
    		op.put(OP_EQ, " %s = '%s' ");
    		op.put(OP_NOTEQ, " %s != '%s' ");
    		op.put(OP_LIKE, "%s like '%s' ");
    		op.put(OP_BETWEEN, " %s BETWEEN '%s' AND '%s' ");
    	}

    	public CreateClinicianResponseDocument createClinician (CreateClinicianDocument req) {
    		CreateClinicianResponseDocument respdoc = CreateClinicianResponseDocument.Factory.newInstance();
    		CreateClinicianResponse resp = respdoc.addNewCreateClinicianResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (!checkUser(req.getCreateClinician().getUserId(), U_ADMIN)) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Clinician data = req.getCreateClinician().getData();
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Clinician clinician = new com.aladdin.sc.db.Clinician ();
    			
    			Integer pdid = storePersondata(data.getPersonData(), null); 
    			
    			clinician.setPersondata(pdid);
    			s.save(clinician);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(clinician.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	private Integer storePersondata (PersonData rpd, Integer id) {
    		com.aladdin.sc.db.PersonData pd = new com.aladdin.sc.db.PersonData();
    		pd.setName(rpd.getName());
    		pd.setSurname(rpd.getSurname());
    		if (id != null && id > 0) {
    			pd.setId(id);
    			s.merge(pd);
    		} else {
    			s.save (pd);
    		}

    		Integer pdid = pd.getId();
    		
			s.createSQLQuery("DELETE FROM address WHERE persondata = " + pd.getId().toString()).executeUpdate();
			s.createSQLQuery("DELETE FROM identifier WHERE persondata = " + pd.getId().toString()).executeUpdate();
			s.createSQLQuery("DELETE FROM communication WHERE persondata = " + pd.getId().toString()).executeUpdate();
    		
    		Address[] rad = rpd.getAddressList().getAddressArray();
			for (int i = 0; i < rad.length; i++) {
				storeAddress(rad[i], pdid);
			}

			Identifier[] rid = rpd.getIdentifierList().getIdentifierArray();
			for (int i = 0; i < rid.length; i++) {
				storeIdentifier(rid[i], pdid);
			}
			
			Communication[] rcm = rpd.getCommunicationList().getCommunicationArray();
			for (int i = 0; i < rcm.length; i++) {
				storeCommunication(rcm[i], pdid);
			}
    		
    		return pd.getId();
    	}

    	private void storeCommunication(Communication rcm, Integer pdid) {
    		com.aladdin.sc.db.Communication cm = new com.aladdin.sc.db.Communication ();
    		cm.setPersondata(pdid);
    		cm.setType(rcm.getType());
    		cm.setValue(rcm.getValue());
    		cm.setNotes(rcm.getNotes());
    		cm.setIsPrimary(rcm.getIsPrimary());
    		s.save (cm);
    	}

    	private void storeIdentifier(Identifier rid, Integer pdid) {
    		com.aladdin.sc.db.Identifier id = new com.aladdin.sc.db.Identifier ();
    		id.setPersondata(pdid);
    		id.setType(rid.getType());
    		id.setNumber(rid.getNumber());
    		Calendar issueDate = rid.getIssueDate();
    		
    		long timeInMillis = 0;
    		if (issueDate != null) timeInMillis = issueDate.getTimeInMillis();
    		id.setIssueDate(new Timestamp(timeInMillis));
    		id.setIssueAuthority(rid.getIssueAuthority());
    		s.save (id);
    	}

    	private void storeAddress(Address rad, Integer pdid) {
    		com.aladdin.sc.db.Address ad = new com.aladdin.sc.db.Address ();
    		ad.setPersondata(pdid);
    		ad.setCity(rad.getCity());
    		ad.setCountry(rad.getCountry());
    		ad.setCounty(rad.getCounty());
    		ad.setNotes(rad.getNotes());
    		ad.setStreet(rad.getStreet());
    		ad.setStreetNo(rad.getStreetNo());
    		ad.setZipCode(rad.getZipCode());
    		ad.setIsPrimary(rad.getIsPrimary());
    		s.save(ad);
    	}

    	public CreatePatientResponseDocument createPatient (CreatePatientDocument req) {
    		CreatePatientResponseDocument respdoc = CreatePatientResponseDocument.Factory.newInstance();
    		CreatePatientResponse resp = respdoc.addNewCreatePatientResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getCreatePatient().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getCreatePatient().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Patient data = req.getCreatePatient().getData();
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Patient p = new com.aladdin.sc.db.Patient ();
    			
    			Integer pdid = storePersondata(data.getPersonData(), null);
    			
    			Integer sdid = storeSocioDemographic(data.getSDData(), null);
    			
    			p.setPersondata(pdid);
    			p.setSd(sdid);
    			String responsibleClinicianID = data.getResponsibleClinicianID();
    			if (responsibleClinicianID == null) responsibleClinicianID = "0";
    			p.setClinician(new Integer(responsibleClinicianID));
    			s.save(p);
    			
    			PatientCarer[] pcl = data.getPatientCarerList().getPatientCarerArray();
    			for (int i = 0; i < pcl.length; i++) {
    				com.aladdin.sc.db.PatientCarer pc = new com.aladdin.sc.db.PatientCarer ();
    				pc.setPatient(p.getId());
    				pc.setIsprimary(pcl[i].getIsPrimary());
    				pc.setCarer(new Integer(pcl[i].getCarer().getID()));
    				s.save(pc);
    			}
    			
    			s.getTransaction().commit();
    			
    			res.setCode(p.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}

    	private Integer storeSocioDemographic (SocioDemographicData rsd, Integer id) {
    		com.aladdin.sc.db.SocioDemographicData sd = new com.aladdin.sc.db.SocioDemographicData ();
    		sd.setAge(new Integer(rsd.getAge()));
    		sd.setGender(new Integer(rsd.getGender().getCode()));
    		sd.setMaritalStatus(new Integer(rsd.getMaritalStatus().getCode()));
    		sd.setChildren(new Integer(rsd.getChildren()));
    		sd.setLivingWith(new Integer(rsd.getLivingWith().getCode()));
    		if (id != null && id > 0) {
    			sd.setId(id);
    			s.merge(sd);
    		} else {
    			s.save(sd);
    		}
    		
    		return sd.getId();
    	}
    	
    	public CreateCarerResponseDocument createCarer (CreateCarerDocument req) {
    		CreateCarerResponseDocument respdoc = CreateCarerResponseDocument.Factory.newInstance();
    		CreateCarerResponse resp = respdoc.addNewCreateCarerResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getCreateCarer().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getCreateCarer().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Carer data = req.getCreateCarer().getData();
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Carer p = new com.aladdin.sc.db.Carer ();
    			
    			Integer pdid = storePersondata(data.getPersonData(), null);
    			
    			Integer sdid = storeSocioDemographic(data.getSDData(), null);
    			
    			p.setPersondata(pdid);
    			p.setSd(sdid);
    			s.save(p);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(p.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		return respdoc;
    	}
    	
    	public UpdateQuestionnaireResponseDocument updateQuestionnaire (UpdateQuestionnaireDocument req) {
    		UpdateQuestionnaireResponseDocument respdoc = UpdateQuestionnaireResponseDocument.Factory.newInstance();
    		UpdateQuestionnaireResponse resp = respdoc.addNewUpdateQuestionnaireResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getUpdateQuestionnaire().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getUpdateQuestionnaire().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			Questionnaire rquest = req.getUpdateQuestionnaire().getData();
    			
    			storeQuestionnaire(rquest);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(rquest.getID().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}

    	private void updateQQ(QuestionnaireQuestion rqq, int questId, Integer parentId) {
    		System.out.println (" uQQ 1");
    		com.aladdin.sc.db.QuestionnaireQuestion qq = new com.aladdin.sc.db.QuestionnaireQuestion ();
    		System.out.println (" uQQ 2");
    		qq.setType(rqq.getType());
    		System.out.println (" uQQ 3");
    		if (rqq.getId() != null) qq.setId(new Integer (rqq.getId()));
    		System.out.println (" uQQ 4");
    		qq.setCondition(new Integer(rqq.getCondition()));
    		System.out.println (" uQQ 5");
    		qq.setTitle(rqq.getTitle());
    		System.out.println (qq.getTitle());
    		System.out.println (" uQQ 6");
    		qq.setParentid(parentId);
    		qq.setQuest(questId);
    		System.out.println (" uQQ 7");
/*    		if (rqq.getDeleted() != true) {
    			rqq.setDeleted(false);
    		}
    		qq.setDeleted(rqq.getDeleted());*/
    		
    		System.out.print (" question ");
    		System.out.print (qq.getTitle());
    		System.out.print (" ");
    		System.out.print (qq.getType());
    		System.out.print (" ");
    		System.out.println (qq.getId());
    		
    		
    		s.saveOrUpdate(qq);
    		System.out.println (" uQQ 8");
    		if (rqq.getQuestions() != null && rqq.getQuestions().getQuestionArray() != null) {
    			for (int i = 0; i < rqq.getQuestions().getQuestionArray().length; i++) {
        			System.out.println (" uQQ 9");
        			updateQQ (rqq.getQuestions().getQuestionArray(i), questId, qq.getId());
        			System.out.println (" uQQ 19");
        		}    			
    		}
    		
    		QuestionnaireQuestionAnswer rqqa = null;
    		System.out.println (" uQQ 11");
    		if (rqq.getAnswers() != null && rqq.getAnswers().getAnswerArray() != null) {
    			for (int i = 0; i < rqq.getAnswers().getAnswerArray().length; i++) {
        			rqqa = rqq.getAnswers().getAnswerArray(i);
        			
        			
        			com.aladdin.sc.db.QuestionnaireQuestionAnswer qqa = new com.aladdin.sc.db.QuestionnaireQuestionAnswer ();
        			qqa.setValue(new Integer(rqqa.getValue()));
        			qqa.setQuestion(qq.getId());
        			qqa.setDescription(rqqa.getStringValue());
//        			if (rqqa.getDeleted() != true) rqqa.setDeleted(true);
//        			qqa.setDeleted(rqqa.getDeleted());
//        			if (rqqa.getId() > 0) qqa.setId(rqqa.getId());
        			
        			
        			System.out.print (" answer ");
        			System.out.print (qqa.getQuestion());
        			System.out.print (" ");
        			System.out.println (qqa.getDescription());
        			
        			s.saveOrUpdate(qqa);
        		}    			
    		}
    		System.out.println (" uQQ 20");
    	}
    	
    	
    	public ListOfQuestionnairesResponseDocument listOfQuestionnaires (ListOfQuestionnairesDocument req) {
    		ListOfQuestionnairesResponseDocument respdoc = ListOfQuestionnairesResponseDocument.Factory.newInstance();
    		ListOfQuestionnairesResponse resp = respdoc.addNewListOfQuestionnairesResponse();
    		
    		// TODO: auth
    		
    		try {
    			Object[] ql = s.createSQLQuery("SELECT id, title, version FROM questionnaire").list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				Object[] quest = (Object[]) ql[i];
    				QuestionnaireInfo qi = resp.addNewOut();
    				qi.setID(((Integer)quest[0]).toString());
    				qi.setTitle((String)quest[1]);
    				qi.setVersion(((BigDecimal)quest[2]).doubleValue ());
    			}
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}
    		
    		return respdoc;
    	}
    	
    	public SaveWarningResponseDocument saveWarning (SaveWarningDocument req) {
    		SaveWarningResponseDocument respdoc = SaveWarningResponseDocument.Factory.newInstance();
    		SaveWarningResponse resp = respdoc.addNewSaveWarningResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getSaveWarning().getUserId(), U_CARER) &&
    				!checkUser(req.getSaveWarning().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getSaveWarning().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			Warning rwarn = req.getSaveWarning().getWarn();
    			com.aladdin.sc.db.Warning warn = new com.aladdin.sc.db.Warning ();
    			warn.setTypeOfWarning(new Integer (rwarn.getTypeOfWarning().getCode()));
    			
    			long timeInMillis = 0;
    			if (rwarn.getDateTimeOfWarning() != null) timeInMillis = rwarn.getDateTimeOfWarning().getTimeInMillis();
    			warn.setDateTimeOfWarning(new Timestamp(timeInMillis));
    			
    			warn.setEffect(new Integer (rwarn.getEffect().getCode()));
    			warn.setIndicator(new Integer (rwarn.getIndicator().getCode()));
    			warn.setRiskLevel(new Integer(rwarn.getRiskLevel().getCode()));
    			warn.setJustificationText(rwarn.getJustificationText());
    			warn.setEmergencyLevel(new Integer(rwarn.getEmergencyLevel().getCode()));
    			warn.setPatientID(rwarn.getPatientID());
    			warn.setDelivered(rwarn.getDelivered());

    			s.save (warn);
    			s.getTransaction().commit();
    			res.setCode(warn.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
   				System.out.println (e.toString());
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	public UpdateCarerResponseDocument updateCarer (UpdateCarerDocument req) {
    		UpdateCarerResponseDocument respdoc = UpdateCarerResponseDocument.Factory.newInstance();
    		UpdateCarerResponse resp = respdoc.addNewUpdateCarerResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getUpdateCarer().getUserId(), U_CLINICIAN) && 
    				!checkUser(req.getUpdateCarer().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Carer data = req.getUpdateCarer().getData();
    			
    			s.beginTransaction();
    			
    			Integer id = new Integer (data.getID());
    			com.aladdin.sc.db.Carer p = (com.aladdin.sc.db.Carer) s.load (com.aladdin.sc.db.Carer.class, id);
    			storePersondata(data.getPersonData(), p.getPersondata());
    			storeSocioDemographic(data.getSDData(), p.getSd());
    			s.update(p);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(p.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			System.out.println(e.toString());
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		return respdoc;
    	}
    	
    	public DeleteAdministratorResponseDocument deleteAdministrator (DeleteAdministratorDocument req) {
    		DeleteAdministratorResponseDocument respdoc = DeleteAdministratorResponseDocument.Factory.newInstance();
    		DeleteAdministratorResponse resp = respdoc.addNewDeleteAdministratorResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeleteAdministrator().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getDeleteAdministrator().getId());
    			
    			if (id < 1) throw new Exception ("error");
    			
    			com.aladdin.sc.db.Administrator p = (com.aladdin.sc.db.Administrator) s.load(com.aladdin.sc.db.Administrator.class, id);
    			Integer pd = p.getPersonData();
    			
    			s.beginTransaction();
    			
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM communication WHERE persondata = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM administrator WHERE id = " + id.toString()).executeUpdate();
    			s.createSQLQuery("DELETE FROM persondata WHERE id = " + pd.toString()).executeUpdate();
    			
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString ());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    			
    		}  catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	public UpdatePatientResponseDocument updatePatient (UpdatePatientDocument req) {
    		UpdatePatientResponseDocument respdoc = UpdatePatientResponseDocument.Factory.newInstance();
    		UpdatePatientResponse resp = respdoc.addNewUpdatePatientResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getUpdatePatient().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getUpdatePatient().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Patient data = req.getUpdatePatient().getData();
    			
    			s.beginTransaction();
    			
    			Integer id = new Integer (data.getID());
    			com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient) s.load (com.aladdin.sc.db.Patient.class, id);
    			storePersondata(data.getPersonData(), p.getPersondata());
    			storeSocioDemographic(data.getSDData(), p.getSd());
    			s.update(p);
    			s.getTransaction().commit();
    			res.setCode(p.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			System.out.println(e.toString());
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		return respdoc;
    	}
    	
    	public ListOfCarersResponseDocument listOfCarers (ListOfCarersDocument req) {
    		ListOfCarersResponseDocument respdoc = ListOfCarersResponseDocument.Factory.newInstance();
    		ListOfCarersResponse resp = respdoc.addNewListOfCarersResponse();
    		
    		if (
    				!checkUser(req.getListOfCarers().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getListOfCarers().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			List<Field> fl = new ArrayList<Field>();
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.PersonData.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.SocioDemographicData.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Address.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Communication.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Identifier.class.getDeclaredFields()));
    			
    			String sql = "SELECT p.id FROM carer p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) LEFT JOIN sociodemographicdata sd ON (sd.id = p.sd) WHERE ";
    			
    			SearchCriteria[] sc = req.getListOfCarers().getFilterArray();
    			for (int i = 0; i < sc.length; i++) {
    				
    				if (sc[i].getFieldName() == null) continue;
    				
    				for (int j = 0; j < fl.size(); j++) {
    					if (fl.get(j).getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
    						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
    						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
    						sql += " AND ";
    					}
    				}
    			}
    			sql += " 1=1 GROUP BY p.id, p.persondata, p.sd";
    			
    			Object[] ql = s.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				Integer id = (Integer) ql[i];
    				com.aladdin.sc.db.Carer p = (com.aladdin.sc.db.Carer)s.load(com.aladdin.sc.db.Carer.class, id);
    				CarerInfo qi = resp.addNewOut();
    				qi.setID(p.getId().toString());
    				qi.setSurname(p.getM_PersonData().getSurname());
    				qi.setName(p.getM_PersonData().getName());
    			}
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}
    		
    		return respdoc;
    	}
    	
    	public ListOfCliniciansResponseDocument listOfClinicians (ListOfCliniciansDocument req) {
    		ListOfCliniciansResponseDocument respdoc = ListOfCliniciansResponseDocument.Factory.newInstance();
    		ListOfCliniciansResponse resp = respdoc.addNewListOfCliniciansResponse();
    		
    		if (
    				!checkUser(req.getListOfClinicians().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getListOfClinicians().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			List<Field> fl = new ArrayList<Field>();
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.PersonData.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Address.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Communication.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Identifier.class.getDeclaredFields()));
    			
    			String sql = "SELECT p.id FROM clinician p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) WHERE ";
    			
    			SearchCriteria[] sc = req.getListOfClinicians().getFilterArray();
    			for (int i = 0; i < sc.length; i++) {
    				
    				if (sc[i].getFieldName() == null) continue;
    				
    				for (int j = 0; j < fl.size(); j++) {
    					if (fl.get(j).getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
    						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
    						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
    						sql += " AND ";
    					}
    				}
    			}
    			sql += " 1=1 GROUP BY p.id, p.persondata";
    			
    			Object[] ql = s.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				Integer id = (Integer) ql[i];
    				com.aladdin.sc.db.Clinician p = (com.aladdin.sc.db.Clinician)s.load(com.aladdin.sc.db.Clinician.class, id);
    				ClinicianInfo qi = resp.addNewOut();
    				qi.setID(p.getId().toString());
    				qi.setSurname(p.getM_PersonData().getSurname());
    				qi.setName(p.getM_PersonData().getName());
    			}
    		} catch (Exception e) {
    		}
    		
    		return respdoc;
    	}
    	
    	public SavePatientAssessmentResponseDocument savePatientAssessment (SavePatientAssessmentDocument req) {
    		SavePatientAssessmentResponseDocument respdoc = SavePatientAssessmentResponseDocument.Factory.newInstance();
    		SavePatientAssessmentResponse resp = respdoc.addNewSavePatientAssessmentResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getSavePatientAssessment().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getSavePatientAssessment().getUserId(), U_CARER) &&
    				!checkUser(req.getSavePatientAssessment().getUserId(), U_PATIENT)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			com.aladdin.sc.db.PatientAssessment pa = new com.aladdin.sc.db.PatientAssessment();
    			PatientAssessment rpa = req.getSavePatientAssessment().getAssessment();
    			
    			pa.setPatient(new Integer (rpa.getPatientID()));
    			
    			long timeInMillis = 0;
    			if (rpa.getDateOfAssessment() != null) timeInMillis = rpa.getDateOfAssessment().getTimeInMillis();
    			pa.setDateOfAssessment(new Timestamp(timeInMillis));
    			
    			pa.setAetology(new Integer (rpa.getAetology().getCode()));
    			pa.setTimeElapsedSinceDiagnose((int)rpa.getTimeEllapsedSinceDiagnosed());
    			pa.setSeverity((int)rpa.getSeverity());
    			pa.setRelevantPathologyAntecedents(rpa.getRelevantPathologyAntecedents());
    			pa.setComorbidity(rpa.getComorbidity());
    			pa.setCharlsonComobodityIndex((int)rpa.getCharlsonComorbidityIndex());
    			pa.setBarthelIndex((int)rpa.getBarthelIndex());
    			pa.setLawtonIndex((int)rpa.getLawtonIndex());
    			pa.setMMSE((int)rpa.getMMSE());
    			pa.setMDRS((int)rpa.getMDRS());
    			pa.setBlessedScalePart1(new BigDecimal (rpa.getBlessedScalePart1()));
    			pa.setBlessedScalePart2((int)rpa.getBlessedScalePart2());
    			pa.setBlessedScalePart3((int)rpa.getBlessedScalePart3());
    			pa.setChecklistMBPC((int)rpa.getChecklistMBP());
    			pa.setNPQISeverity((int)rpa.getNPQISeverity());
    			pa.setNPQIStress((int)rpa.getNPQIStress());
    			pa.setGDS((int)rpa.getGDS());
    			pa.setFalls(rpa.getFalls());
    			pa.setIncontinence(rpa.getIncontinence());
    			pa.setDelirium(rpa.getDelirium());
    			pa.setImmobility(rpa.getImmobility());
    			pa.setSensorialDeficits(rpa.getSensorialDeficits());
    			pa.setPharmacologyTreatment(rpa.getPharmacologicalTreatment());
    			s.save(pa);
    			
    			Integer pid = new Integer (pa.getId());
    			for (int i = 0; i < rpa.getClinicalDataArray().length; i++) {
    				storeMeasurement(rpa.getClinicalDataArray(i), pid);
    			}
    			
    			s.getTransaction().commit();
    			
    			res.setCode(pa.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}

    	private Integer storeMeasurement(Measurement rm, Integer paid) {
    		long timeInMillis = 0;
    		com.aladdin.sc.db.Measurement m = new com.aladdin.sc.db.Measurement ();
    		if (paid != null) m.setPatientassessment (paid);
    		m.setType(rm.getType().getCode());
    		m.setValue(new BigDecimal (rm.getValue()));
    		if (rm.getDateTime() != null) timeInMillis = rm.getDateTime().getTimeInMillis();
    		m.setDatetime(new Timestamp(timeInMillis));
    		m.setUnits(rm.getUnits());
    		m.setLowerlimit(new BigDecimal (rm.getLowerLimit()));
    		m.setUpperlimit(new BigDecimal (rm.getUpperLimit()));
    		if (rm.getTaskID() != null) m.setTask(new Integer (rm.getTaskID()));
    		s.save (m);
    		return m.getId();
    	}
    	
    	public StoreMeasurementsResponseDocument storeMeasurements (StoreMeasurementsDocument req) {
    		StoreMeasurementsResponseDocument respdoc = StoreMeasurementsResponseDocument.Factory.newInstance();
    		StoreMeasurementsResponse resp = respdoc.addNewStoreMeasurementsResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getStoreMeasurements().getUserId(), U_CARER) &&
    				!checkUser(req.getStoreMeasurements().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getStoreMeasurements().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			Measurement[] rm = req.getStoreMeasurements().getDataArray();
    			Integer id = 0;
    			for (int i = 0; i < rm.length; i++) {
    				id = storeMeasurement(rm[i], null);
    			}
    			
    			s.getTransaction().commit();
    			res.setCode(id.toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	public GetPatientResponseDocument getPatient (GetPatientDocument req) {
    		GetPatientResponseDocument respdoc = GetPatientResponseDocument.Factory.newInstance();
    		GetPatientResponse resp = respdoc.addNewGetPatientResponse();
    		
    		if (
    				!checkUser(req.getGetPatient().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getGetPatient().getUserId(), U_CARER) &&
    				!checkUser(req.getGetPatient().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getGetPatient().getId());
        		com.aladdin.sc.db.Patient patient = (com.aladdin.sc.db.Patient) s.load(com.aladdin.sc.db.Patient.class, id);
        		resp.setOut (exportPatient (patient));
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}
    		
    		return respdoc;
    	}

		private Patient exportPatient(com.aladdin.sc.db.Patient patient) {
			Patient p = Patient.Factory.newInstance();
			p.setID(patient.getId().toString());
			p.setPersonData(exportPersonData(patient.getM_PersonData()));
			p.setSDData (exportSocioDemographicData(patient.getM_SocioDemographicData()));
			p.setResponsibleClinicianID(patient.getClinician().toString());
			
			Object[] pc = patient.getPatientCarers().toArray();
			PatientCarerList pcl = p.addNewPatientCarerList();
			for (int i = 0; i < pc.length; i++) {
				PatientCarer rpc = pcl.addNewPatientCarer();
				rpc.setIsPrimary( ((com.aladdin.sc.db.PatientCarer) pc[i]).getIsprimary());
				rpc.setCarer(exportCarer(((com.aladdin.sc.db.PatientCarer)pc[i]).getM_Carer()));
			}
			return p;
		}

		private Carer exportCarer(com.aladdin.sc.db.Carer carer) {
			Carer c = Carer.Factory.newInstance();
			c.setID(carer.getId().toString());
			c.setPersonData(exportPersonData(carer.getM_PersonData()));
			c.setSDData(exportSocioDemographicData(carer.getM_SocioDemographicData()));
			return c;
		}
		
		private SocioDemographicData exportSocioDemographicData (com.aladdin.sc.db.SocioDemographicData SDData) {
			SocioDemographicData sd = SocioDemographicData.Factory.newInstance();
			sd.setAge(SDData.getAge().shortValue());
			
			SystemParameter gender = SystemParameter.Factory.newInstance();
			gender.setCode(SDData.getGender().toString());
			//gender.setDescription(Dict.getGenderDescription(gender.getCode(), s));
			
			sd.setGender(gender);
			
			SystemParameter maritalStatus = SystemParameter.Factory.newInstance();
			maritalStatus.setCode(SDData.getMaritalStatus().toString());
			//maritalStatus.setDescription(Dict.getMaritalStatusDescription(maritalStatus.getCode(), s));
			
			sd.setMaritalStatus(maritalStatus);
			sd.setChildren(SDData.getChildren().shortValue());
			
			SystemParameter livingWith = SystemParameter.Factory.newInstance();
			livingWith.setCode(SDData.getLivingWith().toString());
			//livingWith.setDescription(Dict.getLivingWithDescription(livingWith.getCode(), s));
			
			sd.setLivingWith(livingWith);
			return sd;
		}

		private PersonData exportPersonData(com.aladdin.sc.db.PersonData personData) {
			PersonData pd = PersonData.Factory.newInstance();
			pd.setSurname(personData.getSurname());
			pd.setName(personData.getName());
			
			Object[] id = personData.getIdentifiers().toArray();
			IdentifierList idl = pd.addNewIdentifierList();
			for (int i = 0; i < id.length; i++) {
				exportIdentifier( (com.aladdin.sc.db.Identifier) id[i], idl);
			}
			
			Object[] ad = personData.getAddresss().toArray();
			AddressList adl = pd.addNewAddressList();
			for (int i = 0; i < ad.length; i++) {
				exportAddress( (com.aladdin.sc.db.Address) ad[i], adl);
			}
			
			Object[] cm = personData.getCommunications().toArray();
			CommunicationList cml = pd.addNewCommunicationList();
			for (int i = 0; i < cm.length; i++) {
				exportCommunication( (com.aladdin.sc.db.Communication) cm[i], cml);
			}
			return pd;
		}

		private void exportCommunication(com.aladdin.sc.db.Communication cm, CommunicationList cml) {
			Communication rcm = cml.addNewCommunication();
			rcm.setType(cm.getType());
			rcm.setValue(cm.getValue());
			rcm.setNotes(cm.getNotes());
			rcm.setIsPrimary(cm.getIsPrimary());
		}

		private void exportAddress(com.aladdin.sc.db.Address ad, AddressList adl) {
			Address rad = adl.addNewAddress();
			rad.setStreet(ad.getStreet());
			rad.setStreetNo(ad.getStreetNo());
			rad.setCity(ad.getCity());
			rad.setCountry(ad.getCountry());
			rad.setCounty(ad.getCounty());
			rad.setZipCode(ad.getZipCode());
			rad.setNotes(ad.getNotes());
			rad.setIsPrimary(ad.getIsPrimary());
		}

		private void exportIdentifier(com.aladdin.sc.db.Identifier id, IdentifierList idl) {
			Identifier rid = idl.addNewIdentifier();
			rid.setType(id.getType());
			rid.setNumber(id.getNumber());
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(id.getIssueDate().getTime());
			rid.setIssueDate(c);
			rid.setIssueAuthority(id.getIssueAuthority());
		}
		
    	public DeleteCarerAssessmentResponseDocument deleteCarerAssessment (DeleteCarerAssessmentDocument req) {
    		DeleteCarerAssessmentResponseDocument respdoc = DeleteCarerAssessmentResponseDocument.Factory.newInstance();
    		DeleteCarerAssessmentResponse resp = respdoc.addNewDeleteCarerAssessmentResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeleteCarerAssessment().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getDeleteCarerAssessment().getUserId(), U_CARER)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.createSQLQuery("DELETE FROM carerassessment WHERE id = " + req.getDeleteCarerAssessment().getAssessmentId()).executeUpdate();
    			res.setCode(req.getDeleteCarerAssessment().getAssessmentId());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
    		}
    		
    		return respdoc;
    	}
    	
    	@SuppressWarnings("deprecation")
		public GetQuestionnaireAnswersResponseDocument getQuestionnaireAnswers (GetQuestionnaireAnswersDocument req) {
    		GetQuestionnaireAnswersResponseDocument respdoc = GetQuestionnaireAnswersResponseDocument.Factory.newInstance();
    		GetQuestionnaireAnswersResponse resp = respdoc.addNewGetQuestionnaireAnswersResponse();
    		
    		if (
    				!checkUser(req.getGetQuestionnaireAnswers().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getGetQuestionnaireAnswers().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Calendar fromDate = req.getGetQuestionnaireAnswers().getFromDate();
    			Calendar toDate   = req.getGetQuestionnaireAnswers().getToDate();
    			Integer objectId  = new Integer (req.getGetQuestionnaireAnswers().getObjectId());
    			
    			String sql = "SELECT qa.timestamp, qq.quest, qa.objectid, qa.userid FROM questionnaireanswer qa inner join questionnairequestion qq on (qq.id = qa.question) WHERE qa.objectid = '" + objectId.toString() + "' AND qa.timestamp BETWEEN '" + fromDate.toString() + "' AND '" + toDate.toString () + "' GROUP BY qa.timestamp, qq.quest, qa.objectid, qa.userid";
    			Object[] questionids = s.createSQLQuery(sql).list().toArray();
    			
    			for (int i = 0; i < questionids.length; i++) {
    				Object[] q = (Object[]) questionids[i];
    				TimeZone zone = TimeZone.getDefault();
    				Calendar cal = Calendar.getInstance(zone);
    				Timestamp timestamp = (Timestamp)q[0];
					cal.setTimeInMillis( timestamp.getTime() );
					
					// work around
					Calendar before = Calendar.getInstance();
					before.setTimeInMillis( timestamp.getTime() );
					Calendar after = Calendar.getInstance();
					after.setTimeInMillis( timestamp.getTime() + 1000 );
					
					Integer question = (Integer)q[1];
					sql = "SELECT id FROM questionnaireanswer WHERE objectid = '" + objectId.toString();
					sql += "' AND timestamp BETWEEN '" + before.getTime().toString();
					sql += "' AND '" + after.getTime().toString();
					sql += "' AND question in (select id from questionnairequestion where quest = " + question.toString() + ")";
	    			Object[] lqa = s.createSQLQuery(sql).list().toArray();
	    			QuestionnaireAnswers rqas = resp.addNewOut();
	    			rqas.setDateTime(cal);
	    			rqas.setObjectID(((Integer)q[2]).toString());
	    			rqas.setUserID(((Integer)q[3]).toString());
	    			
	    			for (int j = 0; j < lqa.length; j++) {
	    				QuestionnaireAnswer rqa = rqas.addNewAnswer();
	    				com.aladdin.sc.db.QuestionnaireAnswer qa = (com.aladdin.sc.db.QuestionnaireAnswer) s.load(com.aladdin.sc.db.QuestionnaireAnswer.class, (Integer)lqa[0]); 
	    				rqa.setQuestionID(qa.getQuestion().toString());
	    				rqa.setValue(qa.getValue());
	    			}
    			}
    			
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}

    		return respdoc;
    	}
    	
    	public DeleteExternalServiceResponseDocument deleteExternalService (DeleteExternalServiceDocument req) {
    		DeleteExternalServiceResponseDocument respdoc = DeleteExternalServiceResponseDocument.Factory.newInstance();
    		DeleteExternalServiceResponse resp = respdoc.addNewDeleteExternalServiceResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeleteExternalService().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getDeleteExternalService().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getDeleteExternalService().getId());
    			s.createSQLQuery("DELETE FROM externalservice WHERE id = " + id.toString());
    			res.setCode(id.toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			System.out.println (e.toString());
				res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	
    	public DeleteClinicianResponseDocument deleteClinician (DeleteClinicianDocument req) {
    		DeleteClinicianResponseDocument respdoc = DeleteClinicianResponseDocument.Factory.newInstance();
    		DeleteClinicianResponse resp = respdoc.addNewDeleteClinicianResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeleteClinician().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getDeleteClinician().getId());
    			
    			if (id < 1) throw new Exception ("error");
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Clinician p = (com.aladdin.sc.db.Clinician) s.load(com.aladdin.sc.db.Clinician.class, id);
    			Integer pd = p.getPersondata();

    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM communication WHERE persondata = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM clinician WHERE id = " + id.toString()).executeUpdate();
    			s.createSQLQuery("DELETE FROM persondata WHERE id = " + pd.toString()).executeUpdate();
    			
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString ());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		}  catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	public DeletePatientResponseDocument deletePatient (DeletePatientDocument req) {
    		DeletePatientResponseDocument respdoc = DeletePatientResponseDocument.Factory.newInstance();
    		DeletePatientResponse resp = respdoc.addNewDeletePatientResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeletePatient().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getDeletePatient().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getDeletePatient().getId());
    			
    			if (id < 1) throw new Exception ("error");
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient) s.load(com.aladdin.sc.db.Patient.class, id);
    			Integer pd = p.getPersondata();
    			Integer sd = p.getSd();
    			
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM communication WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM patientcarer WHERE patient = " + id.toString()).executeUpdate();
    			s.createSQLQuery("DELETE FROM patient WHERE id = " + id.toString()).executeUpdate();
    			s.createSQLQuery("DELETE FROM persondata WHERE id = " + pd.toString()).executeUpdate();
    			s.createSQLQuery("DELETE FROM sociodemographicdata WHERE id = " + sd.toString()).executeUpdate();

    			s.getTransaction().commit();
    			
    			res.setCode(id.toString ());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	public CreateQuestionnaireResponseDocument createQuestionnaire (CreateQuestionnaireDocument req) {
    		CreateQuestionnaireResponseDocument respdoc = CreateQuestionnaireResponseDocument.Factory.newInstance();
    		CreateQuestionnaireResponse resp = respdoc.addNewCreateQuestionnaireResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getCreateQuestionnaire().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getCreateQuestionnaire().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			
    			s.beginTransaction();
    			
    			Questionnaire rq = req.getCreateQuestionnaire().getData();
    			rq.setID(null);
			com.aladdin.sc.db.Questionnaire q = storeQuestionnaire(rq);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(q.getId().toString ());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}

		private com.aladdin.sc.db.Questionnaire storeQuestionnaire (Questionnaire rq) {
			System.out.println (" ===============================");
			System.out.println (" sQ 1");
			com.aladdin.sc.db.Questionnaire q = new com.aladdin.sc.db.Questionnaire ();
			System.out.println (" sQ 2");
			q.setTitle(rq.getTitle());
			System.out.println (rq.getTitle());
			System.out.println (" sQ 3");
			System.out.println (rq.getVersion());
			q.setVersion(new BigDecimal (rq.getVersion()));
			System.out.println (" sQ 4");
			if (rq.getID() != null) {
				System.out.println (" id " + rq.getID());
				q.setId(new Integer (rq.getID()));
			}
			s.saveOrUpdate(q);
			System.out.println (" sQ 5");
			
			QuestionnaireQuestion[] rqq = rq.getQuestionArray();
			System.out.println (" sQ 6");
			
			for (int i = 0; i < rqq.length; i++) {
				System.out.println (" sQ 7");
				updateQQ(rqq[i], q.getId(), null);
				System.out.println (" sQ 8");
			}
			return q;
		}
    	
    	public GetPatientMeasurementResponseDocument getPatientMeasurement (GetPatientMeasurementDocument req) {
    		GetPatientMeasurementResponseDocument respdoc = GetPatientMeasurementResponseDocument.Factory.newInstance();
    		GetPatientMeasurementResponse resp = respdoc.addNewGetPatientMeasurementResponse();
    		
    		if (
    				!checkUser(req.getGetPatientMeasurement().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getGetPatientMeasurement().getUserId(), U_CARER) &&
    				!checkUser(req.getGetPatientMeasurement().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			Integer patientId = new Integer (req.getGetPatientMeasurement().getPatientId()); 
    			Integer measurementType = new Integer (req.getGetPatientMeasurement().getMeasurementType());
    			Calendar fromDate = req.getGetPatientMeasurement().getFromData();
    			Calendar toDate = req.getGetPatientMeasurement().getToData();
    			Object[] ml = s.createSQLQuery("SELECT id FROM measurement WHERE patient = " + patientId.toString() + " AND datetime BETWEEN '" + fromDate.toString() + "' AND '" + toDate.toString() + "' AND type = '" + measurementType.toString() + "'").list().toArray();
    			ArrayList<Measurement> export = new ArrayList<Measurement>();
    			for (int i = 0; i < ml.length; i++) {
    				System.out.println ("1");
    				Integer id = (Integer)ml[i];
    				System.out.println ("id: " + id.toString());
    				System.out.println ("2");
    				com.aladdin.sc.db.Measurement m = (com.aladdin.sc.db.Measurement) s.load(com.aladdin.sc.db.Measurement.class, id);
    				System.out.println ("3");
    				export.add(exportMeasurement(m));
    				System.out.println ("4");
    			}
    			resp.setOutArray((Measurement[]) export.toArray(new Measurement[0]));
    			s.getTransaction().commit();
    		} catch (Exception e) {
    			System.out.println (e.toString());
			}
    		
    		return respdoc;
    	}

		private Measurement exportMeasurement(com.aladdin.sc.db.Measurement m) {
			System.out.println ("1");
			Measurement rm = Measurement.Factory.newInstance();
			System.out.println ("2");
			SystemParameter rmeasurementType = SystemParameter.Factory.newInstance();
			System.out.println ("3");
			rmeasurementType.setCode(m.getType());
			//rmeasurementType.setDescription ( Dict.getMeasurementType ( rmeasurementType.getCode(), s ) );
			System.out.println ("4");
			rm.setType(rmeasurementType);
			System.out.println ("5");
			rm.setValue(m.getValue().doubleValue ());
			System.out.println ("6");
			Timestamp datetime = m.getDatetime();
			System.out.println ("7");
			Calendar c = Calendar.getInstance();
			System.out.println ("8");
			c.setTimeInMillis(datetime.getTime());
			System.out.println ("9");
			rm.setDateTime(c);
			System.out.println ("10");
			rm.setUnits(m.getUnits());
			System.out.println ("11");
			rm.setLowerLimit(m.getLowerlimit().doubleValue ());
			System.out.println ("12");
			rm.setUpperLimit(m.getUpperlimit().doubleValue ());
			System.out.println ("13");
			return rm;
		}
		
    	public DeleteQuestionnaireResponseDocument deleteQuestionnaire (DeleteQuestionnaireDocument req) {
    		DeleteQuestionnaireResponseDocument respdoc = DeleteQuestionnaireResponseDocument.Factory.newInstance();
    		DeleteQuestionnaireResponse resp = respdoc.addNewDeleteQuestionnaireResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeleteQuestionnaire().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getDeleteQuestionnaire().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			Integer id = new Integer (req.getDeleteQuestionnaire().getId());
    			Object[] qq = s.createSQLQuery("SELECT id FROM questionnairequestion WHERE quest = " + id.toString()).list().toArray();
    			for (int i = 0; i < qq.length; i++) {
    				dropQQ ((Integer)qq[i]);
    			}
    			s.createSQLQuery("DELETE FROM questionnaire WHERE id = " + id.toString());
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString());
    			res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	
    	private void dropQQ (Integer id) {
    		Object[] qq = s.createSQLQuery("SELECT id FROM questionnairequestion WHERE parentid = " + id.toString()).list().toArray();
			for (int i = 0; i < qq.length; i++) {
				dropQQ ((Integer) qq[i]);
			}
			s.createSQLQuery("DELETE FROM questionnairequestionanswer WHERE question = " + id.toString()).executeUpdate();
			s.createSQLQuery("DELETE FROM questionnaireanswer WHERE question = " + id.toString()).executeUpdate();
			s.createSQLQuery("DELETE FROM questionnairequestion WHERE id = " + id.toString()).executeUpdate();
    	}
    	
    	public AssignTaskResponseDocument assignTask (AssignTaskDocument req) {
    		AssignTaskResponseDocument respdoc = AssignTaskResponseDocument.Factory.newInstance();
    		AssignTaskResponse resp = respdoc.addNewAssignTaskResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getAssignTask().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getAssignTask().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			System.out.println (1);
    			com.aladdin.sc.db.Task task = new com.aladdin.sc.db.Task ();
    			System.out.println (2);
    			Task rtask = req.getAssignTask().getTask();
    			System.out.println (3);
    			task.setTaskType(new Integer (rtask.getTaskType().getCode()));
    			System.out.println (4);
    			task.setDateTimeAssigned(new Timestamp(rtask.getDateTimeAssigned().getTimeInMillis()));
    			System.out.println (5);
    			task.setDateTimeFulfilled(new Timestamp(rtask.getDateTimeFulfilled().getTimeInMillis()));
    			System.out.println (6);
    			task.setTaskStatus(new Integer (rtask.getTaskStatus().getCode()));
    			System.out.println (7);
    			task.setUrl(rtask.getURL());
    			System.out.println (8);
    			task.setExecutor(new Integer (rtask.getExecutorID()));
    			System.out.println (9);
    			task.setAssigner(new Integer (rtask.getAssignerID()));
    			System.out.println (10);
    			task.setObject(new Integer (rtask.getObjectID()));
    			System.out.println (11);
    			
    			if (rtask.getQuestionnaire() != null) {
    				System.out.println (12);
    				task.setQuestionnaire(storeQuestionnaire(rtask.getQuestionnaire()).getId());
    				System.out.println (13);
    			}
    			System.out.println (14);
    			
    			s.save (task);
    			System.out.println (15);
    			s.getTransaction().commit();
    			System.out.println (16);
    			
    			res.setCode(task.getId().toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
        		res.setDescription("database error ");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	         
    	public ListOfAdministratorsResponseDocument listOfAdministrators (ListOfAdministratorsDocument req) {
    		ListOfAdministratorsResponseDocument respdoc = ListOfAdministratorsResponseDocument.Factory.newInstance();
    		ListOfAdministratorsResponse resp = respdoc.addNewListOfAdministratorsResponse();
    		
    		if (
    				!checkUser(req.getListOfAdministrators().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			List<Field> fl = new ArrayList<Field>();
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.PersonData.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Address.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Communication.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Identifier.class.getDeclaredFields()));
    			
    			String sql = "SELECT p.id FROM administrator p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) WHERE ";
    			
    			SearchCriteria[] sc = req.getListOfAdministrators().getFilterArray();
    			for (int i = 0; i < sc.length; i++) {
    				for (int j = 0; j < fl.size(); j++) {
    					if (fl.get(j).getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
    						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
    						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
    						sql += " AND ";
    					}
    				}
    			}
    			sql += " 1=1 GROUP BY p.id,p.persondata";
    			System.out.println (sql);
    			
    			Object[] ql = s.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				Integer id = (Integer) ql[i];
    				com.aladdin.sc.db.Administrator a = (com.aladdin.sc.db.Administrator)s.load(com.aladdin.sc.db.Administrator.class, id);
    				AdministratorInfo ai = resp.addNewOut();
    				ai.setID(a.getId().toString());
    				ai.setSurname(a.getM_PersonData().getSurname());
    				ai.setName(a.getM_PersonData().getName());
    			}
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}
    		
    		return respdoc;
    	}
    	
    	private Integer getTaskTypesCount () {
    		return 7;
    	}

    	public GetUserPlannedTasksResponseDocument getUserPlannedTasks (GetUserPlannedTasksDocument req) {
    		GetUserPlannedTasksResponseDocument respdoc = GetUserPlannedTasksResponseDocument.Factory.newInstance();
    		GetUserPlannedTasksResponse resp = respdoc.addNewGetUserPlannedTasksResponse();
    		
    		if (
    				!checkUser(req.getGetUserPlannedTasks().getRequesterId(), U_CLINICIAN) &&
    				!checkUser(req.getGetUserPlannedTasks().getRequesterId(), U_CARER) &&
    				!checkUser(req.getGetUserPlannedTasks().getRequesterId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer userId = new Integer (req.getGetUserPlannedTasks().getUserId());
    			String fromDate  = req.getGetUserPlannedTasks().getFromDate().toString();
    			String toDate = req.getGetUserPlannedTasks().getToDate().toString();
    			
    			String sql = "SELECT id FROM task WHERE datetimefulfilled BETWEEN '" + fromDate + "' AND '" + toDate + "' AND executor = '" + userId.toString() + "'";
    			Object[] tl = s.createSQLQuery(sql).list().toArray();
    			
    			for (int i = 0; i < tl.length; i++) {
    				Integer id = (Integer) tl[i];
    				com.aladdin.sc.db.Task t = (com.aladdin.sc.db.Task) s.load(com.aladdin.sc.db.Task.class, id);
    				Task rt = resp.addNewOut();
    				rt.setID(t.getId().toString());
    				SystemParameter taskType = SystemParameter.Factory.newInstance();
    				taskType.setCode(t.getTaskType().toString());
    				//taskType.setDescription(Dict.getTaskDescription (taskType.getCode(), s));
    				rt.setTaskType(taskType);
    				Calendar c1 = Calendar.getInstance();
    				c1.setTimeInMillis(t.getDateTimeAssigned().getTime());
    				rt.setDateTimeAssigned(c1);
    				Calendar c2 = Calendar.getInstance();
    				c2.setTimeInMillis(t.getDateTimeFulfilled().getTime());
    				rt.setDateTimeFulfilled(c2);
    				SystemParameter taskStatus = SystemParameter.Factory.newInstance();
    				taskStatus.setCode(t.getTaskStatus().toString());
    				//taskStatus.setDescription ( Dict.getTaskStatusType ( taskStatus.getCode(), s ) );
    				rt.setTaskStatus(taskStatus);
    				rt.setURL(t.getUrl());
    				rt.setExecutorID(t.getExecutor().toString());
    				rt.setAssignerID(t.getAssigner().toString());
    				rt.setObjectID(t.getObject().toString());
    				if (t.getQuestionnaire() != null && t.getQuestionnaire() > 0) {
    					rt.setQuestionnaire(exportQuestionnaire(t.getM_Questionnaire()));
    					System.out.println ();
    					System.out.println ();
    					System.out.println (" === QUESTIONNAIRE == ");
    					System.out.println (rt.toString());
    					System.out.println ();
    					System.out.println ();
    				}
    			}
    		} catch (Exception e) {
    			System.out.println(e.toString());
			}
    		
    		return respdoc;
    	}
    	
    	private Questionnaire exportQuestionnaire (com.aladdin.sc.db.Questionnaire q) {
    		System.out.println (" eQ 1");
    		Questionnaire rq = Questionnaire.Factory.newInstance();
    		System.out.println (" eQ 2");
    		rq.setID(q.getId().toString());
    		System.out.println (" eQ 3");
    		rq.setTitle(q.getTitle());
    		System.out.println (" eQ 4");
    		rq.setVersion(q.getVersion().doubleValue ());
    		System.out.println (" eQ 5");
    		
    		List<QuestionnaireQuestion> rqql = new ArrayList<QuestionnaireQuestion>();
    		System.out.println (" eQ 6");
    		
    		//Object[] qql = q.getQuestionnaireQuestions().toArray();
    		String sql = "SELECT id FROM questionnairequestion WHERE quest = " + q.getId().toString() + " AND parentid is null";
    		Object[] qql = s.createSQLQuery(sql).list ().toArray(); 
    		
    		
    		
    		System.out.println (" eQ 7");
    		for (int i = 0; i < qql.length; i++) {
    			System.out.println (" eQ 8");
    			com.aladdin.sc.db.QuestionnaireQuestion qq =
    				(com.aladdin.sc.db.QuestionnaireQuestion)
    					s.load(com.aladdin.sc.db.QuestionnaireQuestion.class, (Integer)qql[i])
    				;
    			///if (!qq.getDeleted()) {
    				rqql.add(exportQQ(qq, true));
    			//}
    			System.out.println (" eQ 9");
    		}
    		rq.setQuestionArray((QuestionnaireQuestion[]) rqql.toArray(new QuestionnaireQuestion[0]));
    		System.out.println (" eQ 10");
    		
    		return rq;
    	}
    	
    	private QuestionnaireQuestion exportQQ (com.aladdin.sc.db.QuestionnaireQuestion qq, boolean level1) {
    		System.out.println (" eQQ 1");
    		QuestionnaireQuestion rqq = QuestionnaireQuestion.Factory.newInstance();
    		System.out.println (" eQQ 2");
    		
    		rqq.setType(qq.getType());
    		System.out.println (" eQQ 3");
    		rqq.setId(qq.getId().toString());
    		System.out.println (" eQQ 4");
    		
    		System.out.println ("");
			System.out.println ("");
			System.out.println (" ======================== ");
			System.out.println (qq.getId() + " " + (level1 ? "condition" : "empty"));
			System.out.println (" ======================== ");
			System.out.println ("");
			System.out.println ("");
    		
    		if (!level1) {
    			rqq.setCondition(qq.getCondition().shortValue());
    			System.out.println (" eQQ 5");
    		}
    		
    		rqq.setTitle(qq.getTitle());
    		
    		//rqq.setDeleted(qq.getDeleted());
    		
    		System.out.println (" eQQ 6");
    		
    		List<QuestionnaireQuestionAnswer> rqqal = new ArrayList<QuestionnaireQuestionAnswer> ();
    		System.out.println (" eQQ 7");
    		Object[] qqal = qq.getQuestionnaireQuestionAnswers().toArray();
    		System.out.println (" eQQ 8");
    		for (int i = 0; i < qqal.length; i++) {
    			System.out.println (" eQQ 9");
    			com.aladdin.sc.db.QuestionnaireQuestionAnswer qqa = (com.aladdin.sc.db.QuestionnaireQuestionAnswer) qqal[i];
    			System.out.println (" eQQ 91");
				if (qqa.getDeleted() == null || !qqa.getDeleted()) rqqal.add(exportQQA(qqa));
    			System.out.println (" eQQ 10");
    		}
    		System.out.println (" eQQ 11");
    		rqq.addNewAnswers();
    		System.out.println (" eQQ 12");
    		rqq.getAnswers().setAnswerArray((QuestionnaireQuestionAnswer[]) rqqal.toArray(new QuestionnaireQuestionAnswer[0]));
    		System.out.println (" eQQ 13");
    		
    		List<QuestionnaireQuestion> rqql = new ArrayList<QuestionnaireQuestion>();
    		System.out.println (" eQQ 14");
    		Object[] qql = s.createSQLQuery("SELECT id FROM questionnairequestion WHERE parentid = '" + qq.getId().toString() + "'").list().toArray();
    		System.out.println (" eQQ 15");
    		for (int i = 0; i < qql.length; i++) {
    			System.out.println (" eQQ 16");
//			System.out.println (qql[i].class.toString());
				System.out.println (qql[i].toString());
				System.out.println (qql.length);


//			Object[] _obj_ = qq
				System.out.println ("b");
				Integer _id = (Integer) (qql[i]);
				System.out.println ("c");
				System.out.println (_id);
				System.out.println ("load...");
				com.aladdin.sc.db.QuestionnaireQuestion _obj = 
					(com.aladdin.sc.db.QuestionnaireQuestion)
						s.load (com.aladdin.sc.db.QuestionnaireQuestion.class, _id );
				rqql.add ( exportQQ ( _obj, false ) );

//			if (qql.length > 1) rqql.add(exportQQ( (com.aladdin.sc.db.QuestionnaireQuestion) qql[i]));
//			else rqql.add(exportQQ( (com.aladdin.sc.db.QuestionnaireQuestion) (Object) qql));
    			System.out.println (" eQQ 17");
    		}
    		System.out.println (" eQQ 18");
    		rqq.addNewQuestions().setQuestionArray(rqql.toArray(new QuestionnaireQuestion[0]));
    		System.out.println (" eQQ 19");
    		
    		return rqq;
    	}
    	
    	private QuestionnaireQuestionAnswer exportQQA (com.aladdin.sc.db.QuestionnaireQuestionAnswer qqa) {
    		System.out.println (" eQQA 1");
    		QuestionnaireQuestionAnswer rqqa = QuestionnaireQuestionAnswer.Factory.newInstance();
    		System.out.println (" eQQA 2");
    		
    		rqqa.setStringValue(qqa.getDescription());
    		System.out.println (" eQQA 3");
    		rqqa.setValue(qqa.getValue().shortValue());
    		System.out.println (" eQQA 4");
//    		if (qqa.getDeleted() != null) rqqa.setDeleted(qqa.getDeleted());
//    		else rqqa.setDeleted(false);
    		System.out.println (" eQQA 5");
//    		rqqa.setId(qqa.getId());
    		System.out.println (" eQQA 6");
    		
    		return rqqa;
    	}
    	     
    	public CreateExternalServiceResponseDocument createExternalService (CreateExternalServiceDocument req) {
    		CreateExternalServiceResponseDocument respdoc = CreateExternalServiceResponseDocument.Factory.newInstance();
    		CreateExternalServiceResponse resp = respdoc.addNewCreateExternalServiceResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getCreateExternalService().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getCreateExternalService().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			ExternalService re = req.getCreateExternalService().getData();
    			com.aladdin.sc.db.ExternalService es = new com.aladdin.sc.db.ExternalService();
    			
    			es.setAddress(re.getAddress());
    			es.setDescription(re.getDescription());
    			s.save(es);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(es.getId().toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	
    	public SaveCarerAssessmentResponseDocument saveCarerAssessment (SaveCarerAssessmentDocument req) {
    		SaveCarerAssessmentResponseDocument respdoc = SaveCarerAssessmentResponseDocument.Factory.newInstance();
    		SaveCarerAssessmentResponse resp = respdoc.addNewSaveCarerAssessmentResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getSaveCarerAssessment().getUserId(), U_CARER) &&
    				!checkUser(req.getSaveCarerAssessment().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getSaveCarerAssessment().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			CarerAssessment rca = req.getSaveCarerAssessment().getAssessment();
    			com.aladdin.sc.db.CarerAssessment ca = new com.aladdin.sc.db.CarerAssessment ();
    			ca.setCarer(new Integer (rca.getCarerID()));
    			ca.setClinician(new Integer (rca.getClinicianID()));
    			ca.setDateOfAssessment(new Timestamp (rca.getDateOfAssessment().getTimeInMillis()));
    			ca.setRelevantHealthProblem(rca.getRelevantHealthProblem());
    			ca.setSeverityOfBurden(new Integer (rca.getSeverityOfBurden()));
    			ca.setEmotionalOrMentalDisorder(rca.getEmotionalOrMentalDisorders());
    			ca.setPsychoactiveDrugs(rca.getPsychoactiveDrugs());
    			ca.setQualityOfLife(new Integer (rca.getQualityOfLife()));
    			
    			s.save(ca);
    			s.getTransaction().commit();
    			
    			res.setCode(ca.getId().toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		
    		return respdoc;
    	}
    	
    	public DeleteCarerResponseDocument deleteCarer (DeleteCarerDocument req) {
    		DeleteCarerResponseDocument respdoc = DeleteCarerResponseDocument.Factory.newInstance();
    		DeleteCarerResponse resp = respdoc.addNewDeleteCarerResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeleteCarer().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getDeleteCarer().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getDeleteCarer().getId());
    			
    			if (id < 1) throw new Exception ("error");
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Carer p = (com.aladdin.sc.db.Carer) s.load(com.aladdin.sc.db.Carer.class, id);
    			Integer pd = p.getPersondata();
    			Integer sd = p.getSd();

    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM carer WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM carer WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM communication WHERE persondata = (SELECT persondata FROM carer WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM carer WHERE id = " + id.toString()).executeUpdate();
    			s.createSQLQuery("DELETE FROM persondata WHERE id = " + pd.toString()).executeUpdate();
    			s.createSQLQuery("DELETE FROM sociodemographicdata WHERE id = " + sd.toString()).executeUpdate();

    			
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString ());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	
    	public CreateAdministratorResponseDocument createAdministrator (CreateAdministratorDocument req) {
    		CreateAdministratorResponseDocument respdoc = CreateAdministratorResponseDocument.Factory.newInstance();
    		CreateAdministratorResponse resp = respdoc.addNewCreateAdministratorResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getCreateAdministrator().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Administrator data = req.getCreateAdministrator().getData();
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Administrator administrator = new com.aladdin.sc.db.Administrator ();
    			
    			Integer pdid = storePersondata(data.getPersonData(), null); 
    			
    			administrator.setPersonData(pdid);
    			s.save(administrator);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(administrator.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	public UpdateExternalServiceResponseDocument updateExternalService (UpdateExternalServiceDocument req) {
    		UpdateExternalServiceResponseDocument respdoc = UpdateExternalServiceResponseDocument.Factory.newInstance();
    		UpdateExternalServiceResponse resp = respdoc.addNewUpdateExternalServiceResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getUpdateExternalService().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getUpdateExternalService().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			ExternalService re = req.getUpdateExternalService().getData();
    			Integer id = new Integer (re.getID()); 

    			com.aladdin.sc.db.ExternalService es = (com.aladdin.sc.db.ExternalService) s.load(com.aladdin.sc.db.ExternalService.class, id);
    			es.setAddress(re.getAddress());
    			es.setDescription(re.getDescription());
    			s.save(es);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	
    	public GetClinicianResponseDocument getClinician (GetClinicianDocument req) {
    		GetClinicianResponseDocument respdoc = GetClinicianResponseDocument.Factory.newInstance();
    		GetClinicianResponse resp = respdoc.addNewGetClinicianResponse();
    		
    		if (
    				!checkUser(req.getGetClinician().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getGetClinician().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getGetClinician().getId());
    			com.aladdin.sc.db.Clinician clinician = (com.aladdin.sc.db.Clinician) s.load(com.aladdin.sc.db.Clinician.class, id);
        		resp.setOut (exportClinician (clinician));
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}
    		
    		return respdoc;
    	}
    	
    	private Clinician exportClinician(com.aladdin.sc.db.Clinician clinician) {
    		Clinician p = Clinician.Factory.newInstance();
			p.setID(clinician.getId().toString());
			p.setPersonData(exportPersonData(clinician.getM_PersonData()));
			return p;
		}
    	
    	public DeletePatientAssessmentResponseDocument deletePatientAssessment (DeletePatientAssessmentDocument req) {
    		DeletePatientAssessmentResponseDocument respdoc = DeletePatientAssessmentResponseDocument.Factory.newInstance();
    		DeletePatientAssessmentResponse resp = respdoc.addNewDeletePatientAssessmentResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeletePatientAssessment().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getDeletePatientAssessment().getUserId(), U_CARER) &&
    				!checkUser(req.getDeletePatientAssessment().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.createSQLQuery("DELETE FROM measurement WHERE patientassessment = " + req.getDeletePatientAssessment().getAssessmentId()).executeUpdate();
    			s.createSQLQuery("DELETE FROM patientassessment WHERE id = " + req.getDeletePatientAssessment().getAssessmentId()).executeUpdate();
    			res.setCode(req.getDeletePatientAssessment().getAssessmentId());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
    		}
    		
    		return respdoc;
    	}
    	
    	public GetAllExternalServicesResponseDocument getAllExternalServices (GetAllExternalServicesDocument getAllExternalServices66) {
    		GetAllExternalServicesResponseDocument respdoc = GetAllExternalServicesResponseDocument.Factory.newInstance();
    		GetAllExternalServicesResponse resp = respdoc.addNewGetAllExternalServicesResponse();
    		
    		try {
    			System.out.println ("1");
    			Object[] esl = s.createQuery("from ExternalService").list().toArray();
    			System.out.println ("2");
    			for (int i = 0; i < esl.length; i++) {
    				System.out.println ("3");
    				com.aladdin.sc.db.ExternalService es = (com.aladdin.sc.db.ExternalService)esl[i];
    				System.out.println ("4");
    				ExternalService re = resp.addNewOut();
    				System.out.println ("5");
    				re.setAddress(es.getAddress());
    				System.out.println ("6");
    				re.setDescription(es.getDescription());
    				System.out.println ("7");
    				re.setID(es.getId().toString());
    				System.out.println ("8");
    			}
    		} catch (Exception e) {
    			System.out.println (e.toString());
			}
    		
    		return respdoc;
    	}
    	
    	public GetCarerResponseDocument getCarer (GetCarerDocument req) {
    		GetCarerResponseDocument respdoc = GetCarerResponseDocument.Factory.newInstance();
    		GetCarerResponse resp = respdoc.addNewGetCarerResponse();
    		
    		if (
    				!checkUser(req.getGetCarer().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getGetCarer().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getGetCarer().getId());
        		com.aladdin.sc.db.Carer carer = (com.aladdin.sc.db.Carer) s.load(com.aladdin.sc.db.Carer.class, id);
        		resp.setOut (exportCarer (carer));
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}
    		
    		return respdoc;
    	}
    	
    	public GetAdministratorResponseDocument getAdministrator (GetAdministratorDocument req) {
    		GetAdministratorResponseDocument respdoc = GetAdministratorResponseDocument.Factory.newInstance();
    		GetAdministratorResponse resp = respdoc.addNewGetAdministratorResponse();
    		
    		if (
    				!checkUser(req.getGetAdministrator().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getGetAdministrator().getId());
				com.aladdin.sc.db.Administrator administrator = (com.aladdin.sc.db.Administrator) s.load(com.aladdin.sc.db.Administrator.class, id);
        		resp.setOut (exportAdministrator (administrator));
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}
    		
    		return respdoc;
    	}
    	
    	private Administrator exportAdministrator (com.aladdin.sc.db.Administrator administrator) {
    		Administrator p = Administrator.Factory.newInstance();
			p.setID(administrator.getId().toString());
			p.setPersonData(exportPersonData(administrator.getM_PersonData()));
			return p;
		}
    	
    	public UpdateAdministratorResponseDocument updateAdministrator (UpdateAdministratorDocument req) {
    		UpdateAdministratorResponseDocument respdoc = UpdateAdministratorResponseDocument.Factory.newInstance();
    		UpdateAdministratorResponse resp = respdoc.addNewUpdateAdministratorResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getUpdateAdministrator().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Administrator data = req.getUpdateAdministrator().getData();
    			
    			s.beginTransaction();
    			
    			Integer id = new Integer (data.getID());
    			com.aladdin.sc.db.Administrator p = (com.aladdin.sc.db.Administrator) s.load (com.aladdin.sc.db.Administrator.class, id);
    			storePersondata(data.getPersonData(), p.getPersonData());
    			s.update(p);
    			s.getTransaction().commit();
    			
    			res.setCode(p.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	public GetQuestionnaireResponseDocument getQuestionnaire (GetQuestionnaireDocument req) {
    		GetQuestionnaireResponseDocument respdoc = GetQuestionnaireResponseDocument.Factory.newInstance();
    		GetQuestionnaireResponse resp = respdoc.addNewGetQuestionnaireResponse();
    		
    		try {
    			Integer id = new Integer (req.getGetQuestionnaire().getId());
    			com.aladdin.sc.db.Questionnaire q = (com.aladdin.sc.db.Questionnaire) s.load(com.aladdin.sc.db.Questionnaire.class, id);
    			resp.setOut(exportQuestionnaire(q));
    		} catch (Exception e) {
    			System.out.println (e.toString());
			}

    		return respdoc;
    	}
    	
    	public StoreQuestionnaireAnswersResponseDocument storeQuestionnaireAnswers (StoreQuestionnaireAnswersDocument req) {
    		StoreQuestionnaireAnswersResponseDocument respdoc = StoreQuestionnaireAnswersResponseDocument.Factory.newInstance();
    		StoreQuestionnaireAnswersResponse resp = respdoc.addNewStoreQuestionnaireAnswersResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getStoreQuestionnaireAnswers().getUserId(), U_CARER) &&
    				!checkUser(req.getStoreQuestionnaireAnswers().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getStoreQuestionnaireAnswers().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			System.out.println ("1");
    			
    			QuestionnaireAnswers data = req.getStoreQuestionnaireAnswers().getData();
				Timestamp datetime = new Timestamp(0);
				//System.out.println (data.getDateTime().toString());
				if (data.getDateTime() != null) datetime = new Timestamp(data.getDateTime().getTimeInMillis());
    			System.out.println ("2");
    			System.out.println (data.getObjectID().toString());
    			Integer objectId = new Integer (data.getObjectID());
    			System.out.println ("3");
    			System.out.println (data.getUserID().toString());
    			Integer userId = new Integer (data.getUserID());
    			System.out.println ("4");
    			
    			Integer id = 0;
    			System.out.println ("5");
    			QuestionnaireAnswer[] rqal = data.getAnswerArray();
    			System.out.println ("6");
    			for (int i = 0; i < rqal.length; i++) {
    				System.out.println ("7");
    				com.aladdin.sc.db.QuestionnaireAnswer qa = new com.aladdin.sc.db.QuestionnaireAnswer();
    				System.out.println ("8");
    				if (rqal[i].getQuestionID() != null) qa.setQuestion(new Integer (rqal[i].getQuestionID()));
    				System.out.println ("9");
    				qa.setValue(rqal[i].getValue());
    				System.out.println ("10");
    				qa.setUserId(userId);
    				System.out.println ("11");
    				qa.setObjectId(objectId);
    				System.out.println ("12");
    				qa.setDateTime(datetime);
    				System.out.println ("13");
    				s.save(qa);
    				System.out.println ("14");
    				id = qa.getId();
    				System.out.println ("15");
    			}
    			
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	
    	public GetPatientAssessmentsResponseDocument getPatientAssessments (GetPatientAssessmentsDocument req) {
    		GetPatientAssessmentsResponseDocument respdoc = GetPatientAssessmentsResponseDocument.Factory.newInstance();
    		GetPatientAssessmentsResponse resp = respdoc.addNewGetPatientAssessmentsResponse();
    		
    		if (
    				!checkUser(req.getGetPatientAssessments().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getGetPatientAssessments().getUserId(), U_CARER) &&
    				!checkUser(req.getGetPatientAssessments().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			System.out.println ("1");
    			Integer patientId = new Integer (req.getGetPatientAssessments().getPatientId());
    			System.out.println ("2");
    			Object[] pal = s.createSQLQuery("SELECT id FROM patientassessment WHERE patient = " + patientId.toString()).list().toArray();
    			System.out.println ("3");
    			
    			for (int i = 0; i < pal.length; i++) {
    				System.out.println ("4");
    				Integer id = (Integer) pal[0];
    				com.aladdin.sc.db.PatientAssessment pa = (com.aladdin.sc.db.PatientAssessment) s.load (com.aladdin.sc.db.PatientAssessment.class, id);
    				System.out.println ("5");
    			
	    			PatientAssessment rpa = resp.addNewOut();
	    			System.out.println ("6");
	    			
	    			rpa.setID(pa.getId().toString());
	    			System.out.println ("7");
	    			rpa.setPatientID(pa.getPatient().toString());
	    			System.out.println ("8");
	    			Calendar c1 = Calendar.getInstance();
	    			System.out.println ("9");
	    			c1.setTimeInMillis(pa.getDateOfAssessment().getTime());
	    			System.out.println ("10");
	    			rpa.setDateOfAssessment(c1);
	    			System.out.println ("11");
	    			SystemParameter aetology = SystemParameter.Factory.newInstance();
	    			System.out.println ("12");
	    			aetology.setCode(pa.getAetology().toString());
	    			System.out.println ("13");
	    			rpa.setAetology(aetology);
	    			System.out.println ("14");
	    			rpa.setTimeEllapsedSinceDiagnosed(pa.getTimeElapsedSinceDiagnose().shortValue());
	    			System.out.println ("15");
	    			rpa.setSeverity(pa.getSeverity().shortValue());
	    			System.out.println ("16");
	    			rpa.setRelevantPathologyAntecedents(pa.getRelevantPathologyAntecedents());
	    			System.out.println ("17");
	    			rpa.setComorbidity(pa.getComorbidity());
	    			System.out.println ("18");
	    			rpa.setCharlsonComorbidityIndex(pa.getCharlsonComobodityIndex().shortValue());
	    			System.out.println ("19");
	    			rpa.setBarthelIndex(pa.getBarthelIndex().shortValue());
	    			System.out.println ("20");
	    			rpa.setLawtonIndex(pa.getLawtonIndex().shortValue());
	    			System.out.println ("21");
	    			rpa.setMMSE(pa.getMMSE().shortValue());
	    			System.out.println ("22");
	    			rpa.setMDRS(pa.getMDRS().shortValue());
	    			System.out.println ("23");
	    			rpa.setBlessedScalePart1(pa.getBlessedScalePart1().doubleValue());
	    			System.out.println ("24");
	    			rpa.setBlessedScalePart2(pa.getBlessedScalePart2().shortValue());
	    			System.out.println ("25");
	    			rpa.setBlessedScalePart3(pa.getBlessedScalePart3().shortValue());
	    			System.out.println ("26");
	    			rpa.setChecklistMBP(pa.getChecklistMBPC().shortValue());
	    			System.out.println ("27");
	    			rpa.setNPQISeverity(pa.getNPQISeverity().shortValue());
	    			System.out.println ("28");
	    			rpa.setNPQIStress(pa.getNPQIStress().shortValue());
	    			System.out.println ("29");
	    			rpa.setGDS(pa.getGDS().shortValue());
	    			System.out.println ("30");
	    			rpa.setFalls(pa.getFalls());
	    			System.out.println ("31");
	    			rpa.setIncontinence(pa.getIncontinence());
	    			System.out.println ("32");
	    			rpa.setDelirium(pa.getDelirium());
	    			System.out.println ("33");
	    			rpa.setImmobility(pa.getImmobility());
	    			System.out.println ("34");
	    			rpa.setSensorialDeficits(pa.getSensorialDeficits());
	    			System.out.println ("35");
	    			rpa.setPharmacologicalTreatment(pa.getPharmacologyTreatment());
	    			System.out.println ("36");
	    			
	    			Object[] ml = pa.getMeasurements().toArray();
	    			System.out.println ("37");
	    			List<Measurement> rml = new ArrayList<Measurement> ();
	    			System.out.println ("38");
	    			for (int j = 0; j < ml.length; j++) {
	    				System.out.println ("39");
	    				rml.add(exportMeasurement( (com.aladdin.sc.db.Measurement) ml[j]));
	    				System.out.println ("40");
	    			}
	    			System.out.println ("41");
	    			rpa.setClinicalDataArray((Measurement[]) rml.toArray(new Measurement[0]));
	    			System.out.println ("42");
    			}
    			
    		} catch (Exception e) {
    			System.out.println (e.toString());
			}
    		
    		return respdoc;
    	}
    	
    	public GetCarerAssessmentsResponseDocument getCarerAssessments (GetCarerAssessmentsDocument req) {
    		GetCarerAssessmentsResponseDocument respdoc = GetCarerAssessmentsResponseDocument.Factory.newInstance();
    		GetCarerAssessmentsResponse resp = respdoc.addNewGetCarerAssessmentsResponse();
    		
    		if (
    				!checkUser(req.getGetCarerAssessments().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getGetCarerAssessments().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer carerId = new Integer (req.getGetCarerAssessments().getCarerId());
    			Object[] cal = s.createSQLQuery("SELECT id FROM carerassessment WHERE carer = " + carerId.toString()).list().toArray();
    			
    			for (int i = 0; i < cal.length; i++) {
    				Integer id = (Integer) cal[0];
    				com.aladdin.sc.db.CarerAssessment ca = (com.aladdin.sc.db.CarerAssessment) s.load (com.aladdin.sc.db.CarerAssessment.class, id);
    				
    				CarerAssessment rca = resp.addNewOut();
        			rca.setID(ca.getId().toString());
        			rca.setCarerID(ca.getCarer().toString());
        			rca.setClinicianID(ca.getClinician().toString());
        			Calendar c1 = Calendar.getInstance();
        			c1.setTimeInMillis (ca.getDateOfAssessment().getTime());
        			rca.setDateOfAssessment(c1);
        			rca.setRelevantHealthProblem(ca.getRelevantHealthProblem());
        			rca.setSeverityOfBurden(ca.getSeverityOfBurden().shortValue());
        			rca.setEmotionalOrMentalDisorders(ca.getEmotionalOrMentalDisorder());
        			rca.setPsychoactiveDrugs(ca.getPsychoactiveDrugs());
        			rca.setQualityOfLife(ca.getQualityOfLife().shortValue());
    			}
    		} catch (Exception e) {
    			System.out.println (e.toString());
			}
    		
    		return respdoc;
    	}
    	
    	public ChangeTaskStatusResponseDocument changeTaskStatus (ChangeTaskStatusDocument req) {
    		ChangeTaskStatusResponseDocument respdoc = ChangeTaskStatusResponseDocument.Factory.newInstance();
    		ChangeTaskStatusResponse resp = respdoc.addNewChangeTaskStatusResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getChangeTaskStatus().getUserId(), U_CARER) &&
    				!checkUser(req.getChangeTaskStatus().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getChangeTaskStatus().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Integer id = req.getChangeTaskStatus().getTaskId();
    			Integer status = req.getChangeTaskStatus().getTaskStatus();
    			
    			s.beginTransaction();
    			s.createSQLQuery("UPDATE task SET taskstatus = '" + status.toString() + "' WHERE id = '" + id.toString() + "'").executeUpdate();
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    			
    		} catch (Exception e) {
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	
    	public ListOfPatientsResponseDocument listOfPatients (ListOfPatientsDocument req) {
    		ListOfPatientsResponseDocument respdoc = ListOfPatientsResponseDocument.Factory.newInstance();
    		ListOfPatientsResponse resp = respdoc.addNewListOfPatientsResponse();
    		
    		if (
    				!checkUser(req.getListOfPatients().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getListOfPatients().getUserId(), U_CARER) &&
    				!checkUser(req.getListOfPatients().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			List<Field> fl = new ArrayList<Field>();
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.PersonData.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.SocioDemographicData.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Address.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Communication.class.getDeclaredFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Identifier.class.getDeclaredFields()));
    			
    			String sql = "SELECT p.id FROM patient p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) LEFT JOIN sociodemographicdata sd ON (sd.id = p.sd) LEFT JOIN patientcarer ON (patientcarer.patient = p.id) WHERE ";
    			
    			SearchCriteria[] sc = req.getListOfPatients().getFilterArray();
    			System.out.println ("listOfPatients");
    			System.out.println (sc.length);
    			System.out.println (fl.size());
    			for (int i = 0; i < sc.length; i++) {
    				
    				if (sc[i].getFieldName() == null) continue;
    				
    				System.out.println (sc[i].getFieldName());
    				for (int j = 0; j < fl.size(); j++) {
    					System.out.println (fl.get(j).getName());
    					if (fl.get(j).getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
    						System.out.println ("1");
    						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
    						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
    						sql += " AND ";
    					} else System.out.println ("0");
    				}
    				System.out.println ("if");
    				if (sc[i].getFieldName().compareToIgnoreCase("carer") == 0) {
    					System.out.println ("carer");
						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
						sql += String.format(op.get(opnum), "patientcarer.carer", sc[i].getFieldValue1(), sc[i].getFieldValue2());
						sql += " AND ";
					}
    			}
    			sql += " 1=1 GROUP BY p.id, p.persondata, p.clinician, p.sd";

    			Object[] ql = s.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				Integer id = (Integer) ql[i];
    				com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient)s.load(com.aladdin.sc.db.Patient.class, id);
    				PatientInfo qi = resp.addNewOut();
    				qi.setID(p.getId().toString());
    				qi.setSurname(p.getM_PersonData().getSurname());
    				qi.setName(p.getM_PersonData().getName());
    			}
    		} catch (Exception e) {
    			System.out.println (e.toString());
    		}
    		
    		return respdoc;
    	}
    	
    	public GetWarningsResponseDocument getWarnings (GetWarningsDocument req) {
    		GetWarningsResponseDocument respdoc = GetWarningsResponseDocument.Factory.newInstance();
    		GetWarningsResponse resp = respdoc.addNewGetWarningsResponse();
    		
    		if (
    				!checkUser(req.getGetWarnings().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getGetWarnings().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Field[] field = com.aladdin.sc.db.Warning.class.getDeclaredFields();
    			String sql = "SELECT id FROM warning WHERE ";
    			
    			SearchCriteria[] sc = req.getGetWarnings().getWarnArray();
    			for (int i = 0; i < sc.length; i++) {
    				for (int j = 0; j < field.length; j++) {
    					if (field[j].getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
    						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
    						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
    						sql += " AND ";
    					}
    				}
    			}
    			sql += "1=1";
    			
    			Object[] list = s.createSQLQuery(sql).list().toArray();
				for (int i = 0; i < list.length; i++) {
    				Integer id = (Integer) list[i];
					com.aladdin.sc.db.Warning w = (com.aladdin.sc.db.Warning) s.load(com.aladdin.sc.db.Warning.class, id);
					Warning rw = resp.addNewOut();
    				rw.setID(w.getId().toString());
    				
    				SystemParameter typeOfWarning = SystemParameter.Factory.newInstance();
    				typeOfWarning.setCode(w.getTypeOfWarning().toString());
    				//typeOfWarning.setDescription(Dict.getTypeOfWarningDesciption(typeOfWarning.getCode(), s));
    				
    				rw.setTypeOfWarning(typeOfWarning);
    				Calendar c1 = Calendar.getInstance();
    				c1.setTimeInMillis(w.getDateTimeOfWarning().getTime());
    				rw.setDateTimeOfWarning(c1);
    				
    				SystemParameter effect = SystemParameter.Factory.newInstance();
    				effect.setCode(w.getEffect().toString());
    				//effect.setDescription(Dict.getEffectOfWarningDesciption(effect.getCode(), s));
    				
    				rw.setEffect(effect);
    				
    				SystemParameter indicator = SystemParameter.Factory.newInstance();
    				indicator.setCode(w.getIndicator().toString());
    				//indicator.setDescription(Dict.getIndicatorOfWarningDesciption(indicator.getCode(), s));
    				
    				rw.setIndicator(indicator);
    				
    				SystemParameter riskLevel = SystemParameter.Factory.newInstance();
    				riskLevel.setCode(w.getRiskLevel().toString());
    				//riskLevel.setDescription(Dict.getRisklevelOfWarningDesciption(riskLevel.getCode(), s));
    				
    				rw.setRiskLevel(riskLevel);
    				rw.setJustificationText(w.getJustificationText());
    				
    				SystemParameter emergencyLevel = SystemParameter.Factory.newInstance();
    				emergencyLevel.setCode(w.getEmergencyLevel().toString());
    				//emergencyLevel.setDescription(Dict.getEmergencylevelOfWarningDesciption(emergencyLevel.getCode(), s));
    				
    				rw.setEmergencyLevel(emergencyLevel);
    				rw.setPatientID(w.getPatientID());
    				rw.setDelivered(w.getDelivered());
    			}
    		} catch (Exception e) {
    			System.out.println (e.toString());
			}
    		
    		return respdoc;
    	}
    	
    	public UpdateClinicianResponseDocument updateClinician (UpdateClinicianDocument req) {
    		UpdateClinicianResponseDocument respdoc = UpdateClinicianResponseDocument.Factory.newInstance();
    		UpdateClinicianResponse resp = respdoc.addNewUpdateClinicianResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getUpdateClinician().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Clinician data = req.getUpdateClinician().getData();
    			
    			s.beginTransaction();
    			
    			Integer id = new Integer (data.getID());
    			com.aladdin.sc.db.Clinician p = (com.aladdin.sc.db.Clinician) s.load (com.aladdin.sc.db.Clinician.class, id);
    			storePersondata(data.getPersonData(), p.getPersondata());
    			s.update(p);
    			
    			s.getTransaction().commit();
    			
    			res.setCode(p.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}
    	
    	public MarkWarningAsReadResponseDocument markWarningAsRead (MarkWarningAsReadDocument req) {
    		MarkWarningAsReadResponseDocument respdoc = MarkWarningAsReadResponseDocument.Factory.newInstance();
    		MarkWarningAsReadResponse resp = respdoc.addNewMarkWarningAsReadResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getMarkWarningAsRead().getUserId(), U_CLINICIAN) &&
    				!checkUser(req.getMarkWarningAsRead().getUserId(), U_ADMIN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getMarkWarningAsRead().getId());
    			
    			s.beginTransaction();
    			s.createSQLQuery("UPDATE warning SET delivered = '1' WHERE id = '" + id.toString() + "'").executeUpdate();
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			System.out.println (e.toString());
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
    		
    		return respdoc;
    	}
    	
    	private Integer existUser (String username, Integer id) {
    		if (s.createSQLQuery("SELECT * FROM aladdinuser WHERE username like '" + username + "' AND id != '" + id.toString() + "'").list().size() > 1) return 1;
    		return 0;
    	}
         
        public UpdateUserResponseDocument updateUser (UpdateUserDocument req) {
        	UpdateUserResponseDocument respdoc = UpdateUserResponseDocument.Factory.newInstance();
        	UpdateUserResponse resp = respdoc.addNewUpdateUserResponse();
        	OperationResult res = resp.addNewOut();
        	
        	try {
        		User ru = req.getUpdateUser().getUser();
        		if (existUser(ru.getUsername(), new Integer (ru.getID())) == 1) {
        			res.setCode("-2");
            		res.setDescription("user with same username exist");
            		res.setStatus((short) 0);
        		}
        		
        		s.beginTransaction();
        		
        		com.aladdin.sc.db.AladdinUser u = new com.aladdin.sc.db.AladdinUser ();
        		
        		u.setId(new Integer (ru.getID()));
        		u.setType(new Integer (ru.getType().getCode()));
        		u.setPersonId(ru.getPersonID());
        		u.setUsername(ru.getUsername());
        		u.setPassword(ru.getPassword());
        		s.save (u);
        		
        		s.getTransaction().commit();
        		
        		res.setCode(u.getId().toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
        	} catch (Exception e) {
        		res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
        	
        	return respdoc;
        }
         
        public DeleteUserResponseDocument deleteUser (DeleteUserDocument req) {
        	DeleteUserResponseDocument respdoc = DeleteUserResponseDocument.Factory.newInstance();
        	DeleteUserResponse resp = respdoc.addNewDeleteUserResponse();
        	OperationResult res = resp.addNewOut();
        	
        	try {
        		s.beginTransaction();
        		Integer id = new Integer (req.getDeleteUser().getId());
        		s.createSQLQuery("DELETE FROM aladdinuser WHERE id = " + id.toString()).executeUpdate();
        		s.getTransaction().commit();
        		
        		res.setCode(id.toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
        	} catch (Exception e) {
        		res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
        	
        	return respdoc;
        }
         
        public AuthResponseDocument auth (AuthDocument req) {
        	AuthResponseDocument respdoc = AuthResponseDocument.Factory.newInstance();
        	AuthResponse resp = respdoc.addNewAuthResponse();
        	OperationResult res = resp.addNewOut();
        	
        	String sql = "";
        	
        	try {
        		String username = req.getAuth().getLogin();
        		String password = req.getAuth().getPassword();
        		sql = "SELECT id FROM aladdinuser WHERE username like '" + username + "' AND password like '" + password + "'";
        		SQLQuery q = s.createSQLQuery(sql);
        		if (q.list().size() == 1) {
        			res.setCode(q.list().get(0).toString());
        			res.setDescription("ok");
        			res.setStatus((short) 1);
        		} else {
        			res.setCode("0");
        			res.setDescription("none");
        			res.setStatus((short) 0);
        		}
        	} catch (Exception e) {
        		res.setCode("-2");
        		res.setDescription("database error sql = " + sql + " ex = " + e.toString());
        		res.setStatus((short) 0);
			}
        	
        	return respdoc;
        }
         
        public ChangePasswordResponseDocument changePassword (ChangePasswordDocument req) {
        	ChangePasswordResponseDocument respdoc = ChangePasswordResponseDocument.Factory.newInstance();
        	ChangePasswordResponse resp = respdoc.addNewChangePasswordResponse();
        	OperationResult res = resp.addNewOut();
        	
        	try {
        		Integer id = new Integer (req.getChangePassword().getUserId());
        		String password = req.getChangePassword().getPassword();
        		s.beginTransaction();
        		s.createSQLQuery("UPDATE aladdinuser SET password = '" + password + "' WHERE id = '" + id.toString() + "'").executeUpdate();
        		s.getTransaction().commit();
        		
        		res.setCode(id.toString());
    			res.setDescription("ok");
    			res.setStatus((short) 1);
        	} catch (Exception e) {
        		res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
			}
        	
        	return respdoc;
        }

        public CreateUserResponseDocument createUser (CreateUserDocument req) {
        	CreateUserResponseDocument respdoc = CreateUserResponseDocument.Factory.newInstance();
        	CreateUserResponse resp = respdoc.addNewCreateUserResponse();
        	OperationResult res = resp.addNewOut();
        	
        	try {
        		User ru = req.getCreateUser().getUser();
        		if (existUser(ru.getUsername(), 0) == 1) {
        			res.setCode("-2");
            		res.setDescription("user with same username exist");
            		res.setStatus((short) 0);
        		}
        		
        		s.beginTransaction();
        		
        		com.aladdin.sc.db.AladdinUser u = new com.aladdin.sc.db.AladdinUser ();
        		
        		u.setType(new Integer (ru.getType().getCode()));
        		u.setPersonId(ru.getPersonID());
        		u.setUsername(ru.getUsername());
        		u.setPassword(ru.getPassword());
        		s.save (u);
        		
        		s.getTransaction().commit();
        		
        		res.setCode(u.getId().toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
        	} catch (Exception e) {
        		res.setCode("-2");
        		res.setDescription("database error " + e.toString());
        		res.setStatus((short) 0);
			}
        	return respdoc;
        }
        
		public GetUserTypeResponseDocument getUserType (GetUserTypeDocument req) {
			GetUserTypeResponseDocument respdoc = GetUserTypeResponseDocument.Factory.newInstance();
			GetUserTypeResponse resp = respdoc.addNewGetUserTypeResponse();
			OperationResult res = resp.addNewOut();
				 
			try {
				Integer id = new Integer (req.getGetUserType().getId());
				String sql = "SELECT type FROM aladdinuser WHERE id = '" + id + "'";
        		SQLQuery q = s.createSQLQuery(sql);
        		if (q.list().size() == 1) {
        			res.setCode(q.list().get(0).toString());
        			res.setDescription("ok");
        			res.setStatus((short) 1);
        		} else {
        			res.setCode("0");
        			res.setDescription("none");
        			res.setStatus((short) 0);
        		}
			} catch (Exception e) {
				res.setCode("-2");
				res.setDescription("database error " + e.toString());
				res.setStatus((short) 0);
			}
				 
			return respdoc;
		}
		
		public GetSystemParameterListResponseDocument getSystemParameterList (GetSystemParameterListDocument req) {
			GetSystemParameterListResponseDocument respdoc = GetSystemParameterListResponseDocument.Factory.newInstance();
			GetSystemParameterListResponse resp = respdoc.addNewGetSystemParameterListResponse();
			
			try {
				Integer type = new Integer (req.getGetSystemParameterList().getType());
				Integer language = new Integer (req.getGetSystemParameterList().getLanguage());
				
				String sql = "SELECT code, description FROM dict WHERE type = '" + type.toString() + "' AND language = '" + language.toString() + "'";
				Object[] ret = s.createSQLQuery(sql).list().toArray();
				
				for (int i = 0; i < ret.length; i++) {
					Object[] obj = (Object[]) ret[i];
					SystemParameter sp = resp.addNewOut();
					sp.setCode(obj[0].toString());
					sp.setDescription(obj[1].toString());
				}
				
			} catch (Exception e) {
				System.out.println (e.toString());
			}
			
			return respdoc;
        }
		
		public GetUserResponseDocument getUser (GetUserDocument req) {
			GetUserResponseDocument respdoc = GetUserResponseDocument.Factory.newInstance();
			GetUserResponse resp = respdoc.addNewGetUserResponse();
			
			try {
				Integer id = new Integer (req.getGetUser().getId());
				com.aladdin.sc.db.AladdinUser user = (com.aladdin.sc.db.AladdinUser) s.load(com.aladdin.sc.db.AladdinUser.class, id);
				
				User ru = resp.addNewOut();
				ru.setID(user.getId().toString());
				ru.setPassword("");
				ru.setPersonID(user.getPersonId());
				SystemParameter spType = SystemParameter.Factory.newInstance();
				spType.setCode(user.getType().toString());
				ru.setType(spType);
				ru.setUsername(user.getUsername());
				
			} catch (Exception e) {
				System.out.println (e.toString());
			}
			
			return respdoc;
        }
		
		public GetPatientsForCaregiverResponseDocument getPatientsForCaregiver (GetPatientsForCaregiverDocument req) {
			GetPatientsForCaregiverResponseDocument respdoc = GetPatientsForCaregiverResponseDocument.Factory.newInstance();
			GetPatientsForCaregiverResponse resp = respdoc.addNewGetPatientsForCaregiverResponse();
			
			try {
				Integer uid = new Integer (req.getGetPatientsForCaregiver().getUserId());
				String sql = "SELECT personid FROM aladdinuser WHERE id = '" + uid.toString() + "' AND type = '3'";
        		SQLQuery q = s.createSQLQuery(sql);
        		if (q.list().size() == 1) {
        			sql = "SELECT id FROM patientcarer WHERE carer = '" + q.list().get(0).toString() + "'";
        			
        			Object[] ql = s.createSQLQuery(sql).list().toArray();
        			for (int i = 0; i < ql.length; i++) {
        				Integer id = (Integer) ql[i];
        				com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient)s.load(com.aladdin.sc.db.Patient.class, id);
        				PatientInfo qi = resp.addNewOut();
        				qi.setID(p.getId().toString());
        				qi.setSurname(p.getM_PersonData().getSurname());
        				qi.setName(p.getM_PersonData().getName());
        			}
        		}
			} catch (Exception e) {
				System.out.println (e.toString());
			}
			
			return respdoc;
        }
        
        
    	// TODO:
    	public ListOfPossibleTasksResponseDocument listOfPossibleTasks (ListOfPossibleTasksDocument listOfPossibleTasks48) {
    		ListOfPossibleTasksResponseDocument respdoc = ListOfPossibleTasksResponseDocument.Factory.newInstance();
    		ListOfPossibleTasksResponse resp = respdoc.addNewListOfPossibleTasksResponse();
    		
    		for (Integer i = 1; i < getTaskTypesCount() + 1; i++) {
    			SystemParameter pt = resp.addNewOut();
        		pt.setCode(i.toString());
        		//pt.setDescription(Dict.getTaskDescription(i.toString(), s));
    		}
    		
    		return respdoc;
    	}

		public GetUserIdByPersonIdResponseDocument getUserIdByPersonId (GetUserIdByPersonIdDocument req) {
			GetUserIdByPersonIdResponseDocument respdoc = GetUserIdByPersonIdResponseDocument.Factory.newInstance();
			GetUserIdByPersonIdResponse resp = respdoc.addNewGetUserIdByPersonIdResponse();
			OperationResult res = resp.addNewOut();
			
			try {
				Integer uid = new Integer (req.getGetUserIdByPersonId().getId());
				Integer type = req.getGetUserIdByPersonId().getType();
				
				String sql = "SELECT id FROM aladdinuser WHERE personid like '" + uid.toString() + "' AND type = '" + type.toString() + "'";
				System.out.println (sql);
				System.out.println (1);
				SQLQuery q = s.createSQLQuery(sql);
				System.out.println (2);
				List list = q.list();
				System.out.println (list.size());
				System.out.println (3);
				Object[] obj = list.toArray();
				System.out.println (obj.length);
				System.out.println (4);
				if (obj.length == 1) {
					res.setCode(obj[0].toString());
					res.setStatus((short)1);
					res.setDescription("ok");
				} else {
					res.setCode("0");
        			res.setDescription("none");
        			res.setStatus((short) 0);
				}
			} catch (Exception e) {
				res.setCode("-2");
				res.setDescription("database error " + e.toString());
				System.out.println (e.toString());
				res.setStatus((short) 0);
			}
			
			return respdoc;
		}

    
    }
    
