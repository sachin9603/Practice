package jan3;

public class TestExceptionChild  extends Parent {

	
	// parent mai nahi execption or child class ki method mai laga rahe ho exception 
	// toh sirf runtime exception hi laga sakte 
	 
	 void msg() throws RuntimeException {    
		    System.out.println("TestExceptionChild");    
		  } 
	 
	 
	 void go()throws RuntimeException {  
		    System.out.println("i am from parent class go method ");  
		  }    
		  
}
