package com.Anudip.MasterEmpAPP.different;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Appnot {

	public static void main(String[] args) {
		 EntityManagerFactory emf  = Persistence.createEntityManagerFactory("EmpUnit") ;
	        
	        EntityManager em  = emf.createEntityManager() ;
	        
	        Pen p  = new Pen() ;
	        p.setColour("Blue");
	        p.setId(232); 
	        p.setName("Renolds");
	        
	        em.getTransaction().begin(); 
	        
	        em.persist(p);
	        em.getTransaction().commit();
	        em.close();
	        
	        
	}
}
