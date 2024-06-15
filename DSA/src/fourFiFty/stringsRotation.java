package fourFiFty;

public class stringsRotation {
	  public static boolean areRotations(String s1, String s2 )
	    {
	       
	       String n = s1+s1  ;
	       
	      
	       
	       
	       for( int  i = 0  ;i<n.length() ;i++) {
	                String g =  "" ;
	           
	           for (int j  =i ;j < n.length() ;j++  ) {
	               //geeksforgeeks
	               g = g + n.charAt(j) ; 
	               System.out.println(g);
	               
	               if (g.equals(s2)){
	                   return true ;
	               }
	               
	               
	           }
	           
	       }
	       
	       return false  ;
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
