package nov_14;

public class Demo {
	
	public static void main(String[] args) {
	
		// this is called main thread
		
		// there are two to achive multithreading 
		
		// by extending Thread class
		// by implemeting Runnable interface 
		
		
		A a  = new A() ;
		B b  = new B()  ;
		C c  = new C()  ;
		
		a.start();// 2
		b.start();//3
		c.start()  ; //4
		
		
		
		for (int i  =91  ; i<= 120 ;i++) {
			System.out.println(" i am Main thread "+ i);
		}
	}
}
class A extends Thread {
	
	public void run()  {
		
		for (int i  =1  ; i<= 30 ;i++) {
			System.out.println(" i am A thread "+ i);
		}
	}
}

class B extends Thread {
	
	public void run()  {
		
		for (int i  =31  ; i<= 60 ;i++) {
			System.out.println(" i am B thread "+ i);
		}
	}
}

class C extends Thread {
	
	public void run()  {
		
		for (int i  =61  ; i<= 90 ;i++) {
			System.out.println(" i am C thread "+ i);
		}
	}
}
