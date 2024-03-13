package com.student.serviceimpl;


import com.student.Dao.InstructorDao;
import com.student.daoimp.InstructorDaoImpl;
import com.student.entity.Instructor;
import com.student.service.InstructorService;


public class InstructorServiceImpl implements InstructorService {

	InstructorDao instructorDao=new InstructorDaoImpl();
	
	@Override
	public Instructor createInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return instructorDao.createInstructor(instructor);
	}

	@Override
	public Instructor getInstructor(String instructorId) {
		// TODO Auto-generated method stub
		return instructorDao.getInstructor(instructorId);
	}

}
