package studentManagementSystem.service;

import java.util.ArrayList;

import studentManagementSystem.exception.StudentException;
import studentManagementSystem.model.Student;

public interface studentService {

	
	// 
	public String registerStudent(Student s)  throws StudentException ;
	
	public String deleteStudent(Integer rollNumber)  throws StudentException ;
	
	public String updateStudent(Student s)  throws StudentException ;
	
	public ArrayList<Student> getAllStudent()  throws StudentException ;
}
