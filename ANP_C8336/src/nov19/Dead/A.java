package nov19.Dead;

public class A {
	
	public synchronized void funA(B b1) {
		
		System.out.println("funA starts of A ");
		
		b1.fun2()  ;
		
		System.out.println("funA ends of A ");

		
	}
	
	public synchronized void fun1()  {
		System.out.println("inside fun1 of A");
	}

}
