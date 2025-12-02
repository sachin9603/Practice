package multiThreadingg.deadlock;

public class A {
	// A aa  = new A()  l
	// aa.funA() 
	
	
	// object level lock use ho raha hai 
	// isko call kar rhaha hai ek thread 
	public synchronized void funA(B b1){
		
		System.out.println("funA of A starts");
		b1.fun2();
		System.out.println("funA of A ends");
		
		}
	
	
	///
		public synchronized void fun1(){
		System.out.println("inside fun1 of A");
		}

}
