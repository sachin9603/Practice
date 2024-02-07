package dec21;

// parent class ko super class bolte hai 
public class Car extends Vehicle
{ 
	// you can use implements keyword with class which is extending a interface 
	
	// one class will extends other class 

	
	
	boolean AC ;
	
	public void speed() {
		System.out.println("I am running at sppeed 250");
	}
	
	
	// ye child   start method ko apne hisaab se use karna chahti hai 
	// annotation 
	@Override
	 public void start() {
		
for( int i = 0  ;i<10  ; i++) {
	System.out.println(" i am getting ready ");
}
	 System.out.println("trun  on your ac and add lock the door");
	
	}
	
	
	
// default constructor is provided by jvm 
	// till i am not creating any parameterise constructor 
	   
   
	

}
