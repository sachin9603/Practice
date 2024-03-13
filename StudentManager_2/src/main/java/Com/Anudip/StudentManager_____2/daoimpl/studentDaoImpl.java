package Com.Anudip.StudentManager_____2.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;

import Com.Anudip.StudentManager_____2.Dao.StudentDao;
import Com.Anudip.StudentManager_____2.Exception.StudentException;
import Com.Anudip.StudentManager_____2.Model.Student;
import Com.Anudip.StudentManager_____2.Utility.Dao;

public class  studentDaoImpl implements StudentDao
{

	@Override
	public String saveStudent(Student s) throws StudentException {
	
		EntityManager em  = Dao.provoideConnection() ;
		em.getTransaction() .begin(); 
		em.persist(s); 
		em.getTransaction().commit(); 
		em.close();
		
		return "data inserted successfully " ;
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
	
		
		
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
