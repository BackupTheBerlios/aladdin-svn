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
import eu.aladdin_project.xsd.Carer;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.SocioDemographicData;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.User;

public class CarerControllerWindow extends SDFormControllerWindow{

	private static final long serialVersionUID = 7241911276370717234L;

	/**
	 * Default constructor
	 */
	public CarerControllerWindow(){
		this.buildForm();
	}
	
	public CarerControllerWindow(Carer current, boolean details){
		this.currentid = current.getID();
		this.currentdata = current.getPersonData();
		this.currentsd = current.getSD_Data();
		this.detailsmode = details;
		this.buildForm();
		
		this.addPersonFieldsValues();
		this.addAddressFieldsValues();
		this.addCommunicationFieldsValues();
		this.addSocioDemographicDataFieldsValue();
		if(this.detailsmode){
			this.appendChild(this.createEditButton());
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
		this.addSocioDemographicDataFields();
	}
	
	/**
	 * Submit function: Used on the view layer to create a new Patient (using the StorageComponentProxy).
	 * 
	 * @return void but saves a new Patient on the StorageComponent
	 */
	public void createCarer(){
		//Getting information from form fields
		PersonData personData = this.getPersonData();
		SocioDemographicData sdData = this.getSocioDemographicData();
		//TODO isPrimary control on Communication and Addresses
		
		Carer carer = new Carer("",personData,sdData);
		try{
			StorageComponentProxy proxy = new StorageComponentProxy();
			Session ses = Sessions.getCurrent();
			String id = (String)ses.getAttribute("userid");
			OperationResult result = proxy.createCarer(carer, id);
			result = proxy.createUser(new User("", new SystemParameter(SystemDictionary.USERTYPE_CARER,""), result.getCode(), carer.getPersonData().getSurname(), carer.getPersonData().getSurname()));
		}catch (RemoteException re) {
			ErrorDictionary.redirectWithError("/carers/?error="+ErrorDictionary.CREATE_CARER_SERVER);
		}catch (Exception e){
			//TODO Set message to "Unknow error creating carer"
			e.printStackTrace();
		}finally{
			//TODO Show message on the following page.
			Executions.getCurrent().sendRedirect("/carers");
		}
	}
	
	public void updateCarer(){
		//Getting information from form fields
		PersonData personData = this.getPersonData();
		SocioDemographicData sdData = this.getSocioDemographicData();
		//TODO isPrimary control on Communication and Addresses
		
		Carer carer = new Carer(this.currentid,personData,sdData);
		try{
			StorageComponentProxy proxy = new StorageComponentProxy();
			Session ses = Sessions.getCurrent();
			String id = (String)ses.getAttribute("userid");
			proxy.updateCarer(carer, id);
		}catch (RemoteException re) {
			ErrorDictionary.redirectWithError("/carers/?error="+ErrorDictionary.CREATE_CARER_SERVER);
		}catch (Exception e){
			//TODO Set message to "Unknow error creating carer"
			e.printStackTrace();
		}finally{
			//TODO Show message on the following page.
			Executions.getCurrent().sendRedirect("/carers");
		}
	}
	
	public Button createUpdateButton(){
		Button btn = new Button();
		String text = Labels.getLabel("carers.update.title");
		btn.setLabel(text);
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				updateCarer();
			}
		});
		
		return btn;
	}
	
	public Button createEditButton(){
		Button btn = new Button();
		String text = Labels.getLabel("carers.edit");
		btn.setLabel(text);
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				Executions.getCurrent().sendRedirect("/carers/update.zul?carerid="+currentid);
			}
		});
		
		return btn;
	}
}
