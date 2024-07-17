package jul12;

public class Student {
	
	
	// it is template for createing object
	
	// variable
	// method 
	// block 
	// contructor 
	
	// varible or state 
	String name  ;
	
	int rollNumber ; // camel case, naming convention 
	
	
	
	// method , behavior
	// access modifier
	
	public void  study(int s ) {
		
		
		 
		System.out.println("all students are doing study");
		
	
	}
	
	
	
	public Student(String n  , int r) {
		name  =  n  ;
		rollNumber = r  ;
		
	} /// parameter or all args constructor 
	
	
	public  Student() {} ; // default 
	
	
	
	
	
	public int calculate(int a , int b) {
		
		int c = a+b ;
		
		return c ;
		
		
	}
	
	
	
	

}
