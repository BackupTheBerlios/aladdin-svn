package eu.aladdin_project.controllers;

import java.util.ArrayList;

import org.apache.axis.types.UnsignedByte;
import org.zkoss.util.resource.Labels;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Radio;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Intbox;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.xsd.SocioDemographicData;
import eu.aladdin_project.xsd.SystemParameter;

@SuppressWarnings("serial")
public class SDFormControllerWindow extends AladdinFormControllerWindow{

	protected SocioDemographicData currentsd = null;
	
	/**
	 * Default constructor
	 */
	public SDFormControllerWindow(){
	}
	
	/**
	 * Protected method to retrieve information from the form to generate a new SocioDemographicData object
	 * 
	 * @return SocioDemographic Object from the patient form
	 */
	protected SocioDemographicData getSocioDemographicData(){
		//Getting fields from Social Demographic data
		Integer ageStr = ((Intbox)getFellow("pat_age")).getValue();
		UnsignedByte age = new UnsignedByte(ageStr);
		
		Integer childrenStr = ((Intbox)getFellow("pat_children")).getValue();
		UnsignedByte children = new UnsignedByte(childrenStr);

		Radiogroup genderRadio = (Radiogroup)getFellow("pat_gender");
			Radio radiosel = genderRadio.getSelectedItem();
			String code = radiosel.getValue();
			String value = radiosel.getLabel();
			//Creating gender object to save
			SystemParameter gender = new SystemParameter(code, value);

		Listbox maritallist = (Listbox)getFellow("pat_marital");
			Listitem maritalitem = maritallist.getSelectedItem();
			String mcode = maritalitem.getValue().toString();
			String mvalue = maritalitem.getLabel();
			//Creating marital status object to save
			SystemParameter marital = new SystemParameter(mcode, mvalue);

		Listbox livinglist = (Listbox)getFellow("pat_living");
			Listitem livingitem = livinglist.getSelectedItem();
			String lcode = livingitem.getValue().toString();
			String lvalue = livingitem.getLabel();
			//Creating living object to save
			SystemParameter living = new SystemParameter(lcode,lvalue);

		//Creating socio-demographic object to store
		SocioDemographicData sdData = new SocioDemographicData(age, gender, marital, children, living);
		return sdData;
	}
	
	protected void addSocioDemographicDataFields(){
		String personal = Labels.getLabel("patients.form.personal");
		String age = Labels.getLabel("patients.form.sd.age");
		String gender = Labels.getLabel("patients.form.sd.gender");
		String marital = Labels.getLabel("patients.form.sd.marital");
		String children = Labels.getLabel("patients.form.sd.children");
		String living = Labels.getLabel("patients.form.sd.living");
		String single = Labels.getLabel("patients.form.sd.marital.single");
		String married = Labels.getLabel("patients.form.sd.marital.married");
		String widow = Labels.getLabel("patients.form.sd.marital.widow");
		String divorced = Labels.getLabel("patients.form.sd.marital.divorced");
		String male = Labels.getLabel("patients.form.male");
		String female = Labels.getLabel("patients.form.female");
		
		String alone = SystemDictionary.LIVING_ALONE_LBL; 
		String sons = SystemDictionary.LIVING_SONDAUGHTER_LBL;
		String partner = SystemDictionary.LIVING_PARTNER_LBL; 
		String carer = SystemDictionary.LIVING_PARTER_SONDAUGHTER_LBL; 
		String res = SystemDictionary.LIVING_PARTER_SONDAUGHTER_SDLAW_LBL;
		String health = SystemDictionary.LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON_LBL;
		
		ArrayList<SimpleFieldData> rowsA = new ArrayList<SimpleFieldData>();
		rowsA.add(new SimpleFieldData(age, "pat_age", "no empty"));
		rowsA.add(new SimpleFieldData(children, "pat_children", "no empty"));
		
		ArrayList<SimpleFieldData> genderlist = new ArrayList<SimpleFieldData>();
		genderlist.add(new SimpleFieldData(male, "1"));
		genderlist.add(new SimpleFieldData(female, "2"));
		
		ArrayList<SimpleFieldData> maritallist = new ArrayList<SimpleFieldData>();
		maritallist.add(new SimpleFieldData(widow, "1"));
		maritallist.add(new SimpleFieldData(married, "2"));
		maritallist.add(new SimpleFieldData(single, "3"));
		maritallist.add(new SimpleFieldData(divorced, "4"));
		
		ArrayList<SimpleFieldData> livinglist = new ArrayList<SimpleFieldData>();
		livinglist.add(new SimpleFieldData(Labels.getLabel(alone), SystemDictionary.LIVING_ALONE));
		livinglist.add(new SimpleFieldData(Labels.getLabel(sons), SystemDictionary.LIVING_SONDAUGHTER));
		livinglist.add(new SimpleFieldData(Labels.getLabel(partner), SystemDictionary.LIVING_PARTNER));
		livinglist.add(new SimpleFieldData(Labels.getLabel(carer), SystemDictionary.LIVING_PARTER_SONDAUGHTER));
		livinglist.add(new SimpleFieldData(Labels.getLabel(res), SystemDictionary.LIVING_PARTER_SONDAUGHTER_SDLAW));
		livinglist.add(new SimpleFieldData(Labels.getLabel(health), SystemDictionary.LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON));
		
		Grid pgrid = new Grid();
		pgrid.setSclass("grid");
		this.appendColumns(pgrid);
			
		Rows rows = new Rows();
		this.appendSubFormTitleRow(personal, rows);
		this.appendIntboxFields(rowsA, rows);
		this.appendRadioElement(genderlist, rows, gender, "pat_gender");
		this.appendListboxElement(maritallist, rows, marital, "pat_marital");
		this.appendListboxElement(livinglist, rows, living, "pat_living");
		
		pgrid.appendChild(rows);
		this.appendChild(pgrid);
	}
	
	protected void addSocioDemographicDataFieldsValue(){
		((Intbox)this.getFellow("pat_age")).setValue(new Integer(this.currentsd.getAge().toString()));
		((Intbox)this.getFellow("pat_children")).setValue(new Integer(this.currentsd.getChildren().toString()));
		
		
		((Radiogroup)this.getFellow("pat_gender")).setSelectedIndex(Integer.parseInt(this.currentsd.getGender().getCode())-1);
		((Listbox)this.getFellow("pat_marital")).setSelectedIndex(Integer.parseInt(this.currentsd.getMaritalStatus().getCode())-1);
		((Listbox)this.getFellow("pat_living")).setSelectedIndex(Integer.parseInt(this.currentsd.getLivingWith().getCode()));
	}

}
