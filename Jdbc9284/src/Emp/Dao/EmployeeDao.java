package Emp.Dao;

import java.util.List;

import Emp.Exception.EmployeeException;
import Emp.model.Employee;

public interface EmployeeDao {
	
	
	// Employee, can have mutliple car  , can have sigle profile 
	// a department can have multiple employee 
	
	//depId , depname  a employee do have depid  as attribute 
	
	
	
	
	
	public String registerEmp(Employee emp) throws EmployeeException  ;
	
	public List<Employee> getAllEmp() throws EmployeeException ;
	
	public Employee getEmpById(int id) throws EmployeeException  ;
	
	public String updateEmployee(Employee  ee)throws EmployeeException ;
	
	public Employee deleteEmpById(int id)  throws EmployeeException ; 
	
	
	
	

}
