package Emp.service;

import java.util.List;

import Emp.Dao.EmployeeDao;
import Emp.Dao.EmployeeDaoImpl;
import Emp.Exception.EmployeeException;
import Emp.model.Employee;

public class EmployeeServiceImpl  implements EmployeeServicee {
	
	EmployeeDao dao  = new EmployeeDaoImpl() ;
	

	@Override
	public String registerEmp(Employee emp) throws EmployeeException {
		
		String msg  = dao.registerEmp(emp) ;
		
		return msg;
	}

	@Override
	public List<Employee> getAllEmp() throws EmployeeException {
		// TODO Auto-generated method stub
		 List<Employee> list  = dao.getAllEmp() ;
		 
		
		return list;
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
