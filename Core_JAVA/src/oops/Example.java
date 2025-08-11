package oops;

public class Example {
	
	
	
	public static void main(String[] args) {
		
		/// this is my object s1 in java 
	Student s1  = new Student() ;
	
	s1.name = "RamKisan" ;
	s1.address = "Bhopal" ;
	s1.rollNumber  = 1213213 ;
	s1.subject = "civil" ;
	
	s1.studty();
	s1.display();
	int am = s1.payfees(8000); 
	
	System.out.println(am + " has been recived ");
	
	
	Student s2  = new Student (23232  , "Rakesh" , "Math" , "Indore") ;
	
	
	
	
	s2.display();
	
	
	Employee e1  = new Employee() ;
	
	e1.setName("vaibhav");
	e1.setSalary(2322323);
	e1.setDepartment("IT" );
	
	
	System.out.println( e1 );// when you will print an object directly so it will proint hexacode of that obj
	// if you want to print entire object details then you need to implement toString method 
	
	
	
		 Address  add1  = new Address()  ;
		 add1.setCity("Indore");
		 
		 add1.setState("MP");
		 
		 add1.setPincode("3232323");
		 
		 
		 
		 Employee ee1  = new Employee()  ;
		 ee1.setName("Rakesh");
		 ee1.setDepartment("it");
		 ee1.setSalary(150000);
		 ee1.setAddress(add1);
		 
		 System.out.println(ee1);
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
