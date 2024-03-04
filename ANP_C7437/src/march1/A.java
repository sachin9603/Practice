package march1;

public class A  extends Thread{
	
	public void run() {
		
		System.out.println(" i am running in the background ");
		
		for(int i =0  ;i< 10  ; i++) {
			System.out.println(" i am running in the background ");
			Boolean  b = Thread.currentThread().isDaemon();
			
			System.out.println(b);
		}
	}
	

}
