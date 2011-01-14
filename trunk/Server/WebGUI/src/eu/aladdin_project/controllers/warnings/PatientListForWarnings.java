package eu.aladdin_project.controllers.warnings;

import org.zkoss.zul.Radio;

import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Window;

@SuppressWarnings("serial")
public class PatientListForWarnings extends Window{
	
	public PatientListForWarnings(){
		
	}
	
	public void setPatient(){
		Radiogroup rgroup = (Radiogroup)this.getFellow("respo_rgroup");
		Radio radio = rgroup.getSelectedItem();
		if(radio != null){
			WarningsWindowController wincon = (WarningsWindowController)this.getParent(); 
			wincon.setPatientForFilter(radio.getValue(), radio.getLabel());
			wincon.refreshWarnings();
		}
		this.getParent().removeChild(this);
	}
}
