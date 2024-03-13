package com.student.service;

import com.student.entity.Instructor;

public interface InstructorService {
Instructor createInstructor(Instructor instructor);
Instructor getInstructor(String instructorId);
}
