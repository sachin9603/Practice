package com.Anudip.hibernateAd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {


        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Student");


        EntityManager em= emf.createEntityManager();

        EntityManager em2 = emf.createEntityManager();
      Student student = null ;

       // if (student!=null) {
        em.getTransaction().begin();
           
      //   chaching first level  
//        student = em.find(Student.class, 88) ;
//        System.out.println(student);
//         student = em2.find(Student.class, 88) ;
//        System.out.println(student);

          //  student.setStudentName("Aman");
        
        
       // hql 
      //  Query query = em.createQuery("Select s from Student s where s.id Between 7 and 787");
        Query query = em.createQuery("from Student");

        List<Student> list = query.getResultList();
        for(Student e:list) {
        System.out.println("Employee NAME :"+e);
        }

            

            em.getTransaction().commit();
            System.out.println("done");
//        } else {
//            System.out.println("student not found");
//        }
        em.close();


    }
}
