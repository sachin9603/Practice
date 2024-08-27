package Anudip.BasicCrud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLL1 {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentUnit") ;
		EntityManager em  = emf.createEntityManager();
		
		// we all students name in upper case 
		
//		Query  query  = em.createQuery("select Upper(s.name) from Studenttttttt s");
//		
//		
//		List<String>  list = query.getResultList() ;
		
//		for( String name : list){
//			System.out.print(name +" ");
//		}
		
		
		///write a query to get all students who are starting with D
		
//		Query q  = em.createQuery("select s from Studenttttttt s where s.name like 'D%'") ;
//		
//		List<Studenttttttt>  list  =  q.getResultList() ;
//		
//		for( Studenttttttt s : list){
//			System.out.print(s);
//		}
//		
		
		/////////////////////named Query ////////////////////////
		
		Query qq= em.createNamedQuery("find emp id") ;
		
		qq.setParameter("id", 66) ;
		
		List<Employee>  list  = qq.getResultList() ;
		
		
		System.out.println(list.get(0));
		
		Query qq2 = em.createNativeQuery("select * from Employee_data where deg = 'D' " ,Employee.class);
		
		List<Employee>  listt  = qq2.getResultList() ;
		
		System.out.println(listt.get(0));
		
		System.out.println(listt.get(1));
		
		Query qq3  = em.createNamedQuery("Find All Employee");
		
		
		List<Employee> l3   = qq3.getResultList();
		
		for (Employee e:l3) {
			
			System.out.println(e);
		}
		
		
	}

}
