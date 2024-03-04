package com.Anudip.hibernateAd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {


        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Student");


        EntityManager em= emf.createEntityManager();

       
      Student student = new Student(787 , "sascssachin") ;

       // if (student!=null) {
            em.getTransaction().begin();
           
            em.persist(student);

          //  student.setStudentName("Aman");
            

            em.getTransaction().commit();
            System.out.println("done");
//        } else {
//            System.out.println("student not found");
//        }
        em.close();


    }
}
