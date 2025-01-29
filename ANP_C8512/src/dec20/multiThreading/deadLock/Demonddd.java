package dec20.multiThreading.deadLock;

public class Demonddd  extends Thread{

	
	public void run()  {
		System.out.println("I am bg thread");
	}
	
	
	public static void main(String[] args) {
		
		
		Demonddd d = new Demonddd()  ;
		
		d.setDaemon(true);
		
		System.out.println("sachin");
				d.start();
				
				
	
				
				
				
	}
}
