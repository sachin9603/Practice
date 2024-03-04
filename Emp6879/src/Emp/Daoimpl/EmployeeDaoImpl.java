package Emp.Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Emp.Dao.EmployeeDao;
import Emp.Exception.EmployeeException;
import Emp.Uitlity.Dao;
import Emp.Uitlity.queryUtil;
import Emp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String registerEmp(Employee e) throws EmployeeException {
		// TODO Auto-generated method stu
		
		String msg  = "emplyee is not registered" ;
		
		
		try( Connection con  = Dao.provideConnection()) {
			PreparedStatement ps  = con.prepareStatement(queryUtil.register());
			ps.setInt(1,e.getEmpId());
			ps.setString(2,e.getEmpName()); 
			ps.setDouble(3, e.getSalary());
			ps.setDouble(4, e.getDepid());
			int x  = ps.executeUpdate() ;
			if(x>0) {
				msg = "employee get registered successfully" ;
				
			}
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return msg;
	}

	@Override
	public List<Employee> getAllEmp(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmpByID(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmp(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
