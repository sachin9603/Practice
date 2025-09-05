package day1;

// class area (method area)  , heap area  , stack area 
public class Arrays {
	
	int marks ;
	String name  ; // 
	
	public void walk() {
		run () ;
		System.out.println("dont run");
		
	}
	public void run () {
		System.out.println("ruunning");
		
	}
	
	public static void main(String[] args) {
		
		// [] suppose i want to store all student's  of my class 
		
	  int[] arr = new int[5]  ;
	  
	  // a empty arr will get create  having 0 on each index , means default will get stored auomatically 
	  //{0,0,0,0,0}
	  arr[0] = 45 ;
	  arr[1] = 12 ;
	  arr[2] = 564 ;
	  arr[3] = 565;
	  arr[4] = 12 ;
	      // 0 1 2 3 4       5
//	  for (int  i=0  ;i<arr.length ;i++) {
//		  
//		  System.out.println(arr[i]);
//		  
//	  }
//	  
//	  for(int  kk : arr) {
//		  System.out.println(kk);
//	  }
	  
	  
	  String []  strArr  = new String[5] ;
	  
	  
	  strArr[0] = "Sachin" ;
	  strArr[1] = "pooja" ;
	  strArr[2] = "deepak" ;
	  strArr[3] = "hariom" ;
	  strArr[4] = "harsh" ;
	  
	  strArr[5] = "deepika" ; // 6no array index out bond exception 
	  
	  int[] jarr  = {12,23243,12,43,132,12,341,212,2} ;
	  
	  
	  
	  for (int  i=0  ;i<arr.length ;i++) {
		  
		  System.out.println(arr[i]);
		  
	  }
	  
	  
	  String s  = "welcome" ; // by literal , scp --- it is seprate are inside heap area
	  String s22  = "welcome"  ;// because it i will refrence from privious string 
	   
	  String s2  = new String ("welcome" ) ; // heap area 
	  
	  
	  
	  Arrays stt  = new Arrays ()  ;
	  stt.walk() ; // stack area k ander -- walk() --- ;
	  
	  
	  
	  
	  
	  
	   
	  
		
		
	}

}
