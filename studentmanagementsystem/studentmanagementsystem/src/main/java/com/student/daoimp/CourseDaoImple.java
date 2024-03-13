package com.student.daoimp;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.student.Dao.CourseDao;
import com.student.entity.Course;
import com.student.entity.Student;
import com.student.util.HibernateUtil;

public class CourseDaoImple implements CourseDao {

	@Override
	public Course createCourse(Course course) {
	
			try(Session session=HibernateUtil.getSession()) {
				
				session.beginTransaction();
				session.save(course);
				session.getTransaction().commit();
				return course;
				
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
	public Course getCourse(String courseID) {
		try(Session session=HibernateUtil.getSession()) {
			
			Course course=session.get(Course.class, courseID);
				return course;
				
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
