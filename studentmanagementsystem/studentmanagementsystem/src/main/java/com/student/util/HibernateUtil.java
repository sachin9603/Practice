package com.student.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.student.entity.Course;
import com.student.entity.Enrollment;
import com.student.entity.Feedback;
import com.student.entity.Instructor;
import com.student.entity.Student;

public class HibernateUtil {
	
	private final static SessionFactory sessionFactory=buildSessionFactory();
private static SessionFactory buildSessionFactory()
{

	try {
		return new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Enrollment.class)
				.addAnnotatedClass(Feedback.class)
				.buildSessionFactory();
		
	}catch (Throwable e) {
		throw new ExceptionInInitializerError(e);
	}
}

public static SessionFactory getSessionFactory() {
	return sessionFactory;
}

public static Session getSession()
{
  return getSessionFactory().openSession(); //session opened
}
	
}
