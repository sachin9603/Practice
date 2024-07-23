package jul19;

public class Demo {
	
	public static void main(String[] args) {
		
		
		String thisThreadname = Thread.currentThread().getName();
		
		System.out.println(thisThreadname);
		
		
		ThreadA  ss = new ThreadA() ;
		
		
		Thread x    = new Thread(ss) ;
		
		
		
		Thread y  = new Thread(ss) ;

		
		
		x.setName("Raaju");
		x.setPriority(10);
		
		y.setPriority(7);

		
		System.out.println(x.getPriority());
		System.out.println(y.getPriority());
		
		
		
		y.setName("Bunty");
		
		x.start();
		
		y.start() ;
		
		
		
		
		
	}

}
