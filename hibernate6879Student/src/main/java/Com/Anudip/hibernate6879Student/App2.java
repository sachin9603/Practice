package Com.Anudip.hibernate6879Student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SachinPamar") ;
		
		EntityManager em  = emf.createEntityManager() ;
		
		em.getTransaction().begin();
		//Student s  = new Student(8 , "rohit" , "mumbai");
		// this is related to java bean insted of database 
		// "select * from studentdetails"
		// yaha par "select s from Student s "
	//pehle step 	//
		//Query query   = em.createQuery("select UPPER(name) from Student where id = 8") ;
		
	//	Query query   = em.createQuery("select s from Student s where s.id Between 800 and 1000") ;
		
//		Query q  = em.createNamedQuery("find id") ;
		
		Query qq  = em.createNamedQuery("find_all_studnet");
		
//		
//		q.setParameter("id", 992);
		
//		 Student s =  (Student) q.getSingleResult() ;
//		 System.out.println(s);
  List<Student>  List = qq.getResultList();
   
   for(Student s:List) {
	   System.out.println(s);
   }
//		
//	for(Student e :List) {
//		System.out.println(e);
//	}
	//	em.persist(List);
		em.getTransaction().commit();
		em.close(); 
		
		
		
		
	}
}
