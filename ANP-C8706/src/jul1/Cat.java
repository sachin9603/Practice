package jul1;

public class Cat {
	
	int legs  = 4 ;
	
	public void sound() {
		System.out.println("Meow meow");
	}
	public static void eat() {
		System.out.println(" eating rat");
	}
	
	
	
public static void main(String[] args) {
		
		Cat c  = new Cat() ;
		c.eat(); 
		c.sound();
	}
	
	static {
		System.out.println("yes I am cat");
	}

}
