package Anudip.EmployeeApp9284Hibernate.serviceImpl;

import Anudip.EmployeeApp9284Hibernate.dao.EmployeeDao;
import Anudip.EmployeeApp9284Hibernate.daoImpl.EmployeeDaoImpl;
import Anudip.EmployeeApp9284Hibernate.exception.EmployeeException;
import Anudip.EmployeeApp9284Hibernate.model.Employee;
import Anudip.EmployeeApp9284Hibernate.service.EmployeeService;
// humara jab bhi user se data aayega tab pehle vo aageya service k paas then dao
public class EmployeeServiceImpl  implements EmployeeService{

	EmployeeDao dao  = new EmployeeDaoImpl()  ;
	
	@Override
	public boolean createEmployeeAccount(Employee e) throws EmployeeException {

		boolean  ans  =dao.createEmployeeAccount(e) ;
		
		return ans;
	}

	@Override
	public boolean deleteEmployee(int eid) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findEmployee(int eid) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

}
