package sep13.thread;

public class A  implements Runnable {

	int sum  = 0  ;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int  i=0  ;i<= 100  ;i++) {
			sum += i  ;
			
		}
		
		
	}

}
