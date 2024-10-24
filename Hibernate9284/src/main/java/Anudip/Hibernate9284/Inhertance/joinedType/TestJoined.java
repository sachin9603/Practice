package Anudip.Hibernate9284.Inhertance.joinedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Anudip.Hibernate9284.Inhertance.Book;
import Anudip.Hibernate9284.Inhertance.MyProduct;
import Anudip.Hibernate9284.Inhertance.Pen;

public class TestJoined {
	

	public static void main(String[] args) {
EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		Animal a=  new Animal(9  ,"sher") ;
		Pet pp  = new Pet(8  , "Babbar") ;
		
		 
		em.getTransaction().begin(); 
		
		em.persist(a);
		
		em.persist(pp);
		
		em.getTransaction().commit(); 
		em.close() ;
		
		
		
		
	}


}
