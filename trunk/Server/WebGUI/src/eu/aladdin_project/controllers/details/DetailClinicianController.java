package eu.aladdin_project.controllers.details;

import org.zkoss.util.resource.Labels;
import org.zkoss.zul.Button;
import org.zkoss.zul.Listitem;

@SuppressWarnings("serial")
public class DetailClinicianController extends DetailPersonController{

	public Button[] createActionButtons() {
		Button btn = new Button();
		String text = Labels.getLabel("clinicians.update.title");
		btn.setLabel(text);
		btn.setHref("/clinicians/update.zul?clinid="+this.currentid);
		
		Button[] ret = new Button[1];
		ret[0] = btn;
		return ret;
	}

	public Listitem[] createDataRows() {
		return this.getPersonDataListItems();
	}

}
