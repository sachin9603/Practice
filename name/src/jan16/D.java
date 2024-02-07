package jan16;

public class D implements Runnable{
  public void run() {
		// TODO Auto-generated method stub
		for(int i = 20 ;i<=40 ; i++) {
			 String threadName  = Thread.currentThread().getName() ;
			 System.out.println("Thread DD thread   "+ i + threadName);
			}	
	}
	
	public static void main(String[] args) {
		
		Thread.currentThread().setName("ZZZZZZZ");
		D d = new D() ;
		C c  = new C() ;
		Thread t1  = new Thread(d) ;
		Thread t2  = new Thread(c) ;
		
		t1.setName("Ramesh ");
		t2.setName("Sita ");
		
		
		t1.start(); 
		
		t2.start();
		
		for(int i =40  ;i<=60 ; i++) {
			 String threadName  = Thread.currentThread().getName() ;
			 System.out.println("Thread DD thread   "+ i + threadName);
				
			}	
		
		
		
		
		
		
	}
}
