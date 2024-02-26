package com.Anudip.in.FirstMaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentSt");
		EntityManager em= emf.createEntityManager();
		StudentSt student= em.find(StudentSt.class, 20);
		if(student != null)
		System.out.println(student);
		else
		System.out.println("Student does not exist");
		em.close();
		
		}

	}

