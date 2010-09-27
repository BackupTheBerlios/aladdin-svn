package eu.aladdin_project.controllers.warnings;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Window;

public class WarningsWindowController extends Window {

	public Window warningPopup;
	
	public void readWarning() throws InterruptedException{
		warningPopup = (Window)Executions.createComponents("form.zul", this, null);
		warningPopup.setTitle("Clinical Warning");
		warningPopup.setVisible(true);
		warningPopup.doModal();
	}
}
