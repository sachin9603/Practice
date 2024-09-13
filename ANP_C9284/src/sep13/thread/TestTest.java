package sep13.thread;

public class TestTest {
	
	
	public static void main(String[] args) {
		
		
		Common c  = new Common ()  ;
		
		Common c2 = new Common ()  ;
		
		ThreadA  t1  = new ThreadA(c  , "Raamji") ;
		ThreadB  t2  = new ThreadB(c2 , "Shyaaam ji") ;
		
		
		t1.start(); 
		
		t2.start();
		
	}

}
