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
    	
    	Address  a  = new Address("lanka" , "00000" ,"shilanka");
    	
    	Dost d1  = new Dost() ;
    	
    	d1.setdAddress(a);
    	d1.setdId(366);
    	d1.setdName("surpanka");
    	
    
    	Configuration con  = new Configuration().configure().addAnnotatedClass(Dost.class) ;
    	SessionFactory sf  = con.buildSessionFactory();
    	
    	
       Session session = sf.openSession() ;
       
       Transaction tx  = session.beginTransaction() ;
    
       Dost df   = (Dost) session.get(Dost.class,3) ;
       
       tx.commit();
    
       System.out.println(df);
    	
    }
}
