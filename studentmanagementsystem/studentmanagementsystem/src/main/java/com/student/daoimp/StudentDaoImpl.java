package com.student.daoimp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.student.Dao.StudentDao;
import com.student.entity.Course;
import com.student.entity.Enrollment;
import com.student.entity.Student;
import com.student.exception.ResourceNotFoundException;
import com.student.util.*;

public class StudentDaoImpl implements StudentDao{

	 Scanner sc=new Scanner(System.in);
	@Override
	public Student createStudent(Student student) {
		try(Session session=HibernateUtil.getSession()) {
			
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
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
	public List<Student> getAllStudents() {
		try(Session session=HibernateUtil.getSession()) {
			
			//execute HQL query to retrieve all students data
			Query<Student> query=session.createQuery("FROM Student");
			List<Student> studentList=query.list();
			return studentList;
			
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
	public Enrollment StudentEnrollment(Enrollment enrollment) {
		try(Session session=HibernateUtil.getSession()) {
			session.beginTransaction();
			session.save(enrollment);
			session.getTransaction().commit();
			return enrollment;
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
	public List<Enrollment> getEnrollmentDetailsByCourseId(String courseId) {
		try(Session session=HibernateUtil.getSession()) {
			Course course=session.get(Course.class, courseId);
			if(course!=null)
			{
				List<Enrollment> enroll=new ArrayList<>();
				//execute HQL query to retrieve all Enrollment data
				Query<Enrollment> query=session.createQuery("FROM Enrollment");
				List<Enrollment> enrollmentList=query.list();
				for(Enrollment e:enrollmentList)
				{
					if(e.getCourse().equals(course))
						enroll.add(e);
				}
				return enroll;
			}
			else
			{
				throw new ResourceNotFoundException("Course id is not found");
			}
		
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
	public Student updateStudent(String studentID,Student updatedStudent) {
		try(Session session=HibernateUtil.getSession()) {
			Student student=session.get(Student.class, studentID);
				session.beginTransaction();
				
				student.setStudentId(studentID);
				student.setFirstName(updatedStudent.getFirstName());
				student.setLastName(updatedStudent.getLastName());
				student.setGender(updatedStudent.getGender());
				student.setEmail(updatedStudent.getEmail());
				
				session.saveOrUpdate(student);
				session.getTransaction().commit();
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
	public String deleteStudent(String studentID) {
		String message=null;
		try(Session session=HibernateUtil.getSession()) {
			Student student=session.get(Student.class, studentID);
				session.beginTransaction();
				System.out.println("Are you sure  you want to delete?");
				String status=sc.next();
				if(status.equalsIgnoreCase("yes"))
				{
					session.delete(student);//data will be deleted from DB
					session.getTransaction().commit();
					session.evict(student);//data will remove from session Cache
					message="Object is deleted";
					
				}else
				{
					message="User wants to retain this object!!";
				}
				
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return message;
	}
	
	}


	

