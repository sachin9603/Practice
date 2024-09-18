package sep13.thread;

public class Common {
	
	// jab bhi static synchronized block k ander koi thread enter karta hai toh us thread k pass is class ka lock 
	
	public  void fun1(String name ) {
		
		//1000
		
		
		synchronized(Common.class) {
			
			System.out.print("welcome "); 
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.print(name);
			
		}
		
		
		
		// 1000 lines of code 
		
		
		
	}    
	
	// 100 static synchronized method hai 

}
