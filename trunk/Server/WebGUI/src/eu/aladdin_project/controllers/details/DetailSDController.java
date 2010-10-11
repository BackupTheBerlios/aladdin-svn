package eu.aladdin_project.controllers.details;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.zkoss.calendar.Calendars;
import org.zkoss.calendar.impl.SimpleCalendarEvent;
import org.zkoss.calendar.impl.SimpleCalendarModel;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Button;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.PatientCarer;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.SocioDemographicData;
import eu.aladdin_project.xsd.Task;

@SuppressWarnings("serial")
public class DetailSDController extends DetailPersonController{
	private SimpleCalendarModel calmodel = null;
	private Calendars calendars = null;
	protected int usertype;
	
	public DetailSDController(){
		this.usertype = SystemDictionary.USERTYPE_CARER_INT;
	}
	
	public void setControllerData(String id, PersonData data, SocioDemographicData sddata, String responsible, PatientCarer[] carers){
		//this.calendars = (Calendars)this.getFellow("cal");
		super.setControllerData(id, data, sddata, responsible, carers);
		//this.refreshCalendarData();
	}
	
	protected Listitem getSDItem(){
		Listitem lst1 = new Listitem();
		String text = Labels.getLabel("common.personal.data");
		Listcell cell1 = new Listcell(text);
		lst1.appendChild(cell1);
		
		String sddatavalue = SystemDictionary.getGenderLabel(this.currentsd.getGender().getCode())+" ("+this.currentsd.getAge()+" "+Labels.getLabel("common.years.old")+")";
		if(this.currentsd.getChildren().toString().equals("0")){
			String text2 = Labels.getLabel("common.children.no");
			sddatavalue += " "+text2;
		}else if(this.currentsd.getChildren().toString().equals("1")){
			String text3 = Labels.getLabel("common.children.one");
			sddatavalue += " "+text3;
		}else{
			String text4 = Labels.getLabel("common.children.more",new String[]{this.currentsd.getChildren().toString()});
			//sddatavalue += " with "+this.currentsd.getChildren().toString()+" children";
			sddatavalue += " "+text4;
		}
		String text5 = Labels.getLabel("patients.form.sd.living");
		sddatavalue += ", "+ SystemDictionary.getMaritalStatuspeLabel(this.currentsd.getMaritalStatus().getCode())+" "+text5+" "+SystemDictionary.getLivingWithLabel(this.currentsd.getLivingWith().getCode());
		
		Listcell cell2 = new Listcell(sddatavalue);
		lst1.appendChild(cell2);
		
		return lst1;
	}
	
	public Button[] createActionButtons() {
		Button btn = new Button();
		String text = Labels.getLabel("carers.update.title");
		btn.setLabel(text);
		btn.setHref("/carers/update.zul?carerid="+this.currentid);
		
		Button btn1 = new Button();
		String text2 = Labels.getLabel("common.tasks.new");
		btn1.setLabel(text2);
		btn1.setHref("/carers/newtask.zul?carerid="+this.currentid);
		
		Button[] ret = new Button[2];
		ret[0] = btn;
		ret[1] = btn1;
		
		return ret;
	}

	public Listitem[] createDataRows() {
		Listitem[] rows = this.getPersonDataListItems();
		Listitem[] ret = new Listitem[rows.length+1];
		
		ret[0]=rows[0];
		ret[1]=this.getSDItem();
		for(int i = 2; i<ret.length; i++){
			ret[i]=rows[i-1];
		}
		return ret;
	}
	
	public void refreshCalendarData(){
		StorageComponentProxy proxy = new StorageComponentProxy();
		Session ses = Sessions.getCurrent();
		String userid = (String)ses.getAttribute("userid");
		if(this.calendars == null){
			this.calendars = (Calendars)this.getFellow("cal");
		}
		Calendar calfrom = new GregorianCalendar();
		calfrom.setTime(this.calendars.getBeginDate());
		Calendar calto = new GregorianCalendar();
		calto.setTime(this.calendars.getEndDate());
		try{
			OperationResult currentor = proxy.getUserIdByPersonId(this.currentid, this.usertype, userid);
			Task[] tasklist = proxy.getUserPlannedTasks(currentor.getCode(), calfrom, calto, userid);
			this.calmodel = new SimpleCalendarModel();
			
				for(int i = 0; i<tasklist.length; i++){
					GregorianCalendar calendar1 = new GregorianCalendar();
					calendar1.setTimeInMillis(tasklist[i].getDateTimeAssigned().getTimeInMillis());
					
					GregorianCalendar calendar2 = new GregorianCalendar();
					calendar2.setTimeInMillis(tasklist[i].getDateTimeFulfilled().getTimeInMillis());
					
					SimpleCalendarEvent clevent = new SimpleCalendarEvent();
					clevent.setBeginDate(calendar1.getTime());
					clevent.setContent("");
					clevent.setEndDate(new Date(calendar1.getTime().getTime()+3600000));
					clevent.setLocked(true);
					clevent.setTitle(SystemDictionary.getTaskTypeLabel(tasklist[i].getTaskType().getCode()));
					clevent.setContent(SystemDictionary.getTaskTypeLabel(tasklist[i].getTaskType().getCode()));
					switch(Integer.parseInt(tasklist[i].getTaskStatus().getCode())){
					case SystemDictionary.TASK_STATUS_CANCELLED_INT:
						clevent.setHeaderColor("red");
						clevent.setContentColor("red");
						break;
					case SystemDictionary.TASK_STATUS_COMPLETED_INT:
						clevent.setHeaderColor("blue");
						clevent.setContentColor("blue");
						break;
					case SystemDictionary.TASK_STATUS_PENDING_INT:
						clevent.setHeaderColor("black");
						clevent.setContentColor("black");
						break;
					default:
						clevent.setHeaderColor("yellow");
						clevent.setContentColor("yellow");
						break;
					}
					Map<String, String> params = new HashMap<String,String>();
					params.put("user", userid);
					params.put("objid", tasklist[i].getObjectID());
					params.put("exec", tasklist[i].getExecutorID());
					params.put("assign", tasklist[i].getAssignerID());
					params.put("task", tasklist[i].getID());
					params.put("status", tasklist[i].getTaskStatus().getCode());
					clevent.setParams(params);
					this.calmodel.add(clevent);
				}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			Calendars calendar = (Calendars)getFellow("cal");
			calendar.setModel(this.calmodel);
		}
	}

}
