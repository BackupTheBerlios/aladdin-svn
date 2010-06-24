    package com.aladdin.sc;

    import java.math.BigDecimal;
    import java.sql.Timestamp;
    import java.util.Calendar;
    import java.util.List;

    import org.hibernate.Hibernate;
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

import org.hibernate.Session;
    
    public class StorageComponentSkeleton implements StorageComponentSkeletonInterface{
        
    	private Session s;
    	
    	public StorageComponentSkeleton () {
    		Session s = HibernateUtil.getSessionFactory().openSession();
    	}

    	public CreateClinicianResponseDocument createClinician (CreateClinicianDocument req) {
    		CreateClinicianResponseDocument respdoc = CreateClinicianResponseDocument.Factory.newInstance();
    		CreateClinicianResponse resp = respdoc.addNewCreateClinicianResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("0");
    		res.setDescription("failed");
    		res.setStatus((short) 0);
    		
    		try {
    			Clinician data = req.getCreateClinician().getData();
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Clinician clinician = new com.aladdin.sc.db.Clinician ();
    			
    			PersonData rpd = data.getPersonData();
    			Integer pdid = storePersondata(rpd, null); 
    			
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
    		res.setCode("0");
    		res.setDescription("failed");
    		res.setStatus((short) 0);
    		
    		try {
    			Patient data = req.getCreatePatient().getData();
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Patient p = new com.aladdin.sc.db.Patient ();
    			
    			PersonData rpd = data.getPersonData();
    			Integer pdid = storePersondata(rpd, null);
    			
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
    		res.setCode("0");
    		res.setDescription("failed");
    		res.setStatus((short) 0);
    		
    		System.out.println ("createCarer");
    		
    		try {
    			Carer data = req.getCreateCarer().getData();
    			
    			s.beginTransaction();
    			
    			com.aladdin.sc.db.Carer p = new com.aladdin.sc.db.Carer ();
    			
    			PersonData rpd = data.getPersonData();
    			Integer pdid = storePersondata(rpd, null);
    			
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
    		res.setCode("0");
    		res.setDescription("");
    		res.setStatus((short) 0);
    		
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
    				updateQQ(rqq[i], s, 0);
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

    	private void updateQQ(QuestionnaireQuestion rqq, Session s, int parentId) {
    		com.aladdin.sc.db.QuestionnaireQuestion qq = new com.aladdin.sc.db.QuestionnaireQuestion ();
    		qq.setType(rqq.getType());
    		if (rqq.getId() != null) qq.setId(new Integer (rqq.getId()));
    		qq.setCondition(new Integer(rqq.getCondition()));
    		qq.setTitle(rqq.getTitle());
    		qq.setParentid(parentId);
    		s.save (qq);
    		for (int i = 0; i < rqq.getQuestions().getQuestionArray().length; i++) {
    			updateQQ (rqq.getQuestions().getQuestionArray(i), s, qq.getId());
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
    		res.setCode("0");
    		res.setDescription("");
    		res.setStatus((short) 0);
    		
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
    		res.setCode("0");
    		res.setDescription("failed");
    		res.setStatus((short) 0);
    		
    		System.out.println ("createCarer");
    		
    		try {
    			Carer data = req.getUpdateCarer().getData();
    			
    			s.beginTransaction();
    			
    			List l = s.createQuery("from carer").setParameter("id", data.getID(), Hibernate.INTEGER).list();
    			if (l.size() < 1) throw new Exception("error");
    			com.aladdin.sc.db.Carer p = (com.aladdin.sc.db.Carer) l.get(0);
    			
    			PersonData rpd = data.getPersonData();
    			storePersondata(rpd, p.getPersondata());
    			
    			s.createSQLQuery("DELETE FROM address WHERE persondata = " + p.getPersondata().toString()).executeUpdate();
    			Address[] rad = rpd.getAddressList().getAddressArray();
    			for (int i = 0; i < rad.length; i++) {
    				storeAddress(rad[i], p.getPersondata());
    			}
    			
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = " + p.getPersondata().toString()).executeUpdate();
    			Identifier[] rid = rpd.getIdentifierList().getIdentifierArray();
    			for (int i = 0; i < rid.length; i++) {
    				storeIdentifier(rid[i], p.getPersondata());
    			}
    			
    			s.createSQLQuery("DELETE FROM communication WHERE persondata = " + p.getPersondata().toString()).executeUpdate();
    			Communication[] rcm = rpd.getCommunicationList().getCommunicationArray();
    			for (int i = 0; i < rcm.length; i++) {
    				storeCommunication(rcm[i], p.getPersondata());
    			}
    			
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
    		res.setCode("");
    		res.setDescription("");
    		res.setStatus((short) 0);
    		
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
    		res.setCode("0");
    		res.setDescription("failed");
    		res.setStatus((short) 0);
    		
    		System.out.println ("createCarer");
    		
    		try {
    			Patient data = req.getUpdataPatient().getData();
    			
    			Session s = HibernateUtil.getSessionFactory().openSession();
    			s.beginTransaction();
    			
    			List l = s.createQuery("from patient").setParameter("id", data.getID(), Hibernate.INTEGER).list();
    			if (l.size() < 1) throw new Exception("error");
    			com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient) l.get(0);
    			
    			PersonData rpd = data.getPersonData();
    			storePersondata(rpd, p.getPersondata());
    			
    			s.createSQLQuery("DELETE FROM address WHERE persondata = " + p.getPersondata().toString()).executeUpdate();
    			Address[] rad = rpd.getAddressList().getAddressArray();
    			for (int i = 0; i < rad.length; i++) {
    				storeAddress(rad[i], p.getPersondata());
    			}
    			
    			s.createSQLQuery("DELETE FROM identifier WHERE persondata = " + p.getPersondata().toString()).executeUpdate();
    			Identifier[] rid = rpd.getIdentifierList().getIdentifierArray();
    			for (int i = 0; i < rid.length; i++) {
    				storeIdentifier(rid[i], p.getPersondata());
    			}
    			
    			s.createSQLQuery("DELETE FROM communication WHERE persondata = " + p.getPersondata().toString()).executeUpdate();
    			Communication[] rcm = rpd.getCommunicationList().getCommunicationArray();
    			for (int i = 0; i < rcm.length; i++) {
    				storeCommunication(rcm[i], p.getPersondata());
    			}
    			
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
    	
    	public ListOfCarersResponseDocument listOfCarers (ListOfCarersDocument listOfCarers12) {
    		ListOfCarersResponseDocument respdoc = ListOfCarersResponseDocument.Factory.newInstance();
    		ListOfCarersResponse resp = respdoc.addNewListOfCarersResponse();
    		
    		try {
    			com.aladdin.sc.db.Carer[] ql = (com.aladdin.sc.db.Carer[]) s.createQuery("from carer").list().toArray();
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
    	
    	public ListOfCliniciansResponseDocument listOfClinicians (ListOfCliniciansDocument listOfClinicians14) {
    		ListOfCliniciansResponseDocument respdoc = ListOfCliniciansResponseDocument.Factory.newInstance();
    		ListOfCliniciansResponse resp = respdoc.addNewListOfCliniciansResponse();
    		
    		try {
    			com.aladdin.sc.db.Clinician[] ql = (com.aladdin.sc.db.Clinician[]) s.createQuery("from clinician").list().toArray();
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
    		res.setCode("0");
    		res.setDescription("");
    		res.setStatus((short) 0);
    		
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

    	private Integer storeMeasurement(Measurement rm, Integer pid) {
    		long timeInMillis = 0;
    		com.aladdin.sc.db.Measurement m = new com.aladdin.sc.db.Measurement ();
    		m.setPatient(new Integer (pid));
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
    		res.setCode("0");
    		res.setDescription("");
    		res.setStatus((short) 0);
    		
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
    	
    	
    	
    	
    	public GetPatientResponseDocument getPatient (GetPatientDocument getPatient20) {
    		GetPatientResponseDocument respdoc = GetPatientResponseDocument.Factory.newInstance();
    		GetPatientResponse resp = respdoc.addNewGetPatientResponse();
    		Patient p = resp.addNewOut();
    		PersonData pd = p.addNewPersonData();
    		pd.setName("Vovka");
    		pd.setSurname("Morkovka");
//    		Address a = pd.addNewAddressList();
//    		a.setCity("Baden");
//    		a.setCountry("Schweiz");
//    		a.setStreet("Big street");
//    		a.setZipCode("111111");
//    		Communication c = pd.addNewCommunicationList();
//    		c.setType("phone");
//    		c.setValue("+49XXXXXXX");
//    		Identifier i = pd.addNewIdentifierList();
//    		i.setNumber("XXX1123");
//    		i.setType("pass");
    		p.setID("P-0001");
    		SocioDemographicData sd = p.addNewSDData();
    		SystemParameter gender = sd.addNewGender();
    		gender.setCode("1");
    		gender.setDescription("male");
    		SystemParameter LivingWith = sd.addNewLivingWith();
    		LivingWith.setCode("1");
    		SystemParameter MaritalStatus = sd.addNewMaritalStatus();
    		MaritalStatus.setCode("1");
    		sd.setAge((short) 60);
    		sd.setChildren((short) 2);
    		return respdoc;
    	}
    	
    	public DeleteCarerAssessmentResponseDocument deleteCarerAssessment (DeleteCarerAssessmentDocument deleteCarerAssessment22) {
    		DeleteCarerAssessmentResponseDocument respdoc = DeleteCarerAssessmentResponseDocument.Factory.newInstance();
    		DeleteCarerAssessmentResponse resp = respdoc.addNewDeleteCarerAssessmentResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public GetQuestionnaireAnswersResponseDocument getQuestionnaireAnswers (GetQuestionnaireAnswersDocument getQuestionnaireAnswers26) {
    		GetQuestionnaireAnswersResponseDocument respdoc = GetQuestionnaireAnswersResponseDocument.Factory.newInstance();
    		GetQuestionnaireAnswersResponse resp = respdoc.addNewGetQuestionnaireAnswersResponse();
    		QuestionnaireAnswers q = resp.addNewOut();
    		q.setID("Q-0001");
    		q.setObjectID("O-0001");
    		q.setUserID("U-0001");
    		Calendar c = Calendar.getInstance();
    		c.set(2010, 06, 15, 14, 55, 30);
    		q.setDateTime(c);
    		QuestionnaireAnswer qa = q.addNewAnswer();
    		qa.setQuestionID("QQ-0001");
    		qa.setStringValue("sv");
    		return respdoc;
    	}
    	
    	public DeleteExternalServiceResponseDocument deleteExternalService (DeleteExternalServiceDocument deleteExternalService28) {
    		DeleteExternalServiceResponseDocument respdoc = DeleteExternalServiceResponseDocument.Factory.newInstance();
    		DeleteExternalServiceResponse resp = respdoc.addNewDeleteExternalServiceResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public DeleteClinicianResponseDocument deleteClinician (DeleteClinicianDocument deleteClinician30) {
    		DeleteClinicianResponseDocument respdoc = DeleteClinicianResponseDocument.Factory.newInstance();
    		DeleteClinicianResponse resp = respdoc.addNewDeleteClinicianResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public DeletePatientResponseDocument deletePatient (DeletePatientDocument deletePatient32) {
    		DeletePatientResponseDocument respdoc = DeletePatientResponseDocument.Factory.newInstance();
    		DeletePatientResponse resp = respdoc.addNewDeletePatientResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public CreateQuestionnaireResponseDocument createQuestionnaire (CreateQuestionnaireDocument createQuestionnaire34) {
    		CreateQuestionnaireResponseDocument respdoc = CreateQuestionnaireResponseDocument.Factory.newInstance();
    		CreateQuestionnaireResponse resp = respdoc.addNewCreateQuestionnaireResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public GetPatientMeasurementResponseDocument getPatientMeasurement (GetPatientMeasurementDocument getPatientMeasurement36) {
    		GetPatientMeasurementResponseDocument respdoc = GetPatientMeasurementResponseDocument.Factory.newInstance();
    		GetPatientMeasurementResponse resp = respdoc.addNewGetPatientMeasurementResponse();
    		Measurement m = resp.addNewOut();
    		Calendar c = Calendar.getInstance();
    		c.set(2010, 06, 15, 14, 55, 30);
    		m.setDateTime(c);
    		m.setPatientID("P-0001");
    		m.setTaskID("T-0001");
    		//m.setType("none");
    		m.setUnits("l");
    		BigDecimal b = new BigDecimal(1.0);
    		m.setValue (b);
    		return respdoc;
    	}
    	
    	public DeleteQuestionnaireResponseDocument deleteQuestionnaire (DeleteQuestionnaireDocument deleteQuestionnaire38) {
    		DeleteQuestionnaireResponseDocument respdoc = DeleteQuestionnaireResponseDocument.Factory.newInstance();
    		DeleteQuestionnaireResponse resp = respdoc.addNewDeleteQuestionnaireResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public AssignTaskResponseDocument assignTask (AssignTaskDocument assignTask40) {
    		AssignTaskResponseDocument respdoc = AssignTaskResponseDocument.Factory.newInstance();
    		AssignTaskResponse resp = respdoc.addNewAssignTaskResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	         
    	     
    	public ListOfAdministratorsResponseDocument listOfAdministrators (ListOfAdministratorsDocument listOfAdministrators44) {
    		ListOfAdministratorsResponseDocument respdoc = ListOfAdministratorsResponseDocument.Factory.newInstance();
    		ListOfAdministratorsResponse resp = respdoc.addNewListOfAdministratorsResponse();
    		AdministratorInfo ai = resp.addNewOut();
    		ai.setID("A-0001");
    		ai.setName("Yuri");
    		ai.setSurname("Glickman");
    		return respdoc;
    	}
    	     
    	public GetUserPlannedTasksResponseDocument getUserPlannedTasks (GetUserPlannedTasksDocument getUserPlannedTasks46) {
    		GetUserPlannedTasksResponseDocument respdoc = GetUserPlannedTasksResponseDocument.Factory.newInstance();
    		GetUserPlannedTasksResponse resp = respdoc.addNewGetUserPlannedTasksResponse();
    		Task t = resp.addNewOut();
    		SystemParameter ts = t.addNewTaskStatus();
    		ts.setCode("1");
    		SystemParameter tt = t.addNewTaskType();
    		tt.setCode("1");
    		t.setAssignerID("A-0001");
    		Calendar c = Calendar.getInstance();
    		c.set(2010, 06, 15, 14, 55, 30);
    		t.setDateTimeAssigned(c);
    		t.setDateTimeFulfilled(c);
    		t.setExecutorID("E-0001");
    		t.setURL("http://google.com");
    		return respdoc;
    	}
    	     
    	public ListOfPossibleTasksResponseDocument listOfPossibleTasks (ListOfPossibleTasksDocument listOfPossibleTasks48) {
    		ListOfPossibleTasksResponseDocument respdoc = ListOfPossibleTasksResponseDocument.Factory.newInstance();
    		ListOfPossibleTasksResponse resp = respdoc.addNewListOfPossibleTasksResponse();
    		SystemParameter pt1 = resp.addNewOut();
    		pt1.setCode("1");
    		SystemParameter pt2 = resp.addNewOut();
    		pt2.setCode("2");
    		return respdoc;
    	}
    	
    	
    	public CreateExternalServiceResponseDocument createExternalService (CreateExternalServiceDocument createExternalService52) {
    		CreateExternalServiceResponseDocument respdoc = CreateExternalServiceResponseDocument.Factory.newInstance();
    		CreateExternalServiceResponse resp = respdoc.addNewCreateExternalServiceResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public SaveCarerAssessmentResponseDocument saveCarerAssessment (SaveCarerAssessmentDocument saveCarerAssessment54) {
    		SaveCarerAssessmentResponseDocument respdoc = SaveCarerAssessmentResponseDocument.Factory.newInstance();
    		SaveCarerAssessmentResponse resp = respdoc.addNewSaveCarerAssessmentResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public DeleteCarerResponseDocument deleteCarer (DeleteCarerDocument deleteCarer56) {
    		DeleteCarerResponseDocument respdoc = DeleteCarerResponseDocument.Factory.newInstance();
    		DeleteCarerResponse resp = respdoc.addNewDeleteCarerResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public CreateAdministratorResponseDocument createAdministrator (CreateAdministratorDocument createAdministrator58) {
    		CreateAdministratorResponseDocument respdoc = CreateAdministratorResponseDocument.Factory.newInstance();
    		CreateAdministratorResponse resp = respdoc.addNewCreateAdministratorResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public UpdateExternalServiceResponseDocument updateExternalService (UpdateExternalServiceDocument updateExternalService60) {
    		UpdateExternalServiceResponseDocument respdoc = UpdateExternalServiceResponseDocument.Factory.newInstance();
    		UpdateExternalServiceResponse resp = respdoc.addNewUpdateExternalServiceResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public GetClinicianResponseDocument getClinician (GetClinicianDocument getClinician62) {
    		GetClinicianResponseDocument respdoc = GetClinicianResponseDocument.Factory.newInstance();
    		GetClinicianResponse resp = respdoc.addNewGetClinicianResponse();
    		Clinician p = resp.addNewOut();
    		PersonData pd = p.addNewPersonData();
    		pd.setName("Vovka");
    		pd.setSurname("Morkovka");
//    		Address a = pd.addNewAddressList();
//    		a.setCity("Baden");
//    		a.setCountry("Schweiz");
//    		a.setStreet("Big street");
//    		a.setZipCode("111111");
//    		Communication c = pd.addNewCommunicationList();
//    		c.setType("phone");
//    		c.setValue("+49XXXXXXX");
//    		Identifier i = pd.addNewIdentifierList();
//    		i.setNumber("XXX1123");
//    		i.setType("pass");
    		p.setID("P-0001");
    		return respdoc;
    	}
    	
    	public DeletePatientAssessmentResponseDocument deletePatientAssessment (DeletePatientAssessmentDocument deletePatientAssessment64) {
    		DeletePatientAssessmentResponseDocument respdoc = DeletePatientAssessmentResponseDocument.Factory.newInstance();
    		DeletePatientAssessmentResponse resp = respdoc.addNewDeletePatientAssessmentResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public GetAllExternalServicesResponseDocument getAllExternalServices (GetAllExternalServicesDocument getAllExternalServices66) {
    		GetAllExternalServicesResponseDocument respdoc = GetAllExternalServicesResponseDocument.Factory.newInstance();
    		GetAllExternalServicesResponse resp = respdoc.addNewGetAllExternalServicesResponse();
    		ExternalService es = resp.addNewOut();
    		es.setAddress("http://google.com");
    		es.setID("S-0001");
    		return respdoc;
    	}
    	
    	public GetCarerResponseDocument getCarer (GetCarerDocument getCarer68) {
    		GetCarerResponseDocument respdoc = GetCarerResponseDocument.Factory.newInstance();
    		GetCarerResponse resp = respdoc.addNewGetCarerResponse();
    		Carer p = resp.addNewOut();
    		PersonData pd = p.addNewPersonData();
    		pd.setName("Vovka");
    		pd.setSurname("Morkovka");
//    		Address a = pd.addNewAddressList();
//    		a.setCity("Baden");
//    		a.setCountry("Schweiz");
//    		a.setStreet("Big street");
//    		a.setZipCode("111111");
//    		Communication c = pd.addNewCommunicationList();
//    		c.setType("phone");
//    		c.setValue("+49XXXXXXX");
//    		Identifier i = pd.addNewIdentifierList();
//    		i.setNumber("XXX1123");
//    		i.setType("pass");
    		p.setID("P-0001");
    		SocioDemographicData sd = p.addNewSDData();
    		SystemParameter gender = sd.addNewGender();
    		gender.setCode("1");
    		gender.setDescription("male");
    		SystemParameter LivingWith = sd.addNewLivingWith();
    		LivingWith.setCode("1");
    		SystemParameter MaritalStatus = sd.addNewMaritalStatus();
    		MaritalStatus.setCode("1");
    		sd.setAge((short) 60);
    		sd.setChildren((short) 2);
    		return respdoc;
    	}
    	
    	public GetAdministratorResponseDocument getAdministrator (GetAdministratorDocument getAdministrator70) {
    		GetAdministratorResponseDocument respdoc = GetAdministratorResponseDocument.Factory.newInstance();
    		GetAdministratorResponse resp = respdoc.addNewGetAdministratorResponse();
    		Administrator p = resp.addNewOut();
    		PersonData pd = p.addNewPersonData();
    		pd.setName("Vovka");
    		pd.setSurname("Morkovka");
//    		Address a = pd.addNewAddressList();
//    		a.setCity("Baden");
//    		a.setCountry("Schweiz");
//    		a.setStreet("Big street");
//    		a.setZipCode("111111");
//    		Communication c = pd.addNewCommunicationList();
//    		c.setType("phone");
//    		c.setValue("+49XXXXXXX");
//    		Identifier i = pd.addNewIdentifierList();
//    		i.setNumber("XXX1123");
//    		i.setType("pass");
    		p.setID("P-0001");
    		return respdoc;
    	}
    	
    	public UpdateAdministratorResponseDocument updateAdministrator (UpdateAdministratorDocument updateAdministrator72) {
    		UpdateAdministratorResponseDocument respdoc = UpdateAdministratorResponseDocument.Factory.newInstance();
    		UpdateAdministratorResponse resp = respdoc.addNewUpdateAdministratorResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public GetQuestionnaireResponseDocument getQuestionnaire (GetQuestionnaireDocument getQuestionnaire74) {
    		GetQuestionnaireResponseDocument respdoc = GetQuestionnaireResponseDocument.Factory.newInstance();
    		GetQuestionnaireResponse resp = respdoc.addNewGetQuestionnaireResponse();
    		Questionnaire q = resp.addNewOut();
    		q.setID("Q-0001");
    		q.setTitle("Quest#1");
    		q.setVersion(new BigDecimal(1.0));
//    		QuestionnaireQuestion qq = q.addNewQuestions();
//    		qq.setId("QQ-0001");
//    		QuestionnaireQuestionAnswer qqa = qq.addNewAnswer();
//    		qqa.setStringValue("answer1");
//    		qqa.setValue((short) -1);
    		return respdoc;
    	}
    	
    	public StoreQuestionnaireAnswersResponseDocument storeQuestionnaireAnswers (StoreQuestionnaireAnswersDocument storeQuestionnaireAnswers76) {
    		StoreQuestionnaireAnswersResponseDocument respdoc = StoreQuestionnaireAnswersResponseDocument.Factory.newInstance();
    		StoreQuestionnaireAnswersResponse resp = respdoc.addNewStoreQuestionnaireAnswersResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public GetPatientAssessmentResponseDocument getPatientAssessment (GetPatientAssessmentDocument getPatientAssessment78) {
    		GetPatientAssessmentResponseDocument respdoc = GetPatientAssessmentResponseDocument.Factory.newInstance();
    		GetPatientAssessmentResponse resp = respdoc.addNewGetPatientAssessmentResponse();
    		PatientAssessment pa = resp.addNewOut();
    		SystemParameter ae = pa.addNewAetology();
    		ae.setCode("1");
    		Measurement m = pa.addNewClinicalData();
    		m.setPatientID("P-0001");
    		return respdoc;
    	}
    	
    	public GetCarerAssessmentResponseDocument getCarerAssessment (GetCarerAssessmentDocument getCarerAssessment80) {
    		GetCarerAssessmentResponseDocument respdoc = GetCarerAssessmentResponseDocument.Factory.newInstance();
    		GetCarerAssessmentResponse resp = respdoc.addNewGetCarerAssessmentResponse();
    		CarerAssessment pa = resp.addNewOut();
    		pa.setCarerID("C-0001");
    		return respdoc;
    	}
    	
    	public ChangeTaskStatusResponseDocument changeTaskStatus (ChangeTaskStatusDocument changeTaskStatus82) {
    		ChangeTaskStatusResponseDocument respdoc = ChangeTaskStatusResponseDocument.Factory.newInstance();
    		ChangeTaskStatusResponse resp = respdoc.addNewChangeTaskStatusResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public ListOfPatientsResponseDocument listOfPatients (ListOfPatientsDocument listOfPatients84) {
    		ListOfPatientsResponseDocument respdoc = ListOfPatientsResponseDocument.Factory.newInstance();
    		ListOfPatientsResponse resp = respdoc.addNewListOfPatientsResponse();
    		PatientInfo ai = resp.addNewOut();
    		ai.setID("A-0001");
    		ai.setName("Ivan");
    		ai.setSurname("Popov");
    		return respdoc;
    	}
    	
    	public GetWarningsResponseDocument getWarnings (GetWarningsDocument getWarnings86) {
    		GetWarningsResponseDocument respdoc = GetWarningsResponseDocument.Factory.newInstance();
    		GetWarningsResponse resp = respdoc.addNewGetWarningsResponse();
    		Warning w = resp.addNewOut();
    		SystemParameter ef = w.addNewEffect();
    		ef.setCode("1");
    		SystemParameter el = w.addNewEmergencyLevel();
    		el.setCode("2");
    		SystemParameter i = w.addNewIndicator();
    		i.setCode("3");
    		SystemParameter rl = w.addNewRiskLevel();
    		rl.setCode("4");
    		SystemParameter tw = w.addNewTypeOfWarning();
    		tw.setCode("5");
    		return respdoc;
    	}
    	
    	public UpdateClinicianResponseDocument updateClinician (UpdateClinicianDocument updateClinician88) {
    		UpdateClinicianResponseDocument respdoc = UpdateClinicianResponseDocument.Factory.newInstance();
    		UpdateClinicianResponse resp = respdoc.addNewUpdateClinicianResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
    	
    	public MarkWarningAsReadResponseDocument markWarningAsRead (MarkWarningAsReadDocument markWarningAsRead90) {
    		MarkWarningAsReadResponseDocument respdoc = MarkWarningAsReadResponseDocument.Factory.newInstance();
    		MarkWarningAsReadResponse resp = respdoc.addNewMarkWarningAsReadResponse();
    		OperationResult res = resp.addNewOut();
    		res.setCode("R-0001");
    		res.setDescription("");
    		res.setStatus((short) 1);
    		return respdoc;
    	}
         
        public UpdateUserResponseDocument updateUser (UpdateUserDocument req) {
        	UpdateUserResponseDocument respdoc = UpdateUserResponseDocument.Factory.newInstance();
        	UpdateUserResponse resp = respdoc.addNewUpdateUserResponse();
        	resp.addNewOut().setStatus((short) -1);
        	return respdoc;
        }
         
        public DeleteUserResponseDocument deleteUser (DeleteUserDocument req) {
        	DeleteUserResponseDocument respdoc = DeleteUserResponseDocument.Factory.newInstance();
        	DeleteUserResponse resp = respdoc.addNewDeleteUserResponse();
        	resp.addNewOut().setStatus((short) -1);
        	return respdoc;
        }
         
        public AuthResponseDocument auth (AuthDocument req) {
        	AuthResponseDocument respdoc = AuthResponseDocument.Factory.newInstance();
        	AuthResponse resp = respdoc.addNewAuthResponse();
        	resp.addNewOut().setStatus((short) -1);
        	return respdoc;
        }
         
        public ChangePasswordResponseDocument changePassword (ChangePasswordDocument req) {
        	ChangePasswordResponseDocument respdoc = ChangePasswordResponseDocument.Factory.newInstance();
        	ChangePasswordResponse resp = respdoc.addNewChangePasswordResponse();
        	resp.addNewOut().setStatus((short) -1);
        	return respdoc;
        }

        public CreateUserResponseDocument createUser (CreateUserDocument req) {
        	CreateUserResponseDocument respdoc = CreateUserResponseDocument.Factory.newInstance();
        	CreateUserResponse resp = respdoc.addNewCreateUserResponse();
        	resp.addNewOut().setStatus((short) -1);
        	return respdoc;        }
    
    }
    