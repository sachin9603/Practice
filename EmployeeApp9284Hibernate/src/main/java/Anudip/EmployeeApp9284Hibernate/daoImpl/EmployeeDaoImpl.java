package Anudip.EmployeeApp9284Hibernate.daoImpl;

import javax.persistence.EntityManager;

import Anudip.EmployeeApp9284Hibernate.dao.EmployeeDao;
import Anudip.EmployeeApp9284Hibernate.exception.EmployeeException;
import Anudip.EmployeeApp9284Hibernate.model.Employee;
import Anudip.EmployeeApp9284Hibernate.utility.EMutil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public boolean createEmployeeAccount(Employee e) throws EmployeeException {
		// TODO Auto-generated method stub
		boolean flg  = false ;
		
		String username = e.getEmployeeUsername();
		if(username.contains("@")) {
			EntityManager em  = EMutil.provideEntityManager();
			em.getTransaction().begin(); 
		    em.persist(e);
		    flg = true  ;
		    em.getTransaction().commit(); 
		    em.close();
		}else {
			throw new EmployeeException("your username is invalid");
		}
		
	
	
		
		
		
		return flg;
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
