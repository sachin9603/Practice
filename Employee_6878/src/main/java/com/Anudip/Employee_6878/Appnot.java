package com.Anudip.Employee_6878;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class Appnot 
{
    public static void main( String[] args )
    {
      
    	EntityManagerFactory emf =   Persistence.createEntityManagerFactory("employeeunit");
    	EntityManager em  = emf.createEntityManager() ;
    	
    	em.getTransaction().begin();
    	
    	Department d  = new Department(232 , "TESTING") ;
    	
    	Employee e  = new Employee(2  , "RAJU") ;
    	
    	 e.setDep(d);
    	
    	Car c1 = new Car(23 , "scorpio" ) ;
    	c1.setEmpId(2);
    	Car c2 = new Car(137 , "verna") ;
    	c2.setEmpId(2);
    	
    	
    	List<Car>  cars  = new ArrayList<>() ;
    	cars.add(c1) ;
    	cars.add(c2) ;
    	
    	e.setCars(cars);
    ////////////////////////////////////////////////////////////
    	
    	

    	Employee e2  = new Employee(8788  , "Ranjana") ;
    	
    	e2.setDep(d);
    	
    	Car c11 = new Car(233 , "scorpio" ) ;
    	c11.setEmpId(8788);
    	Car c21 = new Car(1237 , "verna") ;
    	c21.setEmpId(8788);
    	
    	
    	List<Car>  carss  = new ArrayList<>() ;
    	carss.add(c11) ;
    	carss.add(c21) ;
    	e2.setCars(carss);
    	
    	
    	Set<Employee> employees = new HashSet<Employee>();
    	employees.add(e2) ;
    	employees.add(e);
    	
// e2.setCars(carss);
    	
    	d.setEmployees(employees);
 
//    	Car c  = em.find(Car.class, 124);
//        System.out.println(c.getEmpId());
        
//    	
//    	
    Department ddd  = em.find(Department.class, 232);
    
    
    Set <Employee> eee =ddd.getEmployees() ;
    
     for(Employee ddf :eee) {
    	
    	System.out.println(ddf);
    	
    }
    
//    
  System.out.println(ddd.getDname()); 

//    	
//   	em.persist(e2);
//    	em.persist(e);
    	//em.persist(d);
    	
    	em.getTransaction().commit();
    	em.clear();
    	
    	
    }
}
