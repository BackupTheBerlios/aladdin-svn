package com.aladdin.sc;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

import org.apache.axis2.context.MessageContext;
import org.example.rulemap.RuleMap;
import org.example.rulemap.Ruleset;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.TransactionException;
import org.hibernate.cfg.Configuration;

import com.aladdin.sc.db.AladdinUser;

import eu.aladdin_project.storagecomponent.*;
import eu.aladdin_project.storagecomponent.AddMediaContentResponseDocument.AddMediaContentResponse;
import eu.aladdin_project.storagecomponent.AssignTaskResponseDocument.AssignTaskResponse;
import eu.aladdin_project.storagecomponent.AssignTasksMassivelyResponseDocument.AssignTasksMassivelyResponse;
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
import eu.aladdin_project.storagecomponent.DeleteMediaContentResponseDocument.DeleteMediaContentResponse;
import eu.aladdin_project.storagecomponent.DeletePatientAssessmentResponseDocument.DeletePatientAssessmentResponse;
import eu.aladdin_project.storagecomponent.DeletePatientResponseDocument.DeletePatientResponse;
import eu.aladdin_project.storagecomponent.DeleteQuestionnaireResponseDocument.DeleteQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.DeleteUserResponseDocument.DeleteUserResponse;
import eu.aladdin_project.storagecomponent.GetAdministratorResponseDocument.GetAdministratorResponse;
import eu.aladdin_project.storagecomponent.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse;
import eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse;
import eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse;
import eu.aladdin_project.storagecomponent.GetCarerResponseDocument.GetCarerResponse;
import eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse;
import eu.aladdin_project.storagecomponent.GetMeasurementResponseDocument.GetMeasurementResponse;
import eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse;
import eu.aladdin_project.storagecomponent.GetPatientAssessmentsResponseDocument.GetPatientAssessmentsResponse;
import eu.aladdin_project.storagecomponent.GetPatientMeasurementResponseDocument.GetPatientMeasurementResponse;
import eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse;
import eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse;
import eu.aladdin_project.storagecomponent.GetQuestionDescriptionResponseDocument.GetQuestionDescriptionResponse;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueResponseDocument.GetQuestionnaireAnswerValueResponse;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskResponseDocument.GetQuestionnaireAnswersByTaskResponse;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersDocument.GetQuestionnaireAnswers;
import eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersResponseDocument.GetQuestionnaireAnswersResponse;
import eu.aladdin_project.storagecomponent.GetQuestionnaireResponseDocument.GetQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.GetSystemParameterListResponseDocument.GetSystemParameterListResponse;
import eu.aladdin_project.storagecomponent.GetTaskResponseDocument.GetTaskResponse;
import eu.aladdin_project.storagecomponent.GetUserIdByPersonIdResponseDocument.GetUserIdByPersonIdResponse;
import eu.aladdin_project.storagecomponent.GetUserPlannedTasksResponseDocument.GetUserPlannedTasksResponse;
import eu.aladdin_project.storagecomponent.GetUserResponseDocument.GetUserResponse;
import eu.aladdin_project.storagecomponent.GetUserTypeResponseDocument.GetUserTypeResponse;
import eu.aladdin_project.storagecomponent.GetWarningsResponseDocument.GetWarningsResponse;
import eu.aladdin_project.storagecomponent.ListOfAdministratorsResponseDocument.ListOfAdministratorsResponse;
import eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse;
import eu.aladdin_project.storagecomponent.ListOfCliniciansResponseDocument.ListOfCliniciansResponse;
import eu.aladdin_project.storagecomponent.ListOfPatientsResponseDocument.ListOfPatientsResponse;
import eu.aladdin_project.storagecomponent.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse;
import eu.aladdin_project.storagecomponent.ListOfQuestionnairesResponseDocument.ListOfQuestionnairesResponse;
import eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse;
import eu.aladdin_project.storagecomponent.MarkWarningAsReadResponseDocument.MarkWarningAsReadResponse;
import eu.aladdin_project.storagecomponent.RemoveTaskMassivelyResponseDocument.RemoveTaskMassivelyResponse;
import eu.aladdin_project.storagecomponent.SaveCarerAssessmentResponseDocument.SaveCarerAssessmentResponse;
import eu.aladdin_project.storagecomponent.SavePatientAssessmentResponseDocument.SavePatientAssessmentResponse;
import eu.aladdin_project.storagecomponent.SaveWarningResponseDocument.SaveWarningResponse;
import eu.aladdin_project.storagecomponent.StoreMeasurementsResponseDocument.StoreMeasurementsResponse;
import eu.aladdin_project.storagecomponent.StoreQuestionnaireAnswersResponseDocument.StoreQuestionnaireAnswersResponse;
import eu.aladdin_project.storagecomponent.UpdateAdministratorResponseDocument.UpdateAdministratorResponse;
import eu.aladdin_project.storagecomponent.UpdateCarerResponseDocument.UpdateCarerResponse;
import eu.aladdin_project.storagecomponent.UpdateClinicianResponseDocument.UpdateClinicianResponse;
import eu.aladdin_project.storagecomponent.UpdateExternalServiceResponseDocument.UpdateExternalServiceResponse;
import eu.aladdin_project.storagecomponent.UpdateMediaContentResponseDocument.UpdateMediaContentResponse;
import eu.aladdin_project.storagecomponent.UpdatePatientResponseDocument.UpdatePatientResponse;
import eu.aladdin_project.storagecomponent.UpdateQuestionnaireResponseDocument.UpdateQuestionnaireResponse;
import eu.aladdin_project.storagecomponent.UpdateSystemParameterResponseDocument.UpdateSystemParameterResponse;
import eu.aladdin_project.storagecomponent.UpdateUserResponseDocument.UpdateUserResponse;
import eu.aladdin_project.xsd.Address;
import eu.aladdin_project.xsd.AddressList;
import eu.aladdin_project.xsd.Administrator;
import eu.aladdin_project.xsd.AdministratorInfo;
import eu.aladdin_project.xsd.Carer;
import eu.aladdin_project.xsd.CarerAssessment;
import eu.aladdin_project.xsd.CarerInfo;
import eu.aladdin_project.xsd.Clinician;
import eu.aladdin_project.xsd.ClinicianInfo;
import eu.aladdin_project.xsd.Communication;
import eu.aladdin_project.xsd.CommunicationList;
import eu.aladdin_project.xsd.Consulter;
import eu.aladdin_project.xsd.ExternalService;
import eu.aladdin_project.xsd.GeneralPractitioner;
import eu.aladdin_project.xsd.Identifier;
import eu.aladdin_project.xsd.IdentifierList;
import eu.aladdin_project.xsd.Measurement;
import eu.aladdin_project.xsd.MediaContent;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.Patient;
import eu.aladdin_project.xsd.PatientAssessment;
import eu.aladdin_project.xsd.PatientInfo;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.Questionnaire;
import eu.aladdin_project.xsd.QuestionnaireAnswer;
import eu.aladdin_project.xsd.QuestionnaireAnswers;
import eu.aladdin_project.xsd.QuestionnaireInfo;
import eu.aladdin_project.xsd.QuestionnaireQuestion;
import eu.aladdin_project.xsd.QuestionnaireQuestionAnswer;
import eu.aladdin_project.xsd.SearchCriteria;
import eu.aladdin_project.xsd.SocialWorker;
import eu.aladdin_project.xsd.SocioDemographicData;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.Task;
import eu.aladdin_project.xsd.User;
import eu.aladdin_project.xsd.Warning;

/**
 * Exception used by StorageComponent internal for not existed locales.
 * @author Andrey Baboshin
 *
 */
class LocaleException extends Exception {
	private static final long serialVersionUID = -7232119734945287619L;

	public LocaleException () {}
	
	public LocaleException (String message) {
		super (message);
	}
	
	public LocaleException (String message, Throwable cause) {
		super (message, cause);
	}
	
	public LocaleException (Throwable cause) {
		super (cause);
	}
	
}

/**
 * The StorageComponentSkeleton is main class for Storage Component.
 * It implements all actions described in WSDL.
 * @author Andrey Baboshin
 *
 */
public class StorageComponentSkeleton implements StorageComponentSkeletonInterface {
	/**
	 * Constant for "<"
	 */
	public final static int OP_LESS = 1;
	/**
	 * Constant for ">"
	 */
	public final static int OP_GREAT = 2;
	/**
	 * Constant for "="
	 */
	public final static int OP_EQ = 3;
	/**
	 * Constant for "!="
	 */
	public final static int OP_NOTEQ = 4;
	/**
	 * Constant for "like"
	 */
	public final static int OP_LIKE = 5;
	/**
	 * Constant for "between"
	 */
	public final static int OP_BETWEEN = 7;
	/**
	 * Constant for the Carer type
	 */
	public final static int U_CARER = 3;
	/**
	 * Constant for the Patient type
	 */
	public final static int U_PATIENT = 4;
	/**
	 * Constant for the Clinician type
	 */
	public final static int U_CLINICIAN = 2;
	/**
	 * Constant for the Admin type
	 */
	public final static int U_ADMIN = 1;
	/**
	 * Constant for the Service type
	 */
	public final static int U_SERVICE = 5;
	/**
	 * Map of code of operation => string representation
	 */
	private static HashMap<Integer, String> op;
	/**
	 * URI of the Forum sc.php
	 */
	private final static String forumSC;
	/**
	 * Instance of the session factory
	 */
	private final static SessionFactory sessionFactory;
	/**
	 * Instance of the session
	 */
	private Session session;
	
	static {
		try {
			forumSC = com.aladdin.sc.config.Configuration.forumSC;
			
			Configuration configure = new Configuration().configure(com.aladdin.sc.config.Configuration.hibernateCfg);
			sessionFactory = configure.buildSessionFactory();
			System.out.println ("new sessionFactory");
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		op = new HashMap<Integer, String>();
		op.put(OP_LESS, " %s < '%s' ");
		op.put(OP_GREAT, " %s > '%s' ");
		op.put(OP_EQ, " %s = '%s' ");
		op.put(OP_NOTEQ, " %s != '%s' ");
		op.put(OP_LIKE, "%s like '%s' ");
		op.put(OP_BETWEEN, " %s BETWEEN '%s' AND '%s' ");
	}
	
	/**
	 * Default constructor
	 */
	public StorageComponentSkeleton () {
		System.out.println ("_init");
		session = sessionFactory.openSession();
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#createClinician(eu.aladdin_project.storagecomponent.CreateClinicianDocument)
	 */
	public CreateClinicianResponseDocument createClinician (CreateClinicianDocument req) {
		CreateClinicianResponseDocument respdoc = CreateClinicianResponseDocument.Factory.newInstance();
		CreateClinicianResponse resp = respdoc.addNewCreateClinicianResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getCreateClinician().setUserId (nc.check(req.getCreateClinician().getUserId(), String.class));
			req.getCreateClinician().setData(nc.check(req.getCreateClinician().getData(), Clinician.class));
		}
		
		if (!checkUser(req.getCreateClinician().getUserId(), U_ADMIN)) {
			res.setCode("-1");
			res.setStatus((short) 0);
			res.setDescription("auth error");
			return respdoc;
		}
		
		try {
			
			Clinician data = req.getCreateClinician().getData();
			
			session.beginTransaction();
			
			com.aladdin.sc.db.Clinician clinician = new com.aladdin.sc.db.Clinician ();
			
			Integer pdid = importPersondata(data.getPersonData(), null); 
			
			clinician.setPersondata(pdid);
			session.save(clinician);
			
			session.getTransaction().commit();
			
			res.setCode(clinician.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error." + e.toString ());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#createPatient(eu.aladdin_project.storagecomponent.CreatePatientDocument)
	 */
	public CreatePatientResponseDocument createPatient (CreatePatientDocument req) {
		CreatePatientResponseDocument respdoc = CreatePatientResponseDocument.Factory.newInstance();
		CreatePatientResponse resp = respdoc.addNewCreatePatientResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getCreatePatient().setUserId (nc.check(req.getCreatePatient().getUserId(), String.class));
			req.getCreatePatient().setData(nc.check (req.getCreatePatient().getData(), Patient.class));
		}
		
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
			
			session.beginTransaction();

			com.aladdin.sc.db.Patient p = new com.aladdin.sc.db.Patient ();

			Integer pdid = importPersondata(data.getPersonData(), null);

			Integer sdid = importSocioDemographic(data.getSDData(), null);

			GeneralPractitioner gp = data.getGeneralPractitioner();
			if (gp != null) {
				p.setGpemail(gp.getEmail());
				p.setGpname(gp.getName());
				p.setGpphone(gp.getPhone());
			}
			
			Consulter c = data.getConsulterInCharge();
			if (c != null) {
				p.setCcemail(c.getEmail());
				p.setCcname(c.getName());
				p.setCcphone(c.getPhone());
			}

			SocialWorker sw = data.getSocialWorker();
			if (sw != null) {
				p.setSwemail(sw.getEmail());
				p.setSwname(sw.getName());
				p.setSwphone(sw.getPhone());
			}
			p.setPersondata(pdid);
			p.setSd(sdid);
			String responsibleClinicianID = data.getResponsibleClinicianID();
			if (responsibleClinicianID == null) responsibleClinicianID = "0";
			p.setClinician(new Integer(responsibleClinicianID));
            
            if (data.getPatientCarer() != null) p.setCarer(new Integer (data.getPatientCarer().getID()));
            
			session.save(p);
			
			session.getTransaction().commit();
			
			res.setCode(p.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#createCarer(eu.aladdin_project.storagecomponent.CreateCarerDocument)
	 */
	public CreateCarerResponseDocument createCarer (CreateCarerDocument req) {
		CreateCarerResponseDocument respdoc = CreateCarerResponseDocument.Factory.newInstance();
		CreateCarerResponse resp = respdoc.addNewCreateCarerResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getCreateCarer().setUserId (nc.check(req.getCreateCarer().getUserId(), String.class));
			req.getCreateCarer().setData(nc.check (req.getCreateCarer().getData(), Carer.class));
		}
		
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
			
			session.beginTransaction();
			
			com.aladdin.sc.db.Carer p = new com.aladdin.sc.db.Carer ();
			
			Integer pdid = importPersondata(data.getPersonData(), null);
			
			Integer sdid = importSocioDemographic(data.getSDData(), null);
			
			p.setPersondata(pdid);
			p.setSd(sdid);
			session.save(p);
			
			session.getTransaction().commit();
			
			res.setCode(p.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#updateQuestionnaire(eu.aladdin_project.storagecomponent.UpdateQuestionnaireDocument)
	 */
	public UpdateQuestionnaireResponseDocument updateQuestionnaire (UpdateQuestionnaireDocument req) {
		UpdateQuestionnaireResponseDocument respdoc = UpdateQuestionnaireResponseDocument.Factory.newInstance();
		UpdateQuestionnaireResponse resp = respdoc.addNewUpdateQuestionnaireResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getUpdateQuestionnaire().setUserId (nc.check(req.getUpdateQuestionnaire().getUserId(), String.class));
			req.getUpdateQuestionnaire().setData(nc.check (req.getUpdateQuestionnaire().getData(), Questionnaire.class));
		}
		
		if (
				!checkUser(req.getUpdateQuestionnaire().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getUpdateQuestionnaire().getUserId(), U_ADMIN)
			) {
			res.setCode("-1");
			res.setStatus((short) 0);
			res.setDescription("auth error");
			return respdoc;
		}
		
		Questionnaire rquest = req.getUpdateQuestionnaire().getData();
		SystemParameter locale = req.getUpdateQuestionnaire().getLocale();
		
		try {
			
			session.beginTransaction();
			
			importQuestionnaire(rquest, locale);
			
			session.getTransaction().commit();
			
			res.setCode(rquest.getID().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} catch (LocaleException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {

			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#listOfQuestionnaires(eu.aladdin_project.storagecomponent.ListOfQuestionnairesDocument)
	 */
	public ListOfQuestionnairesResponseDocument listOfQuestionnaires (ListOfQuestionnairesDocument req) {
		ListOfQuestionnairesResponseDocument respdoc = ListOfQuestionnairesResponseDocument.Factory.newInstance();
		ListOfQuestionnairesResponse resp = respdoc.addNewListOfQuestionnairesResponse();
		
		trace(Thread.currentThread().getStackTrace());
		
		try {
			
			Object[] ql = session.createSQLQuery("SELECT id, title, version FROM questionnaire").list().toArray();
			for (int i = 0; i < ql.length; i++) {
				Object[] quest = (Object[]) ql[i];
				QuestionnaireInfo qi = resp.addNewOut();
				qi.setID(((Integer)quest[0]).toString());
				qi.setTitle(getTranslate("questionnaire", (Integer)quest[0], req.getListOfQuestionnaires().getLocale(), (String)quest[1]));
				qi.setVersion(((BigDecimal)quest[2]).doubleValue ());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}

		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#saveWarning(eu.aladdin_project.storagecomponent.SaveWarningDocument)
	 */
	public SaveWarningResponseDocument saveWarning (SaveWarningDocument req) {
		SaveWarningResponseDocument respdoc = SaveWarningResponseDocument.Factory.newInstance();
		SaveWarningResponse resp = respdoc.addNewSaveWarningResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getSaveWarning().setUserId (nc.check(req.getSaveWarning().getUserId(), String.class));
			req.getSaveWarning().setWarn(nc.check (req.getSaveWarning().getWarn(), Warning.class));
		}
		
		if (
				!checkUser(req.getSaveWarning().getUserId(), U_CARER) &&
				!checkUser(req.getSaveWarning().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getSaveWarning().getUserId(), U_ADMIN) && 
				!checkUser(req.getSaveWarning().getUserId(), U_SERVICE)
			) {
			res.setCode("-1");
			res.setStatus((short) 0);
			res.setDescription("auth error");
			return respdoc;
		}
		
		try {
			
			session.beginTransaction();
			
			Warning rwarn = req.getSaveWarning().getWarn();
			com.aladdin.sc.db.Warning warn = new com.aladdin.sc.db.Warning ();
			try {
				warn.setTypeOfWarning(new Integer (rwarn.getTypeOfWarning().getCode()));
			} catch (NumberFormatException e) {
			}
			
			long timeInMillis = 0;
			if (rwarn.getDateTimeOfWarning() != null) timeInMillis = rwarn.getDateTimeOfWarning().getTimeInMillis();
			warn.setDateTimeOfWarning(new Timestamp(timeInMillis));
			
			try {
				warn.setEffect(new Integer (rwarn.getEffect().getCode()));
			} catch (NumberFormatException e) {
			}
			
			try {
				warn.setIndicator(new Integer (rwarn.getIndicator().getCode()));
			} catch (NumberFormatException e) {
			}
			
			try {
				warn.setRiskLevel(new Integer(rwarn.getRiskLevel().getCode()));
			} catch (NumberFormatException e) {
			}
			
			warn.setJustificationText(rwarn.getJustificationText());
			
			try {
				warn.setEmergencyLevel(new Integer(rwarn.getEmergencyLevel().getCode()));
			} catch (NumberFormatException e) {
			}
			
			if (rwarn.getPatient() != null) warn.setPatient(new Integer (rwarn.getPatient().getID()));
			
			warn.setDelivered(rwarn.getDelivered());

			session.save (warn);
			
			session.getTransaction().commit();
			
			res.setCode(warn.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#updateCarer(eu.aladdin_project.storagecomponent.UpdateCarerDocument)
	 */
	public UpdateCarerResponseDocument updateCarer (UpdateCarerDocument req) {
		UpdateCarerResponseDocument respdoc = UpdateCarerResponseDocument.Factory.newInstance();
		UpdateCarerResponse resp = respdoc.addNewUpdateCarerResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getUpdateCarer().setUserId (nc.check(req.getUpdateCarer().getUserId(), String.class));
			req.getUpdateCarer().setData(nc.check (req.getUpdateCarer().getData(), Carer.class));
		}
		
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
			
			session.beginTransaction();
			
			Integer id = new Integer (data.getID());
			com.aladdin.sc.db.Carer p = (com.aladdin.sc.db.Carer) session.load (com.aladdin.sc.db.Carer.class, id);
			importPersondata(data.getPersonData(), p.getPersondata());
			importSocioDemographic(data.getSDData(), p.getSd());
			session.update(p);
			
			session.getTransaction().commit();
			
			res.setCode(p.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deleteAdministrator(eu.aladdin_project.storagecomponent.DeleteAdministratorDocument)
	 */
	public DeleteAdministratorResponseDocument deleteAdministrator (DeleteAdministratorDocument req) {
		DeleteAdministratorResponseDocument respdoc = DeleteAdministratorResponseDocument.Factory.newInstance();
		DeleteAdministratorResponse resp = respdoc.addNewDeleteAdministratorResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getDeleteAdministrator().setUserId (nc.check(req.getDeleteAdministrator().getUserId(), String.class));
			req.getDeleteAdministrator().setId(nc.check (req.getDeleteAdministrator().getId(), String.class));
		}
		
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
			
			com.aladdin.sc.db.Administrator p = (com.aladdin.sc.db.Administrator) session.load(com.aladdin.sc.db.Administrator.class, id);
			Integer pd = p.getPersonData();
			
			session.beginTransaction();
			
			session.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM communication WHERE persondata = (SELECT persondata FROM administrator WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM administrator WHERE id = " + id.toString()).executeUpdate();
			session.createSQLQuery("DELETE FROM persondata WHERE id = " + pd.toString()).executeUpdate();
			
			session.getTransaction().commit();
			
			res.setCode(id.toString ());
			res.setStatus((short) 1);
			res.setDescription("ok");
			
		}  catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("object not found");
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#updatePatient(eu.aladdin_project.storagecomponent.UpdatePatientDocument)
	 */
	public UpdatePatientResponseDocument updatePatient (UpdatePatientDocument req) {
		UpdatePatientResponseDocument respdoc = UpdatePatientResponseDocument.Factory.newInstance();
		UpdatePatientResponse resp = respdoc.addNewUpdatePatientResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getUpdatePatient().setUserId (nc.check(req.getUpdatePatient().getUserId(), String.class));
			req.getUpdatePatient().setData(nc.check (req.getUpdatePatient().getData(), Patient.class));
		}
		
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
			
			session.beginTransaction();
			
			Integer id = new Integer (data.getID());
			com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient) session.load (com.aladdin.sc.db.Patient.class, id);
			importPersondata(data.getPersonData(), p.getPersondata());
			importSocioDemographic(data.getSDData(), p.getSd());
			
			p.setCcname(data.getConsulterInCharge().getName());
			p.setCcphone(data.getConsulterInCharge().getPhone());
			p.setCcemail(data.getConsulterInCharge().getEmail());
			
			p.setSwname(data.getSocialWorker().getName());
			p.setSwphone(data.getSocialWorker().getPhone());
			p.setSwemail(data.getSocialWorker().getEmail());
			
			p.setGpname(data.getGeneralPractitioner().getName());
			p.setGpphone(data.getGeneralPractitioner().getPhone());
			p.setGpemail(data.getGeneralPractitioner().getEmail());
			
			if (data.getPatientCarer() != null) p.setCarer(new Integer (data.getPatientCarer().getID()));
			
			session.update(p);
			session.getTransaction().commit();
			
			res.setCode(p.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#listOfCarers(eu.aladdin_project.storagecomponent.ListOfCarersDocument)
	 */
	public ListOfCarersResponseDocument listOfCarers (ListOfCarersDocument req) {
		trace(Thread.currentThread().getStackTrace());
		ListOfCarersResponseDocument respdoc = ListOfCarersResponseDocument.Factory.newInstance();
		ListOfCarersResponse resp = respdoc.addNewListOfCarersResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getListOfCarers().setUserId (nc.check(req.getListOfCarers().getUserId(), String.class));
			
			for (int i = 0; i < req.getListOfCarers().getFilterArray().length; i++) {
				req.getListOfCarers().setFilterArray(i, nc.check(req.getListOfCarers().getFilterArray(i), SearchCriteria.class));
			}
		}
		
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
			
			Object[] ql = session.createSQLQuery(sql).list().toArray();
			for (int i = 0; i < ql.length; i++) {
				Integer id = (Integer) ql[i];
				com.aladdin.sc.db.Carer p = (com.aladdin.sc.db.Carer)session.load(com.aladdin.sc.db.Carer.class, id);
				CarerInfo qi = resp.addNewOut();
				qi.setID(p.getId().toString());
				qi.setSurname(p.getM_PersonData().getSurname());
				qi.setName(p.getM_PersonData().getName());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#listOfClinicians(eu.aladdin_project.storagecomponent.ListOfCliniciansDocument)
	 */
	public ListOfCliniciansResponseDocument listOfClinicians (ListOfCliniciansDocument req) {
		trace(Thread.currentThread().getStackTrace());
		ListOfCliniciansResponseDocument respdoc = ListOfCliniciansResponseDocument.Factory.newInstance();
		ListOfCliniciansResponse resp = respdoc.addNewListOfCliniciansResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getListOfClinicians().setUserId (nc.check(req.getListOfClinicians().getUserId(), String.class));
			
			for (int i = 0; i < req.getListOfClinicians().getFilterArray().length; i++) {
				req.getListOfClinicians().setFilterArray(i, nc.check(req.getListOfClinicians().getFilterArray(i), SearchCriteria.class));
			}
		}
		
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
			
			Object[] ql = session.createSQLQuery(sql).list().toArray();
			for (int i = 0; i < ql.length; i++) {
				Integer id = (Integer) ql[i];
				com.aladdin.sc.db.Clinician p = (com.aladdin.sc.db.Clinician)session.load(com.aladdin.sc.db.Clinician.class, id);
				ClinicianInfo qi = resp.addNewOut();
				qi.setID(p.getId().toString());
				qi.setSurname(p.getM_PersonData().getSurname());
				qi.setName(p.getM_PersonData().getName());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#savePatientAssessment(eu.aladdin_project.storagecomponent.SavePatientAssessmentDocument)
	 */
	public SavePatientAssessmentResponseDocument savePatientAssessment (SavePatientAssessmentDocument req) {
		SavePatientAssessmentResponseDocument respdoc = SavePatientAssessmentResponseDocument.Factory.newInstance();
		SavePatientAssessmentResponse resp = respdoc.addNewSavePatientAssessmentResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getSavePatientAssessment().setUserId (nc.check(req.getSavePatientAssessment().getUserId(), String.class));
			req.getSavePatientAssessment().setAssessment(nc.check(req.getSavePatientAssessment().getAssessment(), PatientAssessment.class));
		}
		
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
			session.beginTransaction();
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
			session.save(pa);
			
			Integer pid = new Integer (pa.getId());
			for (int i = 0; i < rpa.getClinicalDataArray().length; i++) {
				importMeasurement(rpa.getClinicalDataArray(i), pid);
			}
			
			session.getTransaction().commit();
			
			res.setCode(pa.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	static final int Weight = 2;
	static final int SystolicBloodPressure = 11;
	static final int DiastolicBloodPressure = 12;

	static final int LessThanRuleType = 1;
	static final int DoubleCompareRuleType = 2;
	static final int GreaterThanRuleType = 3;
	static final int CategoryChangeType = 4;

	static final int MeasurementAnalysis = 1;
	static final int QuestionnaireAnalysis = 2;
	
	@SuppressWarnings("unchecked")
	private List<RuleMap> GetRules() {

		List<RuleMap> DefinedRules = null;

		try {
			JAXBContext jc = JAXBContext
					.newInstance(org.example.rulemap.ObjectFactory.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			unmarshaller.setEventHandler(new DefaultValidationEventHandler());

			DefinedRules = (List<RuleMap>) ((JAXBElement<Ruleset>)
			unmarshaller.unmarshal(new File("/var/lib/tomcat6/webapps/axis2/WEB-INF/rules.xml"))).getValue().getRule();
			//DefinedRules = (List<RuleMap>) ((JAXBElement<Ruleset>) unmarshaller
			//		.unmarshal(new File("rules.xml"))).getValue().getRule();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return DefinedRules;
	}
	
	// Create Comparator for Sorting dates
	static final Comparator<com.aladdin.sc.db.Measurement> Date_Order = new Comparator<com.aladdin.sc.db.Measurement>() {
		public int compare(com.aladdin.sc.db.Measurement a, com.aladdin.sc.db.Measurement b) {
			return a.getDatetime().compareTo(b.getDatetime());
		}

	};
	
	// Generate Warning
	static com.aladdin.sc.db.Warning GenerateWarning(Integer patientID, String description,
			double RiskValue, double PreviousValue, int TypeOfAnalysis) {

		com.aladdin.sc.db.Warning warning = new com.aladdin.sc.db.Warning();
		warning.setPatient(patientID);
		warning.setTypeOfWarning(2);
		warning.setDateTimeOfWarning(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		warning.setDelivered(false);

		if (TypeOfAnalysis == MeasurementAnalysis) {
			warning.setJustificationText(String.format(
					"Type {%s} Current value = %s, Previous value = %s",
					description, RiskValue, PreviousValue));
		} else if (TypeOfAnalysis == QuestionnaireAnalysis)
			warning.setJustificationText(description);

		return warning;

	}
	
	// Rule 1 - Less Than rule
	static com.aladdin.sc.db.Warning LessThanRule(Integer patientID, String description,
			double Current, double Previous, double Threshold,
			int TypeOfAnalysis) {
		if (Current <= Previous - Threshold)
			return GenerateWarning(patientID, description, Current,
					Previous, TypeOfAnalysis);
		return null;
	}
	
	static com.aladdin.sc.db.Warning DoubleCompareRule(Integer patientID, String description,
			double Current, double Upper, double Lower, int TypeOfAnalysis) {
		if ((Current > Upper || Current < Lower))
			return GenerateWarning(patientID, description, Current, 0.0,
					TypeOfAnalysis);
		return null;
	}
	
	private void analyzeMeasurement (Integer measurementId, Integer patientId) {
		System.out.println ("analyzeMeasurement");
		com.aladdin.sc.db.Measurement measurement = (com.aladdin.sc.db.Measurement) session.load(com.aladdin.sc.db.Measurement.class, measurementId);
		
		List<RuleMap> DefinedRules = GetRules();
		String measurementType = "";
		String measurementDescription = "";
		
		if (measurement.getType().equals("2")) {
			measurementDescription = "Weight";
		} else if (measurement.getType().equals("11")) {
			measurementDescription = "Systolic Blood Pressure";
		} else if (measurement.getType().equals("12")) {
			measurementDescription = "Diastolic Blood Pressure";
		}
		
		RuleMap currentRule = null;
		for (int count = 0; count < DefinedRules.size(); count++) {
			measurementType = measurement.getType();
			String ruleDataType = DefinedRules.get(count).getDataType();
			if (measurementType.equals(ruleDataType)) {
				currentRule = DefinedRules.get(count);
				break;
			}
		}
		
		if (currentRule == null) // Rule not found
			return;
		
		com.aladdin.sc.db.Warning generatedWarning = null;
		
		switch (currentRule.getCallerID()) {
			case LessThanRuleType:
				System.out.println ("LessThanRuleType");
				Calendar currentDate = Calendar.getInstance();
				currentDate.add(Calendar.DATE, -1);
				Calendar oneWeekBefore = (Calendar) Calendar.getInstance();
				oneWeekBefore.add(Calendar.DATE, -8);
	
				System.out.println ("_getPatientMeasurementX");
				List<com.aladdin.sc.db.Measurement> measurements = _getPatientMeasurementX(patientId, oneWeekBefore, currentDate, measurement.getType());
				System.out.println (measurements.size());
	
				if (measurements.size() < 1) {
					return;
				}
	
				Collections.sort(measurements, Date_Order);
				
				generatedWarning = LessThanRule(patientId,
						measurementDescription, measurement.getValue().floatValue(),
						measurements.get(measurements.size() - 1).getValue().floatValue(), currentRule.getUpperLimit(),
						MeasurementAnalysis);
				break;
			case DoubleCompareRuleType:
				System.out.println ("DoubleCompareRuleType");
				generatedWarning = DoubleCompareRule(patientId,
						measurementDescription, measurement.getValue().floatValue(),
						currentRule.getUpperLimit(),
						currentRule.getLowerLimit(), MeasurementAnalysis);
				break;
		}
		
		if (generatedWarning != null) {
			System.out.println ("generated");
			session.save(generatedWarning);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#storeMeasurements(eu.aladdin_project.storagecomponent.StoreMeasurementsDocument)
	 */
	public StoreMeasurementsResponseDocument storeMeasurements (StoreMeasurementsDocument req) {
		StoreMeasurementsResponseDocument respdoc = StoreMeasurementsResponseDocument.Factory.newInstance();
		StoreMeasurementsResponse resp = respdoc.addNewStoreMeasurementsResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getStoreMeasurements().setUserId (nc.check(req.getStoreMeasurements().getUserId(), String.class));
			
			for (int i = 0; i < req.getStoreMeasurements().getDataArray().length; i++) {
				req.getStoreMeasurements().setDataArray(i, nc.check(req.getStoreMeasurements().getDataArray(i), Measurement.class));
			}
		}
		
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
			Measurement[] rm = req.getStoreMeasurements().getDataArray();
			Integer id = 0;
			for (int i = 0; i < rm.length; i++) {
				try {
					session.beginTransaction();
					id = importMeasurement(rm[i], null);
					
    				String sql = "select a.personid from aladdinuser a inner join task t on (t.object = a.id) where t.id = " + new Integer (rm[i].getTaskID()).toString();
					List<?> data = session.createSQLQuery(sql).list();
    				if (data.size() > 0) {
    					analyzeMeasurement(id, (Integer) data.get(0));
    				}
    				
    				session.getTransaction().commit();
				} catch (HibernateException e) {
					try {
	    				if (session.getTransaction().isActive()) session.getTransaction().rollback();
	    			} catch (TransactionException e2) {
					}
	    			e.printStackTrace();
				}
			}
			
			res.setCode(id.toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			e.printStackTrace();
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getPatient(eu.aladdin_project.storagecomponent.GetPatientDocument)
	 */
	public GetPatientResponseDocument getPatient (GetPatientDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetPatientResponseDocument respdoc = GetPatientResponseDocument.Factory.newInstance();
		GetPatientResponse resp = respdoc.addNewGetPatientResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetPatient().setUserId (nc.check(req.getGetPatient().getUserId(), String.class));
			req.getGetPatient().setId (nc.check(req.getGetPatient().getId(), String.class));
		}
		
		if (
				!checkUser(req.getGetPatient().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetPatient().getUserId(), U_CARER) &&
				!checkUser(req.getGetPatient().getUserId(), U_ADMIN)
			) {
			return respdoc;
		}
		
		try {
			
			Integer id = new Integer (req.getGetPatient().getId());
			com.aladdin.sc.db.Patient patient = (com.aladdin.sc.db.Patient) session.load(com.aladdin.sc.db.Patient.class, id);
    		resp.setOut (exportPatient (patient));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deleteCarerAssessment(eu.aladdin_project.storagecomponent.DeleteCarerAssessmentDocument)
	 */
	public DeleteCarerAssessmentResponseDocument deleteCarerAssessment (DeleteCarerAssessmentDocument req) {
		DeleteCarerAssessmentResponseDocument respdoc = DeleteCarerAssessmentResponseDocument.Factory.newInstance();
		DeleteCarerAssessmentResponse resp = respdoc.addNewDeleteCarerAssessmentResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getDeleteCarerAssessment().setUserId (nc.check(req.getDeleteCarerAssessment().getUserId(), String.class));
			req.getDeleteCarerAssessment().setAssessmentId (nc.check(req.getDeleteCarerAssessment().getAssessmentId(), String.class));
		}
		
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
			
			Integer assessmentId = new Integer (req.getDeleteCarerAssessment().getAssessmentId());
			session.beginTransaction();
			session.createSQLQuery("DELETE FROM carerassessment WHERE id = " + assessmentId.toString()).executeUpdate();
			session.getTransaction().commit();
			res.setCode(assessmentId.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getQuestionnaireAnswers(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersDocument)
	 */
	public GetQuestionnaireAnswersResponseDocument getQuestionnaireAnswers (GetQuestionnaireAnswersDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetQuestionnaireAnswersResponseDocument respdoc = GetQuestionnaireAnswersResponseDocument.Factory.newInstance();
		GetQuestionnaireAnswersResponse resp = respdoc.addNewGetQuestionnaireAnswersResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetQuestionnaireAnswers().setUserId (nc.check(req.getGetQuestionnaireAnswers().getUserId(), String.class));
			req.getGetQuestionnaireAnswers().setObjectId (nc.check(req.getGetQuestionnaireAnswers().getObjectId(), String.class));
			req.getGetQuestionnaireAnswers().setFromDate (nc.check(req.getGetQuestionnaireAnswers().getFromDate(), Calendar.class));
			req.getGetQuestionnaireAnswers().setToDate (nc.check(req.getGetQuestionnaireAnswers().getToDate(), Calendar.class));
		}
		
		if (
				!checkUser(req.getGetQuestionnaireAnswers().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetQuestionnaireAnswers().getUserId(), U_ADMIN) &&
				!checkUser(req.getGetQuestionnaireAnswers().getUserId(), U_SERVICE)
			) {
			return respdoc;
		}
		
		try {
			_getQuestionnaireAnswers(req, resp);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}

		return respdoc;
	}

	private void _getQuestionnaireAnswers(GetQuestionnaireAnswersDocument req,
			GetQuestionnaireAnswersResponse resp) {
		Calendar fromDate = req.getGetQuestionnaireAnswers().getFromDate();
		Calendar toDate   = req.getGetQuestionnaireAnswers().getToDate();
		Integer objectId  = new Integer (req.getGetQuestionnaireAnswers().getObjectId());
		
		String sql = "SELECT qa.timestamp, qq.quest, qa.objectid, qa.userid FROM questionnaireanswer qa inner join questionnairequestion qq on (qq.id = qa.question) WHERE qa.objectid = '" + objectId.toString() + "' AND qa.timestamp BETWEEN '" + fromDate.toString() + "' AND '" + toDate.toString () + "' GROUP BY qa.timestamp, qq.quest, qa.objectid, qa.userid";

		Object[] questionids = session.createSQLQuery(sql).list().toArray();
		
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

			Object[] lqa = session.createSQLQuery(sql).list().toArray();
			QuestionnaireAnswers rqas = resp.addNewOut();
			rqas.setDateTime(cal);
			rqas.setObjectID(((Integer)q[2]).toString());
			rqas.setUserID(((Integer)q[3]).toString());
			
			String sqlTask = "SELECT id FROM task WHERE datetimefulfilled = '" + before.getTime().toString() + "'";
			Object[] lt = session.createSQLQuery(sqlTask).list().toArray();
			if (lt.length > 0) {
				rqas.setTaskID(((Integer)lt[0]).toString());
			}
			
		    for (int j = 0; j < lqa.length; j++) {
				QuestionnaireAnswer rqa = rqas.addNewAnswer();
				com.aladdin.sc.db.QuestionnaireAnswer qa = (com.aladdin.sc.db.QuestionnaireAnswer) session.load(com.aladdin.sc.db.QuestionnaireAnswer.class, (Integer)lqa[j]);
				rqa.setQuestionID(qa.getQuestion().toString());
				rqa.setValue(qa.getValue());
				
				rqas.setObjectID(qa.getObjectId().toString());
				rqas.setUserID(qa.getUserId().toString());
				
				com.aladdin.sc.db.QuestionnaireQuestion qq = (com.aladdin.sc.db.QuestionnaireQuestion) session.load (com.aladdin.sc.db.QuestionnaireQuestion.class, qa.getQuestion());
				rqa.setGlobalID(qq.getGlobalId().toString());
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deleteExternalService(eu.aladdin_project.storagecomponent.DeleteExternalServiceDocument)
	 */
	public DeleteExternalServiceResponseDocument deleteExternalService (DeleteExternalServiceDocument req) {
		DeleteExternalServiceResponseDocument respdoc = DeleteExternalServiceResponseDocument.Factory.newInstance();
		DeleteExternalServiceResponse resp = respdoc.addNewDeleteExternalServiceResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getDeleteExternalService().setUserId (nc.check(req.getDeleteExternalService().getUserId(), String.class));
			req.getDeleteExternalService().setId (nc.check(req.getDeleteExternalService().getId(), String.class));
		}
		
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
			session.beginTransaction();
			session.createSQLQuery("DELETE FROM externalservice WHERE id = " + id.toString()).executeUpdate();
			session.getTransaction().commit();
			res.setCode(id.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deleteClinician(eu.aladdin_project.storagecomponent.DeleteClinicianDocument)
	 */
	public DeleteClinicianResponseDocument deleteClinician (DeleteClinicianDocument req) {
		DeleteClinicianResponseDocument respdoc = DeleteClinicianResponseDocument.Factory.newInstance();
		DeleteClinicianResponse resp = respdoc.addNewDeleteClinicianResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getDeleteClinician().setUserId (nc.check(req.getDeleteClinician().getUserId(), String.class));
			req.getDeleteClinician().setId (nc.check(req.getDeleteClinician().getId(), String.class));
		}
		
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
			
			session.beginTransaction();
			
			com.aladdin.sc.db.Clinician p = (com.aladdin.sc.db.Clinician) session.load(com.aladdin.sc.db.Clinician.class, id);
			Integer pd = p.getPersondata();

			session.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM communication WHERE persondata = (SELECT persondata FROM clinician WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM clinician WHERE id = " + id.toString()).executeUpdate();
			session.createSQLQuery("DELETE FROM persondata WHERE id = " + pd.toString()).executeUpdate();
			
			session.getTransaction().commit();
			
			res.setCode(id.toString ());
			res.setStatus((short) 1);
			res.setDescription("ok");
		}  catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("object not found");
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deletePatient(eu.aladdin_project.storagecomponent.DeletePatientDocument)
	 */
	public DeletePatientResponseDocument deletePatient (DeletePatientDocument req) {
		DeletePatientResponseDocument respdoc = DeletePatientResponseDocument.Factory.newInstance();
		DeletePatientResponse resp = respdoc.addNewDeletePatientResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getDeletePatient().setUserId (nc.check(req.getDeletePatient().getUserId(), String.class));
			req.getDeletePatient().setId (nc.check(req.getDeletePatient().getId(), String.class));
		}
		
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
			
			session.beginTransaction();
			
			com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient) session.load(com.aladdin.sc.db.Patient.class, id);
			Integer pd = p.getPersondata();
			Integer sd = p.getSd();
			
			session.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM communication WHERE persondata = (SELECT persondata FROM patient WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM patient WHERE id = " + id.toString()).executeUpdate();
			session.createSQLQuery("DELETE FROM persondata WHERE id = " + pd.toString()).executeUpdate();
			session.createSQLQuery("DELETE FROM sociodemographicdata WHERE id = " + sd.toString()).executeUpdate();

			session.getTransaction().commit();
			
			res.setCode(id.toString ());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("object not found");
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#createQuestionnaire(eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument)
	 */
	public CreateQuestionnaireResponseDocument createQuestionnaire (CreateQuestionnaireDocument req) {
		CreateQuestionnaireResponseDocument respdoc = CreateQuestionnaireResponseDocument.Factory.newInstance();
		CreateQuestionnaireResponse resp = respdoc.addNewCreateQuestionnaireResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getCreateQuestionnaire().setUserId (nc.check(req.getCreateQuestionnaire().getUserId(), String.class));
			req.getCreateQuestionnaire().setData(nc.check(req.getCreateQuestionnaire().getData(), Questionnaire.class));
		}
		
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
			session.beginTransaction();
			
			Questionnaire rq = req.getCreateQuestionnaire().getData();
			rq.setID(null);
			com.aladdin.sc.db.Questionnaire q = importQuestionnaire(rq, req.getCreateQuestionnaire().getLocale());
			
			session.getTransaction().commit();
			
			res.setCode(q.getId().toString ());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error. " + e.toString());
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription(e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getPatientMeasurement(eu.aladdin_project.storagecomponent.GetPatientMeasurementDocument)
	 */
	public GetPatientMeasurementResponseDocument getPatientMeasurement (GetPatientMeasurementDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetPatientMeasurementResponseDocument respdoc = GetPatientMeasurementResponseDocument.Factory.newInstance();
		GetPatientMeasurementResponse resp = respdoc.addNewGetPatientMeasurementResponse();
		
		Calendar _fromDate = req.getGetPatientMeasurement().getFromData();
		Calendar _toDate = req.getGetPatientMeasurement().getToData();
		{
			NullChecker nc = new NullChecker();
			
			req.getGetPatientMeasurement().setUserId (nc.check(req.getGetPatientMeasurement().getUserId(), String.class));
			req.getGetPatientMeasurement().setPatientId (nc.check(req.getGetPatientMeasurement().getPatientId(), String.class));
			req.getGetPatientMeasurement().setFromData (nc.check(_fromDate, Calendar.class));
			req.getGetPatientMeasurement().setToData (nc.check(_toDate, Calendar.class));
		}
		
		if (
				!checkUser(req.getGetPatientMeasurement().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetPatientMeasurement().getUserId(), U_CARER) &&
				!checkUser(req.getGetPatientMeasurement().getUserId(), U_ADMIN) &&
				!checkUser(req.getGetPatientMeasurement().getUserId(), U_SERVICE)
			) {
			return respdoc;
		}
		
		try {
			Integer patientId = new Integer (req.getGetPatientMeasurement().getPatientId()); 
			Integer measurementType = new Integer (req.getGetPatientMeasurement().getMeasurementType());

			session.beginTransaction();
			
			resp.setOutArray((Measurement[]) _getPatientMeasurement(patientId, _fromDate, _toDate, measurementType.toString()).toArray(new Measurement[0]));
			
			session.getTransaction().commit();
			
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	private List<Measurement> _getPatientMeasurement (Integer patientId, Calendar _fromDate, Calendar _toDate, String measurementType) {
		ArrayList<Measurement> export = new ArrayList<Measurement>();
		
		for (com.aladdin.sc.db.Measurement m: _getPatientMeasurementX(patientId, _fromDate, _toDate, measurementType)) {
			export.add(exportMeasurement(m));
		}
		
		return export;
	}
	
	@SuppressWarnings("deprecation")
	private List<com.aladdin.sc.db.Measurement> _getPatientMeasurementX (Integer patientId, Calendar _fromDate, Calendar _toDate, String measurementType) {
		
		String fromDate = _fromDate.toString();
		String toDate = _toDate.toString();
		
		if (fromDate.compareTo(toDate) == 0) {
			Date time = _fromDate.getTime();
			time.setHours(time.getHours() + 23);
			time.setMinutes(time.getMinutes() + 59);
			time.setSeconds(time.getSeconds() + 59);
			toDate = time.toString();
		}  else {
			Date time1 = _toDate.getTime();
			time1.setHours(23);
			time1.setMinutes(59);
			time1.setSeconds(59);
			toDate = time1.toString();
			
			Date time2 = _fromDate.getTime();
			time2.setHours(0);
			time2.setMinutes(0);
			time2.setSeconds(0);
			fromDate = time2.toString();
		}
		
		String sql = "SELECT m.id FROM measurement as m inner join task as t on (t.id = m.task) inner join aladdinuser as u on (u.id = t.object) WHERE u.personid = '" + patientId.toString() + "' AND m.datetime BETWEEN '" + fromDate + "' AND '" + toDate + "' AND m.type = '" + measurementType.toString() + "'";
		System.out.println (sql);
		Object[] ml = session.createSQLQuery(sql).list().toArray();
		
		ArrayList<com.aladdin.sc.db.Measurement> export = new ArrayList<com.aladdin.sc.db.Measurement>();
		for (int i = 0; i < ml.length; i++) {
			Integer id = (Integer)ml[i];
			com.aladdin.sc.db.Measurement m = (com.aladdin.sc.db.Measurement) session.load(com.aladdin.sc.db.Measurement.class, id);
			export.add(m);
		}
		return export;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deleteQuestionnaire(eu.aladdin_project.storagecomponent.DeleteQuestionnaireDocument)
	 */
	public DeleteQuestionnaireResponseDocument deleteQuestionnaire (DeleteQuestionnaireDocument req) {
		DeleteQuestionnaireResponseDocument respdoc = DeleteQuestionnaireResponseDocument.Factory.newInstance();
		DeleteQuestionnaireResponse resp = respdoc.addNewDeleteQuestionnaireResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getDeleteQuestionnaire().setUserId (nc.check(req.getDeleteQuestionnaire().getUserId(), String.class));
			req.getDeleteQuestionnaire().setId (nc.check(req.getDeleteQuestionnaire().getId(), String.class));
		}
		
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
			
			session.beginTransaction();
			Integer id = new Integer (req.getDeleteQuestionnaire().getId());
			Object[] qq = session.createSQLQuery("SELECT id FROM questionnairequestion WHERE quest = " + id.toString()).list().toArray();
			for (int i = 0; i < qq.length; i++) {
				dropQuestionnaireQuestion ((Integer)qq[i]);
			}
			session.createSQLQuery("DELETE FROM questionnaire WHERE id = " + id.toString()).executeUpdate();
			
			session.getTransaction().commit();
			
			res.setCode(id.toString());
			res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#assignTask(eu.aladdin_project.storagecomponent.AssignTaskDocument)
	 */
	public AssignTaskResponseDocument assignTask (AssignTaskDocument req) {
		AssignTaskResponseDocument respdoc = AssignTaskResponseDocument.Factory.newInstance();
		AssignTaskResponse resp = respdoc.addNewAssignTaskResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getAssignTask().setUserId (nc.check(req.getAssignTask().getUserId(), String.class));
			req.getAssignTask().setTask(nc.check(req.getAssignTask().getTask(), Task.class));
		}
		
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
			
			session.beginTransaction();
			
			com.aladdin.sc.db.Task task = importTask(req.getAssignTask().getTask());
			
			session.save (task);
			session.getTransaction().commit();
			
			res.setCode(task.getId().toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();

			res.setCode("-2");
    		res.setDescription("database error ");
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	         
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#listOfAdministrators(eu.aladdin_project.storagecomponent.ListOfAdministratorsDocument)
	 */
	public ListOfAdministratorsResponseDocument listOfAdministrators (ListOfAdministratorsDocument req) {
		trace(Thread.currentThread().getStackTrace());
		ListOfAdministratorsResponseDocument respdoc = ListOfAdministratorsResponseDocument.Factory.newInstance();
		ListOfAdministratorsResponse resp = respdoc.addNewListOfAdministratorsResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getListOfAdministrators().setUserId (nc.check(req.getListOfAdministrators().getUserId(), String.class));
			
			for (int i = 0; i < req.getListOfAdministrators().getFilterArray().length; i++) {
				req.getListOfAdministrators().setFilterArray(i, nc.check(req.getListOfAdministrators().getFilterArray(i), SearchCriteria.class));
			}
		}
		
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
			
			Object[] ql = session.createSQLQuery(sql).list().toArray();
			for (int i = 0; i < ql.length; i++) {
				Integer id = (Integer) ql[i];
				com.aladdin.sc.db.Administrator a = (com.aladdin.sc.db.Administrator)session.load(com.aladdin.sc.db.Administrator.class, id);
				AdministratorInfo ai = resp.addNewOut();
				ai.setID(a.getId().toString());
				ai.setSurname(a.getM_PersonData().getSurname());
				ai.setName(a.getM_PersonData().getName());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getUserPlannedTasks(eu.aladdin_project.storagecomponent.GetUserPlannedTasksDocument)
	 */
	public GetUserPlannedTasksResponseDocument getUserPlannedTasks (GetUserPlannedTasksDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetUserPlannedTasksResponseDocument respdoc = GetUserPlannedTasksResponseDocument.Factory.newInstance();
		GetUserPlannedTasksResponse resp = respdoc.addNewGetUserPlannedTasksResponse();
		
		Calendar _fromDate = req.getGetUserPlannedTasks().getFromDate();
		Calendar _toDate = req.getGetUserPlannedTasks().getToDate();
		{
			NullChecker nc = new NullChecker();
			
			req.getGetUserPlannedTasks().setUserId (nc.check(req.getGetUserPlannedTasks().getUserId(), String.class));
			req.getGetUserPlannedTasks().setRequesterId (nc.check(req.getGetUserPlannedTasks().getRequesterId(), String.class));
			req.getGetUserPlannedTasks().setFromDate (nc.check(_fromDate, Calendar.class));
			req.getGetUserPlannedTasks().setToDate (nc.check(_toDate, Calendar.class));
		}
		
		if (
				!checkUser(req.getGetUserPlannedTasks().getRequesterId(), U_CLINICIAN) &&
				!checkUser(req.getGetUserPlannedTasks().getRequesterId(), U_CARER) &&
				!checkUser(req.getGetUserPlannedTasks().getRequesterId(), U_ADMIN)
			) {
			return respdoc;
		}
		
		try {
			
			Integer userId = new Integer (req.getGetUserPlannedTasks().getUserId());
			
			_fromDate.set(Calendar.HOUR, 0);
			_fromDate.set(Calendar.MINUTE, 0);
			_fromDate.set(Calendar.SECOND, 0);
			
			_toDate.set(Calendar.HOUR, 23);
			_toDate.set(Calendar.MINUTE, 59);
			_toDate.set(Calendar.SECOND, 59);
			
			final Query query = session.createQuery("select t from Task t where DateTimeAssigned between :a and :b and Executor = :e order by DateTimeAssigned");
			query.setCalendar("a", _fromDate);
			query.setCalendar("b", _toDate);
			query.setInteger("e", userId);
			query.setCacheable(true);
			query.setCacheRegion(null);
			
			System.out.println (_fromDate.getTime().toString());
			System.out.println (_toDate.getTime().toString());
			System.out.println (userId);
			
			List<?> tl = query.list();
			
			for (int i = 0; i < tl.size(); i++) {
				
				com.aladdin.sc.db.Task t = (com.aladdin.sc.db.Task) tl.get(i);
				Task rt = resp.addNewOut();
				rt.setID(t.getId().toString());
				SystemParameter taskType = SystemParameter.Factory.newInstance();
				taskType.setCode(t.getTaskType().toString());

				rt.setTaskType(taskType);
				Calendar c1 = Calendar.getInstance();
				c1.setTimeInMillis(t.getDateTimeAssigned().getTime());
				rt.setDateTimeAssigned(c1);
				Calendar c2 = Calendar.getInstance();
				c2.setTimeInMillis(t.getDateTimeFulfilled().getTime());
				rt.setDateTimeFulfilled(c2);
				SystemParameter taskStatus = SystemParameter.Factory.newInstance();
				taskStatus.setCode(t.getTaskStatus().toString());
				
				rt.setTaskStatus(taskStatus);
				rt.setURL(t.getUrl());
				rt.setExecutorID(t.getExecutor().toString());
				rt.setAssignerID(t.getAssigner().toString());
				rt.setObjectID(t.getObject().toString());
				rt.setText(t.getText());
				if (t.getQuestionnaire() != null && t.getQuestionnaire() > 0) {
					rt.setQuestionnaire(exportQuestionnaire(t.getM_Questionnaire(), req.getGetUserPlannedTasks().getLocale()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#createExternalService(eu.aladdin_project.storagecomponent.CreateExternalServiceDocument)
	 */
	public CreateExternalServiceResponseDocument createExternalService (CreateExternalServiceDocument req) {
		CreateExternalServiceResponseDocument respdoc = CreateExternalServiceResponseDocument.Factory.newInstance();
		CreateExternalServiceResponse resp = respdoc.addNewCreateExternalServiceResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getCreateExternalService().setUserId (nc.check(req.getCreateExternalService().getUserId(), String.class));
			req.getCreateExternalService().setData (nc.check(req.getCreateExternalService().getData(), ExternalService.class));
		}
		
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
			
			session.beginTransaction();
			
			ExternalService re = req.getCreateExternalService().getData();
			com.aladdin.sc.db.ExternalService es = new com.aladdin.sc.db.ExternalService();
			
			es.setAddress(re.getAddress());
			es.setDescription(re.getDescription());
			es.setType(re.getType());
			session.save(es);
			
			session.getTransaction().commit();
			
			res.setCode(es.getId().toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#saveCarerAssessment(eu.aladdin_project.storagecomponent.SaveCarerAssessmentDocument)
	 */
	public SaveCarerAssessmentResponseDocument saveCarerAssessment (SaveCarerAssessmentDocument req) {
		SaveCarerAssessmentResponseDocument respdoc = SaveCarerAssessmentResponseDocument.Factory.newInstance();
		SaveCarerAssessmentResponse resp = respdoc.addNewSaveCarerAssessmentResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getSaveCarerAssessment().setUserId (nc.check(req.getSaveCarerAssessment().getUserId(), String.class));
			req.getSaveCarerAssessment().setAssessment (nc.check(req.getSaveCarerAssessment().getAssessment(), CarerAssessment.class));
		}
		
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
			
			session.beginTransaction();
			
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
			
			session.save(ca);
			session.getTransaction().commit();
			
			res.setCode(ca.getId().toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deleteCarer(eu.aladdin_project.storagecomponent.DeleteCarerDocument)
	 */
	public DeleteCarerResponseDocument deleteCarer (DeleteCarerDocument req) {
		DeleteCarerResponseDocument respdoc = DeleteCarerResponseDocument.Factory.newInstance();
		DeleteCarerResponse resp = respdoc.addNewDeleteCarerResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getDeleteCarer().setUserId (nc.check(req.getDeleteCarer().getUserId(), String.class));
			req.getDeleteCarer().setId (nc.check(req.getDeleteCarer().getId(), String.class));
		}
		
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
			
			session.beginTransaction();
			
			com.aladdin.sc.db.Carer p = (com.aladdin.sc.db.Carer) session.load(com.aladdin.sc.db.Carer.class, id);
			Integer pd = p.getPersondata();
			Integer sd = p.getSd();

			session.createSQLQuery("DELETE FROM identifier WHERE persondata = (SELECT persondata FROM carer WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM address WHERE persondata = (SELECT persondata FROM carer WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM communication WHERE persondata = (SELECT persondata FROM carer WHERE id = " + id.toString() + ")").executeUpdate();
			session.createSQLQuery("DELETE FROM carer WHERE id = " + id.toString()).executeUpdate();
			session.createSQLQuery("DELETE FROM persondata WHERE id = " + pd.toString()).executeUpdate();
			session.createSQLQuery("DELETE FROM sociodemographicdata WHERE id = " + sd.toString()).executeUpdate();

			
			session.getTransaction().commit();
			
			res.setCode(id.toString ());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("object not found");
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#createAdministrator(eu.aladdin_project.storagecomponent.CreateAdministratorDocument)
	 */
	public CreateAdministratorResponseDocument createAdministrator (CreateAdministratorDocument req) {
		CreateAdministratorResponseDocument respdoc = CreateAdministratorResponseDocument.Factory.newInstance();
		CreateAdministratorResponse resp = respdoc.addNewCreateAdministratorResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getCreateAdministrator().setUserId (nc.check(req.getCreateAdministrator().getUserId(), String.class));
			req.getCreateAdministrator().setData (nc.check(req.getCreateAdministrator().getData(), Administrator.class));
		}
		
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
			
			session.beginTransaction();
			
			com.aladdin.sc.db.Administrator administrator = new com.aladdin.sc.db.Administrator ();
			
			Integer pdid = importPersondata(data.getPersonData(), null); 
			
			administrator.setPersonData(pdid);
			session.save(administrator);
			
			session.getTransaction().commit();
			
			res.setCode(administrator.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#updateExternalService(eu.aladdin_project.storagecomponent.UpdateExternalServiceDocument)
	 */
	public UpdateExternalServiceResponseDocument updateExternalService (UpdateExternalServiceDocument req) {
		UpdateExternalServiceResponseDocument respdoc = UpdateExternalServiceResponseDocument.Factory.newInstance();
		UpdateExternalServiceResponse resp = respdoc.addNewUpdateExternalServiceResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getUpdateExternalService().setUserId (nc.check(req.getUpdateExternalService().getUserId(), String.class));
			req.getUpdateExternalService().setData (nc.check(req.getUpdateExternalService().getData(), ExternalService.class));
		}
		
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
			
			session.beginTransaction();
			
			ExternalService re = req.getUpdateExternalService().getData();
			Integer id = new Integer (re.getID()); 

			com.aladdin.sc.db.ExternalService es = (com.aladdin.sc.db.ExternalService) session.load(com.aladdin.sc.db.ExternalService.class, id);
			es.setAddress(re.getAddress());
			es.setDescription(re.getDescription());
			es.setType(re.getType());
			session.save(es);
			
			session.getTransaction().commit();
			
			res.setCode(id.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getClinician(eu.aladdin_project.storagecomponent.GetClinicianDocument)
	 */
	public GetClinicianResponseDocument getClinician (GetClinicianDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetClinicianResponseDocument respdoc = GetClinicianResponseDocument.Factory.newInstance();
		GetClinicianResponse resp = respdoc.addNewGetClinicianResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetClinician().setUserId (nc.check(req.getGetClinician().getUserId(), String.class));
			req.getGetClinician().setId (nc.check(req.getGetClinician().getId(), String.class));
		}
		
		if (
				!checkUser(req.getGetClinician().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetClinician().getUserId(), U_ADMIN)
			) {
			return respdoc;
		}
		
		try {
			
			Integer id = new Integer (req.getGetClinician().getId());
			com.aladdin.sc.db.Clinician clinician = (com.aladdin.sc.db.Clinician) session.load(com.aladdin.sc.db.Clinician.class, id);
    		resp.setOut (exportClinician (clinician));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deletePatientAssessment(eu.aladdin_project.storagecomponent.DeletePatientAssessmentDocument)
	 */
	public DeletePatientAssessmentResponseDocument deletePatientAssessment (DeletePatientAssessmentDocument req) {
		DeletePatientAssessmentResponseDocument respdoc = DeletePatientAssessmentResponseDocument.Factory.newInstance();
		DeletePatientAssessmentResponse resp = respdoc.addNewDeletePatientAssessmentResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getDeletePatientAssessment().setUserId (nc.check(req.getDeletePatientAssessment().getUserId(), String.class));
			req.getDeletePatientAssessment().setAssessmentId (nc.check(req.getDeletePatientAssessment().getAssessmentId(), String.class));
		}
		
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
			session.getTransaction().begin();
			
			Integer assessmentId = new Integer (req.getDeletePatientAssessment().getAssessmentId());
			session.createSQLQuery("DELETE FROM measurement WHERE patientassessment = " + assessmentId.toString()).executeUpdate();
			session.createSQLQuery("DELETE FROM patientassessment WHERE id = " + assessmentId.toString()).executeUpdate();
			
			session.getTransaction().commit();
			
			res.setCode(assessmentId.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getAllExternalServices(eu.aladdin_project.storagecomponent.GetAllExternalServicesDocument)
	 */
	public GetAllExternalServicesResponseDocument getAllExternalServices (GetAllExternalServicesDocument getAllExternalServices66) {
		trace(Thread.currentThread().getStackTrace());
		GetAllExternalServicesResponseDocument respdoc = GetAllExternalServicesResponseDocument.Factory.newInstance();
		GetAllExternalServicesResponse resp = respdoc.addNewGetAllExternalServicesResponse();
		
		try {
			
			Object[] esl = session.createQuery("from ExternalService").list().toArray();
			for (int i = 0; i < esl.length; i++) {
				com.aladdin.sc.db.ExternalService es = (com.aladdin.sc.db.ExternalService)esl[i];
				ExternalService re = resp.addNewOut();
				re.setAddress(es.getAddress());
				re.setDescription(es.getDescription());
				re.setID(es.getId().toString());
				re.setType(es.getType());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getCarer(eu.aladdin_project.storagecomponent.GetCarerDocument)
	 */
	public GetCarerResponseDocument getCarer (GetCarerDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetCarerResponseDocument respdoc = GetCarerResponseDocument.Factory.newInstance();
		GetCarerResponse resp = respdoc.addNewGetCarerResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetCarer().setUserId (nc.check(req.getGetCarer().getUserId(), String.class));
			req.getGetCarer().setId (nc.check(req.getGetCarer().getId(), String.class));
		}
		
		if (
				!checkUser(req.getGetCarer().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetCarer().getUserId(), U_ADMIN)
			) {
			return respdoc;
		}
		
		try {
			
			Integer id = new Integer (req.getGetCarer().getId());
    		com.aladdin.sc.db.Carer carer = (com.aladdin.sc.db.Carer) session.load(com.aladdin.sc.db.Carer.class, id);
    		resp.setOut (exportCarer (carer));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getAdministrator(eu.aladdin_project.storagecomponent.GetAdministratorDocument)
	 */
	public GetAdministratorResponseDocument getAdministrator (GetAdministratorDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetAdministratorResponseDocument respdoc = GetAdministratorResponseDocument.Factory.newInstance();
		GetAdministratorResponse resp = respdoc.addNewGetAdministratorResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetAdministrator().setUserId (nc.check(req.getGetAdministrator().getUserId(), String.class));
			req.getGetAdministrator().setId (nc.check(req.getGetAdministrator().getId(), String.class));
		}
		
		if (
				!checkUser(req.getGetAdministrator().getUserId(), U_ADMIN)
			) {
			return respdoc;
		}
		
		try {
			
			Integer id = new Integer (req.getGetAdministrator().getId());
			com.aladdin.sc.db.Administrator administrator = (com.aladdin.sc.db.Administrator) session.load(com.aladdin.sc.db.Administrator.class, id);
    		resp.setOut (exportAdministrator (administrator));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#updateAdministrator(eu.aladdin_project.storagecomponent.UpdateAdministratorDocument)
	 */
	public UpdateAdministratorResponseDocument updateAdministrator (UpdateAdministratorDocument req) {
		UpdateAdministratorResponseDocument respdoc = UpdateAdministratorResponseDocument.Factory.newInstance();
		UpdateAdministratorResponse resp = respdoc.addNewUpdateAdministratorResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getUpdateAdministrator().setUserId (nc.check(req.getUpdateAdministrator().getUserId(), String.class));
			req.getUpdateAdministrator().setData (nc.check(req.getUpdateAdministrator().getData(), Administrator.class));
		}
		
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
			
			session.beginTransaction();
			
			Integer id = new Integer (data.getID());
			com.aladdin.sc.db.Administrator p = (com.aladdin.sc.db.Administrator) session.load (com.aladdin.sc.db.Administrator.class, id);
			importPersondata(data.getPersonData(), p.getPersonData());
			session.update(p);
			session.getTransaction().commit();
			
			res.setCode(p.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getQuestionnaire(eu.aladdin_project.storagecomponent.GetQuestionnaireDocument)
	 */
	public GetQuestionnaireResponseDocument getQuestionnaire (GetQuestionnaireDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetQuestionnaireResponseDocument respdoc = GetQuestionnaireResponseDocument.Factory.newInstance();
		GetQuestionnaireResponse resp = respdoc.addNewGetQuestionnaireResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetQuestionnaire().setId (nc.check(req.getGetQuestionnaire().getId(), String.class));
		}
		
		try {
			
			Integer id = new Integer (req.getGetQuestionnaire().getId());
			com.aladdin.sc.db.Questionnaire q = (com.aladdin.sc.db.Questionnaire) session.load(com.aladdin.sc.db.Questionnaire.class, id);
			final SystemParameter locale = req.getGetQuestionnaire().getLocale();
			resp.setOut(exportQuestionnaire(q, locale));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}

		return respdoc;
	}
	
	// Create Comparator for Sorting questionnaires
	static final Comparator<QuestionnaireAnswers> QDate_Order = new Comparator<QuestionnaireAnswers>() {
		public int compare(QuestionnaireAnswers a, QuestionnaireAnswers b) {
			return a.getDateTime().compareTo(b.getDateTime());
		}
	};
	
	// returns the Global ID group (e.g. 1000, 2000, 3000 etc) based on GlobalID
	String getglobalIDGroup(String globalID) {

		try {
			int globalIDInt = Integer.valueOf(globalID);
			double res = java.lang.Math.floor(globalIDInt / 1000) * 1000;
			return String.valueOf(res);
		} catch (Exception ex) {
			return null;
		}

	}
	
	private QuestionnaireAnswer[] previousAnswerArray;
	
	QuestionnaireAnswer getPreviousQuestionnaireAnswer(String QuestionID) {

		for (int i = 0; i < previousAnswerArray.length; i++) {
			if (previousAnswerArray[i].getQuestionID().equals(QuestionID))
				return previousAnswerArray[i];
		}
		return null;
	}
	
	private String GetAnswerDescription(double globalIDGroupAsDouble,
			double value) {

		if (globalIDGroupAsDouble == 1000 || globalIDGroupAsDouble == 3000) {
			if (value == 0)
				return "YES";
			else if (value == 1)
				return "NO";
		}

		if (globalIDGroupAsDouble == 2000) {

			if (value == 0)
				return "Never";
			else if (value == 1)
				return "Happened but not in the last week";
			else if (value == 2)
				return "1 or 2 times in the last week";
			else if (value == 3)
				return "From 3 to 6 times in the last week";
			else if (value == 4)
				return "Everyday";
		}

		return "";

	}
	
	static com.aladdin.sc.db.Warning GreaterThanRule(Integer patientID, String description,
			double Current, double Previous, double Threshold,
			int TypeOfAnalysis) {
		if (Current >= Previous + Threshold)
			return GenerateWarning(patientID, description, Current,
					Previous, TypeOfAnalysis);
		return null;
	}
	
	// Rule 4 - Category Change Rule
	static com.aladdin.sc.db.Warning CategoryChangeRule(Integer patientID, String description,
			double Current, double Previous, double LowerThreshold,
			double UpperThreshold, int TypeOfAnalysis) {
		if (Previous <= LowerThreshold && Current > UpperThreshold)
			return GenerateWarning(patientID, description, Current,
					Previous, TypeOfAnalysis);
		return null;
	}
	
	private void analyzeQuestionnaires (QuestionnaireAnswer[] currentAnswerArray, Integer ObjectUserID) {
		
		System.out.println ("analyzeQuestionnaires");
		
		com.aladdin.sc.db.Warning generatedWarning = null;
		com.aladdin.sc.db.AladdinUser user = (AladdinUser) session.load(com.aladdin.sc.db.AladdinUser.class, ObjectUserID);
		
		// get all questionnaire answers
		Calendar currentDate = Calendar.getInstance();
		currentDate.add(Calendar.DATE, -1);
		Calendar twoMonthsBefore = Calendar.getInstance();
		twoMonthsBefore.add(Calendar.DATE, -60);
		
		GetQuestionnaireAnswersDocument qDocument = GetQuestionnaireAnswersDocument.Factory.newInstance();
		GetQuestionnaireAnswers getQuestionnaireAnswers = GetQuestionnaireAnswers.Factory.newInstance();
		getQuestionnaireAnswers.setFromDate(twoMonthsBefore);
		getQuestionnaireAnswers.setToDate(currentDate);
		getQuestionnaireAnswers.setObjectId(ObjectUserID.toString());
		getQuestionnaireAnswers.setUserId(null);

		qDocument.addNewGetQuestionnaireAnswers();
		qDocument.setGetQuestionnaireAnswers(getQuestionnaireAnswers);

		GetQuestionnaireAnswersResponseDocument qResponseDocument = GetQuestionnaireAnswersResponseDocument.Factory.newInstance();
		GetQuestionnaireAnswersResponse gQuestAnsResp = qResponseDocument.addNewGetQuestionnaireAnswersResponse();
		
		_getQuestionnaireAnswers(qDocument, gQuestAnsResp);
		//GetQuestionnaireAnswersResponse gQuestAnsResp = qResponseDocument.getGetQuestionnaireAnswersResponse();
		QuestionnaireAnswers[] qanswers = gQuestAnsResp.getOutArray();
		if (qanswers.length == 0) {
			return;
		}
		
		ArrayList<QuestionnaireAnswers> SortedAnswers = new ArrayList<QuestionnaireAnswers>(Arrays.asList(qanswers));
		Collections.sort(SortedAnswers, QDate_Order);
		QuestionnaireAnswers previousQuestionnaireAnswers = SortedAnswers.get(SortedAnswers.size() - 1);
		previousAnswerArray = previousQuestionnaireAnswers.getAnswerArray();
		List<RuleMap> DefinedRules = GetRules();
		
		RuleMap currentRule = null;

		double previousScore = 0;
		double currentScore = 0;
		
		for (int j = 0; j < previousAnswerArray.length; j++) {

			String globalID = previousAnswerArray[j].getGlobalID();
			System.out.println("AAA Reading previous answer GlobalID = "
					+ globalID);
			String globalIDGroup = getglobalIDGroup(globalID);
			double globalIDGroupAsDouble = -1;

			try {
				globalIDGroupAsDouble = Double.valueOf(globalIDGroup);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (globalIDGroupAsDouble == -1)
				continue;

			if (globalIDGroupAsDouble == 4000) {
				double previousScoreAsDouble = Double
						.valueOf(previousAnswerArray[j].getValue());
				previousScore += previousScoreAsDouble;
			}
		}
		
		for (int j = 0; j < currentAnswerArray.length; j++) {

			String globalID = currentAnswerArray[j].getGlobalID();
			System.out.println("AAA Reading current answer GlobalID = "
					+ globalID);
			String globalIDGroup = getglobalIDGroup(globalID);
			double globalIDGroupAsDouble = -1;
			try {
				globalIDGroupAsDouble = Double.valueOf(globalIDGroup);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (globalIDGroupAsDouble == -1)
				continue;

			if (globalIDGroupAsDouble == 4000) {
				double currentScoreAsDouble = Double
						.valueOf(currentAnswerArray[j].getValue());
				currentScore += currentScoreAsDouble;
			}
		}
		
		for (int k = 0; k < currentAnswerArray.length; k++) {

			QuestionnaireAnswer currentAnswer = currentAnswerArray[k];
			QuestionnaireAnswer previousAnswer = getPreviousQuestionnaireAnswer(currentAnswer
					.getQuestionID());

			// For non-existant answers, create a new answer with "Never"
			if (previousAnswer == null) {
				QuestionnaireAnswer neverAnswer = QuestionnaireAnswer.Factory
						.newInstance();
				neverAnswer.setQuestionID(currentAnswer.getQuestionID());
				neverAnswer.setGlobalID(currentAnswer.getGlobalID());
				neverAnswer.setValue("0");
				previousAnswer = neverAnswer;
			}

			String currentValueStr = currentAnswer.getValue();
			System.out
					.println("AAA Reading current value = " + currentValueStr);
			String previousValueStr = previousAnswer.getValue();
			System.out.println("AAA Reading previous value = "
					+ previousValueStr);

			if ("9".equals(currentValueStr) || "9".equals(previousValueStr))
				continue;

			double currentValue;
			double previousValue;

			try {
				currentValue = Double.valueOf(currentValueStr);
				previousValue = Double.valueOf(previousValueStr);
			} catch (Exception ex) {
				continue;
			}

			String globaID = currentAnswer.getGlobalID();

			if (globaID == null || "".equals(globaID))
				continue;

			int globalIDasInteger = Integer.valueOf(globaID);
			if (globalIDasInteger < 1000)
				continue;

			String globalIDGroup = getglobalIDGroup(globaID);
			if (globalIDGroup == null)
				continue;

			double globalIDGroupAsDouble = Double.valueOf(globalIDGroup);
			if (globalIDGroupAsDouble == 4000)
				continue;

			for (int count = 0; count < DefinedRules.size(); count++) {

				String ruleDataType = DefinedRules.get(count).getDataType();
				double ruleDataTypeAsDouble = Double.valueOf(ruleDataType);
				if (globalIDGroupAsDouble == ruleDataTypeAsDouble) {
					currentRule = DefinedRules.get(count);
					break;
				}
			}

			if (currentRule == null) { // Rule not found
				System.out.println ("rule not found");
				return;
			}

			SystemParameter locale = SystemParameter.Factory.newInstance();
			locale.setCode("en_UK");
			
			String questionDescription = getTranslate("questionnairequestion", new Integer (currentAnswer.getQuestionID()), locale, "");
			
			String description = String.format(
					"Question '%s' changed from '%s' to '%s'",
					questionDescription.replaceAll("\n",
							""),
					GetAnswerDescription(globalIDGroupAsDouble, previousValue),
					GetAnswerDescription(globalIDGroupAsDouble, currentValue));

			System.out.println ("currentRule.getCallerID() " + currentRule.getCallerID());
			switch (currentRule.getCallerID()) {
			case GreaterThanRuleType:
				System.out.println ("GreaterThanRuleType");
				generatedWarning = GreaterThanRule(user.getPersonId(), description,
						currentValue, previousValue,
						currentRule.getLowerLimit(), QuestionnaireAnalysis);
				break;
			case LessThanRuleType:
				System.out.println ("LessThanRuleType");
				generatedWarning = LessThanRule(user.getPersonId(), description,
						currentValue, previousValue,
						currentRule.getLowerLimit(), QuestionnaireAnalysis);
				break;
			}

			if (generatedWarning != null) {
				System.out.println ("generatedWarning");
				session.save(generatedWarning);
			}
		}
		
		if (currentScore > 0) {
			System.out.println ("currentScore > 0");

			String description = String.format(
					"Change in Zarit Burden Interview from '%s' to '%s'",
					previousScore, currentScore);

			for (int count = 0; count < DefinedRules.size(); count++) {

				String ruleDataType = DefinedRules.get(count).getDataType();
				double ruleDataTypeAsDouble = Double.valueOf(ruleDataType);
				if (ruleDataTypeAsDouble == 4000) {
					currentRule = DefinedRules.get(count);
					break;
				}
			}

			generatedWarning = CategoryChangeRule(user.getPersonId(), description,
					currentScore, previousScore, currentRule.getLowerLimit(),
					currentRule.getUpperLimit(), QuestionnaireAnalysis);

			if (generatedWarning != null) {
				System.out.println ("generatedWarning");
				session.save(generatedWarning);
			}
		}
		
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#storeQuestionnaireAnswers(eu.aladdin_project.storagecomponent.StoreQuestionnaireAnswersDocument)
	 */
	public StoreQuestionnaireAnswersResponseDocument storeQuestionnaireAnswers (StoreQuestionnaireAnswersDocument req) {
		StoreQuestionnaireAnswersResponseDocument respdoc = StoreQuestionnaireAnswersResponseDocument.Factory.newInstance();
		StoreQuestionnaireAnswersResponse resp = respdoc.addNewStoreQuestionnaireAnswersResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getStoreQuestionnaireAnswers().setUserId (nc.check(req.getStoreQuestionnaireAnswers().getUserId(), String.class));
			req.getStoreQuestionnaireAnswers().setData (nc.check(req.getStoreQuestionnaireAnswers().getData(), QuestionnaireAnswers.class));
		}
		
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
			
			session.beginTransaction();
			
			QuestionnaireAnswers data = req.getStoreQuestionnaireAnswers().getData();
			Timestamp datetime = new Timestamp(Calendar.getInstance().getTimeInMillis());
			//if (data.getDateTime() != null) datetime = new Timestamp(data.getDateTime().getTimeInMillis());
			Integer objectId = new Integer (data.getObjectID());
			Integer userId = new Integer (data.getUserID());
			Integer taskId = new Integer (data.getTaskID());
			
			Integer id = 0;
			QuestionnaireAnswer[] rqal = data.getAnswerArray();
			for (int i = 0; i < rqal.length; i++) {
				com.aladdin.sc.db.QuestionnaireAnswer qa = new com.aladdin.sc.db.QuestionnaireAnswer();
				if (rqal[i].getQuestionID() != null) qa.setQuestion(new Integer (rqal[i].getQuestionID()));
				qa.setValue(rqal[i].getValue());
				qa.setUserId(userId);
				qa.setObjectId(objectId);
				qa.setDateTime(datetime);
				session.save(qa);
				id = qa.getId();
				System.out.println (rqal[i].getValue());
			}
			
			String sql = "UPDATE task SET datetimefulfilled = '" + datetime.toString() + "' WHERE id = " + taskId.toString();
			session.createSQLQuery(sql).executeUpdate();
			
			analyzeQuestionnaires(rqal, objectId);
			
			session.getTransaction().commit();
			
			res.setCode(id.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getPatientAssessments(eu.aladdin_project.storagecomponent.GetPatientAssessmentsDocument)
	 */
	public GetPatientAssessmentsResponseDocument getPatientAssessments (GetPatientAssessmentsDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetPatientAssessmentsResponseDocument respdoc = GetPatientAssessmentsResponseDocument.Factory.newInstance();
		GetPatientAssessmentsResponse resp = respdoc.addNewGetPatientAssessmentsResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetPatientAssessments().setUserId (nc.check(req.getGetPatientAssessments().getUserId(), String.class));
			req.getGetPatientAssessments().setPatientId (nc.check(req.getGetPatientAssessments().getPatientId(), String.class));
		}
		
		if (
				!checkUser(req.getGetPatientAssessments().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetPatientAssessments().getUserId(), U_CARER) &&
				!checkUser(req.getGetPatientAssessments().getUserId(), U_ADMIN)
			) {
			return respdoc;
		}
		
		try {
			
			Integer patientId = new Integer (req.getGetPatientAssessments().getPatientId());
			
			final Query query = session.createQuery("select p from PatientAssessment p where patient = :patient");
			query.setInteger("patient", patientId);
			query.setCacheable(true);
			query.setCacheRegion(null);
			List<?> data = query.list();
			
			for (int i = 0; i < data.size(); i++) {
				com.aladdin.sc.db.PatientAssessment pa = (com.aladdin.sc.db.PatientAssessment) data.get(i);
			
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
    			
    			if (pa.getBlessedScalePart1() != null) rpa.setBlessedScalePart1(pa.getBlessedScalePart1().doubleValue());
    			else rpa.setBlessedScalePart1(0.0);
    			
    			if (pa.getBlessedScalePart2() != null) rpa.setBlessedScalePart2(pa.getBlessedScalePart2().shortValue());
    			else rpa.setBlessedScalePart2((short)0);
    			
    			if (pa.getBlessedScalePart3() != null) rpa.setBlessedScalePart3(pa.getBlessedScalePart3().shortValue());
    			else rpa.setBlessedScalePart3((short)0);
    			
    			if (pa.getChecklistMBPC() != null) rpa.setChecklistMBP(pa.getChecklistMBPC().shortValue());
    			else rpa.setChecklistMBP((short)0);
    			
    			if (pa.getNPQISeverity() != null) rpa.setNPQISeverity(pa.getNPQISeverity().shortValue());
    			else rpa.setNPQISeverity((short)0);
    			
    			if (pa.getNPQIStress() != null) rpa.setNPQIStress(pa.getNPQIStress().shortValue());
    			else rpa.setNPQIStress((short)0);
    			
    			if (pa.getGDS() != null) rpa.setGDS(pa.getGDS().shortValue());
    			else rpa.setGDS((short)0);
    			
    			rpa.setFalls(pa.getFalls());
    			rpa.setIncontinence(pa.getIncontinence());
    			rpa.setDelirium(pa.getDelirium());
    			rpa.setImmobility(pa.getImmobility());
    			rpa.setSensorialDeficits(pa.getSensorialDeficits());
    			rpa.setPharmacologicalTreatment(pa.getPharmacologyTreatment());
    			
    			Object[] ml = pa.getMeasurements().toArray();
    			List<Measurement> rml = new ArrayList<Measurement> ();
    			for (int j = 0; j < ml.length; j++) {
    				rml.add(exportMeasurement( (com.aladdin.sc.db.Measurement) ml[j]));
    			}
    			rpa.setClinicalDataArray((Measurement[]) rml.toArray(new Measurement[0]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getCarerAssessments(eu.aladdin_project.storagecomponent.GetCarerAssessmentsDocument)
	 */
	public GetCarerAssessmentsResponseDocument getCarerAssessments (GetCarerAssessmentsDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetCarerAssessmentsResponseDocument respdoc = GetCarerAssessmentsResponseDocument.Factory.newInstance();
		GetCarerAssessmentsResponse resp = respdoc.addNewGetCarerAssessmentsResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetCarerAssessments().setUserId (nc.check(req.getGetCarerAssessments().getUserId(), String.class));
			req.getGetCarerAssessments().setCarerId (nc.check(req.getGetCarerAssessments().getCarerId(), String.class));
		}
		
		if (
				!checkUser(req.getGetCarerAssessments().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetCarerAssessments().getUserId(), U_ADMIN)
			) {
			return respdoc;
		}
		
		try {
			
			Integer carerId = new Integer (req.getGetCarerAssessments().getCarerId());
			Object[] cal = session.createSQLQuery("SELECT id FROM carerassessment WHERE carer = " + carerId.toString()).list().toArray();
			
			for (int i = 0; i < cal.length; i++) {
				Integer id = (Integer) cal[0];
				com.aladdin.sc.db.CarerAssessment ca = (com.aladdin.sc.db.CarerAssessment) session.load (com.aladdin.sc.db.CarerAssessment.class, id);
				
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
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#changeTaskStatus(eu.aladdin_project.storagecomponent.ChangeTaskStatusDocument)
	 */
	public ChangeTaskStatusResponseDocument changeTaskStatus (ChangeTaskStatusDocument req) {
		ChangeTaskStatusResponseDocument respdoc = ChangeTaskStatusResponseDocument.Factory.newInstance();
		ChangeTaskStatusResponse resp = respdoc.addNewChangeTaskStatusResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getChangeTaskStatus().setUserId (nc.check(req.getChangeTaskStatus().getUserId(), String.class));
		}
		
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
			
			session.beginTransaction();
			session.createSQLQuery("UPDATE task SET taskstatus = '" + status.toString() + "' WHERE id = '" + id.toString() + "'").executeUpdate();
			session.getTransaction().commit();
			
			res.setCode(id.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
			
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#listOfPatients(eu.aladdin_project.storagecomponent.ListOfPatientsDocument)
	 */
	public ListOfPatientsResponseDocument listOfPatients (ListOfPatientsDocument req) {
		trace(Thread.currentThread().getStackTrace());
		ListOfPatientsResponseDocument respdoc = ListOfPatientsResponseDocument.Factory.newInstance();
		ListOfPatientsResponse resp = respdoc.addNewListOfPatientsResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getListOfPatients().setUserId (nc.check(req.getListOfPatients().getUserId(), String.class));
			
			for (int i = 0; i < req.getListOfPatients().getFilterArray().length; i++) {
				req.getListOfPatients().setFilterArray(i, nc.check(req.getListOfPatients().getFilterArray(i), SearchCriteria.class));
			}
		}
		
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
            fl.addAll(java.util.Arrays.asList(com.aladdin.sc.db.Patient.class.getDeclaredFields()));
			
			String sql = "SELECT p.id FROM patient p LEFT JOIN persondata pd ON (pd.id = p.persondata) LEFT JOIN address a ON (a.persondata = pd.id) LEFT JOIN communication c ON (c.persondata = pd.id) LEFT JOIN identifier i ON (i.persondata = pd.id) LEFT JOIN sociodemographicdata sd ON (sd.id = p.sd) WHERE ";
			
			SearchCriteria[] sc = req.getListOfPatients().getFilterArray();
			for (int i = 0; i < sc.length; i++) {
				
				if (sc[i].getFieldName() == null) continue;
				
				for (int j = 0; j < fl.size(); j++) {
					if (fl.get(j).getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
						sql += " AND ";
					}
				}
                if (sc[i].getFieldName ().compareToIgnoreCase("patient.id") == 0) {
                    Integer opnum = new Integer (sc[i].getCompareOp().getCode());
                    sql += String.format(op.get(opnum), "p.id", sc[i].getFieldValue1(), sc[i].getFieldValue2());
                    sql += " AND ";
                }
			}
			sql += " 1=1 GROUP BY p.id, p.persondata, p.clinician, p.sd";

			Object[] ql = session.createSQLQuery(sql).list().toArray();
			for (int i = 0; i < ql.length; i++) {
				Integer id = (Integer) ql[i];
				com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient)session.load(com.aladdin.sc.db.Patient.class, id);
				PatientInfo qi = resp.addNewOut();
				qi.setID(p.getId().toString());
				qi.setSurname(p.getM_PersonData().getSurname());
				qi.setName(p.getM_PersonData().getName());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getWarnings(eu.aladdin_project.storagecomponent.GetWarningsDocument)
	 */
	public GetWarningsResponseDocument getWarnings (GetWarningsDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetWarningsResponseDocument respdoc = GetWarningsResponseDocument.Factory.newInstance();
		GetWarningsResponse resp = respdoc.addNewGetWarningsResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetWarnings().setUserId (nc.check(req.getGetWarnings().getUserId(), String.class));
			
			for (int i = 0; i < req.getGetWarnings().getWarnArray().length; i++) {
				req.getGetWarnings().setWarnArray(i, nc.check(req.getGetWarnings().getWarnArray(i), SearchCriteria.class));
			}
		}
		
		if (
				!checkUser(req.getGetWarnings().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetWarnings().getUserId(), U_ADMIN)
			) {
			return respdoc;
		}
		
		try {
			
			Field[] field = com.aladdin.sc.db.Warning.class.getDeclaredFields();
			String sql = "SELECT warning.id FROM warning inner join patient on (patient.id = warning.patient) WHERE ";
			
			SearchCriteria[] sc = req.getGetWarnings().getWarnArray();
			for (int i = 0; i < sc.length; i++) {
				for (int j = 0; j < field.length; j++) {
					if (field[j].getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
						sql += String.format(op.get(opnum), "warning." + sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
						sql += " AND ";
					}
				}
				if (sc[i].getFieldName().compareToIgnoreCase("patient.id") == 0) {
					Integer opnum = new Integer (sc[i].getCompareOp().getCode());
					sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
					sql += " AND ";
				}
			}
			sql += "1=1";
			
			Object[] list = session.createSQLQuery(sql).list().toArray();
			for (int i = 0; i < list.length; i++) {
				Integer id = (Integer) list[i];
				com.aladdin.sc.db.Warning w = (com.aladdin.sc.db.Warning) session.load(com.aladdin.sc.db.Warning.class, id);
				Warning rw = resp.addNewOut();
				rw.setID(w.getId().toString());
				
				SystemParameter typeOfWarning = SystemParameter.Factory.newInstance();
				typeOfWarning.setCode(w.getTypeOfWarning().toString());
				
				rw.setTypeOfWarning(typeOfWarning);
				Calendar c1 = Calendar.getInstance();
				c1.setTimeInMillis(w.getDateTimeOfWarning().getTime());
				rw.setDateTimeOfWarning(c1);
				
				SystemParameter effect = SystemParameter.Factory.newInstance();
				
				if (w.getEffect() == null) w.setEffect(0);
				
				effect.setCode(w.getEffect().toString());
				
				rw.setEffect(effect);
				
				SystemParameter indicator = SystemParameter.Factory.newInstance();
				if (w.getIndicator() == null) w.setIndicator(0);
				indicator.setCode(w.getIndicator().toString());
				
				rw.setIndicator(indicator);
				
				SystemParameter riskLevel = SystemParameter.Factory.newInstance();
				if (w.getRiskLevel() == null) w.setRiskLevel(0);
				riskLevel.setCode(w.getRiskLevel().toString());
				
				rw.setRiskLevel(riskLevel);
				rw.setJustificationText(w.getJustificationText());
				
				SystemParameter emergencyLevel = SystemParameter.Factory.newInstance();
				if (w.getEmergencyLevel() == null) w.setEmergencyLevel(0);
				emergencyLevel.setCode(w.getEmergencyLevel().toString());
				
				rw.setEmergencyLevel(emergencyLevel);
				rw.setPatient(exportPatient((com.aladdin.sc.db.Patient) session.load(com.aladdin.sc.db.Patient.class, w.getPatient())));
				
				rw.setDelivered(w.getDelivered());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#updateClinician(eu.aladdin_project.storagecomponent.UpdateClinicianDocument)
	 */
	public UpdateClinicianResponseDocument updateClinician (UpdateClinicianDocument req) {
		UpdateClinicianResponseDocument respdoc = UpdateClinicianResponseDocument.Factory.newInstance();
		UpdateClinicianResponse resp = respdoc.addNewUpdateClinicianResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getUpdateClinician().setUserId (nc.check(req.getUpdateClinician().getUserId(), String.class));
			req.getUpdateClinician().setData (nc.check(req.getUpdateClinician().getData(), Clinician.class));
		}
		
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
			
			session.beginTransaction();
			
			Integer id = new Integer (data.getID());
			com.aladdin.sc.db.Clinician p = (com.aladdin.sc.db.Clinician) session.load (com.aladdin.sc.db.Clinician.class, id);
			importPersondata(data.getPersonData(), p.getPersondata());
			session.update(p);
			
			session.getTransaction().commit();
			
			res.setCode(p.getId().toString());
			res.setStatus((short) 1);
			res.setDescription("ok");
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription("database error " + e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#markWarningAsRead(eu.aladdin_project.storagecomponent.MarkWarningAsReadDocument)
	 */
	public MarkWarningAsReadResponseDocument markWarningAsRead (MarkWarningAsReadDocument req) {
		MarkWarningAsReadResponseDocument respdoc = MarkWarningAsReadResponseDocument.Factory.newInstance();
		MarkWarningAsReadResponse resp = respdoc.addNewMarkWarningAsReadResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getMarkWarningAsRead().setUserId (nc.check(req.getMarkWarningAsRead().getUserId(), String.class));
			req.getMarkWarningAsRead().setId (nc.check(req.getMarkWarningAsRead().getId(), String.class));
		}
		
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
			
			session.beginTransaction();
			session.createSQLQuery("UPDATE warning SET delivered = '1' WHERE id = '" + id.toString() + "'").executeUpdate();
			session.getTransaction().commit();
			
			res.setCode(id.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
    /* (non-Javadoc)
     * @see com.aladdin.sc.StorageComponentSkeletonInterface#updateUser(eu.aladdin_project.storagecomponent.UpdateUserDocument)
     */
    public UpdateUserResponseDocument updateUser (UpdateUserDocument req) {
    	UpdateUserResponseDocument respdoc = UpdateUserResponseDocument.Factory.newInstance();
    	UpdateUserResponse resp = respdoc.addNewUpdateUserResponse();
    	OperationResult res = resp.addNewOut();
    	
    	{
			NullChecker nc = new NullChecker();
			
			req.getUpdateUser().setUser (nc.check(req.getUpdateUser().getUser(), User.class));
		}
    	
    	try {
    		
    		checkIP ();
    		
    		session.beginTransaction();
    		
    		User ru = req.getUpdateUser().getUser();
    		if (existUser(ru.getUsername(), new Integer (ru.getID())) == 1) {
    			res.setCode("-2");
        		res.setDescription("user with same username exist");
        		res.setStatus((short) 0);
    		}
    		
    		com.aladdin.sc.db.AladdinUser u = new com.aladdin.sc.db.AladdinUser ();
    		
    		u.setId(new Integer (ru.getID()));
    		u.setType(new Integer (ru.getType().getCode()));
    		u.setPersonId(new Integer (ru.getPersonID()));
    		u.setUsername(ru.getUsername());
    		u.setPassword(ru.getPassword());
    		session.save (u);
    		
    		session.getTransaction().commit();
    		
    		res.setCode(u.getId().toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
    	} catch (HibernateException e) {
    		try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
    		
    		res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
    	
    	return respdoc;
    }
     
    /* (non-Javadoc)
     * @see com.aladdin.sc.StorageComponentSkeletonInterface#deleteUser(eu.aladdin_project.storagecomponent.DeleteUserDocument)
     */
    public DeleteUserResponseDocument deleteUser (DeleteUserDocument req) {
    	DeleteUserResponseDocument respdoc = DeleteUserResponseDocument.Factory.newInstance();
    	DeleteUserResponse resp = respdoc.addNewDeleteUserResponse();
    	OperationResult res = resp.addNewOut();
    	
    	{
			NullChecker nc = new NullChecker();
			
			req.getDeleteUser().setId (nc.check(req.getDeleteUser().getId(), String.class));
		}
    	
    	try {
    		checkIP ();
    		Integer id = new Integer (req.getDeleteUser().getId());
    		
    		session.beginTransaction();
    		session.createSQLQuery("DELETE FROM aladdinuser WHERE id = " + id.toString()).executeUpdate();
    		session.getTransaction().commit();
    		
    		res.setCode(id.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
    	} catch (HibernateException e) {
    		try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
    		
    		res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
    	
    	return respdoc;
    }
    
    private void printIp () {
    	System.out.println ((String) MessageContext.getCurrentMessageContext().getProperty(MessageContext.REMOTE_ADDR));
    }
     
    /* (non-Javadoc)
     * @see com.aladdin.sc.StorageComponentSkeletonInterface#auth(eu.aladdin_project.storagecomponent.AuthDocument)
     */
    public AuthResponseDocument auth (AuthDocument req) {
    	
    	printIp ();
    	
    	AuthResponseDocument respdoc = AuthResponseDocument.Factory.newInstance();
    	AuthResponse resp = respdoc.addNewAuthResponse();
    	OperationResult res = resp.addNewOut();
    	
    	{
			NullChecker nc = new NullChecker();
			
			req.getAuth().setLogin (nc.check(req.getAuth().getLogin(), String.class));
			req.getAuth().setPassword (nc.check(req.getAuth().getPassword(), String.class));
		}
    	
    	String sql = "";
    	
    	try {
    		
    		String username = req.getAuth().getLogin();
    		String password = req.getAuth().getPassword();
    		
    		sql = "SELECT id FROM aladdinuser WHERE username = '" + username + "' AND password = '" + password + "'";
    		SQLQuery q = session.createSQLQuery(sql);
    		if (q.list().size() == 1) {
    			res.setCode(q.list().get(0).toString());
    			res.setDescription("ok");
    			res.setStatus((short) 1);
    		} else {
    			res.setCode("0");
    			res.setDescription("none");
    			res.setStatus((short) 0);
    		}
    	} catch (HibernateException e) {
    		e.printStackTrace();

    		res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
    	
    	return respdoc;
    }
     
    /* (non-Javadoc)
     * @see com.aladdin.sc.StorageComponentSkeletonInterface#changePassword(eu.aladdin_project.storagecomponent.ChangePasswordDocument)
     */
    public ChangePasswordResponseDocument changePassword (ChangePasswordDocument req) {
    	ChangePasswordResponseDocument respdoc = ChangePasswordResponseDocument.Factory.newInstance();
    	ChangePasswordResponse resp = respdoc.addNewChangePasswordResponse();
    	OperationResult res = resp.addNewOut();
    	
    	{
			NullChecker nc = new NullChecker();
			
			req.getChangePassword().setUserId (nc.check(req.getChangePassword().getUserId(), String.class));
			req.getChangePassword().setPassword (nc.check(req.getChangePassword().getPassword(), String.class));
		}
    	
    	try {
    		
    		checkIP ();
    		
    		Integer id = new Integer (req.getChangePassword().getUserId());
    		String password = req.getChangePassword().getPassword();
    		
    		session.beginTransaction();
    		session.createSQLQuery("UPDATE aladdinuser SET password = '" + password + "' WHERE id = '" + id.toString() + "'").executeUpdate();
    		
    		com.aladdin.sc.db.AladdinUser u = (com.aladdin.sc.db.AladdinUser) session.load(com.aladdin.sc.db.AladdinUser.class, id);
    		
    		String url = forumSC + "?action=password&password=" + password + "&username=" + u.getUsername();
    		
    		System.out.println (url);
    		
    		getURLChar(url);
    		
    		session.getTransaction().commit();
    		
    		res.setCode(id.toString());
			res.setDescription("ok");
			res.setStatus((short) 1);
    	} catch (HibernateException e) {
    		try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
    		
    		res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
    	
    	return respdoc;
    }
    
    /* (non-Javadoc)
     * @see com.aladdin.sc.StorageComponentSkeletonInterface#createUser(eu.aladdin_project.storagecomponent.CreateUserDocument)
     */
    public CreateUserResponseDocument createUser (CreateUserDocument req) {
    	CreateUserResponseDocument respdoc = CreateUserResponseDocument.Factory.newInstance();
    	CreateUserResponse resp = respdoc.addNewCreateUserResponse();
    	OperationResult res = resp.addNewOut();
    	
    	{
			NullChecker nc = new NullChecker();
			
			req.getCreateUser().setUser (nc.check(req.getCreateUser().getUser(), User.class));
		}
    	
    	try {
    		
    		checkIP ();
    		
            User ru = req.getCreateUser().getUser();

    		String url = forumSC + "?none=1&password=***&type=***&username=" + ru.getUsername();
    		
    		if (getURLChar(url) == '0') {
                throw new Exception ("The User with same name exists in Forum");
    		}

    		session.beginTransaction();
    		
    		if (existUser(ru.getUsername(), 0) == 1) {
    			res.setCode("-2");
        		res.setDescription("user with same username exist");
        		res.setStatus((short) 0);
    		}
    		
    		com.aladdin.sc.db.AladdinUser u = new com.aladdin.sc.db.AladdinUser ();
    		
    		u.setType(new Integer (ru.getType().getCode()));
    		u.setPersonId(new Integer (ru.getPersonID()));
    		u.setUsername(ru.getUsername());
    		u.setPassword(ru.getPassword());
    		session.save (u);
    		
    		url = forumSC + "?username=" + ru.getUsername() + "&password=" + ru.getPassword() + "&type=" + ru.getType().getCode();
    		
    		char urlChar = getURLChar(url);
    		System.out.println (urlChar);
    		if (urlChar == '0') {
    			throw new Exception ("Can't create user in forum!");
    		}
    		
    		session.getTransaction().commit();
    		
    		res.setCode(u.getId().toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
    	} catch (HibernateException e) {
    		try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
    		
    		res.setCode("-2");
    		res.setDescription("database error " + e.toString());
    		res.setStatus((short) 0);
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
    		
    		res.setCode("-2");
    		res.setDescription("forum error " + e.toString());
    		res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
    	return respdoc;
    }
    
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getUserType(eu.aladdin_project.storagecomponent.GetUserTypeDocument)
	 */
	public GetUserTypeResponseDocument getUserType (GetUserTypeDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetUserTypeResponseDocument respdoc = GetUserTypeResponseDocument.Factory.newInstance();
		GetUserTypeResponse resp = respdoc.addNewGetUserTypeResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetUserType().setId (nc.check(req.getGetUserType().getId(), String.class));
		}
			 
		try {
			checkIP ();
			Integer id = new Integer (req.getGetUserType().getId());
			String sql = "SELECT type FROM aladdinuser WHERE id = '" + id.toString() + "'";
    		SQLQuery q = session.createSQLQuery(sql);
    		if (q.list().size() == 1) {
    			res.setCode(q.list().get(0).toString());
    			res.setDescription("ok");
    			res.setStatus((short) 1);
    		} else {
    			res.setCode("0");
    			res.setDescription("none");
    			res.setStatus((short) 0);
    		}
		} catch (HibernateException e) {
			e.printStackTrace();
			
			res.setCode("-2");
			res.setDescription("database error " + e.toString());
			res.setStatus((short) 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
			 
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getSystemParameterList(eu.aladdin_project.storagecomponent.GetSystemParameterListDocument)
	 */
	public GetSystemParameterListResponseDocument getSystemParameterList (GetSystemParameterListDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetSystemParameterListResponseDocument respdoc = GetSystemParameterListResponseDocument.Factory.newInstance();
		GetSystemParameterListResponse resp = respdoc.addNewGetSystemParameterListResponse();
		
		try {
			
			Integer type = new Integer (req.getGetSystemParameterList().getType());
			SystemParameter locale = req.getGetSystemParameterList().getLocale();
			if (locale == null) locale = SystemParameter.Factory.newInstance();
			if (locale.getCode() == null || locale.getCode() == "") locale.setCode("en_US");
			
			String sql = "SELECT code, description FROM dict as d INNER JOIN locale as l ON (l.id = d.locale) WHERE d.type = '" + type.toString() + "' AND l.name = '" + locale.getCode() + "'";
			Object[] ret = session.createSQLQuery(sql).list().toArray();
			
			for (int i = 0; i < ret.length; i++) {
				Object[] obj = (Object[]) ret[i];
				SystemParameter sp = resp.addNewOut();
				sp.setCode(obj[0].toString());
				sp.setDescription(obj[1].toString());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
    }
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#updateSystemParameter(eu.aladdin_project.storagecomponent.UpdateSystemParameterDocument)
	 */
	public UpdateSystemParameterResponseDocument updateSystemParameter (UpdateSystemParameterDocument req) {
		UpdateSystemParameterResponseDocument respdoc = UpdateSystemParameterResponseDocument.Factory.newInstance();
		UpdateSystemParameterResponse resp = respdoc.addNewUpdateSystemParameterResponse();
		OperationResult res = resp.addNewOut();
		
		try {
			session.beginTransaction();
			
			Integer localeid = getLocaleId(req.getUpdateSystemParameter().getLocale());
			Integer type = req.getUpdateSystemParameter().getType();
			SystemParameter value = req.getUpdateSystemParameter().getValue();

			if (
					value == null ||
					value.getCode() == null ||
					value.getCode() == "" ||
					value.getDescription() == null ||
					value.getDescription() == "" ||
					type == 0
			) throw new Exception("null");
			
			String sql = "SELECT id FROM dict WHERE code = '" + value.getCode() + "' AND description LIKE '" + value.getDescription() + "' AND type = '" + type.toString() + "' AND locale = '" + localeid.toString() + "'";
			Object[] exist = session.createSQLQuery(sql).list().toArray();
			
			com.aladdin.sc.db.Dict dict;
			
			if (exist.length == 1) {
				Integer id = (Integer)((Object[])exist[0])[0];
				dict = (com.aladdin.sc.db.Dict) session.load(com.aladdin.sc.db.Dict.class, id);
			} else dict = new com.aladdin.sc.db.Dict();
			
			dict.setCode(value.getCode());
			dict.setDescription(value.getDescription());
			dict.setLocale(localeid);
			dict.setType(type);
			
			session.saveOrUpdate(dict);
			
			res.setCode(dict.getId().toString());
			res.setDescription("ok");
			res.setStatus((short)1);
			
			session.getTransaction().commit();
			
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setDescription("database error " + e.toString());
			res.setStatus((short)0);
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setDescription("data not valid");
			res.setStatus((short)0);
		} finally {
			_finally();
		}
		
		return respdoc;
    }
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getUser(eu.aladdin_project.storagecomponent.GetUserDocument)
	 */
	public GetUserResponseDocument getUser (GetUserDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetUserResponseDocument respdoc = GetUserResponseDocument.Factory.newInstance();
		GetUserResponse resp = respdoc.addNewGetUserResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetUser().setId (nc.check(req.getGetUser().getId(), String.class));
		}
		
		try {
			Integer id = new Integer (req.getGetUser().getId());
			com.aladdin.sc.db.AladdinUser user = (com.aladdin.sc.db.AladdinUser) session.load(com.aladdin.sc.db.AladdinUser.class, id);
			
			User ru = resp.addNewOut();
			ru.setID(user.getId().toString());
			ru.setPassword("");
			ru.setPersonID(user.getPersonId().toString());
			SystemParameter spType = SystemParameter.Factory.newInstance();
			spType.setCode(user.getType().toString());
			ru.setType(spType);
			ru.setUsername(user.getUsername());
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
    }
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getPatientsForCaregiver(eu.aladdin_project.storagecomponent.GetPatientsForCaregiverDocument)
	 */
	public GetPatientsForCaregiverResponseDocument getPatientsForCaregiver (GetPatientsForCaregiverDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetPatientsForCaregiverResponseDocument respdoc = GetPatientsForCaregiverResponseDocument.Factory.newInstance();
		GetPatientsForCaregiverResponse resp = respdoc.addNewGetPatientsForCaregiverResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetPatientsForCaregiver().setUserId (nc.check(req.getGetPatientsForCaregiver().getUserId(), String.class));
		}
		
		if (
				!checkUser(req.getGetPatientsForCaregiver().getUserId(), U_CARER)
			) {
			return respdoc;
		}
		
		try {
			Integer uid = new Integer (req.getGetPatientsForCaregiver().getUserId());
			String sql = "SELECT personid FROM aladdinuser WHERE id = '" + uid.toString() + "' AND type = '3'";
    		SQLQuery q = session.createSQLQuery(sql);
    		if (q.list().size() == 1) {
    			sql = "SELECT id FROM patient WHERE carer = '" + q.list().get(0).toString() + "'";
    			
    			Object[] ql = session.createSQLQuery(sql).list().toArray();
    			for (int i = 0; i < ql.length; i++) {
    				Integer id = (Integer) ql[i];
    				com.aladdin.sc.db.Patient p = (com.aladdin.sc.db.Patient)session.load(com.aladdin.sc.db.Patient.class, id);
    				PatientInfo qi = resp.addNewOut();
    				qi.setID(p.getId().toString());
    				qi.setSurname(p.getM_PersonData().getSurname());
    				qi.setName(p.getM_PersonData().getName());
    			}
    		}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
    }
    
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#listOfPossibleTasks(eu.aladdin_project.storagecomponent.ListOfPossibleTasksDocument)
	 */
	public ListOfPossibleTasksResponseDocument listOfPossibleTasks (ListOfPossibleTasksDocument listOfPossibleTasks48) {
		trace(Thread.currentThread().getStackTrace());
		ListOfPossibleTasksResponseDocument respdoc = ListOfPossibleTasksResponseDocument.Factory.newInstance();
		ListOfPossibleTasksResponse resp = respdoc.addNewListOfPossibleTasksResponse();
		
		for (Integer i = 1; i < getTaskTypesCount() + 1; i++) {
			SystemParameter pt = resp.addNewOut();
    		pt.setCode(i.toString());
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getUserIdByPersonId(eu.aladdin_project.storagecomponent.GetUserIdByPersonIdDocument)
	 */
	public GetUserIdByPersonIdResponseDocument getUserIdByPersonId (GetUserIdByPersonIdDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetUserIdByPersonIdResponseDocument respdoc = GetUserIdByPersonIdResponseDocument.Factory.newInstance();
		GetUserIdByPersonIdResponse resp = respdoc.addNewGetUserIdByPersonIdResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetUserIdByPersonId().setId (nc.check(req.getGetUserIdByPersonId().getId(), String.class));
			req.getGetUserIdByPersonId().setUserId (nc.check(req.getGetUserIdByPersonId().getUserId(), String.class));
		}
		
		if (
				!checkUser(req.getGetUserIdByPersonId().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetUserIdByPersonId().getUserId(), U_ADMIN) &&
				!checkUser(req.getGetUserIdByPersonId().getUserId(), U_CARER) &&
				!checkUser(req.getGetUserIdByPersonId().getUserId(), U_SERVICE)
			) {
			return respdoc;
		}
		
		try {
			
			Integer uid = new Integer (req.getGetUserIdByPersonId().getId());
			Integer type = req.getGetUserIdByPersonId().getType();
			
			String sql = "SELECT id FROM aladdinuser WHERE personid = '" + uid.toString() + "' AND type = '" + type.toString() + "'";
			SQLQuery q = session.createSQLQuery(sql);
			Object[] obj = q.list().toArray();
			if (obj.length == 1) {
				res.setCode(obj[0].toString());
				res.setStatus((short)1);
				res.setDescription("ok");
			} else {
				res.setCode("0");
    			res.setDescription("none");
    			res.setStatus((short) 0);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
			
			res.setCode("-2");
			res.setDescription("database error " + e.toString());
			res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#removeTaskMassively(eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument)
	 */
	public RemoveTaskMassivelyResponseDocument removeTaskMassively (RemoveTaskMassivelyDocument req) {
		RemoveTaskMassivelyResponseDocument respdoc = RemoveTaskMassivelyResponseDocument.Factory.newInstance();
		RemoveTaskMassivelyResponse resp = respdoc.addNewRemoveTaskMassivelyResponse();
		OperationResult res = resp.addNewOut();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getRemoveTaskMassively().setPatientId(nc.check(req.getRemoveTaskMassively().getPatientId(), String.class));
			req.getRemoveTaskMassively().setUserId(nc.check(req.getRemoveTaskMassively().getUserId(), String.class));
		}
		
		if (
				!checkUser(req.getRemoveTaskMassively().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getRemoveTaskMassively().getUserId(), U_ADMIN) &&
				!checkUser(req.getRemoveTaskMassively().getUserId(), U_CARER)
			) {
			return respdoc;
		}
		
		try {
			Calendar startDate = req.getRemoveTaskMassively().getStartDate();
			Calendar endDate = req.getRemoveTaskMassively().getEndDate();
			BigInteger typeOfTask = req.getRemoveTaskMassively().getTypeOfTask();
			Integer patientId = new Integer (req.getRemoveTaskMassively().getPatientId());
			
			String sql = "DELETE FROM task WHERE datetimeassigned >= '" + startDate.toString() + "' AND datetimeassigned <= '" + endDate.toString() + "' AND tasktype = '" + typeOfTask.toString() + "' AND object = '" + patientId.toString() + "' AND taskstatus != 3";
    		
			session.beginTransaction();
			session.createSQLQuery(sql).executeUpdate();
			session.getTransaction().commit();
			
			res.setCode("0");
			res.setStatus((short)1);
			res.setDescription("ok");
			
		} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setDescription("database error " + e.toString());
			res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
    /* (non-Javadoc)
     * @see com.aladdin.sc.StorageComponentSkeletonInterface#assignTasksMassively(eu.aladdin_project.storagecomponent.AssignTasksMassivelyDocument)
     */
    public AssignTasksMassivelyResponseDocument assignTasksMassively (AssignTasksMassivelyDocument req) {
    	AssignTasksMassivelyResponseDocument respdoc = AssignTasksMassivelyResponseDocument.Factory.newInstance();
    	AssignTasksMassivelyResponse resp = respdoc.addNewAssignTasksMassivelyResponse();
    	OperationResult res = resp.addNewOut();
    	
    	{
			NullChecker nc = new NullChecker();
			
			req.getAssignTasksMassively().setUserId(nc.check(req.getAssignTasksMassively().getUserId(), String.class));
		}
    	
    	if (
				!checkUser(req.getAssignTasksMassively().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getAssignTasksMassively().getUserId(), U_ADMIN) &&
				!checkUser(req.getAssignTasksMassively().getUserId(), U_CARER)
			) {
			return respdoc;
		}
    	
    	try {
    		Calendar startDate = req.getAssignTasksMassively().getStartDate();
			Calendar endDate = req.getAssignTasksMassively().getEndDate();
			int frequency = req.getAssignTasksMassively().getFrequency().intValue();
			Task rtask = req.getAssignTasksMassively().getTask();
			
			session.beginTransaction();
			
			while (startDate.compareTo(endDate) < 0) {
				rtask.setDateTimeAssigned(startDate);
				com.aladdin.sc.db.Task task = importTask(rtask);
    			session.save (task);
				startDate.add(Calendar.DAY_OF_YEAR, frequency);
			}
			
			session.getTransaction().commit();
			
			res.setCode("0");
			res.setStatus((short)1);
			res.setDescription("ok");
    		
    	} catch (HibernateException e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setDescription("database error " + e.toString());
			res.setStatus((short) 0);
		} finally {
			_finally();
		}
    	
    	return respdoc;
    }

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getMeasurement(eu.aladdin_project.storagecomponent.GetMeasurementDocument)
	 */
	public GetMeasurementResponseDocument getMeasurement(GetMeasurementDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetMeasurementResponseDocument respdoc = GetMeasurementResponseDocument.Factory.newInstance();
		GetMeasurementResponse resp = respdoc.addNewGetMeasurementResponse();
		
		String userId = req.getGetMeasurement().getUserId();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetMeasurement().setUserId (nc.check(userId, String.class));
			
			for (int i = 0; i < req.getGetMeasurement().getFilterArray().length; i++) {
				req.getGetMeasurement().setFilterArray(i, nc.check(req.getGetMeasurement().getFilterArray(i), SearchCriteria.class));
			}
		}
		
		if (
				!checkUser(userId, U_CLINICIAN) &&
				!checkUser(userId, U_CARER) &&
				!checkUser(userId, U_ADMIN) &&
				!checkUser(userId, U_SERVICE)
			) {
			return respdoc;
		}
		
		try {
			
			Field[] field = com.aladdin.sc.db.Measurement.class.getDeclaredFields();
			String sql = "SELECT id FROM measurement WHERE ";
			
			SearchCriteria[] sc = req.getGetMeasurement().getFilterArray();
			for (int i = 0; i < sc.length; i++) {
				for (int j = 0; j < field.length; j++) {
					if (field[j].getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
						sql += " AND ";
					}
				}
			}
			
			sql += "1 = 1";
			
			Object[] list = session.createSQLQuery(sql).list().toArray();
			List<Measurement> ml = new ArrayList<Measurement>();
			for (int i = 0; i < list.length; i++) {
				Integer id = (Integer) list[i];
				com.aladdin.sc.db.Measurement m = (com.aladdin.sc.db.Measurement) session.load(com.aladdin.sc.db.Measurement.class, id);
				ml.add(exportMeasurement(m));
			}
			resp.setOutArray((Measurement[]) ml.toArray(new Measurement[0]));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getTask(eu.aladdin_project.storagecomponent.GetTaskDocument)
	 */
	public GetTaskResponseDocument getTask(GetTaskDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetTaskResponseDocument respdoc = GetTaskResponseDocument.Factory.newInstance();
		GetTaskResponse resp = respdoc.addNewGetTaskResponse();
		Task out = resp.addNewOut();
		
		String userId = req.getGetTask().getUserId();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetTask().setUserId(nc.check(req.getGetTask().getUserId(), String.class));
		}
		
		userId = req.getGetTask().getUserId();
		
		if (
				!checkUser(userId, U_CLINICIAN) &&
				!checkUser(userId, U_ADMIN) &&
				!checkUser(userId, U_CARER)
			) {
			return respdoc;
		}
		
		try {
			String id = req.getGetTask().getId();
			
			com.aladdin.sc.db.Task dbTask = (com.aladdin.sc.db.Task) session.load(com.aladdin.sc.db.Task.class, new Integer (id));
			
			out.setID(dbTask.getId().toString());
			
			SystemParameter taskStatus = SystemParameter.Factory.newInstance();
			taskStatus.setCode(dbTask.getTaskStatus().toString());
			out.setTaskStatus(taskStatus);
			
			SystemParameter taskType = SystemParameter.Factory.newInstance();
			taskType.setCode(dbTask.getTaskType().toString());
			out.setTaskType(taskType);
			
			Calendar c1 = Calendar.getInstance();
			c1.setTimeInMillis(dbTask.getDateTimeAssigned().getTime());
			out.setDateTimeAssigned(c1);
			
			Calendar c2 = Calendar.getInstance();
			c2.setTimeInMillis(dbTask.getDateTimeFulfilled().getTime());
			out.setDateTimeFulfilled(c2);
			
			out.setTaskStatus(taskStatus);
			out.setURL(dbTask.getUrl());
			out.setExecutorID(dbTask.getExecutor().toString());
			out.setAssignerID(dbTask.getAssigner().toString());
			out.setObjectID(dbTask.getObject().toString());
			out.setText(dbTask.getText());
			if (dbTask.getQuestionnaire() != null && dbTask.getQuestionnaire() > 0) {
				out.setQuestionnaire(exportQuestionnaire(dbTask.getM_Questionnaire(), req.getGetTask().getLocale()));
			}
			
    	} catch (HibernateException e) {
    		e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getMediaContent(eu.aladdin_project.storagecomponent.GetMediaContentDocument)
	 */
	public GetMediaContentResponseDocument getMediaContent(GetMediaContentDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetMediaContentResponseDocument respdoc = GetMediaContentResponseDocument.Factory.newInstance();
		GetMediaContentResponse resp = respdoc.addNewGetMediaContentResponse();
		
		try {
			
			Field[] field = com.aladdin.sc.db.EntertainmentContent.class.getDeclaredFields();
			String sql = "SELECT id FROM entertainmentcontent WHERE ";
			
			SearchCriteria[] sc = req.getGetMediaContent().getFilterArray();
			for (int i = 0; i < sc.length; i++) {
				for (int j = 0; j < field.length; j++) {
					if (field[j].getName().compareToIgnoreCase(sc[i].getFieldName()) == 0) {
						Integer opnum = new Integer (sc[i].getCompareOp().getCode());
						sql += String.format(op.get(opnum), sc[i].getFieldName(), sc[i].getFieldValue1(), sc[i].getFieldValue2());
						sql += " AND ";
					}
				}
			}
			
			sql += "1 = 1";
			
			Object[] list = session.createSQLQuery(sql).list().toArray();
			for (int i = 0; i < list.length; i++) {
				Integer id = (Integer) list[i];
				com.aladdin.sc.db.EntertainmentContent ec = (com.aladdin.sc.db.EntertainmentContent) session.load(com.aladdin.sc.db.EntertainmentContent.class, id);
				MediaContent out = resp.addNewOut();
				
				out.setID(ec.getId().toString());
				out.setCategory(ec.getCategory());
				out.setText(ec.getText());
				out.setTitle(ec.getTitle());
				out.setType(ec.getType());
				out.setUrl(ec.getUrl());
				out.setEnabled(ec.getEnabled());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#addMediaContent(eu.aladdin_project.storagecomponent.AddMediaContentDocument)
	 */
	public AddMediaContentResponseDocument addMediaContent(AddMediaContentDocument req) {
		AddMediaContentResponseDocument respdoc = AddMediaContentResponseDocument.Factory.newInstance();
		AddMediaContentResponse resp = respdoc.addNewAddMediaContentResponse();
		
		OperationResult res = resp.addNewOut();
		
		try {
			
			session.beginTransaction();
			
			Integer savedId = importMediaContent(req.getAddMediaContent().getIn(), null);
			
			session.getTransaction().commit();
			
			res.setCode(savedId.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setStatus((short) 0);
			res.setDescription(e.toString());
		} finally {
			_finally();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#deleteMediaContent(eu.aladdin_project.storagecomponent.DeleteMediaContentDocument)
	 */
	public DeleteMediaContentResponseDocument deleteMediaContent(DeleteMediaContentDocument req) {
		DeleteMediaContentResponseDocument respdoc = DeleteMediaContentResponseDocument.Factory.newInstance();
		DeleteMediaContentResponse resp = respdoc.addNewDeleteMediaContentResponse();
		
		OperationResult res = resp.addNewOut();
		
		try {
			
			Integer id = new Integer (req.getDeleteMediaContent().getId());
			session.beginTransaction();
			session.createSQLQuery("DELETE FROM entertainmentcontent WHERE id = " + id.toString()).executeUpdate();
			session.getTransaction().commit();
			res.setCode(id.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setDescription("database error " + e.toString());
			res.setStatus((short) 0);
		} finally {
			_finally ();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#updateMediaContent(eu.aladdin_project.storagecomponent.UpdateMediaContentDocument)
	 */
	public UpdateMediaContentResponseDocument updateMediaContent(UpdateMediaContentDocument req) {
		UpdateMediaContentResponseDocument respdoc = UpdateMediaContentResponseDocument.Factory.newInstance();
		UpdateMediaContentResponse resp = respdoc.addNewUpdateMediaContentResponse();
		
		OperationResult res = resp.addNewOut();
		
		try {
			
			session.beginTransaction();
			
			final MediaContent rEC = req.getUpdateMediaContent().getEc();
			Integer savedId = importMediaContent(rEC, new Integer (rEC.getID()));
			
			session.getTransaction().commit();
			
			res.setCode(savedId.toString());
    		res.setDescription("ok");
    		res.setStatus((short) 1);
		} catch (Exception e) {
			try {
				if (session.getTransaction().isActive()) session.getTransaction().rollback();
			} catch (TransactionException e2) {
			}
			
			e.printStackTrace();
			
			res.setCode("-2");
			res.setDescription("database error " + e.toString());
			res.setStatus((short) 0);
		} finally {
			_finally();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getQuestionnaireAnswersByTask(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswersByTaskDocument)
	 */
	public GetQuestionnaireAnswersByTaskResponseDocument getQuestionnaireAnswersByTask(GetQuestionnaireAnswersByTaskDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetQuestionnaireAnswersByTaskResponseDocument respdoc = GetQuestionnaireAnswersByTaskResponseDocument.Factory.newInstance();
		GetQuestionnaireAnswersByTaskResponse resp = respdoc.addNewGetQuestionnaireAnswersByTaskResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetQuestionnaireAnswersByTask().setUserId (nc.check(req.getGetQuestionnaireAnswersByTask().getUserId(), String.class));
			req.getGetQuestionnaireAnswersByTask().setTaskId (nc.check(req.getGetQuestionnaireAnswersByTask().getTaskId(), String.class));
		}
		
		if (
				!checkUser(req.getGetQuestionnaireAnswersByTask().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetQuestionnaireAnswersByTask().getUserId(), U_ADMIN) &&
				!checkUser(req.getGetQuestionnaireAnswersByTask().getUserId(), U_SERVICE)
			) {
			return respdoc;
		}
		
		try {
			
			Integer taskId = new Integer (req.getGetQuestionnaireAnswersByTask().getTaskId());
			com.aladdin.sc.db.Task task = (com.aladdin.sc.db.Task) session.load(com.aladdin.sc.db.Task.class, taskId);
			
			String sql = "SELECT id FROM questionnaireanswer WHERE ";
			sql += "timestamp = '" + task.getDateTimeFulfilled().toString() + "' ";
			sql += " AND question in (select id from questionnairequestion where quest = " + task.getQuestionnaire().toString() + ")";
			sql += " AND objectId = '" + task.getObject().toString() + "'";
			
			System.out.println (sql);
			
			Object[] lqa = session.createSQLQuery(sql).list().toArray();
			QuestionnaireAnswers rqas = resp.addNewOut();
			rqas.setTaskID(taskId.toString());
			
			for (int j = 0; j < lqa.length; j++) {
				com.aladdin.sc.db.QuestionnaireAnswer qa = (com.aladdin.sc.db.QuestionnaireAnswer) session.load(com.aladdin.sc.db.QuestionnaireAnswer.class, (Integer)lqa[j]);
				
				if (qa.getObjectId().equals(task.getObject())) {
					QuestionnaireAnswer rqa = rqas.addNewAnswer();
					rqa.setQuestionID(qa.getQuestion().toString());
					rqa.setValue(qa.getValue());
					rqas.setObjectID(qa.getObjectId().toString());
					rqas.setUserID(qa.getUserId().toString());
					
					com.aladdin.sc.db.QuestionnaireQuestion qq = (com.aladdin.sc.db.QuestionnaireQuestion) session.load(com.aladdin.sc.db.QuestionnaireQuestion.class, qa.getQuestion());
					rqa.setGlobalID(qq.getGlobalId().toString());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			_finally();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#listOfSupportedLocales(eu.aladdin_project.storagecomponent.ListOfSupportedLocalesDocument)
	 */
	public ListOfSupportedLocalesResponseDocument listOfSupportedLocales(ListOfSupportedLocalesDocument req) {
		trace(Thread.currentThread().getStackTrace());
		ListOfSupportedLocalesResponseDocument respdoc = ListOfSupportedLocalesResponseDocument.Factory.newInstance();
		ListOfSupportedLocalesResponse resp = respdoc.addNewListOfSupportedLocalesResponse();
		
		try {
			@SuppressWarnings("unchecked")
			Object[] array = session.createQuery("from Locale").list().toArray(new com.aladdin.sc.db.Locale[0]);
			com.aladdin.sc.db.Locale[] locale = (com.aladdin.sc.db.Locale[]) array;
			for (int i = 0; i < locale.length; i++) {
				SystemParameter l = resp.addNewOut();
				l.setCode(locale[i].getId().toString());
				l.setDescription(locale[i].getName());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getQuestionDescription(eu.aladdin_project.storagecomponent.GetQuestionDescriptionDocument)
	 */
	public GetQuestionDescriptionResponseDocument getQuestionDescription(GetQuestionDescriptionDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetQuestionDescriptionResponseDocument respdoc = GetQuestionDescriptionResponseDocument.Factory.newInstance();
		GetQuestionDescriptionResponse resp = respdoc.addNewGetQuestionDescriptionResponse();
		
		try {
			String questionID = req.getGetQuestionDescription().getQuestionID();
			SystemParameter locale = req.getGetQuestionDescription().getLocale();
			
			OperationResult res = resp.addNewOut();
			
			res.setDescription(getTranslate("questionnairequestion", new Integer (questionID), locale, ""));
			res.setCode(questionID);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return respdoc;
	}

	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getAvailableCarers(eu.aladdin_project.storagecomponent.GetAvailableCarersDocument)
	 */
	public GetAvailableCarersResponseDocument getAvailableCarers(GetAvailableCarersDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetAvailableCarersResponseDocument respdoc = GetAvailableCarersResponseDocument.Factory.newInstance();
		GetAvailableCarersResponse resp = respdoc.addNewGetAvailableCarersResponse();
		
		{
			NullChecker nc = new NullChecker();
			
			req.getGetAvailableCarers().setUserId (nc.check(req.getGetAvailableCarers().getUserId(), String.class));
		}
		
		if (
				!checkUser(req.getGetAvailableCarers().getUserId(), U_CLINICIAN) &&
				!checkUser(req.getGetAvailableCarers().getUserId(), U_ADMIN) &&
				!checkUser(req.getGetAvailableCarers().getUserId(), U_SERVICE)
			) {
			return respdoc;
		}
		
		try {
			String sql = "select id from carer where id not in (select carer from patient)";
			Object[] data = session.createSQLQuery(sql).list().toArray();
			
			List<Carer> tmp = new ArrayList<Carer>();
			for (int i = 0; i < data.length; i++) {
				tmp.add(exportCarer ((com.aladdin.sc.db.Carer) session.load(com.aladdin.sc.db.Carer.class, (Serializable) data[i])));
			}
			
			resp.setOutArray(tmp.toArray(new Carer[0]));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return respdoc;
	}
	
	/* (non-Javadoc)
	 * @see com.aladdin.sc.StorageComponentSkeletonInterface#getQuestionnaireAnswerValue(eu.aladdin_project.storagecomponent.GetQuestionnaireAnswerValueDocument)
	 */
	public GetQuestionnaireAnswerValueResponseDocument getQuestionnaireAnswerValue (GetQuestionnaireAnswerValueDocument req) {
		trace(Thread.currentThread().getStackTrace());
		GetQuestionnaireAnswerValueResponseDocument respdoc = GetQuestionnaireAnswerValueResponseDocument.Factory.newInstance();
		GetQuestionnaireAnswerValueResponse resp = respdoc.addNewGetQuestionnaireAnswerValueResponse();
		
		try {
			Integer questionId = new Integer (req.getGetQuestionnaireAnswerValue().getQuestionId());
			Integer value = new Integer (req.getGetQuestionnaireAnswerValue().getValue());
			SystemParameter locale = req.getGetQuestionnaireAnswerValue().getLocale();
			
			String sql = "SELECT id FROM questionnairequestionanswer WHERE question = " + questionId.toString() + " AND value = " + value.toString();
			List<?> _id = session.createSQLQuery(sql).list();
			if (_id.size() == 1) {
				Integer id = (Integer) _id.get(0);
				resp.setOut(getTranslate("questionnairequestionanswer", id, locale.getCode(), ""));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return respdoc;
	}
	
	/**
	 * Flush & close session
	 */
	private void _finally () {
		System.out.println ("_finally");
		session.flush();
		session.close();
	}
	
	/**
	 * Help functions for printing methods name.
	 * @param e
	 */
	private static void trace(StackTraceElement e[]) {
		boolean doNext = false;
		for (StackTraceElement s : e) {
			if (doNext) {
				System.out.println(s.getMethodName());
				return;
			}
			doNext = s.getMethodName().equals("getStackTrace");
		}
	}
	
	/**
	 * Check is the user type of.
	 * @param userId is of the user
	 * @param userType type for the checking
	 * @return boolean
	 */
	private boolean checkUser (String userId, Integer userType) {
		if (userId == null || userId == "") return true;
		try {
    		String sql = "SELECT * FROM aladdinuser WHERE id = '" + userId + "' AND type = '" + userType.toString() + "'";
			int size = session.createSQLQuery(sql).list().size();
			return (size > 0);
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Delete QuestionnaireQuestion 
	 * @param id of the QuestionnaireQuestion
	 */
	private void dropQuestionnaireQuestion (Integer id) {
		Object[] qq = session.createSQLQuery("SELECT id FROM questionnairequestion WHERE parentid = " + id.toString()).list().toArray();
		for (int i = 0; i < qq.length; i++) {
			dropQuestionnaireQuestion ((Integer) qq[i]);
		}
		session.createSQLQuery("DELETE FROM questionnairequestionanswer WHERE question = " + id.toString()).executeUpdate();
		session.createSQLQuery("DELETE FROM questionnaireanswer WHERE question = " + id.toString()).executeUpdate();
		session.createSQLQuery("DELETE FROM questionnairequestion WHERE id = " + id.toString()).executeUpdate();
	}
	
	/**
	 * Store task in the DB
	 * @param xTask for storing
	 * @return DB object
	 */
	private com.aladdin.sc.db.Task importTask (Task xTask) {
		com.aladdin.sc.db.Task dTask = new com.aladdin.sc.db.Task ();
		dTask.setTaskType(new Integer (xTask.getTaskType().getCode()));
		dTask.setDateTimeAssigned(new Timestamp(xTask.getDateTimeAssigned().getTimeInMillis()));
		dTask.setDateTimeFulfilled(new Timestamp(xTask.getDateTimeFulfilled().getTimeInMillis()));
		dTask.setTaskStatus(new Integer (xTask.getTaskStatus().getCode()));
		dTask.setUrl(xTask.getURL());
		dTask.setExecutor(new Integer (xTask.getExecutorID()));
		dTask.setAssigner(new Integer (xTask.getAssignerID()));
		dTask.setObject(new Integer (xTask.getObjectID()));
		dTask.setText(xTask.getText());
		
		if (xTask.getQuestionnaire() != null) {
			
			if (xTask.getQuestionnaire().getID() != null && xTask.getQuestionnaire().getID().compareTo("") != 0) {
				try {
					dTask.setQuestionnaire(new Integer (xTask.getQuestionnaire().getID()));
				} catch (Exception e) {
					dTask.setQuestionnaire(null);
				}
			}
		}
		return dTask;
	}
	
	/**
	 * Store persondata object
	 * @param xPersonData persondata
	 * @param id id if exist
	 * @return id of the stored data
	 */
	private Integer importPersondata (PersonData xPersonData, Integer id) {
		com.aladdin.sc.db.PersonData dPersonData = new com.aladdin.sc.db.PersonData();
		dPersonData.setName(xPersonData.getName());
		dPersonData.setSurname(xPersonData.getSurname());
		if (id != null && id > 0) {
			dPersonData.setId(id);
			session.merge(dPersonData);
		} else {
			session.save (dPersonData);
		}

		Integer pdid = dPersonData.getId();
		
		session.createSQLQuery("DELETE FROM address WHERE persondata = " + dPersonData.getId().toString()).executeUpdate();
		session.createSQLQuery("DELETE FROM identifier WHERE persondata = " + dPersonData.getId().toString()).executeUpdate();
		session.createSQLQuery("DELETE FROM communication WHERE persondata = " + dPersonData.getId().toString()).executeUpdate();
		
		Address[] rad = xPersonData.getAddressList().getAddressArray();
		for (int i = 0; i < rad.length; i++) {
			importAddress(rad[i], pdid);
		}

		Identifier[] rid = xPersonData.getIdentifierList().getIdentifierArray();
		for (int i = 0; i < rid.length; i++) {
			importIdentifier(rid[i], pdid);
		}
		
		Communication[] rcm = xPersonData.getCommunicationList().getCommunicationArray();
		for (int i = 0; i < rcm.length; i++) {
			importCommunication(rcm[i], pdid);
		}
		
		return dPersonData.getId();
	}

	/**
	 * Store communication object
	 * @param xCommunication communication
	 * @param personDataId id of the persondata
	 */
	private void importCommunication(Communication xCommunication, Integer personDataId) {
		com.aladdin.sc.db.Communication dCommunication = new com.aladdin.sc.db.Communication ();
		dCommunication.setPersondata(personDataId);
		dCommunication.setType(xCommunication.getType());
		dCommunication.setValue(xCommunication.getValue());
		dCommunication.setNotes(xCommunication.getNotes());
		dCommunication.setIsPrimary(xCommunication.getIsPrimary());
		session.save (dCommunication);
	}

	/**
	 * Store identifier object
	 * @param xIdentifier identifier
	 * @param personDataId id of the persondata
	 */
	private void importIdentifier(Identifier xIdentifier, Integer personDataId) {
		com.aladdin.sc.db.Identifier dIdentifier = new com.aladdin.sc.db.Identifier ();
		dIdentifier.setPersondata(personDataId);
		dIdentifier.setType(xIdentifier.getType());
		dIdentifier.setNumber(xIdentifier.getNumber());
		Calendar issueDate = xIdentifier.getIssueDate();
		
		long timeInMillis = 0;
		if (issueDate != null) timeInMillis = issueDate.getTimeInMillis();
		dIdentifier.setIssueDate(new Timestamp(timeInMillis));
		dIdentifier.setIssueAuthority(xIdentifier.getIssueAuthority());
		session.save (dIdentifier);
	}

	/**
	 * Store address
	 * @param xAddress address
	 * @param personDataId id of the persondata
	 */
	private void importAddress(Address xAddress, Integer personDataId) {
		com.aladdin.sc.db.Address dAddress = new com.aladdin.sc.db.Address ();
		dAddress.setPersondata(personDataId);
		dAddress.setCity(xAddress.getCity());
		dAddress.setCountry(xAddress.getCountry());
		dAddress.setCounty(xAddress.getCounty());
		dAddress.setNotes(xAddress.getNotes());
		dAddress.setStreet(xAddress.getStreet());
		dAddress.setStreetNo(xAddress.getStreetNo());
		dAddress.setZipCode(xAddress.getZipCode());
		dAddress.setIsPrimary(xAddress.getIsPrimary());
		session.save(dAddress);
	}
	
	/**
	 * Store socioDemographicData
	 * @param xSD socioDemographicData
	 * @param id id of the data if exist
	 * @return if of the stored data
	 */
	private Integer importSocioDemographic (SocioDemographicData xSD, Integer id) {
		com.aladdin.sc.db.SocioDemographicData dSD = new com.aladdin.sc.db.SocioDemographicData ();
		
		dSD.setBirthday(new Timestamp (xSD.getBirthday().getTimeInMillis()));

		if (xSD.getGender() != null && xSD.getGender().getCode() != null && !xSD.getGender().getCode().isEmpty()) dSD.setGender(new Integer(xSD.getGender().getCode()));
		else dSD.setGender(0);

		if (xSD.getMaritalStatus() != null && xSD.getMaritalStatus().getCode() != null && !xSD.getMaritalStatus().getCode().isEmpty()) dSD.setMaritalStatus(new Integer(xSD.getMaritalStatus().getCode()));
		else dSD.setMaritalStatus(0);

		dSD.setChildren(new Integer(xSD.getChildren()));

		if (xSD.getLivingWith() != null && xSD.getLivingWith().getCode() != null && !xSD.getLivingWith().getCode().isEmpty()) dSD.setLivingWith(new Integer(xSD.getLivingWith().getCode()));
		else dSD.setLivingWith(0);

		if (id != null && id > 0) {
			dSD.setId(id);
			session.merge(dSD);
		} else {
			session.save(dSD);
		}
		
		return dSD.getId();
	}
	
	/**
	 * Update QuestionnaireQuestion
	 * @param xQuestionnaireQuestion QuestionnaireQuestion
	 * @param questionnaireId questionnaire id
	 * @param parentId id of the parent question
	 * @param locale
	 * @throws HibernateException
	 * @throws LocaleException
	 */
	private void updateQuestionnaireQuestion(QuestionnaireQuestion xQuestionnaireQuestion, int questionnaireId, Integer parentId, SystemParameter locale) throws HibernateException, LocaleException {
		com.aladdin.sc.db.QuestionnaireQuestion dQuestionnaireQuestion = new com.aladdin.sc.db.QuestionnaireQuestion ();
		dQuestionnaireQuestion.setType(xQuestionnaireQuestion.getType());
		try {
			dQuestionnaireQuestion.setId(new Integer (xQuestionnaireQuestion.getId()));
		} catch (NumberFormatException e) {
			dQuestionnaireQuestion.setId(null);
		} catch (Exception e) {
			dQuestionnaireQuestion.setId(null);
		}
		dQuestionnaireQuestion.setCondition(new Integer(xQuestionnaireQuestion.getCondition()));
		
		dQuestionnaireQuestion.setPosition(xQuestionnaireQuestion.getPosition());
		
		dQuestionnaireQuestion.setParentid(parentId);
		dQuestionnaireQuestion.setQuest(questionnaireId);
		dQuestionnaireQuestion.setGlobalId(xQuestionnaireQuestion.getGlobalID());
		
		session.saveOrUpdate(dQuestionnaireQuestion);
		
		if (!setTranslate("questionnairequestion", dQuestionnaireQuestion.getId(), locale, xQuestionnaireQuestion.getTitle())) {
			dQuestionnaireQuestion.setTitle(xQuestionnaireQuestion.getTitle());
			session.saveOrUpdate(dQuestionnaireQuestion);
		}
		
		if (xQuestionnaireQuestion.getQuestions() != null && xQuestionnaireQuestion.getQuestions().getQuestionArray() != null) {
			for (int i = 0; i < xQuestionnaireQuestion.getQuestions().getQuestionArray().length; i++) {
    			updateQuestionnaireQuestion (xQuestionnaireQuestion.getQuestions().getQuestionArray(i), questionnaireId, dQuestionnaireQuestion.getId(), locale);
    		}    			
		}
		
		if (xQuestionnaireQuestion.getAnswers() != null && xQuestionnaireQuestion.getAnswers().getAnswerArray() != null) {
			QuestionnaireQuestionAnswer rqqa = null;
    		List<Integer> qqaId = new ArrayList<Integer>();
    		
			for (int i = 0; i < xQuestionnaireQuestion.getAnswers().getAnswerArray().length; i++) {
    			rqqa = xQuestionnaireQuestion.getAnswers().getAnswerArray(i);
    			
    			String sql = "SELECT id FROM questionnairequestionanswer WHERE question = '" + dQuestionnaireQuestion.getId().toString() + "' AND value = '" + new Integer (rqqa.getValue()).toString()  + "'";
				List<?> _id = session.createSQLQuery(sql).list();
    			
    			com.aladdin.sc.db.QuestionnaireQuestionAnswer qqa = null;
    			
    			if (_id.size() > 0) {
    				qqa = (com.aladdin.sc.db.QuestionnaireQuestionAnswer) session.load(com.aladdin.sc.db.QuestionnaireQuestionAnswer.class, (Integer)_id.get(0));
    				qqa.setQuestion(dQuestionnaireQuestion.getId());
    				qqa.setValue(new Integer(rqqa.getValue()));
    				qqa.setDeleted(false);
    				qqa.setPosition(rqqa.getPosition());
    				session.merge(qqa);
    			} else {
    				qqa = new com.aladdin.sc.db.QuestionnaireQuestionAnswer ();
    				qqa.setValue(new Integer(rqqa.getValue()));
    				qqa.setQuestion(dQuestionnaireQuestion.getId());
    				qqa.setPosition(rqqa.getPosition());
    				qqa.setDeleted(false);
    				session.saveOrUpdate(qqa);
    			}
    			
    			qqaId.add(qqa.getId());
    			
    			if (!setTranslate("questionnairequestionanswer", qqa.getId(), locale, rqqa.getDescription())) {
        			qqa.setDescription(rqqa.getDescription());
        			session.saveOrUpdate(dQuestionnaireQuestion);
        		}
    			
    		}
		}
	}
	
	/**
	 * Get translated value for the object
	 * @param entity entity name
	 * @param entityId if of the entity
	 * @param locale
	 * @param def default value
	 * @return value
	 */
	private String getTranslate (String entity, Integer entityId, String locale, String def) {
		if (locale != null && locale.length() > 0) {
			
			final Query query = session.createQuery("select t from Translate t where t.locale = :locale AND t.entity = :entity AND t.entityid = :entityid");
			query.setInteger("locale", getLocaleId(locale));
			query.setString("entity", entity);
			query.setInteger("entityid", entityId);
			query.setCacheable(true);
			query.setCacheRegion(null);
			
			List<?> data = query.list();
			if (data.size() == 1) {
				com.aladdin.sc.db.Translate trans = (com.aladdin.sc.db.Translate) data.get(0);
				return trans.getValue();
			}
		}
		return def;
	}
	
	/**
	 * Get translated value for the object
	 * @param entity entity name
	 * @param entityId if of the entity
	 * @param locale
	 * @param def default value
	 * @return value
	 */
	private String getTranslate (String entity, Integer entityId, SystemParameter locale, String def) {
		if (locale == null) return def;
		return getTranslate(entity, entityId, locale.getCode(), def);
	}
	
	/**
	 * Save translated value for the object
	 * @param entity entity name
	 * @param entityId if of the entity
	 * @param locale
	 * @param def default value
	 * @return true if ok
	 * @throws LocaleException
	 */
	private boolean setTranslate (String entity, Integer entityId, SystemParameter locale, String value) throws LocaleException {
		if (locale == null) return false;
		return setTranslate(entity, entityId, locale.getCode(), value);
	}
	
	/**
	 * Save translated value for the object
	 * @param entity entity name
	 * @param entityId if of the entity
	 * @param locale
	 * @param def default value
	 * @return true if ok
	 * @throws LocaleException
	 */
	private boolean setTranslate (String entity, Integer entityId, String locale, String value) throws LocaleException {
		if (locale != null && locale.length() > 0) {
			String sql = "SELECT t.id, t.value FROM translate as t INNER JOIN locale as l ON (l.id = t.locale) WHERE l.name = '" + locale + "' AND entity = '" + entity + "' AND entityid = " + entityId.toString();
			Object[] trans = session.createSQLQuery(sql).list().toArray();
			//if (trans.length > 1) {
			//	throw new LocaleException(locale + " is not supported");
			//}
			Integer localeId = getLocaleId(locale);
			if (localeId == 0) return false;
			
			com.aladdin.sc.db.Translate t = new com.aladdin.sc.db.Translate ();
			t.setValue(value);
			t.setLocale(localeId);
			t.setEntity(entity);
			t.setEntityid(entityId);
			if (trans != null && trans.length > 0) {
				t.setId((Integer) ((Object[])trans[0])[0]);
				session.merge(t);
			} else {
				session.save(t);
			}
			return t.getId() > 0;
		}
		return false;
	}
	
	/**
	 * Get locale id
	 * @param locale
	 * @return id of the locale
	 */
	private Integer getLocaleId (String locale) {
		final Query query = session.createQuery("select l from Locale l where name = :name");
		query.setString("name", locale);
		query.setCacheable(true);
		query.setCacheRegion(null);
		List<?> data = query.list();
		if (data.size() == 1) {
			return ((com.aladdin.sc.db.Locale)data.get(0)).getId();
		}
		
		com.aladdin.sc.db.Locale l = new com.aladdin.sc.db.Locale();
		l.setName(locale);
		session.save(l);
		return l.getId();
	}
	
	/**
	 * Get locale id
	 * @param locale
	 * @return id of the locale
	 */
	private Integer getLocaleId (SystemParameter locale) {
		if (locale == null || locale.getCode() == null || locale.getCode() == "") return getLocaleId ("en_US");
		return getLocaleId(locale.getCode());
	}
	
	/**
	 * Store measurement
	 * @param xMeasurement measurement
	 * @param patientAssessmentId id of the patientAssessment
	 * @return id of the stored data
	 */
	private Integer importMeasurement(Measurement xMeasurement, Integer patientAssessmentId) {
		long timeInMillis = 0;
		com.aladdin.sc.db.Measurement dMeasurement = new com.aladdin.sc.db.Measurement ();
		if (patientAssessmentId != null) dMeasurement.setPatientassessment (patientAssessmentId);
		dMeasurement.setType(xMeasurement.getType().getCode());
		dMeasurement.setValue(new BigDecimal (xMeasurement.getValue()));
		if (xMeasurement.getDateTime() != null) timeInMillis = xMeasurement.getDateTime().getTimeInMillis();
		dMeasurement.setDatetime(new Timestamp(timeInMillis));
		dMeasurement.setUnits(xMeasurement.getUnits());
		dMeasurement.setLowerlimit(new BigDecimal (xMeasurement.getLowerLimit()));
		dMeasurement.setUpperlimit(new BigDecimal (xMeasurement.getUpperLimit()));
		if (xMeasurement.getTaskID() != null) dMeasurement.setTask(new Integer (xMeasurement.getTaskID()));
		session.save (dMeasurement);
		return dMeasurement.getId();
	}
	
	/**
	 * Export patient into XSD-Schema format
	 * @param dPatient data from DB
	 * @return XSD conform
	 */
	private Patient exportPatient(com.aladdin.sc.db.Patient dPatient) {
		Patient xPatient = Patient.Factory.newInstance();
		xPatient.setID(dPatient.getId().toString());
		xPatient.setPersonData(exportPersonData(dPatient.getM_PersonData()));
		xPatient.setSDData (exportSocioDemographicData(dPatient.getM_SocioDemographicData()));
		xPatient.setResponsibleClinicianID(dPatient.getClinician().toString());
		
		Consulter xConsulter = Consulter.Factory.newInstance();
		xConsulter.setName(dPatient.getCcname());
		xConsulter.setEmail(dPatient.getCcemail());
		xConsulter.setPhone(dPatient.getCcphone());
		xPatient.setConsulterInCharge(xConsulter);
		
		SocialWorker xSocialWorker = SocialWorker.Factory.newInstance();
		xSocialWorker.setName(dPatient.getSwname());
		xSocialWorker.setEmail(dPatient.getSwemail());
		xSocialWorker.setPhone(dPatient.getSwphone());
		xPatient.setSocialWorker(xSocialWorker);
		
		GeneralPractitioner xGeneralPractitioner = GeneralPractitioner.Factory.newInstance();
		xGeneralPractitioner.setName(dPatient.getGpname());
		xGeneralPractitioner.setEmail(dPatient.getGpemail());
		xGeneralPractitioner.setPhone(dPatient.getGpphone());
		xPatient.setGeneralPractitioner(xGeneralPractitioner);
		
		xPatient.setPatientCarer(exportCarer((com.aladdin.sc.db.Carer) this.session.load(com.aladdin.sc.db.Carer.class, dPatient.getCarer())));
		
		return xPatient;
	}

	/**
	 * Export carer into XSD-Schema format
	 * @param dCarer data from DB
	 * @return XSD conform
	 */
	private Carer exportCarer(com.aladdin.sc.db.Carer dCarer) {
		Carer xCarer = Carer.Factory.newInstance();
		xCarer.setID(dCarer.getId().toString());
		xCarer.setPersonData(exportPersonData(dCarer.getM_PersonData()));
		xCarer.setSDData(exportSocioDemographicData(dCarer.getM_SocioDemographicData()));
		return xCarer;
	}
	
	/**
	 * Export SocioDemographicData into XSD-Schema format
	 * @param dSD data from DB
	 * @return XSD conform
	 */
	private SocioDemographicData exportSocioDemographicData (com.aladdin.sc.db.SocioDemographicData dSD) {
		SocioDemographicData xSD = SocioDemographicData.Factory.newInstance();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dSD.getBirthday());
		
		xSD.setBirthday(cal);
		
		SystemParameter gender = SystemParameter.Factory.newInstance();
		gender.setCode(dSD.getGender().toString());
		
		xSD.setGender(gender);
		
		SystemParameter maritalStatus = SystemParameter.Factory.newInstance();
		maritalStatus.setCode(dSD.getMaritalStatus().toString());
		
		xSD.setMaritalStatus(maritalStatus);
		xSD.setChildren(dSD.getChildren().shortValue());
		
		SystemParameter livingWith = SystemParameter.Factory.newInstance();
		livingWith.setCode(dSD.getLivingWith().toString());
		
		xSD.setLivingWith(livingWith);
		return xSD;
	}

	/**
	 * Export PersonData into XSD-Schema format
	 * @param dPersonData data from DB
	 * @return XSD conform
	 */
	private PersonData exportPersonData(com.aladdin.sc.db.PersonData dPersonData) {
		PersonData xPersonData = PersonData.Factory.newInstance();
		xPersonData.setSurname(dPersonData.getSurname());
		xPersonData.setName(dPersonData.getName());
		
		Object[] id = dPersonData.getIdentifiers().toArray();
		IdentifierList idl = xPersonData.addNewIdentifierList();
		for (int i = 0; i < id.length; i++) {
			exportIdentifier( (com.aladdin.sc.db.Identifier) id[i], idl);
		}
		
		Object[] ad = dPersonData.getAddresss().toArray();
		AddressList adl = xPersonData.addNewAddressList();
		for (int i = 0; i < ad.length; i++) {
			exportAddress( (com.aladdin.sc.db.Address) ad[i], adl);
		}
		
		Object[] cm = dPersonData.getCommunications().toArray();
		CommunicationList cml = xPersonData.addNewCommunicationList();
		for (int i = 0; i < cm.length; i++) {
			exportCommunication( (com.aladdin.sc.db.Communication) cm[i], cml);
		}
		return xPersonData;
	}

	/**
	 * Export communication 
	 * @param dCommunication data for export
	 * @param xCommunicationList place to export
	 */
	private void exportCommunication(com.aladdin.sc.db.Communication dCommunication, CommunicationList xCommunicationList) {
		Communication rcm = xCommunicationList.addNewCommunication();
		rcm.setType(dCommunication.getType());
		rcm.setValue(dCommunication.getValue());
		rcm.setNotes(dCommunication.getNotes());
		rcm.setIsPrimary(dCommunication.getIsPrimary());
	}

	/**
	 * Export Address 
	 * @param dAddress data for export
	 * @param xAddressList place to export
	 */
	private void exportAddress(com.aladdin.sc.db.Address dAddress, AddressList xAddressList) {
		Address rad = xAddressList.addNewAddress();
		rad.setStreet(dAddress.getStreet());
		rad.setStreetNo(dAddress.getStreetNo());
		rad.setCity(dAddress.getCity());
		rad.setCountry(dAddress.getCountry());
		rad.setCounty(dAddress.getCounty());
		rad.setZipCode(dAddress.getZipCode());
		rad.setNotes(dAddress.getNotes());
		rad.setIsPrimary(dAddress.getIsPrimary());
	}

	/**
	 * Export Identifier 
	 * @param dIdentifier data for export
	 * @param xIdentifierList place to export
	 */
	private void exportIdentifier(com.aladdin.sc.db.Identifier dIdentifier, IdentifierList xIdentifierList) {
		Identifier rid = xIdentifierList.addNewIdentifier();
		rid.setType(dIdentifier.getType());
		rid.setNumber(dIdentifier.getNumber());
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(dIdentifier.getIssueDate().getTime());
		rid.setIssueDate(c);
		rid.setIssueAuthority(dIdentifier.getIssueAuthority());
	}
	
	/**
	 * Store Questionnaire
	 * @param xQuestionnaire questionnaire for storing
	 * @param locale
	 * @return DB object
	 * @throws HibernateException
	 * @throws LocaleException
	 */
	private com.aladdin.sc.db.Questionnaire importQuestionnaire (Questionnaire xQuestionnaire, SystemParameter locale) throws HibernateException, LocaleException {
		if (xQuestionnaire.getID() != null) {
			try {
				@SuppressWarnings("unused")
				Integer id = new Integer (xQuestionnaire.getID());
			} catch (NumberFormatException e) {
				return null;
			} catch (Exception e) {
				return null;				
			}
		}
		
		com.aladdin.sc.db.Questionnaire dQuestionnaire = new com.aladdin.sc.db.Questionnaire ();
		
		dQuestionnaire.setVersion(new BigDecimal (xQuestionnaire.getVersion()));
		if (xQuestionnaire.getID() != null) {
			try {
				dQuestionnaire.setId(new Integer (xQuestionnaire.getID()));
			} catch (Exception e) {
				e.printStackTrace();
				dQuestionnaire = null;
				return null;
			}
		}
		session.saveOrUpdate(dQuestionnaire);
		
		if (!setTranslate("questionnaire", dQuestionnaire.getId(), locale, xQuestionnaire.getTitle())) {
			dQuestionnaire.setTitle(xQuestionnaire.getTitle());
			session.saveOrUpdate(dQuestionnaire);
		}
		
		QuestionnaireQuestion[] xQuestionnaireQuestions = xQuestionnaire.getQuestionArray();
		
		for (int i = 0; i < xQuestionnaireQuestions.length; i++) {
			updateQuestionnaireQuestion(xQuestionnaireQuestions[i], dQuestionnaire.getId(), null, locale);
		}
		return dQuestionnaire;
	}
	
	/**
	 * Export measurement
	 * @param dMeasurement measurement for export
	 * @return XSD conform
	 */
	private Measurement exportMeasurement(com.aladdin.sc.db.Measurement dMeasurement) {
		Measurement xMeasurement = Measurement.Factory.newInstance();
		SystemParameter rmeasurementType = SystemParameter.Factory.newInstance();
		rmeasurementType.setCode(dMeasurement.getType());

		xMeasurement.setType(rmeasurementType);
		xMeasurement.setValue(dMeasurement.getValue().doubleValue ());
		Timestamp datetime = dMeasurement.getDatetime();
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(datetime.getTime());
		xMeasurement.setDateTime(c);
		xMeasurement.setUnits(dMeasurement.getUnits());
		xMeasurement.setLowerLimit(dMeasurement.getLowerlimit().doubleValue ());
		xMeasurement.setUpperLimit(dMeasurement.getUpperlimit().doubleValue ());
		return xMeasurement;
	}
	
	/**
	 * Get count of task types.
	 * @return count
	 */
	private Integer getTaskTypesCount () {
		return 7;
	}
	
	/**
	 * Export Questionnaire
	 * @param dQuestionnaire DB object for export
	 * @param locale
	 * @return XSD conform
	 */
	private Questionnaire exportQuestionnaire (com.aladdin.sc.db.Questionnaire dQuestionnaire, SystemParameter locale) {
		Questionnaire xQuestionnaire = Questionnaire.Factory.newInstance();
		xQuestionnaire.setID(dQuestionnaire.getId().toString());
		
		xQuestionnaire.setTitle(getTranslate("questionnaire", dQuestionnaire.getId(), locale, dQuestionnaire.getTitle()));
		
		xQuestionnaire.setVersion(dQuestionnaire.getVersion().doubleValue ());
		
		List<QuestionnaireQuestion> xQuestionnaireQuestions = new ArrayList<QuestionnaireQuestion>();
		
		final Query query = session.createQuery("select qq from QuestionnaireQuestion qq where qq.quest = :quest AND qq.parentid is null");
		query.setInteger("quest", dQuestionnaire.getId());
		query.setCacheable(true);
		query.setCacheRegion(null);
		List<?> qql = query.list (); 
		
		for (int i = 0; i < qql.size(); i++) {
			xQuestionnaireQuestions.add(exportQuestionnaireQuestion((com.aladdin.sc.db.QuestionnaireQuestion) qql.get(i), true, locale));
		}
		xQuestionnaire.setQuestionArray((QuestionnaireQuestion[]) xQuestionnaireQuestions.toArray(new QuestionnaireQuestion[0]));
		
		return xQuestionnaire;
	}
	
	/**
	 * Export QuestionnaireQuestion
	 * @param dQuestionnaireQuestion DB object for export
	 * @param level1
	 * @param locale
	 * @return XSD conform
	 */
	private QuestionnaireQuestion exportQuestionnaireQuestion (com.aladdin.sc.db.QuestionnaireQuestion dQuestionnaireQuestion, boolean level1, SystemParameter locale) {
		QuestionnaireQuestion xQuestionnaireQuestion = QuestionnaireQuestion.Factory.newInstance();
		
		xQuestionnaireQuestion.setType(dQuestionnaireQuestion.getType());
		xQuestionnaireQuestion.setId(dQuestionnaireQuestion.getId().toString());
		xQuestionnaireQuestion.setGlobalID(dQuestionnaireQuestion.getGlobalId());
		xQuestionnaireQuestion.setPosition(dQuestionnaireQuestion.getPosition());
		
		if (!level1) {
			xQuestionnaireQuestion.setCondition(dQuestionnaireQuestion.getCondition().shortValue());
		}
		
		xQuestionnaireQuestion.setTitle(getTranslate("questionnairequestion", dQuestionnaireQuestion.getId(), locale, ""));
		
		List<QuestionnaireQuestionAnswer> xQuestionnaireQuestionAnswers = new ArrayList<QuestionnaireQuestionAnswer> ();
		
		final Query q2 = session.createQuery("select qqa from QuestionnaireQuestionAnswer qqa where deleted = :deleted and question = :question");
		q2.setInteger("question", dQuestionnaireQuestion.getId());
		q2.setBoolean("deleted", false);
		q2.setCacheable(true);
		q2.setCacheRegion(null);
		List<?> qqal = q2.list();
		
		for (int i = 0; i < qqal.size(); i++) {
			xQuestionnaireQuestionAnswers.add(exportQuestionnaireQuestionAnswer((com.aladdin.sc.db.QuestionnaireQuestionAnswer) qqal.get(i), locale));
		}
		xQuestionnaireQuestion.addNewAnswers();
		xQuestionnaireQuestion.getAnswers().setAnswerArray((QuestionnaireQuestionAnswer[]) xQuestionnaireQuestionAnswers.toArray(new QuestionnaireQuestionAnswer[0]));
		
		List<QuestionnaireQuestion> xQuestionnaireQuestions = new ArrayList<QuestionnaireQuestion>();
		
		final Query q3 = session.createQuery("select qq from QuestionnaireQuestion qq where parentid = :parentid");
		q3.setInteger("parentid", dQuestionnaireQuestion.getId());
		q3.setCacheable(true);
		q3.setCacheRegion(null);
		List<?> qql = q3.list();
		
		for (int i = 0; i < qql.size(); i++) {
			xQuestionnaireQuestions.add ( exportQuestionnaireQuestion ( (com.aladdin.sc.db.QuestionnaireQuestion) qql.get(i), false, locale ) );
		}
		xQuestionnaireQuestion.addNewQuestions().setQuestionArray(xQuestionnaireQuestions.toArray(new QuestionnaireQuestion[0]));
		
		return xQuestionnaireQuestion;
	}
	
	/**
	 * Export QuestionnaireQuestionAnswer
	 * @param dQuestionnaireQuestionAnswer DB object for export
	 * @param locale
	 * @return XSD conform
	 */
	private QuestionnaireQuestionAnswer exportQuestionnaireQuestionAnswer (com.aladdin.sc.db.QuestionnaireQuestionAnswer dQuestionnaireQuestionAnswer, SystemParameter locale) {
		QuestionnaireQuestionAnswer xQuestionnaireQuestionAnswer = QuestionnaireQuestionAnswer.Factory.newInstance();
		
		xQuestionnaireQuestionAnswer.setDescription(getTranslate("questionnairequestionanswer", dQuestionnaireQuestionAnswer.getId(), locale, ""));
		if (dQuestionnaireQuestionAnswer.getPosition() != null) xQuestionnaireQuestionAnswer.setPosition(dQuestionnaireQuestionAnswer.getPosition());
		
		xQuestionnaireQuestionAnswer.setValue(dQuestionnaireQuestionAnswer.getValue().shortValue());
		
		return xQuestionnaireQuestionAnswer;
	}
	
	/**
	 * Export clinician
	 * @param dClinician DB object for export
	 * @return XSD conform
	 */
	private Clinician exportClinician(com.aladdin.sc.db.Clinician dClinician) {
		Clinician xClinician = Clinician.Factory.newInstance();
		xClinician.setID(dClinician.getId().toString());
		xClinician.setPersonData(exportPersonData(dClinician.getM_PersonData()));
		return xClinician;
	}
	
	/**
	 * Export Administrator
	 * @param dAdministrator DB object for export
	 * @return XSD conform
	 */
	private Administrator exportAdministrator (com.aladdin.sc.db.Administrator dAdministrator) {
		Administrator xAdministrator = Administrator.Factory.newInstance();
		xAdministrator.setID(dAdministrator.getId().toString());
		xAdministrator.setPersonData(exportPersonData(dAdministrator.getM_PersonData()));
		return xAdministrator;
	}
	
	/**
	 * Check if the user exist
	 * @param username
	 * @param id
	 * @return true if exist
	 */
	private Integer existUser (String username, Integer id) {
		if (session.createSQLQuery("SELECT * FROM aladdinuser WHERE username like '" + username + "' AND id != '" + id.toString() + "'").list().size() > 1) return 1;
		return 0;
	}
	
	/**
     * Load URL and get first char of content
     * @param urlStr URL
     * @return first char
     */
    private char getURLChar (String urlStr) {
    	try {
            URL url = new URL (urlStr);
            System.out.println (urlStr);
            URLConnection uc = url.openConnection ();
            uc.connect ();
            InputStream is = uc.getInputStream ();
            byte[] b = new byte[5];
            is.read (b, 0, 5);
            System.out.println ((char)(b[0]));
            return (char)(b[0]);
        } catch (java.net.MalformedURLException e){
            return 0;
        } catch (java.io.IOException e){
            return 0;
        }
    }
    
    /**
	 * Store MediaContent
	 * @param xMediaContent data for store
	 * @param id id if exist
	 * @return id of the stored data
	 */
	private Integer importMediaContent (MediaContent xMediaContent, Integer id) {
		com.aladdin.sc.db.EntertainmentContent dEntertainmentContent = new com.aladdin.sc.db.EntertainmentContent();
		dEntertainmentContent.setCategory(xMediaContent.getCategory());
		dEntertainmentContent.setText(xMediaContent.getText());
		dEntertainmentContent.setTitle(xMediaContent.getTitle());
		dEntertainmentContent.setType(xMediaContent.getType());
		dEntertainmentContent.setUrl(xMediaContent.getUrl());
		dEntertainmentContent.setEnabled(xMediaContent.getEnabled());
		if (id != null && id > 0) {
			dEntertainmentContent.setId(id);
			session.merge(dEntertainmentContent);
		} else {
			dEntertainmentContent.setId(null);
			session.save(dEntertainmentContent);
		}
		
		return dEntertainmentContent.getId();
	}
	
	/**
	 * Check access for client IP
	 * @throws Exception if access is denied
	 */
	private void checkIP () throws Exception {
		String ip = (String) MessageContext.getCurrentMessageContext().getProperty(MessageContext.REMOTE_ADDR);
		List<String> lst = new ArrayList<String>();
		Collections.addAll(lst, com.aladdin.sc.config.Configuration.trustedIP);
		Collections.sort(lst);
		int idx = Collections.binarySearch(lst, ip);
		if (idx < 0) {
			throw new Exception("access denied");
		}
	}

}
