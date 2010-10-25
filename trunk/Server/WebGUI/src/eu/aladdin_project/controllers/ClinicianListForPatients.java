package eu.aladdin_project.controllers;

import org.zkoss.zul.Radio;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Window;

@SuppressWarnings("serial")
public class ClinicianListForPatients extends Window {
	
	public ClinicianListForPatients(){
		
	}
	
	public void setClinician(){
		Radiogroup rgroup = (Radiogroup)this.getFellow("respo_rgroup");
		Radio radio = rgroup.getSelectedItem();
		((PattientControllerWindow)this.getParent()).setResponsibleClinician(radio.getValue(), radio.getLabel());
		this.getParent().removeChild(this);
	}

}
