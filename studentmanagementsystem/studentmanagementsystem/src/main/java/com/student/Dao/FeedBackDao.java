package com.student.Dao;

import com.student.entity.Feedback;
import com.student.entity.Student;

public interface FeedBackDao {

 Student getStudent(String studentID);
Feedback createFeedback(Feedback feedback);
}
