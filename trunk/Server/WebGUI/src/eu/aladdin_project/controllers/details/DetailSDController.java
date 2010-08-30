package eu.aladdin_project.controllers.details;

import org.zkoss.zul.Button;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;

public class DetailSDController extends DetailPersonController{
	
	public DetailSDController(){
	}
	
	protected Listitem getSDItem(){
		Listitem lst1 = new Listitem();
		Listcell cell1 = new Listcell("Personal Data");
		lst1.appendChild(cell1);
		
		String sddatavalue = this.currentsd.getGender().getDescription()+" ("+this.currentsd.getAge()+")";
		if(this.currentsd.getChildren().toString().equals("0")){
			sddatavalue += " without children";
		}else if(this.currentsd.getChildren().toString().equals("1")){
			sddatavalue += " with 1 child";
		}else{
			sddatavalue += " with "+this.currentsd.getChildren().toString()+" children";
		}
		sddatavalue += ", "+this.currentsd.getMaritalStatus().getDescription()+" living "+this.currentsd.getLivingWith().getDescription();
		
		Listcell cell2 = new Listcell(sddatavalue);
		lst1.appendChild(cell2);
		
		return lst1;
	}

	public Button[] createActionButtons() {
		Button btn = new Button();
		btn.setLabel("Modify Carer");
		btn.setHref("/carers/update.zul?carerid="+this.currentid);
		
		Button btn1 = new Button();
		btn1.setLabel("Assign New Task");
		btn.setHref("/carers");
		
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

}
