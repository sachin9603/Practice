package nov6;

public class Car {
	
	String body = "Steel SUV body " ;
	
         Engine e  ; // petrol 
    
         
  
	// problem is that whatever changes we are doing into child class main (car)  class is also affecting
	// this problem will be solve by   interface 
	
   
   
   
   
   public Car(  Engine e) {
	   
		this.e = e;
		
		e.typeOFEngine();
		
		
	}





public static void main(String[] args) {
	   
	   Engine vernaEngine  =   new DesielEngine()  ;
	   
	   Car verna  = new Car(vernaEngine) ;
	   
	   Engine grandVitaraEngine  =  new HybridEngine()  ;
	    
	   Car grandVitara = new Car ( grandVitaraEngine) ;
	   
	   Engine tataNexonEngine  =   new  ElectricEngine()  ;

	   
	   Car tataNexon  = new Car(tataNexonEngine ) ;
	   
	    
	   
	   
	   
	   
	   
	
}
   

}
