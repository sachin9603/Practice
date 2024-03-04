package com.Anudip.EmployeeApp6878;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("employee") ;
		
		EntityManager em  =  emf .createEntityManager() ;
		
		
		//Employee e = new Employee( "raju" , 90000) ;
		
		Employee e   = em.find(Employee.class, 1) ;
		
		
		if (e!= null) {
			em.getTransaction().begin(); 
			
			e.setSalary(e.getSalary() + 10000);
			
			em.getTransaction().commit(); 
			System.out.println("donne");
			
			
		}else {
			 System.out.println("bhai kkoi data nahi hai ");
		}
		
		
		em.close();
		
		
	}

}
