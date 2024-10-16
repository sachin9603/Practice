package Emp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Emp.Exception.EmployeeException;
import Emp.model.Employee;
import Emp.utility.ConnectioFactory;
import Emp.utility.QueryUtility;

public class EmployeeDaoImpl  implements EmployeeDao{
	
	//ConnectionFactory conn = new ConnectionFactory ();
	QueryUtility que  = new QueryUtility()  ;
	
	

	@Override
	public String registerEmp(Employee emp) throws EmployeeException {
		
		// hibernate.save(emp)

		
		String msg = null   ;
		
		try {
			
			Connection conn  = ConnectioFactory.getInstance().getConnection();
            PreparedStatement ppst  =  conn.prepareStatement(que.insertEmployee());
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

		List<Employee> allEmp  = new ArrayList<>() ;
		
		try {
			
			Connection conn  = ConnectioFactory.getInstance().getConnection();
            PreparedStatement ppst  =  conn.prepareStatement(que.getAllEmp());
			
            
			ResultSet rset  = ppst.executeQuery();
			
			while(rset.next()) {
				
				Employee e  = new Employee()  ;
				e.setName(rset.getString("ename"));
				e.setEid(rset.getInt("eid"));
				e.setSalary(rset.getDouble("esalary"));
				
				allEmp.add(e) ;
				
			}
		
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allEmp;
	}

	@Override
	public Employee getEmpById(int id) throws EmployeeException {
		
		
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
