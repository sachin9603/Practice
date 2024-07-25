package jul23;

public class TestTest { 
	
	
	public static void main(String[] args) {
		
		// 
		Common c  = new Common() ; // object level lock 
		Common c2 = new Common() ; 
		
		TheadA t1  = new TheadA(c  , "Ram") ;
		
		TheadB t2  = new TheadB(c2 , "Shyam") ; 
		
		t1.start(); 
		
		t2.start();
		
		
		
		
	}

}
