package Anudip.BasicCrud;

import java.util.Scanner;

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
       
    	EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
    	
    	EntityManager em  = emf.createEntityManager() ;
    	
    	// inserting data into database
//    	em.getTransaction().begin(); // All DML(Insert , Update , Delete) operation should be in Transction Area 
//    	
//    	
//    	em.persist(new Studenttttttt(78, "Rajani"));
//    	
//    	em.getTransaction().commit(); 
//    	em.close();
    	
    	
    	
    	// delete the data from database  
    	
    	Scanner sc  = new Scanner(System.in) ;
    	
//    	int student_id  = sc.nextInt() ;
//    	
//    	
//    	Studenttttttt student_from_id  = em.find(Studenttttttt.class, student_id) ;
//    	
//    	if(student_from_id != null) {
//    		
//    		em.getTransaction().begin(); 
//    		
//    		em.remove(student_from_id);
//    		em.getTransaction().commit(); 
//         	em.close();
//
//    		
//    		System.out.println("Student is Removed");
//    	}else {
//    		System.out.println("There is no student from these id ");
//    	}
//    			
//    			
//    			
    	
    	
    	//Update operation 
    	
    	// suppose i want to change name of Student 
    	System.out.println("please enter the student id  that you want to update ");
    	
    	int student_id  = sc.nextInt() ;
    	
    		Studenttttttt student_from_id  = em.find(Studenttttttt.class, student_id) ;
    		
    		
    		
    	
    	if(student_from_id != null) {
    		String name  =student_from_id.getName() ;
    		
    		System.out.println("This is previous name = "+name+" \n please Enter That name ,you want to change ");
    		
    		String newName  = sc.next() ;
    		
    		em.getTransaction().begin(); 
    		
    		
    		
    		student_from_id.setName(newName);    		
    		
    		em.getTransaction().commit(); 
    		
    		
    		System.out.println("now student name is update ");
         	em.close();
           }else {
    		System.out.println("There is no student from these id ");
    	}
    			
    			
    	
    	
    	
    	
    	
    	
    	
    	
        
        
        
    }
}
