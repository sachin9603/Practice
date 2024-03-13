package com.student.daoimp;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.student.Dao.InstructorDao;
import com.student.entity.Instructor;
import com.student.entity.Student;
import com.student.util.HibernateUtil;

public class InstructorDaoImpl implements InstructorDao{

	@Override
	public Instructor createInstructor(Instructor instructor) {
	try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(instructor);
			session.getTransaction().commit();
			return instructor;
			
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
	public Instructor getInstructor(String instructorId) {
		try(Session session=HibernateUtil.getSession()) {
			
			Instructor instructor=session.get(Instructor.class, instructorId);
				return instructor;
				
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
