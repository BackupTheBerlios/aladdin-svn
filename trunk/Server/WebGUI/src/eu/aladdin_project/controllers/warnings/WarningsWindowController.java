package eu.aladdin_project.controllers.warnings;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;
import org.zkoss.zul.Row;

import eu.aladdin_project.ErrorDictionary;
import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.Patient;
import eu.aladdin_project.xsd.SearchCriteria;
import eu.aladdin_project.xsd.SystemParameter;
import eu.aladdin_project.xsd.Warning;

@SuppressWarnings("serial")
public class WarningsWindowController extends Window {

	public WarningsPopupController warningPopup;
	
	public void readWarning(String warningid){
		StorageComponentProxy proxy = new StorageComponentProxy();
		SearchCriteria filter = new SearchCriteria();
		filter.setFieldName("ID");
		SystemParameter compare = new SystemParameter("3", "");
		filter.setCompareOp(compare);
		filter.setFieldValue1(warningid);
		String usid = (String)Sessions.getCurrent().getAttribute("userid");

		try{
			Warning[] warning = proxy.getWarnings(new SearchCriteria[]{filter}, usid);
			if(warning.length != 1){
				ErrorDictionary.redirectWithError("/warnings/index.zul?error=4");
			}
			Patient pinfo = proxy.getPatient(warning[0].getPatientID(), usid);
			
			warningPopup = (WarningsPopupController)Executions.createComponents("form.zul", this, null);
			warningPopup.setWarningid(warningid);
			((Textbox)warningPopup.getFellow("wid")).setValue(warning[0].getID());
			((Textbox)warningPopup.getFellow("typefield")).setValue(SystemDictionary.getWarningTypeLabel(warning[0].getTypeOfWarning().getCode()));
			((Textbox)warningPopup.getFellow("datefield")).setValue(((Label)getFellow("date"+warningid)).getValue());
			((Textbox)warningPopup.getFellow("effectfield")).setValue(SystemDictionary.getWarningEffectLabel(warning[0].getEffect().getCode()));
			((Textbox)warningPopup.getFellow("indfield")).setValue(SystemDictionary.getWarningIndicatorLabel(warning[0].getIndicator().getCode()));
			((Textbox)warningPopup.getFellow("riskfield")).setValue(SystemDictionary.getWarningRiskLevel(warning[0].getRiskLevel().getCode()));
			((Textbox)warningPopup.getFellow("justfield")).setValue(warning[0].getJustificationText());
			((Textbox)warningPopup.getFellow("emergencyfield")).setValue(SystemDictionary.getWarningEmergencyLevelLabel(warning[0].getEmergencyLevel().getCode()));
			((Textbox)warningPopup.getFellow("patientfield")).setValue(warning[0].getID());
			((Textbox)warningPopup.getFellow("patientnamefield")).setValue(pinfo.getPersonData().getSurname()+", "+pinfo.getPersonData().getName());
			((Textbox)warningPopup.getFellow("delivfield")).setValue(warning[0].isDelivered()? Labels.getLabel("common.yes") : Labels.getLabel("common.no"));
			//ID Row hidden. It had read-only set to true but Andrey requested to hide the whole Row.
			((Row)warningPopup.getFellow("warningid")).setVisible(false);
			if(warning[0].isDelivered()){
				((Row)warningPopup.getFellow("buttonrow")).setVisible(false);
			}
			warningPopup.setTitle(Labels.getLabel("menu.warnings"));
			warningPopup.setVisible(true);
			warningPopup.doModal();
		}catch(Exception e){
			ErrorDictionary.redirectWithError("?error="+ErrorDictionary.WARNING_RETRIEVE_ERROR);
		}
	}
}
