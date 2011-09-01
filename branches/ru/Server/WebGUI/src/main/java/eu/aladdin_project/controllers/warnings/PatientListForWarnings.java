package eu.aladdin_project.controllers.warnings;

import org.zkoss.zul.Radio;

import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Window;

public class PatientListForWarnings extends Window{
	private static final long serialVersionUID = -3537252407835100621L;

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
