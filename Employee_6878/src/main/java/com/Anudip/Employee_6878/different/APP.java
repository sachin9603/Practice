package com.Anudip.Employee_6878.different;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class APP {
  
	
	public static void main(String[] args) {
		

    	EntityManagerFactory emf =   Persistence.createEntityManagerFactory("employeeunit");
    	EntityManager em  = emf.createEntityManager() ;
    	
    	em.getTransaction().begin();
    	
    	
       Pen p  = new Pen() ;
      p.setName("Renolds") ;
    p.setColor("Blue");
    Book b=  new Book() ;
    b.setAuthor("Sachin");
    b.setName("spring MCV");
    b.setProductId(777);
    

      p.setProductId(232); 
     em.persist(b);
      
      em.getTransaction().commit(); 
      em.close();
       
		
	}
}
