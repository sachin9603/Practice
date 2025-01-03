package studentManagementSystem.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import studentManagementSystem.dao.StudentDao;
import studentManagementSystem.exception.StudentException;
import studentManagementSystem.model.Student;
import studentManagementSystem.utility.Dao;

public class StudentDaoImpl implements StudentDao {

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
		
		ArrayList <Student>  allStudent  = new ArrayList<>()  ;
		
		try (Connection con  = Dao.getInstance().getConnection() ) {
			
			PreparedStatement ps  = con.prepareStatement("select * from student") ;
			
			ResultSet rs  = ps.executeQuery() ;
			
			while(rs.next()) {
				
				
				allStudent.add(new Student(rs.getInt(1)  , rs.getString(2) , rs.getString(3))) ;
			}
			
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allStudent;
	}
	
	
	

}
