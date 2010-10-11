package eu.aladdin_project.controllers.qm;

import java.rmi.RemoteException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Window;

import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;

public class QuestionnaireIndexWindow extends Window {
	
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

}
