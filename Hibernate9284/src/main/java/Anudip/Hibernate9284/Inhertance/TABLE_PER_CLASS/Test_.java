package Anudip.Hibernate9284.Inhertance.TABLE_PER_CLASS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Anudip.Hibernate9284.Inhertance.joinedType.Animal;
import Anudip.Hibernate9284.Inhertance.joinedType.Pet;

public class Test_ {
	
	

	public static void main(String[] args) {
EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
	Car  ll  =new Car() ;
	
	ll.setCarCompay("Toyata");
	ll.setVehicleId(919);
	
	
	
	Vehicle pp  = new Vehicle(777  , "Innova")  ;
	
//	
//	Vehicle  jj  = em.find(Vehicle.class,977709 ) ;
//Car  lk  = em.find(Car.class,90777 ) ;
//		  
 ///System.out.println(jj);
		em.getTransaction().begin(); 
		
		em.persist(ll);
		
		em.persist(pp);
		
		em.getTransaction().commit(); 
		em.close() ;
		
		
		
		
	}



}
