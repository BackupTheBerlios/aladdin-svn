package eu.aladdin_project.controllers;

import java.rmi.RemoteException;

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

public class IndexCarersWindow extends Window{

	private static final long serialVersionUID = -4585592732261850018L;
	private String carerid = null;
	
	public void deleteCarer(){
		Session ses = Sessions.getCurrent();
		String userid = (String)ses.getAttribute("userid");
		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			proxy.deleteCarer(this.carerid, userid);
		}catch (RemoteException re) {
			re.printStackTrace();
		}finally{
			this.carerid=null;
			Executions.sendRedirect("/carers/index.zul");
		}
		
	}
	
	public void deleteCarerMsg(String id){
		this.carerid = id;
		ConfirmDeleteCarer auxwin = new ConfirmDeleteCarer(id);
		Button btn = new Button();
		btn.setLabel("I'm sure, delete carer");
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				deleteCarer();
			}
		});
		auxwin.addEventListener("onClose", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				carerid=null;
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
	
	public void updateCarer(String id){
		Executions.sendRedirect("/carers/update.zul?carerid="+id);
	}
	
	public class ConfirmDeleteCarer extends Window{
		
		public ConfirmDeleteCarer(String id){
			Label message = new Label();
			message.setValue("Are you sure you want to delete the carer with ID = "+id+"?");
			this.appendChild(message);
			
			Separator sep = new Separator();
			sep.setHeight("10px");
			this.appendChild(sep);
			
			this.setTitle("Delete Carer");
			this.setBorder("normal");
			this.setClosable(true);
		}
	}

}
