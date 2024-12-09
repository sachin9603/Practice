package nov20.concurrent;

public class BB  extends Thread{
	
	public void run()  {
		System.out.println("Spelling checker ");
	}
	
	public static void main(String[] args) {
		BB b  = new BB ()  ;
		b.setDaemon(true);

		b.start();
		System.out.println("hello World ");
	}

}
