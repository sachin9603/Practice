package nov_14;

public class FinalizeExample {

	
	
	
	public static void main(String[] args) {
		
		FinalizeExample kk  = new FinalizeExample()  ;
		
		System.out.println(kk.hashCode());
		kk = null  ;
		
		System.gc(); 
		
		
		System.out.println("end of gc ");
		
		
	}
	
	
	
	protected void finalize() {
		
		System.out.println(" i am fialize method ");
		
	}
}
