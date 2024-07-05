package Jul2;

public class FinalizeExample {
	
	public static void main(String[] args) {
		FinalizeExample obj = new FinalizeExample();        
	        // printing the hashcode   
		
		System.out.println(obj);
	        System.out.println("Hashcode is: " + obj.hashCode()); 
	        
	        obj = null ;    
	        // calling the garbage collector using gc()   
	        System.gc(); 
	        
	        System.out.println("End of the garbage collection"); 
	        
	}
	
	protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }
	
	

}
