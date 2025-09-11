package oopss.Encapuslation;

public class Demoo22 {
			public static void main(String[] args) {
				
				
				
				Employee s  = new Employee() ;
				 //s.salary ; kyuki private hai 
				String policy  = s.company_policy ; // kyuki protect this 
				 
				Sttudentt  sw  = new Sttudentt()  ; // defult 
			     sw.setName( "RadhaKishan");
			     sw.setEmail("RW@gmail.com");
			     sw.setSub("CS");
			     
			     
			     
			     System.out.println(sw);
			     
			    String name  = sw.getName() ;
			    
			    System.out.println(name );
			    
			    
			    Sttudentt  ssw  = new Sttudentt("Raka" , "R@gmail.com" , "CS")  ;
			    
			    System.out.println(ssw);
			}
			
			
}
