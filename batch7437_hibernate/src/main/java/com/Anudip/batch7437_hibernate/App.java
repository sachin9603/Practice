package com.Anudip.batch7437_hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	Address a  = new Address("Pune" , "Maharastra" ,  "3232");
    	
    	Address aa  = new Address("bhopal_indrapuri" , "mp" ,  "323452");
    	
        Student s  = new Student (9 ,"Karan" ) ;
        
        
        List<Address> list = new ArrayList<>() ;
        
        list.add(aa) ;
        list.add(a) ;
        
        s.setListOfaddress(list);
        
        
//        
//       s.setHome_address(a);
//       s.setCurr_address(aa);
//        
        
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("Studentsdsd") ;
        
        EntityManager em  = emf.createEntityManager() ;
        
//       Student s22  = em.find(Student.class, 12) ;
//        
        em.getTransaction().begin(); 
        
        em.persist(s);
        
        em.getTransaction().commit();
        
        em.close();
        
        
        
    }
}
