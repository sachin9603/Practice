package jul23;

public class TheadA extends Thread{
	
	Common c  ;
	String name  ;
	
	public TheadA(Common c, String name) {

		this.c = c;
		this.name = name;
	}
	
	
	 public void run() {
		 
		 c.fun1(name);
	 }
	

}
