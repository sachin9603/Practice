package oct24.CustomExcetpion;

public class Finalizeee {
	
	
	
	public static void main(String[] args) {
		Finalizeee k  =new Finalizeee()  ;
		System.out.println(k);
		
		k= null  ;
		
		System.gc() ;
		
		System.out.println("end of gc ");
		
		
		
		
		
		
	}
	
	protected void finalize() {
	System.out.println("i am Finalize ");	
	}

}
