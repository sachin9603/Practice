package sep5.Arraay;

public class Arrayyyy {
	
	
	public static void main(String[] args) {
		
		// yaha  banaliya hai array 
		int [] arr = new int[5] ;// 0 1 2 3 4 
		
		
		
		arr[0] =  90  ;
		arr[1] = 98  ;
		arr[2]  = 9000 ;
		arr[3] = 8000  ;
		arr[4] = 8999   ;
		
		//arr[5] = 777  ;//arrayindeoutofbond  session
		
		
		
		
		
		// enhance for loop 
		for(int KuchBhi : arr) {
			System.out.println(KuchBhi);
			
		}
		
		for(int i  =0  ; i<arr.length ; i++) {
			System.out.println(arr[i]);
			//System.out.println("for loop " + i);
		}
	
		
		
		// array  
		// in this array you can store multiple numberes 
		// linear data save kkar skte ho 
		// when you are creating array a initial array would be there of size what you have defined
		// of element 0 0 0 0 0
		
		arr[2] = 89  ;
		
		
	 String  sarr []  =  new String[3] ;
	 
		
	 sarr[0] = "sachin" ;
	 sarr[1] = "pooja " ;
	 sarr[2] = "hariom" ;
	 
	 
	 String [] newArr = {"lalaan top" , "winstin" , "cameraavaale bhiyaa "} ;
	 
	 for (String  g  : newArr) {
		 
		 
		 System.out.println(g) ;
		 
	 }
		
	 /// new give its size initially  
	 //it not dynamic 
	  // it can only at once sigle kind of value 
	 
		
	 
	   
	}

}
