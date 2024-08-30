package Anudip.BasicCrud.RelationsM21;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestM21 {

	public static void main(String[] args) {
		
		 EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentAddressUnit") ;
			
		 EntityManager em  = emf.createEntityManager();
			
			
			em.getTransaction().begin() ;
			
			Address add1   = new Address() ;
			add1.setAid(67); 
			add1.setCity("Chennai"); 
			add1.setPincode("233992");

			
			Student s1 = new Student() ;
			
			s1.setAddress(add1);
			s1.setName("Gyaana ji   ");
			
			
			Student s2 = new Student() ;
			
			s2.setAddress(add1);
			s2.setName(" padaai ji ");
			
			
			Student s3 = new Student() ;
			
			s3.setAddress(add1);
			s3.setName("Raavan  ");
			
			
//			em.persist(s3); 
//			em.persist(s2);
//			em.persist(s1);
			
			Student  student1  = em.find(Student.class, 4);
			// lazy   loading hoti hai  iska matlab hai  
			//or tab load hoga jab usko calll  karoge 
			// jo adddress hai vo hai secondary object 
			System.out.println(student1.getName());
			System.out.println(student1.getAddress().getCity()); // load ho jaayega but ye load k liye 
			// data base mai request 
			// buta agr maalo ki  id load karna ahai 
			System.out.println(student1.getId()); // toh koi request nahi data base k paas   paas   
			// iska matlab hai ki jab find ko calll karaa tha tabhi puraa student load lekin uska second obj nahiaa yaya 
			
			//System.out.println(student1.getAddress());// nahi aayega address yaha par kyuki connection close hogaya hai 
			// or 
			//System.out.println(student1.getId()); // id call karoge toh aajaye kuki vo toh pehle load ho chuki hai 
			
			
			
			
			em.getTransaction().commit(); 
			
			em.close();
			
			
			
			
			
	}
}
