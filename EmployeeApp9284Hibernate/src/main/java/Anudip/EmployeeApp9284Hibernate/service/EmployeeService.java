package Anudip.EmployeeApp9284Hibernate.service;

import Anudip.EmployeeApp9284Hibernate.exception.EmployeeException;
import Anudip.EmployeeApp9284Hibernate.model.Employee;

public interface EmployeeService {
	
	public boolean createEmployeeAccount(Employee e)throws EmployeeException ;
	public boolean deleteEmployee(int eid)throws EmployeeException  ;
	public boolean updateEmployee(Employee e)throws EmployeeException ;
	public boolean findEmployee(int eid )throws EmployeeException ; 
	

}
