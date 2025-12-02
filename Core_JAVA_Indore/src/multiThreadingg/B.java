package multiThreadingg;

public class B extends Thread{
	
	int summ =0  ;
	
	@Override
	public void run() {
		//This code will run parallel to main method 
		for ( int i=1 ;i<= 100 ;i++) {
			
			summ = summ + i ;
			
			System.out.println("B thread --->" +i);
		}
		
		
	}

}
