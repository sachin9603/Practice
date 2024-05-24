package com.Anudip.MasterEmpAPP;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //  System.out.println( "Hello World!" );
        
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("EmpUnit") ;
        
        EntityManager em  = emf.createEntityManager() ;
        
       // Query query   = em.createQuery("select name from employee_details");
       // Query query  = em.createQuery("select upper(name) from Employee ");
        //Query query  = em.createQuery("select s from Employee s ");
        //Query query  = em.createQuery("select s from Employee s where s.empId Between 12 and 230");       
//        Query q  = em.createNamedQuery("fd by id");
//        q.setParameter("id", 232) ;
        
      //  Query q  =  em.createNativeQuery("select * from employee_details " ,Employee.class);
        
        Query q  = em.createNamedQuery("findunique");
        
        
        
       // List<Employee> list  = q.getResultList();
       Employee e =  (Employee) q .getSingleResult() ;
        
      System.out.println(e.getName());
//        for(Employee e:list) {
//        	System.out.println(e);
//        }
       
       
//        em.getTransaction().begin()`; 
//      
//              e1.setName("Sachin"); 
// 
//        em.getTransaction().commit(); 
        em.close();
        
        
    }
}
