package jan18;

public class Common {
	
//	synchronized (){
//		
//	}
//'
	
	// synchronized ka matlb hai ki obj ka lock use karlena 
	//isliye isme 1000 synchronized method bhi hoaagi toh vo koi bhi run nahi karegi 
	
	// karan hai ki jis class mai ye method likhi hai inke object ka lock 
	
	//   
	public static synchronized void fun1(String name ) {
		
		System.out.print("welcome "); 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
		}
	
	
	
public void fun21(String name ) {
		
		System.out.print("welcome "); 
		
		
		synchronized(Common.class) {
			System.out.println(" only one thread can do this ");
		}
		
		
		
		System.out.println(name);
		
		
		
		
		
		
	}
	//static  synchronized -- class level lock  ---- 
	
	//satic 
	///synchronized --- object level lock 
	

}
