package eu.aladdin_project.controllers;


import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Column;
import org.zkoss.zul.Columns;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Window;
import org.zkoss.zul.Radio;

import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.CarerInfo;

public class CarerListWindowController extends Window{
	
	private static final long serialVersionUID = 2272506957180879672L;
	private PattientControllerWindow patient = null;

	/**
	 * Constructor with a reference to PattientControllerWindow to be able to set the carer into parent's window fields
	 * 
	 * @param PattientControllerWindow patient
	 */
	public CarerListWindowController(PattientControllerWindow patient){
		this.patient = patient;
		String modtitle = Labels.getLabel("patients.carer.modal.title");
		String modbutton = Labels.getLabel("patients.carer.modal.button");
		String modfield = Labels.getLabel("patients.carer.modal.field");
		try{
			StorageComponentProxy proxy = new StorageComponentProxy();
			Session ses = Sessions.getCurrent();
			String id = (String)ses.getAttribute("userid");

			CarerInfo[] listcarer = proxy.listOfCarers(null,id);
			System.out.println("Carer LIST SIZE: "+listcarer.length);

			Radiogroup rgroup = new Radiogroup();
			rgroup.setId("rgroup_carer");
			
			Grid grid = new Grid();
			Columns cols = new Columns();
			Column col2 = new Column();
			col2.setLabel(modfield);
			cols.appendChild(col2);
			grid.appendChild(cols);
			
			Rows rows = new Rows();
			for(int i=0; i<listcarer.length; i++){
				Row rowe = new Row();
				Radio rade = new Radio();
				rade.setLabel(listcarer[i].getSurname()+", "+listcarer[i].getName());
				rade.setValue(listcarer[i].getID());
				rowe.appendChild(rade);
				rows.appendChild(rowe);
			}
			grid.appendChild(rows);
			rgroup.appendChild(grid);
			this.appendChild(rgroup);
			
			Button ton = new Button();
			ton.setLabel(modbutton);
			ton.addEventListener("onClick", new EventListener() {
				
				public void onEvent(Event arg0) throws Exception {
					setCarer();
				}
			});
			this.appendChild(ton);
			
			this.setId("listcare");
			this.setClosable(true);
			this.setWidth("300px");
			this.setTitle(modtitle);
		}catch(java.rmi.RemoteException re){
			re.printStackTrace();
		}
	}
	
	/**
	 * Private function responsible to set carer info into parent's window fields (name and id)
	 */
	private void setCarer(){
		Radiogroup rgroup = (Radiogroup)this.getFellow("rgroup_carer");
		Radio rad = rgroup.getSelectedItem();
		this.patient.setCarer(rad.getValue(),rad.getLabel());
		this.setVisible(false);
	}

}
