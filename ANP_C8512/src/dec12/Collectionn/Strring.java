package dec12.Collectionn;

public class Strring {
	
	
	public static void main(String[] args) {
		
		String a  = "Sachin" ; //scpjlkajsdlkj
		String aa  = "Sachin" ; //scp jlkajsdlkj
		String s  = new String ("Sachin") ; // heap
		char[] jj  = {'S','a' , 'c','h','i' , 'n' };
		String p  = new String (jj) ;
		
	    if (a == aa) {  // reference check karta hai  true
	    	
	    	System.out.println(" a == aa ");
	    }
	    
	    
	    if (a.equals(aa)) { // value check karta hai  true 
	    	System.out.println(" a.equals(aa) ");
	    }
	    
	    
	    if (a == s) {// false
	    	System.out.println(" a == s ");
	    }
	    
	    if (a.equals(s)) { // true 
	    	System.out.println(" a.equals(s) ");
	    }
	    if (a.equals(p)) { // true 
	    	System.out.println(" a.equals(p) ");
	    }
		
	    
	 a =    a.concat(" parmar") ;
	    System.out.println(a);
	}
	

}
