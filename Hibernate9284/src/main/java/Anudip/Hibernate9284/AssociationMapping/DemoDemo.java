package Anudip.Hibernate9284.AssociationMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoDemo {
	
	public static void main(String[] args) {
       EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		em.getTransaction().begin(); 
		
		Address  kk = new Address(3  , "Bhopal" , "MP") ;
		
		  Studnt s  = new Studnt(12 , "Rahul puttar" , kk ) ;
		  
		  Studnt dd = new Studnt(34  , "Paneer Puttar" ,   kk) ;
		
		
		em.persist(s); 
		em.persist(dd); 
		
		
		em.getTransaction() .commit();
		 
		em.close(); 
		
		
		
}
		
}


