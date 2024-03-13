package com.student.service;

import com.student.entity.Course;

public interface CourseService {
	Course createCourse(Course course);	
	Course getCourse(String courseID);
}
