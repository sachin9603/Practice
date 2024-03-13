package Com.Anudip.StudentManager_____2.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao {
	
 private static EntityManagerFactory emf  = null ;
 
 static {
	 emf  = Persistence.createEntityManagerFactory("studentst");
 }
 
 public static EntityManager provoideConnection() {
	return emf.createEntityManager() ;
	
 }

}
