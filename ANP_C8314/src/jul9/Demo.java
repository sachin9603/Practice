package jul9;

public class Demo {
	
	
	public static void main(String[] args) {
		
		String  s  = "kiran " ;//literal 
		
		System.out.println(s);
		
		
		 // by using new keyword
		
		// Strings are immutable in java \\
		
		// heap area --- saare object  bante hai is memory mau 
		// isik ander ek special area hai 
		// string constant pool  --- jo bhi string literal k throough banti vo jaakar save ho jaati ho jaati hai 
		///kiran , kiran sighaniya 
		
		
		s = s+ "sighnaiya " ;
		
		System.out.println(s);
		
		
		String a  = "Rakesh" ;
		
	String b  = "Rakesh" ; // yaha par koi naya b k liye raakesha nahi banayega 
		// pehale vaale rakesh kaa hi refrence dedega 
		
		
		// ab life kabhi rakesh change nahi ho sakta why 
		
	//	a  = a+ " Sharma" ;
	
 	a.concat(" Chouhan") ;
	
	//a = a + "sharma"  ;
	
		
		// because it may be haapen that referance of previous rakesh may be assign to some other variable 
		
			System.out.println();	
				
		
		
				 char [] arr =  {'a','u','s' ,'h'} ;
		
		String uuu  = new String(arr) ;
		
		System.out.println(uuu);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
