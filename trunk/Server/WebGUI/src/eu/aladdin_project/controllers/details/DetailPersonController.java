package eu.aladdin_project.controllers.details;

import java.util.ArrayList;

import org.zkoss.util.resource.Labels;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
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
		ArrayList<Listitem> listret = new ArrayList<Listitem>();
		
		Listitem lst1 = new Listitem();
			String text = Labels.getLabel("common.name");
			Listcell namecell = new Listcell(text);
			Listcell namecell2 = new Listcell(this.currentdata.getSurname()+", "+this.currentdata.getName());
		lst1.appendChild(namecell);
		lst1.appendChild(namecell2);
		listret.add(lst1);
		
		Listitem lst2 = new Listitem();
		String text2 = Labels.getLabel("common.addresses");
		Listcell addtitle = new Listcell(text2);
		addtitle.setSpan(2);
		lst2.appendChild(addtitle);
		listret.add(lst2);
		
		Listitem lst3 = new Listitem();
			Listcell addcell = new Listcell(Labels.getLabel("common.address"));
		lst3.appendChild(addcell);
		for(int i = 0; i < this.currentdata.getAddressList().length; i++){
			Address addressdata = this.currentdata.getAddressList()[i];
			String addressstring = addressdata.getStreet()+" "+addressdata.getStreetNo()+", "+addressdata.getCity();
			if(addressdata.getCounty() != null && !addressdata.getCounty().equals("(none)")){
				addressstring += "("+addressdata.getCounty()+")";
			}
			addressstring += "\n"+addressdata.getZipCode()+" "+addressdata.getCountry();
			if(i == 0){
				Listcell addcell2 = new Listcell(addressstring);
				lst3.appendChild(addcell2);
				listret.add(lst3);
			}else{
				Listitem addresstext = new Listitem();
				addresstext.appendChild(new Listcell(""));
				addresstext.appendChild(new Listcell(addressstring));
				listret.add(addresstext);
			}
		}
		
		/* It's not necessary unless we want to show notes for each address
		Listitem lst4 = new Listitem();
			String text4 = Labels.getLabel("common.notes");
			Listcell addcell3 = new Listcell(text4);
			Listcell addcell4 = new Listcell(addressdata.getNotes());
		lst4.appendChild(addcell3);
		lst4.appendChild(addcell4);
		listret.add(lst4);
		*/
		
		Listitem lst5 = new Listitem();
		String text5 = Labels.getLabel("common.communications");
		Listcell comtitle = new Listcell(text5);
		comtitle.setSpan(2);
		lst5.appendChild(comtitle);
		listret.add(lst5);
		
		Communication commdata = this.currentdata.getCommunicationList()[0];
		
		Listitem lst6 = new Listitem();
			Listcell comcell = new Listcell(commdata.getType());
			Listcell comcell2 = new Listcell(commdata.getValue());
		lst6.appendChild(comcell);
		lst6.appendChild(comcell2);
		listret.add(lst6);
	
		String text4 = Labels.getLabel("common.notes");
		Listitem lst7 = new Listitem();
			Listcell comcell3 = new Listcell(text4);
			Listcell comcell4 = new Listcell(commdata.getNotes());
		lst7.appendChild(comcell3);
		lst7.appendChild(comcell4);
		listret.add(lst7);
		
		Listitem[] ret = new Listitem[listret.size()];
		for(int i = 0 ; i < listret.size() ; i++){
			ret[i] = listret.get(i);
		}
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
