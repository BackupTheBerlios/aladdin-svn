package eu.aladdin_project.controllers.details;

import org.zkoss.zul.Button;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Row;

public class DetailClinicianController extends DetailPersonController{

	public Button[] createActionButtons() {
		Button btn = new Button();
		btn.setLabel("Modify Clinician");
		btn.setHref("/clinicians/update.zul?clinid="+this.currentid);
		
		Button[] ret = new Button[1];
		ret[0] = btn;
		return ret;
	}

	public Listitem[] createDataRows() {
		return this.getPersonDataListItems();
	}

}
