package nov19.Dead;

public class B {
	
	public synchronized void funB(A a1) {
		
		System.out.println("funB starts of B ");
		
		a1.fun1()  ;
		
		System.out.println("funB ends of B ");

		
	}
	
	public synchronized void fun2()  {
		System.out.println("inside fun2 of B");
	}

}
