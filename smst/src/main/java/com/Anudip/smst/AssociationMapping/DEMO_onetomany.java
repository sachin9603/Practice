package com.Anudip.smst.AssociationMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DEMO_onetomany {
	
	public static void main(String[] args) {
		 EntityManagerFactory emf  = Persistence.createEntityManagerFactory("developerUnit");
			
			EntityManager em = emf.createEntityManager() ;
			
//			Address a = new Address (12121 , "Bhopal" , "2321312") ;
//			Address a2 = new Address (121 , "Indore" , "2321312") ;
//			
//			Student s1  = new Student(23  , "Pooja" ,a ) ;
//			Student s2  = new Student(2  , "Hirdesh" ,a ) ;
//			Student s3  = new Student(45  , "Ruhul" ,a ) ;
//			Student s4  = new Student(32  , "Jaypal" ,a2 ) ;
//			
//			em.getTransaction().begin(); 
//			em.persist(s1);
//			em.persist(s2);
//			em.persist(s3);
//			em.persist(s4);
//			
//			em.getTransaction().commit();
//			em.close();
			
			
			
			em.getTransaction().begin();
			
			Student s  = em.find(Student.class  , 23);
			em.getTransaction().commit();
			em.close();
			
			System.out.println(s.getSid());
			System.out.println(s.getSname());
			System.out.println(s.getAdd());
			
			
			
	}

}
