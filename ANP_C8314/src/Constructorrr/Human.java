package Constructorrr;

public class Human {
	
	int eye ;
	
	int legs  ;
	
	String humanName ;
	
	
	public void greed() {
		System.out.println("I want more and more ");
	}
	
	public void reproduction(){
		System.out.println("creating same Human");
	}
	
	
	// constructor 
	
   public Human() {
	  /// this method is returning obect this human  
	   // new Human() ;
   }
   
   
   public Human(int ey  , int lg  , String name) {
	   eye = ey   ;
	   legs = lg  ;
	   humanName = name  ;
	   
   }
}
