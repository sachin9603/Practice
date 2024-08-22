package Anudip.BasicCrud;

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
    	
    	
    	em.getTransaction().begin(); 
    	em.persist(new Studenttttttt(23, "Rakesh"));
    	em.getTransaction().commit(); 
    	em.close();
    	
    	
        
        
        
    }
}
