package eu.aladdin_project.controllers.details.assessment;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.axis.types.UnsignedByte;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;
import org.zkoss.zul.Intbox;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.CarerAssessment;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.User;

public class CarerAssessmentPopupController extends Window{
	
	public void saveAssessment(){
		CarerAssessment cass = new CarerAssessment();
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		cass.setID("");
		String carerid = ((Textbox)this.getFellow("carerid")).getValue();
		Calendar caldate = new GregorianCalendar();
		caldate.setTime(new Date());
		String relevant = ((Textbox)this.getFellow("field00_in")).getValue();
		int sever = ((Intbox)this.getFellow("field01_in")).getValue();
		String emotional = ((Textbox)this.getFellow("field02_in")).getValue();
		String pyscoact = ((Textbox)this.getFellow("field03_in")).getValue();
		int lifeq = ((Intbox)this.getFellow("field04_in")).getValue();
		
		cass.setCarerID(carerid);
		cass.setDateOfAssessment(caldate);
		cass.setRelevantHealthProblem(relevant);
		cass.setSeverityOfBurden(new UnsignedByte(sever));
		cass.setEmotionalOrMentalDisorders(emotional);
		cass.setPsychoactiveDrugs(pyscoact);
		cass.setQualityOfLife(new UnsignedByte(lifeq));
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		try{
			User us = proxy.getUser(userid);
			cass.setClinicianID(us.getPersonID());
			OperationResult res = proxy.saveCarerAssessment(cass, userid);
			SystemDictionary.webguiLog("INFO", "CARER ASSESSMENT: "+res.getCode()+"-"+res.getDescription());
		}catch(RemoteException re){
			re.printStackTrace();
		}finally{
			this.setVisible(false);
			this.getParent().removeChild(this);
		}
	}

}
