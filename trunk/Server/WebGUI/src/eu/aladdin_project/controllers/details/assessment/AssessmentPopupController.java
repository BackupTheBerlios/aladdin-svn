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
		int timeelapsed = ((Intbox)this.getFellow("field04_in")).getValue();
		String severity = ((Textbox)this.getFellow("field05_in")).getValue();
		String relevantpa = ((Textbox)this.getFellow("field06_in")).getValue();
		String comorbidity = ((Textbox)this.getFellow("field07_in")).getValue();
		int charlsonC = ((Intbox)this.getFellow("field08_in")).getValue();
		int barthe = ((Intbox)this.getFellow("field09_in")).getValue();
		int lawton = ((Intbox)this.getFellow("field10_in")).getValue();
		int mmse = ((Intbox)this.getFellow("field11_in")).getValue();
		int mdrs = ((Intbox)this.getFellow("field12_in")).getValue();
		int bless1 = ((Intbox)this.getFellow("field13_in")).getValue();
		int bless2 = ((Intbox)this.getFellow("field14_in")).getValue();
		int bless3 = ((Intbox)this.getFellow("field15_in")).getValue();
		int checklistmbpc = ((Intbox)this.getFellow("field16_in")).getValue();
		int npqisev = ((Intbox)this.getFellow("field17_in")).getValue();
		int npqistre = ((Intbox)this.getFellow("field18_in")).getValue();
		int gds = ((Intbox)this.getFellow("field19_in")).getValue();
		boolean falls = ((Checkbox)this.getFellow("field20_in")).isChecked();
		boolean incont = ((Checkbox)this.getFellow("field21_in")).isChecked();
		boolean delir = ((Checkbox)this.getFellow("field22_in")).isChecked();
		boolean immobi = ((Checkbox)this.getFellow("field23_in")).isChecked();
		boolean sensor = ((Checkbox)this.getFellow("field24_in")).isChecked();
		String pharma = ((Textbox)this.getFellow("field25_in")).getValue();
		//TODO aetiology
		ass.setAetology(new SystemParameter((String)aetiol.getValue(), aetiol.getLabel()));
		ass.setTimeEllapsedSinceDiagnosed(new UnsignedByte(timeelapsed));
		ass.setSeverity(new UnsignedByte(severity));
		ass.setRelevantPathologyAntecedents(relevantpa);
		ass.setComorbidity(comorbidity);
		ass.setCharlsonComorbidityIndex(new UnsignedByte(charlsonC));
		ass.setBarthelIndex(new UnsignedByte(barthe));
		ass.setLawtonIndex(new UnsignedByte(lawton));
		ass.setMMSE(new UnsignedByte(mmse));
		ass.setMDRS(new UnsignedByte(mdrs));
		ass.setBlessedScalePart1(new Double(bless1));
		ass.setBlessedScalePart2(new UnsignedByte(bless2));
		ass.setBlessedScalePart3(new UnsignedByte(bless3));
		ass.setChecklistMBP(new UnsignedByte(checklistmbpc));
		ass.setNPQI_Severity(new UnsignedByte(npqisev));
		ass.setNPQI_Stress(new UnsignedByte(npqistre));
		ass.setGDS(new UnsignedByte(gds));
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
			this.setVisible(false);
			this.getParent().removeChild(this);
		}
		
		
	}

}
