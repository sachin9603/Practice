package multiThreadingg;

public class B extends Thread{
	
	@Override
	public void run() {
		//This code will run parallel to main method 
		for ( int i=100 ;i<151 ;i++) {
			System.out.println("B thread --->" +i);
		}
		
		
	}

}
