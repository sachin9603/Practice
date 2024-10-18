package Anudip.Hibernate9284.JQPL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Anudip.Hibernate9284.Employee;

public class Operation {

	public static void main(String[] args) {
		
	EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
	 // you have toget all employee name into upper case 
		
		//scaler function 
		// JPQL
//		Query  q  = em.createQuery("select Upper(e.ename) from Employee e") ;
//		
//		List<String>  list  = q.getResultList() ;
//		
//		for(String name   : list ) {
//			System.out.println(name);
//		}
//		
//		
//		
//      Query  qq  = em.createQuery("select MAX(e.eid) from Employee e") ;
//		
//	
//      Integer s = (Integer) qq.getSingleResult() ;
//		
//		System.out.println(s);
//		
		
		
//	Query q  = 	em.createNamedQuery("find_emp_by id") ;
//	
//	q.setParameter("id", 12) ;
//	
//	Employee dd  = (Employee) q.getSingleResult() ;
//	System.out.println(dd);
	// Named Native Query  ---- naam diya gaya sawaal 
//	
//	Query  kk  = em.createNativeQuery(null, null

	
	
	
		Query qq  = em.createNativeQuery("Select * from CompanyEmployee  where eid = 902" , Employee.class) ;
		
		Employee dd  = (Employee) qq.getSingleResult() ;
		
		System.out.println(dd);
	
		
		Query kk  = em.createNamedQuery("Employee.findAllEmployee") ;
		List<Employee>  list  = kk.getResultList() ;
		
		System.out.println(list);
		
		
		
		
		
		
		
		
	}
}
