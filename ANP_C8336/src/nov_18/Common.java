package nov_18;

public class Common {
	
	public void fun1 (String s ) {
		 // 10000 line 
		
		//object level synchronization------  suppose there is x obj  fun1 ko call kiya 
		// use x obj par dusare thread nai fun1 call kiyaa  toh nahi hoga \\\
		// but if we change the object then easily  dusara thread fun1 ko call kar legaa 
		synchronized(Common.class) {
			// class level sync block use kehate hai ki 
			// yadi kisi bhi object par fun1 ko call kare toh yahi koi ek koii ek object ka fun1 bhi chal raha hai toh fir
			// koi dusara object ka fun1 chalega nahi 
			System.out.print("Welcome ");
			
			try {
				Thread .sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(s);
		}
		
		// 1000 lines 
		
	}

	
	
	
	
	
}
