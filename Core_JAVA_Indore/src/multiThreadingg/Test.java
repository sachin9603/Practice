package multiThreadingg;

public class Test {

	
	public static void main(String[] args) {
		
		
		T1 a  = new T1()  ;
		
		Thread t= new Thread(a)  ;
		
		T2 b = new T2() ;
		
		b.setName("Raman");
		b.start(); // 2 nd thread 
		t.start(); // 3 nd  thread 
		for ( int i =0 ;i<50  ;i++) {
			
			Thread.currentThread().getName();
			System.out.println("Main method (This is main thread )-----> "+Thread.currentThread().getName() +  i);
		}
		
		
	}
}
