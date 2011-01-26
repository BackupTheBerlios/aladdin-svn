package eu.aladdin_project.controllers;

import java.rmi.RemoteException;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;

import eu.aladdin_project.ErrorDictionary;
import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.Clinician;
import eu.aladdin_project.xsd.Identifier;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.User;

public class ClinicianControllerWindow extends AladdinFormControllerWindow{

	private static final long serialVersionUID = 2164524095371327016L;

	/**
	 * Default constructor
	 */
	public ClinicianControllerWindow(){
		this.buildForm();
	}
	
	public ClinicianControllerWindow(Clinician current, boolean details){
		this.currentid = current.getID();
		this.currentdata = current.getPersonData();
		this.detailsmode = details;
		
		this.buildForm();
		
		this.addPersonFieldsValues();
		this.addAddressFieldsValues();
		this.addCommunicationFieldsValues();
		if(this.detailsmode){
			Boolean isadmin = (Boolean)Sessions.getCurrent().getAttribute("isadmin");
			if(isadmin){
				this.appendChild(this.createEditButton());
			}
		}else{
			this.appendChild(this.createUpdateButton());
		}
	}
	
	/**
	 * Build form instructions to be executed
	 */
	public void buildForm(){
		this.addPersonFields();
		this.addAddressFields();
		this.addCommunicationFields();
	}
	
	/**
	 * Function to be executed on "Save" button click
	 */
	public void createClinician(){
		//Getting information from form fields
		PersonData personData = this.getPersonData();
		
		//Create ID
		Identifier ident = personData.getIdentifierList().getIdentifier()[0];
		String clinID = ident.getType()+'-'+ident.getNumber();
		
		//TODO isPrimary control on Communication and Addresses
		
		Clinician clinic = new Clinician(clinID,personData);
		try{
			StorageComponentProxy proxy = new StorageComponentProxy();
			Session ses = Sessions.getCurrent();
			String id = (String)ses.getAttribute("userid");
			OperationResult result = proxy.createClinician(clinic, id);
			result = proxy.createUser(new User("", new SystemParameter(SystemDictionary.USERTYPE_CLINICIAN,""), result.getCode(), clinic.getPersonData().getSurname(), clinic.getPersonData().getSurname()));
		}catch (RemoteException re) {
			ErrorDictionary.redirectWithError("/carers/?error="+ErrorDictionary.CREATE_CLINICIAN_SERVER);
		}catch (Exception e){
			//TODO Set message to "Unknow error creating clinician"
		}finally{
			//TODO Show message on the following page.
			Executions.getCurrent().sendRedirect("/clinicians");
		}
	}
	
	public void updateClinician(){
		PersonData personData = this.getPersonData();
		
		Clinician clinic = new Clinician(this.currentid,personData);
		try{
			StorageComponentProxy proxy = new StorageComponentProxy();
			Session ses = Sessions.getCurrent();
			String id = (String)ses.getAttribute("userid");
			proxy.updateClinician(clinic, id);
		}catch (RemoteException re) {
			//TODO Set message to "Unable to update user. Server is not responding"
		}catch (Exception e){
			//TODO Set message to "Unknown error updating clinician"
		}finally{
			//TODO Show message on the following page.
			Executions.getCurrent().sendRedirect("/clinicians");
		}
	}
	
	public Button createUpdateButton(){
		Button btn = new Button();
		String text = Labels.getLabel("clinicians.update.title");
		btn.setLabel(text);
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				updateClinician();
			}
		});
		
		return btn;
	}
	
	public Button createEditButton(){
		Button btn = new Button();
		String text = Labels.getLabel("clinicians.edit");
		btn.setLabel(text);
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				Executions.getCurrent().sendRedirect("/clinicians/update.zul?clinid="+currentid);
			}
		});
		
		return btn;
	}
	
}
