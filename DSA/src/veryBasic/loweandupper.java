package veryBasic;

public class loweandupper {

	public static void main(String[] args) {
		
		String s = "sAcHin ParmaR" ;
//		
	char[]arr = s.toCharArray();
//		
//	for( int i  =0  ;i<arr.length ;i++) {
//		if(Character.isUpperCase(arr[i])) {
//			arr[i]= Character.toLowerCase(	arr[i]);  
//		}else {
//			arr[i] = Character.toUpperCase(	arr[i]);
//		}
//	}
//	
//	 String string = new String(arr);
//	 
//     System.out.println(string);
//     
//     
//     better solution 
//	
		
	 // A = 65  , a  = 97 
	// abhi small c mai se c - 32  = C
	
	for( int i  =0  ;i<arr.length ;i++) {
		if(arr[i] == ' ') {
			continue ;
			
		}
		int a = arr[i] ;
		
		if (a<97) {
			a = a + 32  ;
			
			char p = (char)a ;
			arr[i] = p  ;
			
			
		}else{
             a = a - 32   ;
			
			char p = (char)a ;
			arr[i] = p  ;
		}
		
		
	}
	String string = new String(arr);
	System.out.println(string);
	
		
	}
}
