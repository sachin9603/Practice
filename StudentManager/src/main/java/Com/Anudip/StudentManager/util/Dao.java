package Com.Anudip.StudentManager.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao {
	
	private static EntityManagerFactory emf   ;
	
	static {
		emf  = Persistence.createEntityManagerFactory("employee");
	}
	
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
	

}
