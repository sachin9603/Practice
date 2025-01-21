package dec20.multiThreading.day2;

public class T1 extends Thread{
	
	public void run() {
		
		System.out.println("yes I am taking interview ");
		

		
		try {
			Thread.sleep(3000) ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("my Selection process is done ");
	}
	

}
