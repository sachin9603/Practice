package jul23;

public class TheadB extends Thread{
	
	Common c  ;
	String name  ;
	
	public TheadB(Common c, String name) {

		this.c = c;
		this.name = name;
	}
	
	
	 public void run() {
		 
		 c.fun1(name);
	 }
	

}
