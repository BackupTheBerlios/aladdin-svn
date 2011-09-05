package eu.aladdin_project.qm;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Window;
import org.zkoss.zul.Textbox;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.Questionnaire;
import eu.aladdin_project.xsd.QuestionnaireInfo;
import eu.aladdin_project.xsd.QuestionnaireQuestion;
import eu.aladdin_project.xsd.QuestionnaireQuestionList;

public class QuestionnaireFormWindow extends Window{

	private static final long serialVersionUID = -1990225231090994751L;
	private ArrayList<RelatedQuestion> questionlist = new ArrayList<RelatedQuestion>();
	
	
	/**
	 * Default constructor. It's empty because ZUL page contains everything that is needed at this moment.
	 */
	public QuestionnaireFormWindow(){
	}
	
	/**
	 * Function to set parameters for Questionnaire update (new Questionnaire with different version)
	 * 
	 * @param String qid QuestionnaireInfo identificator
	 */
	public void updatingQuestionnaire(String qid){
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
			Double version = new Double(qinfo.getVersion()+1);
			((Textbox)getFellow("versionfield")).setValue(version.toString());
			((Textbox)getFellow("versionfield")).setReadonly(true);
			((Textbox)getFellow("qtitle")).setValue(qinfo.getTitle());
			((Textbox)getFellow("qtitle")).setReadonly(true);
			printQuestions(questions.getQuestion(), "0");
			for(int i = 0 ; i < questionlist.size() ; i++){
				questionlist.get(i).getQuestion().getQuestions().setQuestion(new QuestionnaireQuestion[0]);
			}
		}catch(RemoteException re){
			re.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Recursive function to show all the questions on the list, including the inner ones
	 * 
	 * @param qs QuestionnareQuestion array to show
	 * @param parentq String setting parent (mandatory for recursive calls)
	 */
	protected void printQuestions(QuestionnaireQuestion[] qs, String parentq){
		SystemDictionary.webguiLog("INFO", "Questionnaire lenght: "+qs.length);
		for(int i = 0 ; i < qs.length ; i ++){
			this.addQuestion(qs[i], parentq);
			if(qs[i].getQuestions() != null && qs[i].getQuestions().getQuestion() != null && qs[i].getQuestions().getQuestion().length > 0){
				printQuestions(qs[i].getQuestions().getQuestion(), qs[i].getId());
			}
		}
	}
	
	/**
	 * This saves a Questionnaire.
	 * 
	 */
	public void saveQuestionnaire(){
		//related questions management, this is magic don't look at it or it would be self-destroyed!
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
		
		QuestionnaireQuestion[] qlist = new QuestionnaireQuestion[rootQuestions.size()];
		for(int l = 0 ; l<rootQuestions.size() ; l++){
			qlist[l]=rootQuestions.get(l);
		}
		blankIds(qlist);
		
		//End of parent questions management you can look from here
		String versionstr = ((Textbox)getFellow("versionfield")).getValue();
		Double version = Double.valueOf(versionstr);
		String title = ((Textbox)getFellow("qtitle")).getValue();

		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			String userid = (String)Sessions.getCurrent().getAttribute("userid");
			OperationResult result = proxy.createQuestionnaire(new Questionnaire(qlist, version, "", title), SystemDictionary.getLocale(), userid);
			SystemDictionary.webguiLog("DEBUG", "Save Questionnaire: "+result.getCode()+":"+result.getDescription());
		}catch (RemoteException e) {
			e.printStackTrace();
		}finally{
			Executions.getCurrent().sendRedirect("/qm");
		}
	}
	
	public void blankIds(QuestionnaireQuestion[] qlist){
		for(int i = 0 ; i < qlist.length ; i++){
			if(qlist[i].getQuestions() != null && qlist[i].getQuestions().getQuestion() != null && qlist[i].getQuestions().getQuestion().length > 0){
				blankIds(qlist[i].getQuestions().getQuestion());
			}
			qlist[i].setId("");
			//qlist[i].setPosition(i+1);
		}
	}
	
	/**
	 * Public function to open a modal window with an answer Window form
	 * 
	 * @throws InterruptedException
	 */
	public void showAnswerWindow() throws InterruptedException{
		Window win = new QuestionWindow(this, this.getNewQuestionID(),"0");
		this.appendChild(win);
		win.doModal();
	}
	
	/**
	 * Public function to open a modal window with an answer Window form
	 * 
	 * @throws InterruptedException
	 */
	public void showAnswerWindow(String parent) throws InterruptedException{
		SystemDictionary.webguiLog("TRACE", "Parent question: "+parent);
		Window win = new QuestionWindow(this, this.getNewQuestionID(),parent);
		win.getFellow("question_condrow").setVisible(true);
		this.appendChild(win);
		win.doModal();
	}
	
	/**
	 * Function called by question windows to append a new question to the questionnaire
	 *  
	 * @param question to be added
	 */
	public void addQuestion(QuestionnaireQuestion question, String parent){
		for(int i = 0; i<this.questionlist.size(); i++){
			QuestionnaireQuestion elem = this.questionlist.get(i).getQuestion();
			if(elem.getId().equals(question.getId())){
				this.removeQuestionRow(getFellow(question.getId()+"-rowqstn"), false);
			}
		}
		this.questionlist.add(new RelatedQuestion(parent,question));

		Rows rows = (Rows)getFellow("rows_questions");

		rows.appendChild(this.createQuestionRow(question, parent));
		SystemDictionary.webguiLog("INFO", "Question list size: "+this.questionlist.size());
	}
	
	/**
	 * Function to insert a new row on the questions grid. Do not call it directly, it's call by addQuestion
	 * 
	 * @param question QuestionnaireQuestion to be inserted
	 * @return Row UI component
	 */
	private Row createQuestionRow(QuestionnaireQuestion question, String parent){
		Row row = new Row();
		Label lab0 = new Label();
		lab0.setValue(question.getPosition()+"");
		
		Label lab1 = new Label();
		lab1.setValue(question.getId());
		row.setId(question.getId()+"-rowqstn");

		Label lab2 = new Label();
		lab2.setValue(question.getType());

		Label lab3 = new Label();
		lab3.setValue(question.getTitle());
		lab3.setSclass("question");
		lab3.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				Component comp = arg0.getTarget();
				comp = comp.getParent();
				modifyQuestion(comp);
			}
		});

		Label lab4 = new Label();
		if(question.getType().equals(SystemDictionary.QUESTION_TYPE_ONE_ANSWER) || question.getType().equals(SystemDictionary.QUESTION_TYPE_MANY_ANSWERS)){
			lab4.setValue(question.getAnswers().getAnswer().length+"");
		}else{
			lab4.setValue("1");
		}
		Label lab5 = new Label();
		if(parent == null || parent.equals("0")){	lab5.setValue("root");	}else{	lab5.setValue(parent);	}
		
		row.appendChild(lab1);
		row.appendChild(lab0);
		row.appendChild(lab2);
		row.appendChild(lab3);
		row.appendChild(lab4);
		row.appendChild(lab5);
		
		
		Button addchild = new Button();
		String text = Labels.getLabel("qm.addchildbut");
		addchild.setLabel(text);
		addchild.setId(question.getId()+"-childbtn");
		addchild.addEventListener("onClick", new AddChildListener(question.getId()));
		row.appendChild(addchild);
		
		Button btn = new Button();
		btn.setLabel("-");
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				Component comp = arg0.getTarget();
				comp = comp.getParent();
				removeQuestionRow(comp);
				
			}
		});
		row.appendChild(btn);
		
		return row;
	}
	
	@SuppressWarnings("unchecked")
	private void removeQuestionRow(Component comp, boolean removechildren){
		SystemDictionary.webguiLog("TRACE", comp.getId());
		Rows rows = (Rows)getFellow("rows_questions");
		String ID = comp.getId().substring(0, comp.getId().length()-8);
		rows.removeChild(comp);
		for(int i=0;i<this.questionlist.size(); i++){
			if(this.questionlist.get(i).getId().equals(ID)){
				SystemDictionary.webguiLog("TRACE", "QSIZE before: "+this.questionlist.size());
				this.questionlist.remove(i);
				SystemDictionary.webguiLog("TRACE", "QSIZE after: "+this.questionlist.size());
			}
		}
		if(removechildren){
			ArrayList<RelatedQuestion> copy = (ArrayList<RelatedQuestion>)this.questionlist.clone();
			for(int i = 0 ; i < copy.size() ; i++){
				if(copy.get(i).getParent().equals(ID)){
					this.removeQuestionRow((Row)getFellow(copy.get(i).getId()+"-rowqstn"));
				}
			}
		}
		//this.removeQuestion(ID);
	}
	
	/**
	 * Helper method to remove a question from the questionnaire (UI and data)
	 * 
	 * @param comp Row UI-component to be removed
	 */
	private void removeQuestionRow(Component comp){
		this.removeQuestionRow(comp, true);
	}
	
	/**
	 * Helper function to get a new ID for a new question
	 * 
	 * @return String ID to be applied to a new question
	 */
	private String getNewQuestionID(){
		if(this.questionlist.size()==0){
			return "1";
		}else{
			Integer ret = new Integer("0");
			for(int i= 0; i<this.questionlist.size(); i++){
				Integer compare = new Integer(this.questionlist.get(i).getId());
				if( compare > ret){
					ret = compare;
				}
			}
			ret = ret+1;
			return ret.toString();
		}
	}
	
	/**
	 * This opens a new modal window to update a question 
	 * 
	 * @param comp UI component whose id is the question ID. 
	 * @throws InterruptedException
	 */
	private void modifyQuestion(Component comp) throws InterruptedException{
		String id = comp.getId().substring(0, comp.getId().length()-8);
		for(int i=0; i<this.questionlist.size(); i++){
			if(this.questionlist.get(i).getId().equals(id)){
				Window win = new QuestionWindow(this, this.questionlist.get(i).getQuestion(), this.questionlist.get(i).getParent());
					if(!this.questionlist.get(i).getParent().equals("0")){
						win.getFellow("question_condrow").setVisible(true);
					}
				this.appendChild(win);
				win.doModal();
			}
		}
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
	
	/**
	 * Custom event listener to show the window to update question data.
	 *
	 */
	private class AddChildListener implements EventListener{
		
		private String questionid = null;
		
		public AddChildListener(String id){
			this.questionid = id;
		}
		
		public void onEvent(Event arg0) throws InterruptedException{
			showAnswerWindow(this.questionid);
		}
	}
}
