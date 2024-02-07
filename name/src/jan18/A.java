package jan18;

public class A  extends Thread{
	
	Common c  ;
	
	String name  ;

	public A (Common c, String name) {
	
		this.c = c;
		this.name = name;
	}
	
	
	public void run() {
	c.fun1(name);
}

	
	
	

}
