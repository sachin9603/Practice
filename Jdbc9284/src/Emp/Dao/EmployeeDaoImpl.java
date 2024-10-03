package Emp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Emp.Exception.EmployeeException;
import Emp.model.Employee;
import Emp.utility.ConnectioFactory;

public class EmployeeDaoImpl  implements EmployeeDao{
	
	//ConnectionFactory conn = new ConnectionFactory ();
	

	@Override
	public String registerEmp(Employee emp) throws EmployeeException {
		
		String query  = "insert into Employee values(? , ? ,?)" ;
		
		String msg = null   ;
		
		try {
			
			Connection conn  = ConnectioFactory.getInstance().getConnection();

			PreparedStatement ppst  =  conn.prepareStatement(query);
			ppst.setInt(1, emp.getEid());
			ppst.setString(2, emp.getName());
			ppst.setDouble(3, emp.getSalary());
			
			int  x  = ppst.executeUpdate() ;
			if(x> 0) {
				
				msg = "data inserted  successfully " ;
				
			}
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}

	@Override
	public List<Employee> getAllEmp() throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmpById(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(Employee ee) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmpById(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
