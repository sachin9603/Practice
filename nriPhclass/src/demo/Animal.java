package demo;

public class Animal {
	
	int legs  ;
     String  type ;
     
     
     public Animal ( int leg  , String t ) {
    	 
    	 legs = leg  ;
    	 
    	 type = t  ;
    	 
     } ;
     
     public Animal () {} ;
     
     
     
     /// agar parameter vala construtor banaya tho defalut bhi baanao  yadi need hai toh 
     
     

	void eat() {
		System.out.println("all animal eat something");
	}
	
	/// in the same class but you are changing number of argument 
	
	void eat(String meat) {
	
		System.out.println("animal is eating " +meat);
		
	}
	
	void eat(int kg  , String meat ) {
		
		System.out.println("animal is eating " +meat + "the quantity is " + kg);
		
	}
	
	
	
	
}
