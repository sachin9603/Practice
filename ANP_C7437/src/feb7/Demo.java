package feb7;

public class Demo {
	
	public static void main(String[] args) {
		
		
		
		Student232 ss = new Student232(909 , "raju" , 8980 )  ;
		
		Student232 s2= new Student232(909 , "raju" , 8980 )  ;
		
		System.out.println(ss.equals(s2));
		
		System.out.println(ss.hashCode());
		
		System.out.println(s2.hashCode());
		
		// there is contrct between hascode and equals 
		
		
			String  pp = "Aa" ;
			String pl  = "BB" ;
			
			System.out.println(pp.hashCode());
			
			System.out.println(pl.equals(pp));
			System.out.println(pl.hashCode());
			
			
			
					
	}

}
