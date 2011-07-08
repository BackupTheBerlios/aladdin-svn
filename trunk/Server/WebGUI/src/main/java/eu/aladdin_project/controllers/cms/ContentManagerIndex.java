package eu.aladdin_project.controllers.cms;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.SuspendNotAllowedException;
import org.zkoss.zul.Window;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Checkbox;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.MediaContent;
import eu.aladdin_project.xsd.SearchCriteria;
import eu.aladdin_project.xsd.SystemParameter;

/**
 * 
 * @author Xavi Sarda (Atos Origin)
 */
public class ContentManagerIndex extends Window{
	private static final long serialVersionUID = -5977974069200968628L;
	public Window contentpopup;

	public void createContent() throws SuspendNotAllowedException, InterruptedException{
		contentpopup = (Window)Executions.createComponents("form.zul", this, null);
		contentpopup.getFellow("savebutton").setVisible(true);
		contentpopup.setTitle("New media content");
		contentpopup.setVisible(true);
		contentpopup.doModal();
	}
	
	public void modifyContent(String id) throws Exception{
		MediaContent mcontent = this.getContentByID(id);
		contentpopup = (Window)Executions.createComponents("form.zul", this, null);
		contentpopup.getFellow("updatebutton").setVisible(true);
		((Textbox)contentpopup.getFellow("content_id")).setValue(mcontent.getID());
		((Textbox)contentpopup.getFellow("content_title")).setValue(mcontent.getTitle());
		((Textbox)contentpopup.getFellow("content_url")).setValue(mcontent.getUrl());
		((Textbox)contentpopup.getFellow("content_text")).setValue(mcontent.getText());
		String category = mcontent.getCategory();
		int selectedindex = 0;
		if(category.equals("education")){
			selectedindex = 0;
		}else if(category.equals("games")){
			selectedindex = 1;
		}else if(category.equals("entertainment")){
			selectedindex = 2;
		}
		((Listbox)contentpopup.getFellow("content_cat")).setSelectedIndex(selectedindex);
		((Checkbox)contentpopup.getFellow("content_enabled")).setChecked(mcontent.isEnabled());
		contentpopup.setTitle("Modify media content");
		contentpopup.setVisible(true);
		contentpopup.doModal();
	}
	
	public void disableContent(String id) throws Exception{
		this.processEnableOperations(id, false);
	}
	
	public void enableContent(String id) throws Exception{
		this.processEnableOperations(id, true);
	}
	
	private void processEnableOperations(String id, boolean enabled) throws Exception{
		MediaContent mcontent = this.getContentByID(id);
		mcontent.setEnabled(enabled);
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		proxy.updateMediaContent(mcontent, userid);
		Executions.getCurrent().sendRedirect("");
	}
	
	private MediaContent getContentByID(String id) throws Exception{
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		String userid = (String)Sessions.getCurrent().getAttribute("userid");
		SearchCriteria scri = new SearchCriteria("ID", new SystemParameter(SystemDictionary.COMPARE_EQ, ""), id, "");
		try{
			MediaContent mcontent[] = proxy.getMediaContent(new SearchCriteria[]{scri}, userid);
			if(mcontent.length == 1){
				return mcontent[0];
			}else{
				throw new Exception("More items than expected");
			}
		}catch(Exception e){
			throw e;
		}
	}
}
