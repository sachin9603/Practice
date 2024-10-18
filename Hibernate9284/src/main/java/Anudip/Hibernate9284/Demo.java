package Anudip.Hibernate9284;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
		
	
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
	
		em.getTransaction().begin(); 
		
		Employee e1  = new Employee( "purohit"  ) ;
		em.persist(e1);
		em.getTransaction().commit(); 
		
		em.close();
		
		
		
		// delete the data
////		
////		System.out.println("please enter your employee Id that you want to delete ");
////		Scanner sc  =new Scanner(System.in) ;
////		
////		int eid  = sc.nextInt() ;
////		
////		Employee ee  = em.find(Employee.class, eid);
////		
////		
////		if (ee!= null) {
////
////			em.getTransaction().begin(); 
////			em.remove(ee);
////			em.getTransaction().commit(); 
////			System.out.println("Employee has been removed ");
////			em.close();
////			
////			
////			
////		}else {
////			
////			System.out.println("There is no such employee with this id ");
////			
////		}
////		
////		
//		
//		 // update////////////////////////////////////////////////////
//		
//		System.out.println("please enter your employee Id that you want to update ");
//		Scanner sc  =new Scanner(System.in) ;
//		
//		int eid  = sc.nextInt() ;
//		
//		Employee ee  = em.find(Employee.class, eid);
//		
//		System.out.println("please add your Surname into");
//		
//		String surname  = sc.next() ;
//
//	     String fullname  = ee.getEname()+" " +surname ;
//	 
//		 ee.setEname(fullname);
//		
//		if (ee!= null) {
//
//			em.getTransaction().begin(); 
//			
//			em.getTransaction().commit(); 
//			System.out.println("Employee has been update  ");
//			em.close();
//			
//			
//			
//		}else {
//			
//			System.out.println("There is no such employee with this id ");
//			
//		}
		
		

		
		
		
		
	}

}
