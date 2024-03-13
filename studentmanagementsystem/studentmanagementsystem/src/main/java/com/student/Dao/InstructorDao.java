package com.student.Dao;

import com.student.entity.Course;
import com.student.entity.Instructor;
import com.student.entity.Student;

public interface InstructorDao {
Instructor createInstructor(Instructor instructor);	
Instructor getInstructor(String instructorId);
}
