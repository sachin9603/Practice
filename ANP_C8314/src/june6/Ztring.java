package june6;

public class Ztring {
	
	
	public static void main(String[] args) {
		

	  String pp  = "Hello world" ;
	  
	  String l  = "Sachin" ;
	  /// dslarcohwi nolleh
	  int count = 0 ;
	  
	  
	  String []arr  = pp.split(" ") ;
	  String ans  = "" ;
	  for( int i  =arr.length -1  ;i>= 0 ;i--) { 
		  
		  
		  for(int j  = arr[i].length()-1  ; j>= 0  ;j--) {
			  
			  ans = ans + arr[i].charAt(j);
			  
			  if (count < l.length()) {
			  ans = ans +l.charAt(count) ;
			   
			 count++ ;
			  }
			  
			  
			  
		  }
		  ans = ans +" " ;
		  
	  }
	  
	  System.out.println(ans);
	  
	  
	  
	  
	  
		
		
		
	}

}
