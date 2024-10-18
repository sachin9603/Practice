package Anudip.Hibernate9284.HasARelationShip;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
	EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		em.getTransaction().begin(); 
		
		Student s  = new Student(787  , "Piyush" , new Address("990909" ,"MUM" , "MH")) ;
		
		//s.setName("9090909");
		em.persist(s);
		em.getTransaction().commit();
		em.close();
		
	}

}
