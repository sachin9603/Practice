package nov_18;

public class BB  extends Thread{
	
	String s  ;
	Common c ;
	
	public BB(String s, Common c) {
		super();
		this.s = s;
		this.c = c;
	}
	
	public void run() {
		c.fun1(s);
	}
	
	

}
