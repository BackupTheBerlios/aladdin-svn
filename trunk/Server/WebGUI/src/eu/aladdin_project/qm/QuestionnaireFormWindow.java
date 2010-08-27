package eu.aladdin_project.qm;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Window;

import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.QuestionnaireQuestion;

public class QuestionnaireFormWindow extends Window{

	private static final long serialVersionUID = -1990225231090994751L;
	private ArrayList<QuestionnaireQuestion> questionlist = new ArrayList<QuestionnaireQuestion>();
	public static final String ONE_ANSWER_QUESTION_TYPE = "OneAnswer";
	public static final String MANY_ANSWERS_QUESTION_TYPE = "ManyAnswers";
	public static final String FREE_TEXT_QUESTION_TYPE = "FreeText";
	
	/**
	 * Default constructor. It's empty because ZUL page contains everything that is needed at this moment.
	 */
	public QuestionnaireFormWindow(){
		
	}
	
	public void saveQuestionnaire(){
		//String title = ((Textbox)getFellow("qtitle")).getValue();
		QuestionnaireQuestion[] qlist = new QuestionnaireQuestion[questionlist.size()];
		System.out.println("Question LIST SIZE: "+questionlist.size());
		for(int i = 0; i<questionlist.size(); i++){
			qlist[i]=questionlist.get(i);
		}
		System.out.println("Question ARRAY SIZE: "+qlist[0].getTitle());
		StorageComponentProxy proxy = new StorageComponentProxy();
		try{
			proxy.createQuestionnaire(qlist, "1");
		}catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Public function to open a modal window with an one answer Window form
	 * 
	 * @throws InterruptedException
	 */
	public void showOneAnswerWindow() throws InterruptedException{
		Window win = new QuestionWindow(this, this.getNewQuestionID(),ONE_ANSWER_QUESTION_TYPE);
		this.appendChild(win);
		win.doModal();
	}
	
	/**
	 * Public function to open a modal window with a many answers Window form
	 * 
	 * @throws InterruptedException
	 */
	public void showManyAnswersWindow() throws InterruptedException{
		Window win = new QuestionWindow(this, this.getNewQuestionID(),MANY_ANSWERS_QUESTION_TYPE);
		this.appendChild(win);
		win.doModal();
	}
	
	/**
	 * Public function to open a modal window with a free text Window form
	 * 
	 * @throws InterruptedException
	 */
	public void showFreeTextWindow() throws InterruptedException{
		Window win = new QuestionWindow(this, this.getNewQuestionID(),FREE_TEXT_QUESTION_TYPE);
		this.appendChild(win);
		win.doModal();
	}
	
	/**
	 * Function called by question windows to append a new question to the questionnaire
	 *  
	 * @param question to be added
	 */
	public void addQuestion(QuestionnaireQuestion question){
		for(int i = 0; i<this.questionlist.size(); i++){
			QuestionnaireQuestion elem = this.questionlist.get(i);
			if(elem.getId().equals(question.getId())){
				this.removeQuestionRow(getFellow(question.getId()+"-rowqstn"));
			}
		}
		this.questionlist.add(question);

		Rows rows = (Rows)getFellow("rows_questions");

		rows.appendChild(this.createQuestionRow(question));
		System.out.println("Question list size: "+this.questionlist.size());
	}
	
	/**
	 * Function used to insert a new row on the questions grid
	 * 
	 * @param question QuestionnaireQuestion to be inserted
	 * @return Row UI component
	 */
	private Row createQuestionRow(QuestionnaireQuestion question){
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
		if(question.getType().equals(ONE_ANSWER_QUESTION_TYPE) || question.getType().equals(MANY_ANSWERS_QUESTION_TYPE)){
			lab4.setValue(question.getAnswers().length+"");
		}else{
			lab4.setValue("1");
		}
		System.out.println("Adding4... Please wait");
		
		row.appendChild(lab1);
		row.appendChild(lab2);
		row.appendChild(lab3);
		row.appendChild(lab4);
		
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
			QuestionnaireQuestion elem = this.questionlist.get(i);
			if(elem.getId().equals(ID)){
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
				QuestionnaireQuestion elem = this.questionlist.get(i);
				Integer compare = new Integer(elem.getId());
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
			QuestionnaireQuestion q = this.questionlist.get(i);
			if(q.getId().equals(id)){
				Window win = new QuestionWindow(this, q);
				this.appendChild(win);
				win.doModal();
			}
		}
	}
}
