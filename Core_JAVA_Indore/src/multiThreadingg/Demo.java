package multiThreadingg;

public class Demo {
	
	public static void main(String[] args) {
		
		
	     B b  = new B()  ;
	     b.start();
	     
	     /// Time 
	     // conditionally 
	     // unconditionally
	     
//	     try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	     
	     
	     try {
			b.join();// jab tak b ka kaam pura complete nahi ho yaa run() method complete nahi hoti 
			// tab tak ---- after run() method complete this main method will work 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
	     System.out.println(b.summ);
		
		
		
	}

}
