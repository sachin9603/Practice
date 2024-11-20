package nov_18;

public class Demo  extends Thread{
	
	public void run() {
		
		for(int i  =0 ;i< 10  ;i++) {
			System.out.println("thread is running" + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		
		Demo t1  = new Demo ()  ;
		Demo t2  = new Demo ()  ;
		Demo t3  = new Demo ()  ;
		
		t1.setPriority(9);
		t1.setName("Strong");
		t2.setPriority(1);
		t2.setName("weak");
		t3.setPriority(MAX_PRIORITY);
		t3.setName("very strong");
		
		
		
		t1.start(); 
		t2.start(); 
		t3.start(); 
		
		System.out.println(Thread.currentThread().getPriority()+"----------->" );
		
		
		
		
		
	}

}
