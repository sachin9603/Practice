package Student.dao;

import java.util.List;

import Student.Exception.StudentException;
import Student.model.Student;

public interface StudentDao {
	
	// ye sidha contact karegi database se
	public String registerStudent(Student s  ) throws StudentException ; 
	
	public String deleteStudent(int rollnumber) throws StudentException;
	
	public List<Student> getAllStudent();
	
	public String updateStudent(Student s ) throws StudentException ;
	
	
	
	

}
