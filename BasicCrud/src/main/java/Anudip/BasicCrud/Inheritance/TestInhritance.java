package Anudip.BasicCrud.Inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInhritance {
	
	
public static void main(String[] args) {
   EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentUnit") ;
		
		EntityManager em  = emf.createEntityManager();
	MyProduct p  = new MyProduct() ;
	
	
	Book bb = new Book() ;
	bb.setAuthor("Norman vincit");
	bb.setId(43);
	bb.setName("ikigai");
			
	p.setId(34) ;
	p.setName("Prower of PT") ;
	em.getTransaction().begin(); 
	em.persist(bb); 
	em.getTransaction().commit(); 
	em.close();
	
	}

}
