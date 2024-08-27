package aug27;

public class Counter {
	// java collection  , multithreading  , excpeion   ---- sql  --- jdbc  -- hibernate  --- spring  --- boot 
	 
	
 static int count  =  0  ;
  
  // contrutor  // jab obj banat hai tab yahi call hota hai 
  
 public Counter() {
	   count++  ;
	  System.out.println(count);
 }
	
  public static void main(String[] args) {
	  Counter c1 =new Counter() ;  //1
	  Counter c2 =new Counter() ; // 1
	  Counter c3 =new Counter() ;  // 1
	  
	//  static se 1 2 3
}

}
