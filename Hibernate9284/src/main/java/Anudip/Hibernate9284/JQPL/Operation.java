package Anudip.Hibernate9284.JQPL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Operation {

	public static void main(String[] args) {
		
	EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
	 // you have toget all employee name into upper case 
		
		//scaler function 
		// JPQL
		Query  q  = em.createQuery("select Upper(e.ename) from Employee e") ;
		
		List<String>  list  = q.getResultList() ;
		
		for(String name   : list ) {
			System.out.println(name);
		}
		
		
		
      Query  qq  = em.createQuery("select MAX(e.eid) from Employee e") ;
		
	
      Integer s = (Integer) qq.getSingleResult() ;
		
		System.out.println(s);
		
		
		
	}
}
