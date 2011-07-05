package eu.aladdin_project.controllers.task;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Timebox;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.Questionnaire;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.Task;

public class CalendarWindowControllerPatients extends Window {
	private static final long serialVersionUID = -5542409524567322844L;

	public void changeTaskType(Object obj){
		boolean urlrow = false;
		boolean qsrow = false;
		boolean txtrow = false;
		int comp = (Integer)obj;
		switch(comp){
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
		getFellow("urlrow").setVisible(urlrow);
		getFellow("qsrow").setVisible(qsrow);
		getFellow("textrow").setVisible(txtrow);
	}
	
	public void showHidePeriodicFields(boolean checked){
		getFellow("freq1row").setVisible(checked);
		getFellow("till1row").setVisible(checked);
	}

	public void saveTask(){
		String URL = "";
		String text = "";
		Questionnaire questionnaire = new Questionnaire();
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		try{
			Listbox listbox = (Listbox)getFellow("tasktypesel");
			org.zkoss.zul.api.Listitem listitem = listbox.getSelectedItemApi();
			SystemParameter tastype = new SystemParameter(((Integer)listitem.getValue()).toString(), listitem.getLabel());
			String userids = ((Textbox)getFellow("userid")).getValue();
			switch(((Integer)listitem.getValue()).intValue()){
				case SystemDictionary.TASK_TYPE_CARERQS_INT:
				case SystemDictionary.TASK_TYPE_PATIENTQS_INT:
					//String qid = ((Textbox)getFellow("questidfield")).getValue();
					String qid = (String)((Listbox)getFellow("questnamefield")).getSelectedItem().getValue();
					questionnaire = proxy.getQuestionnaire(qid, SystemDictionary.getLocale(), userids);
					break;
				case SystemDictionary.TASK_TYPE_COGGAME_INT:
					URL = (String)((Listbox)getFellow("urlfield")).getSelectedItem().getValue();
					break;
				case SystemDictionary.TASK_TYPE_TXT_INT:
					text = ((Textbox)getFellow("textfield")).getValue();
					break;
				case SystemDictionary.TASK_TYPE_EXERCISE_INT:
					URL = (String)((Listbox)getFellow("urlfield")).getSelectedItem().getValue();
					text = ((Textbox)getFellow("textfield")).getValue();
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
			String addressedid = ((Textbox)getFellow("addressedid")).getValue();
			SystemDictionary.webguiLog("TRACE", "Getobjids result = " + objids);
			Task ts = new Task("", tastype, caltas, caltas2, tasstatus, URL, text, questionnaire, objids, userids, addressedid);
			boolean massive = ((Checkbox)getFellow("massivecheck")).isChecked();
			OperationResult opres = null;
			if(massive){
				Integer freq = new Integer((String)((Listbox)getFellow("massivelist")).getSelectedItem().getValue());
				Date tillday = (Date)((Datebox)getFellow("massivecal")).getValue();
				tillday.setTime(tillday.getTime()+(24*60*60*1000));
				opres = proxy.assignTasksMassively(ts, dbox.getValue(), tillday, BigInteger.valueOf(freq), userids);
			}else{
				opres = proxy.assignTask(ts, SystemDictionary.getLocale(), userids);
			}
			SystemDictionary.webguiLog("DEBUG", "Assign task result = " + opres.getCode()+ ":" +opres.getDescription());
		}catch(java.rmi.RemoteException re){
			re.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			this.getParent().removeChild(this);
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
	
	public void setTextFromExercise(){
		Listitem item = ((Listbox)getFellow("urlfield")).getSelectedItem();
		String text = (String)item.getValue();
		((Textbox)getFellow("textfield")).setValue(text);
	}
	
	public void closeTheWindow(){
		this.setVisible(false);
		this.getParent().removeChild(this);
	}
	
}
