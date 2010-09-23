package eu.aladdin_project.controllers.externalservices;

import java.rmi.RemoteException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.ExternalService;

public class ExternalServicesPopupController extends Window {

	public void createExternalServiceToStorage(){
		String description = ((Textbox)getFellow("srvdescfield")).getValue(); 
		String uir = ((Textbox)getFellow("srvuricfield")).getValue();
		StorageComponentProxy proxy = new StorageComponentProxy();
		Session ses = Sessions.getCurrent();
		String userid = (String)ses.getAttribute("userid");
		ExternalService extservice = new ExternalService("",description,uir);
		try{
			proxy.createExternalService(extservice, userid);
		}catch(RemoteException re){
			re.printStackTrace();
		}finally{
			Executions.getCurrent().sendRedirect("");
		}
	}
	
	public void modifyExternalServiceToStorage(){
		String description = ((Textbox)getFellow("srvdescfield")).getValue(); 
		String uir = ((Textbox)getFellow("srvuricfield")).getValue();
		String srvid = ((Textbox)getFellow("srvidfield")).getValue();
 		StorageComponentProxy proxy = new StorageComponentProxy();
		Session ses = Sessions.getCurrent();
		String userid = (String)ses.getAttribute("userid");
		ExternalService extservice = new ExternalService(srvid,description,uir);
		try{
			proxy.updateExternalService(extservice, userid);
		}catch(RemoteException re){
			re.printStackTrace();
		}finally{
			Executions.getCurrent().sendRedirect("");
		}
	}
	
}
