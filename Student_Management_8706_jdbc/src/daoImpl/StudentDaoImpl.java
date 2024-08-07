package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.StudentDao;
import exception.StudentException;
import model.Student;

import utility.Dao;

public class StudentDaoImpl implements StudentDao {
	
    Connection con  = null  ;
	PreparedStatement  ppst   = null  ;

	public Connection doSimple() {
		Connection connection = null;
		try {
			connection = Dao.getConnectionFactory().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     return connection ;

	}

	@Override
	public String addStudent(Student s) throws StudentException {
		
		// TODO Auto-generated method stub
		String msg = null ;
		
		con = doSimple();
		try {
			ppst = con.prepareStatement("insert into student values (?,?,? )");
			ppst.setInt(1, s.getStudent_id() ); 
			ppst.setString(2, s.getStudent_name());
			ppst.setInt(3, s.getStudent_marks());
			
			int ans = ppst.executeUpdate() ;
			
			if(ans != 0 ) {
				msg ="student inserted successfully"	 ;
				
			}else {
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}

	@Override
	public String updteStudent(Student s) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(int studentId) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllstudent() throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getSingleStudentbyID() throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

}
