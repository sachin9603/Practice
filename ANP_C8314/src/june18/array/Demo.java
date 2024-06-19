package june18.array;

public class Demo {
	
	public static int[] reverseKaro(int[] array) {
		
		int []newArray = new int[array.length] ; //5 4
		
		int count  = 0  ;
		   // 6 5 4 3 2 1 0 
		 //   6 se  0 
		for(int i  = array.length -1 ;i>=0  ;i--) {
			newArray[count] = array[i] ;
			count++ ;
		}
		return newArray ;
	}
	
	
	public static void main(String[] args) {
		//46 33 44 45  30
		//0  1   2 3    4
		
	 int [] arr = new int [5]; //[0, 0 ,0 ,0,0]
	 
	 System.out.println(arr.length);
	 
	 arr[0] = 46 ;
	 arr[4] = 13 ;
	 arr[1] = 15  ;
	 arr[2] = 44 ;
	 arr[3] =  45 ;
	                  //0  1  2 3   4  5 6 ........
	 int[] newArray = {46,33,44,45,30};
	 
	 
	 
	 for(int i =0 ;i<arr.length ;i++) {
		// System.out.println(arr[i]);
		 
		 if (arr[i] <17) {
			 System.out.println("you are passed by grace ");
			 arr[i] =  arr[i] + 5 ; //
		 }
		 
		 System.out.println(arr[i]); //46
	 }
	 
	 // foreach loop
	// for( : newArray)
	 
	 
	 int []ttt  = {34,23,3,53,21,6,2} ;
	 
	//int [] ra = reverseKaro(ttt);
	
	System.out.println("====================================================================");
	 
	int [] emptyArray = new int [ttt.length]; //{0 , 1 2 3 4 5 6}
 int count  = 0  ;
	 for(int i =ttt.length-1 ;i>= 0 ;i--) {
		// System.out.println(arr[i]);
		 emptyArray[count] = ttt[i] ;
		 count++ ;
		
		 
		 //System.out.println(ttt[i]); //46  2 
	 }
	 
	// int revese[] = 
	 
	 // you have to just reverse this arr  and return a reverse array 
	 
	 for(int i =0 ;i<emptyArray.length ;i++) {
			// System.out.println(arr[i]);
			 
			
			 
			 System.out.println(emptyArray[i]); //46
		 }
		 
	 
	 
	 
		
	}

}
