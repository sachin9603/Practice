package com.Anudip.smst.bidirectional;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoBiDirectional {
	
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("developerUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		
//		Depp dep = new Depp()  ;
//		dep.setDepId(123);
//		dep.setDepName("CS");
//		
//		
//		Employee e1 = new Employee() ;
//		e1.setDeparment(dep);
//		e1.setId(1212); 
//		e1.setName("Ruhul");
//		
//		
//		Employee e2 = new Employee() ;
//		e2.setDeparment(dep);
//		e2.setId(12); 
//		e2.setName("Parul");
//		
//		
//		Employee e3= new Employee() ;
//		e3.setDeparment(dep);
//		e3.setId(1200); 
//		e3.setName("Sarla");
//		
//		Set<Employee >se = new HashSet<Employee> ()  ;
//		se.add(e3);
//		se.add(e2);
//		se.add(e1) ;
//		
//		dep.setEmployees(se);
		
		
		em.getTransaction().begin();
		
		Depp dep = em.find(Depp.class, 123) ;
		
		System.out.println(dep.getDepName());
	
		Set<Employee>  set  = dep.getEmployees() ;
		
		for(Employee d   :set) {
			System.out.println(d.getName());
		}
	    //  System.out.println(dep.getEmployees().get(1).;
		
		System.out.println("--------------------------------");
		
		Employee e  = em.find(Employee.class, 12);
		
		System.out.println(e.getDeparment().getDepName());
	
	em.getTransaction().commit();
	em.close();
		
		
	}

}
