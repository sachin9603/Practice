package com.student.Dao;

import com.student.entity.Course;
import com.student.entity.Student;

public interface CourseDao {
Course createCourse(Course course);	
Course getCourse(String courseID);
}
