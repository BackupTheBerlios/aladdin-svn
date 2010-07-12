    package com.aladdin.sc;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.aladdin.sc.db.AladdinUser;

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
import eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse;
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
    		if (userId == null) return false;
    		String sql = "SELECT * FROM aladdinuser WHERE id = '" + userId + "' AND type = '" + userType.toString() + "'";
    		System.out.println (sql);
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
    		if (id != null && id > 0) pd.setId(id);
    		s.save (pd);
    		
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
    		s.save (ad);
    	}

    	public CreatePatientResponseDocument createPatient (CreatePatientDocument req) {
    		CreatePatientResponseDocument respdoc = CreatePatientResponseDocument.Factory.newInstance();
    		CreatePatientResponse resp = respdoc.addNewCreatePatientResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getCreatePatient().getUserId(), U_CLINICIAN)
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
    		if (id != null && id > 0) sd.setId(id);
    		s.save(sd);
    		return sd.getId();
    	}
    	
    	public CreateCarerResponseDocument createCarer (CreateCarerDocument req) {
    		CreateCarerResponseDocument respdoc = CreateCarerResponseDocument.Factory.newInstance();
    		CreateCarerResponse resp = respdoc.addNewCreateCarerResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getCreateCarer().getUserId(), U_CLINICIAN)
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
    				!checkUser(req.getUpdateQuestionnaire().getUserId(), U_CLINICIAN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			Questionnaire rquest = req.getUpdateQuestionnaire().getData();
    			com.aladdin.sc.db.Questionnaire quest = new com.aladdin.sc.db.Questionnaire ();
    			
    			quest.setId(new Integer(rquest.getID()));
    			quest.setTitle(rquest.getTitle());
    			quest.setVersion(rquest.getVersion());
    			s.save (quest);
    			
    			QuestionnaireQuestion[] rqq = rquest.getQuestionArray();
    			 
    			for (int i = 0; i < rqq.length; i++) {
    				updateQQ(rqq[i], 0);
    			}
    			
    			s.getTransaction().commit();
    			
    			res.setCode(quest.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}

    	private void updateQQ(QuestionnaireQuestion rqq, int parentId) {
    		com.aladdin.sc.db.QuestionnaireQuestion qq = new com.aladdin.sc.db.QuestionnaireQuestion ();
    		qq.setType(rqq.getType());
    		if (rqq.getId() != null) qq.setId(new Integer (rqq.getId()));
    		qq.setCondition(new Integer(rqq.getCondition()));
    		qq.setTitle(rqq.getTitle());
    		qq.setParentid(parentId);
    		s.save (qq);
    		for (int i = 0; i < rqq.getQuestions().getQuestionArray().length; i++) {
    			updateQQ (rqq.getQuestions().getQuestionArray(i), qq.getId());
    		}
    		QuestionnaireQuestionAnswer rqqa = null;
    		com.aladdin.sc.db.QuestionnaireQuestionAnswer qqa = new com.aladdin.sc.db.QuestionnaireQuestionAnswer ();
    		s.createSQLQuery("DELETE FROM questionnairequestionanswer WHERE question = " + qq.getId().toString()).executeUpdate();
    		for (int i = 0; i < rqq.getAnswers().getAnswerArray().length; i++) {
    			rqqa = rqq.getAnswers().getAnswerArray(i);
    			qqa.setValue(new Integer(rqqa.getValue()));
    			qqa.setQuestion(qq.getId());
    			qqa.setDescription(rqqa.getStringValue());
    			s.save (qqa);
    		}
    	}
    	
    	public ListOfQuestionnairesResponseDocument listOfQuestionnaires (ListOfQuestionnairesDocument listOfQuestionnaires2) {
    		ListOfQuestionnairesResponseDocument respdoc = ListOfQuestionnairesResponseDocument.Factory.newInstance();
    		ListOfQuestionnairesResponse resp = respdoc.addNewListOfQuestionnairesResponse();
    		
    		// TODO: auth
    		
    		try {
    			com.aladdin.sc.db.Questionnaire[] ql = (com.aladdin.sc.db.Questionnaire[]) s.createSQLQuery("SELECT * FROM questionnaire").list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				QuestionnaireInfo qi = resp.addNewOut();
    				qi.setID(ql[i].getId().toString());
    				qi.setTitle(ql[i].getTitle());
    				qi.setVersion(ql[i].getVersion());
    			}
    		} catch (Exception e) {
    		}
    		
    		return respdoc;
    	}
    	
    	public SaveWarningResponseDocument saveWarning (SaveWarningDocument req) {
    		SaveWarningResponseDocument respdoc = SaveWarningResponseDocument.Factory.newInstance();
    		SaveWarningResponse resp = respdoc.addNewSaveWarningResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getSaveWarning().getUserId(), U_CARER)
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
    			
    			s.getTransaction().commit();
    			res.setCode(warn.getId().toString());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
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
    				!checkUser(req.getUpdateCarer().getUserId(), U_CLINICIAN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Carer data = req.getUpdateCarer().getData();
    			
    			s.beginTransaction();
    			
    			List l = s.createQuery("from carer").setParameter("id", data.getID(), Hibernate.INTEGER).list();
    			if (l.size() < 1) throw new Exception("error");
    			com.aladdin.sc.db.Carer p = (com.aladdin.sc.db.Carer) l.get(0);
    			
    			storePersondata(data.getPersonData(), p.getPersondata());
    			
    			storeSocioDemographic(data.getSDData(), p.getSd());
    			
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
    			
    			s.beginTransaction();
    			
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT communication FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM persondata WHERE id = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM administrator WHERE id = " + id.toString()).executeUpdate();
    			
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
    	
    	public UpdataPatientResponseDocument updataPatient (UpdataPatientDocument req) {
    		UpdataPatientResponseDocument respdoc = UpdataPatientResponseDocument.Factory.newInstance();
    		UpdataPatientResponse resp = respdoc.addNewUpdataPatientResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getUpdataPatient().getUserId(), U_CLINICIAN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Patient data = req.getUpdataPatient().getData();
    			
    			Session s = HibernateUtil.getSessionFactory().openSession();
    			s.beginTransaction();
    			
    			List l = s.createQuery("from patient").setParameter("id", data.getID(), Hibernate.INTEGER).list();
    			if (l.size() < 1) throw new Exception("error");
    			com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient) l.get(0);
    			
    			storePersondata(data.getPersonData(), p.getPersondata());
    			
    			storeSocioDemographic(data.getSDData(), p.getSd());
    			
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
    	
    	public ListOfCarersResponseDocument listOfCarers (ListOfCarersDocument req) {
    		ListOfCarersResponseDocument respdoc = ListOfCarersResponseDocument.Factory.newInstance();
    		ListOfCarersResponse resp = respdoc.addNewListOfCarersResponse();
    		
    		if (
    				!checkUser(req.getListOfCarers().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getListOfCarers().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			List<Field> fl = new ArrayList<Field>();
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.PersonData.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.SocioDemographicData.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Address.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Communication.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Identifier.class.getFields()));
    			
    			String sql = "SELECT p.* FROM patient p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) LEFT JOIN sociodemographicdata sd ON (sd.id = p.sd) WHERE ";
    			
    			SearchCriteria[] sc = req.getListOfCarers().getFilterArray();
    			for (int i = 0; i < sc.length; i++) {
    				for (int j = 0; j < fl.size(); j++) {
    					if (fl.get(j).getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
    						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
    						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
    						sql += " AND ";
    					}
    				}
    			}
    			sql += " 1 GROUP BY p.id";
    			
    			com.aladdin.sc.db.Carer[] ql = (com.aladdin.sc.db.Carer[]) s.createQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				CarerInfo qi = resp.addNewOut();
    				qi.setID(ql[i].getId().toString());
    				qi.setSurname(ql[i].getM_PersonDatapersondata().getSurname());
    				qi.setName(ql[i].getM_PersonDatapersondata().getName());
    			}
    		} catch (Exception e) {
    		}
    		
    		return respdoc;
    	}
    	
    	public ListOfCliniciansResponseDocument listOfClinicians (ListOfCliniciansDocument req) {
    		ListOfCliniciansResponseDocument respdoc = ListOfCliniciansResponseDocument.Factory.newInstance();
    		ListOfCliniciansResponse resp = respdoc.addNewListOfCliniciansResponse();
    		
    		if (
    				!checkUser(req.getListOfClinicians().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getListOfClinicians().getUserId(), U_ADMIN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			List<Field> fl = new ArrayList<Field>();
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.PersonData.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Address.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Communication.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Identifier.class.getFields()));
    			
    			String sql = "SELECT p.* FROM patient p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) WHERE ";
    			
    			SearchCriteria[] sc = req.getListOfClinicians().getFilterArray();
    			for (int i = 0; i < sc.length; i++) {
    				for (int j = 0; j < fl.size(); j++) {
    					if (fl.get(j).getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
    						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
    						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
    						sql += " AND ";
    					}
    				}
    			}
    			sql += " 1 GROUP BY p.id";
    			
    			com.aladdin.sc.db.Clinician[] ql = (com.aladdin.sc.db.Clinician[]) s.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				ClinicianInfo qi = resp.addNewOut();
    				qi.setID(ql[i].getId().toString());
    				qi.setSurname(ql[i].getM_PersonDatapersondata().getSurname());
    				qi.setName(ql[i].getM_PersonDatapersondata().getName());
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
    				!checkUser(req.getSavePatientAssessment().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getSavePatientAssessment().getUserId(), U_CARER) ||
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
    			pa.setBlessedScalePart1(rpa.getBlessedScalePart1());
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
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}

    	private Integer storeMeasurement(Measurement rm, Integer paid) {
    		long timeInMillis = 0;
    		com.aladdin.sc.db.Measurement m = new com.aladdin.sc.db.Measurement ();
    		m.setPatient(new Integer (rm.getPatientID()));
    		m.setPatientassessment (paid);
    		m.setType(rm.getType().getCode());
    		m.setValue(rm.getValue());
    		if (rm.getDateTime() != null) timeInMillis = rm.getDateTime().getTimeInMillis();
    		m.setDatetime(new Timestamp(timeInMillis));
    		m.setUnits(rm.getUnits());
    		m.setLowerlimit(rm.getLowerLimit());
    		m.setUpperlimit(rm.getUpperLimit());
    		m.setTask(new Integer (rm.getTaskID()));
    		s.save (m);
    		return m.getId();
    	}
    	
    	public StoreMeasurementsResponseDocument storeMeasurements (StoreMeasurementsDocument req) {
    		StoreMeasurementsResponseDocument respdoc = StoreMeasurementsResponseDocument.Factory.newInstance();
    		StoreMeasurementsResponse resp = respdoc.addNewStoreMeasurementsResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getStoreMeasurements().getUserId(), U_CARER)
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
    				!checkUser(req.getGetPatient().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getGetPatient().getUserId(), U_CARER)
				) {
    			return respdoc;
    		}
    		
    		try {
    			List list =  s.createQuery("from patient").setInteger("id", new Integer (req.getGetPatient().getId())).list();
        		if (list.size() != 1) throw new Exception ("");
        		
        		com.aladdin.sc.db.Patient patient = (com.aladdin.sc.db.Patient) list.get(0);
        		
        		resp.setOut (exportPatient (patient));
        		
    		} catch (Exception e) {
    		}
    		
    		return respdoc;
    	}

		private Patient exportPatient(com.aladdin.sc.db.Patient patient) {
			Patient p = Patient.Factory.newInstance();
			p.setID(patient.getId().toString());
			p.setPersonData(exportPersonData(patient.getM_PersonDatapersondata()));
			p.setSDData (exportSocioDemographicData(patient.getM_SocioDemographicDatasd()));
			p.setResponsibleClinicianID(patient.getClinician().toString());
			
			com.aladdin.sc.db.PatientCarer[] pc = (com.aladdin.sc.db.PatientCarer[]) patient.getPatientCarers1().toArray();
			PatientCarerList pcl = p.addNewPatientCarerList();
			for (int i = 0; i < pc.length; i++) {
				PatientCarer rpc = pcl.addNewPatientCarer();
				rpc.setIsPrimary(pc[i].getIsprimary());
				rpc.setCarer(exportCarer(pc[i].getM_Carercarer()));
			}
			return p;
		}

		private Carer exportCarer(com.aladdin.sc.db.Carer carer) {
			Carer c = Carer.Factory.newInstance();
			c.setID(carer.getId().toString());
			c.setPersonData(exportPersonData(carer.getM_PersonDatapersondata()));
			c.setSDData(exportSocioDemographicData(carer.getM_SocioDemographicDatasd()));
			return c;
		}

		private SocioDemographicData exportSocioDemographicData (com.aladdin.sc.db.SocioDemographicData SDData) {
			SocioDemographicData sd = SocioDemographicData.Factory.newInstance();
			sd.setAge(SDData.getAge().shortValue());
			SystemParameter gender = SystemParameter.Factory.newInstance();
			gender.setCode(SDData.getGender().toString());
			sd.setGender(gender);
			SystemParameter maritalStatus = SystemParameter.Factory.newInstance();
			maritalStatus.setCode(SDData.getMaritalStatus().toString());
			sd.setMaritalStatus(maritalStatus);
			sd.setChildren(SDData.getChildren().shortValue());
			SystemParameter livingWith = SystemParameter.Factory.newInstance();
			livingWith.setCode(SDData.getLivingWith().toString());
			sd.setLivingWith(livingWith);
			return sd;
		}

		private PersonData exportPersonData(com.aladdin.sc.db.PersonData personData) {
			PersonData pd = PersonData.Factory.newInstance();
			pd.setSurname(personData.getSurname());
			pd.setName(personData.getName());
			
			com.aladdin.sc.db.Identifier[] id = (com.aladdin.sc.db.Identifier[]) personData.getIdentifiers().toArray();
			IdentifierList idl = pd.addNewIdentifierList();
			for (int i = 0; i < id.length; i++) {
				exportIdentifier(id[i], idl);
			}
			
			com.aladdin.sc.db.Address[] ad = (com.aladdin.sc.db.Address[]) personData.getAddresss1().toArray();
			AddressList adl = pd.addNewAddressList();
			for (int i = 0; i < ad.length; i++) {
				exportAddress(ad[i], adl);
			}
			
			com.aladdin.sc.db.Communication[] cm = (com.aladdin.sc.db.Communication[]) personData.getCommunications11().toArray();
			CommunicationList cml = pd.addNewCommunicationList();
			for (int i = 0; i < cm.length; i++) {
				exportCommunication(cm[i], cml);
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
    				!checkUser(req.getDeleteCarerAssessment().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getDeleteCarerAssessment().getUserId(), U_CARER)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.createSQLQuery("DELETE FROM carerassessment WHERE id = " + req.getDeleteCarerAssessment().getAssessmentId());
    			res.setCode(req.getDeleteCarerAssessment().getAssessmentId());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			res.setCode("-2");
        		res.setDescription("database error");
        		res.setStatus((short) 0);
    		}
    		
    		return respdoc;
    	}
    	
    	public GetQuestionnaireAnswersResponseDocument getQuestionnaireAnswers (GetQuestionnaireAnswersDocument req) {
    		GetQuestionnaireAnswersResponseDocument respdoc = GetQuestionnaireAnswersResponseDocument.Factory.newInstance();
    		GetQuestionnaireAnswersResponse resp = respdoc.addNewGetQuestionnaireAnswersResponse();
    		
    		if (
    				!checkUser(req.getGetQuestionnaireAnswers().getUserId(), U_CLINICIAN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			Calendar fromDate = req.getGetQuestionnaireAnswers().getFromDate();
    			Calendar toDate   = req.getGetQuestionnaireAnswers().getToDate();
    			Integer objectId  = new Integer (req.getGetQuestionnaireAnswers().getObjectId());
    			
    			String sql = "SELECT * FROM questionnaireanswer WHERE objectid = '" + objectId.toString() + "' AND datetime BETWEEN '" + fromDate.toString() + "' AND '" + toDate.toString () + "' GROUP BY question";
    			com.aladdin.sc.db.QuestionnaireAnswer[] questionids = (com.aladdin.sc.db.QuestionnaireAnswer[]) s.createSQLQuery(sql).list().toArray();
    			if (questionids.length < 1) throw new Exception("");
    			
    			com.aladdin.sc.db.QuestionnaireAnswer qa = (com.aladdin.sc.db.QuestionnaireAnswer) questionids[0];
    			sql = "SELECT * FROM questionnaireanswer WHERE objectid = '" + objectId.toString() + "' AND datetime BETWEEN '" + fromDate.toString() + "' AND '" + toDate.toString () + "' AND question = " + qa.getId().toString();
    			questionids = (com.aladdin.sc.db.QuestionnaireAnswer[]) s.createSQLQuery(sql).list().toArray();
    			
    			QuestionnaireAnswers rqas = resp.addNewOut();
    			Calendar dateTime = Calendar.getInstance();
    			dateTime.setTimeInMillis(questionids[0].getDateTime().getTime());
    			rqas.setDateTime(dateTime);
    			rqas.setObjectID(questionids[0].getObjectId().toString());
    			rqas.setUserID(questionids[0].getUserId().toString());
    			
    			for (int i = 0; i < questionids.length; i++) {
    				QuestionnaireAnswer rqa = rqas.addNewAnswer();
    				rqa.setQuestionID(questionids[i].getQuestion().toString());
    				rqa.setValue(questionids[i].getValue());
    			}
    			
    		} catch (Exception e) {
    		}

    		return respdoc;
    	}
    	
    	public DeleteExternalServiceResponseDocument deleteExternalService (DeleteExternalServiceDocument req) {
    		DeleteExternalServiceResponseDocument respdoc = DeleteExternalServiceResponseDocument.Factory.newInstance();
    		DeleteExternalServiceResponse resp = respdoc.addNewDeleteExternalServiceResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeleteExternalService().getUserId(), U_CLINICIAN) ||
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
    			
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT communication FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM persondata WHERE id = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM clinician WHERE id = " + id.toString()).executeUpdate();
    			
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
    	
    	public DeletePatientResponseDocument deletePatient (DeletePatientDocument req) {
    		DeletePatientResponseDocument respdoc = DeletePatientResponseDocument.Factory.newInstance();
    		DeletePatientResponse resp = respdoc.addNewDeletePatientResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeletePatient().getUserId(), U_CLINICIAN)
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
    			
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT communication FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM persondata WHERE id = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM patient WHERE id = " + id.toString()).executeUpdate();
    			
    			s.getTransaction().commit();
    			
    			res.setCode(id.toString ());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
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
    				!checkUser(req.getCreateQuestionnaire().getUserId(), U_CLINICIAN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Questionnaire q = storeQuestionnaire(req.getCreateQuestionnaire().getData());
    			
    			s.getTransaction().commit();
    			
    			res.setCode(q.getId().toString ());
    			res.setStatus((short) 1);
    			res.setDescription("ok");
    		} catch (Exception e) {
    			res.setCode("-2");
    			res.setStatus((short) 0);
    			res.setDescription("database error");
    		}
    		
    		return respdoc;
    	}

		private com.aladdin.sc.db.Questionnaire storeQuestionnaire (Questionnaire rq) {
			com.aladdin.sc.db.Questionnaire q = new com.aladdin.sc.db.Questionnaire ();
			q.setTitle(rq.getTitle());
			q.setVersion(rq.getVersion());
			s.save (q);
			
			QuestionnaireQuestion[] rqq = rq.getQuestionArray();
			 
			for (int i = 0; i < rqq.length; i++) {
				updateQQ(rqq[i], 0);
			}
			return q;
		}
    	
    	public GetPatientMeasurementResponseDocument getPatientMeasurement (GetPatientMeasurementDocument req) {
    		GetPatientMeasurementResponseDocument respdoc = GetPatientMeasurementResponseDocument.Factory.newInstance();
    		GetPatientMeasurementResponse resp = respdoc.addNewGetPatientMeasurementResponse();
    		
    		if (
    				!checkUser(req.getGetPatientMeasurement().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getGetPatientMeasurement().getUserId(), U_CARER)
				) {
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			Integer patientId = new Integer (req.getGetPatientMeasurement().getPatientId()); 
    			Integer measurementType = new Integer (req.getGetPatientMeasurement().getMeasurementType());
    			Calendar fromDate = req.getGetPatientMeasurement().getFromData();
    			Calendar toDate = req.getGetPatientMeasurement().getToData();
    			com.aladdin.sc.db.Measurement[] m = (com.aladdin.sc.db.Measurement[]) s.createSQLQuery("SELECT * FROM measurement WHERE patient = " + patientId.toString() + " AND datetime BETWEEN '" + fromDate.toString() + "' AND '" + toDate.toString() + "' AND type = " + measurementType.toString()).list().toArray();
    			for (int i = 0; i < m.length; i++) {
    				resp.setOutArray(i, exportMeasurement(m[i]));
    			}
    			s.getTransaction().commit();
    		} catch (Exception e) {
			}
    		
    		return respdoc;
    	}

		private Measurement exportMeasurement(com.aladdin.sc.db.Measurement m) {
			Measurement rm = Measurement.Factory.newInstance();
			SystemParameter rmeasurementType = SystemParameter.Factory.newInstance();
			rmeasurementType.setCode(m.getType());
			rm.setType(rmeasurementType);
			rm.setValue(m.getValue());
			Timestamp datetime = m.getDatetime();
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(datetime.getTime());
			rm.setDateTime(c);
			rm.setUnits(m.getUnits());
			rm.setLowerLimit(m.getLowerlimit());
			rm.setUpperLimit(m.getUpperlimit());
			rm.setPatientID(m.getPatient().toString());
			return rm;
		}
		
    	public DeleteQuestionnaireResponseDocument deleteQuestionnaire (DeleteQuestionnaireDocument req) {
    		DeleteQuestionnaireResponseDocument respdoc = DeleteQuestionnaireResponseDocument.Factory.newInstance();
    		DeleteQuestionnaireResponse resp = respdoc.addNewDeleteQuestionnaireResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeleteQuestionnaire().getUserId(), U_CLINICIAN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			Integer id = new Integer (req.getDeleteQuestionnaire().getId());
    			QuestionnaireQuestion[] qq = (QuestionnaireQuestion[]) s.createSQLQuery("SELECT * FROM questionnairequestion WHERE quest = " + id.toString()).list().toArray();
    			for (int i = 0; i < qq.length; i++) {
    				dropQQ (new Integer (qq[i].getId()));
    			}
    			s.createSQLQuery("DELETE FROM questionnaire WHERE id = " + id.toString());
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
    	
    	private void dropQQ (Integer id) {
    		QuestionnaireQuestion[] qq = (QuestionnaireQuestion[]) s.createSQLQuery("SELECT * FROM questionnairequestion WHERE parentid = " + id.toString()).list().toArray();
			for (int i = 0; i < qq.length; i++) {
				dropQQ (new Integer (qq[i].getId()));
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
    				!checkUser(req.getAssignTask().getUserId(), U_CLINICIAN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Task task = new com.aladdin.sc.db.Task ();
    			Task rtask = req.getAssignTask().getTask();
    			task.setTaskType(new Integer (rtask.getTaskType().getCode()));
    			task.setDateTimeAssigned(new Timestamp(rtask.getDateTimeAssigned().getTimeInMillis()));
    			task.setDateTimeFulfilled(new Timestamp(rtask.getDateTimeFulfilled().getTimeInMillis()));
    			task.setTaskStatus(new Integer (rtask.getTaskStatus().getCode()));
    			task.setUrl(rtask.getURL());
    			task.setExecutor(new Integer (rtask.getExecutorID()));
    			task.setAssigner(new Integer (rtask.getAssignerID()));
    			task.setObject(new Integer (rtask.getObjectID()));
    			
    			if (rtask.getQuestionnaire() != null) {
    				task.setM_Questionnairequestionnaire(storeQuestionnaire(rtask.getQuestionnaire()));
    			}
    			
    			s.getTransaction().commit();
    			
    			res.setCode(task.getId().toString());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
    			res.setCode("-2");
        		res.setDescription("database error");
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
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.PersonData.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Address.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Communication.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Identifier.class.getFields()));
    			
    			String sql = "SELECT p.* FROM patient p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) WHERE ";
    			
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
    			sql += " 1 GROUP BY p.id";
    			
    			com.aladdin.sc.db.Administrator[] ql = (com.aladdin.sc.db.Administrator[]) s.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				AdministratorInfo ai = resp.addNewOut();
    				ai.setID(ql[i].getId().toString());
    				ai.setSurname(ql[i].getM_PersonDatapersonData().getSurname());
    				ai.setName(ql[i].getM_PersonDatapersonData().getName());
    			}
    		} catch (Exception e) {
    		}
    		
    		return respdoc;
    	}
    	
    	public GetUserPlannedTasksResponseDocument getUserPlannedTasks (GetUserPlannedTasksDocument req) {
    		GetUserPlannedTasksResponseDocument respdoc = GetUserPlannedTasksResponseDocument.Factory.newInstance();
    		GetUserPlannedTasksResponse resp = respdoc.addNewGetUserPlannedTasksResponse();
    		
    		if (
    				!checkUser(req.getGetUserPlannedTasks().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getGetUserPlannedTasks().getUserId(), U_CARER)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer userId = new Integer (req.getGetUserPlannedTasks().getUserId());
    			String fromDate  = req.getGetUserPlannedTasks().getFromDate().toString();
    			String toDate = req.getGetUserPlannedTasks().getToDate().toString();
    			
    			String sql = "SELECT * FROM task WHERE datetimefulfilled BETWEEN '" + fromDate + "' AND '" + toDate + "' AND executor = '" + userId.toString() + "'";
    			com.aladdin.sc.db.Task[] tl = (com.aladdin.sc.db.Task[]) s.createSQLQuery(sql).list().toArray();
    			
    			for (int i = 0; i < tl.length; i++) {
    				Task rt = resp.addNewOut();
    				rt.setID(tl[i].getId().toString());
    				SystemParameter taskType = SystemParameter.Factory.newInstance();
    				taskType.setCode(tl[i].getTaskType().toString());
    				rt.setTaskType(taskType);
    				Calendar c1 = Calendar.getInstance();
    				c1.setTimeInMillis(tl[i].getDateTimeAssigned().getTime());
    				rt.setDateTimeAssigned(c1);
    				Calendar c2 = Calendar.getInstance();
    				c2.setTimeInMillis(tl[i].getDateTimeFulfilled().getTime());
    				rt.setDateTimeFulfilled(c2);
    				SystemParameter taskStatus = SystemParameter.Factory.newInstance();
    				taskStatus.setCode(tl[i].getTaskStatus().toString());
    				rt.setTaskStatus(taskStatus);
    				rt.setURL(tl[i].getUrl());
    				rt.setExecutorID(tl[i].getExecutor().toString());
    				rt.setAssignerID(tl[i].getAssigner().toString());
    				rt.setObjectID(tl[i].getObject().toString());
    				if (tl[i].getQuestionnaire() > 0) rt.setQuestionnaire(exportQuestionnaire(tl[i].getM_Questionnairequestionnaire()));
    				
    			}
    			
    		} catch (Exception e) {

			}
    		
    		return respdoc;
    	}
    	
    	private Questionnaire exportQuestionnaire (com.aladdin.sc.db.Questionnaire q) {
    		Questionnaire rq = Questionnaire.Factory.newInstance();
    		rq.setID(q.getId().toString());
    		rq.setTitle(q.getTitle());
    		rq.setVersion(q.getVersion());
    		
    		List<QuestionnaireQuestion> rqql = new ArrayList<QuestionnaireQuestion>();
    		com.aladdin.sc.db.QuestionnaireQuestion[] qql = (com.aladdin.sc.db.QuestionnaireQuestion[]) q.getQuestionnaireQuestions().toArray();
    		for (int i = 0; i < qql.length; i++) {
    			rqql.add(exportQQ(qql[i]));
    		}
    		rq.setQuestionArray((QuestionnaireQuestion[]) rqql.toArray());
    		
    		return rq;
    	}
    	
    	private QuestionnaireQuestion exportQQ (com.aladdin.sc.db.QuestionnaireQuestion qq) {
    		QuestionnaireQuestion rqq = QuestionnaireQuestion.Factory.newInstance();
    		
    		rqq.setType(qq.getType());
    		rqq.setId(qq.getId().toString());
    		rqq.setCondition(qq.getCondition().shortValue());
    		rqq.setTitle(qq.getTitle());
    		
    		List<QuestionnaireQuestionAnswer> rqqal = new ArrayList<QuestionnaireQuestionAnswer> ();
    		com.aladdin.sc.db.QuestionnaireQuestionAnswer[] qqal = (com.aladdin.sc.db.QuestionnaireQuestionAnswer[]) qq.getQuestionnaireQuestionAnswers().toArray();
    		for (int i = 0; i < qqal.length; i++) {
    			rqqal.add(exportQQA(qqal[i]));
    		}
    		rqq.addNewAnswers();
    		rqq.getAnswers().setAnswerArray((QuestionnaireQuestionAnswer[]) rqqal.toArray());
    		
    		List<QuestionnaireQuestion> rqql = new ArrayList<QuestionnaireQuestion>();
    		com.aladdin.sc.db.QuestionnaireQuestion[] qql = (com.aladdin.sc.db.QuestionnaireQuestion[]) s.createSQLQuery("SELECT * FROM questionnairequestion WHERE parentid = '" + qq.getId().toString() + "'").list().toArray();
    		for (int i = 0; i < qql.length; i++) {
    			rqql.add(exportQQ(qql[i]));
    		}
    		
    		return rqq;
    	}
    	
    	private QuestionnaireQuestionAnswer exportQQA (com.aladdin.sc.db.QuestionnaireQuestionAnswer qqa) {
    		QuestionnaireQuestionAnswer rqqa = QuestionnaireQuestionAnswer.Factory.newInstance();
    		
    		rqqa.setStringValue(qqa.getDescription());
    		rqqa.setValue(qqa.getValue().shortValue());
    		
    		return rqqa;
    	}
    	     
    	public CreateExternalServiceResponseDocument createExternalService (CreateExternalServiceDocument req) {
    		CreateExternalServiceResponseDocument respdoc = CreateExternalServiceResponseDocument.Factory.newInstance();
    		CreateExternalServiceResponse resp = respdoc.addNewCreateExternalServiceResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getCreateExternalService().getUserId(), U_CLINICIAN) ||
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
    				!checkUser(req.getSaveCarerAssessment().getUserId(), U_CARER)
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
    				!checkUser(req.getDeleteCarer().getUserId(), U_CLINICIAN)
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
    			
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT communication FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM persondata WHERE id = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
    			s.createSQLQuery("DELETE FROM patient WHERE id = " + id.toString()).executeUpdate();
    			
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
    				!checkUser(req.getUpdateExternalService().getUserId(), U_CLINICIAN) ||
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
    			com.aladdin.sc.db.ExternalService es = new com.aladdin.sc.db.ExternalService();
    			
    			es.setId(new Integer (re.getID()));
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
    	
    	public GetClinicianResponseDocument getClinician (GetClinicianDocument req) {
    		GetClinicianResponseDocument respdoc = GetClinicianResponseDocument.Factory.newInstance();
    		GetClinicianResponse resp = respdoc.addNewGetClinicianResponse();
    		
    		if (
    				!checkUser(req.getGetClinician().getUserId(), U_CLINICIAN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			List list =  s.createQuery("from clinician").setInteger("id", new Integer (req.getGetClinician().getId())).list();
        		if (list.size() != 1) throw new Exception ("");
        		
        		com.aladdin.sc.db.Clinician clinician = (com.aladdin.sc.db.Clinician) list.get(0);
        		
        		resp.setOut (exportClinician (clinician));
        		
    		} catch (Exception e) {
    		}
    		
    		return respdoc;
    	}
    	
    	private Clinician exportClinician(com.aladdin.sc.db.Clinician clinician) {
    		Clinician p = Clinician.Factory.newInstance();
			p.setID(clinician.getId().toString());
			p.setPersonData(exportPersonData(clinician.getM_PersonDatapersondata()));
			return p;
		}
    	
    	public DeletePatientAssessmentResponseDocument deletePatientAssessment (DeletePatientAssessmentDocument req) {
    		DeletePatientAssessmentResponseDocument respdoc = DeletePatientAssessmentResponseDocument.Factory.newInstance();
    		DeletePatientAssessmentResponse resp = respdoc.addNewDeletePatientAssessmentResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getDeletePatientAssessment().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getDeletePatientAssessment().getUserId(), U_CARER)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.createSQLQuery("DELETE FROM patientassessment WHERE id = " + req.getDeletePatientAssessment().getAssessmentId());
    			res.setCode(req.getDeletePatientAssessment().getAssessmentId());
        		res.setDescription("ok");
        		res.setStatus((short) 1);
    		} catch (Exception e) {
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
    			com.aladdin.sc.db.ExternalService[] esl = (com.aladdin.sc.db.ExternalService[]) s.createSQLQuery("SELECT * FROM externalservice").list().toArray();
    			for (int i = 0; i < esl.length; i++) {
    				ExternalService re = resp.addNewOut();
    				re.setAddress(esl[i].getAddress());
    				re.setDescription(esl[i].getDescription());
    				re.setID(esl[i].getId().toString());
    			}
    		} catch (Exception e) {
			}
    		
    		return respdoc;
    	}
    	
    	public GetCarerResponseDocument getCarer (GetCarerDocument req) {
    		GetCarerResponseDocument respdoc = GetCarerResponseDocument.Factory.newInstance();
    		GetCarerResponse resp = respdoc.addNewGetCarerResponse();
    		
    		if (
    				!checkUser(req.getGetCarer().getUserId(), U_CLINICIAN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			List list =  s.createQuery("from carer").setInteger("id", new Integer (req.getGetCarer().getId())).list();
        		if (list.size() != 1) throw new Exception ("");
        		
        		com.aladdin.sc.db.Carer carer = (com.aladdin.sc.db.Carer) list.get(0);
        		
        		resp.setOut (exportCarer (carer));
        		
    		} catch (Exception e) {
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
    			List list =  s.createQuery("from administrator").setInteger("id", new Integer (req.getGetAdministrator().getId())).list();
        		if (list.size() != 1) throw new Exception ("");
        		
        		com.aladdin.sc.db.Administrator administrator = (com.aladdin.sc.db.Administrator) list.get(0);
        		
        		resp.setOut (exportAdministrator (administrator));
        		
    		} catch (Exception e) {
    		}
    		
    		return respdoc;
    	}
    	
    	private Administrator exportAdministrator (com.aladdin.sc.db.Administrator administrator) {
    		Administrator p = Administrator.Factory.newInstance();
			p.setID(administrator.getId().toString());
			p.setPersonData(exportPersonData(administrator.getM_PersonDatapersonData()));
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
    			
    			List l = s.createQuery("from administrator").setParameter("id", data.getID(), Hibernate.INTEGER).list();
    			if (l.size() < 1) throw new Exception("error");
    			com.aladdin.sc.db.Administrator p = (com.aladdin.sc.db.Administrator) l.get(0);
    			
    			storePersondata(data.getPersonData(), p.getPersonData());
    			
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
    			com.aladdin.sc.db.Questionnaire[] ql = (com.aladdin.sc.db.Questionnaire[]) s.createSQLQuery("SELECT * FROM questionnaire WHERE id = " + id.toString ()).list().toArray();
    			
    			if (ql.length < 1) throw new Exception ("error");
    			
    			resp.setOut(exportQuestionnaire(ql[0]));
    		} catch (Exception e) {
			}

    		return respdoc;
    	}
    	
    	public StoreQuestionnaireAnswersResponseDocument storeQuestionnaireAnswers (StoreQuestionnaireAnswersDocument req) {
    		StoreQuestionnaireAnswersResponseDocument respdoc = StoreQuestionnaireAnswersResponseDocument.Factory.newInstance();
    		StoreQuestionnaireAnswersResponse resp = respdoc.addNewStoreQuestionnaireAnswersResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getStoreQuestionnaireAnswers().getUserId(), U_CARER)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			s.beginTransaction();
    			
    			Timestamp datetime = new Timestamp(req.getStoreQuestionnaireAnswers().getData().getDateTime().getTimeInMillis());
    			Integer objectId = new Integer (req.getStoreQuestionnaireAnswers().getData().getUserID());
    			Integer userId = new Integer (req.getStoreQuestionnaireAnswers().getData().getUserID());
    			
    			Integer id = 0;
    			QuestionnaireAnswer[] rqal = req.getStoreQuestionnaireAnswers().getData().getAnswerArray();
    			for (int i = 0; i < rqal.length; i++) {
    				com.aladdin.sc.db.QuestionnaireAnswer qa = new com.aladdin.sc.db.QuestionnaireAnswer();
    				qa.setQuestion(new Integer (rqal[i].getQuestionID()));
    				qa.setValue(rqal[i].getValue());
    				qa.setUserId(userId);
    				qa.setObjectId(objectId);
    				qa.setDateTime(datetime);
    				s.save(qa);
    				id = qa.getId();
    			}
    			
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
    	
    	public GetPatientAssessmentResponseDocument getPatientAssessment (GetPatientAssessmentDocument req) {
    		GetPatientAssessmentResponseDocument respdoc = GetPatientAssessmentResponseDocument.Factory.newInstance();
    		GetPatientAssessmentResponse resp = respdoc.addNewGetPatientAssessmentResponse();
    		
    		if (
    				!checkUser(req.getGetPatientAssessment().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getGetPatientAssessment().getUserId(), U_CARER)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getGetPatientAssessment().getId());
    			com.aladdin.sc.db.PatientAssessment[] pal = (com.aladdin.sc.db.PatientAssessment[]) s.createSQLQuery("SELECT * FROM patientassessment WHERE id = " + id.toString()).list().toArray();
    			
    			if (pal.length < 1) throw new Exception ("none");
    			
    			com.aladdin.sc.db.PatientAssessment pa = pal[0];
    			PatientAssessment rpa = resp.addNewOut();
    			
    			rpa.setID(pa.getId().toString());
    			rpa.setPatientID(pa.getPatient().toString());
    			Calendar c1 = Calendar.getInstance();
    			c1.setTimeInMillis(pa.getDateOfAssessment().getTime());
    			rpa.setDateOfAssessment(c1);
    			SystemParameter aetology = SystemParameter.Factory.newInstance();
    			aetology.setCode(pa.getAetology().toString());
    			rpa.setAetology(aetology);
    			rpa.setTimeEllapsedSinceDiagnosed(pa.getTimeElapsedSinceDiagnose().shortValue());
    			rpa.setSeverity(pa.getSeverity().shortValue());
    			rpa.setRelevantPathologyAntecedents(pa.getRelevantPathologyAntecedents());
    			rpa.setComorbidity(pa.getComorbidity());
    			rpa.setCharlsonComorbidityIndex(pa.getCharlsonComobodityIndex().shortValue());
    			rpa.setBarthelIndex(pa.getBarthelIndex().shortValue());
    			rpa.setLawtonIndex(pa.getLawtonIndex().shortValue());
    			rpa.setMMSE(pa.getMMSE().shortValue());
    			rpa.setMDRS(pa.getMDRS().shortValue());
    			rpa.setBlessedScalePart1(pa.getBlessedScalePart1());
    			rpa.setBlessedScalePart2(pa.getBlessedScalePart2().shortValue());
    			rpa.setBlessedScalePart3(pa.getBlessedScalePart3().shortValue());
    			rpa.setChecklistMBP(pa.getChecklistMBPC().shortValue());
    			rpa.setNPQISeverity(pa.getNPQISeverity().shortValue());
    			rpa.setNPQIStress(pa.getNPQIStress().shortValue());
    			rpa.setGDS(pa.getGDS().shortValue());
    			rpa.setFalls(pa.getFalls());
    			rpa.setIncontinence(pa.getIncontinence());
    			rpa.setDelirium(pa.getDelirium());
    			rpa.setImmobility(pa.getImmobility());
    			rpa.setSensorialDeficits(pa.getSensorialDeficits());
    			rpa.setPharmacologicalTreatment(pa.getPharmacologyTreatment());
    			
    			com.aladdin.sc.db.Measurement[] ml = (com.aladdin.sc.db.Measurement[]) pa.getMeasurements().toArray();
    			List<Measurement> rml = new ArrayList<Measurement> ();
    			for (int i = 0; i < ml.length; i++) {
    				rml.add(exportMeasurement(ml[i]));
    			}
    			rpa.setClinicalDataArray((Measurement[]) rml.toArray());
    			
    		} catch (Exception e) {
			}
    		
    		return respdoc;
    	}
    	
    	public GetCarerAssessmentResponseDocument getCarerAssessment (GetCarerAssessmentDocument req) {
    		GetCarerAssessmentResponseDocument respdoc = GetCarerAssessmentResponseDocument.Factory.newInstance();
    		GetCarerAssessmentResponse resp = respdoc.addNewGetCarerAssessmentResponse();
    		
    		if (
    				!checkUser(req.getGetCarerAssessment().getUserId(), U_CLINICIAN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getGetCarerAssessment().getId());
    			com.aladdin.sc.db.CarerAssessment[] cal = (com.aladdin.sc.db.CarerAssessment[]) s.createSQLQuery("SELECT * FROM carerassessment WHERE id = " + id.toString()).list().toArray();
    			
    			if (cal.length < 1) throw new Exception ("none");
    			
    			com.aladdin.sc.db.CarerAssessment ca = cal[0];
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
    		} catch (Exception e) {
			}
    		
    		return respdoc;
    	}
    	
    	public ChangeTaskStatusResponseDocument changeTaskStatus (ChangeTaskStatusDocument req) {
    		ChangeTaskStatusResponseDocument respdoc = ChangeTaskStatusResponseDocument.Factory.newInstance();
    		ChangeTaskStatusResponse resp = respdoc.addNewChangeTaskStatusResponse();
    		OperationResult res = resp.addNewOut();
    		
    		if (
    				!checkUser(req.getChangeTaskStatus().getUserId(), U_CARER)
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
    				!checkUser(req.getListOfPatients().getUserId(), U_CLINICIAN) ||
    				!checkUser(req.getListOfPatients().getUserId(), U_CARER)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			List<Field> fl = new ArrayList<Field>();
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.PersonData.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.SocioDemographicData.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Address.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Communication.class.getFields()));
    			fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Identifier.class.getFields()));
    			
    			String sql = "SELECT p.* FROM patient p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) LEFT JOIN sociodemographicdata sd ON (sd.id = p.sd) WHERE ";
    			
    			SearchCriteria[] sc = req.getListOfPatients().getFilterArray();
    			for (int i = 0; i < sc.length; i++) {
    				for (int j = 0; j < fl.size(); j++) {
    					if (fl.get(j).getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
    						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
    						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
    						sql += " AND ";
    					}
    				}
    			}
    			sql += " 1 GROUP BY p.id";
    			
    			com.aladdin.sc.db.Patient[] ql = (com.aladdin.sc.db.Patient[]) s.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				PatientInfo qi = resp.addNewOut();
    				qi.setID(ql[i].getId().toString());
    				qi.setSurname(ql[i].getM_PersonDatapersondata().getSurname());
    				qi.setName(ql[i].getM_PersonDatapersondata().getName());
    			}
    		} catch (Exception e) {
    		}
    		
    		return respdoc;
    	}
    	
    	public GetWarningsResponseDocument getWarnings (GetWarningsDocument req) {
    		GetWarningsResponseDocument respdoc = GetWarningsResponseDocument.Factory.newInstance();
    		GetWarningsResponse resp = respdoc.addNewGetWarningsResponse();
    		
    		if (
    				!checkUser(req.getGetWarnings().getUserId(), U_CLINICIAN)
				) {
    			return respdoc;
    		}
    		
    		try {
    			
    			Field[] field = com.aladdin.sc.db.Warning.class.getFields();
    			String sql = "SELECT * FROM warning WHERE ";
    			
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
    			sql += "1";
    			
    			
    			com.aladdin.sc.db.Warning[] wl = (com.aladdin.sc.db.Warning[]) s.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < wl.length; i++) {
    				Warning rw = resp.addNewOut();
    				rw.setID(wl[i].getId().toString());
    				SystemParameter typeOfWarning = SystemParameter.Factory.newInstance();
    				typeOfWarning.setCode(wl[i].getTypeOfWarning().toString());
    				rw.setTypeOfWarning(typeOfWarning);
    				Calendar c1 = Calendar.getInstance();
    				c1.setTimeInMillis(wl[i].getDateTimeOfWarning().getTime());
    				rw.setDateTimeOfWarning(c1);
    				SystemParameter effect = SystemParameter.Factory.newInstance();
    				effect.setCode(wl[i].getEffect().toString());
    				rw.setEffect(effect);
    				SystemParameter indicator = SystemParameter.Factory.newInstance();
    				indicator.setCode(wl[i].getIndicator().toString());
    				rw.setIndicator(indicator);
    				SystemParameter riskLevel = SystemParameter.Factory.newInstance();
    				riskLevel.setCode(wl[i].getRiskLevel().toString());
    				rw.setRiskLevel(riskLevel);
    				rw.setJustificationText(wl[i].getJustificationText());
    				SystemParameter emergencyLevel = SystemParameter.Factory.newInstance();
    				emergencyLevel.setCode(wl[i].getEmergencyLevel().toString());
    				rw.setEmergencyLevel(emergencyLevel);
    				rw.setPatientID(wl[i].getPatientID());
    				rw.setDelivered(wl[i].getDelivered());
    			}
    		} catch (Exception e) {
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
    			
    			Session s = HibernateUtil.getSessionFactory().openSession();
    			s.beginTransaction();
    			
    			List l = s.createQuery("from clinician").setParameter("id", data.getID(), Hibernate.INTEGER).list();
    			if (l.size() < 1) throw new Exception("error");
    			com.aladdin.sc.db.Clinician p = (com.aladdin.sc.db.Clinician) l.get(0);
    			
    			storePersondata(data.getPersonData(), p.getPersondata());
    			
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
    				!checkUser(req.getMarkWarningAsRead().getUserId(), U_CLINICIAN)
				) {
    			res.setCode("-1");
    			res.setStatus((short) 0);
    			res.setDescription("auth error");
    			return respdoc;
    		}
    		
    		try {
    			Integer id = new Integer (req.getMarkWarningAsRead().getId());
    			
    			s.beginTransaction();
    			s.createSQLQuery("UPDATE warning SET delivired = '1' WHERE id = '" + id.toString() + "'").executeUpdate();
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
        
        
    	// TODO:
    	public ListOfPossibleTasksResponseDocument listOfPossibleTasks (ListOfPossibleTasksDocument listOfPossibleTasks48) {
    		ListOfPossibleTasksResponseDocument respdoc = ListOfPossibleTasksResponseDocument.Factory.newInstance();
    		ListOfPossibleTasksResponse resp = respdoc.addNewListOfPossibleTasksResponse();
    		SystemParameter pt1 = resp.addNewOut();
    		pt1.setCode("1");
    		SystemParameter pt2 = resp.addNewOut();
    		pt2.setCode("2");
    		return respdoc;
    	}

    
    }
    