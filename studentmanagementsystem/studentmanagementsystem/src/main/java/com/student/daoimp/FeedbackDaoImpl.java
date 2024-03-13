package com.student.daoimp;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.student.Dao.FeedBackDao;
import com.student.entity.Feedback;
import com.student.entity.Student;
import com.student.util.HibernateUtil;

public class FeedbackDaoImpl implements FeedBackDao{

	@Override
	public Student getStudent(String studentID) {
	try(Session session=HibernateUtil.getSession()) {
			
		Student student=session.get(Student.class, studentID);
			return student;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

	@Override
	public Feedback createFeedback(Feedback feedback) {
		
		try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(feedback);
			session.getTransaction().commit();
			return feedback;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}



}
