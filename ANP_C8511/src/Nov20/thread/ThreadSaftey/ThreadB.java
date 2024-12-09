package Nov20.thread.ThreadSaftey;

class ThreadB extends Thread{
	Common c;
	String name;
	
	public ThreadB(Common c,String name) {
	this.c=c;
	this.name=name;
	}
	@Override
	public void run() {
		
	c.fun1(name);
	
	}
}
