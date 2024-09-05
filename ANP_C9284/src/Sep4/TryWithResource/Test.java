package Sep4.TryWithResource;

public final class Test {
	
	public final String adhar ;
	
	//public final 
     

 public  Test(String pp ) {
	this.adhar = pp;
	   
   }
 public final void  add() {
	 
 }
 
 public final void  add(int a) {
	 System.out.println(a);
 }
 public static void main(String[] args) {
	 Test	 t  = new Test("tt77uiiy") ;
	System.out.println( t.adhar);
	String use  =  t.adhar+ "pam" ; 
	
	//t.adhar = "nldfnsld" ;
	
	
	
	
	 t.add(9);
	 
} 
}
