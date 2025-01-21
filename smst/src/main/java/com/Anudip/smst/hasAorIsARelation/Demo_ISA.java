package com.Anudip.smst.hasAorIsARelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo_ISA {

	
	public static void main(String[] args) {
		
EntityManagerFactory emf  = Persistence.createEntityManagerFactory("developerUnit");
		
		EntityManager em = emf.createEntityManager() ;
//		
//		Address  add  = new Address("Inodre" , "MP" , "4652001") ;
//		Developer dev  = new Developer(8989  , "Ruhul" , 50000  , add) ;
//		
//		em.getTransaction().begin(); 
//		
//		em.persist(dev);
//		
//		em.getTransaction().commit(); 
//		
//		em.close();
//		
//		
		
		
//		Address  add  = new Address("Inodre" , "MP" , "4652001") ;
//		Address  addOff  = new Address("Banglore" , "Karnataka" , "4652901") ;
//		Developer dev  = new Developer(8989  , "Ruhul" , 50000  , add , addOff) ;
//		
//		em.getTransaction().begin(); 
//		
//		em.persist(dev);
//		
//		em.getTransaction().commit(); 
//		
//		em.close();
//		
//		
		
		

		Address  add  = new Address("Inodre" , "MP" , "4652001") ;
		Address  addOff  = new Address("Banglore" , "Karnataka" , "4652901") ;
		Developer dev  = new Developer(8989  , "Pratiksha" , 50000  ) ;
		dev.getAddresses().add(addOff) ;
		
		dev.getAddresses().add(add) ;
		em.getTransaction().begin(); 
		
		em.persist(dev);
		
		em.getTransaction().commit(); 
		
		em.close();
		
	}
}
