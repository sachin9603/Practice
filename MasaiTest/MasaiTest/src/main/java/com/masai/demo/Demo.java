package com.masai.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {


        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Student");


        EntityManager em= emf.createEntityManager();

        Student student = em.find(Student.class, 2);

        if (student!=null) {
            em.getTransaction().begin();

            student.setStudentName("Aman");

            em.getTransaction().commit();
            System.out.println("done");
        } else {
            System.out.println("student not found");
        }
        em.close();


    }
}
