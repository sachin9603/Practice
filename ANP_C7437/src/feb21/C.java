package feb21;

public class C {
	
	
	
	public static void main(String[] args) {
		
	 B b = new B() ;
	 
	 Thread t1 = new Thread(b);
	 t1.start();
	 
//	try {
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	 
	 try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 System.out.println(b.sum);
	 
	 
	 
	 
	}

}
