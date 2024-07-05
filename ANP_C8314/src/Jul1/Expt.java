package Jul1;

import java.util.Scanner;

public class Expt {
	
	
	
	public static void main(String[] args) {
		
	   Scanner sc  = new Scanner(System.in) ;
	   System.out.println("enter value of a");
	   int a  = sc.nextInt() ;
	   
	   System.out.println("enter value of b");

	   int b  = sc.nextInt() ;
	   
	   try {
		   int c  = a/b ;  
		   System.out.println("Output of a/b = " + c);
	   }catch(ArithmeticException e) {
		   System.out.println(e);
	   }
	   
	  
	  
	   
	
	   
	   System.out.println("sachin");
	   
	   
	   
	   
	   int [] arr  = new int[5]; // 0 0 0 0 0  
	   arr[0] = 2 ;
	   arr[1] = 3 ;
	   arr[2] = 21 ;
	   arr[3] = 33 ;
	   arr[4] = 26;
	   try {
		   System.out.println(arr[7]);
	   }catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		  
	   }
	
	   
	   System.out.println("normal flow");
	  
	   
	   
	   String s  = "23qqq23" ;
	   
	   try {
		   int iii = Integer.parseInt(s); 
		   System.out.println(iii);
	   }catch(NumberFormatException e) {
		   
		 System.out.println(e);;
		   
		   
	   }
	   
	   String sss  = null  ;
	   
	   System.out.println(sss.length());
	   
	   
	   System.out.println("normal flow ");
	  
	   
	
	   
	   
		
		
	}

}
