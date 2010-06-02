package com.aladdin.sc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import com.aladdin.xsd.*;

/*import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
*/
import org.apache.axis2.transport.http.HttpTransportProperties.Authenticator;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.transport.http.HTTPConstants;
//import org.apache.rampart.RampartMessageData;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

public class StorageComponent {

/*	public int main() throws Exception {
		
//    	System.setProperty("javax.net.ssl.trustStore", "C:/1/.keystore");
    	System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
    	
    	//To be able to load the client configuration from axis2.xml
//    	ConfigurationContext ctx = ConfigurationContextFactory.createDefaultConfigurationContext();
ConfigurationContext ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem("C:/intalio-bpms-6.0.3.010.01/webapps/axis2/WEB-INF", "C:/intalio-bpms-6.0.3.010.01/webapps/axis2/WEB-INF/conf/axis2.xml");

//ctx.setProperty("javax.net.ssl.trustStore", "C:/1/.keystore");
ctx.setProperty("javax.net.ssl.trustStorePassword", "changeit");

		
		SecureServiceStub stub = new SecureServiceStub(ctx,"http://localhost:8080/axis2/services/SecureService");
		
		ServiceClient sc = stub._getServiceClient();
		
		ctx.getAxisConfiguration().engageModule("rampart");
		
		Options options = sc.getOptions();
		options.setUserName("apache");
		options.setPassword("password");
		
		int a = 3;
		int b = 4;
		
		return stub.add(a, b);
	}
*/

public int a () throws Exception {
	StorageComponentStub stub = new StorageComponentStub(null, "http://localhost:8080/axis2/services/StorageComponent");

Authenticator auth = new Authenticator();
auth.setUsername("user");
auth.setPassword("pwd");
auth.setPreemptiveAuthentication(true);
stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, auth);

	return stub.b (123);

}

public int b (int f) {

//MessageContext msgContext = MessageContext.getCurrentMessageContext();
//HttpServletRequest req = (HttpServletRequest) msgContext.getProperty(org.apache.axis2.transport.http.HTTPConstants.MC_HTTP_SERVLETREQUEST);
//System.out.println ("\ngetAuthType    " + req.getAuthType ());
//System.out.println ("getRemoteUser " + req.getRemoteUser ());

MessageContext msgCtx = MessageContext.getCurrentMessageContext();
HttpServletRequest obj =(HttpServletRequest)msgCtx.getProperty("transport.http.servletRequest");
System.out.println ("obj " + obj.toString ());
System.out.println (obj.getRequestURI ());
System.out.println("Acceptable Encoding type: "+obj.getHeader("Accept-Encoding"));
System.out.println("Acceptable character set: " +obj.getHeader("Accept-Charset"));
System.out.println("Acceptable Media Type: "+obj.getHeader("Accept"));
Principal p = obj.getUserPrincipal ();
if (p != null) {
	System.out.println ("p: " + p.getName ());
} else System.out.println ("null");
System.out.println ("");

return f*2; 
}

/*	public java.lang.Integer CreateClinician(Clinician clinician) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		s.save(clinician.getM_PersonData());
		clinician.setPersondata(clinician.getM_PersonData().getId());

		Set<Address> addr = clinician.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			a.setPersondata(clinician.getPersondata());
			s.save(a);
		}

		Set<Identifier> ident = clinician.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			a.setPersondata(clinician.getPersondata());
			s.save(a);
		}

		Set<Communication> comm = clinician.getM_PersonData()
				.getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			a.setPersondata(clinician.getPersondata());
			s.save(a);
		}

		s.save(clinician);

		s.getTransaction().commit();
		return clinician.getId();
	}

	public java.lang.Integer UpdateClinician(Clinician clinician) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		s.save(clinician.getM_PersonData());

		Set<Address> addr = clinician.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			a.setPersondata(clinician.getPersondata());
			s.save(a);
		}

		Set<Identifier> ident = clinician.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			a.setPersondata(clinician.getPersondata());
			s.save(a);
		}

		Set<Communication> comm = clinician.getM_PersonData()
				.getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			a.setPersondata(clinician.getPersondata());
			s.save(a);
		}

		s.save(clinician);

		s.getTransaction().commit();
		return clinician.getId();
	}

	public java.lang.Integer DeleteClinician(Integer id) {

		SystemParameter sp = new SystemParameter();
		sp.setCode(3);
		List<PersonSearchCriteria> pscl = new ArrayList<PersonSearchCriteria>();
		pscl.add(new PersonSearchCriteria("id", sp, id.toString(), ""));
		List<Clinician> pl = this.GetClinician(pscl);
		if (pl.size() != 1)
			return -1;
		Clinician clinician = pl.get(0);

		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		Set<Address> addr = clinician.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			s.delete(a);
		}

		Set<Identifier> ident = clinician.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			s.delete(a);
		}

		Set<Communication> comm = clinician.getM_PersonData()
				.getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			s.delete(a);
		}

		s.delete(clinician.getM_PersonData());
		s.delete(clinician);

		s.getTransaction().commit();
		return id;
	}

	public List<Clinician> GetClinician(List<PersonSearchCriteria> pscl) {
		Session s = HibernateUtil.getSessionFactory().openSession();

		String sql = "SELECT * FROM clinician WHERE 1 ";
		for (int i = 0; i < pscl.size(); i++) {
			String tmp = "AND " + pscl.get(i).getFieldName() + " ";
			switch (pscl.get(i).getCompareOp().getCode()) {
			case 1:
				tmp += "<";
				break;
			case 2:
				tmp += ">";
				break;
			case 3:
				tmp += "=";
				break;
			case 4:
				tmp += "<=";
				break;
			case 5:
				tmp += ">=";
				break;
			case 6:
				tmp += "!=";
				break;
			case 7:
				tmp += "like '%" + pscl.get(i).getFieldValue1() + "%'";
				break;
			case 8:
				tmp += "like '%" + pscl.get(i).getFieldValue1() + "%'";
				tmp = "NOT (" + tmp + ")";
				break;
			case 9:
				tmp += "between '" + pscl.get(i).getFieldValue1() + "' AND '"
						+ pscl.get(i).getFieldValue2() + "'";
				break;
			}
			if (pscl.get(i).getCompareOp().getCode() < 7)
				tmp += "'" + pscl.get(i).getFieldValue1() + "'";
			sql += tmp;
		}

		List list = s.createCriteria(sql).list();
		return list;
	}

	public java.lang.Integer CreatePatient(Patient patient) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		s.save(patient.getM_PersonData());
		patient.setPersondata(patient.getM_PersonData().getId());

		if (patient.getClinician() == 0)
			patient.setClinician(patient.getM_Clinician().getId());

		Set<Address> addr = patient.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			a.setM_PersonData(patient.getM_PersonData());
			s.save(a);
		}

		Set<Identifier> ident = patient.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			a.setM_PersonData(patient.getM_PersonData());
			s.save(a);
		}

		Set<Communication> comm = patient.getM_PersonData().getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			a.setM_PersonData(patient.getM_PersonData());
			s.save(a);
		}

		s.save(patient);

		s.getTransaction().commit();
		return patient.getId();
	}

	public java.lang.Integer UpdatePatient(Patient patient) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		s.save(patient.getM_PersonData());

		if (patient.getClinician() == 0)
			patient.setClinician(patient.getM_Clinician().getId());

		Set<Address> addr = patient.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			a.setM_PersonData(patient.getM_PersonData());
			s.save(a);
		}

		Set<Identifier> ident = patient.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			a.setM_PersonData(patient.getM_PersonData());
			s.save(a);
		}

		Set<Communication> comm = patient.getM_PersonData().getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			a.setM_PersonData(patient.getM_PersonData());
			s.save(a);
		}

		s.save(patient);

		s.getTransaction().commit();
		return patient.getId();
	}

	public List<Patient> GetPatient(List<PersonSearchCriteria> pscl) {
		Session s = HibernateUtil.getSessionFactory().openSession();

		String sql = "SELECT * FROM patient WHERE 1 ";
		for (int i = 0; i < pscl.size(); i++) {
			String tmp = "AND " + pscl.get(i).getFieldName() + " ";
			switch (pscl.get(i).getCompareOp().getCode()) {
			case 1:
				tmp += "<";
				break;
			case 2:
				tmp += ">";
				break;
			case 3:
				tmp += "=";
				break;
			case 4:
				tmp += "<=";
				break;
			case 5:
				tmp += ">=";
				break;
			case 6:
				tmp += "!=";
				break;
			case 7:
				tmp += "like '%" + pscl.get(i).getFieldValue1() + "%'";
				break;
			case 8:
				tmp += "like '%" + pscl.get(i).getFieldValue1() + "%'";
				tmp = "NOT (" + tmp + ")";
				break;
			case 9:
				tmp += "between '" + pscl.get(i).getFieldValue1() + "' AND '"
						+ pscl.get(i).getFieldValue2() + "'";
				break;
			}
			if (pscl.get(i).getCompareOp().getCode() < 7)
				tmp += "'" + pscl.get(i).getFieldValue1() + "'";
			sql += tmp;
		}

		List list = s.createCriteria(sql).list();
		return list;
	}

	public java.lang.Integer DeletePatient(Integer id) {
		SystemParameter sp = new SystemParameter();
		sp.setCode(3);
		List<PersonSearchCriteria> pscl = new ArrayList<PersonSearchCriteria>();
		pscl.add(new PersonSearchCriteria("id", sp, id.toString(), ""));
		List<Patient> pl = this.GetPatient(pscl);
		if (pl.size() != 1)
			return -1;
		Patient patient = pl.get(0);

		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		Set<Address> addr = patient.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			s.delete(a);
		}

		Set<Identifier> ident = patient.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			s.delete(a);
		}

		Set<Communication> comm = patient.getM_PersonData().getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			s.delete(a);
		}

		s.delete(patient.getM_PersonData());
		s.delete(patient);

		s.getTransaction().commit();
		return patient.getId();
	}
	
	public java.lang.Integer CreateCarer(Carer carer) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		s.save(carer.getM_PersonData());
		carer.setPersondata(carer.getM_PersonData().getId());

		Set<Address> addr = carer.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			a.setM_PersonData(carer.getM_PersonData());
			s.save(a);
		}

		Set<Identifier> ident = carer.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			a.setM_PersonData(carer.getM_PersonData());
			s.save(a);
		}

		Set<Communication> comm = carer.getM_PersonData().getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			a.setM_PersonData(carer.getM_PersonData());
			s.save(a);
		}

		s.save(carer);

		s.getTransaction().commit();
		return carer.getId();
	}

	public java.lang.Integer UpdateCarer(Carer carer) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		s.save(carer.getM_PersonData());

		Set<Address> addr = carer.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			a.setM_PersonData(carer.getM_PersonData());
			s.save(a);
		}

		Set<Identifier> ident = carer.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			a.setM_PersonData(carer.getM_PersonData());
			s.save(a);
		}

		Set<Communication> comm = carer.getM_PersonData().getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			a.setM_PersonData(carer.getM_PersonData());
			s.save(a);
		}

		s.save(carer);

		s.getTransaction().commit();
		return carer.getId();
	}

	public List<Carer> GetCarer(List<PersonSearchCriteria> pscl) {
		Session s = HibernateUtil.getSessionFactory().openSession();

		String sql = "SELECT * FROM carer WHERE 1 ";
		for (int i = 0; i < pscl.size(); i++) {
			String tmp = "AND " + pscl.get(i).getFieldName() + " ";
			switch (pscl.get(i).getCompareOp().getCode()) {
			case 1:
				tmp += "<";
				break;
			case 2:
				tmp += ">";
				break;
			case 3:
				tmp += "=";
				break;
			case 4:
				tmp += "<=";
				break;
			case 5:
				tmp += ">=";
				break;
			case 6:
				tmp += "!=";
				break;
			case 7:
				tmp += "like '%" + pscl.get(i).getFieldValue1() + "%'";
				break;
			case 8:
				tmp += "like '%" + pscl.get(i).getFieldValue1() + "%'";
				tmp = "NOT (" + tmp + ")";
				break;
			case 9:
				tmp += "between '" + pscl.get(i).getFieldValue1() + "' AND '"
						+ pscl.get(i).getFieldValue2() + "'";
				break;
			}
			if (pscl.get(i).getCompareOp().getCode() < 7)
				tmp += "'" + pscl.get(i).getFieldValue1() + "'";
			sql += tmp;
		}

		List list = s.createCriteria(sql).list();
		return list;
	}

	public java.lang.Integer DeleteCarer (Integer id) {
		SystemParameter sp = new SystemParameter();
		sp.setCode(3);
		List<PersonSearchCriteria> pscl = new ArrayList<PersonSearchCriteria>();
		pscl.add(new PersonSearchCriteria("id", sp, id.toString(), ""));
		List<Carer> pl = this.GetCarer(pscl);
		if (pl.size() != 1)
			return -1;
		Carer carer = pl.get(0);

		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		Set<Address> addr = carer.getM_PersonData().getAddresss();
		Iterator<Address> ait = addr.iterator();
		while (ait.hasNext()) {
			Address a = ait.next();
			s.delete(a);
		}

		Set<Identifier> ident = carer.getM_PersonData().getIdentifiers();
		Iterator<Identifier> iit = ident.iterator();
		while (iit.hasNext()) {
			Identifier a = iit.next();
			s.delete(a);
		}

		Set<Communication> comm = carer.getM_PersonData().getCommunications();
		Iterator<Communication> cit = comm.iterator();
		while (cit.hasNext()) {
			Communication a = cit.next();
			s.delete(a);
		}

		s.delete(carer.getM_PersonData());
		s.delete(carer);

		s.getTransaction().commit();
		return carer.getId();
	}
	
	private List<Task> GetXPlannedTasks (Integer id, String type) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		String sql = "SELECT * FROM task WHERE usertype = '" + type + "' AND userid = '" + id.toString() + "'";
		List list = s.createSQLQuery(sql).list();
		return list;
	}
	
	public List<Task> GetPatientPlannedTasks (Integer id) {
		return GetXPlannedTasks(id, "patient");
	}

	public List<Task> GetCarerPlannedTasks (Integer id) {
		return GetXPlannedTasks(id, "carer");
	}
	
	public int StoreQuestionnaireAnswers (List<QuestionnaireAnswer> data) {
		
		if (data.size() < 1) return -1;
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		//Task task = (Task) s.load(Task.class, taskId);
		String sql = "SELECT * FROM task WHERE questionnaire = (SELECT id FROM questionnaire WHERE id = (SELECT quest FROM questionnairequestion WHERE id = " + data.get(0).getQuestion() + "))";
		List<Task> l = s.createSQLQuery(sql).list();
		if (l.size() < 1) return -1;
		Task task = l.get(0);
		
		if (task.getUserId() != data.get(0).getUserId()) return -1;
		
		for (int i = 0; i < data.size(); i++) {
			s.save(data.get(0));
		}
		
		s.getTransaction().commit();
		return 1;
	}
	
	public int StoreMeasurement (List<Measurement> data) {
		if (data.size() < 1) return 1;
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		for (int i = 0; i < data.size(); i++) {
			s.save(data.get(0));
		}
		
		s.getTransaction().commit();
		return 1;
	}
	
	public int ChangeTaskStatus (int id, int status) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		Task task = (Task) s.load(Task.class, id);
		task.getM_TaskStatusT().setCode(status);
		s.save(task.getM_TaskStatusT());
		
		s.getTransaction().commit();
		return id;
	}
	
	public List<Note> GetNotes (Integer carerId, int days) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		String sql = "SELECT * FROM note WHERE usertype = 'carer' AND userid = '" + carerId.toString() + "' AND datetimeofnote BETWEEN (NOW() - interval '1 day') AND NOW()";
		List list = s.createCriteria(sql).list();
		return list;
	}
	
	public int StoreNote (Note note) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.save (note);
		s.getTransaction().commit();
		return note.getId();
	}
	
	public int AssignTask (Task task) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.save(task.getM_TaskTypeT());
		task.setTaskType(task.getM_TaskTypeT().getId());
		s.save(task.getM_TaskStatusT());
		task.setTaskStatus(task.getM_TaskStatusT().getId());
		s.save (task);
		s.getTransaction().commit();
		return task.getId();
	}
	
	public List<Measurement> GetPatientMonitoringData (Integer id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		String sql = "SELECT * FROM measurement WHERE patientid = '" + id.toString() + "'";
		List list = s.createSQLQuery(sql).list();
		return list;
	}
	
	public int CreateQuestionnaire (Questionnaire questionnaire) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		s.save(questionnaire);
		for (int i = 0; i < questionnaire.getQuestionnaireQuestions().size(); i++) {
			QuestionnaireQuestion qq = (QuestionnaireQuestion) questionnaire.getQuestionnaireQuestions().toArray()[i];
			qq.setQuest(questionnaire.getId());
			s.save(qq);
			for (int j = 0; j < qq.getQuestionnaireQuestionAnswers().size(); j++) {
				QuestionnaireQuestionAnswer qqa = (QuestionnaireQuestionAnswer) qq.getQuestionnaireQuestionAnswers().toArray()[j];
				qqa.setQuestion(qq.getId());
				s.save(qqa);
			}
		}
		
		s.getTransaction().commit();
		return questionnaire.getId();
	}
	
	public int UpdateQuestionnaire (Questionnaire questionnaire) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		s.save(questionnaire);
		for (int i = 0; i < questionnaire.getQuestionnaireQuestions().size(); i++) {
			QuestionnaireQuestion qq = (QuestionnaireQuestion) questionnaire.getQuestionnaireQuestions().toArray()[i];
			qq.setQuest(questionnaire.getId());
			s.save(qq);
			for (int j = 0; j < qq.getQuestionnaireQuestionAnswers().size(); j++) {
				QuestionnaireQuestionAnswer qqa = (QuestionnaireQuestionAnswer) qq.getQuestionnaireQuestionAnswers().toArray()[j];
				qqa.setQuestion(qq.getId());
				s.save(qqa);
			}
		}
		
		s.getTransaction().commit();
		return questionnaire.getId();
	}
	
	public int DeleteQuestionnaire (Integer id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		Questionnaire questionnaire = (Questionnaire) s.load(Questionnaire.class, id);
		
		s.save(questionnaire);
		for (int i = 0; i < questionnaire.getQuestionnaireQuestions().size(); i++) {
			QuestionnaireQuestion qq = (QuestionnaireQuestion) questionnaire.getQuestionnaireQuestions().toArray()[i];
			for (int j = 0; j < qq.getQuestionnaireQuestionAnswers().size(); j++) {
				QuestionnaireQuestionAnswer qqa = (QuestionnaireQuestionAnswer) qq.getQuestionnaireQuestionAnswers().toArray()[j];
				s.delete(qqa);
			}
			s.delete(qq);
		}
		
		s.delete(questionnaire);
		
		s.getTransaction().commit();
		return questionnaire.getId();
	}*/
}
