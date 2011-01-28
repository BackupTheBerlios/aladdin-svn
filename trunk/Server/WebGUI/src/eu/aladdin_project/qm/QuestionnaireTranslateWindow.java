package eu.aladdin_project.qm;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Vbox;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.Questionnaire;
import eu.aladdin_project.xsd.QuestionnaireInfo;
import eu.aladdin_project.xsd.QuestionnaireQuestion;
import eu.aladdin_project.xsd.QuestionnaireQuestionAnswer;
import eu.aladdin_project.xsd.QuestionnaireQuestionList;
import eu.aladdin_project.xsd.SystemParameter;

public class QuestionnaireTranslateWindow extends Window{
	
	private ArrayList<RelatedQuestion> questionlist = new ArrayList<RelatedQuestion>();

	public QuestionnaireTranslateWindow(){
		
	}
	
	public void translateQuestionnaire(String qid){
		try{
			QuestionnaireInfo qinfo = null;
			Questionnaire questions = null;
			String userid = (String)Sessions.getCurrent().getAttribute("userid");
			StorageComponentProxy proxy = SystemDictionary.getSCProxy();
			QuestionnaireInfo[] qlist = proxy.listOfQuestionnaires(SystemDictionary.getLocale(),userid);
			for(int i = 0 ; i < qlist.length ; i++){
				if(qlist[i].getID().equals(qid)){
					qinfo = qlist[i];
					break;
				}
			}
			if(qinfo == null){
				//TODO Show error on page. Send redirect to index?
				return; 
			}
			questions = proxy.getQuestionnaire(qid, SystemDictionary.getLocale(), userid);
			Double version = new Double(qinfo.getVersion());
			((Textbox)getFellow("trans_version")).setValue(version.toString());
			((Textbox)getFellow("trans_version")).setReadonly(true);
			((Textbox)getFellow("trans_title")).setValue(qinfo.getTitle());
			printQuestions(questions.getQuestion(), "0");
			//Initialize Questions
			for(int i = 0 ; i < questionlist.size() ; i++){
				questionlist.get(i).getQuestion().getQuestions().setQuestion(new QuestionnaireQuestion[0]);
			}
		}catch(RemoteException re){
			re.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void saveTranslation(){
		String locale = (String)((Listbox)getFellow("trans_locale")).getSelectedItem().getValue();
		String version = (String)((Textbox)getFellow("trans_version")).getValue();
		String tqid = (String)((Textbox)getFellow("trans_qid")).getValue();
		String ttitle = (String)((Textbox)getFellow("trans_title")).getValue();
		
		Rows allrows = (Rows)getFellow("rows_questions");
		Object[] listrows = allrows.getChildren().toArray();
		//Pushing translations onto questions
		for(int i = 3 ; i < listrows.length ; i++){
			Row currentrow = (Row)listrows[i];
			Vbox rowdata = (Vbox)currentrow.getChildren().toArray()[1];
			Object[] vboxdata = rowdata.getChildren().toArray();
			RelatedQuestion currentq = this.questionlist.get(i-3);
			String transquestion = ((Textbox)vboxdata[0]).getValue();
			System.out.println("Question before: "+currentq.getQuestion().getTitle());
			currentq.getQuestion().setTitle(transquestion);
			System.out.println("Question after: "+currentq.getQuestion().getTitle());
			QuestionnaireQuestionAnswer[] currentans = currentq.getQuestion().getAnswers().getAnswer(); 
			for(int k = 1 ; k < vboxdata.length ; k++){
				System.out.println("Answer before: "+currentans[k-1].get_value());
				currentans[k-1].set_value(((Textbox)vboxdata[k]).getValue());
				System.out.println("Answer after: "+currentans[k-1].get_value());
			}
		}
		
		//Start rebuilding the questionnaire structure
		
		ArrayList<QuestionnaireQuestion> rootQuestions = new ArrayList<QuestionnaireQuestion>();
		for(int ii = 0 ; ii < questionlist.size() ; ii++){
			if(questionlist.get(ii).getParent() == "0"){
				rootQuestions.add(questionlist.get(ii).getQuestion());
			}else{
				for(int k = 0 ; k < questionlist.size() ; k++){
					if(questionlist.get(k).getId().equals(questionlist.get(ii).getParent())){
						QuestionnaireQuestion[] qqqa = null;
						if(questionlist.get(k).getQuestion().getQuestions() == null || questionlist.get(k).getQuestion().getQuestions().getQuestion() == null || questionlist.get(k).getQuestion().getQuestions().getQuestion().length == 0){
							qqqa = new QuestionnaireQuestion[1];
						}else{
							qqqa = new QuestionnaireQuestion[questionlist.get(k).getQuestion().getQuestions().getQuestion().length+1];
							for(int j = 0 ; j < qqqa.length-1 ; j++){
								qqqa[j]=questionlist.get(k).getQuestion().getQuestions().getQuestion(j);
							}
						}
						qqqa[qqqa.length-1]=questionlist.get(ii).getQuestion();
						questionlist.get(k).getQuestion().setQuestions(new QuestionnaireQuestionList(qqqa));
					}
				}
			}
			
		}
		
		//End of rebuilding the questionnaire structure
		QuestionnaireQuestion[] qlist = new QuestionnaireQuestion[rootQuestions.size()];
		for(int l = 0 ; l<rootQuestions.size() ; l++){
			qlist[l]=rootQuestions.get(l);
		}
		//blankIds(qlist);
		
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		Questionnaire transq = new Questionnaire(qlist, Double.parseDouble(version), tqid, ttitle);
		try{
			String userid = (String)Sessions.getCurrent().getAttribute("userid");
			OperationResult result = proxy.updateQuestionnaire(transq, new SystemParameter(locale, ""), userid);
			//OperationResult result = proxy.createQuestionnaire(new Questionnaire(qlist, version, "", title), SystemDictionary.getLocale(), userid);
			System.out.println("Translate Questionnaire: "+result.getCode()+":"+result.getDescription());
		}catch (RemoteException e) {
			e.printStackTrace();
		}finally{
			Executions.getCurrent().sendRedirect("/qm");
		}
	}
	
	/**
	 * Recursive function to show all the questions on the list, including the inner ones
	 * 
	 * @param qs QuestionnareQuestion array to show
	 * @param parentq String setting parent (mandatory for recursive calls)
	 */
	protected void printQuestions(QuestionnaireQuestion[] qs, String parentq){
		System.out.println("Questionnaire lenght: "+qs.length);
		for(int i = 0 ; i < qs.length ; i ++){
			this.addQuestion(qs[i], parentq);
			if(qs[i].getQuestions() != null && qs[i].getQuestions().getQuestion() != null && qs[i].getQuestions().getQuestion().length > 0){
				printQuestions(qs[i].getQuestions().getQuestion(), qs[i].getId());
			}
		}
	}
	
	/**
	 * Function called by question windows to append a new question to the questionnaire
	 *  
	 * @param question to be added
	 */
	public void addQuestion(QuestionnaireQuestion question, String parent){
		this.questionlist.add(new RelatedQuestion(parent,question));
		Rows rows = (Rows)getFellow("rows_questions");
		rows.appendChild(this.createQuestionRow(question, parent));
	}
	
	/**
	 * Function to insert a new row on the questions grid. Do not call it directly, it's call by addQuestion
	 * 
	 * @param question QuestionnaireQuestion to be inserted
	 * @return Row UI component
	 */
	private Row createQuestionRow(QuestionnaireQuestion question, String parent){
		Row row = new Row();
		row.setId(question.getId()+"-rowqstn");
		
		Vbox vbox = new Vbox();
		Label lab1 = new Label("Question");
		Label lab2 = new Label("Answers");
		vbox.appendChild(lab1);
		vbox.appendChild(lab2);
		
		Vbox vbox2 = new Vbox();
		Textbox qtitle = new Textbox(question.getTitle());
		vbox2.appendChild(qtitle);
		for(int i = 0; i < question.getAnswers().getAnswer().length ; i++){
			Textbox qans = new Textbox(question.getAnswers().getAnswer()[i].get_value());
			vbox2.appendChild(qans);
		}
		
		row.appendChild(vbox);
		row.appendChild(vbox2);
		
		return row;
	}
	
	
	/**
	 * Inner class to help the related questions management.
	 *   
	 */
	private class RelatedQuestion{
		private String parent;
		private String id;
		private QuestionnaireQuestion question;
		
		public RelatedQuestion(String p, QuestionnaireQuestion q){
			parent = p;
			question = q;
			id = q.getId();
		}

		public String getParent() {
			return parent;
		}

		public String getId() {
			return id;
		}

		public QuestionnaireQuestion getQuestion() {
			return question;
		}
		
		
	}
}
