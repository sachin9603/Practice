package com.student.Dao;

import java.util.List;

import com.student.entity.Enrollment;
import com.student.entity.Student;

public interface StudentDao {

Student createStudent(Student student);	
List<Student> getAllStudents();
Enrollment StudentEnrollment(Enrollment enrollment);
Student getStudent(String studentID);
List<Enrollment> getEnrollmentDetailsByCourseId(String courseId);
Student updateStudent(String studentID,Student updatedStudent);
String deleteStudent(String studentID);
}
