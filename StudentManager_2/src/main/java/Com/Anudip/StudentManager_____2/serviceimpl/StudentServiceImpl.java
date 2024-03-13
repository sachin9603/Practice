package Com.Anudip.StudentManager_____2.serviceimpl;

import java.util.List;

import Com.Anudip.StudentManager_____2.Dao.StudentDao;
import Com.Anudip.StudentManager_____2.Exception.StudentException;
import Com.Anudip.StudentManager_____2.Model.Student;
import Com.Anudip.StudentManager_____2.daoimpl.studentDaoImpl;
import Com.Anudip.StudentManager_____2.service.studentService;

public class StudentServiceImpl implements studentService {

	
	private StudentDao studentDao = new studentDaoImpl() ;
	
	@Override
	public String saveStudent(Student s) throws StudentException {
		//  I have to rectify the data  then i have to persist into data base 
		return studentDao.saveStudent(s);
		
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(String id) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudentbyId(String Id) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

}
