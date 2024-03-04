package Emp.Dao;

import java.util.List;

import Emp.Exception.EmployeeException;
import Emp.model.Employee;

public interface EmployeeDao {
	
	public String registerEmp(Employee e)throws EmployeeException ; 
	
	public List<Employee> getAllEmp(Employee e)throws EmployeeException ;

	public Employee getEmpByID(int id)throws EmployeeException ;

	public String updateEmp(Employee e)throws EmployeeException ;

	

}
