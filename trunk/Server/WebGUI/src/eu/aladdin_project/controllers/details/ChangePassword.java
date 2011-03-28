package eu.aladdin_project.controllers.details;

import java.rmi.RemoteException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;

public class ChangePassword extends Window{
	
	private String uid;
	
	public void changePassword(String pwd){
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		try {
			OperationResult ores = proxy.changePassword(this.uid, pwd, userid);
			SystemDictionary.webguiLog("INFO", "Change Password: "+ores.getCode()+"-"+ores.getDescription());
		} catch (RemoteException e) {
			e.printStackTrace();
		}finally{
			Executions.getCurrent().sendRedirect("");
		}
	}
	
	public void setuserid(String uid){
		this.uid = uid;
	}
}
