package Com.Anudip.hibernate6879Student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Associationmapping {
	
	public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SachinPamar") ;
		
		EntityManager em  = emf.createEntityManager() ;
		
		    Address  ad  = new Address(8  , "Rantagiri" , "MP") ;
		    
		    Book  b =  new Book(12  , "CS") ; 
		    b.setStudentId(133);
		    
		    Book  b2 =  new Book(2  , "java") ; 
		    b2.setStudentId(133);
		    
		    List<Book> bss  = new ArrayList<>() ;
		    bss.add(b);
		    bss.add(b2);
	    
		    
		    
		    Student s  = new Student(133 , "Riya") ;
		    s.setAddress(ad); 
		    s.setBooks(bss);
		    
//		    Student s2  = new Student(55 , "TIya") ;
//		    s2.setAddress(ad); 
//		    
		    
		
		
		    em.getTransaction().begin();
		    em.persist(ad);
		    
		    em.persist(s);
		    
		  //  em.persist(s2);
		    em.getTransaction().commit(); 
		    em.close();
		     
	}

}
