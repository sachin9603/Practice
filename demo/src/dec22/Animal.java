package dec22;

public class Animal {

	// over ride mai kuch bhi change kanhi kar skta 
	 void voice() {
		System.out.println("animal makes sound ");
	}
	 
	 
	// method overloading  /// compile time polymorphism 
	 void speed(int s ) {
		 System.out.println("my speed is " + s  );
	 }
	 
	 
	 
	 void speed( float f  ) {
		 
		 System.out.println(" float is calling my speed is " + f );
	 }
	 
	 
	 // method overloading mai same class k ander hum  same method ka 
	 // parameter or return change karne par vo overloading kehlaayega 
	
	 int sum  (int a  , int b) {
		 return a+b ;
	 }
	 
	 
	 
	 int sum  (int a  , int b , int c) {
		 return a+b+c ;
	 }
	 
}
