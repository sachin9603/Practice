package Student.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Student.Exception.StudentException;
import Student.dao.StudentDao;
import Student.model.Student;
import Student.utility.DAO;

public class StudentDaoimpl implements StudentDao  {

	@Override
	public String registerStudent(Student s) throws StudentException {
		// TODO Auto-generated method stub
		
		String result   = "student not registered " ;
		// try with resource isko karne se aapko connection ko manually close karne ki need nahi hai 
		
		try(Connection connnn  = DAO.provideConnection()) {
			
			PreparedStatement prs  =connnn.prepareStatement("insert into student values (?,?,?)") ;
			prs.setInt(1, s.getRollnumber());
			prs.setString(2, s.getName());
			prs.setInt(3, s.getMarks());
			
			// insert , update ,delete 
			int row = prs.executeUpdate() ;
			if (row>0) {
				result = "student inserted successfully  " ;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public String deleteStudent(int rollnumber) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student s) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

}
