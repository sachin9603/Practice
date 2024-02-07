package jan18;

import java.util.Scanner;

public class Arrayyy {
	
	public static void main(String[] args) {
		//12,34,6,5,64
		//int a1  = 12  ;
//		 [0,0,0,0,0]
	int[] arr = new int[5] ;
	 /// 0 1 2 3 4
	for(int i =0 ;i<arr.length ;i++) {
		arr[i] =  i+5 ;
	}
	//arr[6] = 23 ;
	
	for(int i =0 ;i<arr.length ;i++) {
		System.out.println(arr[i] );
	}
	
	String [] stringdata = new String[5] ;
	
	stringdata[0] = "sachin" ;
	stringdata[1] = "aman" ;
	stringdata[2] = "rahul" ;
	stringdata[3] = "kaali" ;
	stringdata[4] = "lankesh" ;
	
	for(int i =0 ;i<stringdata.length ;i++) {
		
		
		System.out.println(stringdata[i] );
		
		
		
	}
	
      int [] arrays= {34,45,65,7,67,8} ;
       
      for(int tt :arrays) {
    	  System.out.println(tt);
      }
      
      // ap
      System.out.println("aako jo array banannhai utni size number mai dedo ");
      
      Scanner sc = new Scanner(System.in) ;
      
      int size  = sc.nextInt() ;
      
      int []newarr = new int[size] ;
      
      System.out.println("ab ek ek karke utane element array mai filll karna hai ");
       
      for(int i = 0 ;i<size ;i++) {
    	  newarr[i] = sc.nextInt() ; // newarr[0] , newarr[1] ,  newarr[2]
      } 
      
      for(int tt :newarr) {
    	  System.out.println(tt);
      }
      
      
      
      
      
      
		
		
		
	}

}
