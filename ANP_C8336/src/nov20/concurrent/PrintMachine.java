package nov20.concurrent;

public class PrintMachine  implements Runnable{
	
	String name  ;

	
	PrintMachine (String s ){
		
		this.name = s  ;
		
		
	}
	@Override
	public void run() {
		
System.out.println(name +" this  work is started  by " + Thread.currentThread().getName());
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(name + "this  work is end  by " + Thread.currentThread().getName());

	}
	
	
	

}
