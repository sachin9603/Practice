package jul25;

public class ThreadBB  extends Thread{
	 // variables 
	
	Common c;
	String name;
	
	//constructor
	
	public ThreadBB(Common c,String name) {
		
	this.c=c;
	this.name=name;
	}
	
	
	@Override
	public void run() {
	c.fun1(name);
	}
	
	
	}
	