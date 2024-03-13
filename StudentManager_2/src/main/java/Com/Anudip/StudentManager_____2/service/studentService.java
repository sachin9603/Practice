package Com.Anudip.StudentManager_____2.service;

import java.util.List;

import Com.Anudip.StudentManager_____2.Exception.StudentException;
import Com.Anudip.StudentManager_____2.Model.Student;

public interface studentService {


	public String saveStudent(Student  s) throws StudentException ;
	
	public List<Student> getAllStudent() throws StudentException;
	
	public Student getStudentById(String id )throws StudentException ;
	
	public String deleteStudentbyId(String Id )throws StudentException ;
	

}
