package Emp.Dao;

import java.util.List;

import Emp.Exception.EmployeeException;
import Emp.model.Employee;

public interface EmployeeDao {
	
	public String registerEmp(Employee e)throws EmployeeException ; 
	
	public List<Employee> getAllEmp()throws EmployeeException ;

	public Employee getEmpByID(int id)throws EmployeeException ;

	public String updateEmp(Employee e)throws EmployeeException ;
	
	public List<Employee> getAllbyEmpDepartmentId(int departmentID )throws EmployeeException ;
	
///////get highest salary employee department wise 
	
	public void gethighestsalaryDepartmentwise() ;
	
	
	// get number of emplloyee department wise 

	


	

}
