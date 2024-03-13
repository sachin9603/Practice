package com.student.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Address address1 = new Address("f.c road", "kolkata", "WB", "700008");
		Address address2 = new Address("n.c road", "solan", "H.P", "78654");

		Employee emp1 = new Employee();
		emp1.setEmpId("E111");
		emp1.setEmpName("dhruv");
		emp1.setSalary(67000);
		
		Employee emp2 = new Employee();
		emp2.setEmpId("E112");
		emp2.setEmpName("guru");
		emp2.setSalary(80000);
		
		emp1.setAddress(address1);
		emp2.setAddress(address2);
		
		session.save(emp1);
		session.save(emp2);
		
		session.save(address1);
		session.save(address2);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
