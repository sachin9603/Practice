package Com.Anudip.StudentManager.StudentDaoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import Com.Anudip.StudentManager.Model.Student;
import Com.Anudip.StudentManager.StudentDao.StudentDao;
import Com.Anudip.StudentManager.util.Dao;

public class StudentDaoImpl implements StudentDao{

	@Override
	public Student createStudent(Student s) {
		// TODO Auto-generated method stub
		
			EntityManager em  = Dao.provideEntityManager();
		
		   em.getTransaction().begin();
	    em.persist(s);
				em.getTransaction().commit();;
		return s ;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(String studentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(String studentID, Student updatedStudent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(String studentID) {
		// TODO Auto-generated method stub
		return null;
	}

}
