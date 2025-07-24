package Stringss;

public class StringDSA {
	
//	*1. Count Vowels and Consonants in a String*
//
//	*Problem:*
//	Write a program to count the number of vowels and consonants in a given string. Ignore spaces and special characters.
//
//	✅ *Concepts:* Loops, character checking
	
	public static void rotation() {
		//ABCD and CDAB are rotations.
		
		//abcd ---- dabc --- cdab --- bcda sachinsachin  -  hinsac    
		//---->abcdabcd
		
		String a  = "abcd" ;
		String b  = "bcda" ; // kya bcda --- abcd ka rotaion hai kya 
		
		String newString  = a+a ;
		if(newString.contains(b)){
			System.out.println("yes it is rotational ");
		}else {
			System.out.println("no it is not rotational ");

		}
		

	}
	
	public static void countVowelAndConsonat() {
String s  = "welcome" ;
		
		int vowelCount  =  0  ;
		
		
		for(int i =0  ; i<s.length()  ;i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {
				vowelCount++ ;
			}
		}
		System.out.println("vowel "+ vowelCount);
		
		System.out.println("consonat " + (s.length()-vowelCount));
	}
	
	public static void main(String[] args) {
		StringDSA.countVowelAndConsonat();
		StringDSA.rotation();
		
	}

}
