package com.student.serviceimpl;

import com.student.Dao.CourseDao;
import com.student.daoimp.CourseDaoImple;
import com.student.entity.Course;
import com.student.service.CourseService;

public class CourseServiceImple implements CourseService {

	CourseDao courseDao=new CourseDaoImple();
	
	@Override
	public Course createCourse(Course course) {
		// TODO Auto-generated method stub
		return courseDao.createCourse(course);
	}

	@Override
	public Course getCourse(String courseID) {
		// TODO Auto-generated method stub
		return courseDao.getCourse(courseID);
	}
	
}
