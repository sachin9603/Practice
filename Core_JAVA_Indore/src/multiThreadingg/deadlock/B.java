package multiThreadingg.deadlock;
class B {
	
	// ek hi lock hai object lock 
	public synchronized void funB(A a1){
		System.out.println("funB of B starts");
		a1.fun1();/// nahi hooga calll kabhi bhi 
		System.out.println("funB of B ends");
		}
	
	public  void fun2(){
		System.out.println("inside fun2 of B");
		}
	
	
	
}
