package com.Anudip.hibenatePersistance;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class StudentMain {
	
	public static void main(String[] args) {
	    Laptop lpppp = new Laptop(9979 , "asus") ;
		
		Student s = new Student ("kanak", 998898);
		
		s.getBooklist().add(new Books (23 , "cs"  , 8989)) ;
		//s.getBooklist().add(new Books (7866 , "c++"  , 89)) ;
		s.setLp(lpppp);
		lpppp.setS(s);
		
		Configuration con = new Configuration().configure("hib.cfg.xml").addAnnotatedClass(Student.class)
				                                                        .addAnnotatedClass(Laptop.class)
				                                                        .addAnnotatedClass(Books.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(registry);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		
		session.save(s);
		
       //		List<Student> stu  =  session.;
		// session.saveOrUpdate(s);
		// session.delete(s);

		tx.commit();
		// System.out.println(stu);

	}

}
