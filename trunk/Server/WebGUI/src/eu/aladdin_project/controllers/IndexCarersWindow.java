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

import eu.aladdin_project.SystemDictionary;
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
		String text = Labels.getLabel("carers.delete.sure");
		btn.setLabel(text);
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
			SystemDictionary.webguiLog("WARN", ee.getMessage());
		}
		
	}
	
	public void updateCarer(String id){
		Executions.sendRedirect("/carers/update.zul?carerid="+id);
	}
	
	public void detailsCarer(String id){
		Executions.sendRedirect("/carers/details.zul?carerid="+id);
	}
	
	@SuppressWarnings("serial")
	public class ConfirmDeleteCarer extends Window{
		
		public ConfirmDeleteCarer(String id){
			Label message = new Label();
			String confirm = Labels.getLabel("carers.delete.confirm");
			message.setValue(confirm+" "+id+"?");
			this.appendChild(message);
			
			Separator sep = new Separator();
			sep.setHeight("10px");
			this.appendChild(sep);
			
			String deletetxt = Labels.getLabel("carers.delete");
			this.setTitle(deletetxt);
			this.setBorder("normal");
			this.setClosable(true);
		}
	}

}
