package studentManagementSystem.serviceImpl;

import java.util.ArrayList;

import studentManagementSystem.dao.StudentDao;
import studentManagementSystem.daoImpl.StudentDaoImpl;
import studentManagementSystem.exception.StudentException;
import studentManagementSystem.model.Standard;
import studentManagementSystem.model.Student;
import studentManagementSystem.service.studentService;

public class StudentServiceImpl implements studentService {

	StudentDao  dao  = new StudentDaoImpl()  ;
	@Override
	public String registerStudent(Student student) throws StudentException {
   // humaare pass service mai student aayega then us student ko send karna hai dao ko 
		
		return dao.registerStudent(student);
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

	@Override
	public void createStandard(Standard st) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Student> getAllstudentByClassId(int classID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getAllstudentByClassName(String name) {
		// TODO Auto-generated method stub
		
		
		
		return dao.getAllstudentByClassName(name);
	}

}
