package eu.aladdin_project.controllers.task;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.axis.types.UnsignedByte;
import org.zkoss.calendar.Calendars;
import org.zkoss.calendar.event.CalendarsEvent;
import org.zkoss.calendar.impl.SimpleCalendarEvent;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Timebox;
import org.zkoss.zul.Toolbar;
import org.zkoss.zul.Window;
import org.zkoss.zul.api.Datebox;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.Carer;
import eu.aladdin_project.xsd.Clinician;
import eu.aladdin_project.xsd.Measurement;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.Patient;
import eu.aladdin_project.xsd.Questionnaire;
import eu.aladdin_project.xsd.QuestionnaireAnswer;
import eu.aladdin_project.xsd.QuestionnaireAnswers;
import eu.aladdin_project.xsd.QuestionnaireQuestion;
import eu.aladdin_project.xsd.SearchCriteria;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.User;

public class CalendarControllerPatients extends GenericForwardComposer {

	public Window bookEventWin;
	public Calendars cal;
	
	public void onEventCreate(CalendarsEvent event) throws InterruptedException, RemoteException{
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		bookEventWin = (Window)Executions.createComponents("bookEvent.zul", self.getParent(), null);
		bookEventWin.setAttribute("calendars", cal);
		bookEventWin.setAttribute("calevent", event);
		bookEventWin.getFellow("qsrow").setVisible(true);
		Date setting = event.getBeginDate();
		setting.setTime(setting.getTime()+43200000);
		((Datebox)bookEventWin.getFellow("datetask")).setValue(setting);
		((Timebox)bookEventWin.getFellow("timetask")).setValue(setting);
		((Button)bookEventWin.getFellow("savebutton")).setVisible(true);
		((Listbox)bookEventWin.getFellow("tasktypesel")).setSelectedIndex(0);
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		((Textbox)bookEventWin.getFellow("userid")).setValue(userid);
		Toolbar toolbar = (Toolbar)self.getFellow("toolbar");
		String currentexecutor = ((Label)toolbar.getFellow("exechelp")).getValue();
		SystemDictionary.webguiLog("DEBUG", "Executor: "+currentexecutor);
		OperationResult opres = proxy.getUserIdByPersonId(currentexecutor, SystemDictionary.USERTYPE_PATIENT_INT, userid);
		Patient patient = proxy.getPatient(currentexecutor, userid);
		Carer carer = patient.getPatientCarerList().getPatientCarer(0).getCarer();
		OperationResult realexecutor = proxy.getUserIdByPersonId(carer.getID(), SystemDictionary.USERTYPE_CARER_INT, userid);
		SystemDictionary.webguiLog("DEBUG", "Executor req: "+realexecutor.getCode()+":"+opres.getDescription());
		((Textbox)bookEventWin.getFellow("objid")).setValue(realexecutor.getCode());
		((Textbox)bookEventWin.getFellow("addressedid")).setValue(opres.getCode());
		((Textbox)bookEventWin.getFellow("objstr")).setValue(carer.toString());
		((Textbox)bookEventWin.getFellow("addressedstr")).setValue(patient.toString());
		User assigner = proxy.getUser(userid);
		Clinician assg = proxy.getClinician(assigner.getPersonID(), userid); 
		((Textbox)bookEventWin.getFellow("userstr")).setValue(assg.toString());
		//bookEventWin.getFellow("assignerrow").setVisible(false);
		bookEventWin.getFellow("massivequestionrow").setVisible(true);
		bookEventWin.getFellow("massivecheckrow").setVisible(true);
		bookEventWin.setTitle("New Task");
		bookEventWin.setVisible(true);
		bookEventWin.doModal();
	}
	
	public void onEventEdit(CalendarsEvent event) throws InterruptedException, RemoteException{
		try{
			StorageComponentProxy proxy = SystemDictionary.getSCProxy();
			Session ses = Sessions.getCurrent();
			String userid = (String)ses.getAttribute("userid");
			bookEventWin = (Window)Executions.createComponents("bookEvent.zul", self.getParent(), null);
			bookEventWin.setAttribute("calendars", cal);
			bookEventWin.setAttribute("calevent", event);
			Date setting = event.getCalendarEvent().getBeginDate();
			SimpleCalendarEvent scevent = (SimpleCalendarEvent)event.getCalendarEvent();
			bookEventWin.getFellow("cancelbutton").setVisible(true);
			((Datebox)bookEventWin.getFellow("datetask")).setValue(setting);
			((Datebox)bookEventWin.getFellow("datetask")).setReadonly(true);
			((Datebox)bookEventWin.getFellow("datetask")).setButtonVisible(false);
			((Timebox)bookEventWin.getFellow("timetask")).setValue(setting);
			((Timebox)bookEventWin.getFellow("timetask")).setReadonly(true);
			((Timebox)bookEventWin.getFellow("timetask")).setButtonVisible(false);
			((Textbox)bookEventWin.getFellow("taskidfield")).setValue((String)scevent.getParams().get("task"));
			((Textbox)bookEventWin.getFellow("taskstatusfield")).setValue(SystemDictionary.getTaskStatusLabel((String)scevent.getParams().get("status")));
			bookEventWin.getFellow("rowtaskstatus").setVisible(true);
			if(scevent.getParams().get("status").equals(SystemDictionary.TASK_STATUS_COMPLETED)){
				bookEventWin.getFellow("cancelbutton").setVisible(false);
				String tasktype = (String)scevent.getParams().get("type");  
				if(tasktype.equals(SystemDictionary.TASK_TYPE_CARERQS) || tasktype.equals(SystemDictionary.TASK_TYPE_PATIENTQS)){
					//TODO retrieve Questionnaire answers and show in the task window
					Questionnaire q = (Questionnaire)scevent.getParams().get("questionnaire");
					QuestionnaireAnswers qa = proxy.getQuestionnaireAnswersByTask((String)scevent.getParams().get("task"), userid);
					SystemDictionary.webguiLog("INFO", "ANSWERS LENGTH: "+ qa.getAnswer().length);
					ArrayList<QuestionnaireAnswer> qalist = new ArrayList<QuestionnaireAnswer>();
					for(int i = 0 ; i < qa.getAnswer().length ; i++){
						qalist.add(i, qa.getAnswer(i));						
					}
					String responses = provideQuestionnaireResponse(q.getQuestion(), qalist, "");
					SystemDictionary.webguiLog("DEBUG", "RESPONSES: "+responses);
					bookEventWin.getFellow("qsanswersrow").setVisible(true);
					((Label)bookEventWin.getFellow("qsanswersfield")).setValue(responses);
					
				}else if(tasktype.equals(SystemDictionary.TASK_TYPE_BLOODPRESSURE_MEASUREMENT) || tasktype.equals(SystemDictionary.TASK_TYPE_WEIGHT_MEASUREMENT)){
					String resultfieldvalue = "";
					SearchCriteria searchc = new SearchCriteria("task", new SystemParameter(SystemDictionary.COMPARE_EQ, ""), (String)scevent.getParams().get("task"), "");
					Measurement[] results = proxy.getMeasurement(new SearchCriteria[]{searchc}, userid);
					if(results.length <= 0){
						resultfieldvalue = "No measurement could be retrieved";
					}else{
						SystemDictionary.webguiLog("DEBUG", "RESULTS LENGHT: "+results.length);
						for(int ii = 0 ; ii < results.length ; ii++){
							resultfieldvalue += results[ii].getValue()+""+results[ii].getUnits()+"\n";
						}
					}
					bookEventWin.getFellow("mresultrow").setVisible(true);
					((Label)bookEventWin.getFellow("mresultrowfield")).setValue(resultfieldvalue);
				}
				
			}
			User addressed = proxy.getUser((String)scevent.getParams().get("objid"));
			Patient patient = proxy.getPatient(addressed.getPersonID(), userid);
			((Textbox)bookEventWin.getFellow("addressedid")).setValue((String)scevent.getParams().get("objid"));
			((Textbox)bookEventWin.getFellow("addressedstr")).setValue(patient.toString());
			User object = proxy.getUser((String)scevent.getParams().get("exec"));
			Carer executor = proxy.getCarer(object.getPersonID(), userid);
			((Textbox)bookEventWin.getFellow("objid")).setValue((String)scevent.getParams().get("exec"));
			((Textbox)bookEventWin.getFellow("objstr")).setValue(executor.toString());
			User assigner = proxy.getUser((String)scevent.getParams().get("assign"));
			Clinician assg = proxy.getClinician(assigner.getPersonID(), userid);
			((Textbox)bookEventWin.getFellow("userid")).setValue((String)scevent.getParams().get("assign"));
			((Textbox)bookEventWin.getFellow("userstr")).setValue(assg.toString());
			((Textbox)bookEventWin.getFellow("tasktypetext")).setValue(scevent.getContent());
			bookEventWin.getFellow("tasktypetext").setVisible(true);
			//((Combobox)bookEventWin.getFellow("addressedtext")).setVisible(false);
			int tasktype2 = Integer.parseInt((String)scevent.getParams().get("type"));
			this.showCustomFields(tasktype2);
			bookEventWin.getFellow("tasktypesel").setVisible(false);
			List items = ((Listbox)bookEventWin.getFellow("urlfield")).getItems();
			Iterator it = items.iterator();
			while(it.hasNext()){
				Listitem currentitem = (Listitem)it.next();
				if(currentitem.getValue().equals((String)scevent.getParams().get("url"))){
					((Listbox)bookEventWin.getFellow("urlfield")).setSelectedItem(currentitem);
					break;
				}
			}
			((Listbox)bookEventWin.getFellow("urlfield")).setDisabled(true);
			if(scevent.getParams().get("questionnaire") != null){
				items = ((Listbox)bookEventWin.getFellow("questnamefield")).getItems();
				it = items.iterator();
				while(it.hasNext()){
					Listitem currentitem = (Listitem)it.next();
					if(currentitem.getValue().equals(((Questionnaire)scevent.getParams().get("questionnaire")).getID())){
						((Listbox)bookEventWin.getFellow("questnamefield")).setSelectedItem(currentitem);
						break;
					}
				}
			}
			((Listbox)bookEventWin.getFellow("questnamefield")).setDisabled(true);
			//((Textbox)bookEventWin.getFellow("urlfield")).setValue((String)scevent.getParams().get("url"));
			((Textbox)bookEventWin.getFellow("textfield")).setValue((String)scevent.getParams().get("text"));
			
			bookEventWin.setTitle("View Task");
			bookEventWin.setVisible(true);
			bookEventWin.doModal();
		}catch(Exception e){
			e.printStackTrace();
			Executions.sendRedirect("");
		}
		
	}
	
	private String provideQuestionnaireResponse(QuestionnaireQuestion[] q, ArrayList<QuestionnaireAnswer> qa, String ret) throws RemoteException{
		for(int i = 0; i < q.length ; i++){
			QuestionnaireAnswer currentqa = qa.get(0);
			qa.remove(0);
			StorageComponentProxy proxy = SystemDictionary.getSCProxy();
			String valuestring = proxy.getQuestionnaireAnswerValue(q[i].getId(), currentqa.getValue(), SystemDictionary.getLocale());
			ret+=q[i].getTitle()+" "+ valuestring+" ("+ currentqa.getValue() + ")\n";
			if(q[i].getQuestions() != null && q[i].getQuestions().getQuestion() != null && q[i].getQuestions().getQuestion().length>0){
				for(int ii = 0 ; ii < q[i].getQuestions().getQuestion().length ; ii++){
					if(q[i].getQuestions().getQuestion()[ii].getCondition() == new UnsignedByte(currentqa.getValue())){
						ret = provideQuestionnaireResponse(new QuestionnaireQuestion[]{q[i].getQuestions().getQuestion()[ii]}, qa, ret);
					}
				}
				
			}
		}
		return ret;
	}
	
	private void showCustomFields(int tasktype){
			boolean urlrow = false;
			boolean qsrow = false;
			boolean txtrow = false;
			switch(tasktype){
				case SystemDictionary.TASK_TYPE_COGGAME_INT:
					urlrow = true;
					qsrow = false;
					txtrow = false;
					break;
				case SystemDictionary.TASK_TYPE_CARERQS_INT: 
				case SystemDictionary.TASK_TYPE_PATIENTQS_INT:
					urlrow = false;
					qsrow = true;
					txtrow = false;
					break;
				case SystemDictionary.TASK_TYPE_EXERCISE_INT:
					txtrow = true;
					urlrow = true;
					qsrow = false;
					break;
				case SystemDictionary.TASK_TYPE_TXT_INT:
					txtrow = true;
					urlrow = false;
					qsrow = false;
					break;
				default:
					urlrow = false;
					qsrow = false;
					txtrow = false;
					break;
			};
			bookEventWin.getFellow("urlrow").setVisible(urlrow);
			bookEventWin.getFellow("qsrow").setVisible(qsrow);
			//bookEventWin.getFellow("qsrow").setVisible(false);
			bookEventWin.getFellow("textrow").setVisible(txtrow);
			((Textbox)bookEventWin.getFellow("textfield")).setReadonly(true);
	}
}
