package com.student.association;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDemo {

	public static void main(String[] args) {
		
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
buildSessionFactory();
	
	Session session=factory.openSession();

	Transaction tx=session.beginTransaction();
	
//	Question q1=new Question();
//	q1.setQuestionId(101);
//	q1.setQuestion("What is java");

	
//	Answer a1=new Answer();
//	a1.setAnswer("Java is a programming language");
//	a1.setQuestion(q1);
//	
//	Answer a2=new Answer();
//	a2.setAnswer("it is a platform independent");
//	a2.setQuestion(q1);
//	
//	List<Answer> answers=new ArrayList<Answer>();
//	answers.add(a1);
//	answers.add(a2);
//	
//	q1.setAnswers(answers);
//	
//	session.save(q1);
//	tx.commit();
//	System.out.println("data added successfully");
	
	Question question=session.get(Question.class, 101);
	System.out.println(question.getQuestion());
	
	System.out.println("Answer");
	for(Answer ans:question.getAnswers())
	{
		System.out.println(ans.getAnswer());
	}
	session.close();
	factory.close();
	}

}
