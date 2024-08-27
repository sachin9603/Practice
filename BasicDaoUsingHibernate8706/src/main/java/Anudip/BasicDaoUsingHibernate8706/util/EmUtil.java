package Anudip.BasicDaoUsingHibernate8706.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil { 
	
	private static EntityManagerFactory emf ;
	
	static{
		emf = Persistence.createEntityManagerFactory("studentUnit");
	}
    
	public static EntityManager provideEntityManager(){
		return emf.createEntityManager() ;
	}
	
}
