package oopss;

import oopss.Encapuslation.Employee;

public class Demo {

	
	public static void main(String[] args) {
		
		SUV nexon1233 = new SUV() ;
		
		nexon1233.bootspace = 300 ;
		nexon1233.enginCC= 1800 ;
		nexon1233.tryeSize  = 18 ;
		
		nexon1233.offRoading() ;
		
		SUV nexon1239 = new SUV()  ;
		
		nexon1233.bootspace = 300 ;
		nexon1233.enginCC= 1800 ;
		nexon1233.tryeSize  = 18 ;
		
		nexon1233.offRoading() ;
		
		Student s1  = new Student()  ; // parameter cons. k karan  default get overloaded 
		
		s1.name  = "prateek" ;
		s1.address = "Indore" ;
		s1.sub = "CS" ;
		
		
		s1.ProfileDispaly();
		
		s1.payfees();
		
		Student s3 = new Student() ; // default cost
		
		Student s5  = new Student("Rakesh" ,"Indore " , "MATH") ;
		
		s5.ProfileDispaly();
		
		
		Employee jjj  = new Employee()  ; 
		
		String s   = jjj.companyName ;
		
		/// int paisa  = jjj.bonous ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
