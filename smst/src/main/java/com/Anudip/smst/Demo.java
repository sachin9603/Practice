package com.Anudip.smst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Anudip.smst.model.smst_;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		
		// Create operation 
//		
//		smst_ student = new smst_("Pritam" , "Bhojnagar" , "268763");
//		
//		
//		em.getTransaction().begin();  
//		
//		em.persist(student);
//		
//		em.getTransaction().commit(); 
//		em.close();
//		
		
		// delete Operation 
		
		
		
		
		smst_ obj  = em.find(smst_.class , 2 ) ;
		
		
		if (obj != null) {
			em.getTransaction().begin(); 
			em.remove(obj);
			
			em.getTransaction().commit(); 
			em.close();
		}
		System.out.println("data Get Deleted Successfully ");
		
		
		
		
		
		
		
		
		
	}

}
