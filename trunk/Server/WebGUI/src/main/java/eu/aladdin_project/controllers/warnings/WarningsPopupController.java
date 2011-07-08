package eu.aladdin_project.controllers.warnings;

import java.rmi.RemoteException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;

public class WarningsPopupController extends Window {
	private static final long serialVersionUID = -6712984876432126616L;
	private String warningid;
	
	public void markWarningAsRead() throws RemoteException{
		StorageComponentProxy proxy = new StorageComponentProxy();
		String uid = (String)Sessions.getCurrent().getAttribute("userid");
		try{
			OperationResult op = proxy.markWarningAsRead(this.warningid, uid);
			SystemDictionary.webguiLog("DEBUG", "Mark as read: "+op.getCode()+":"+op.getDescription());
		}catch(RemoteException re){
			this.setVisible(false);
			this.detach();
		}finally{
			Executions.getCurrent().sendRedirect("");
		}
		
	}

	public String getWarningid() {
		return warningid;
	}

	public void setWarningid(String warningid) {
		this.warningid = warningid;
	}

}
