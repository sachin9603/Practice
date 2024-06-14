package june10;

public class Demo {
	
	public static void main(String[] args) {
		
		
		
		
		Animal  a1  = new Animal()  ;
		
		a1.eat();
		
		Dog d1  = new Dog() ;
		
		d1.eye = 2  ;
		d1.legs = 4  ;
		d1.tail_length = 20 ; 
		
		
		
		System.out.println(d1.eye);
		System.out.println(d1.legs);
		
		d1.speak(); 
		
		d1.eat();
		
		Cat c1 = new Cat() ;
		
		
		System.out.println("cat eating ");
		c1.eat();
		c1.speak();
		
		
		
		
		
		
		
			
		
		
		
		
		
	}

}
