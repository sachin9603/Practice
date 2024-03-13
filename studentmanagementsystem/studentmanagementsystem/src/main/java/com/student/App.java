package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.student.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //get sessionFactory
    	SessionFactory factory=HibernateUtil.getSessionFactory();
    	//create a session(connection)
    	Session session=factory.openSession();
    	
    	//Begin a Transaction
    	Transaction tx=session.beginTransaction();
    	
    	//transient state
//    	Student student1=new Student("S102", "steve", "johnson", "M", "steve@gmail.com");
//    	Student student2=new Student("S103", "peter", "parker", "M", "peter@gmail.com");
    	
    	
    	//save the Student Object(insert query will execute)
    	
//    	session.save(student1);//persistent state
//    	session.save(student2);
    	
    	//commit the transaction
    	//tx.commit();
    	
//    	//fetch the object
//    	Student student=session.load(Student.class, "S101");
//    	System.out.println(student.getFirstName());
    	
    	//close session
    	session.close();
    	
    	//close Session factory
    	
    	factory.close();
    }
}
