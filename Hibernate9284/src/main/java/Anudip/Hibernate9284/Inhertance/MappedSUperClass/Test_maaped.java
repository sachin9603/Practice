package Anudip.Hibernate9284.Inhertance.MappedSUperClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Anudip.Hibernate9284.Inhertance.joinedType.Animal;
import Anudip.Hibernate9284.Inhertance.joinedType.Pet;

public class Test_maaped {


	public static void main(String[] args) {
EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
//		Person a=  new Person() ;
//		a.setName("Shubham");   person ki koi table hi banayegaaa sirf child k sath table banegi 
		
//		a.setPersonId(88);
//		
		MyEmployee kk = new MyEmployee()   ;
		kk.setCompany("TSC");
		kk.setName("PURan");
		kk.setPersonId(8372);
		
		
		
		 
		em.getTransaction().begin(); 
		
		
		em.persist(kk);
		
		em.getTransaction().commit(); 
		em.close() ;
		
		
		
		
	}


}
