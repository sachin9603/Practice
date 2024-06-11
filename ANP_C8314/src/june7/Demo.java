package june7;

public class Demo {

	
	public static void main(String[] args) {
		
		
		Address add1  =  new Address();
		
		add1.setCity("indore");
		add1.setPincode("32233");
		add1.setState("Mp");
		
		Employee e1  = new Employee() ;// construstor return karta hai instance of object 
		
		e1.setEmpId(12)  ;
		e1.setEmpName("vishal")  ;
		e1.setAddress(add1)  ;
		
		System.out.println("i am coming from line 21 "+e1.getAddress().getCity());
		
	 
		
		
		
		
		
		System.out.println("i am coming from line 28 " +e1.getAddress());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getAddress().getCity());
		System.out.println(e1);
		
//		Employee e2  = new Employee(2323 , "Raju" , "indore") ;
//		
//		System.out.println(e2);
//		
//		
		
		
		Employee e2   = new Employee(123, "Chaitan" , new Address("Bhopal" , "MP" , "32323231")) ;
		
		System.out.println(e2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
