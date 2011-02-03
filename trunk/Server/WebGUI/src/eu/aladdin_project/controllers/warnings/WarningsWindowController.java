package eu.aladdin_project.controllers.warnings;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Label;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;
import org.zkoss.zul.Row;

import eu.aladdin_project.ErrorDictionary;
import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.controllers.ClinicianListForPatients;
import eu.aladdin_project.xsd.Patient;
import eu.aladdin_project.xsd.PatientInfo;
import eu.aladdin_project.xsd.SearchCriteria;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.User;
import eu.aladdin_project.xsd.Warning;

@SuppressWarnings("serial")
public class WarningsWindowController extends Window {

	public WarningsPopupController warningPopup;
	
	public void readWarning(String warningid){
		StorageComponentProxy proxy = new StorageComponentProxy();
		SearchCriteria filter = new SearchCriteria();
		filter.setFieldName("ID");
		SystemParameter compare = new SystemParameter("3", "");
		filter.setCompareOp(compare);
		filter.setFieldValue1(warningid);
		String usid = (String)Sessions.getCurrent().getAttribute("userid");

		try{
			Warning[] warning = proxy.getWarnings(new SearchCriteria[]{filter}, usid);
			if(warning.length != 1){
				ErrorDictionary.redirectWithError("/warnings/index.zul?error=4");
			}
			Patient pinfo = proxy.getPatient(warning[0].getPatientID(), usid);
			
			warningPopup = (WarningsPopupController)Executions.createComponents("form.zul", this, null);
			warningPopup.setWarningid(warningid);
			((Textbox)warningPopup.getFellow("wid")).setValue(warning[0].getID());
			((Textbox)warningPopup.getFellow("typefield")).setValue(SystemDictionary.getWarningTypeLabel(warning[0].getTypeOfWarning().getCode()));
			((Textbox)warningPopup.getFellow("datefield")).setValue(((Label)getFellow("date"+warningid)).getValue());
			((Textbox)warningPopup.getFellow("effectfield")).setValue(SystemDictionary.getWarningEffectLabel(warning[0].getEffect().getCode()));
			((Textbox)warningPopup.getFellow("indfield")).setValue(SystemDictionary.getWarningIndicatorLabel(warning[0].getIndicator().getCode()));
			((Textbox)warningPopup.getFellow("riskfield")).setValue(SystemDictionary.getWarningRiskLevel(warning[0].getRiskLevel().getCode()));
			((Textbox)warningPopup.getFellow("justfield")).setValue(warning[0].getJustificationText());
			((Textbox)warningPopup.getFellow("emergencyfield")).setValue(SystemDictionary.getWarningEmergencyLevelLabel(warning[0].getEmergencyLevel().getCode()));
			((Textbox)warningPopup.getFellow("patientfield")).setValue(warning[0].getID());
			((Textbox)warningPopup.getFellow("patientnamefield")).setValue(pinfo.getPersonData().getSurname()+", "+pinfo.getPersonData().getName());
			((Textbox)warningPopup.getFellow("delivfield")).setValue(warning[0].getDelivered()? Labels.getLabel("common.yes") : Labels.getLabel("common.no"));
			((Row)warningPopup.getFellow("warningid")).setVisible(false);
			if(warning[0].getDelivered()){
				((Row)warningPopup.getFellow("buttonrow")).setVisible(false);
			}
			warningPopup.setTitle(Labels.getLabel("menu.warnings"));
			warningPopup.setVisible(true);
			warningPopup.doModal();
		}catch(Exception e){
			e.printStackTrace();
			ErrorDictionary.redirectWithError("?error="+ErrorDictionary.WARNING_RETRIEVE_ERROR);
		}
	}

	public void createPatientsDialog() throws InterruptedException{
		PatientListForWarnings respolist = (PatientListForWarnings)Executions.getCurrent().createComponents("/warnings/patientlist.zul", this, null);
		respolist.doModal();
	}
	
	public void setPatientForFilter(String patID, String patName){
		((Textbox)this.getFellow("filterpatient")).setValue(patID);
		((Textbox)this.getFellow("filterpatienttrigger")).setValue(patName);
	}
	
	public SearchCriteria showReadOrAll(){
		Checkbox readall = (Checkbox)this.getFellow("readall");
		SearchCriteria sconcrete = null;
		if(readall.isChecked()){
			SystemParameter compare = new SystemParameter();
			compare.setCode("3");
			 sconcrete = new SearchCriteria();
			sconcrete.setFieldName("delivered");
			sconcrete.setFieldValue1("no");
			sconcrete.setCompareOp(compare);
		}
		return sconcrete;
	}
	
	public SearchCriteria showPatientWarnings(){
		SearchCriteria sconcrete = null;
		Textbox filterpatient = (Textbox)this.getFellow("filterpatient");
		String filtervalue = filterpatient.getValue();
		if(!(filtervalue == null || filtervalue.equals(""))){
			SystemParameter compare = new SystemParameter();
			compare.setCode("3");
			sconcrete = new SearchCriteria();
			sconcrete.setFieldName("patientID");
			
			sconcrete.setFieldValue1(filtervalue);
			sconcrete.setCompareOp(compare);
		}
		return sconcrete;
	}
	
	public void showForAllPatients(){
		Textbox filterpatient = (Textbox)this.getFellow("filterpatient");
		filterpatient.setValue("");
		Textbox filterpatientname = (Textbox)this.getFellow("filterpatienttrigger");
		filterpatientname.setValue("");
		refreshWarnings();
	}
	
	public SearchCriteria showFromFilter(){
		Datebox filterfrom = (Datebox)this.getFellow("datefromfilter");
		Date dat = filterfrom.getValue();
		SearchCriteria sc = null;
		if(dat != null){
			Calendar cal = new GregorianCalendar();
			cal.setTime(dat);
			cal.set(Calendar.HOUR, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			//FIXME I don't know why the Calendar is returning one month less than selected
			String dstr = cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+2)+"-"+cal.get(Calendar.DAY_OF_MONTH)+" "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
			sc = new SearchCriteria();
			sc.setFieldName("dateTimeOfWarning");
			sc.setCompareOp(new SystemParameter(SystemDictionary.COMPARE_GREAT, ""));
			System.out.println("DATE TO FILTER: "+dstr);
			sc.setFieldValue1(dstr);
		}
		return sc;
	}
	
	public SearchCriteria showToFilter(){
		Datebox filterto = (Datebox)this.getFellow("datetofilter");
		Date dat = filterto.getValue();
		SearchCriteria sc = null;
		if(dat != null){
			Calendar cal = new GregorianCalendar();
			cal.setTime(dat);
			cal.set(Calendar.HOUR, 23);
			cal.set(Calendar.MINUTE, 59);
			cal.set(Calendar.SECOND, 59);
			//FIXME I don't know why the Calendar is returning one month less than selected
			String dstr = cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+2)+"-"+cal.get(Calendar.DAY_OF_MONTH)+" "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
			sc = new SearchCriteria();
			sc.setFieldName("dateTimeOfWarning");
			sc.setCompareOp(new SystemParameter(SystemDictionary.COMPARE_LESS, ""));
			System.out.println("DATE TO FILTER: "+dstr);
			sc.setFieldValue1(dstr);
		}
		return sc;
	}
	
	public void clearDateFilters(){
		Datebox dbox1 = (Datebox)this.getFellow("datefromfilter");
		dbox1.setValue(null);
		Datebox dbox2 = (Datebox)this.getFellow("datetofilter");
		dbox2.setValue(null);
	}
	
	public void refreshWarnings(){
		
		StorageComponentProxy proxy = new StorageComponentProxy();
		String id = (String)Sessions.getCurrent().getAttribute("userid");
		try{
			User userlogged = proxy.getUser(id);
			String clinidlogged = userlogged.getPersonID();
			SearchCriteria novalid = new SearchCriteria("clinician", new SystemParameter(SystemDictionary.COMPARE_NOTEQ,""), clinidlogged, null);
			PatientInfo[] novalidusers = proxy.listOfPatients(new SearchCriteria[]{novalid}, id);
			ArrayList<SearchCriteria> zerolist = new ArrayList<SearchCriteria>();
			for(PatientInfo patient : novalidusers){
				zerolist.add(new SearchCriteria("patientID",new SystemParameter(SystemDictionary.COMPARE_NOTEQ,""),patient.getID(),null));
				
			}
			SearchCriteria patfil = this.showPatientWarnings();
			SearchCriteria readfil = this.showReadOrAll();
			SearchCriteria datefrom = this.showFromFilter();
			SearchCriteria dateto = this.showToFilter();
			if(patfil!= null){ zerolist.add(patfil); }
			if(readfil!= null){ zerolist.add(readfil); }
			if(datefrom!= null){ zerolist.add(datefrom); }
			if(dateto!= null){ zerolist.add(dateto); }
			SearchCriteria[] sc = new SearchCriteria[zerolist.size()];
			System.out.println("ZEROLIST length: "+zerolist.size());
			for(int i = 0 ; i < zerolist.size() ; i++){
				sc[i]=zerolist.get(i);
			}
			WarningInfo[] wi = null;
			Warning[] wli = null;
		
			wli = proxy.getWarnings(sc, id);
			if(wli == null || wli.length == 0){
				wi = new WarningInfo[0];
			}else{
				wi = new WarningInfo[wli.length];
				for(int i = 0; wli.length > i ; i++){
					wi[i]=new WarningInfo(wli[i],id);
				}
			}
			
			System.out.println("Warning list: "+wi.length);
			Grid warningsgrid = (Grid)this.getFellow("warningsgrid");
			Rows newsrows = new Rows();
			for( WarningInfo rowi : wi ){
				if(rowi.getClinicianResponsible().equals(clinidlogged)){
					Row newrow = new Row();
					newrow.appendChild(new Label(rowi.getType()));
					Label datelabel = new Label(rowi.getDate());
					datelabel.setId("date"+rowi.getID());
					newrow.appendChild(datelabel);
					newrow.appendChild(new Label(rowi.getPatientName()));
					newrow.appendChild(new Label(rowi.getJustification()));
					Label link = new Label("Details");
					link.setSclass("link");
					link.addEventListener("onClick", new ReadWarningListener(rowi.getID()));
					newrow.appendChild(link);
					newrow.setId(rowi.getID());
					newsrows.appendChild(newrow);
				}
			}
			warningsgrid.removeChild(warningsgrid.getFellow("filteredrows"));
			newsrows.setId("filteredrows");
			warningsgrid.appendChild(newsrows);
		}catch(java.rmi.RemoteException re){
			re.printStackTrace();
		}
		
	}
	
	public class ReadWarningListener implements EventListener{
		private String warning;
		public ReadWarningListener(String warningid){
			this.warning = warningid;
		}

		public void onEvent(Event arg0) throws Exception {
			System.out.println("Warnign ID: "+this.warning);
			readWarning(this.warning);			
		}
		
	}
	
}
