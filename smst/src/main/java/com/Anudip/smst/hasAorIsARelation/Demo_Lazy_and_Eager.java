package com.Anudip.smst.hasAorIsARelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class Demo_Lazy_and_Eager {
	
	
	public static void main(String[] args) {
		  EntityManagerFactory emf  = Persistence.createEntityManagerFactory("developerUnit");
			
			EntityManager em = emf.createEntityManager() ;
			
			
			// suppose you want to get data of developer ----- it will give data of deve 
			// but if you are not asking data of deve address 
			
			Developer  dev = em.find(Developer.class, 8989) ;
			
			
		
			
			System.out.println(dev.getName());
			System.out.println(dev.getSalary());
			System.out.println(dev.getName());
			
			
			System.out.println("all addresss----------------------");
			
			
			
			Set<Address> set  = dev.getAddresses() ;
			
			System.out.println(set);
			
			
			em.close();
			
	}

}
