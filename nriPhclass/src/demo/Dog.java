package demo;

public class Dog extends Animal{

	void bark() {
		System.out.println("bow bow");
	}
	
	
	@Override  /// it make sure that method signature is same as parent class 
	void eat(){
		
		System.out.println(" dogs eat bones ");
		
	}
	
}
