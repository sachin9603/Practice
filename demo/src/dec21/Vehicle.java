package dec21;

public class Vehicle {

	
// parent  ---- car , bike , truck 
	// car ---- sedan , suv , muv  , hatchback\
	
	
	int wheels  ;
	
    String fuel  ;
   
   /// isi method ko mai  dusari classes mai  use lekin  alg purpose k liye 
    
    //or yadi koi method parent mai hai child class use kar rhi hai apne hisaab se 
    // is concept ko overridden (runtime polymorphism )
    
    public void start() {
	  System.out.println("we are ready to go"); 
    }
   // over ride krte vakt method ka signature same rahega  kuch nahi sakte hai 
   // return type  , parameter   , name 
   
    
    
   
   
   
	
	
	
	
}
