package eu.aladdin_project.controllers.details;

import org.zkoss.util.resource.Labels;
import org.zkoss.zul.Button;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;

import eu.aladdin_project.xsd.PatientCarer;

public class DetailPatientController extends DetailSDController{

	public Button[] createActionButtons(){
		Button btn = new Button();
		String text = Labels.getLabel("patients.update.title");
		btn.setLabel(text);
		btn.setHref("/patients/update.zul?patid="+this.currentid);
		
		Button btn1 = new Button();
		String text2 = Labels.getLabel("common.tasks.new");
		btn1.setLabel(text2);
		btn.setHref("/patients");
		
		Button[] ret = new Button[2];
		ret[0] = btn;
		ret[1] = btn1;
		
		return ret;
	}
	
	public Listitem[] createDataRows(){
		Listitem[] rows = this.getPersonDataListItems();
		Listitem[] carerrows = this.getCarerListAsListItems();
		
		Listitem[] ret = new Listitem[rows.length+carerrows.length+2];
		
		ret[0]=rows[0];
		ret[1]=this.getSDItem();
		ret[2]=this.getCurrentResponsibleListItem();
		
		for(int i = 0; i<rows.length-1; i++){
			ret[i+3]=rows[i+1];
		}
		
		for(int ii = 0; ii < carerrows.length; ii++ ){
			ret[rows.length+2+ii]=carerrows[ii];
		}
		
		return ret;
	}
	
	protected Listitem getCurrentResponsibleListItem(){
		Listitem lst = new Listitem();
		String text = Labels.getLabel("patients.form.responsible");
		Listcell cell1 = new Listcell(text);
		Listcell cell2 = new Listcell(this.currentresponsible);
		
		lst.appendChild(cell1);
		lst.appendChild(cell2);
		
		return lst;
		
	}
	
	protected Listitem[] getCarerListAsListItems(){
		Listitem[] ret = new Listitem[this.currentcarers.length+1];
		Listitem title = new Listitem();
		String text = Labels.getLabel("menu.carers");
		Listcell cell1 = new Listcell(text);
		cell1.setSpan(2);
		title.appendChild(cell1);
		ret[0]=title;
		
		for(int i = 0; i<this.currentcarers.length; i++){
			PatientCarer carer = this.currentcarers[i];
			Listitem careritem = new Listitem();
			Listcell empty = new Listcell("");
			Listcell carername = new Listcell(carer.getCarer().getPersonData().getSurname()+", "+carer.getCarer().getPersonData().getName());
			careritem.appendChild(empty);
			careritem.appendChild(carername);
			ret[i+1]=careritem;
		}
		
		return ret;
	}
}
