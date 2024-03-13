package Com.Anudip.StudentManager.StudentDao;

import java.util.List;

//import com.student.entity.Enrollment;

import Com.Anudip.StudentManager.Model.Student;

public interface StudentDao {
	
	public Student createStudent(Student s);
	
	List<Student> getAllStudent() ;
 //	Enrollment StudentEnrollment(Enrollment enrollment);
	
	Student getStudent(String studentID);
	
 //	List<Enrollment> getEnrollmentDetailsByCourseId(String courseId);
	Student updateStudent(String studentID,Student updatedStudent);
	
	String deleteStudent(String studentID);
	

}
