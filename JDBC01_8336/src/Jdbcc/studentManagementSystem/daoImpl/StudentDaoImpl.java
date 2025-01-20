package studentManagementSystem.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import studentManagementSystem.dao.StudentDao;
import studentManagementSystem.exception.StudentException;
import studentManagementSystem.model.Standard;
import studentManagementSystem.model.Student;
import studentManagementSystem.utility.Dao;
import studentManagementSystem.utility.QueryUtil;

public class StudentDaoImpl implements StudentDao {

	PreparedStatement ptmt = null; 
	
	@Override
	public String registerStudent(Student studentBean) throws StudentException {
                String status  = "student not added "  ;
		try (Connection con  = Dao.getInstance().getConnection() ) {
		
			String queryString = QueryUtil.registerStudent() ;
			
			ptmt = con.prepareStatement(queryString);
			ptmt.setInt(1, studentBean.getStudentID());
			ptmt.setString(2, studentBean.getStudentName());
			ptmt.setString(3, studentBean.getStudentAddress());
			ptmt.setInt(4, studentBean.getClassid());
			
			ptmt.executeUpdate();
			status ="Data Added Successfully" ;
			
			} catch (SQLException e) {
			e.printStackTrace();
			}
			return status;
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
		
		ArrayList <Student>  allStudent  = new ArrayList<>()  ;
		
		try (Connection con  = Dao.getInstance().getConnection() ) {
			
			PreparedStatement ps  = con.prepareStatement("select * from student") ;
			
			ResultSet rs  = ps.executeQuery() ;
			
			while(rs.next()) {
				
				int rollnumber = rs.getInt(1) ;
				String name  = rs.getString(2) ;
				String address  = rs.getString(3) ;
				int classData  = rs.getInt(4) ;
				
				Student st  = new Student(rollnumber , name  , address ,classData ) ;
				allStudent.add(st) ;
				//allStudent.add(new Student(rs.getInt(1)  , rs.getString(2) , rs.getString(3))) ;
			}
			
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allStudent;
	}

	@Override
	public Student getStudentbyRoll(int rollnumber) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createStandard(Standard st) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Student> getAllstudentByClassId(int classID) {
		// TODO Auto-generated method stub
		
		
       ArrayList <Student>  allStudent  = new ArrayList<>()  ;
		
		try (Connection con  = Dao.getInstance().getConnection() ) {
			
			PreparedStatement ps  = con.prepareStatement("select * from student where classId = ?") ;
			ps.setInt(1,classID );
			
			ResultSet rs  = ps.executeQuery() ;
			
			while(rs.next()) {
				
				int rollnumber = rs.getInt(1) ;
				String name  = rs.getString(2) ;
				String address  = rs.getString(3) ;
				int classData  = rs.getInt(4) ;
				
				Student st  = new Student(rollnumber , name  , address ,classData ) ;
				allStudent.add(st) ;
				//allStudent.add(new Student(rs.getInt(1)  , rs.getString(2) , rs.getString(3))) ;
			}
			
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allStudent;
		
	
	}

	@Override
	public ArrayList<Student> getAllstudentByClassName(String className) {
		// TODO Auto-generated method stub
		
		
		
	       ArrayList <Student>  allStudent  = new ArrayList<>()  ;
			
			try (Connection con  = Dao.getInstance().getConnection() ) {
				
				PreparedStatement ps  = con.prepareStatement("select s.StudentID  , s.studentName , "
						+ "s.studentAddress , s.classid from student s inner join standard c on s.classid = c.ClassID where c.className = ?") ;
				ps.setString(1,className );
				
				ResultSet rs  = ps.executeQuery() ;
				
				while(rs.next()) {
					
					int rollnumber = rs.getInt(1) ;
					String name  = rs.getString(2) ;
					String address  = rs.getString(3) ;
					int classData  = rs.getInt(4) ;
					
					Student st  = new Student(rollnumber , name  , address ,classData ) ;
					allStudent.add(st) ;
					//allStudent.add(new Student(rs.getInt(1)  , rs.getString(2) , rs.getString(3))) ;
				}
				
		
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return allStudent;
			
	
	}
	
	
	

}
