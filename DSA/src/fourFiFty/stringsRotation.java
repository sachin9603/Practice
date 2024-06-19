package fourFiFty;

public class stringsRotation {
	  public static boolean areRotations(String s1, String s2 )
	    {
	       
	       String n = s1+s1  ;
	       
	      
	       
	     if (n.contains(s2)) {
	    	 return true  ;
	     }else {
	    	  return false  ; 
	     }
	     
	   }
	    
	public static void main(String[] args) {
//		
//		geeksforgeeks
//		forgeeksgeeks
		
		String s1  = "geeksforgeeks" ;
		
		String s2  = "forgeeksgeeks" ;
		
		boolean ans  = areRotations(s1, s2) ;
		System.out.println(ans);
		
		
	}

}
