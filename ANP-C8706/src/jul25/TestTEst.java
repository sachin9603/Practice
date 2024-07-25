package jul25;

public class TestTEst {
	
	
	public static void main(String[] args) {
		
		Common c  = new Common() ;
		
		Common c2  = new Common() ;
		
		ThreadAA a = new ThreadAA(c  , "Ram") ;
		
		ThreadBB b = new ThreadBB(c2  , "Shyam") ;
		
		a.start(); 
		b.start();
	}

}
