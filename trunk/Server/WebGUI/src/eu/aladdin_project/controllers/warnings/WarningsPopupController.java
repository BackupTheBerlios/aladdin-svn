package eu.aladdin_project.controllers.warnings;

import java.rmi.RemoteException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Window;

import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;

@SuppressWarnings("serial")
public class WarningsPopupController extends Window {
	
	private String warningid;
	
	public void markWarningAsRead() throws RemoteException{
		StorageComponentProxy proxy = new StorageComponentProxy();
		String uid = (String)Sessions.getCurrent().getAttribute("userid"); 
		OperationResult op = proxy.markWarningAsRead(this.warningid, uid);
		System.out.println("MARK AS READ: "+op.getDescription());
		Executions.getCurrent().sendRedirect("");
	}

	public String getWarningid() {
		return warningid;
	}

	public void setWarningid(String warningid) {
		this.warningid = warningid;
	}

}
