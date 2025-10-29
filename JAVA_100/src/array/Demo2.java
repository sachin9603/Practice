package array;

public class Demo2 {
	
	
	public static void main(String[] args) {
		
	   int age  = 18 ;
	                             //0 1 2 3 4 5
	   int [] ages = new int[5]; //0 0 0 0 0 ArrayIndexoutofbond
	   
	   // when you are creating new array at that time a array with default value will get create 
	   //
	   // iteration ---- {12,2,121,54,6} for , while , do while for each loop 
	   
	   // 
	 
	   
	   
	   int len = ages.length ; // 5
	   ages[0]= 21 ;
	   ages[2]= 22 ;
	   ages[1]= 26 ;
	   ages[3]= 25 ;
	   ages[4]= 29;
	   
	   
	   
	   for( int i =0; i<len; i++) {
		 // 0 1 2 3 4  
		 System.out.println(ages[i]); 
	   }
	   
	   int j =0 ;
	   while(j<len) {
		   
		   System.out.println(ages[j]);
		  
		   j = j+1 ;
		   
	   }
	   System.out.println("=============================");
	   
	   int jj = 0;
	   do{
		   System.out.println(ages[jj]);
		  
		   jj = jj+1 ;
		   
	   }while(jj<len) ;
	   
	   
	  for(int kk : ages ) {
		   System.out.println(kk);
	   }
	   
	  
	  
	  Student s1 = new Student()  ;
	  s1.student_name = "Ravi" ;
	  s1.student_rollnumber = 789879 ;
	  
	  Student s2 = new Student()  ;
	  s2.student_name = "Kelash" ;
	  s2.student_rollnumber = 7879 ;
	  
	  
	  Student [] sarray  = new Student[2];
	  
	  sarray[0] = s1;
	  sarray[1] = s2 ;
	  
	  
	  for(Student st : sarray) {
		  System.out.println(st);
	  }
	  
	  // 8 4 6 2 5 9
	  
	   int[] pp  = { 8, 4 ,6 ,2, 5, 9} ;
	   
	   // 4 5 6 8 9 5
	  
		
		
	}

}
