package com.Anudip.MasterEmpAPP;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	
	public static void main(String[] args) {
		
     EntityManagerFactory emf  = Persistence.createEntityManagerFactory("EmpUnit") ;
        
     EntityManager em  = emf.createEntityManager() ;
     
     Department d = new Department(7007  , "Civil") ;
     
     
     
     Employee e  = new Employee(221  , "raj") ;
    
     List<Car>  caskilist = new ArrayList<>() ;
  Car  a  = new Car(133  , "Verna") ;
  a.setEmpoyeeID(221);
     
     Car  aa  = new Car(23  , "scorpio") ;
     
     aa.setEmpoyeeID(221);
     
     caskilist.add(a);
     caskilist.add(aa);
     
     e.setCarList(caskilist);
     
    
     e.setDepartment(d);
  
     
     em.getTransaction().begin(); 
     
     em.persist(e);
    
    
     em.getTransaction().commit(); 
     em.close();
     
     
     
        
	}
}
