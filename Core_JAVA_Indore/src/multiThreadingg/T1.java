package multiThreadingg;


/// you can extend thread class 
/// you can implements runnable interface 
public class T1 implements Runnable {

	@Override
	public void run() {
	
		for ( int i = 50 ;i<100  ;i++) {
			System.out.println("T1  Thread (This is T1 thread )-----> " + i);
		}
		
		
		
	}

}
