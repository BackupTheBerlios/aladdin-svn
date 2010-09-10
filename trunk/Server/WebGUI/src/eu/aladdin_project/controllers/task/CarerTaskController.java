package eu.aladdin_project.controllers.task;

import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;

public class CarerTaskController extends Window {
	
	public void changeTaskType(){
		Listbox listbox = (Listbox)this.getFellow("tasktypesel");
		System.out.println(listbox.getSelectedItem().getValue());
		Listitem listitem = listbox.getSelectedItem();
		int comp = ((Integer)listitem.getValue()).intValue(); 
		if(comp == SystemDictionary.TASK_TYPE_COGGAME_INT){
			this.getFellow("urlrow").setVisible(true);
			this.getFellow("qsrow").setVisible(false);
			System.out.println("IEEE");
		}else if(comp == SystemDictionary.TASK_TYPE_CARERQS_INT){
			this.getFellow("urlrow").setVisible(false);
			this.getFellow("qsrow").setVisible(true);
			System.out.println("EEEI");
		}else{
			this.getFellow("urlrow").setVisible(false);
			this.getFellow("qsrow").setVisible(false);
			System.out.println("IEEI");
		}
		
	}

}
