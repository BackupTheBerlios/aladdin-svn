package eu.aladdin_project.qm;

import java.util.Comparator;

import eu.aladdin_project.xsd.QuestionnaireQuestionAnswer;

public class QuestionAnswerSort implements Comparator <QuestionnaireQuestionAnswer>{

	public int compare(QuestionnaireQuestionAnswer arg0, QuestionnaireQuestionAnswer arg1) {
		return arg0.getPosition()-arg1.getPosition();
	}

}
