package com.student;

import static com.student.AllOparations.StudentInputs;

import com.student.service.CourseService;
import com.student.service.FeedBackService;
import com.student.service.InstructorService;
import com.student.service.StudentService;
import com.student.serviceimpl.CourseServiceImple;
import com.student.serviceimpl.FeedBackServiceImpl;
import com.student.serviceimpl.InstructorServiceImpl;
import com.student.serviceimpl.StudentServiceImpl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static com.student.MainOperation.*;

import com.student.entity.Course;
import com.student.entity.Enrollment;
import com.student.entity.Feedback;
import com.student.entity.Instructor;
import com.student.entity.Student;
import com.student.exception.ResourceNotFoundException;

public class AllOparations {

static StudentService studentService=new StudentServiceImpl();
static FeedBackService feedBackService=new FeedBackServiceImpl();
static CourseService courseService=new CourseServiceImple();
static InstructorService instructorService=new InstructorServiceImpl();


static Scanner sc=new Scanner(System.in);


public static Student StudentInputs()
{
	sc.nextLine();
	System.out.println("Enter StudentID");
	String studentId=sc.nextLine();
	
	System.out.println("Enter First Name");
	String firstName=sc.nextLine();

	System.out.println("Enter Last Name");
	String lastName=sc.nextLine();
	
	System.out.println("Enter Gender");
	String gender=sc.nextLine();
	
	System.out.println("Enter Email");
	String email=sc.nextLine();
	
	return new Student(studentId, firstName, lastName, gender, email);
		
		
	}

public static Instructor instructorInputs()
{
	sc.nextLine();
	System.out.println("Enter InstructorID");
	String instructorId=sc.nextLine();
	
	System.out.println("Enter First Name");
	String firstName=sc.nextLine();

	System.out.println("Enter Last Name");
	String lastName=sc.nextLine();
	
	
	System.out.println("Enter Email");
	String email=sc.nextLine();
 return new Instructor(instructorId, firstName, lastName, email);
}

public static Course couseInputs()
{
	sc.nextLine();
	System.out.println("Enter courseID");
	String courseId=sc.nextLine();
	
	System.out.println("Enter course Title");
	String courseTitle=sc.nextLine();

	System.out.println("Enter credit");
	int credit=sc.nextInt();
	sc.nextLine();
	
 return new Course(courseId, courseTitle, credit);
}

public static Void StudentOperations()
{
	while(true) {
		System.out.println("Press 1.Add Student Details\nPress 2.Retrieve All Student Data\n"
				+ "Press 3.Update Student Data\nPress 4.Delete Student Data\n"
				+ "Press 5.To getback to the main menu");
		int input=sc.nextInt();	
		
		switch(input) {
		case 1:
			Student student=StudentInputs();
			Student savedEntity=studentService.createStudent(student);
			System.out.println("Student Data has been saved successfully"+ savedEntity);
		
		case 2:
			List<Student> students=studentService.getAllStudents();
			for(Student stud:students)
			{
				System.out.println(stud);
			}
			break;
			
		case 3:sc.nextLine();
			System.out.println("Enter Student Id to update the infromation");
		       String sId=sc.next();
		       Student s=studentService.getStudent(sId);
		       if(s!=null) {
		       Student std=updatedStudentData();
		     //service
		       Student updatedInfo=studentService.updateStudent(sId, std);
		       System.out.println("Student Data has been updated Successfully"+ updatedInfo);
		       }
		       
		       else
		       {
		    	   throw new ResourceNotFoundException("Student Id not found");
		       }
		       
			break;
		
		case 4:
			System.out.println("Enter Student Id to delete the infromation");
		       String id=sc.next();
		       String message=studentService.deleteStudent(id);
		       System.out.println(message);
			break;
		case 5:mainOps();
		}
		
		}
	}

public static Feedback provideFeedback()
{
	sc.nextLine();
	System.out.println("Enter Instructor name");
	String instructorName=sc.nextLine();
	
	System.out.println("Please Provide your feedback");
	String feedback=sc.nextLine();
	
	System.out.println("Enter StudentID");
	String studentId=sc.nextLine();
	Student student=feedBackService.getStudent(studentId);
	
	return new Feedback(instructorName, feedback, student);
}

public static Void feedbackOperations()
{
	while(true) {
		System.out.println("Press 1.Add Feedback\n2.Retrieve Feedback\n"
				+ "3.Update Feedback\nPress 4.To getback to the main menu");
		int input=sc.nextInt();	
		
		switch(input) {
		case 1:
			Feedback feedback=provideFeedback();
			Feedback savedEntity=feedBackService.createFeedback(feedback);
			System.out.println("Your feedback has been stored successfully");
		
		case 2:break;
		case 3:break;
		case 4:mainOps();
		}
		
		}
	}

//public static String createEnrollmentId()
//{
//String s="E"+enrollmentId++; //E1002
//return s;
//}
static Enrollment studentEnrollment()
{
	sc.nextLine();
	System.out.println("Enter Enrollment Id");
	String enrollmentId=sc.nextLine();
	
	System.out.println("Enter Student Id");
	String studentId=sc.nextLine();
	
	System.out.println("Enter Course Id");
	String courseId=sc.nextLine();
	
	System.out.println("Enter Instructor Id");
	String instId=sc.nextLine();
	
	//fetch student object
	Student student=studentService.getStudent(studentId);
	
	////fetch course object
	Course course=courseService.getCourse(courseId);
	
	//fetch Instructr object
	Instructor instructor=instructorService.getInstructor(instId);
	return new Enrollment(enrollmentId, student, course, instructor);
}


public static Student updatedStudentData()
{
	sc.nextLine();
	
	System.out.println("Enter First Name");
	String firstName=sc.nextLine();

	System.out.println("Enter Last Name");
	String lastName=sc.nextLine();
	
	System.out.println("Enter Gender");
	String gender=sc.nextLine();
	
	System.out.println("Enter Email");
	String email=sc.nextLine();
	
	return new Student(firstName, lastName, gender, email);
			
	}

public static Void instructorOperations()
{
	while(true) {
		System.out.println("Press 1.Add Instructor Details\n2.Retrieve All Instructor Data\n"
				+ "3.Update Instructor Data\nPress 4.To getback to the main menu");
		int input=sc.nextInt();	
		
		switch(input) {
		case 1:
			Instructor instructor=instructorInputs();
			Instructor ins=instructorService.createInstructor(instructor);
			System.out.println("Instructor details added successfully"+ ins);
			break;
			
		case 4:
			mainOps();
		}
}
}

public static Void courseOperations()
{
	while(true) {
		System.out.println("Press 1.Add Course Details\n2.Retrieve All Course Data\n"
				+ "3.Update Course Data\nPress 4.To getback to the main menu");
		int input=sc.nextInt();	
		
		switch(input) {
		case 1:
			Course course=couseInputs();
			Course crs=courseService.createCourse(course);
			System.out.println("Course details added successfully"+ crs);
			break;
			
		case 4:
			mainOps();
		}
}
}
public static List<Enrollment> getEnrollmentByCourse()
{
System.out.println("Enter Course Id");
String crsId=sc.nextLine();
List<Enrollment> enroll=studentService.getEnrollmentDetailsByCourseId(crsId);
return enroll;
}
}
