package Emp.service;

import java.util.List;

import Emp.Exception.EmployeeException;
import Emp.model.Employee;

public interface EmployeeServicee {

	
	public String registerEmp(Employee emp) throws EmployeeException  ;
	
	public List<Employee> getAllEmp() throws EmployeeException ;
	
	public Employee getEmpById(int id) throws EmployeeException  ;
	
	public String updateEmployee(Employee  ee)throws EmployeeException ;
	
	public Employee deleteEmpById(int id)  throws EmployeeException ; 
	


}
