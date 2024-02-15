package feb14;

public class A implements Runnable {
// mai ye chahta hu ek barr mai ek hi thread common resource ko access kar paaye 
	
	
	// Synchronization
	int sum  = 0  ;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for ( int i =0 ;i<=100  ;i++) {
			sum += i ;
			
		}
		// 5055
		
		//10000 line 
	}
	
	
	

}
