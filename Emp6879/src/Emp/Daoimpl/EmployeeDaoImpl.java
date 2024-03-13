package Emp.Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public List<Employee> getAllEmp() throws EmployeeException {
		List<Employee> listOfEmp  = new ArrayList<>() ;
		
		try( Connection con  = Dao.provideConnection()) {
			PreparedStatement ps  = con.prepareStatement(queryUtil.getALLEmp());
			
			ResultSet Rset  = ps.executeQuery(queryUtil.getALLEmp());
			
			while(Rset.next()) {
				int id  = Rset.getInt("id");
				String name  = Rset.getString("name");
				double salary = Rset.getDouble("salary") ;
				int depid  = Rset.getInt("depId") ;
				listOfEmp.add(new Employee(id  , name  , salary , depid)) ;
			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return listOfEmp;
	}

	@Override
	public Employee getEmpByID(int id) throws EmployeeException {
		// TODO Auto-generated method stubEmployee d
		Employee d = null  ;
		try( Connection con  = Dao.provideConnection()) {
			PreparedStatement ps  = con.prepareStatement(queryUtil.getEmpById());
			ps.setInt(1, id);
			ResultSet Rset  = ps.executeQuery();
			
			while(Rset.next()) {
				int eid  = Rset.getInt("id");
				String name  = Rset.getString("name");
				double salary = Rset.getDouble("salary") ;
				int depid  = Rset.getInt("depId") ;
			d  =new Employee(id  , name  , salary , depid) ;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return d;
	}

	@Override
	public String updateEmp(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Employee> getAllbyEmpDepartmentId(int departmentID) throws EmployeeException {
		// TODO Auto-generated method stub
		 List<Employee>  listofemp  = new ArrayList<> () ;
		 
		try( Connection con  = Dao.provideConnection()) {
			PreparedStatement ps  = con.prepareStatement(queryUtil.getallEmpbydepId());
			ps.setInt(1, departmentID);
			ResultSet Rset  = ps.executeQuery();
			
			while(Rset.next()) {
				int eid  = Rset.getInt("id");
				String name  = Rset.getString("name");
				double salary = Rset.getDouble("salary") ;
				int depid  = Rset.getInt("depId") ;
			Employee e  =new Employee(eid  , name  , salary , depid) ;
			
			listofemp.add(e) ;
			
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return listofemp;
	}

	@Override
	public void gethighestsalaryDepartmentwise(){
		
		try( Connection con  = Dao.provideConnection()) {
			PreparedStatement ps  = con.prepareStatement("select d.depart_name, Max(e.salary) as highest_salary from department d inner join Employee e on e.depid = d.depart_Id group by d.depart_name");
			
			ResultSet Rset  = ps.executeQuery();
			
			while(Rset.next()) {
				String name = Rset.getString("depart_name");
				//String name  = Rset.getString("name");
				double salary = Rset.getDouble("highest_salary") ;
				
				System.out.println(name +"-------"+ salary);
			
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

}
