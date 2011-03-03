package eu.aladdin_project.controllers;

import org.zkoss.zul.Radio;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Window;

/**
 * This class is in charge of managing events from the Clinician list on the Patient form
 * @author Xavi Sarda (Atos Origin)
 */
public class ClinicianListForPatients extends Window {
	
	public ClinicianListForPatients(){
		
	}
	
	/**
	 * This method inserts the Clinician data into the patient form
	 */
	public void setClinician(){
		Radiogroup rgroup = (Radiogroup)this.getFellow("respo_rgroup");
		Radio radio = rgroup.getSelectedItem();
		((PattientControllerWindow)this.getParent()).setResponsibleClinician(radio.getValue(), radio.getLabel());
		this.getParent().removeChild(this);
	}

}
