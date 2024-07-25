package jul23;

public class RaceConditionDemo {
	
	
	public static void main(String args[])
	{
		
	Counter counter = new Counter();
	
	Thread t1 = new Thread(counter, "Thread-1");
	Thread t2 = new Thread(counter, "Thread-2");
//	Thread t3 = new Thread(counter, "Thread-3");
	
	t1.start();
	t2.start();
//	t3.start();
	
	
	}

}
