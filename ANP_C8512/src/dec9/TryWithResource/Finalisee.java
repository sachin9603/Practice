package dec9.TryWithResource;

public class Finalisee {
	
	public static void main(String[] args) {
		

	
	Finalisee obj = new Finalisee();        
      // printing the hashcode   
      System.out.println("Hashcode is: " + obj.hashCode());           
      obj = null;    
      // calling the garbage collector using gc()   
      System.gc();     
      System.out.println("End of the garbage collection");     
  }     
 // defining the finalize method   
  protected void finalize()     
  {     
      System.out.println("Called the finalize() method");     
  }   
  


}
