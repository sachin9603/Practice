package nov_18;

public class AA  extends Thread{
	
	String s ;
	Common c ;
	
	public AA(String s, Common c) {
	
		this.s = s;
		this.c = c;
		
	}
	
	public void run() {
		c.fun1(s);
	}
	
	

}
