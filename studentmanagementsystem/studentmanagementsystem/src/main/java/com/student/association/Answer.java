package com.student.association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//many answers belongs to one question
@Entity
public class Answer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(length = 50)
private String answer;

@ManyToOne
@JoinColumn(name = "question_id")
private Question question;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}

public Question getQuestion() {
	return question;
}

public void setQuestion(Question question) {
	this.question = question;
}

public Answer() {
	super();
	// TODO Auto-generated constructor stub
}

public Answer(int id, String answer, Question question) {
	super();
	this.id = id;
	this.answer = answer;
	this.question = question;
}

@Override
public String toString() {
	return "Answer [id=" + id + ", answer=" + answer + ", question=" + question + "]";
}


}
