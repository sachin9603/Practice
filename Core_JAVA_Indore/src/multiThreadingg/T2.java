package multiThreadingg;

public class T2 extends Thread {

	
	@Override
	public void run() {
	
		for ( int i = 100 ;i<150  ;i++) {
			System.out.println("T2  Thread (This is T2 thread )-----> "+ Thread.currentThread().getName() + i);
		}
		}
}
