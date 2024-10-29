package Anudip.Hibernate9284.AssociationMapping.onetoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToManhy {
	
	public static void main(String[] args) {
		
		 EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
			
			EntityManager em = emf.createEntityManager() ;
			
			
			PhoneUser pu = new PhoneUser() ;
			pu.setUserid(20);
			pu.setUsername("RamPrasd") ;
			
			
			Phone p1  = new Phone(12  , "Office" ,"8238928329" , 20)  ;
			Phone p2  = new Phone(15  , "Office" ,"8238928329" , 20)  ;
			Phone p3  = new Phone(18  , "Office" ,"8238928329" , 20)  ;
			
			List<Phone> plist  = new ArrayList<>()  ;
			plist.add(p3) ;
			plist.add(p1) ;
			plist.add(p2) ;
			
			pu.setPhoneList(plist);
			
			
			em.getTransaction().begin(); 
			
			em.persist(pu);
			
			em.getTransaction().commit(); 
			em.close();
			
			
	}

}
