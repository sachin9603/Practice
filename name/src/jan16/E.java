package jan16;

public class E  implements Runnable 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 20 ;i<=40 ; i++) {
			 String threadName  = Thread.currentThread().getName() ;
			 System.out.println("Thread DD thread   "+ i + threadName);
			}	
		
	}

	
	
	public static void main(String[] args) {
		E ee  = new E() ;
		Thread t1  = new Thread(ee) ;
		
		Thread t2  = new Thread(ee) ;
		
		t1.setName("Dhoni ");
		t2.setName("Kohli ");
		
		t1.setPriority(10);
		t2.setPriority(2);
		
		
		t1.start();
		t2.start();
		
		System.out.println(t2.getPriority());
		
		
		
		
	}
}
