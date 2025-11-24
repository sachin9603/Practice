package multiThreadingg;
//now you can create thread by two ways 
	// by implementing Runnable 
	// by extends Thread 

public class A implements Runnable  {

	@Override
	public void run() {
		//This code will run parallel to main method 
		for ( int i=50 ;i<100 ;i++) {
			System.out.println("A thread --->" +i);
		}
		
		
	}
	
}
