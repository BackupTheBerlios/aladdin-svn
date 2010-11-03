package eu.aladdin_project.controllers.task;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Timebox;
import org.zkoss.zul.Window;
import org.zkoss.zul.Listbox;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.QuestionnaireQuestion;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.Task;

@SuppressWarnings("serial")
public class CalendarWindowController extends Window {
	
	public void changeTaskType(){
		Listbox listbox = (Listbox)getFellow("tasktypesel");
		Listitem listitem = listbox.getSelectedItem();
		int comp = ((Integer)listitem.getValue()).intValue(); 
		if(comp == SystemDictionary.TASK_TYPE_COGGAME_INT){
			getFellow("urlrow").setVisible(true);
			getFellow("qsrow").setVisible(false);
			System.out.println("IEEE");
		}else if(comp == SystemDictionary.TASK_TYPE_CARERQS_INT || comp == SystemDictionary.TASK_TYPE_PATIENTQS_INT){
			getFellow("urlrow").setVisible(false);
			getFellow("qsrow").setVisible(true);
			System.out.println("EEEI");
		}else{
			getFellow("urlrow").setVisible(false);
			getFellow("qsrow").setVisible(false);
			System.out.println("IEEI");
		}
	}
	
	public void saveTask(){
		String URL = "";
		QuestionnaireQuestion[] questionnaire = new QuestionnaireQuestion[0];
		StorageComponentProxy proxy = new StorageComponentProxy();
		
		try{
			Listbox listbox = (Listbox)getFellow("tasktypesel");
			org.zkoss.zul.api.Listitem listitem = listbox.getSelectedItemApi();
			SystemParameter tastype = new SystemParameter(((Integer)listitem.getValue()).toString(), listitem.getLabel());
			String userids = ((Textbox)getFellow("userid")).getValue();
			switch(((Integer)listitem.getValue()).intValue()){
				case SystemDictionary.TASK_TYPE_CARERQS_INT:
				case SystemDictionary.TASK_TYPE_PATIENTQS_INT:
					String qid = ((Textbox)getFellow("questidfield")).getValue();
					questionnaire = proxy.getQuestionnaire(qid, userids);
					break;
				case SystemDictionary.TASK_TYPE_COGGAME_INT:
					URL = ((Textbox)getFellow("urlfield")).getValue();
					break;
				default:
					//do nothing
					break;
			}
			
			Datebox dbox = (Datebox)getFellow("datetask");
			Timebox tbox = (Timebox)getFellow("timetask");
			GregorianCalendar caltas = new GregorianCalendar();
			caltas.setTime(dbox.getValue());
			GregorianCalendar caltas2 = new GregorianCalendar();
			caltas2.setTime(tbox.getValue());
			Long added = new Long(caltas2.get(Calendar.HOUR_OF_DAY)*60*60*1000);
			added += caltas.get(Calendar.MINUTE)*60*1000;
			caltas2.setTime(new Date(dbox.getValue().getTime()+added));
			
			SystemParameter tasstatus = new SystemParameter(SystemDictionary.TASK_STATUS_PENDING,SystemDictionary.TASK_STATUS_PENDING_LBL);
			//Object ID (Person ID)
			String objids = ((Textbox)getFellow("objid")).getValue();
			String addressedids = ((Textbox)getFellow("addressedid")).getValue();
			OperationResult result = proxy.getUserIdByPersonId(addressedids, SystemDictionary.USERTYPE_PATIENT_INT, userids);
			System.out.println("Getuser result = " + result.getCode()+ ":" +result.getDescription());
			System.out.println("QUESTIONNAIRE: "+questionnaire.length);
			Task ts = new Task("", tastype, caltas, caltas2, tasstatus, URL, questionnaire, objids, userids, result.getCode());
			OperationResult opres = proxy.assignTask(ts,userids);
			System.out.println("Assign task result = " + opres.getCode()+ ":" +opres.getDescription());
		}catch(java.rmi.RemoteException re){
			re.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			Executions.getCurrent().sendRedirect("");
		}
	}
	
	public void cancelTask(){
		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			String task = ((Textbox)getFellow("taskidfield")).getValue();
			Session ses = Sessions.getCurrent();
			String uid = (String)ses.getAttribute("userid");
			proxy.changeTaskStatus(Integer.parseInt(task),SystemDictionary.TASK_STATUS_CANCELLED_INT, uid);
			 
		}catch(java.rmi.RemoteException re){
			re.printStackTrace();	
		}finally{
			Executions.getCurrent().sendRedirect("");
		}
	}
}
