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

public class IndexCliniciansWindow extends Window{
	
	private static final long serialVersionUID = 3432071789993143298L;
	private String clinicianid = null;

	public void deleteClinician(){
		Session ses = Sessions.getCurrent();
		String userid = (String)ses.getAttribute("userid");
		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			proxy.deleteClinician(this.clinicianid, userid);
		}catch (RemoteException re) {
			re.printStackTrace();
		}finally{
			this.clinicianid=null;
			Executions.sendRedirect("/clinicians/index.zul");
		}
		
	}
	
	public void deleteClinicianMsg(String id){
		this.clinicianid = id;
		ConfirmDeleteClinician auxwin = new ConfirmDeleteClinician(id);
		Button btn = new Button();
		String text = Labels.getLabel("clinicians.delete.sure");
		btn.setLabel(text);
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				deleteClinician();
			}
		});
		auxwin.addEventListener("onClose", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				clinicianid=null;
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
	
	public void updateClinician(String id){
		Executions.sendRedirect("/clinicians/update.zul?clinid="+id);
	}
	
	public void detailsClinician(String id){
		Executions.sendRedirect("/clinicians/details.zul?clinid="+id);
	}
	
	@SuppressWarnings("serial")
	public class ConfirmDeleteClinician extends Window{
		
		public ConfirmDeleteClinician(String id){
			Label message = new Label();
			String text = Labels.getLabel("clinicians.delete.confirm");
			message.setValue(text+" "+id+"?");
			this.appendChild(message);
			
			Separator sep = new Separator();
			sep.setHeight("10px");
			this.appendChild(sep);
			
			String text2 = Labels.getLabel("clinicians.delete");
			this.setTitle(text2);
			this.setBorder("normal");
			this.setClosable(true);
		}
	}

}
