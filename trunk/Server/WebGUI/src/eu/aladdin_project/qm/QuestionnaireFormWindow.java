package eu.aladdin_project.qm;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

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
import eu.aladdin_project.xsd.SystemParameter;

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
		SystemParameter locale = new SystemParameter("en_UK", "English");
		try{
			QuestionnaireInfo qinfo = null;
			Questionnaire questions = null;
			String userid = (String)Sessions.getCurrent().getAttribute("userid");
			StorageComponentProxy proxy = new StorageComponentProxy();
			QuestionnaireInfo[] qlist = proxy.listOfQuestionnaires(locale,userid);
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
			questions = proxy.getQuestionnaire(qid, locale, userid);
			Double version = new Double(qinfo.getVersion()+1);
			((Textbox)getFellow("versionfield")).setValue(version.toString());
			((Textbox)getFellow("versionfield")).setReadonly(true);
			((Textbox)getFellow("qtitle")).setValue(qinfo.getTitle());
			((Textbox)getFellow("qtitle")).setReadonly(true);
			printQuestions(questions.getQuestion(), "0");
		}catch(RemoteException re){
			
		}catch (Exception e){
			
		}
	}
	
	/**
	 * Recursive function to show all the questions on the list, including the inner ones
	 * 
	 * @param qs QuestionnareQuestion array to show
	 * @param parentq String setting parent (mandatory for recursive calls)
	 */
	protected void printQuestions(QuestionnaireQuestion[] qs, String parentq){
		for(int i = 0 ; i < qs.length ; i ++){
			this.addQuestion(qs[i], parentq);
			if(qs[i].getQuestions().getQuestion().length > 0){
				printQuestions(qs[i].getQuestions().getQuestion(), qs[i].getId());
			}
		}
	}
	
	/**
	 * This saves a Questionnaire.
	 * 
	 */
	public void saveQuestionnaire(){
		SystemParameter locale = new SystemParameter("en_UK", "English");
		//related questions management, this is magic don't look at it or it would be self-destroyed!
		int rootquestions = 0;
		for(int ii = 0; ii<questionlist.size(); ii++){
			RelatedQuestion rq = questionlist.get(ii);
			if(rq.getParent().equals("0")){
				rootquestions++;
			}else{
				System.out.println("Entering in subquestion");
				//Search parent and insert question on it
				for(int j=0;j<questionlist.size(); j++){
					RelatedQuestion rq2 = questionlist.get(j);
					if(rq2.getId().equals(rq.getParent())){
						//Save question on question list
						QuestionnaireQuestion[] qqa = new QuestionnaireQuestion[rq2.getQuestion().getQuestions().getQuestion().length+1];
						if(qqa.length>1){
							for(int k = 0; k<rq2.getQuestion().getQuestions().getQuestion().length; k++){
								qqa[k]=rq2.getQuestion().getQuestions().getQuestion()[k];
							}
						}
						qqa[qqa.length-1]=rq.getQuestion();
						rq2.getQuestion().setQuestions(new QuestionnaireQuestionList(qqa));
					}
				}
			}
			
		}
		//End of parent questions management you can look from here
		System.out.print("Root questions: "+rootquestions);
		QuestionnaireQuestion[] qlist = new QuestionnaireQuestion[rootquestions];
		System.out.println("Question LIST SIZE: "+questionlist.size());
		Iterator<RelatedQuestion> it = questionlist.iterator();
		int i = 0;
		while(it.hasNext()){
			RelatedQuestion relq = it.next();
			relq.getQuestion().setId("");
			if(relq.getParent().equals("0")){
				qlist[i]=relq.getQuestion();
				System.out.println("Sub-questions: "+qlist[i].getQuestions().getQuestion().length);
				i++;
			}
		}
		String versionstr = ((Textbox)getFellow("versionfield")).getValue();
		Double version = Double.valueOf(versionstr);
		String title = ((Textbox)getFellow("qtitle")).getValue();

		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			String userid = (String)Sessions.getCurrent().getAttribute("userid");
			OperationResult result = proxy.createQuestionnaire(new Questionnaire(qlist, version, "", title), locale, userid);
			System.out.println("Save Questionnaire: "+result.getCode()+":"+result.getDescription());
		}catch (RemoteException e) {
			e.printStackTrace();
		}finally{
			Executions.getCurrent().sendRedirect("/qm");
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
		System.out.println("Parent question: "+parent);
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
				this.removeQuestionRow(getFellow(question.getId()+"-rowqstn"));
			}
		}
		this.questionlist.add(new RelatedQuestion(parent,question));

		Rows rows = (Rows)getFellow("rows_questions");

		rows.appendChild(this.createQuestionRow(question, parent));
		System.out.println("Question list size: "+this.questionlist.size());
	}
	
	/**
	 * Function to insert a new row on the questions grid. Do not call it directly, it's call by addQuestion
	 * 
	 * @param question QuestionnaireQuestion to be inserted
	 * @return Row UI component
	 */
	private Row createQuestionRow(QuestionnaireQuestion question, String parent){
		Row row = new Row();
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
		System.out.println("Adding4... Please wait");
		
		Label lab5 = new Label();
		if(parent.equals("0")){	lab5.setValue("root");	}else{	lab5.setValue(parent);	}
		
		row.appendChild(lab1);
		row.appendChild(lab2);
		row.appendChild(lab3);
		row.appendChild(lab4);
		row.appendChild(lab5);
		
		
		Button addchild = new Button();
		addchild.setLabel("+child");
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
	
	/**
	 * Helper method to remove a question from the questionnaire (UI and data)
	 * 
	 * @param comp Row UI-component to be removed
	 */
	private void removeQuestionRow(Component comp){
		System.out.println(comp.getId());
		Rows rows = (Rows)getFellow("rows_questions");
		String ID = comp.getId().substring(0, comp.getId().length()-8);
		rows.removeChild(comp);
		for(int i=0;i<this.questionlist.size(); i++){
			if(this.questionlist.get(i).getId().equals(ID)){
				System.out.println("QSIZE before: "+this.questionlist.size());
				this.questionlist.remove(i);
				System.out.println("QSIZE after: "+this.questionlist.size());
			}
		}
		
		ArrayList<RelatedQuestion> copy = (ArrayList<RelatedQuestion>)this.questionlist.clone();
		for(int i = 0 ; i < copy.size() ; i++){
			if(copy.get(i).getParent().equals(ID)){
				this.removeQuestionRow((Row)getFellow(copy.get(i).getId()+"-rowqstn"));
			}
		}
		
		//this.removeQuestion(ID);
		
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
				Window win = new QuestionWindow(this, this.questionlist.get(i).getQuestion());
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
