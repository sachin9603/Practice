package sep17.thread;

public class MyThread extends Thread {
	
	int num  = 0 ;
	
	public void run() {
	// 1000 lines 
		
		synchronized(this) {
			for ( int i  =0 ;i<= 100  ;i++) {
				
				num = num + i ;
			}
			this.notify(); 
		}
	//this thred will notify 
		
	}
	
	

}
