package com.Anudip.smst.ISARelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoISAnew {
	
	
	public static void main(String[] args) {
		 EntityManagerFactory emf  = Persistence.createEntityManagerFactory("developerUnit");
			
			EntityManager em = emf.createEntityManager() ;
			
			Book niti  = new Book(12  , "Chanakya niti " , "Chanakya") ;
			
			Pen renolds = new Pen(89  , "Renolds" , "Blue");
			MyProduct p  = new MyProduct(898  , "Laptop ");
			em.getTransaction().begin();
			
			em.persist(renolds); 
			em.persist(p);
			em.persist(niti);
			em.getTransaction().commit();
			
			em.close();
			
	}

}
