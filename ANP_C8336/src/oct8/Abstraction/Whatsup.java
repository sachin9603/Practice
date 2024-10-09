package oct8.Abstraction;

public interface Whatsup {
	
	// all method are  abstract by default 
	
	public void sendMessage();
	
	public void createGroup();
	
	public void appyStatus();
	
	int pinChatLimit  = 3  ;  // final or sataic 
	
	
	
	default void whatsuplogo() {
		
		System.out.println("green logo");
		
	}
	
      static void whatsupthem() {
    	  
    	  System.out.println("green and white");
      }
	
      //
      Cloneable
	
	
	// java 8  
//	Since Java 8, we can have default and static methods in an interface.
//
//	Since Java 9, we can have private methods in an interface.
	
	
	
}
