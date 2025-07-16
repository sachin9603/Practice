package day_8;

public class Demo {
	
	// identifier, operators , statement
    // object , class  , constructor  , 
	// java bean , access modifiers 
	// oops --- encapsulation  , inheritance is-A  , polymorphism overriding overloading , abstraction 
	// has-a 
	
	
	public static void main(String[] args) {
		
		Address add  = new Address() ;
		
		add.setCity("Indore");
		add.setState("MP");
		add.setPincode("89787232");
		
		Student s = new Student()  ;
		
		s.setName("Rakesh");
		s.setMarks(89);
		s.setAddress(add);
		
		System.out.println(s);
		
		
		System.out.println(s.getAddress().getCity());
		
		
	}
	
	
	

}
