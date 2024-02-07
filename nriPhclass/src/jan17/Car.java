package jan17;

public abstract class Car {
	
	
 /// a method which do no have body and a abstrct keyword is there infront of method 
	
 public abstract void applyBreak();
 
 
 public abstract void increaseSpeed() ;
 
 
 // concrete method mtlb --- method with body 
 
 public void carColour() {
	 System.out.println("all car will black ");
 }
 
 
 // static method bhi ho skti hai 
 
 
 static void  carWheels() {
	System.out.println("all cars will use mrf tyre ");
}
 
 
 public Car() {
	 
	// this(100) ;
	 
	 System.out.println(" mai hu car se parent vaali");
	 
 }
 
 private Car(int s) {
	 System.out.println(" my speeed is " +s);
 }
 
	

}
