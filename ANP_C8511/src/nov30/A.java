package nov30;

public class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	//  - 51 -  100
					for (int i  =51  ;i<=100  ;i++) {
						String name  = Thread.currentThread().getName() ;
						System.out.println("i am Thread-0 method "+ name +"---->"+ i );
				}	
	}
	
	
	public static void main(String[] args) {
		
		
		A a  = new A()  ;
		
		Thread t1  = new Thread(a)    ;
		
		t1.start();
		
		
		
		for (int i  =0   ;i<= 50  ;i++) {
			String name  = Thread.currentThread().getName() ;
			System.out.println("i am main method "+ name +"---->"+ i );
	}	
		
	}

}
