package instanceOFF;

public class Dog  extends Animal{
	static void sound() {
        System.out.println("The dog barks");
    }
	
	  static void method(Animal a) {  
		    if(a instanceof Dog){  
		    	Dog d=(Dog)a;//downcasting  
		    	
		       System.out.println("ok downcasting performed");
		    
		       }  
		    }  
	public static void main(String ...s) {
		
	
		Animal a  = new Dog() ; /// dynamic binding or late binding
		
		Dog  ggg   = (Dog)a ;
		
		Dog DDD  =  new Dog() ; /// satic binding  , early binding
		 Animal myAnimal = new Animal();
	        Animal myDog = new Dog();

	        myAnimal.sound(); // Output: The animal makes a sound
	        myDog.sound(); // Output: The animal makes a sound
		
		Dog.method(a);
		Dog.method(DDD);
		
		
	
		
		
		
		
	}

}
