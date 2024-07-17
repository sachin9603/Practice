
package jul10;

import java.util.Arrays;

public class StringSplit {
	
	public static void main(String[] args) {
        String s = "Sharma is a good player and he is so punctual";
        // sinlge word ko reverse karo  	 	 	
        // punctual ----- sharma 
        
        String arr []  = s.split(" ");
        
        for (int j  = arr.length-1; j>= 0  ;j--) {
    		System.out.print(arr[j]+" ");
    	}
        System.out.println();
        
        for ( int i = 0 ;i<arr.length ;i++) {
        	String reverse  = "" ;
        	String word = arr[i];
        	for (int j  = word.length()-1 ; j>= 0  ;j--) {
        		reverse = reverse+ arr[i].charAt(j);
        	}
        	System.out.print(reverse+" ");
        }
        
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
        
        
        
        String jj  = "sdfsdieuu" ; // yes it is true 
        
        boolean a  = false  ;
        boolean e  = false  ;
        boolean ii  = false  ;
        boolean o  = false  ;
        boolean u  = false  ;
        
        for (int  i  =0  ;i<jj.length()  ;i++) {
        	
        	if(jj.charAt(i) == 'a') {
        		a = true  ;
        	}
        	
        	if(jj.charAt(i) == 'e') {
        		e = true  ;
        	}
        	
        	if(jj.charAt(i) == 'i') {
        		ii = true  ;
        	}
        	if(jj.charAt(i) == 'o') {
        		o = true  ;
        	}
        	if(jj.charAt(i) == 'u') {
        		u = true  ;
        	}
        }
         if (a&&e && ii &&o &&u) {
        	System.out.println("yes it is true");
        }else {
        	System.out.println("not there ");
        }
        
        
         
         // naman  ---- naman  racecar  
         
         String kk ="racefcar" ;
         
         
         int i  =0  ;
         int  j  = kk.length()-1 ;
         boolean flg = true ;
         
         while(i<j) {
        	 if(kk.charAt(i) ==kk.charAt(j)) {
        		 i++ ;
        		 j-- ;
        	 }else {
        		 System.out.println("not palindrom");
        		 flg = false ;
        		 break ;
        	 }
         }
         
         if(flg) {
        	 System.out.println("palindrom");
         }
         
//        
        

	}

}
