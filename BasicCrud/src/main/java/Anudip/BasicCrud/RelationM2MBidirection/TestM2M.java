package Anudip.BasicCrud.RelationM2MBidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class TestM2M {
	
	
	
	public static void main(String[] args) {
		
		 EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentAddressUnit") ;
			
		 EntityManager em  = emf.createEntityManager();
			
			em.getTransaction().begin() ;
			
//			
//			NewCourse c  = new NewCourse() ;
//			
//			c.setCname("java");
//			NewCourse c2  = new NewCourse() ;
//			
//			c2.setCname("c++");
//			
//			NewCourse c3= new NewCourse() ;
//			
//			c3.setCname("cybersecurity");
//			
//			
//			
//			NewStudent s =  new NewStudent() ;
//		
//			s.setSname("Rakul");
//		
//			NewStudent s2 =  new NewStudent() ;
//			
//			s2.setSname("Rahul");
//		
//			
//			Set<NewCourse> c_set = new HashSet<>() ;
//			c_set.add(c3);
//			c_set.add(c2) ;
//			c_set.add(c) ;
//			
//			s.setCourses(c_set);
//			s2.setCourses(c_set);
//			
//			Set<NewStudent> s_set = new HashSet<>() ;
//			 s_set.add(s2);
//			 s_set.add(s);
//			 
//			 c.setStudents(s_set);
//			 c2.setStudents(s_set);
//			 c3.setStudents(s_set);
//			 
//			 
//			 em.persist(s);
//			 em.persist(s2);
			
			
			NewStudent s =   em.find(NewStudent.class, 37) ;
			
			System.out.println(s.getSname());
	
			 
			 em.getTransaction().commit(); 
			 em.close();
			 
			 
			

			
			
		
		
		
	}

}
