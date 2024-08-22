package MainMain;

import daoImpl.StudentDaoImpl;
import exception.StudentException;
import model.Student;

public class StudentMain {
	
	static StudentDaoImpl  dao  = new StudentDaoImpl () ;
	
	
	public static void main(String[] args) {
		
		try {
			String s  =dao.addStudent(new Student(4555  , "Kamlesh" , 600)) ;
			System.out.println(s);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
