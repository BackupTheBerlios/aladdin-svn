package eu.aladdin_project.controllers.task;

import java.math.BigInteger;

import java.rmi.RemoteException;
import java.util.Date;

import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.controllers.details.DetailPatientController;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.Patient;

public class MessivelyTasksRemove extends Window{
	
	public void removeMassively(String patientid, Object tasktype, Date start, Date end) throws RemoteException{
		String tasktypestr = (Integer)tasktype+"";
		SystemDictionary.webguiLog("INFO", "TASK TYPE: "+tasktypestr);
		BigInteger tasktypedef = new BigInteger(tasktypestr);
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		String userId = (String)Sessions.getCurrent().getAttribute("userid");
		Patient pat = proxy.getPatient(patientid, userId);
		String carer = pat.getPatientCarer().getID();
		OperationResult careruser = proxy.getUserIdByPersonId(carer, SystemDictionary.USERTYPE_CARER_INT, userId);
		OperationResult patientuser = proxy.getUserIdByPersonId(patientid, SystemDictionary.USERTYPE_PATIENT_INT, userId);
		SystemDictionary.webguiLog("INFO", "CARER ID: "+careruser.getCode());
		//OperationResult ores = proxy.removeTaskMassively(careruser.getCode(), tasktypedef, start, end, userId);
		OperationResult ores = proxy.removeTaskMassively(patientuser.getCode(), tasktypedef, start, end, userId);
		SystemDictionary.webguiLog("INFO", "RESULT: "+ores.getDescription()+"-"+ores.getCode()+"-"+ores.getStatus());
		this.setVisible(false);
		DetailPatientController parentwindow = ((DetailPatientController)this.getParent());
		parentwindow.refreshCalendarData();
		parentwindow.removeChild(this);
	}

}
