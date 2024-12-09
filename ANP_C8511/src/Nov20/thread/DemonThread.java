package Nov20.thread;

public class DemonThread  extends Thread{
	
	
	public void run() {
		System.out.println("I am toh demon thread ");
	}
	
	
	public static void main(String[] args) {
		
		DemonThread s  = new DemonThread ()  ;
		s.setDaemon(true);
		
		s.start();
		System.out.println("asachin ");
	}

}
