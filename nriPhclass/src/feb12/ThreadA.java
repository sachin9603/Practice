package feb12;

public class ThreadA  extends Thread {
///extends Thread  --- toh iski 
	
	@Override
	public void run() {
		
		for ( int i =0  ;i<20  ;i++ ) {
			System.out.println("inside Thread A " +  i);
		}
	}
	
//	
//	public void run() {
//		
//	}
}
