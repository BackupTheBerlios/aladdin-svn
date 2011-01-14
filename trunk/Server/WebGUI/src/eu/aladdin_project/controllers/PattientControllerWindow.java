package eu.aladdin_project.controllers;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.zkoss.zhtml.Tbody;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.util.resource.Labels;
import org.zkoss.zul.Button;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Textbox;

import eu.aladdin_project.ErrorDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.controllers.AladdinFormControllerWindow.SimpleFieldData;
import eu.aladdin_project.xsd.Carer;
import eu.aladdin_project.xsd.Clinician;
import eu.aladdin_project.xsd.Consulter;
import eu.aladdin_project.xsd.GeneralPractitioner;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.Patient;
import eu.aladdin_project.xsd.PatientCarer;
import eu.aladdin_project.xsd.PatientCarerList;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.SocialWorker;
import eu.aladdin_project.xsd.SocioDemographicData;

public class PattientControllerWindow extends SDFormControllerWindow{

	private static final long serialVersionUID = 3014122995824061686L;
	private CarerListWindowController clist = null;
	private String currentresp = null;
	private SocialWorker currentsocialworker = null;
	private Consulter currentconsulter = null;
	private GeneralPractitioner currentgeneralpracticioner = null;
	private PatientCarer[] currentcarers = null;
	
	/**
	 * Default constructor
	 */
	public PattientControllerWindow(){
	}
	
	public PattientControllerWindow(Patient current){
		this.currentid = current.getID();
		this.currentdata = current.getPersonData();
		this.currentsd = current.getSD_Data();
		this.currentresp = current.getResponsibleClinicianID();
		this.currentsocialworker = current.getSocialWorker();
		this.currentconsulter = current.getConsulterInCharge();
		this.currentgeneralpracticioner = current.getGeneralPractitioner();
		this.currentcarers = current.getPatientCarerList().getPatientCarer();
		
		this.addPersonFieldsValues();
		this.addAddressFieldsValues();
		this.addCommunicationFieldsValues();
		this.addSocioDemographicDataFieldsValue();
		this.addResponsibleClinicianFieldValues();
		this.addCarerFieldValues();
		this.addSocialWorkerConsulterAndGPFieldsValues();
		this.appendChild(this.createUpdateButton());
	}
	
	/**
	 * Build form instructions to be executed
	 */
	public void buildForm(){
		this.addResponsibleClinicianField();
		this.addPersonFields();
		this.addAddressFields();
		this.addCommunicationFields();
		this.addSocioDemographicDataFields();
		this.addCarerField();
		this.addSocialWorkerConsulterAndGPFields();
	}
	
	/**
	 * Submit function: Used on the view layer to create a new Patient (using the StorageComponentProxy).
	 * 
	 * @return void but saves a new Patient on the server
	 */
	public void sendPatient(boolean newpatient){
		OperationResult result = null;
		String resClinic = ((Textbox)getFellow("pat_respo")).getValue();
		String carerId = ((Textbox)getFellow("pat_carid")).getValue();
		
		//Getting information from form fields
		SocioDemographicData sdData = this.getSocioDemographicData();
		PersonData personData = this.getPersonData();
		SocialWorker socialw = this.getSocialWorkerData();
		Consulter consulter = this.getConsulterData();
		GeneralPractitioner gralprac = this.getGeneralPracticionerData();
		try{
			StorageComponentProxy proxy = new StorageComponentProxy();
			Session ses = Sessions.getCurrent();
			String id = (String)ses.getAttribute("userid");
			Carer car2set = proxy.getCarer(carerId, id);
			
			PatientCarer[] listcarers = new PatientCarer[1];
			listcarers[0]=new PatientCarer(car2set,true);
			PatientCarerList oflist = new PatientCarerList(listcarers);
			Patient patient = new Patient("",personData,sdData, resClinic, oflist, socialw, consulter, gralprac);
			if(newpatient){
				result = proxy.createPatient(patient, id);
			}else{
				patient.setID(this.currentid);
				result = proxy.updatePatient(patient, id);
			}
		}catch (RemoteException re) {
			ErrorDictionary.redirectWithError("/carers/?error="+ErrorDictionary.CREATE_PATIENT_SERVER);
			re.printStackTrace();
		}catch (Exception e){
			//TODO Set message to "Unknow error creating patient"
			e.printStackTrace();
		}finally{
			//TODO Show message on the following page.
			if(result != null){
				String prin = "CODE: "+result.getCode()+"\nDESC: "+result.getDescription()+"\nSTATUS: "+result.getStatus().toString();
				System.out.println(prin);
			}
			Executions.getCurrent().sendRedirect("/patients");
		}
		
	}
	
	/**
	 * Creates a modal window to select a primary carer for the patient
	 * 
	 * @throws InterruptedException
	 */
	public void createDialog() throws InterruptedException{
		if(this.clist == null){
			this.clist = new CarerListWindowController(this);
			this.appendChild(this.clist);
			this.clist.doModal();
		}else{
			this.clist.doModal();
		}
	}
	
	public void createClinicianDialog() throws InterruptedException{
		ClinicianListForPatients respolist = (ClinicianListForPatients)Executions.getCurrent().createComponents("/patients/clinlist.zul", this, null);
		respolist.doModal();
	}
	
	/**
	 * This method is used to set Carer form fields with information from the modal dialog fields
	 * 
	 * @param carerID
	 * @param carerName
	 */
	public void setCarer(String carerID, String carerName){
		((Textbox)this.getFellow("pat_carid")).setValue(carerID);
		((Textbox)this.getFellow("pat_carname")).setValue(carerName);
	}
	
	public void setResponsibleClinician(String clinID, String clinName){
		((Textbox)this.getFellow("pat_respo")).setValue(clinID);
		((Textbox)this.getFellow("pat_respo_lbl")).setValue(clinName);
	}
	
	/**
	 * Protected function to add a responsible clinician field to the window.
	 */
	protected void addResponsibleClinicianField(){
		String respo = Labels.getLabel("patients.form.responsible");
		
		ArrayList<SimpleFieldData> rowsA = new ArrayList<SimpleFieldData>();
		rowsA.add(new SimpleFieldData(respo, "pat_respo_lbl"));
		
		Grid pgrid = new Grid();
		pgrid.setSclass("grid");
		this.appendColumns(pgrid);
			
		Rows rows = new Rows();
		//this.appendTextboxFields(rowsA, rows);
		
		Row rowhidf = new Row();
		//Textbox tboxhid = new Textbox();
		//tboxhid.setId("pat_respo");
		//tboxhid.setVisible(false);
		Label lbl_ins = new Label(respo);
		rowhidf.appendChild(lbl_ins);
		Hbox hbox1 = new Hbox();
		Textbox tbox1 = new Textbox();
		tbox1.setId("pat_respo_lbl");
		tbox1.setReadonly(true);
		tbox1.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				createClinicianDialog();
			}
		});
		
		Textbox tbox2 = new Textbox();
		tbox2.setVisible(false);
		tbox2.setId("pat_respo");
		
		hbox1.appendChild(tbox1);
		hbox1.appendChild(tbox2);
		rowhidf.appendChild(hbox1);
		rows.appendChild(rowhidf);
		
		pgrid.appendChild(rows);
		this.appendChild(pgrid);
	}
	
	protected void addResponsibleClinicianFieldValues(){
		String id = (String)Sessions.getCurrent().getAttribute("userid");
		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			Clinician clinician = proxy.getClinician(this.currentresp, id);
			((Textbox)getFellow("pat_respo")).setValue(this.currentresp);
			((Textbox)getFellow("pat_respo_lbl")).setValue(clinician.toString());
		}catch(RemoteException re){
			((Textbox)getFellow("pat_respo_lbl")).setValue("Not available");
		}
	}
	
	/**
	 * This method appends a carer field to the window.
	 * Button will open a modal dialog to select a carer
	 * 
	 * @see CarerListWindowController
	 */
	protected void addCarerField(){
		String carertitle = Labels.getLabel("patients.carer.title");
		String carerlabel = Labels.getLabel("patients.carer.label");
		
		Grid pgrid = new Grid();
		pgrid.setSclass("grid");
		this.appendColumns(pgrid);
			
		Rows rows = new Rows();

		this.appendSubFormTitleRow(carertitle, rows);
		
		Row row = new Row();
		Label lab = new Label();
		lab.setValue(carerlabel);
		row.appendChild(lab);
		
		Hbox hbox01 = new Hbox();
		
		Textbox tbox = new Textbox();
		tbox.setId("pat_carname");
		tbox.setReadonly(true);
		
		Textbox tbox2 = new Textbox();
		tbox2.setId("pat_carid");
		tbox2.setVisible(false);
		tbox2.setReadonly(true);
		
		tbox.addEventListener("onClick", new EventListener(){
			public void onEvent(Event arg0) throws Exception {
				createDialog();
			}
		});
		
		hbox01.appendChild(tbox);
		hbox01.appendChild(tbox2);
		row.appendChild(hbox01);

		rows.appendChild(row);
		
		pgrid.appendChild(rows);
		this.appendChild(pgrid);
	}
	
	protected void addCarerFieldValues(){
		((Textbox)getFellow("pat_carid")).setValue(this.currentcarers[0].getCarer().getID());
		((Textbox)getFellow("pat_carname")).setValue(this.currentcarers[0].getCarer().getPersonData().getName()+", "+this.currentcarers[0].getCarer().getPersonData().getSurname());
	}
	
	protected void addSocialWorkerConsulterAndGPFields(){
		Grid pgrid1 = new Grid();
		Grid pgrid2 = new Grid();
		Grid pgrid3 = new Grid();
		pgrid1.setSclass("grid");
		pgrid2.setSclass("grid");
		pgrid3.setSclass("grid");
		this.appendColumns(pgrid1);
		this.appendColumns(pgrid2);
		this.appendColumns(pgrid3);
			
		Rows rows1 = new Rows();
		Rows rows2 = new Rows();
		Rows rows3 = new Rows();

		this.appendSubFormTitleRow("Social Workrer Info", rows1);
		this.appendSubFormTitleRow("Consulter Info", rows2);
		this.appendSubFormTitleRow("General Practicioner Info", rows3);
		
		ArrayList<SimpleFieldData> rowsA = new ArrayList<SimpleFieldData>();
		rowsA.add(new SimpleFieldData("Name", "pat_swname"));
		rowsA.add(new SimpleFieldData("E-mail", "pat_swmail"));
		rowsA.add(new SimpleFieldData("Phone", "pat_swphone"));
		
		ArrayList<SimpleFieldData> rowsB = new ArrayList<SimpleFieldData>();
		rowsB.add(new SimpleFieldData("Name", "pat_consname"));
		rowsB.add(new SimpleFieldData("E-mail", "pat_consmail"));
		rowsB.add(new SimpleFieldData("Phone", "pat_consphone"));
		
		ArrayList<SimpleFieldData> rowsC = new ArrayList<SimpleFieldData>();
		rowsC.add(new SimpleFieldData("Name", "pat_gpname"));
		rowsC.add(new SimpleFieldData("E-mail", "pat_gpmail"));
		rowsC.add(new SimpleFieldData("Phone", "pat_gpphone"));
		
		this.appendTextboxFields(rowsA, rows1);
		this.appendTextboxFields(rowsB, rows2);
		this.appendTextboxFields(rowsC, rows3);
		
		pgrid1.appendChild(rows1);
		pgrid2.appendChild(rows2);
		pgrid3.appendChild(rows3);
		this.appendChild(pgrid1);
		this.appendChild(pgrid2);
		this.appendChild(pgrid3);
	}
	
	protected void addSocialWorkerConsulterAndGPFieldsValues(){
		((Textbox)getFellow("pat_swname")).setValue(this.currentsocialworker.getName());
		((Textbox)getFellow("pat_swmail")).setValue(this.currentsocialworker.getEmail());
		((Textbox)getFellow("pat_swphone")).setValue(this.currentsocialworker.getPhone());
		((Textbox)getFellow("pat_consname")).setValue(this.currentconsulter.getName());
		((Textbox)getFellow("pat_consmail")).setValue(this.currentconsulter.getEmail());
		((Textbox)getFellow("pat_consphone")).setValue(this.currentconsulter.getPhone());
		((Textbox)getFellow("pat_gpname")).setValue(this.currentgeneralpracticioner.getName());
		((Textbox)getFellow("pat_gpmail")).setValue(this.currentgeneralpracticioner.getEmail());
		((Textbox)getFellow("pat_gpphone")).setValue(this.currentgeneralpracticioner.getPhone());
	}
	
	protected SocialWorker getSocialWorkerData(){
		String name = ((Textbox)getFellow("pat_swname")).getValue();
		String mail = ((Textbox)getFellow("pat_swmail")).getValue();
		String phone = ((Textbox)getFellow("pat_swphone")).getValue();
		return new SocialWorker(name, phone, mail);
	}
	
	protected Consulter getConsulterData(){
		String name = ((Textbox)getFellow("pat_consname")).getValue();
		String mail = ((Textbox)getFellow("pat_consmail")).getValue();
		String phone = ((Textbox)getFellow("pat_consphone")).getValue();
		return new Consulter(name, phone, mail);
	}
	
	protected GeneralPractitioner getGeneralPracticionerData(){
		String name = ((Textbox)getFellow("pat_gpname")).getValue();
		String mail = ((Textbox)getFellow("pat_gpmail")).getValue();
		String phone = ((Textbox)getFellow("pat_gpphone")).getValue();
		return new GeneralPractitioner(name, phone, mail);
	}
	
	public Button createUpdateButton(){
		Button btn = new Button();
		String text = Labels.getLabel("patients.update.title");
		btn.setLabel(text);
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				sendPatient(false);
			}
		});
		
		return btn;
	}
}
