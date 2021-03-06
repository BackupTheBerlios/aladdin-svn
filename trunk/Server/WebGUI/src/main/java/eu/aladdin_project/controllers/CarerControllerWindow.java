package eu.aladdin_project.controllers;

import java.rmi.RemoteException;
import java.util.Date;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.SuspendNotAllowedException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Separator;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Window;

import eu.aladdin_project.ErrorDictionary;
import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.controllers.details.ChangePassword;
import eu.aladdin_project.controllers.details.assessment.CarerAssessmentInfo;
import eu.aladdin_project.controllers.details.assessment.CarerAssessmentPopupController;
import eu.aladdin_project.xsd.Carer;
import eu.aladdin_project.xsd.CarerAssessment;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.SocioDemographicData;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.User;

/**
 * Public class built to manage Carrer forms to create and update carrer objects
 * @author Xavi Sarda (Atos Origin)
 */
public class CarerControllerWindow extends SDFormControllerWindow{

	private static final long serialVersionUID = 7241911276370717234L;
	private CarerAssessmentPopupController assessmentWindow;

	/**
	 * Default constructor
	 */
	public CarerControllerWindow(){
		this.buildForm();
	}
	
	/**
	 * Constructor for updating a Carer
	 * @param current Carer object to be updated
	 * @param details Boolean flag to let the called methods that they must be shown 
	 * in a proper way to update carers objects
	 */
	public CarerControllerWindow(Carer current, boolean details){
		this.currentid = current.getID();
		this.currentdata = current.getPersonData();
		this.currentsd = current.getSD_Data();
		this.detailsmode = details;
		this.buildForm();
		
		this.addPersonFieldsValues();
		this.addAddressFieldsValues();
		this.addCommunicationFieldsValues();
		this.addBirthdayFieldValue(this.currentsd.getBirthday());
		//this.addSocioDemographicDataFieldsValue();
		Hbox buttonshbox = new Hbox();
		if(this.detailsmode){
			buttonshbox.appendChild(this.createEditButton());
		}else{
			buttonshbox.appendChild(this.createUpdateButton());
		}
		Separator sep = new Separator();
		sep.setWidth("10px");
		sep.setOrient("horizontal");
		buttonshbox.appendChild(sep);
		buttonshbox.appendChild(this.createPasswordButton());
		this.appendChild(buttonshbox);
		this.getFellow("pat_uname").getParent().setVisible(false);
	}
	
	/**
	 * Build form instructions to be executed
	 */
	public void buildForm(){
		this.addErrorBox();
		this.addPersonFields();
		this.addAddressFields();
		this.addCommunicationFields();
		this.addBirthdayField();
		//this.addSocioDemographicDataFields();
	}
	
	/**
	 * Submit function: Used on the view layer to create a new Patient (using the StorageComponentProxy).
	 * 
	 * @return void but saves a new Patient on the StorageComponent
	 */
	public void createCarer(){
		Date birthd = ((Datebox)this.getFellow("pat_age")).getValue();
		//if(birthd == null){
		//	Window win = (Window)getFellow("internalformerror");
		//	((Label)win.getFellow("errorlbl")).setValue("You cannot create carers without their birthdate");
		//	getFellow("internalformerror").setVisible(true);
		//if(this.addresses == null || this.communications == null || this.addresses.length == 0 || this.communications.length == 0){
		//	
		//}else{
			//Getting information from form fields
			PersonData personData = this.getPersonData();
			//SocioDemographicData sdData = this.getSocioDemographicData();
			SocioDemographicData sdData = new SocioDemographicData();
			
			sdData.setBirthday(birthd);
			//TODO isPrimary control on Communication and Addresses
			Carer carer = new Carer("",personData,sdData);
			try{
				StorageComponentProxy proxy = new StorageComponentProxy();
				Session ses = Sessions.getCurrent();
				String id = (String)ses.getAttribute("userid");
				OperationResult result = proxy.createCarer(carer, id);
				String username = this.getUsername();
				User user = new User("", new SystemParameter(SystemDictionary.USERTYPE_CARER,""), result.getCode(), username, carer.getPersonData().getSurname().replaceAll("\\W", ""));
				result = proxy.createUser(user);
				if(result.getCode().equals("-2")){
					SystemDictionary.webguiLog("TRACE", "Error creating user");
					Window win = (Window)getFellow("internalformerror");
					((Label)win.getFellow("errorlbl")).setValue("Username not valid");
					getFellow("internalformerror").setVisible(true);
					SystemDictionary.webguiLog("TRACE", "Deleting Carer...");
					OperationResult newresult = proxy.deleteCarer(user.getPersonID(), id);
					SystemDictionary.webguiLog("TRACE", "Delete Carer result: "+newresult.getCode());
					return;
				}
				Executions.getCurrent().sendRedirect("/carers");
			}catch (RemoteException re) {
				ErrorDictionary.redirectWithError("/carers/?error="+ErrorDictionary.CREATE_CARER_SERVER);
			}catch (Exception e){
				ErrorDictionary.redirectWithError("/carers/?error="+ErrorDictionary.UNKOW_ERROR);
			}
		//}
	}
	
	/**
	 * Submit function: Used on the view layer to update an existing Patient 
	 * using the StorageComponentProxy appropriate call.
	 * @return void but saves a new Patient on the StorageComponent
	 */
	public void updateCarer(){
		//Getting information from form fields
		PersonData personData = this.getPersonData();
		//SocioDemographicData sdData = this.getSocioDemographicData();
		SocioDemographicData sdData = new SocioDemographicData();
		sdData.setBirthday(((Datebox)this.getFellow("pat_age")).getValue());
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
			ErrorDictionary.redirectWithError("/carers/?error="+ErrorDictionary.UNKOW_ERROR);
		}finally{
			//TODO Show message on the following page.
			Executions.getCurrent().sendRedirect("/carers");
		}
	}
	
	/**
	 * This method creates a button to update carers using the existing form
	 * @return Button object to be added to the form
	 */
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
	
	/**
	 * This method creates a button to allow modification to the current carer 
	 * using this form
	 * @return Button object to be added to the form
	 */
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
	
	public Button createPasswordButton(){
		Button btn = new Button("Change Password");
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				createPasswordDialog();
			}
		});
		return btn;
	}
	
	public void createPasswordDialog() throws SuspendNotAllowedException, InterruptedException, RemoteException{
		ChangePassword win = (ChangePassword)Executions.createComponents("password.zul", this, null);
		
		this.appendChild(win);
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		OperationResult ores = proxy.getUserIdByPersonId(this.currentid, SystemDictionary.USERTYPE_CARER_INT, userid);
		win.setuserid(ores.getCode());
		win.doModal();
	}
	
	public void viewAssessmentDetail(String assid, String carerid){
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		CarerAssessment assessment = null;
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		try{
			CarerAssessment[] info = proxy.getCarerAssessments(carerid, userid);
			for(int i = 0 ; i < info.length ; i++){
				if(info[i].getID().equals(assid)){
					assessment = info[i];
				}
			}
			if(assessment == null){
				throw new Exception("Assessment not found");
			}
			assessmentWindow = (CarerAssessmentPopupController)Executions.createComponents("assessmentcar.zul", this ,null);
			this.setAssessmentValues(assessmentWindow, assessment);
			assessmentWindow.setVisible(true);
			assessmentWindow.doModal();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void createAssessment() throws SuspendNotAllowedException, InterruptedException{
		assessmentWindow = (CarerAssessmentPopupController)Executions.createComponents("assessmentcar.zul", this ,null);
		this.turnAssessment2Form(assessmentWindow);
		assessmentWindow.setVisible(true);
		assessmentWindow.doModal();
	}
	
	protected void turnAssessment2Form(CarerAssessmentPopupController assessmentWindow){
		for(int i = 0; i <= 4 ; i++){
			if(i<10){
				assessmentWindow.getFellow("field0"+i).setVisible(false);
				assessmentWindow.getFellow("field0"+i+"_in").setVisible(true);
			}
		}
		assessmentWindow.getFellow("buttonrow").setVisible(true);
		assessmentWindow.getFellow("noformrow").setVisible(false);
		assessmentWindow.getFellow("datelabel").setVisible(false);
		((Textbox)assessmentWindow.getFellow("carerid")).setValue(this.currentid);
	}
	
	protected void setAssessmentValues(CarerAssessmentPopupController assessmentWindow, CarerAssessment assessment){
		CarerAssessmentInfo cassessment = new CarerAssessmentInfo(assessment);
		((Label)assessmentWindow.getFellow("field0")).setValue(cassessment.getID());
		((Label)assessmentWindow.getFellow("field1")).setValue(cassessment.getCarerID());
		((Label)assessmentWindow.getFellow("field00")).setValue(cassessment.getRelevantHealthProblem());
		((Label)assessmentWindow.getFellow("field01")).setValue(cassessment.getSeverityOfBurden().toString());
		((Label)assessmentWindow.getFellow("field02")).setValue(cassessment.getEmotionalOrMentalDisorders());
		((Label)assessmentWindow.getFellow("field03")).setValue(cassessment.getPsychoactiveDrugs());
		((Label)assessmentWindow.getFellow("field04")).setValue(cassessment.getQualityOfLife().toString());
		((Label)assessmentWindow.getFellow("field05")).setValue(cassessment.getDateOfAssessment());
		//((Label)assessmentWindow.getFellow("field26")).setValue(assessment);
	}
	
	public void addBirthdayFieldValue(Date d){
		((Datebox)this.getFellow("pat_age")).setValue(d);
	}
}
