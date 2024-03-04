package Emp.Dao;

import java.util.List;

import Emp.Exception.EmployeeException;
import Emp.model.Deparment;
import Emp.model.Employee;

public interface DepartmentDao {
	
	public String registerdep(Deparment e);
	
	public List<Deparment> getAlldep(Employee e)throws EmployeeException ;

//	public Employee getEmpByID(int id)throws EmployeeException ;
//
//	public String updateEmp(Employee e)throws EmployeeException ;

	

}
