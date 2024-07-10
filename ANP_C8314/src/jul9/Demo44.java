package jul9;

public class Demo44 {
	
	public static void main(String[] args) {
		
		           //012345
		String s =  "ramlal" ; 
		
		// create all possible susbtring of s  ;
	

		  for (int i  =0  ;i<s.length() ;i++) {
			  String t = "" ;
			  for(int j  =i ; j<s.length() ;j++) {
				 t= t + s.charAt(j);
				  System.out.println(t);
				 }
		  }
		
		
//	 r 
//	 ra
//	 ram
//	 raml
//	 ramla
//	 ramlal 
//	 a
//	 am
//	 aml
//	 amla
//	 amlal
//	 m
//	 ml
//	 mla
//	 mlal
//	 l
//	 la
//	 lal
//	 a
//	 al
//	 l
//		
		
		String sss  = "ramlal" ;
		
		System.out.println(s.equalsIgnoreCase(sss));
		
		
			System.out.println(s.length());
		System.out.println(s.charAt(4));
		
		
		String ss  = s.substring(2) ;
		System.out.println(ss);
		
		s.contains(ss);
		  
		char arr []  = s.toCharArray() ;
		
		
		for(char pp  : arr) {
			System.out.println(pp);
		}
		
		
		s.replace('l', 'p');
		
		System.out.println(s);
	}

}
