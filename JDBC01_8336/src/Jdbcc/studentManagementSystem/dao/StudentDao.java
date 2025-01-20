package studentManagementSystem.dao;

import java.util.ArrayList;

import studentManagementSystem.exception.StudentException;
import studentManagementSystem.model.Standard;
import studentManagementSystem.model.Student;

public interface StudentDao {
	
	// 
	public String registerStudent(Student s)  throws StudentException ;
	
	public String deleteStudent(Integer rollNumber)  throws StudentException ;
	
	public String updateStudent(Student s)  throws StudentException ;
	
	public ArrayList<Student> getAllStudent()  throws StudentException ;

	
	public Student getStudentbyRoll(int rollnumber )  throws StudentException ;

	
	
	// many student can enroll into many course  (from both one to many )
	// Ranjeet can enroll into java , c++  
	// in java multiple student can be there 
	// studentExamform ---- (one student can have only one exam form ) it is one to one 
	
	// one class can have many student  ( one to many ) 
	
	
     public void createStandard(Standard st);
	
	public ArrayList<Student>  getAllstudentByClassId(int classID) ;
	
	public ArrayList<Student>  getAllstudentByClassName(String  name ) ;


}
