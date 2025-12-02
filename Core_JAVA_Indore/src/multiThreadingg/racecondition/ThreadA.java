package multiThreadingg.racecondition;
class ThreadA extends Thread{
	//Address add ;
	Common c;
	String name;
	
	//Constructor 
	public ThreadA(Common c,String name) {
		
	this.c=c;
	this.name=name;
	
	}
	
	@Override
	public void run() {
	c.fun1(name);
	}
}
