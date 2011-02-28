package eu.aladdin_project.controllers.details;

import java.rmi.RemoteException;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.zkoss.calendar.Calendars;
import org.zkoss.calendar.impl.SimpleCalendarEvent;
import org.zkoss.calendar.impl.SimpleCalendarModel;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.SuspendNotAllowedException;
import org.zkoss.zul.Button;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.controllers.details.assessment.AssessmentPopupController;
import eu.aladdin_project.controllers.details.measurements.MeasurementPopupController;
import eu.aladdin_project.xsd.Carer;
import eu.aladdin_project.xsd.Clinician;
import eu.aladdin_project.xsd.Consulter;
import eu.aladdin_project.xsd.GeneralPractitioner;
import eu.aladdin_project.xsd.Measurement;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.PatientAssessment;
import eu.aladdin_project.xsd.PatientCarer;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.SocialWorker;
import eu.aladdin_project.xsd.SocioDemographicData;
import eu.aladdin_project.xsd.Task;

@SuppressWarnings("serial")
public class DetailPatientController extends DetailSDController{
	
	public AssessmentPopupController assessmentWindow;
	private Window removeMassivelyDialog;
	private Window weightMeasurementDialog;
	
	protected SimpleCalendarModel calmodel = null;
	protected Calendars calendars = null;
	protected SocialWorker currentsocialworker = null;
	protected Consulter currentconsulter = null;
	protected GeneralPractitioner currentgralprac = null;
	
	public DetailPatientController(){
		this.usertype = SystemDictionary.USERTYPE_PATIENT_INT;
	}
	
	public void setControllerData(String id, PersonData data, SocioDemographicData sddata, String responsible, PatientCarer[] carers){
		super.setControllerData(id, data, sddata, responsible, carers);
	}
	
	public void setControllerData(String id, PersonData data, SocioDemographicData sddata, String responsible, PatientCarer[] carers, SocialWorker sw, Consulter consulter, GeneralPractitioner gralpract){
		this.currentsocialworker = sw;
		this.currentconsulter = consulter;
		this.currentgralprac = gralpract;
		
		this.setControllerData(id, data, sddata, responsible, carers);
	}

	public Button[] createActionButtons(){
		Button btn = new Button();
		String text = Labels.getLabel("patients.update.title");
		btn.setLabel(text);
		btn.setHref("/patients/update.zul?patid="+this.currentid);
		
		Button btn1 = new Button();
		String text2 = Labels.getLabel("common.tasks.new");
		btn1.setLabel(text2);
		btn1.setHref("/patients");
		
		Button[] ret = new Button[2];
		ret[0] = btn;
		ret[1] = btn1;
		
		return ret;
	}
	
	public Listitem[] createDataRows(){
		Listitem[] rows = this.getPersonDataListItems();
		Listitem[] carerrows = this.getCarerListAsListItems();
		
		Listitem[] ret = new Listitem[rows.length+carerrows.length+2+3];
		
		ret[0]=rows[0];
		ret[1]=this.getSDItem();
		ret[2]=this.getCurrentResponsibleListItem();
		
		for(int i = 0 ; i < carerrows.length ; i++){
			ret[i+3]=carerrows[i];
		}
		for( int ii = 1 ; ii < rows.length ; ii++){
			ret[carerrows.length+2+ii]=rows[ii];
		}
		
		ret[ret.length-3] = this.getSocialWorkerListitem();
		ret[ret.length-2] = this.getConsulterListitem();
		ret[ret.length-1] = this.getGeneralPracticionerListitem();
		
		return ret;
	}
	
	public void viewAssessmentDetail(String assid, String patientid){
		StorageComponentProxy proxy = new StorageComponentProxy();
		PatientAssessment assessment = null;
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		try{
			PatientAssessment[] info = proxy.getPatientAssessments(patientid, userid);
			for(int i = 0 ; i < info.length ; i++){
				if(info[i].getID().equals(assid)){
					assessment = info[i];
				}
			}
			if(assessment == null){
				throw new Exception("Assessment not found");
			}
			assessmentWindow = (AssessmentPopupController)Executions.createComponents("assessment.zul", this ,null);
			this.setAssessmentValues(assessmentWindow, assessment);
			assessmentWindow.setVisible(true);
			assessmentWindow.doModal();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	protected void setAssessmentValues(AssessmentPopupController assessmentWindow, PatientAssessment assessment){
		((Label)assessmentWindow.getFellow("field00")).setValue(assessment.getID());
		((Label)assessmentWindow.getFellow("field01")).setValue(assessment.getPatientID());
		((Label)assessmentWindow.getFellow("field02")).setValue(assessment.getDateOfAssessment().toString());
		((Label)assessmentWindow.getFellow("field03")).setValue(assessment.getAetology().toString());
		((Label)assessmentWindow.getFellow("field04")).setValue(assessment.getTimeEllapsedSinceDiagnosed().toString());
		((Label)assessmentWindow.getFellow("field05")).setValue(assessment.getSeverity().toString());
		((Label)assessmentWindow.getFellow("field06")).setValue(assessment.getRelevantPathologyAntecedents());
		((Label)assessmentWindow.getFellow("field07")).setValue(assessment.getComorbidity());
		((Label)assessmentWindow.getFellow("field08")).setValue(assessment.getCharlsonComorbidityIndex().toString());
		((Label)assessmentWindow.getFellow("field09")).setValue(assessment.getBarthelIndex().toString());
		((Label)assessmentWindow.getFellow("field10")).setValue(assessment.getLawtonIndex().toString());
		((Label)assessmentWindow.getFellow("field11")).setValue(assessment.getMMSE().toString());
		((Label)assessmentWindow.getFellow("field12")).setValue(assessment.getMDRS().toString());
		((Label)assessmentWindow.getFellow("field13")).setValue(assessment.getBlessedScalePart1()==null?"Not set":assessment.getBlessedScalePart1().toString());
		((Label)assessmentWindow.getFellow("field14")).setValue(assessment.getBlessedScalePart2()==null?"Not set":assessment.getBlessedScalePart2().toString());
		((Label)assessmentWindow.getFellow("field15")).setValue(assessment.getBlessedScalePart3()==null?"Not set":assessment.getBlessedScalePart3().toString());
		((Label)assessmentWindow.getFellow("field16")).setValue(assessment.getChecklistMBP()==null?"Not set":assessment.getChecklistMBP().toString());
		((Label)assessmentWindow.getFellow("field17")).setValue(assessment.getNPQI_Severity()==null ? "Not set":assessment.getNPQI_Severity().toString());
		((Label)assessmentWindow.getFellow("field18")).setValue(assessment.getNPQI_Stress()==null?"Not set":assessment.getNPQI_Stress().toString());
		((Label)assessmentWindow.getFellow("field19")).setValue(assessment.getGDS()==null?"Not set":assessment.getGDS().toString());
		((Label)assessmentWindow.getFellow("field20")).setValue(assessment.getFalls()==null?"Not set":assessment.getFalls().toString());
		((Label)assessmentWindow.getFellow("field21")).setValue(assessment.getIncontinence()==null?"Not set":assessment.getIncontinence().toString());
		((Label)assessmentWindow.getFellow("field22")).setValue(assessment.getDelirium()==null?"Not set":assessment.getDelirium().toString());
		((Label)assessmentWindow.getFellow("field23")).setValue(assessment.getImmobility()==null?"Not set":assessment.getImmobility().toString());
		((Label)assessmentWindow.getFellow("field24")).setValue(assessment.getSensorialDeficits()==null?"Not set":assessment.getSensorialDeficits().toString());
		((Label)assessmentWindow.getFellow("field25")).setValue(assessment.getPharmacologicalTreatment()==null?"Not set":assessment.getPharmacologicalTreatment().toString());
		//((Label)assessmentWindow.getFellow("field26")).setValue(assessment);
	}
	
	protected Listitem getCurrentResponsibleListItem(){
		Listitem lst = new Listitem();
		String text = Labels.getLabel("patients.form.responsible");
		Listcell cell1 = new Listcell(text);
		StorageComponentProxy proxy = new StorageComponentProxy();
		String id = (String)Sessions.getCurrent().getAttribute("userid");
		try{
			Clinician clinician = proxy.getClinician(this.currentresponsible, id);
			Listcell cell2 = new Listcell(clinician.toString());
			
			lst.appendChild(cell1);
			lst.appendChild(cell2);
		}catch(RemoteException re){
			
		}
		return lst;
	}
	
	protected Listitem[] getCarerListAsListItems(){
		Listitem[] ret = new Listitem[this.currentcarers.length];
		String text = "Carer";
		for(int i = 0; i<this.currentcarers.length; i++){
			PatientCarer carer = this.currentcarers[i];
			Listitem careritem = new Listitem();
			Listcell empty = i==0 ? new Listcell(text) : new Listcell("");;
			Listcell carername = new Listcell(carer.getCarer().getPersonData().getSurname()+", "+carer.getCarer().getPersonData().getName());
			careritem.appendChild(empty);
			careritem.appendChild(carername);
			ret[i]=careritem;
		}
		
		return ret;
	}
	
	protected Listitem getSocialWorkerListitem(){
		Listitem sw = new Listitem();
		Listcell cell1 = new Listcell("Social worker");
		Listcell cell2 = null;
		if(this.currentsocialworker != null){
			cell2 = new Listcell(this.currentsocialworker.getName() + " ("+this.currentsocialworker.getPhone()+"/"+this.currentsocialworker.getEmail()+")");
		}else{
			cell2 = new Listcell("Undefined");
		}
		sw.appendChild(cell1);
		sw.appendChild(cell2);
		
		return sw;
	}
	
	protected Listitem getConsulterListitem(){
		Listitem sw = new Listitem();
		Listcell cell1 = new Listcell("Consulter");
		Listcell cell2 = null;
		if(this.currentconsulter != null){
			cell2 = new Listcell(this.currentconsulter.getName() + " ("+this.currentconsulter.getPhone()+"/"+this.currentconsulter.getEmail()+")");
		}else{
			cell2 = new Listcell("Undefined");
		}
		sw.appendChild(cell1);
		sw.appendChild(cell2);
		
		return sw;
	}
	
	protected Listitem getGeneralPracticionerListitem(){
		Listitem sw = new Listitem();
		Listcell cell1 = new Listcell("General Practicioner");
		Listcell cell2 = null;
		if(this.currentgralprac != null){
			cell2 = new Listcell(this.currentgralprac.getName() + " ("+this.currentgralprac.getPhone()+"/"+this.currentgralprac.getEmail()+")");
		}else{
			cell2 = new Listcell("Undefined");
		}
		sw.appendChild(cell1);
		sw.appendChild(cell2);
		
		return sw;
	}
	
	public void refreshCalendarData(){
		StorageComponentProxy proxy = new StorageComponentProxy();
		Session ses = Sessions.getCurrent();
		String userid = (String)ses.getAttribute("userid");
		if(this.calendars == null){
			this.calendars = (Calendars)this.getFellow("cal");
		}
		Calendar calfrom = new GregorianCalendar();
		calfrom.setTime(this.calendars.getBeginDate());
		Calendar calto = new GregorianCalendar();
		calto.setTime(this.calendars.getEndDate());
		try{
			Carer carer = this.currentcarers[0].getCarer();
			OperationResult currentor = proxy.getUserIdByPersonId(carer.getID(), SystemDictionary.USERTYPE_CARER_INT, userid);
			SystemDictionary.webguiLog("INFO", "USER TASKS: "+currentor.getCode());
			Task[] tasklist = proxy.getUserPlannedTasks(currentor.getCode(), calfrom, calto,SystemDictionary.getLocale() ,userid);
			this.calmodel = new SimpleCalendarModel();
			if(tasklist != null){
					SystemDictionary.webguiLog("DEBUG", "TASKS LENGHT: "+tasklist.length);
					OperationResult currentuserid = proxy.getUserIdByPersonId(this.currentid, SystemDictionary.USERTYPE_PATIENT_INT, userid);
					for(int i = 0; i<tasklist.length; i++){
						boolean add = true;
						SystemDictionary.webguiLog("TRACE", "COMPARE: "+tasklist[i].getObjectID()+":"+currentuserid.getCode());
						if(!tasklist[i].getObjectID().equals(currentuserid.getCode())){
							continue;
						}
						GregorianCalendar calendar1 = new GregorianCalendar();
						calendar1.setTimeInMillis(tasklist[i].getDateTimeAssigned().getTimeInMillis());
						
						GregorianCalendar calendar2 = new GregorianCalendar();
						calendar2.setTimeInMillis(tasklist[i].getDateTimeFulfilled().getTimeInMillis());
						
						SimpleCalendarEvent clevent = new SimpleCalendarEvent();
						clevent.setBeginDate(calendar1.getTime());
						clevent.setContent("");
						clevent.setEndDate(new Date(calendar1.getTime().getTime()+3600000));
						clevent.setLocked(true);
						clevent.setTitle(SystemDictionary.getTaskTypeLabel(tasklist[i].getTaskType().getCode()));
						clevent.setContent(SystemDictionary.getTaskTypeLabel(tasklist[i].getTaskType().getCode()));
						switch(Integer.parseInt(tasklist[i].getTaskStatus().getCode())){
						case SystemDictionary.TASK_STATUS_CANCELLED_INT:
							clevent.setHeaderColor("red");
							clevent.setContentColor("red");
							break;
						case SystemDictionary.TASK_STATUS_COMPLETED_INT:
							clevent.setHeaderColor("blue");
							clevent.setContentColor("blue");
							break;
						case SystemDictionary.TASK_STATUS_PENDING_INT:
							clevent.setHeaderColor("black");
							clevent.setContentColor("black");
							break;
						default:
							clevent.setHeaderColor("yellow");
							clevent.setContentColor("yellow");
							break;
						}
						Map<String, Object> params = new HashMap<String,Object>();
						params.put("user", userid);
						params.put("objid", tasklist[i].getObjectID());
						params.put("exec", tasklist[i].getExecutorID());
						params.put("assign", tasklist[i].getAssignerID());
						params.put("task", tasklist[i].getID());
						params.put("status", tasklist[i].getTaskStatus().getCode());
						params.put("url", tasklist[i].getURL());
						params.put("text", tasklist[i].getText());
						params.put("type", tasklist[i].getTaskType().getCode());
						if(tasklist[i].getTaskType().getCode().equals(SystemDictionary.TASK_TYPE_CARERQS) || tasklist[i].getTaskType().getCode().equals(SystemDictionary.TASK_TYPE_PATIENTQS)){
							if(tasklist[i].getQuestionnaire() != null){
								params.put("qid", tasklist[i].getQuestionnaire().getID());
								params.put("questionnaire", tasklist[i].getQuestionnaire());
							}else{
								add = false;
							}
						}
						clevent.setParams(params);
						if(add){
							this.calmodel.add(clevent);
						}
					}
				}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			Calendars calendar = (Calendars)getFellow("cal");
			calendar.setModel(this.calmodel);
		}
	}
	
	public void createRemoveMassivelyDialog() throws SuspendNotAllowedException, InterruptedException{
		removeMassivelyDialog = (Window)Executions.createComponents("removetasks.zul", this, null);
		removeMassivelyDialog.setTitle("New Task");
		removeMassivelyDialog.setVisible(true);
		removeMassivelyDialog.doModal();
		((Textbox)removeMassivelyDialog.getFellow("removepatientid")).setValue(this.currentid);
	}
	
	public void createWeightMeasurementDialog() throws SuspendNotAllowedException, InterruptedException{
		weightMeasurementDialog = (Window)Executions.createComponents("measurement.zul", this, null);
		weightMeasurementDialog.setVisible(true);
		weightMeasurementDialog.doModal();
		
		Date bdate = this.calendars.getBeginDate();
		Date edate = this.calendars.getEndDate();
		
		((MeasurementPopupController)weightMeasurementDialog).setPatientid(this.currentid);
		((MeasurementPopupController)weightMeasurementDialog).setFrom(bdate);
		((MeasurementPopupController)weightMeasurementDialog).setTo(edate);
		
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		//TODO Continue working
		//Measurement[] meas = proxy.getPatientMeasurement(this.currentid, measurementType, fromData, toData, userId)
		
	}
}
