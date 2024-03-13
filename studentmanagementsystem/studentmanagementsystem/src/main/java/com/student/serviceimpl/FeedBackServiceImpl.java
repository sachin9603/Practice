package com.student.serviceimpl;

import com.student.Dao.FeedBackDao;
import com.student.daoimp.FeedbackDaoImpl;
import com.student.entity.Feedback;
import com.student.entity.Student;
import com.student.service.FeedBackService;

public class FeedBackServiceImpl implements FeedBackService {

	FeedBackDao feedBackDao=new FeedbackDaoImpl();
	
	@Override
	public Student getStudent(String studentID) {
		
		return feedBackDao.getStudent(studentID);
	}

	@Override
	public Feedback createFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedBackDao.createFeedback(feedback);
	}

}
