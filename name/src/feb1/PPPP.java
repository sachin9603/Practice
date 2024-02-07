package feb1;

public class PPPP {

	
	public static void main(String[] args) {
		
		
		String q  = "Welcome" ;
		String r = "Welcome" ;
		
		String uu  = new String("Welcome" ) ;
		
		if(q == uu) {// ==  ye obj compare 
			System.out.println("yes ==  true value for q and uu ");
		}else {
			System.out.println("nono");
		}
		
		if( r == uu) {
			System.out.println("yes ==  true value for q and uu ");
		}else {
			System.out.println("nono");
		}
		
		
		if( r == q) {
			System.out.println("yes ==  true value for q and r ");
		}else {
			System.out.println("nono");
		}
		
		if(q.equals(uu)) { // this will compare value 
			
			System.out.println("q.equals(uu)");
		}else {
			System.out.println("q.equals(uu) not not ");
		}
		
		String s  = "Aa" ;
		String ss  = "BB" ;
		
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		
		// what is contract between hascode and equals  
		// if two objects are equal using equals then their has code must be same but 
		// viseversa is not true 
		
		
		
		
		
	}
}
