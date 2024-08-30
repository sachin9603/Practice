package Anudip.BasicCrud.Relation12M;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test12M {
	
	public static void main(String[] args) {
		 EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentAddressUnit") ;
			
		 EntityManager em  = emf.createEntityManager();
			
			
			em.getTransaction().begin() ;
			
			
			Phoneuser user  = new Phoneuser() ;
			user.setEmail("surphknaaa808@gmail.com");
			user.setId(44); 
			user.setName("surphknaaa"); 
		
			
			Phone p1 = new Phone() ;
		     p1.setPhoneNumber(65432654356L); 
		     p1.setPhonType("Mobile");
		     p1.setUserId(44);
		     
		     Phone p2 = new Phone() ;
		     p2.setPhoneNumber(9999000000L); 
		     p2.setPhonType("gharkalandline");
		     p2.setUserId(44);
		     
		     Phone p3 = new Phone() ;
		     p3.setPhoneNumber(68000000009L); 
		     p3.setPhonType("Teliphone");
		     p3.setUserId(44);
		     
		     
		     List<Phone>  allNumber  = new ArrayList<Phone>() ;
		     allNumber.add(p3);
		     allNumber.add(p2);
		     allNumber.add(p1);
		     
		     
		     user.setPhoneTables(allNumber); 
		     
		     em.persist(user);
		     
		     em.getTransaction().commit(); 
		     
		     em.close();
		     
		 	
	}

}
