package dec20.multiThreading.Synchronisedd;

public class ThreadB extends Thread {
	
	Common A  ;
	String name  ;
	
	
	public ThreadB(Common a, String name) {
	
		A = a;
		this.name = name;
		
	}
	
	public void run() {
		A.fun1(name);
	}
	
	
	
	

}
