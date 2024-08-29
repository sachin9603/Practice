package Anudip.BasicCrud;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestHasRelation {

	
	public static void main(String[] args) {
		EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentUnit") ;
		
		EntityManager em  = emf.createEntityManager();
		
	//EmployeeHASAddress  pp  = new EmployeeHASAddress() ;
//	
//	
//	pp.setEid(34); 
//    pp.setEname("Rahul Tiwari") ;
//    pp.setHome_add(new Address("inore" , "mpp " , "343434"));
//    pp.setOffice_add(new Address("Pitampurrrr" , "mpp " , "343434"));
//   // pp.set(new Address("inore" , "mpp " , "343434"));
//
//    
//    em.getTransaction().begin(); 
//    em.persist(pp); 
//    em.getTransaction().commit(); 
//    em.close() ;
//    System.out.println("task done ");
//	
//	pp.setEid(55);
//	pp.setEname("Rajkumar" );
//	pp.getAddess().add(new Address("mum" , "mh" , "3434"));
//	
//	pp.getAddess().add(new Address("munnar" , "kerala" , "3439994"));
//	
//	  em.getTransaction().begin(); 
//	  
//    em.persist(pp); 
//    em.getTransaction().commit(); 
//    em.close() ;
//    System.out.println("task done ");

	
	EmployeeHASAddress emp= em.find(EmployeeHASAddress.class, 55);
	
	
//	em.close(); // even though before closing the EM obj we got the Employee obj
	//here only Employee related obj will be loaded, address obj data will not be loaded
	//so while fetching the address-related data we will get an exception.
	System.out.println(emp.getEid());
	System.out.println(emp.getEname());
	
	System.out.println("All Address are:-");
	System.out.println("===========================");
	Set<Address> addreses= emp.getAddess();
	
	for(Address ad:addreses){
	System.out.println("city :"+ad.getCity());
	System.out.println("state :"+ad.getState());
	System.out.println("Pincode :"+ad.getPin());
	System.out.println("***************************");
	}
	System.out.println("done...");
	
	
	em.close(); 
	
	
	
	
    
    
	}
}
