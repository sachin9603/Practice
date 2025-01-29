package dec20.multiThreading.day3_interThreadCommunication;

public class MyThread extends Thread {
	
	int num =0  ;
	
	public void run()  {
		
		synchronized(this) {
			
		
		for ( int  i =0  ;i<= 100  ;i++) {
			
			num  = num + i  ;
			
			
		}
		this.notify();
		}
		
		
		
	}
	

}
