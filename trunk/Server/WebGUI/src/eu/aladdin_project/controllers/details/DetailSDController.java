package eu.aladdin_project.controllers.details;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;

import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.PatientCarer;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.SocioDemographicData;
import eu.aladdin_project.xsd.Task;

public class DetailSDController extends DetailPersonController{
	
	public DetailSDController(){
	}
	
	public void setControllerData(String id, PersonData data, SocioDemographicData sddata, String responsible, PatientCarer[] carers){
		super.setControllerData(id, data, sddata, responsible, carers);
		
		Listbox listgui = (Listbox)getFellow("taskrows");
		Label listlabel = (Label)getFellow("taskrowslbl");
		
		Listitem[] tasklist = this.createTaskRows();
		if(tasklist != null){
			for(int i = 0; i < tasklist.length; i++){
				listgui.appendChild(tasklist[i]);
			}
			listgui.setVisible(true);
			listlabel.setVisible(true);
		}
		
		
	}
	
	protected Listitem getSDItem(){
		Listitem lst1 = new Listitem();
		String text = Labels.getLabel("common.personal.data");
		Listcell cell1 = new Listcell(text);
		lst1.appendChild(cell1);
		
		String sddatavalue = this.currentsd.getGender().getDescription()+" ("+this.currentsd.getAge()+")";
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
		sddatavalue += ", "+this.currentsd.getMaritalStatus().getDescription()+" "+text5+this.currentsd.getLivingWith().getDescription();
		
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
		btn1.setHref("/carers");
		
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
	
	public Listitem[] createTaskRows() {
		StorageComponentProxy proxy = new StorageComponentProxy();
		Session ses = Sessions.getCurrent();
		String userid = (String)ses.getAttribute("userid");
		//Calendar calfrom = new GregorianCalendar();
		//Calendar calto = new GregorianCalendar();
		//calto.setTimeInMillis(calfrom.getTimeInMillis()+604800000);
		Listitem[] ret = null;
		Calendar calfrom = new GregorianCalendar();
		((GregorianCalendar)calfrom).set(2005, 8, 5);
		Calendar calto = new GregorianCalendar();
		((GregorianCalendar)calto).set(2015, 8, 15);
		try{
			//Task[] tasklist = proxy.getUserPlannedTasks(this.currentid, calfrom, calto, userid);
			Task[] tasklist = proxy.getUserPlannedTasks("42", calfrom, calto, userid);
			System.out.println("TASKLIST SIZE: "+tasklist.length);
			ret = new Listitem[tasklist.length];
			
			for(int i = 0; i<tasklist.length; i++){
				Listitem item = new Listitem();
				Listcell cell1 = new Listcell(tasklist[i].getID());
				Listcell cell2 = new Listcell(tasklist[i].getTaskType().getDescription());
				Listcell lab2 = new Listcell(tasklist[i].getTaskStatus().getCode());
				Listcell lab3 = new Listcell(tasklist[i].getObjectID());
				GregorianCalendar calendar1 = new GregorianCalendar();
				calendar1.setTimeInMillis(tasklist[i].getDateTimeAssigned().getTimeInMillis());
				
				GregorianCalendar calendar2 = new GregorianCalendar();
				calendar2.setTimeInMillis(tasklist[i].getDateTimeFulfilled().getTimeInMillis());
				
				Listcell lab4 = new Listcell(calendar1.get(Calendar.DATE)+"-"+calendar1.get(Calendar.MONTH)+"-"+calendar1.get(Calendar.YEAR));
				Listcell lab5 = new Listcell(calendar2.get(Calendar.DATE)+"-"+calendar2.get(Calendar.MONTH)+"-"+calendar2.get(Calendar.YEAR));
				item.appendChild(cell1);
				item.appendChild(cell2);
				item.appendChild(lab2);
				item.appendChild(lab3);
				item.appendChild(lab4);
				item.appendChild(lab5);
				ret[i]=item;
			}
			return ret;
		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;
	}

}
