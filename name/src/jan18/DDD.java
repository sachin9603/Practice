package jan18;

public class DDD extends Thread {
	
	public void run() {
		System.out.println("i am running just");
		
		System.out.println( Thread.currentThread().isDaemon());
		 
		
	}

}
