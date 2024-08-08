package Aug8;

public class Example {
	
	public void normalMethod(int i) {
		System.out.println(" running  " +i + "km");
	}
	
	
	
	public static void main(String[] args) {
		Example j  = new Example ();
		
		Summ kk  = j::normalMethod ;
		
		kk.calculation(5);
		
	}

}
