package dec20.multiThreading.Synchronisedd;

public class ThreadA extends Thread {
	
	Common A  ;
	String name  ;
	
	
	public ThreadA(Common a, String name) {
	
		A = a;
		this.name = name;
		
	}
	
	public void run(){
		A.fun1(name);
	}
	
	
	
	

}
