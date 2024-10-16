package oct16.Array;

public class Demo extends Student {
	
	
 public static void main(String[] args) {
	
	 
	 int[] arr  = new int [5] ;
	 // int ki default value ka ek array banega   jiki  size ragehi 5  // 0 0 0 0 0
	 // 0 1 2 3 4 
	           // 0 1 2 3 4     i<5
	 for ( int i  =0  ;i< arr.length ;i++) {
		 
		 System.out.println( "arr[ "+i+"]---->" +arr[i]); // arr[0], arr[1] , arr[2] 
	 }
	 
	 arr[0] = 21 ;
	 arr[1] = 31 ;
	 arr[2] = 41 ;
	 arr[3] = 65 ;
	 arr[4] = 67 ;
	 
    for ( int i  =0  ;i< arr.length ;i++) {
		 
		 System.out.println( "arr[ "+i+"]---->" +arr[i]); // arr[0], arr[1] , arr[2] 
	 }  
    
    
    // define array lire
    int []newArray = new int [] {21 , 43, 67, 87,56 } ;
    
    
    
    for (int kk  : newArray) {
    	System.out.println(kk);
    }
    

    
    Student [] studentArray = new Student[5] ; 
    
    studentArray[0] = new Student(12  , "Arratu" , "Arti123") ;
    studentArray[1] = new Student(13  , "Nikil" , "Nikil123") ;
    studentArray[2] = new Student(15  , "Pranav" , "Arti123") ;
    studentArray[3] = new Student(14  , "Giradhaari" , "Arti123") ;
    studentArray[4] = new Student(17  , "Devekarn" , "Arti123") ;
    
    for(   Student hh :studentArray ) {
    	System.out.println(hh.studentId);
    	System.out.println(hh.studentName);
    	System.out.println(hh.studentPass);
    	
    	System.out.println("----------------------------------------");
    }
    
    System.out.println();
    
    // { 1,3 ,5 ,7 ,10 ,11  } // two number such that their sum is  12 
    //  { 3 ,5 ,1 ,2 ,4  }  
      // {40 ,24 ,120 , 60,4 ,30} 
    //{ 8 ,3 ,5 ,7 ,10 ,11  }  ---- arree odd ka sum karo  
    // saare evern sum karo
    ////{ 8 ,3 ,5 ,7 ,10 ,11  }    kis karidu or kis becchu ki max profit  ho 
    
    
    int sum  =  0  ;
    
    int[] kk  = new int [] { 8 ,3 ,5 ,7 ,10 ,11  }  ;
    
    
   
    
    
    
    for (int l  : kk) {
    	if (l%2 != 0) {
    		sum += l  ;
    		
    	}
    
    }
    System.out.println(sum);
    
    
    // array of array 
    //{ { 8 ,3 ,5 }, { 8 ,3 ,5 },  { 8 ,3 ,5 } } 

    
    
	
}

}
