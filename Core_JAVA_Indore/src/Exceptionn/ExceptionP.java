package Exceptionn;

public class ExceptionP {
	
	// An exception is first thrown from the top of the stack 
	//and if it is not caught, it drops down the call stack to the previous method. 
	//If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack. This is called exception propagation.

	 //propagation --- // A()  , B( A() ) , C(B() )  ---- > main(C())
	
 void a()  {
	int a = 10  ;
    int b  = 0 ;
    
    int c = a/b ;
     
	}
  void b()  {
	  
	  try {
		  a() ;  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	 
	  
  }
  void c() {
	  b() ;
	  
  }
  
  public static void main(String[] args) {
	  ExceptionP obj = new ExceptionP() ;
	  
	  obj.c() ;
	  
	  System.out.println("few Lines....");
	
}
	
}
