package Genral.Basic;

public class Basic10Question {
	
	//Problem: Reverse a string without using built-in functions.
	//	Concepts: Strings, Character Arrays.
	//	Example: Input: "hello" → Output: "olleh"
	
	
	//basic  50 to 100 (very easy) ---- java (jvm, String, Satic ) 
	//dec 1 ---  4 lpa 
	// dec 2 week  --- 100 plus job  ,,15 profiles full stack 
	
	
	public static String reverseString(String s ) {
		//suman
		//01234 
		//s = s.trim() ;
		
		StringBuilder ans  = new StringBuilder(s);
		ans = ans.reverse();
		String revString = ans.toString() ;
		
//		2nd way 
//		int len  = s.length()  ;
//		String reverse = "" ;
//		
//	        // 5-1       0  
//		for(int i = len-1 ; i>=0  ;i--) {
		// "" , n , na ,nam ,namu , namuS 
//			reverse =reverse+s.charAt(i);
//		}
		
//		3rd 
//char[] arr  = s.toCharArray() ;
		
		return revString;
	}
	
	public static int missingNumber(int[] arr) {
		// [1, 2, 4, 6, 5 , 3, 9 ,8, 10]
		// 1 se n 898  tak
		
		int len  = arr.length +1; // 10
		
		int total = (len*(len+1))/2 ;
		
		int actualSum  = 0 ;
		for(int l:arr) {
			actualSum +=l ;
			
		}
		return total-actualSum ; 
				
	}
	
	
	public static boolean palindrom(String s) {
		// String madam  -- 
//		StringBuilder ans  = new StringBuilder(s);
//		ans = ans.reverse();
//		String revString = ans.toString() ;
//		if (revString.equals(s)) {
//			return true ;
//		}
		// 0 1 2 3 4
		// naman
		
		for (int i =0 ; i < (s.length()-1)/2  ;i++ ) {
			if (s.charAt(i)!=s.charAt(s.length()-1 -i)) {
				return false  ;
			}
			
		}
		return true  ;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("Suman"));
		//Example: Input: [1, 2, 4, 6, 5] → Output: 3
		
		System.out.println(missingNumber(new int[] {1,3,4,5}));
		
		System.out.println(palindrom("namana"));
		
		
		//Example: Input: n=5 → Output: [0, 1, 1, 2, 3] --- Fibonacci 

		
		
	}

}
