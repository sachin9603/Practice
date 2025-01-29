package com.Anudip.smst.Association1toM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo12M {
	
	public static void main(String[] args) {
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("developerUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		PhoneUser u1  = new PhoneUser();
		u1.setUid(9090);
		u1.setUname("Ruhul");
		
		Phone p1  =  new Phone(12, "88888"  ) ;
		Phone p2  =  new Phone(152, "999999"  ) ;
		
		List<Phone> lis  = new ArrayList<> ()  ;
		lis.add(p2) ;
		lis.add(p1);
		
		
		u1.setPhoneNumbers(lis);
		
		
		em.getTransaction().begin(); 
		
		em.persist(u1);
		
	     em.getTransaction().commit(); 
	     em.close();
		
		
	}

}
