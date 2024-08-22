package aug20;

 class Employee {
	// method area  or class area  
	// heap area 
	// stack meomory 99 ----- 1 
	
	
	// state 
	int  empId  ;
	
	String empName  ;
	
	double salary ;
	
	
	// method  or behaviour 
	 public void shift() {
		  
		 System.out.println("doing shift 9 to 6 ");
	 }
	 
	 public void sendingMail() {
	 
		 System.out.println("sending mail to hr");
	 }
	 
	 
	 // constructor 
	 
	// what
	  // a special method  jiska naam  same as  class name hai 
	 
	 public Employee() {};
	 // it is said there is not explict return in const but implicitly it is returning  obj of that class 
	 
	  public Employee( int num, String naam, double dd ) {
		  empId  = num  ;
		  empName   =  naam  ;
		  salary   = dd ;
		 }
	  
	  // 
	 
	 //  cons are used to create object 
	 // suppose there is construtor created by user
	 // so a default const provied by jvm 
	 
	 
	 
	 
	 public void display() {
		 
		 System.out.println("Employee name  " + empName  ) ;
		 System.out.println("Employee Id  " + empId  ) ;

		 System.out.println("Employee Salary  " + salary  ) ;

		 
	 }
	 
	
	
	
	

}
