package com.student.association;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//one question can have many answers
@Entity
public class Question {
@Id	
private int questionId;
@Column(length = 100)
private String question;

@OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
private List<Answer> answers;

public int getQuestionId() {
	return questionId;
}

public void setQuestionId(int questionId) {
	this.questionId = questionId;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public List<Answer> getAnswers() {
	return answers;
}

public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}

public Question(int questionId, String question, List<Answer> answers) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answers = answers;
}

public Question() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
}


}

//question_questionId