package jan16.join;

public class Main {
	
	public static void main(String[] args) {
		
		
		System.out.println("inside main");
		
		
		A a = new A() ;
		
		Thread t1 = new Thread(a);
		
		t1.start(); 
//		try {
//			Thread.currentThread().sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
		try {
			
			t1.join();// ki aap pehle us thread ko t1 vaale ko complete ho jaane do then main 
			//thread aapna kaam karega 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a.sum);
		
		
		
		
	
	}

}
