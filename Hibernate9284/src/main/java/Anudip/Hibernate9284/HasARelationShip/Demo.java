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
		
//		Set<Address> k  = new HashSet<>() ;
//		
//		Address l  = new Address("990909" ,"MUM" , "MH") ;
//		Address ll  =  new Address("89899" ,"Bhopal" , "MP");
//		
//		
    Student ss  = 	em.find(Student.class, 7) ;
    
    em .close();
		
		System.out.println(ss.getId() );
		System.out.println(ss.getName());
		System.out.println("////////////////////////////////////////");
		Set <Address> set  = ss.getMultipleAddress() ;

		
		for(Address s :  set) {
			System.out.println(s);
		}
		
		
		
		
	}

}
