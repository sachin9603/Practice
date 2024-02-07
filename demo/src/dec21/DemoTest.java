package dec21;

public class DemoTest {

	public static void main(String[] args) {
		
		Employee e1  = new Employee() ;
		//new Address("Indore" , "mp" , "123456")
		
		Address  ad1  = new Address () ;
		
		
		ad1.setCity("indore");
		ad1.setPincode("123456");
		ad1.setState("MP");
		
				
        e1.setEmpid(1234); 
		e1.setEmpName("Karan");
		e1.setDepartment("IT");
		e1.setAddress(ad1);
		
		
		Employee e2  = new Employee(77777 ,"rahul" ,"QA" ,ad1 );
		
		System.out.println(e2.getEmpName());
		System.out.println(e2.getDepartment());
		System.out.println(e2.getEmpid());
		System.out.println(e2.getAddress().getCity());
		
		
		
		
		// i have created all args constructor  into address
		
		
		
	}
}
