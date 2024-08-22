package aug20;

public class Test {
	

	public static void main(String[] args) {
		
		
		Employee emp1  = new Employee() ; // default 
		
		emp1.empId = 12  ;
		emp1.empName = "Raju" ;
		
         emp1.salary  = 70000 ;
         
         System.out.println(emp1.empName);
         emp1.shift();
         
         
         Employee e2  = new Employee( 45   , "Rakesh" , 80000 ) ; // parameterize constructor
         
         System.out.println(e2.empName);
         e2.display();
         
         
         
	
		
	}
	
	
	

}
