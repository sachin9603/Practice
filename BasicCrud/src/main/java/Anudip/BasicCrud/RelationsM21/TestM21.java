package Anudip.BasicCrud.RelationsM21;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestM21 {

	public static void main(String[] args) {
		
		 EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentAddressUnit") ;
			
		 EntityManager em  = emf.createEntityManager();
			
			
			em.getTransaction().begin() ;
			
			Address add1   = new Address() ;
			add1.setAid(67); 
			add1.setCity("Chennai"); 
			add1.setPincode("233992");

			
			Student s1 = new Student() ;
			
			s1.setAddress(add1);
			s1.setName("Gyaana ji   ");
			
			
			Student s2 = new Student() ;
			
			s2.setAddress(add1);
			s2.setName(" padaai ji ");
			
			
			Student s3 = new Student() ;
			
			s3.setAddress(add1);
			s3.setName("Raavan  ");
			
			
			em.persist(s3); 
			em.persist(s2);
			em.persist(s1);
			
			
			em.getTransaction().commit(); 
			em.close();
			
			
			
			
			
			
	}
}
