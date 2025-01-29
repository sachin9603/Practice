package com.Anudip.smst.ISARelation.joinedTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoJoined {

	
	
	public static void main(String[] args) {
		 EntityManagerFactory emf  = Persistence.createEntityManagerFactory("developerUnit");
			
			EntityManager em = emf.createEntityManager() ;
			
			
			Animal a  = new Animal(1212  , "Honey") ;
			
			Pet p  = new Pet(121211 , "meowMeow" ,"Cat") ;
			
			em.getTransaction().begin(); 
			em.persist(p);
			em.persist(a);
			
			em.getTransaction().commit();
			
			em.close();
			
			
			
			
	}
}
