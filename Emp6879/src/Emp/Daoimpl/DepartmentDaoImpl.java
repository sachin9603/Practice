package Emp.Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Emp.Dao.DepartmentDao;
import Emp.Exception.EmployeeException;
import Emp.Uitlity.Dao;
import Emp.model.Deparment;
import Emp.model.Employee;

public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public String registerdep(Deparment d) {
		// TODO Auto-generated method stub
		String ms  = "" ;
		try(Connection con  = Dao.provideConnection()){
			PreparedStatement ps  = con.prepareStatement("insert into department values(? ,?)") ;
			ps.setInt(1, d.getdId());
			ps.setString(2, d.getDname()) ;
			int row  = ps.executeUpdate() ;
			if (row > 0) {
				ms  = "get regitered " ;
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return ms;
	}

	@Override
	public List<Deparment> getAlldep(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
