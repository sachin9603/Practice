package com.Anudip.smst.ISARelation.TablePerClass;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Entity
public class Car extends Vehicle {
	
	private  String carName ;
	

	public Car(Integer vId, String manufacture, String carName) {
		super(vId, manufacture);
		this.carName = carName;
	}
	
	
	public static void main(String[] args) {
		
		
		 EntityManagerFactory emf  = Persistence.createEntityManagerFactory("developerUnit");
			
			EntityManager em = emf.createEntityManager() ;
			 
			Vehicle v  = new Vehicle(12  , "Ashoklayland") ;
		
		Car  c  = new Car(121 , "Toyata" , "Fortuner") ;
		
		
		em.getTransaction().begin(); 
		
		
		em.persist(c);
		em.persist(v);
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	
	

}
