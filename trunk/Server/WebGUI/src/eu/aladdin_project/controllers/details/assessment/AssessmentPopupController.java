package eu.aladdin_project.controllers.details.assessment;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.axis.types.UnsignedByte;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Window;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Intbox;


import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.PatientAssessment;
import eu.aladdin_project.xsd.SystemParameter;

public class AssessmentPopupController extends Window{
	
	public void saveAssessment(){
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		PatientAssessment ass = new PatientAssessment();
		ass.setID("");
		String patientid = ((Textbox)this.getFellow("patientid")).getValue();
		ass.setPatientID(patientid);
		Calendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		ass.setDateOfAssessment(cal);
		Listitem aetiol = ((Listbox)this.getFellow("field03_in")).getSelectedItem();
		String timeelapsed = ((Textbox)this.getFellow("field04_in")).getValue();
		String severity = ((Textbox)this.getFellow("field05_in")).getValue();
		String relevantpa = ((Textbox)this.getFellow("field06_in")).getValue();
		String comorbidity = ((Textbox)this.getFellow("field07_in")).getValue();
		String charlsonC = ((Textbox)this.getFellow("field08_in")).getValue();
		String barthe = ((Textbox)this.getFellow("field09_in")).getValue();
		String lawton = ((Textbox)this.getFellow("field10_in")).getValue();
		String mmse = ((Textbox)this.getFellow("field11_in")).getValue();
		String mdrs = ((Textbox)this.getFellow("field12_in")).getValue();
		String bless1 = ((Textbox)this.getFellow("field13_in")).getValue();
		String bless2 = ((Textbox)this.getFellow("field14_in")).getValue();
		String bless3 = ((Textbox)this.getFellow("field15_in")).getValue();
		String checklistmbpc = ((Textbox)this.getFellow("field16_in")).getValue();
		String npqisev = ((Textbox)this.getFellow("field17_in")).getValue();
		String npqistre = ((Textbox)this.getFellow("field18_in")).getValue();
		String gds = ((Textbox)this.getFellow("field19_in")).getValue();
		boolean falls = ((Checkbox)this.getFellow("field20_in")).isChecked();
		boolean incont = ((Checkbox)this.getFellow("field21_in")).isChecked();
		boolean delir = ((Checkbox)this.getFellow("field22_in")).isChecked();
		boolean immobi = ((Checkbox)this.getFellow("field23_in")).isChecked();
		boolean sensor = ((Checkbox)this.getFellow("field24_in")).isChecked();
		String pharma = ((Textbox)this.getFellow("field25_in")).getValue();
		//TODO aetiology
		ass.setAetology(new SystemParameter((String)aetiol.getValue(), aetiol.getLabel()));
		if(timeelapsed.equals("")){
			ass.setTimeEllapsedSinceDiagnosed(new UnsignedByte(0));
		}else{
			ass.setTimeEllapsedSinceDiagnosed(new UnsignedByte(timeelapsed));
		}
		if(severity.equals("")){
			ass.setSeverity(new UnsignedByte(0));
		}else{
			ass.setSeverity(new UnsignedByte(severity));
		}
		ass.setRelevantPathologyAntecedents(relevantpa);
		ass.setComorbidity(comorbidity);
		if(charlsonC.equals("")){
			ass.setCharlsonComorbidityIndex(new UnsignedByte(0));
		}else{
			ass.setCharlsonComorbidityIndex(new UnsignedByte(charlsonC));
		}
		if(barthe.equals("")){
			ass.setBarthelIndex(new UnsignedByte(0));
		}else{
			ass.setBarthelIndex(new UnsignedByte(barthe));
		}
		if(lawton.equals("")){
			ass.setLawtonIndex(new UnsignedByte(0));
		}else{
			ass.setLawtonIndex(new UnsignedByte(lawton));
		}
		if(mmse.equals("")){
			ass.setMMSE(new UnsignedByte(0));
		}else{
			ass.setMMSE(new UnsignedByte(mmse));
		}
		if(mdrs.equals("")){
			ass.setMDRS(new UnsignedByte(0));
		}else{
			ass.setMDRS(new UnsignedByte(mdrs));
		}
		if(bless1.equals("")){
			ass.setBlessedScalePart1(new Double(0));
		}else{
			ass.setBlessedScalePart1(new Double(bless1));
		}
		if(bless2.equals("")){
			ass.setBlessedScalePart2(new UnsignedByte(0));
		}else{
			ass.setBlessedScalePart2(new UnsignedByte(bless2));
		}
		if(bless3.equals("")){
			ass.setBlessedScalePart3(new UnsignedByte(0));
		}else{
			ass.setBlessedScalePart3(new UnsignedByte(bless3));
		}
		if(checklistmbpc.equals("")){
			ass.setChecklistMBP(new UnsignedByte(0));
		}else{
			ass.setChecklistMBP(new UnsignedByte(checklistmbpc));
		}
		if(npqisev.equals("")){
			ass.setNPQI_Severity(new UnsignedByte(0));
		}else{
			ass.setNPQI_Severity(new UnsignedByte(npqisev));
		}
		if(npqistre.equals("")){
			ass.setNPQI_Stress(new UnsignedByte(0));
		}else{
			ass.setNPQI_Stress(new UnsignedByte(npqistre));
		}
		if(gds.equals("")){
			ass.setGDS(new UnsignedByte(0));
		}else{
			ass.setGDS(new UnsignedByte(gds));
		}
		ass.setFalls(falls);
		ass.setIncontinence(incont);
		ass.setDelirium(delir);
		ass.setImmobility(immobi);
		ass.setSensorialDeficits(sensor);
		ass.setPharmacologicalTreatment(pharma);
		try{
			proxy.savePatientAssessment(ass, userid);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//this.setVisible(false);
			//this.getParent().removeChild(this);
			Executions.getCurrent().sendRedirect("");
		}
		
		
	}

}
