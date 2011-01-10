package eu.aladdin_project.controllers.task;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Timebox;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.Questionnaire;
import eu.aladdin_project.xsd.QuestionnaireQuestion;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.Task;

public class CalendarWindowControllerPatients extends CalendarWindowController {

	public void saveTask(){
		String URL = "";
		Questionnaire questionnaire = new Questionnaire();
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
					questionnaire = proxy.getQuestionnaire(qid, SystemDictionary.getLocale(), userids);
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
			System.out.println("Getobjids result = " + objids);
			//OperationResult result = proxy.getUserIdByPersonId(objids, SystemDictionary.USERTYPE_PATIENT_INT, userids);
			//System.out.println("Getuser result = " + result.getCode()+ ":" +result.getDescription());
			
			//TODO Retrieve real task text
			Task ts = new Task("", tastype, caltas, caltas2, tasstatus, URL, "", questionnaire, objids, userids, objids);
			OperationResult opres = proxy.assignTask(ts, SystemDictionary.getLocale(), userids);
			System.out.println("Assign task result = " + opres.getCode()+ ":" +opres.getDescription());
		}catch(java.rmi.RemoteException re){
			re.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			Executions.getCurrent().sendRedirect("");
		}
	}
	
}
