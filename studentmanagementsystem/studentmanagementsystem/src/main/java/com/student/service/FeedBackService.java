package com.student.service;

import com.student.entity.Feedback;
import com.student.entity.Student;

public interface FeedBackService {
	Student getStudent(String studentID);
	Feedback createFeedback(Feedback feedback);
}
