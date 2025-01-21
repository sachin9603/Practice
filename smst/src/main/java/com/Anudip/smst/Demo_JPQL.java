package com.Anudip.smst;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Anudip.smst.model.smst_;



public class Demo_JPQL {

	
	
	public static void main(String[] args) {

		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager() ;
		
		// you need to get all student name into upper case 
		
		// this is sql query 
		//Query q  = em.createQuery("select name from Student_detailsss") ;
		
		// but i need to ctreate JPQL   ---alias , it is depedent on class instead of table 
		
		
//		Query q  = em.createQuery("select Upper(s.name) from smst_ s where s.name like 'V%' ") ;
//		
//		List<String >  allName   =  q.getResultList() ;
//		
//		for (String n:allName) {
//			System.out.println("Student name "+ n);
//		}
		
		
		// named query  -------
		
		
//		Query q  = em.createNamedQuery("find by id");
//		
//		q.setParameter("id", 1) ;
//		
//		smst_ ob = (smst_)q.getSingleResult() ;
//		
//	System.out.println(ob);
		
		
		
		///////////////////////////////////////////////////////////////
		
		// Row Sql  queries are called native Query 
		
		// suppose i have to get list of all student 
		
		String  query   =  "select * from Student_detailsss" ;
		
		Query q = em.createNativeQuery(query, smst_.class) ;
		
		List<smst_>  studentList= q.getResultList() ;
		
		
		System.out.println(studentList);
		
		
		
		/////////////////////////////////////////////Named Native Query ///////////////////////////////
		
		
		

		
		Query qq = em.createNamedQuery("smst_.findStudent") ;
		
		List<smst_>  studentLList= qq.getResultList() ;
		
		
		System.out.println(studentLList);
		
		
	}
}
