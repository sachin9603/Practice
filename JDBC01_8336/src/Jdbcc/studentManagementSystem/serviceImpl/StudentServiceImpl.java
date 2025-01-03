package studentManagementSystem.serviceImpl;

import java.util.ArrayList;

import studentManagementSystem.dao.StudentDao;
import studentManagementSystem.daoImpl.StudentDaoImpl;
import studentManagementSystem.exception.StudentException;
import studentManagementSystem.model.Student;
import studentManagementSystem.service.studentService;

public class StudentServiceImpl implements studentService {

	StudentDao  dao  = new StudentDaoImpl()  ;
	@Override
	public String registerStudent(Student s) throws StudentException {

		
		return null;
	}

	@Override
	public String deleteStudent(Integer rollNumber) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student s) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getAllStudent() throws StudentException {
		// TODO Auto-generated method stub
		
		
		return dao.getAllStudent() ;
	}

}
