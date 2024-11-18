package nov_14;

public class ThreadAA  implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for ( int i =1 ; i<=50  ;i++) {
			
			String name  = Thread.currentThread().getName() ;
			
			System.out.println("I am  + " + name+"  Thread " + i);
		}
	
	}
	
	
	public static void main(String[] args) {
		ThreadAA a = new ThreadAA()  ;
		
		Thread t1  = new Thread(a) ;
		
		t1.setName("BahuBali");
		
		
		
		t1.start(); 
		
		
		for ( int i =50 ; i<=100  ;i++) {
			String name  = Thread.currentThread().getName() ;
			
			System.out.println("I am " +name+ "  Thread " + i);
		}
	
		
		
	}

}
