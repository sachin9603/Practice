package Anudip.BasicCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestHasRelation {

	
	public static void main(String[] args) {
		EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentUnit") ;
		EntityManager em  = emf.createEntityManager();
		
	EmployeeHASAddress  pp  = new EmployeeHASAddress() ;
	
	
	pp.setEid(34); 
    pp.setEname("Rahul Tiwari") ;
    pp.setHome_add(new Address("inore" , "mpp " , "343434"));
    pp.setOffice_add(new Address("Pitampurrrr" , "mpp " , "343434"));
   // pp.set(new Address("inore" , "mpp " , "343434"));

    
    em.getTransaction().begin(); 
    em.persist(pp); 
    em.getTransaction().commit(); 
    em.close() ;
    System.out.println("task done ");
    
    
	}
}
