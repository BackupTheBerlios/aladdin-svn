package eu.aladdin_project.controllers.externalservices;

import java.rmi.RemoteException;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;
import org.zkoss.zul.Button;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.ExternalService;
import eu.aladdin_project.xsd.OperationResult;

public class ExternalServicesIndexController extends Window {
	private static final long serialVersionUID = -8597729277696823899L;
	public Window servicePopup;
	
	public void createService() throws InterruptedException{
		servicePopup = (Window)Executions.createComponents("form.zul", this, null);
		((Button)servicePopup.getFellow("savebutton")).setVisible(true);
		String title = Labels.getLabel("extsrv.new");
		servicePopup.setTitle(title);
		servicePopup.setVisible(true);
		servicePopup.doModal();
	}
	
	public void modifyService(String srvid) throws RemoteException, InterruptedException{
		StorageComponentProxy proxy = new StorageComponentProxy();
		ExternalService defserv = null;
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		ExternalService[] services = proxy.getAllExternalServices(userid);
		for(int i = 0; i< services.length; i++){
			if(services[i].getID().equals(srvid)){
				defserv = services[i];
				break;
			}
		}
		servicePopup = (Window)Executions.createComponents("form.zul", this, null);
		((Button)servicePopup.getFellow("cancelbutton")).setVisible(true);
		//ID Row hidden, It had read-only set to true but Andrey requested to hide the whole Row
		//((Row)servicePopup.getFellow("srvid")).setVisible(true);
		((Textbox)servicePopup.getFellow("srvidfield")).setValue(srvid);
		((Textbox)servicePopup.getFellow("srvdescfield")).setValue(defserv.getDescription());
		((Textbox)servicePopup.getFellow("srvuricfield")).setValue(defserv.getAddress());
		String title = Labels.getLabel("extsrv.update");
		servicePopup.setTitle(title);
		servicePopup.setVisible(true);
		servicePopup.doModal();
	}
	
	public void delteService(String srvid){
		StorageComponentProxy proxy = new StorageComponentProxy();
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		try{
			SystemDictionary.webguiLog("TRACE", "Deleting... ");
			OperationResult result = proxy.deleteExternalService(srvid, userid);
			SystemDictionary.webguiLog("INFO", "Delete result: "+result.getDescription());
			Executions.getCurrent().sendRedirect("");
		}catch(RemoteException re){
			re.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
