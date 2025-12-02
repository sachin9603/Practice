package questions;

public class StringQuestion {
	
	
	
	// basic ----- operator, data type , loop  
	
	/// sachin ----->>s sa sac sach sachi sachin 
	//                  a ac ach achi achin
	                     //c ch chi chin
	//    h hi hin i in n 
	
	
	public static void substrring_print(String s )  {
		
		// you have to write logic here 
		//012345
		//sachin             6
		for( int i =0 ;i<s.length() ; i++) {
			String sub = "";
			for ( int j =i ;j<s.length() ;j++) {
				
				sub = sub+s.charAt(j) ;
				System.out.println(sub);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		substrring_print("sachin");
	}

}
