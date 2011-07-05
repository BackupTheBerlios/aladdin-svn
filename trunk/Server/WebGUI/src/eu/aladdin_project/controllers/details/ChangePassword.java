package eu.aladdin_project.controllers.details;

import java.rmi.RemoteException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.User;

public class ChangePassword extends Window{
	private static final long serialVersionUID = 1203601720297000762L;
	private String uid;
	private User user;
	
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
	
	public void setuserid(String uid) throws RemoteException{
		this.uid = uid;
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		this.user = proxy.getUser(uid);
		((Textbox)this.getFellow("uname_show")).setValue(this.user.getUsername());
	}
}
