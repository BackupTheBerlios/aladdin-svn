package eu.aladdin_project.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.zkoss.util.resource.Labels;
import org.zkoss.zul.Label;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Column;
import org.zkoss.zul.Columns;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Radio;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import eu.aladdin_project.xsd.Address;
import eu.aladdin_project.xsd.Communication;
import eu.aladdin_project.xsd.Identifier;
import eu.aladdin_project.xsd.PersonData;

public class AladdinFormControllerWindow extends Window{
	
	protected String currentid = null;
	protected PersonData currentdata = null;
	/**
	 * Default constructor
	 */
	public AladdinFormControllerWindow(){
		this.buildForm();
	}
	
	/**
	 * Override this method to build a concrete form
	 */
	public void buildForm(){}
	
	/**
	 * Private method which retrieves information to fulfill PersonData fields
	 * 
	 * @return PersonData object to be included on Patient information
	 */
	protected PersonData getPersonData(){
		String name = ((Textbox)getFellow("pat_name")).getValue();
		String surname = ((Textbox)getFellow("pat_sname")).getValue();

		Identifier idarr[]=new Identifier[1];
		idarr[0]=this.getIdentifierData();
		
		Address addresslist[] = new Address[1];
		addresslist[0]=this.getNewAddressData();
		
		Communication comlist[] = new Communication[1];
		comlist[0]=this.getNewCommunicationData();
		
		PersonData pdData = new PersonData(surname, name, idarr, addresslist, comlist);
		return pdData;
	}
	
	
	/**
	 * Private method which retrieves and generate required information to be stored on the identifier Object 
	 * 
	 * @return Identifier object (it is not an array at all)
	 */
	protected Identifier getIdentifierData(){
		//TODO review auto-generated data
		String type = "patient";
		String numbre = "1000";
		String issueAuthority = "authority";
		Date issueDate = new Date(System.currentTimeMillis());
		
		Identifier ident = new Identifier(type,numbre,issueDate,issueAuthority);
		return ident;
	}
	
	/**
	 * Private method to retrieve data to store a new Address object
	 * 
	 * @return Address object (it is not an array at all)
	 */
	protected eu.aladdin_project.xsd.Address getNewAddressData(){
		String street = ((Textbox)getFellow("pat_street")).getValue();
		String streetno = ((Textbox)getFellow("pat_streetno")).getValue();
		String city = ((Textbox)getFellow("pat_city")).getValue();
		String county = ((Textbox)getFellow("pat_county")).getValue();
		String country = ((Textbox)getFellow("pat_country")).getValue();
		String zipcode = ((Textbox)getFellow("pat_zipcode")).getValue();
		String notes = ((Textbox)getFellow("pat_notes")).getValue();

		Checkbox primarybox = (Checkbox)getFellow("pat_primadd");
			boolean isPrimary = primarybox.isChecked();
		
		eu.aladdin_project.xsd.Address address = new eu.aladdin_project.xsd.Address(street,streetno,city,county,country,zipcode,notes,isPrimary);
		return address;
	}
	
	/**
	 * Private method to generate a new Communication object
	 * 
	 * @return a Communication object, non an Array
	 */
	protected Communication getNewCommunicationData(){
		String type = ((Textbox)getFellow("pat_comtype")).getValue();
		String value = ((Textbox)getFellow("pat_comval")).getValue();
		String notes = ((Textbox)getFellow("pat_comnote")).getValue();

		Checkbox primarybox = (Checkbox)getFellow("pat_comprim");
			boolean isPrimary = primarybox.isChecked();
		
		Communication communication = new Communication(type,value,notes,isPrimary);
		return communication;
	}
	
	protected void addPersonFields(){
		String name = Labels.getLabel("patients.form.name");
		String surname = Labels.getLabel("patients.form.surname");
		
		ArrayList<SimpleFieldData> rowsA = new ArrayList<SimpleFieldData>();
		rowsA.add(new SimpleFieldData(name, "pat_name"));
		rowsA.add(new SimpleFieldData(surname, "pat_sname"));
		
		Grid pgrid = new Grid();
		pgrid.setSclass("grid");
		this.appendColumns(pgrid);
			
		Rows rows = new Rows();
		this.appendTextboxFields(rowsA, rows);
		
		pgrid.appendChild(rows);
		this.appendChild(pgrid);
	}
	
	protected void addPersonFieldsValues(){
		((Textbox)this.getFellow("pat_name")).setValue(this.currentdata.getName());
		((Textbox)this.getFellow("pat_sname")).setValue(this.currentdata.getSurname());
	}
	
	protected void addAddressFields(){
		String address = Labels.getLabel("patients.form.address");
		String street = Labels.getLabel("patients.form.street");
		String streetno = Labels.getLabel("patients.form.streetno");
		String city = Labels.getLabel("patients.form.city");
		String county = Labels.getLabel("patients.form.county");
		String country = Labels.getLabel("patients.form.country");
		String zipcode = Labels.getLabel("patients.form.zip");
		String prim = Labels.getLabel("patients.form.primary");
		String notes = Labels.getLabel("patients.form.notes");
		
		ArrayList<SimpleFieldData> rowsA = new ArrayList<SimpleFieldData>();
		rowsA.add(new SimpleFieldData(street, "pat_street"));
		rowsA.add(new SimpleFieldData(streetno, "pat_streetno"));
		rowsA.add(new SimpleFieldData(city, "pat_city"));
		rowsA.add(new SimpleFieldData(county, "pat_county"));
		rowsA.add(new SimpleFieldData(country, "pat_country"));
		rowsA.add(new SimpleFieldData(zipcode, "pat_zipcode"));
		rowsA.add(new SimpleFieldData(notes, "pat_notes"));
		
		ArrayList<SimpleFieldData> rowsB = new ArrayList<SimpleFieldData>();
		rowsB.add(new SimpleFieldData(prim, "pat_primadd"));
		
		Grid pgrid = new Grid();
		pgrid.setSclass("grid");
		this.appendColumns(pgrid);
			
		Rows rows = new Rows();
			
			this.appendSubFormTitleRow(address, rows);
			this.appendTextboxFields(rowsA, rows);
			this.appendCheckboxFields(rowsB, rows);
			
		pgrid.appendChild(rows);
		this.appendChild(pgrid);
		
		Textbox tboxe = (Textbox)rows.getFellow("pat_notes");
		tboxe.setRows(4);
		tboxe.setWidth("70%");
	}
	
	protected void addAddressFieldsValues(){
		Address[] adresses = this.currentdata.getAddressList();
		System.out.println("Addresses LENGTH: "+adresses.length);
		for(int i = 0; i<adresses.length; i++){
			Address addr= adresses[i];
			if(addr.isIsPrimary()){
				((Textbox)this.getFellow("pat_street")).setValue(addr.getStreet());
				((Textbox)this.getFellow("pat_streetno")).setValue(addr.getStreetNo());
				((Textbox)this.getFellow("pat_city")).setValue(addr.getCity());
				((Textbox)this.getFellow("pat_county")).setValue(addr.getCounty());
				((Textbox)this.getFellow("pat_country")).setValue(addr.getCountry());
				((Textbox)this.getFellow("pat_zipcode")).setValue(addr.getZipCode());
				((Textbox)this.getFellow("pat_notes")).setValue(addr.getNotes());
				((Checkbox)this.getFellow("pat_primadd")).setChecked(true);
			}
		}
	}
	
	protected void addCommunicationFields(){
		String comtype = Labels.getLabel("patients.form.com.type");
		String comval = Labels.getLabel("patients.form.com.value");
		String com = Labels.getLabel("patients.form.comunications");
		String prim = Labels.getLabel("patients.form.primary");
		String notes = Labels.getLabel("patients.form.notes");
		
		ArrayList<SimpleFieldData> rowsA = new ArrayList<SimpleFieldData>();
		rowsA.add(new SimpleFieldData(comtype, "pat_comtype"));
		rowsA.add(new SimpleFieldData(comval, "pat_comval"));
		rowsA.add(new SimpleFieldData(notes, "pat_comnote"));
		
		ArrayList<SimpleFieldData> rowsB = new ArrayList<SimpleFieldData>();
		rowsB.add(new SimpleFieldData(prim, "pat_comprim"));
		
		Grid pgrid = new Grid();
		pgrid.setSclass("grid");
		this.appendColumns(pgrid);
			
		Rows rows = new Rows();
			
			this.appendSubFormTitleRow(com, rows);
			this.appendTextboxFields(rowsA, rows);
			this.appendCheckboxFields(rowsB, rows);
			
		pgrid.appendChild(rows);
		this.appendChild(pgrid);
		
		Textbox tboxe = (Textbox)rows.getFellow("pat_comnote");
		tboxe.setRows(4);
		tboxe.setWidth("70%");
		
	}
	protected void addCommunicationFieldsValues(){
		Communication[] communications = this.currentdata.getCommunicationList();
		System.out.println("Communications LENGTH: "+communications.length);
		for(int i = 0 ; i<communications.length; i++){
			Communication comm = communications[i];
			if(comm.isIsPrimary()){
				((Textbox)this.getFellow("pat_comtype")).setValue(comm.getType());
				((Textbox)this.getFellow("pat_comval")).setValue(comm.getValue());
				((Textbox)this.getFellow("pat_comnote")).setValue(comm.getNotes());
				((Checkbox)this.getFellow("pat_comprim")).setChecked(true);
			}
		}
	}
	protected void appendColumns(Grid grid){
		Columns cols = new Columns();
		
		Column col1 = new Column();
		col1.setWidth("250px");
		col1.setAlign("right");
		cols.appendChild(col1);

		Column col2 = new Column();
		//col2.setWidth("250px");
		col2.setAlign("left");
		cols.appendChild(col2);
		
		grid.appendChild(cols);
	}
	
	protected void appendSubFormTitleRow(String title, Rows rows){
		Row row0 = new Row();
		row0.setSpans("2");
		row0.setSclass("center");
			Label lab0 = new Label();
			lab0.setValue(title);
			lab0.setSclass("strong");
			row0.appendChild(lab0);
		rows.appendChild(row0);
	}
	
	/**
	 * Protected method to add Textbox fields from a TextboxData ArrayList
	 * 
	 * @param ArrayList<TextboxData> list 
	 * @param Rows rows
	 */
	protected void appendTextboxFields(ArrayList<SimpleFieldData> list,Rows rows){
		Iterator<SimpleFieldData> it = list.iterator();
		while(it.hasNext()){
			SimpleFieldData elem = it.next();
			Row rowe = new Row();
			Label labe = new Label();
			labe.setValue(elem.getLabel());
			rowe.appendChild(labe);
			
			Textbox tboxe = new Textbox();
			tboxe.setId(elem.getId());
			//tboxe.setRows(4);
			//tboxe.setWidth("70%");
			rowe.appendChild(tboxe);
			
			rows.appendChild(rowe); 
		}
	}
	
	protected void appendCheckboxFields(ArrayList<SimpleFieldData> list,Rows rows){
		Iterator<SimpleFieldData> it = list.iterator();
		while(it.hasNext()){
			SimpleFieldData elem = it.next();
			Row rowe = new Row();
			Label labe = new Label();
			labe.setValue(elem.getLabel());
			rowe.appendChild(labe);
			
			Checkbox cboxe = new Checkbox();
			cboxe.setId(elem.getId());
			rowe.appendChild(cboxe);
			
			rows.appendChild(rowe); 
		}
	}
	
	protected void appendRadioElement(ArrayList<SimpleFieldData> list,Rows rows,String label, String id){
		
		Row rowe = new Row();
		Label labe = new Label();
		labe.setValue(label);
		rowe.appendChild(labe);
		
		Radiogroup rgroup = new Radiogroup();
		rgroup.setId(id);
		Iterator<SimpleFieldData> it = list.iterator();
		while(it.hasNext()){
			SimpleFieldData elem = it.next();
			Radio rad = new Radio();
			rad.setLabel(elem.getLabel());
			rad.setValue(elem.getId());
			rgroup.appendChild(rad);
		}
		rowe.appendChild(rgroup);
		rows.appendChild(rowe);
	}
	
protected void appendListboxElement(ArrayList<SimpleFieldData> list,Rows rows,String label, String id){
		
		Row rowe = new Row();
		Label labe = new Label();
		labe.setValue(label);
		rowe.appendChild(labe);
		
		Listbox lbox = new Listbox();
		lbox.setId(id);
		lbox.setMold("select");
		Iterator<SimpleFieldData> it = list.iterator();
		while(it.hasNext()){
			SimpleFieldData elem = it.next();
			Listitem li = new Listitem();
			li.setLabel(elem.getLabel());
			li.setValue(elem.getId());
			lbox.appendChild(li);
		}
		rowe.appendChild(lbox);
		rows.appendChild(rowe);
	}
	
	protected class SimpleFieldData{
		private String label=null;
		private String id=null;
		
		SimpleFieldData(String label, String id){
			this.label=label;
			this.id=id;
		}
		
		public String getLabel(){
			return this.label;
		}
		
		public String getId(){
			return this.id;
		}
	}
	
}
