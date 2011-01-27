package eu.aladdin_project.controllers.qm;

import java.rmi.RemoteException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Window;

import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;

@SuppressWarnings("serial")
public class QuestionnaireIndexWindow extends Window {
	
	/**
	 * Function to remove Questionnaires from questionnaire manager index page.
	 * 
	 * @param questid Questionnaire id to delete it
	 */
	public void removeQuestionnaire(String questid){
		OperationResult result = null;
		String userId = (String)Sessions.getCurrent().getAttribute("userid");
		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			result = proxy.deleteQuestionnaire(questid, userId);
		}catch(RemoteException re){
			
		}finally{
			if(result != null){
				System.out.println("Delete Questionnaire RESULT = "+result.getCode()+":"+result.getDescription());
			}else{
				System.out.println("Delete Questionnaire not executed");
			}
			Executions.getCurrent().sendRedirect("");			
		}
	}
	
	/**
	 * Simple redirection to update a Questionnaire
	 * 
	 * @param questid Questionnaire id to update it
	 */
	public void updateQuestionnaire(String questid){
		Executions.getCurrent().sendRedirect("/qm/form.zul?q="+questid);
	}
	
	public void translateQuestionnaire(String questid){
		Executions.getCurrent().sendRedirect("/qm/translation.zul?q="+questid);
	}

}
