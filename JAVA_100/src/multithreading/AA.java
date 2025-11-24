package multithreading;

public class AA  extends Thread{

int sum = 0 ;
 

 public synchronized void login() {
	 
 }
 
 public synchronized void signup() {
	 
 }

 public synchronized void sigup() {
	 
 }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for ( int i=0 ;i<=100 ; i++) {
			sum = sum + i ;//5050
		}
		

	}

}
