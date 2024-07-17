package jul12;

public class Demo {
	
	public static void main(String[] args) {
		Employee e  = new Employee() ;
		
		e.setName("Raju");
		e.setAddress("Karod"); 
		e.setId("2323");
		
		System.out.println(e.getName());
		
		System.out.println(e.getAddress());
		System.out.println(e.getId());
		
		
		Dog a = new Dog() ;
		a.eat();
		a.sound(); 
		a.eat("flesh") ;
		
		
	}

}
