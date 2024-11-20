package nov19;

public class MyThread extends Thread {
	
	
	int num  =0  ;
	

	public void run  ()  {
		// 1000 line 
		
		// thread safty , this should get complete 
		synchronized(this) {// isko chahiye MyThread k object ka lock 
		
			for (int i =0  ;i<= 100  ;i++) {
				num  +=  i  ;
				
			}
			// this thread will notify 
			System.out.println("this child thread is giving notification ");
			this.notify();
			
		}
		
		
	}// why i should not use join 
	
	
	

}
