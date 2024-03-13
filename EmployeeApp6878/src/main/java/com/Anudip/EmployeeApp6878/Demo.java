package com.Anudip.EmployeeApp6878;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("employee") ;
		
		EntityManager em  =  emf .createEntityManager() ;
		
		//Employee e1  = new Employee( "paapu" , 888888) ;
		
	    em.getTransaction().begin(); 
	// em.persist(e1);
	    // i want to get list of all employee 
	    // sql is related to database
	    // hql and jpql  these realted to java 
	    
	    //hql 
//	    Query q  = em.createQuery("select empname from Employee");
//	    
//	    List<String> lll = q.getResultList() ;
//	    
//	    for (String ee  : lll) {
//	    	
//	    	System.out.println(ee);
//	    	
//	    }
//	    
	    // this is ex of jpql
//	    Query q  = em.createQuery("from Employee");
//	    
//	    List<Employee> lll = q.getResultList() ;
//	    
//	    for (Employee ee  : lll) {
//	    	
//	    	System.out.println(ee);
//	    	
//	    }
	    
//      Query q  = em.createQuery("select max(e.salary)from Employee e");
//	    
//          double  ii  =  (double) q.getSingleResult();
//	    
////	    for (Employee ee  : lll) {
////	    	
////	    	System.out.println(ee);
////	    	
////	    }
//          System.out.println(ii);
	   
	   // Query q  = em.createQuery("select empname, salary from Employee");
//	    
//	    List<Object> oll  = q.getResultList();
//	    
//	    for(Object o  : oll) {
//	    	System.out.println(o.);
//	    }
//	    
//	    
//	    Query  q  = em.createNamedQuery("find emp by id");
//	    q.setParameter("id", 6);
//	    
//	    Employee d  =(Employee) q.getSingleResult() ;
//	    System.out.println(d);
	 
	  //  Employee e1121= em.find(Employee.class, 9);
	    
	  //.out.println(e1121);
	    Department d  = new Department(78 , "cs") ;
	   
	    Employee e  = new Employee() ;
	    e.setEmpid(45);
	    e.setEmpname("pappu");
	    e.setSalary(90000);
	    e.getAddress().add(new Address("jjjj" ,"mp" , "34343" ,"home")) ;
	    e.getAddress().add(new Address("indooooore" ,"mp" , "399000" ,"office")) ;
        e.setDepartment(d);
        
        Employee e1  = new Employee() ;
	    e1.setEmpid(4);
	    e1.setEmpname("Raju");
	    e1.setSalary(90870);
	    e1.getAddress().add(new Address("ujjain" ,"mp" , "34343" ,"home")) ;
	    e1.getAddress().add(new Address("indore" ,"mp" , "399000" ,"office")) ;
	    e1.setDepartment(d);
        
	    
	    Employee e2  = new Employee() ;
	    e2.setEmpid(42323);
	    e2.setEmpname("Ramesh");
	    e2.setSalary(92300);
	    e2.getAddress().add(new Address("ujjain" ,"mp" , "34343" ,"home")) ;
	    e2.getAddress().add(new Address("indore" ,"mp" , "399000" ,"office")) ;
	    e2.setDepartment(d);
        
	    em.persist(e);
	    em.persist(e1);
	    em.persist(e2);
	    em.persist(d);
	    
	   em.getTransaction().commit(); 
	   
	   System.out.println("donne");

		
		
		em.close();
		
		
	}

}
