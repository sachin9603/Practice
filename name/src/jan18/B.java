package jan18;

public class B  extends Thread{
	
	Common c  ;
	String name  ;
	
	public B(Common c, String name) {
		
		this.c = c;
		this.name = name;
	}
	
	public void run(){
		c.fun1(name);
	}

}
