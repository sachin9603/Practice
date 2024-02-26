package com.Anudip.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        Name  n  = new Name() ;
        n.setFname("VASU"); 
        n.setMname("dev");
        n.setLname("parmar");
        Dost d  = new Dost() ;
        d.setDcolour("white");
        d.setDid(12); 
        d.setDname(n);
        
        
        Configuration con  = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Dost.class) ;
        
        ServiceRegistry reg  = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry() ;
        SessionFactory  sf  = con.buildSessionFactory(reg) ;
        
        Session session  = sf.openSession() ;
        
        Transaction tx=  session.beginTransaction() ;
        
       session.save(d) ;// this is not working but it will work after some 
        
        tx.commit();
    }
}
