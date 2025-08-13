package oopssss;

public class Demo {
	
	// when two classes are into parent child relation it is clled is a relation 
	
	
	
	public static void main(String[] args) {
		
		Address add  = new Address()  ;
		
		add.setCity("Indore ");
		add.setPincode("1212112");
		add.setState("MP");
		
		System.out.println(add);
		
		
		
		Employee e1  = new Employee()  ; // default constructor
		e1.setEmpAddress(add);
		e1.setEmpDepartment("IT");
		e1.setEmpName("Vishal");
		
		
		
		
		System.out.println(e1);
		
		// now you have to change indore to Bhopal without changeing objec 
		
		
		e1.getEmpAddress().setCity("Bhopal");
		
		System.out.println(e1);
		
		Dog k  = new Dog()  ; // default cons
		k.eating(); // it is coming from animal 
		k.bark()  ;
		k.eye  = 2  ;
		k.leg = 4  ;
		
		System.out.println("dog has "+k.eye+ " and " + k.leg + " legs ");
		
		BabyDog munna  = new BabyDog()  ;
		munna.weep();
		munna.eating();
		
		
		
		
		
		
		
		
		
		
	}

}
