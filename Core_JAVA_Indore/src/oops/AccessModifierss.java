package oops;

public class AccessModifierss {
	// this are keywords which defines access of class  , method , variable 
// // private 
	String username  = "Sachin90909" ;
	private String password ; // its access will be in this class only  
	
	// 
	 String carColor  = "Yellow" ; // only in package 
	 // when there is no accessmodifiers , that means it is default access modifiers 
	
	public int familyMember =  6  ;
	// public variable can be access from any where in project
	
	protected String propertyDetails   = "10 cr " ;
	// public protected default private 
	
	//public >>> protected (same package or otherpacakage(Child class))>>> default(package) >> private 
	
	protected void run() {
		
	}
	
}
