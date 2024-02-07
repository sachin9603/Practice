package jan3;

public class ExampleFinalize {

	
	
	public static void main(String[] args) {
		
		
		ExampleFinalize obj = new ExampleFinalize();        
        // printing the hashcode   
        System.out.println("Hashcode is: " + obj.hashCode());           
        obj = null;    
        // calling the garbage collector using gc()   
        
        System.gc(); 
       // finalize();
        System.out.println("End of the garbage collection");   
		
		 
		 
		 
	        //System.out.println("End of the garbage collection");     
		
	}
	
	   protected void finalize()     
	    {     
	        System.out.println("Called the finalize() method");     
	    }     
}
