package jul25;

public class ThreadAA  extends Thread{
	 // variables 
	
	Common c;
	String name;
	
	//constructor
	
	public ThreadAA(Common c,String name) {
		
	this.c=c;
	this.name=name;
	}
	
	
	@Override
	public void run() {
	c.fun1(name);
	}
	
	
	}
	