package dec20.multiThreading;

public class A {

	// main thead 
	public static void main(String[] args) {
		
		// there should one more thread that should run parallely and it will print 50 to 100 
		
		
		ThreadB t2 = new ThreadB()  ;
		
	//	t2.run()  ; /// it will behave as normal thread  if you are calling run method normal
		
		t2.start(); /// it will act as anaother thread 50 to 100
		
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		ThreadVV obj  = new ThreadVV()  ;
		Thread tt  = new Thread(obj)  ;
		
		tt.start(); 
		
		
		
		
		
		
		for (int  i =0 ;i<=49 ;i++) {
			System.out.println(" main Thread--- number " + i);
		}
	}
}
