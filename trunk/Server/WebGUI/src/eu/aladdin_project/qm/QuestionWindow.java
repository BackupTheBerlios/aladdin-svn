package eu.aladdin_project.qm;

import java.util.ArrayList;

import org.apache.axis.types.UnsignedByte;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Column;
import org.zkoss.zul.Columns;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.xsd.QuestionnaireAnswers;
import eu.aladdin_project.xsd.QuestionnaireQuestion;
import eu.aladdin_project.xsd.QuestionnaireQuestionAnswer;
import eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList;
import eu.aladdin_project.xsd.QuestionnaireQuestionList;

public class QuestionWindow extends Window{
	
	private static final long serialVersionUID = 4976983401212316183L;
	private QuestionnaireFormWindow pform = null;
	private String ID = null;
	private String type = null;
	private String parent = null;
	private ArrayList<QuestionnaireQuestionAnswer> answers = new ArrayList<QuestionnaireQuestionAnswer>();

	/**
	 * Constructor with mandatory reference to "parent" Window. This reference will be used to send information about the question
	 * 
	 * @param QUestionnaireFormWindow pform parent Window
	 * @param String ID question id
	 * @param String type question type 
	 */
	public QuestionWindow(QuestionnaireFormWindow pform, String ID, String parent){
		this.pform = pform;
		this.ID = ID;
		this.parent = parent;
		this.type = SystemDictionary.QUESTION_TYPE_ONE_ANSWER;
		this.setTitle(Labels.getLabel("qm.ans.title.new"));
		this.setClosable(true);
		this.setBorder("normal");
		this.setWidth("650px");
		this.addMainQuestionGrid();
		this.getFellow("freeanswrow").setVisible(false);
	}
	
	public QuestionWindow(QuestionnaireFormWindow pform, QuestionnaireQuestion question, String parent){
		this.pform = pform;
		this.ID = question.getId();
		this.parent = parent;
		this.type = question.getType();
		
		QuestionnaireQuestionAnswer[] qans = question.getAnswers().getAnswer();
		for(int i = 0; i<qans.length; i++){
			this.answers.add(qans[i]);
		}
		
		this.setTitle(Labels.getLabel("qm.ans.title.update"));
		this.setClosable(true);
		this.setBorder("normal");
		this.setWidth("650px");
		this.addMainQuestionGrid();
		this.setMainGridFields(question);
		if(this.type.equals(SystemDictionary.QUESTION_TYPE_ONE_ANSWER) || this.type.equals(SystemDictionary.QUESTION_TYPE_MANY_ANSWERS)){
			this.setAnswersRows();
		}
		this.getFellow("freeanswrow").setVisible(false);
		
	}
	
	public void saveQuestion(){
		QuestionnaireQuestion q = new QuestionnaireQuestion();
		q.setType(this.type);
		q.setId(this.ID);
		
		String title = ((Textbox)getFellow("question_text")).getValue();
		if(getFellow("question_condrow").isVisible()){
			Integer condition = ((Intbox)getFellow("question_cond")).getValue();
			q.setCondition(new UnsignedByte(condition));
		}
		q.setTitle(title);
		QuestionnaireQuestionList qqqlist = new QuestionnaireQuestionList(new QuestionnaireQuestion[0]);
		q.setQuestions(qqqlist);
		
		if(this.type.equals(SystemDictionary.QUESTION_TYPE_ONE_ANSWER) || this.type.equals(SystemDictionary.QUESTION_TYPE_MANY_ANSWERS)){
			QuestionnaireQuestionAnswer[] answersvec = new QuestionnaireQuestionAnswer[this.answers.size()];
			for(int i = 0; i<this.answers.size(); i++){
				answersvec[i]=this.answers.get(i);
			}
			q.setAnswers(new QuestionnaireQuestionAnswerList(answersvec));
		}else{
			q.setAnswers(new QuestionnaireQuestionAnswerList(new QuestionnaireQuestionAnswer[0]));
		}
		this.pform.addQuestion(q,parent);
		this.setVisible(false);
	}
	
	/**
	 * This method is called when users submits a new answer.
	 * Submitted answer is stored on the ArrayList and appended to the main grid.
	 * 
	 */
	public void apendAnswer(){
		Textbox valuebox = (Textbox)getFellow("ans_val");
		String val = valuebox.getValue();
		
		Textbox txtbox = (Textbox)getFellow("ans_text");
		String text = txtbox.getValue();
		
		Row row = new Row();
		//String rowid = val+"-rowform";
		//row.setId(rowid);
		Label lab1 = new Label();
		lab1.setValue(val);
		row.appendChild(lab1);
		
		Label lab2 = new Label();
		lab2.setValue(text);
		row.appendChild(lab2);
		
		Button btn = new Button();
		btn.setLabel("-");
		btn.addEventListener("onClick", new RemoveAnswerListener(row, text));
		row.appendChild(btn);
		
		Rows rows = (Rows)getFellow("rows");
		Row rowRef = (Row)getFellow("rowform");
		rows.removeChild(rowRef);
		rows.appendChild(row);
		rows.appendChild(rowRef);
		
		valuebox.setValue("");
		txtbox.setValue("");
		//rows.beforeChildAdded(row, rowRef);
		QuestionnaireQuestionAnswer qqanswer = new QuestionnaireQuestionAnswer();
		qqanswer.set_value(text);
		qqanswer.setValue(new UnsignedByte(val));
		this.answers.add(qqanswer);
	}
	
	/**
	 * This method removes an answer from the grid and the ArrayList
	 * 
	 * @param comp Component to remove. It is a Row
	 */
	public void removeRow(Component comp, String text){
		Rows rows = (Rows)getFellow("rows");
		rows.removeChild(comp);
		System.out.println("SIZE before: "+this.answers.size());
		this.removeAnswer(text);
		System.out.println("SIZE after: "+this.answers.size());
	}
	
	/**
	 * Helper method to remove an answer from the ArrayList
	 * 
	 * @param ID String which can be parsed to an UnsignedByte
	 */
	private void removeAnswer(String text){
		for(int i=0;i<this.answers.size(); i++){
			QuestionnaireQuestionAnswer elem = this.answers.get(i);
			if(elem.get_value().equals(text)){
				this.answers.remove(i);
				break;
			}
		}
	}
	
	/**
	 * This method builds up a one answer form
	 * 
	 */
	private void addMainQuestionGrid(){
		Grid grid = new Grid();
		
			Columns cols = new Columns();
			Column col1 = new Column();
			col1.setWidth("150px");
			col1.setAlign("right");
			Column col2 = new Column();
			cols.appendChild(col1);
			cols.appendChild(col2);
			grid.appendChild(cols);
			Rows rows = new Rows();
			rows.setId("answersrows");
			
			Row row00 = new Row();
				Label lab00 = new Label();
				lab00.setValue(Labels.getLabel("qm.ans.fields.type"));
				row00.appendChild(lab00);
	
				Listbox lbox00 = new Listbox();
				lbox00.setId("question_typesel");
				lbox00.setMold("select");
				lbox00.setRows(1);
					lbox00.appendItem("One answer", "1");
					lbox00.appendItem("Multiple answers", "2");
					lbox00.appendItem("Free text", "3");
					lbox00.setSelectedIndex(0);
					lbox00.addEventListener("onSelect", new EventListener() {
						
						public void onEvent(Event arg0) throws Exception {
							changeQuestionType();
						}
					});
				row00.appendChild(lbox00);
			rows.appendChild(row00);
			
			Row row0 = new Row();
				Label lab0 = new Label();
				lab0.setValue(Labels.getLabel("qm.ans.fields.id"));
				row0.appendChild(lab0);
	
				Textbox tbox0 = new Textbox();
				tbox0.setId("question_id");
				tbox0.setValue(this.ID);
				tbox0.setReadonly(true);
				row0.appendChild(tbox0);
			rows.appendChild(row0);

				Row row1 = new Row();
					Label lab1 = new Label();
					lab1.setValue(Labels.getLabel("qm.ans.fields.text"));
					row1.appendChild(lab1);
		
					Textbox tbox1 = new Textbox();
					tbox1.setId("question_text");
					row1.appendChild(tbox1);
				rows.appendChild(row1);
				
			Row row02 = new Row();
				Label lab02 = new Label();
				lab02.setValue("Condition (numeric)");
				row02.appendChild(lab02);
	
				Intbox tbox02 = new Intbox();
				tbox02.setId("question_cond");
				row02.appendChild(tbox02);
				row02.setVisible(false);
				row02.setId("question_condrow");
			rows.appendChild(row02);
				
			grid.appendChild(rows);
			
		this.appendChild(grid);
		this.addFreeAnswerRow();
		this.addAnswersRow();
		Button btn = new Button();
		btn.setLabel(Labels.getLabel("qm.ans.fields.addans"));
		btn.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				saveQuestion();
			}
		});
		this.appendChild(btn);

	}
	
	private void setMainGridFields(QuestionnaireQuestion q){
		((Textbox)getFellow("question_text")).setValue(q.getTitle());
		if(q.getCondition() != null){
			((Intbox)getFellow("question_cond")).setValue(new Integer(q.getCondition().toString()));
		}
	}
	
	private void addFreeAnswerRow(){
		Rows rows = (Rows)getFellow("answersrows");
		Row row2 = new Row();
		row2.setId("freeanswrow");
		
		Label lab2 = new Label();
		lab2.setValue(Labels.getLabel("qm.ans.fields.grid.answers"));
		row2.appendChild(lab2);
		
		Label lab3 = new Label();
		lab3.setValue(Labels.getLabel("qm.ans.fields.grid.free"));
		row2.appendChild(lab3);

		rows.appendChild(row2);
	}
	
	private void addAnswersRow(){
		Rows rows = (Rows)getFellow("answersrows");
		Row row2 = new Row();
		row2.setId("multipleanswrow");
		
		Label lab2 = new Label();
		lab2.setValue(Labels.getLabel("qm.ans.fields.grid.answers"));
		row2.appendChild(lab2);

		Grid answ = new Grid();
		Columns columns2 = new Columns();
		Column cola1 = new Column();
		cola1.setLabel(Labels.getLabel("qm.ans.fields.grid.value"));
		Column cola2 = new Column();
		cola2.setLabel(Labels.getLabel("qm.ans.fields.grid.text"));
		Column cola3 = new Column();
		cola3.setWidth("45px");
		
		columns2.appendChild(cola1);
		columns2.appendChild(cola2);
		columns2.appendChild(cola3);
		answ.appendChild(columns2);
		
		Rows arows = new Rows();
		arows.setId("rows");
		Row rowa1 = new Row();
		rowa1.setId("rowform");
		Textbox tboxans1 = new Textbox();
		tboxans1.setId("ans_val");
		Textbox tboxans2 = new Textbox();
		tboxans2.setId("ans_text");
		Button butonans1 = new Button();
		butonans1.setLabel("+");
		butonans1.addEventListener("onClick", new EventListener() {
			
			public void onEvent(Event arg0) throws Exception {
				apendAnswer();
				
			}
		});

		rowa1.appendChild(tboxans1);
		rowa1.appendChild(tboxans2);
		rowa1.appendChild(butonans1);
		arows.appendChild(rowa1);
		
		answ.appendChild(arows);
		row2.appendChild(answ);
		
		rows.appendChild(row2);
	}
	
	private void setAnswersRows(){
		for(int i = 0; i<this.answers.size(); i++){
			QuestionnaireQuestionAnswer answer = this.answers.get(i);
			Row row = new Row();
			//String rowid = answer.getValue().toString()+"-rowform";
			//row.setId(rowid);
			Label lab1 = new Label();
			lab1.setValue(answer.getValue().toString());
			row.appendChild(lab1);
			
			Label lab2 = new Label();
			lab2.setValue(answer.get_value());
			row.appendChild(lab2);
			
			Button btn = new Button();
			btn.setLabel("-");
			btn.addEventListener("onClick", new RemoveAnswerListener(row, answer.get_value()));
			row.appendChild(btn);
			
			Rows rows = (Rows)getFellow("rows");
			Row rowRef = (Row)getFellow("rowform");
			rows.removeChild(rowRef);
			rows.appendChild(row);
			rows.appendChild(rowRef);
		}
		
	}
	
	public void changeQuestionType(){
		int selected = ((Listbox)this.getFellow("question_typesel")).getSelectedIndex();
		switch(selected){
		case 0:
			this.type=SystemDictionary.QUESTION_TYPE_ONE_ANSWER;
			this.getFellow("freeanswrow").setVisible(false);
			this.getFellow("multipleanswrow").setVisible(true);
			break;
		case 1:
			this.type=SystemDictionary.QUESTION_TYPE_MANY_ANSWERS;
			this.getFellow("freeanswrow").setVisible(false);
			this.getFellow("multipleanswrow").setVisible(true);
			break;
		case 2:
			this.type=SystemDictionary.QUESTION_TYPE_FREE_TEXT;
			this.getFellow("freeanswrow").setVisible(true);
			this.getFellow("multipleanswrow").setVisible(false);
			break;
		}
	}
	
	private class RemoveAnswerListener implements EventListener{
		
		private Component comp;
		private String text;
		
		public RemoveAnswerListener(Component compR, String textR){
			comp = compR;
			textR = text;
		}

		public void onEvent(Event arg0) throws Exception {
			removeRow(comp, text);
		}
		
	}
	
}
