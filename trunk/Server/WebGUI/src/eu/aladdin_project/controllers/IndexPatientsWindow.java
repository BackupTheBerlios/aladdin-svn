package eu.aladdin_project.controllers;

import java.rmi.RemoteException;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Separator;
import org.zkoss.zul.Window;

import eu.aladdin_project.StorageComponent.StorageComponentProxy;

public class IndexPatientsWindow extends Window {
	
	private static final long serialVersionUID = -4585592732261850018L;
	private String patid = null;
	
	public void deletePatient(){
		Session ses = Sessions.getCurrent();
		String userid = (String)ses.getAttribute("userid");
		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			proxy.deletePatient(this.patid, userid);
		}catch (RemoteException re) {
			re.printStackTrace();
		}finally{
			this.patid=null;
			Executions.sendRedirect("/patients/index.zul");
		}
		
	}
	
	public void deletePatientMsg(String id){
		this.patid = id;
		ConfirmDeletePatient auxwin = new ConfirmDeletePatient(id);
		Button btn = new Button();
		String text = Labels.getLabel("patients.delete.sure");
		btn.setLabel(text);
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				deletePatient();
			}
		});
		auxwin.addEventListener("onClose", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				patid=null;
			}
		});
		auxwin.appendChild(btn);
		this.appendChild(auxwin);
		try{
			auxwin.doModal();
		}catch (InterruptedException ee) {
			System.out.println(ee.getMessage());
		}
		
	}
	
	public void updatePatient(String id){
		Executions.sendRedirect("/patients/update.zul?patid="+id);
	}
	
	public void detailsPatient(String id){
		Executions.sendRedirect("/patients/details.zul?patid="+id);
	}
	
	@SuppressWarnings("serial")
	public class ConfirmDeletePatient extends Window{
		
		public ConfirmDeletePatient(String id){
			Label message = new Label();
			String text = Labels.getLabel("patients.delete.confirm");
			message.setValue(text+" "+id+"?");
			this.appendChild(message);
			
			Separator sep = new Separator();
			sep.setHeight("10px");
			this.appendChild(sep);
			
			String text2 = Labels.getLabel("patients.delete");
			this.setTitle(text2);
			this.setBorder("normal");
			this.setClosable(true);
		}
	}

}
