package feb29;

public class ThreadA extends Thread {

	Common c  ;
	
	String name  ;

	public ThreadA(Common c, String name) {
		
		this.c = c;
		this.name = name;
	}
	
	// when i am creating all args construtor  
	//default construtor will vanish automatically but if you still need so 
	// create it explicitly plz
	
    @Override
	public void run() {
		c.fun1(name);
	}
	
}
