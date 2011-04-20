package eu.aladdin_project.patient;

import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import eu.aladdin_project.xsd.Address;
import eu.aladdin_project.xsd.Patient;
import eu.aladdin_project.xsd.PersonData;

public class PatientRenderer implements ListitemRenderer{
	
	public void render(Listitem arg0, Object arg1) throws Exception {
		Patient pat = (Patient)arg1;
		new Listcell(pat.getID()).setParent(arg0);
		new Listcell(pat.getPersonData().getName()).setParent(arg0);
		new Listcell(pat.getPersonData().getSurname()).setParent(arg0);
		new Listcell(pat.getSD_Data().getBirthday().toString()).setParent(arg0);
		Address PAddress = this.getPrimaryAddress(pat.getPersonData());
		new Listcell(PAddress.getStreetNo()+" "+PAddress.getStreet()+","+PAddress.getCity()).setParent(arg0);
		
	}
	
	private Address getPrimaryAddress(PersonData data){
		Address addresses[]=data.getAddressList().getAddress();
		for(int i=0;i<addresses.length;i++){
			if(addresses[i].isIsPrimary()){
				return addresses[i];
			}
		}
		return null;
	}

}
