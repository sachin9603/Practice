package Anudip.Hibernate9284.Inhertance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		MyProduct p  = new MyProduct(12 , "Laal Daiary")   ;
		 Book  b  = new Book(212  , " India That Is Bharat " ,"Deepak Sai" ) ;
		 Pen pp  = new Pen (898  , "space pen" , "Invisible") ;
		 
		em.getTransaction().begin(); 
		
		em.persist(pp);
		em.persist(b);
		em.persist(p);
		
		em.getTransaction().commit(); 
		em.close() ;
		
		
		
		
	}

}
