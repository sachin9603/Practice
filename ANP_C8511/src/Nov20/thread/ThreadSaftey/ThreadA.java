package Nov20.thread.ThreadSaftey;

class ThreadA extends Thread{
	
	Common c;
	String name;
	
	public ThreadA(Common c,String name) {
	this.c=c;
	this.name=name;
	}
	@Override
	public void run() {
	c.fun1(name);
	}
}

