
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
//        
        

	}

}
