package Exceptionn;

public class Demoo {
	
	public static void main(String[] args) {
		
		// Runtime exceptions ----- Arithmetic 
		// Arithmetic ----- /0
		// Nullpointer exception  ---- when string is null and you wants its length() 
		//  Number formate exception ---- jab ek String pass karo Integer.parseint mai and vo String mai sirf number naa ho 
		// index out of bond ----- Array , or String 
		
		try {
		
		String s  = null ;
		System.out.println(s.length());
		}catch(NullPointerException e) {
			
			System.out.println(e.getMessage());
		
		}
		
		System.out.println("last line ");
		
		String h  = "12323ttt" ; // numberformate exception
		//System.out.println(h+10);
		
		try {
			System.out.println(Integer.parseInt(h)+10);
		}catch(NumberFormatException ee) {
			ee.printStackTrace();
			System.out.println(ee.getMessage());
		
		}
		
		System.out.println("last line ");
		
		// index out of bond --- arrayindex out of bond
		//--------------------------Stringindexoutof bond
		
		
//		int[] arr = {1,12,3,322} ;
//		System.out.println(arr[10]);
		
		String j = "sachin";
		
		try {
			System.out.println(j.charAt(10));

		}catch(StringIndexOutOfBoundsException  ee ) {
			
			System.out.println(ee);
		}
		
		
		System.out.println("last line ");

		
		
		
		
		
	}

}
