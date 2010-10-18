package eu.aladdin_project.controllers.details;

import org.zkoss.util.resource.Labels;
import org.zkoss.zul.Button;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Row;
import org.zkoss.zul.Window;

import eu.aladdin_project.xsd.Address;
import eu.aladdin_project.xsd.Communication;
import eu.aladdin_project.xsd.PatientCarer;
import eu.aladdin_project.xsd.PersonData;
import eu.aladdin_project.xsd.SocioDemographicData;

@SuppressWarnings("serial")
public abstract class DetailPersonController extends Window {

	protected String currentid = null;
	protected PersonData currentdata = null;
	protected SocioDemographicData currentsd = null;
	protected String currentresponsible = null;
	protected PatientCarer[] currentcarers = null;
	
	public abstract Button[] createActionButtons();
	public abstract Listitem[] createDataRows();

	public DetailPersonController(){
	}
	
	public void setControllerData(String id, PersonData data, SocioDemographicData sddata, String responsible, PatientCarer[] carers){
		this.setCurrentid(id);
		this.setCurrentdata(data);
		this.setCurrentresponsible(responsible);
		this.setCurrentsd(sddata);
		this.setCurrentcarers(carers);
		
		
		Row acrows = (Row)getFellow("actionrow");
		Listbox datarows = (Listbox)getFellow("datarows");
		Button[] actions = this.createActionButtons();
		Listitem[] datar = this.createDataRows();
		
		for(int i = 0; i<actions.length; i++){
			acrows.appendChild(actions[i]);
		}
		for(int i = 0; i<datar.length; i++){
			datarows.appendChild(datar[i]);
		}
	}
	
	protected Listitem[] getPersonDataListItems(){
		Listitem lst1 = new Listitem();
			String text = Labels.getLabel("common.name");
			Listcell namecell = new Listcell(text);
			Listcell namecell2 = new Listcell(this.currentdata.getSurname()+", "+this.currentdata.getName());
		lst1.appendChild(namecell);
		lst1.appendChild(namecell2);
		
		Listitem lst2 = new Listitem();
		String text2 = Labels.getLabel("common.addresses");
		Listcell addtitle = new Listcell(text2);
		addtitle.setSpan(2);
		lst2.appendChild(addtitle);
		
		Address addressdata = this.currentdata.getAddressList()[0];
		String addressstring = addressdata.getStreet()+" "+addressdata.getStreetNo()+", "+addressdata.getCity();
		if(addressdata.getCounty() != null && !addressdata.getCounty().equals("(none)")){
			addressstring += "("+addressdata.getCounty()+")";
		}
		addressstring += "\n"+addressdata.getZipCode()+" "+addressdata.getCountry();
		
		Listitem lst3 = new Listitem();
			String text3 = Labels.getLabel("common.address");
			Listcell addcell = new Listcell(text3);
			Listcell addcell2 = new Listcell(addressstring);
		lst3.appendChild(addcell);
		lst3.appendChild(addcell2);
		
		Listitem lst4 = new Listitem();
			String text4 = Labels.getLabel("common.notes");
			Listcell addcell3 = new Listcell(text4);
			Listcell addcell4 = new Listcell(addressdata.getNotes());
		lst4.appendChild(addcell3);
		lst4.appendChild(addcell4);
		
		Listitem lst5 = new Listitem();
		String text5 = Labels.getLabel("common.communications");
		Listcell comtitle = new Listcell(text5);
		comtitle.setSpan(2);
		lst5.appendChild(comtitle);
		
		Communication commdata = this.currentdata.getCommunicationList()[0];
		
		Listitem lst6 = new Listitem();
			Listcell comcell = new Listcell(commdata.getType());
			Listcell comcell2 = new Listcell(commdata.getValue());
		lst6.appendChild(comcell);
		lst6.appendChild(comcell2);
	
		Listitem lst7 = new Listitem();
			Listcell comcell3 = new Listcell(text4);
			Listcell comcell4 = new Listcell(commdata.getNotes());
		lst7.appendChild(comcell3);
		lst7.appendChild(comcell4);
		
		Listitem[] ret = new Listitem[7];
		ret[0]=lst1;
		ret[1]=lst2;
		ret[2]=lst3;
		ret[3]=lst4;
		ret[4]=lst5;
		ret[5]=lst6;
		ret[6]=lst7;
		
		return ret;
		
	}

	// GETTERS AND SETTERS
	
	public String getCurrentid() {
		return currentid;
	}

	protected void setCurrentid(String currentid) {
		this.currentid = currentid;
	}

	public PersonData getCurrentdata() {
		return currentdata;
	}

	protected void setCurrentdata(PersonData currentdata) {
		this.currentdata = currentdata;
	}

	public SocioDemographicData getCurrentsd() {
		return currentsd;
	}

	protected void setCurrentsd(SocioDemographicData currentsd) {
		this.currentsd = currentsd;
	}

	public String getCurrentresponsible() {
		return currentresponsible;
	}

	protected void setCurrentresponsible(String currentresponsible) {
		this.currentresponsible = currentresponsible;
	}

	public PatientCarer[] getCurrentcarers() {
		return currentcarers;
	}

	protected void setCurrentcarers(PatientCarer[] currentcarers) {
		this.currentcarers = currentcarers;
	}
	
	
	
}
