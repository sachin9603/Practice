package multiThreadingg;

public class Demo {
	
	public static void main(String[] args) {
		
		A a = new A() ;
		Thread t1 = new Thread(a)  ;
		//a.run(); /// but if you are calling run method directly it will act as normal method
		t1.start(); // this starts method will create new Thread and run run() method 
		
		
	     B b  = new B()  ;
	     b.start();
		
		for ( int i=0 ;i<50 ;i++) {
			System.out.println("main thread " +i);
		}
		
	}

}
