package sep13.thread;

public class TestTest {
	
	
	public static void main(String[] args) {
		
		
		Common c1  = new Common ()  ;
		
		Common c2  = new Common ()  ;
		
		
		ThreadA  t1  = new ThreadA(c1  , "Raamji ") ;
		ThreadB  t2  = new ThreadB(c2 , "Shyaaam ji ") ;
		
		
		t1.start(); 
		
		
		
		
		
		t2.start();
		
	}

}
