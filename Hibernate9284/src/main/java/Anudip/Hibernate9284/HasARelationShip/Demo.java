package Anudip.Hibernate9284.HasARelationShip;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
	EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		em.getTransaction().begin(); 
		
		Set<Address> k  = new HashSet<>() ;
		Address l  = new Address("990909" ,"MUM" , "MH") ;
		Address ll  =  new Address("89899" ,"Bhopal" , "MP");
		
		em.find(Student.class, 7) ;
		
		
		k.add(ll) ;
		k.add(l) ;
		

		
		
		Student s  = new Student(7  , "Piyush" , k ) ;
		
		//s.setName("9090909");
		
		em.persist(s);
		
		em.getTransaction().commit();
		em.close();
		
		
		
	}

}
