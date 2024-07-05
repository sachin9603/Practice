package jul2;

public class Demo33 {
	
	public static void main(String[] args) {
		
		
		
  Employee d  = new Employee("Shubham" , "324532" ,345321, new Address("indore" , "mp" , "345234")) ;
		
		
  System.out.println(d);
  
  
  Employee e2  = new Employee() ;
  
  
  Address add = new Address() ;
  
  add.setCity("Bhopal"); 
  add.setPincode("232323"); 
  add.setState("MP");
  
  
  e2.setId("23232") ;
  e2.setName("Rakul"); 
  e2.setSalary(54334243);
  e2.setAddress(add);
  
 String city  =  e2.getAddress().getCity();
 
 System.out.println(city);
 
 
 System.out.println(e2);
  
		
	}

}
