package com.Anudip.hibenatePersistance;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Dost d1  = new Dost() ;
    	d1.setdAddress("indore" );
    	d1.setdId(2);
    	d1.setdName("swati");
    	
    
    	Configuration con  = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Dost.class) ;
    	
    	
    	SessionFactory sf  = con.buildSessionFactory();
    	
    	
       Session session = sf.openSession() ;
       
       Transaction tx  = session.beginTransaction() ;
    
       session.save(d1) ;
       
       tx.commit();
    
    	
    }
}
