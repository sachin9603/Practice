package jul3;

public class Dog  extends Animal{
	
 public String sound() {
		
		System.out.println(" barking ...... ");
		
		return "barking" ;
	}
 
 
 public static void main(String[] args) {
	
	 
	 Animal a  = new Dog() ;
	 
	 
	 a.sound() ;
}

}
