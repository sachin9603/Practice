package Com.Anudip.hibernate6879Student;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
// you have to create maven ( prepare interview question also )
// you have to add all dependencies in pom.xml
// src/main/java  k ander ek folder banao "META-INF" then you have to create  persistence.xml file this f
//folder

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    
    	

    	
    	Set<Address> allAdress = new HashSet<Address>();
    	

    	Student s  = new Student(2 , "pinjara") ;
//    	s.setHomeAdresss(ad);
//    	s.setCurrentAdresss(ad2);
    	allAdress.add(ad2);
    	allAdress.add(ad) ;
    	
    	
    	s.setAddress(allAdress);
//    	
    	EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("SachinPamar");
    	
    	EntityManager em  = emf.createEntityManager() ;
    	
    	//Student s3  = em.find(Student.class, 3) ;
    	
//  Query q  = em.createQuery("select e  from Student e");
//    	
//    		List<Student>list  = q.getResultList();
    		
//    	for(Student	 sp:list) {
//    		System.out.println(sp);
//    	}
    em.getTransaction().begin();
    	// save the data 
    	em.persist(s);
    	
    	//update
    	//s3.setAdresss("Gujrat");
    	
    	// delete the data 
    	//em.remove(s3);
    	
    	em.getTransaction().commit();
    	
    	em.close();
    	
    	
    	
    	
    	
    	
    }
}
