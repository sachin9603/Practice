package jul23;

public class Common {
	
	public static synchronized void fun1(String name) { // because they need class level lock 
		
		// 1000 lines
		
		System.out.print("welcome "); 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print(name);  // 5 
		
		
		
		
		
		// 1000 lines 
		
		
		
	}
	
	
	void fun22(){
		System.out.println("do something...");
		//1 thousand lines of codes are there
		synchronized(Common.class){//here if a thread gets the lock of current obj then it is allowed to execute
		//this block
		System.out.println("do some more thing1");
		}
		//1 thousand lines of codes r there
		}
	
	
	
	

	
	
	
	
	
	

}
