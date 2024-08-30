package Anudip.BasicCrud.M21and12MBidirection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestM21Bidirectional {
	
	public static void main(String[] args) {
		
		
		 EntityManagerFactory  emf  = Persistence.createEntityManagerFactory("studentAddressUnit") ;
			
		 EntityManager em  = emf.createEntityManager();
			
			
			em.getTransaction().begin() ;
			
//			
//			Department d    = new Department() ;
//			d.setDepName("IT");
//		
//			EmployeeNayaVala emp1  = new EmployeeNayaVala()  ;
//			emp1.setEmpName("Radha");
//			emp1.setEmail("radha@Gmail.com ");
//			emp1.setDepartment(d);  
//			
//			EmployeeNayaVala emp2  = new EmployeeNayaVala() ;
//			emp2.setEmpName("Piyush");
//			emp2.setEmail("Piyush@Gmail.com ");
//			emp2.setDepartment(d);  
//			
//			Set<EmployeeNayaVala>  empSet = new HashSet<> () ;
//			empSet.add(emp2) ;
//			empSet.add(emp1) ; 
//			
//             d.setEmployees(empSet);
//             
//             em.persist(d);
			
			
			
			
			
			
			Department d  = em.find(Department.class, 13) ;
			
			
		System.out.println(d.getDepId() ); 
		System.out.println(d.getDepName());
		
		Set<EmployeeNayaVala>  ee  = d.getEmployees() ;
		
		for(EmployeeNayaVala  hh:ee) {
			System.out.println(hh.getEmail());
			System.out.println(hh.getEmpName());
		}
		
		
		//System.out.println(d.getEmployees);
		
		
			
             em.getTransaction().commit(); 
             em.close() ;
             
			
			
			
			
			
			
			
				
			
			
		
	}

}
