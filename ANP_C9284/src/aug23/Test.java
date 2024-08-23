package aug23;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Car c  = new Car() ;
		//c.tankCapacity = 43  ;
		c.carColor  = "gunMetal" ;
		c.carEngine  = "4.5" ; 
		System.out.println(c.carCompany);
		
		System.out.println(c.carEngine );
		
		Address add1  = new Address () ;
		
		 add1.setCity("Indore") ;
	     add1.setPincode("8888899"); 
	     add1.setState("MP"); 
	     
		
		     Employee ee  = new Employee() ;
		     
	            ee.setEmpId(2) ;
	            ee.setEmpName("Rahul"); 
	            ee.setSalary(2323);
	            ee.setAddress(add1); 
	           
// heap area
			     Employee Chandu  = new Employee() ;
			     System.out.println(Chandu.company);


			     

  
  Employee Devkaran  = new Employee() ;
  
 
			     
	            
	           ee.getAddress().setCity("Betul");
	           
	           
	           System.out.println(ee.getAddress().getCity());
	            
	            //ee.setAddress().setCity("Bhopal)};
	          //  ee.setAddresh().setCity("Bhopal");


	            
	           // ee.setAddress().setCity("Bhopal")
	            //
	            
	            ////System.out.println(); i have to get city of Rahul  how 
	            
	
		
				
	}

}
