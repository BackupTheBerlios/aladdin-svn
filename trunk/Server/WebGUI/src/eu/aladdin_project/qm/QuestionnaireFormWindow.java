package eu.aladdin_project.qm;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.OperationResult;
import eu.aladdin_project.xsd.QuestionnaireQuestion;

public class QuestionnaireFormWindow extends Window{

	private static final long serialVersionUID = -1990225231090994751L;
	private ArrayList<RelatedQuestion> questionlist = new ArrayList<RelatedQuestion>();
	
	
	/**
	 * Default constructor. It's empty because ZUL page contains everything that is needed at this moment.
	 */
	public QuestionnaireFormWindow(){
	}
	
	public void saveQuestionnaire(){
		//TODO Manage parent questions, this is magic don't touch!
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
						QuestionnaireQuestion[] qqa = new QuestionnaireQuestion[rq2.getQuestion().getQuestions().length+1];
						if(qqa.length>1){
							for(int k = 0; k<rq2.getQuestion().getQuestions().length; k++){
								qqa[k]=rq2.getQuestion().getQuestions()[k];
							}
						}
						qqa[qqa.length-1]=rq.getQuestion();
						rq2.getQuestion().setQuestions(qqa);
					}
				}
			}
			
		}
		System.out.print("Root questions: "+rootquestions);
		QuestionnaireQuestion[] qlist = new QuestionnaireQuestion[rootquestions];
		System.out.println("Question LIST SIZE: "+questionlist.size());
		Iterator<RelatedQuestion> it = questionlist.iterator();
		int i = 0;
		while(it.hasNext()){
			RelatedQuestion relq = it.next();
			if(relq.getParent().equals("0")){
				qlist[i]=relq.getQuestion();
				System.out.println("Sub-questions: "+qlist[i].getQuestions().length);
				if(qlist[i].getQuestions().length>0){
					System.out.println("Sub-sub-questions: "+qlist[i].getQuestions()[0].getQuestions().length);
				}
				i++;
			}
		}
		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			String userid = (String)Sessions.getCurrent().getAttribute("userid");
			OperationResult result = proxy.createQuestionnaire(qlist, userid);
			System.out.println("Save Questionnaire: "+result.getCode()+":"+result.getDescription());
		}catch (RemoteException e) {
			e.printStackTrace();
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
	 * Function used to insert a new row on the questions grid
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
			lab4.setValue(question.getAnswers().length+"");
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
				System.out.println(comp.getId());
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
		Rows rows = (Rows)getFellow("rows_questions");
		rows.removeChild(comp);
		System.out.println("QSIZE before: "+this.questionlist.size());
		this.removeQuestion(comp.getId().substring(0, comp.getId().length()-8));
		System.out.println("QSIZE after: "+this.questionlist.size());
	}
	
	/**
	 * Helper methos to remove question from the instance ArrayList
	 * 
	 * @param ID String containing the ID of the question to be removed.
	 */
	private void removeQuestion(String ID){
		for(int i=0;i<this.questionlist.size(); i++){
			if(this.questionlist.get(i).getId().equals(ID)){
				this.questionlist.remove(i);
			}
		}
	}
	
	/**
	 * Helper function used to get a new ID for a new question
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
	
	private void modifyQuestion(Component comp) throws InterruptedException{
		String id = comp.getId().substring(0, comp.getId().length()-8);
		for(int i=0; i<this.questionlist.size(); i++){
			if(this.questionlist.get(i).getId().equals(id)){
				Window win = new QuestionWindow(this, this.questionlist.get(i).getQuestion());
				this.appendChild(win);
				win.doModal();
			}
		}
	}
	
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
