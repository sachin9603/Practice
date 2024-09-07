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
//			
//			Department d    = new Department() ;
//			d.setDepName("Mechanical");
//		
//			EmployeeNayaVala emp1  = new EmployeeNayaVala()  ;
//			emp1.setEmpName("paakhi");
//			emp1.setEmail("paakhi@Gmail.com ");
//			emp1.setDepartment(d);  
//			
//			EmployeeNayaVala emp2  = new EmployeeNayaVala() ;
//			emp2.setEmpName("satish");
//			emp2.setEmail("satish@Gmail.com ");
//			emp2.setDepartment(d);  
//			
//			Set<EmployeeNayaVala>  empSet = new HashSet<> () ;
//			empSet.add(emp2) ;
//			empSet.add(emp1) ; 
//			
//             d.setEmployeeNayaValas(empSet);
//             
//             em.persist(d);
//			
			
			
			
			
			
//			Department d  = em.find(Department.class, 13) ;
//			
//			
//		System.out.println(d.getDepId() ); 
//		System.out.println(d.getDepName());
//		
//		Set<EmployeeNayaVala>  ee  = d.getEmployeeNayaValas() ;
//		
//		for(EmployeeNayaVala  hh:ee) {
//			
//			System.out.println(hh.getEmail());
//			System.out.println(hh.getEmpName());
//			System.out.println(hh.getEmpId());
//			
//			
//		}
//		
//		
		//System.out.println(d.getEmployees);
			
//			EmployeeNayaVala obj  = em.find(EmployeeNayaVala.class, 14) ;
//			
//					
//			System.out.println(obj.getEmpName());
//			System.out.println(obj.getDepartment().getDepName());
//		
//		
			Department diu   = new Department() ;
			diu.setDepName("kushbhi");
			
			EmployeeNayaVala obj = new EmployeeNayaVala() ;
			obj.setEmail("323232");
			//obj.setEmpName("sukkvindder ");
			obj.setDepartment(diu);
			
			em.persist(obj);
			
             em.getTransaction().commit(); 
             em.close() ;
             
			
			
			
			
			
			
			
				
			
			
		
	}

}
