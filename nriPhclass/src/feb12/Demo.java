package feb12;

public class Demo {

	
	
	public static void main(String[] args) {
		
		ThreadA a   = new ThreadA() ;
		a.start();
		
		
		for ( int i =20  ;i<40  ;i++ ) {
			System.out.println("inside MAIN  " +  i);
		}
		
	}
}
