package jan29;

public class ExceptionHandling {
	
	
	public static void main(String[] args) {
		// jab bhi object banega ye save hote hai heap area 
		//or obj  hamesha class se banta hai
		
     ///  primitive data type  ------
		
		 /// wrapper class  of all primitive class
		
		int sachinAge  =  24 ; //primitive data type 
		
		Integer sachinAgee =  24  ; // wrapper class  
		
     
	// by literal 
		
		String s  = "Sachin" ; /// heap area k ander ek area hai string constant pool vaha jaake save hoga
		
// literal vala string


String a  = "Sachin" ;

/// kyuki jab bhi aap naya string banate ho literal k through tab jvm  string 
//contant pool area mai check karega 
//ki vvo string kya pehle se bana hai kya  agar bana hai toh naya  String nahi banega 
// kal se yadi aap s ko change karte ho toh kabhi change hoga hi nahi kon "Sachin"
// kisaki bjaya  ek naya string baenga or dusara hi string create hoga 
// or isiliye strings are immutable in java 
		
		
	s = s+" parmar " ;
	
	
	
	
		
		 
		
		
		
		
		// by new keyword 
		
		
		String ss  = new String("Hello") ; //Heap area mai save ho jaaeyga 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
